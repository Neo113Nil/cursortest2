package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes5.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f61673a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* renamed from: h, reason: collision with root package name */
    private final int f61674h;
    private byte[] ios;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f61675k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f61674h = macSize;
        this.f61673a = new byte[macSize];
        this.f61675k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f61673a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f61673a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f61673a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f61673a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i10 = (this.generatedBytes / this.f61674h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i10 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i10 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i10 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i10;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f61675k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12 = this.generatedBytes;
        int i13 = i12 + i11;
        if (i13 < 0 || i13 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (i12 % this.f61674h == 0) {
            generateNext();
        }
        int i14 = this.generatedBytes;
        int i15 = this.f61674h;
        int i16 = i14 % i15;
        int min = Math.min(i15 - (i14 % i15), i11);
        System.arraycopy(this.f61675k, i16, bArr, i10, min);
        this.generatedBytes += min;
        int i17 = i11 - min;
        while (true) {
            i10 += min;
            if (i17 <= 0) {
                return i11;
            }
            generateNext();
            min = Math.min(this.f61674h, i17);
            System.arraycopy(this.f61675k, 0, bArr, i10, min);
            this.generatedBytes += min;
            i17 -= min;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r10 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r10 / 8];
        int i10 = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            BigInteger multiply = TWO.pow(r10).multiply(BigInteger.valueOf(this.f61674h));
            if (multiply.compareTo(INTEGER_MAX) != 1) {
                i10 = multiply.intValue();
            }
        }
        this.maxSizeExcl = i10;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}

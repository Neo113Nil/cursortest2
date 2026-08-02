package Wi;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.spongycastle.crypto.InterfaceC5948a;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.params.AbstractC5975b;
import org.spongycastle.crypto.r;

/* loaded from: classes5.dex */
public class c implements InterfaceC5948a {

    /* renamed from: a, reason: collision with root package name */
    public SecureRandom f13324a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5948a f13325b;
    private byte[] blockBuffer;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13326c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13327d;

    /* renamed from: f, reason: collision with root package name */
    public int f13329f = -1;
    private byte[] fallback = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13328e = g();

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty("org.spongycastle.pkcs1.strict");
        }
    }

    public class b implements PrivilegedAction {
        public b() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty("org.spongycastle.pkcs1.not_strict");
        }
    }

    public c(InterfaceC5948a interfaceC5948a) {
        this.f13325b = interfaceC5948a;
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = bArr[0] ^ 2;
        int i12 = i10 + 1;
        int length = bArr.length - i12;
        for (int i13 = 1; i13 < length; i13++) {
            byte b10 = bArr[i13];
            int i14 = b10 | (b10 >> 1);
            int i15 = i14 | (i14 >> 2);
            i11 |= ((i15 | (i15 >> 4)) & 1) - 1;
        }
        int i16 = bArr[bArr.length - i12] | i11;
        int i17 = i16 | (i16 >> 1);
        int i18 = i17 | (i17 >> 2);
        return ~(((i18 | (i18 >> 4)) & 1) - 1);
    }

    private byte[] c(byte[] bArr, int i10, int i11) {
        if (this.f13329f != -1) {
            return d(bArr, i10, i11);
        }
        byte[] processBlock = this.f13325b.processBlock(bArr, i10, i11);
        boolean z10 = this.f13328e & (processBlock.length != this.f13325b.getOutputBlockSize());
        if (processBlock.length < getOutputBlockSize()) {
            processBlock = this.blockBuffer;
        }
        byte b10 = processBlock[0];
        boolean z11 = !this.f13327d ? b10 == 1 : b10 == 2;
        int f10 = f(b10, processBlock) + 1;
        if (z11 || (f10 < 10)) {
            Aj.a.m(processBlock, (byte) 0);
            throw new r("block incorrect");
        }
        if (z10) {
            Aj.a.m(processBlock, (byte) 0);
            throw new r("block incorrect size");
        }
        int length = processBlock.length - f10;
        byte[] bArr2 = new byte[length];
        System.arraycopy(processBlock, f10, bArr2, 0, length);
        return bArr2;
    }

    private byte[] e(byte[] bArr, int i10, int i11) {
        if (i11 > getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        int inputBlockSize = this.f13325b.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.f13327d) {
            bArr2[0] = 1;
            for (int i12 = 1; i12 != (inputBlockSize - i11) - 1; i12++) {
                bArr2[i12] = -1;
            }
        } else {
            this.f13324a.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i13 = 1; i13 != (inputBlockSize - i11) - 1; i13++) {
                while (bArr2[i13] == 0) {
                    bArr2[i13] = (byte) this.f13324a.nextInt();
                }
            }
        }
        int i14 = inputBlockSize - i11;
        bArr2[i14 - 1] = 0;
        System.arraycopy(bArr, i10, bArr2, i14, i11);
        return this.f13325b.processBlock(bArr2, 0, inputBlockSize);
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public void a(boolean z10, j jVar) {
        AbstractC5975b abstractC5975b;
        if (jVar instanceof A) {
            A a10 = (A) jVar;
            this.f13324a = a10.b();
            abstractC5975b = (AbstractC5975b) a10.a();
        } else {
            abstractC5975b = (AbstractC5975b) jVar;
            if (!abstractC5975b.a() && z10) {
                this.f13324a = new SecureRandom();
            }
        }
        this.f13325b.a(z10, jVar);
        this.f13327d = abstractC5975b.a();
        this.f13326c = z10;
        this.blockBuffer = new byte[this.f13325b.getOutputBlockSize()];
        if (this.f13329f > 0 && this.fallback == null && this.f13324a == null) {
            throw new IllegalArgumentException("encoder requires random");
        }
    }

    public final byte[] d(byte[] bArr, int i10, int i11) {
        if (!this.f13327d) {
            throw new r("sorry, this method is only for decryption, not for signing");
        }
        byte[] processBlock = this.f13325b.processBlock(bArr, i10, i11);
        byte[] bArr2 = this.fallback;
        if (bArr2 == null) {
            bArr2 = new byte[this.f13329f];
            this.f13324a.nextBytes(bArr2);
        }
        if (this.f13328e & (processBlock.length != this.f13325b.getOutputBlockSize())) {
            processBlock = this.blockBuffer;
        }
        int b10 = b(processBlock, this.f13329f);
        byte[] bArr3 = new byte[this.f13329f];
        int i12 = 0;
        while (true) {
            int i13 = this.f13329f;
            if (i12 >= i13) {
                Aj.a.m(processBlock, (byte) 0);
                return bArr3;
            }
            bArr3[i12] = (byte) ((processBlock[(processBlock.length - i13) + i12] & (~b10)) | (bArr2[i12] & b10));
            i12++;
        }
    }

    public final int f(byte b10, byte[] bArr) {
        int i10 = -1;
        boolean z10 = false;
        for (int i11 = 1; i11 != bArr.length; i11++) {
            byte b11 = bArr[i11];
            if ((b11 == 0) & (i10 < 0)) {
                i10 = i11;
            }
            z10 |= (b11 != -1) & (b10 == 1) & (i10 < 0);
        }
        if (z10) {
            return -1;
        }
        return i10;
    }

    public final boolean g() {
        String str = (String) AccessController.doPrivileged(new a());
        return ((String) AccessController.doPrivileged(new b())) != null ? !r1.equals("true") : str == null || str.equals("true");
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getInputBlockSize() {
        int inputBlockSize = this.f13325b.getInputBlockSize();
        return this.f13326c ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getOutputBlockSize() {
        int outputBlockSize = this.f13325b.getOutputBlockSize();
        return this.f13326c ? outputBlockSize : outputBlockSize - 10;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        return this.f13326c ? e(bArr, i10, i11) : c(bArr, i10, i11);
    }
}

package co.nstant.in.cbor.decoder;

import g3.C4319a;
import g3.C4320b;
import h3.EnumC4433b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f27893a;

    /* renamed from: b, reason: collision with root package name */
    public final C4319a f27894b;

    /* renamed from: c, reason: collision with root package name */
    public int f27895c;

    /* renamed from: co.nstant.in.cbor.decoder.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0451a {
        static final /* synthetic */ int[] $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation;

        static {
            int[] iArr = new int[EnumC4433b.values().length];
            $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation = iArr;
            try {
                iArr[EnumC4433b.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.ONE_BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.TWO_BYTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.FOUR_BYTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.EIGHT_BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.INDEFINITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.RESERVED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a(C4319a c4319a, InputStream inputStream) {
        this.f27894b = c4319a;
        this.f27893a = inputStream;
    }

    public byte[] a(long j10) {
        if (j10 > 2147483647L) {
            throw new C4320b("Decoding fixed size items is limited to INTMAX");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(d(j10));
        int i10 = (int) (j10 <= 4096 ? j10 : 4096L);
        int i11 = (int) j10;
        byte[] bArr = new byte[i10];
        while (i11 > 0) {
            try {
                int read = this.f27893a.read(bArr, 0, i11 > i10 ? i10 : i11);
                if (read == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i11 -= read;
            } catch (IOException e10) {
                throw new C4320b(e10);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public long b(int i10) {
        switch (C0451a.$SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.a(i10).ordinal()]) {
            case 1:
                return i10 & 31;
            case 2:
                return e();
            case 3:
                byte[] f10 = f(2);
                return ((f10[0] & UByte.MAX_VALUE) << 8) | (f10[1] & UByte.MAX_VALUE);
            case 4:
                byte[] f11 = f(4);
                return ((f11[1] & UByte.MAX_VALUE) << 16) | ((f11[0] & UByte.MAX_VALUE) << 24) | ((f11[2] & UByte.MAX_VALUE) << 8) | (f11[3] & UByte.MAX_VALUE);
            case 5:
                byte[] f12 = f(8);
                return ((f12[5] & UByte.MAX_VALUE) << 16) | ((f12[4] & UByte.MAX_VALUE) << 24) | ((f12[1] & UByte.MAX_VALUE) << 48) | ((f12[0] & UByte.MAX_VALUE) << 56) | ((f12[2] & UByte.MAX_VALUE) << 40) | ((f12[3] & UByte.MAX_VALUE) << 32) | ((f12[6] & UByte.MAX_VALUE) << 8) | (f12[7] & UByte.MAX_VALUE);
            case 6:
                return -1L;
            default:
                throw new C4320b("Reserved additional information");
        }
    }

    public BigInteger c(int i10) {
        switch (C0451a.$SwitchMap$co$nstant$in$cbor$model$AdditionalInformation[EnumC4433b.a(i10).ordinal()]) {
            case 1:
                return BigInteger.valueOf(i10 & 31);
            case 2:
                return BigInteger.valueOf(e());
            case 3:
                byte[] f10 = f(2);
                return BigInteger.valueOf(((f10[0] & UByte.MAX_VALUE) << 8) | (f10[1] & UByte.MAX_VALUE));
            case 4:
                byte[] f11 = f(4);
                return BigInteger.valueOf(((f11[1] & UByte.MAX_VALUE) << 16) | ((f11[0] & UByte.MAX_VALUE) << 24) | ((f11[2] & UByte.MAX_VALUE) << 8) | (f11[3] & UByte.MAX_VALUE));
            case 5:
                BigInteger bigInteger = BigInteger.ZERO;
                byte[] f12 = f(8);
                return bigInteger.or(BigInteger.valueOf(f12[0] & UByte.MAX_VALUE).shiftLeft(56)).or(BigInteger.valueOf(f12[1] & UByte.MAX_VALUE).shiftLeft(48)).or(BigInteger.valueOf(f12[2] & UByte.MAX_VALUE).shiftLeft(40)).or(BigInteger.valueOf(f12[3] & UByte.MAX_VALUE).shiftLeft(32)).or(BigInteger.valueOf(f12[4] & UByte.MAX_VALUE).shiftLeft(24)).or(BigInteger.valueOf(f12[5] & UByte.MAX_VALUE).shiftLeft(16)).or(BigInteger.valueOf(f12[6] & UByte.MAX_VALUE).shiftLeft(8)).or(BigInteger.valueOf(f12[7] & UByte.MAX_VALUE).shiftLeft(0));
            case 6:
                return BigInteger.valueOf(-1L);
            default:
                throw new C4320b("Reserved additional information");
        }
    }

    public int d(long j10) {
        int abs = Math.abs((int) j10);
        int i10 = this.f27895c;
        return i10 > 0 ? Math.min(i10, abs) : abs;
    }

    public int e() {
        try {
            int read = this.f27893a.read();
            if (read != -1) {
                return read;
            }
            throw new IOException("Unexpected end of stream");
        } catch (IOException e10) {
            throw new C4320b(e10);
        }
    }

    public byte[] f(int i10) {
        try {
            byte[] bArr = new byte[i10];
            int read = this.f27893a.read(bArr);
            if (read != i10) {
                if (read == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                int i11 = i10 - read;
                while (i11 > 0) {
                    int read2 = this.f27893a.read(bArr, i10 - i11, i11);
                    if (read2 == -1) {
                        throw new IOException("Unexpected end of stream");
                    }
                    i11 -= read2;
                }
            }
            return bArr;
        } catch (IOException e10) {
            throw new C4320b(e10);
        }
    }
}

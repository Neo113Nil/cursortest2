package b;

import b3.AbstractC2382a;
import com.plaid.internal.EnumC3631g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: b.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2311h extends w0 implements InterfaceC2315l {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24114a;

    /* renamed from: d, reason: collision with root package name */
    public static final C2304d f24113d = new C2304d();

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f24112c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public AbstractC2311h(byte[] bArr) {
        this.f24114a = bArr;
    }

    public static AbstractC2311h j(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i10 = bArr[0] & UByte.MAX_VALUE;
        if (i10 > 0) {
            if (i10 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b10 = bArr[length - 1];
            if (b10 != ((byte) ((255 << i10) & b10))) {
                return new C2299a0(bArr);
            }
        }
        return new o0(bArr);
    }

    @Override // b.InterfaceC2315l
    public final InputStream a() {
        byte[] bArr = this.f24114a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (!(w0Var instanceof AbstractC2311h)) {
            return false;
        }
        byte[] bArr = this.f24114a;
        byte[] bArr2 = ((AbstractC2311h) w0Var).f24114a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i10 = length - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        int i12 = 255 << (bArr[0] & UByte.MAX_VALUE);
        return ((byte) (bArr[i10] & i12)) == ((byte) (bArr2[i10] & i12));
    }

    @Override // b.InterfaceC2315l
    public final int e() {
        return this.f24114a[0] & UByte.MAX_VALUE;
    }

    @Override // b.w0
    public w0 h() {
        return new o0(this.f24114a);
    }

    @Override // b.w0
    public final int hashCode() {
        byte[] bArr = this.f24114a;
        if (bArr.length < 2) {
            return 1;
        }
        int i10 = bArr[0] & UByte.MAX_VALUE;
        int length = bArr.length;
        int i11 = length - 1;
        byte b10 = (byte) ((255 << i10) & bArr[i11]);
        while (true) {
            i11--;
            if (i11 < 0) {
                return (length * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ b10;
            }
            length = (length * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ bArr[i11];
        }
    }

    @Override // b.w0
    public w0 i() {
        return new C2299a0(this.f24114a);
    }

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            b(new q0(byteArrayOutputStream), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuffer stringBuffer = new StringBuffer((byteArray.length * 2) + 1);
            stringBuffer.append('#');
            for (int i10 = 0; i10 != byteArray.length; i10++) {
                byte b10 = byteArray[i10];
                char[] cArr = f24112c;
                stringBuffer.append(cArr[(b10 >>> 4) & 15]);
                stringBuffer.append(cArr[b10 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e10) {
            throw new t0("Internal error encoding BitString: " + e10.getMessage(), e10);
        }
    }

    public AbstractC2311h(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f24114a = AbstractC2382a.b(bArr, (byte) i10);
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return this;
    }
}

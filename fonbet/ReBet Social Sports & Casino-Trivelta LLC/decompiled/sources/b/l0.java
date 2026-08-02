package b;

import com.plaid.internal.EnumC3631g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f24132a;

    public l0(char[] cArr) {
        this.f24132a = cArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24132a.length * 2);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        int length = this.f24132a.length;
        q0Var.k(z10, 30);
        q0Var.c(length * 2);
        byte[] bArr = new byte[8];
        int i10 = length & (-4);
        int i11 = 0;
        while (i11 < i10) {
            char[] cArr = this.f24132a;
            char c10 = cArr[i11];
            char c11 = cArr[i11 + 1];
            char c12 = cArr[i11 + 2];
            char c13 = cArr[i11 + 3];
            i11 += 4;
            bArr[0] = (byte) (c10 >> '\b');
            bArr[1] = (byte) c10;
            bArr[2] = (byte) (c11 >> '\b');
            bArr[3] = (byte) c11;
            bArr[4] = (byte) (c12 >> '\b');
            bArr[5] = (byte) c12;
            bArr[6] = (byte) (c13 >> '\b');
            bArr[7] = (byte) c13;
            q0Var.f24140a.write(bArr, 0, 8);
        }
        if (i11 < length) {
            int i12 = 0;
            do {
                char c14 = this.f24132a[i11];
                i11++;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (c14 >> '\b');
                i12 += 2;
                bArr[i13] = (byte) c14;
            } while (i11 < length);
            q0Var.f24140a.write(bArr, 0, i12);
        }
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof l0) {
            return Arrays.equals(this.f24132a, ((l0) w0Var).f24132a);
        }
        return false;
    }

    @Override // b.w0
    public final /* bridge */ /* synthetic */ boolean f() {
        return false;
    }

    @Override // b.w0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        char[] cArr = this.f24132a;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ cArr[length];
        }
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return new String(this.f24132a);
    }
}

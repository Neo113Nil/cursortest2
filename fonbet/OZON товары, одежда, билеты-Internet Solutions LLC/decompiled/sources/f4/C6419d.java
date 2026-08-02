package f4;

import N3.C3659j;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import m3.C8050C;

/* renamed from: f4.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6419d {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f62725a = new C8050C(8);

    /* renamed from: b, reason: collision with root package name */
    private int f62726b;

    private long a(C3659j c3659j) throws IOException {
        C8050C c8050c = this.f62725a;
        int i11 = 0;
        c3659j.d(c8050c.e(), 0, 1, false);
        int i12 = c8050c.e()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i14 = 0;
        while ((i12 & i13) == 0) {
            i13 >>= 1;
            i14++;
        }
        int i15 = i12 & (~i13);
        c3659j.d(c8050c.e(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (c8050c.e()[i11] & 255) + (i15 << 8);
        }
        this.f62726b = i14 + 1 + this.f62726b;
        return i15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(C3659j c3659j) throws IOException {
        long length = c3659j.getLength();
        long j11 = 1024;
        if (length != -1 && length <= 1024) {
            j11 = length;
        }
        int i11 = (int) j11;
        C8050C c8050c = this.f62725a;
        c3659j.d(c8050c.e(), 0, 4, false);
        long G11 = c8050c.G();
        this.f62726b = 4;
        while (true) {
            if (G11 != 440786851) {
                int i12 = this.f62726b + 1;
                this.f62726b = i12;
                if (i12 == i11) {
                    break;
                }
                c3659j.d(c8050c.e(), 0, 1, false);
                G11 = ((G11 << 8) & (-256)) | (c8050c.e()[0] & 255);
            } else {
                long a11 = a(c3659j);
                long j12 = this.f62726b;
                if (a11 != Long.MIN_VALUE && (length == -1 || j12 + a11 < length)) {
                    while (true) {
                        long j13 = this.f62726b;
                        long j14 = j12 + a11;
                        if (j13 < j14) {
                            if (a(c3659j) != Long.MIN_VALUE) {
                                long a12 = a(c3659j);
                                if (a12 < 0 || a12 > 2147483647L) {
                                    break;
                                }
                                if (a12 != 0) {
                                    int i13 = (int) a12;
                                    c3659j.i(i13, false);
                                    this.f62726b += i13;
                                }
                            } else {
                                break;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
    }
}

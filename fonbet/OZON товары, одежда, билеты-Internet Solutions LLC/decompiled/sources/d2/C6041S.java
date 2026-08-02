package d2;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.S, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6041S {

    /* renamed from: a, reason: collision with root package name */
    private final int f61029a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61030b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f61031c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61032d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f61033e;

    public C6041S(int i11, boolean z11, boolean z12) {
        this((i11 & 1) == 0, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, EnumC6042T.Inherit, true);
    }

    public final boolean a() {
        return this.f61031c;
    }

    public final boolean b() {
        return this.f61032d;
    }

    public final boolean c() {
        return this.f61033e;
    }

    public final int d() {
        return this.f61029a;
    }

    public final boolean e() {
        return this.f61030b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6041S)) {
            return false;
        }
        C6041S c6041s = (C6041S) obj;
        return this.f61029a == c6041s.f61029a && this.f61030b == c6041s.f61030b && this.f61031c == c6041s.f61031c && this.f61032d == c6041s.f61032d && this.f61033e == c6041s.f61033e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + C3532b.a(C3532b.a(C3532b.a(C3532b.a(this.f61029a * 31, 31, this.f61030b), 31, this.f61031c), 31, this.f61032d), 31, this.f61033e);
    }

    public C6041S(boolean z11, boolean z12, boolean z13, @NotNull EnumC6042T enumC6042T, boolean z14) {
        int i11 = C6054l.f61056b;
        int i12 = !z11 ? 262152 : 262144;
        i12 = enumC6042T == EnumC6042T.SecureOn ? i12 | 8192 : i12;
        i12 = z14 ? i12 : i12 | UserVerificationMethods.USER_VERIFY_NONE;
        boolean z15 = enumC6042T == EnumC6042T.Inherit;
        this.f61029a = i12;
        this.f61030b = z15;
        this.f61031c = z12;
        this.f61032d = z13;
        this.f61033e = true;
    }
}

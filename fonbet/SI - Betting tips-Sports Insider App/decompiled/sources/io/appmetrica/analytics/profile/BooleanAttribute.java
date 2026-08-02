package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0471s4;
import io.appmetrica.analytics.impl.C0498t6;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import io.appmetrica.analytics.impl.InterfaceC0244j2;
import io.appmetrica.analytics.impl.X2;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.so;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0498t6 f15264a;

    public BooleanAttribute(String str, so soVar, InterfaceC0244j2 interfaceC0244j2) {
        this.f15264a = new C0498t6(str, soVar, interfaceC0244j2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValue(boolean z5) {
        C0498t6 c0498t6 = this.f15264a;
        return new UserProfileUpdate<>(new X2(c0498t6.f14668c, z5, c0498t6.f14666a, new C0471s4(c0498t6.f14667b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValueIfUndefined(boolean z5) {
        C0498t6 c0498t6 = this.f15264a;
        return new UserProfileUpdate<>(new X2(c0498t6.f14668c, z5, c0498t6.f14666a, new Xk(c0498t6.f14667b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValueReset() {
        C0498t6 c0498t6 = this.f15264a;
        return new UserProfileUpdate<>(new Bi(3, c0498t6.f14668c, c0498t6.f14666a, c0498t6.f14667b));
    }
}

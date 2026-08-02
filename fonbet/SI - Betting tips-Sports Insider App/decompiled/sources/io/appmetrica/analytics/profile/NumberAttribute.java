package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0153fe;
import io.appmetrica.analytics.impl.C0322m4;
import io.appmetrica.analytics.impl.C0429qb;
import io.appmetrica.analytics.impl.C0471s4;
import io.appmetrica.analytics.impl.C0498t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import io.appmetrica.analytics.impl.Xk;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0498t6 f15275a;

    public NumberAttribute(String str, C0429qb c0429qb, Gb gb2) {
        this.f15275a = new C0498t6(str, c0429qb, gb2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValue(double d10) {
        return new UserProfileUpdate<>(new C0153fe(this.f15275a.f14668c, d10, new C0429qb(), new C0471s4(new Gb(new C0322m4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C0153fe(this.f15275a.f14668c, d10, new C0429qb(), new Xk(new Gb(new C0322m4(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withValueReset() {
        return new UserProfileUpdate<>(new Bi(1, this.f15275a.f14668c, new C0429qb(), new Gb(new C0322m4(100))));
    }
}

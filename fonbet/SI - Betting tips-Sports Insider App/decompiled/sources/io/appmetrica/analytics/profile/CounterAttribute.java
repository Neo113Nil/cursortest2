package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0429qb;
import io.appmetrica.analytics.impl.C0498t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import io.appmetrica.analytics.impl.Q5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0498t6 f15265a;

    public CounterAttribute(String str, C0429qb c0429qb, Gb gb2) {
        this.f15265a = new C0498t6(str, c0429qb, gb2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withDelta(double d10) {
        return new UserProfileUpdate<>(new Q5(this.f15265a.f14668c, d10));
    }
}

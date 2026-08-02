package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class R7 {

    /* renamed from: a, reason: collision with root package name */
    public final Dc f12807a;

    public R7() {
        Dc dc2 = new Dc(0);
        dc2.a(S7.f12861b, 0);
        dc2.a(S7.f12862c, 1);
        dc2.a(S7.f12863d, 2);
        dc2.a(S7.f12864e, 3);
        this.f12807a = dc2;
    }

    @NotNull
    public final Dc a() {
        return this.f12807a;
    }

    public abstract boolean a(Object obj, Object obj2);
}

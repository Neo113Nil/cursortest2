package com.ironsource;

import defpackage.u2g;
import defpackage.w2g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4371w3 implements InterfaceC4160k7 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final E3 c;

    public /* synthetic */ C4371w3(Boolean bool, Integer num, E3 e3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : e3);
    }

    @Override // com.ironsource.InterfaceC4160k7
    @NotNull
    public Object a() {
        Throwable a = w2g.a(new I4(this.a).a());
        if (a != null) {
            return new u2g(a);
        }
        Boolean bool = this.a;
        if (bool != null) {
            return new H4(bool.booleanValue());
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4160k7
    @NotNull
    public Object b() {
        Integer num;
        E3 e3 = E3.Second;
        Throwable a = w2g.a(a(e3));
        if (a != null) {
            return new u2g(a);
        }
        if (!Intrinsics.c(this.a, Boolean.TRUE) || (num = this.b) == null) {
            return null;
        }
        return new Vc(e3.a(num), null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4160k7
    @NotNull
    public Object c() {
        Integer num;
        Throwable a = w2g.a(a(this.c));
        if (a != null) {
            return new u2g(a);
        }
        if (!Intrinsics.c(this.a, Boolean.TRUE) || (num = this.b) == null) {
            return null;
        }
        int intValue = num.intValue();
        E3 e3 = this.c;
        if (e3 != null) {
            return new C4293rf(intValue, e3);
        }
        return null;
    }

    @Nullable
    public final Boolean d() {
        return this.a;
    }

    @Nullable
    public final Integer e() {
        return this.b;
    }

    @Nullable
    public final E3 f() {
        return this.c;
    }

    public C4371w3(@Nullable Boolean bool, @Nullable Integer num, @Nullable E3 e3) {
        this.a = bool;
        this.b = num;
        this.c = e3;
    }

    private final Object a(E3 e3) {
        return new C4389x3(this.a, this.b, e3).a();
    }
}

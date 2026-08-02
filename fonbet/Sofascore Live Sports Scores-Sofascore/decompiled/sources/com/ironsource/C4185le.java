package com.ironsource;

import com.ironsource.Te;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4185le {

    @NotNull
    private final C4346ue a;

    @Nullable
    private final Qe b;

    @Nullable
    private final C4037d9 c;

    public /* synthetic */ C4185le(C4346ue c4346ue, Qe qe, C4037d9 c4037d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4346ue, (i & 2) != 0 ? null : qe, (i & 4) != 0 ? null : c4037d9);
    }

    @NotNull
    public final K1 a() {
        return this.a.a().b().d();
    }

    @NotNull
    public final D1 b() {
        return this.a.a().b().b();
    }

    @NotNull
    public final K5 c() {
        return this.a.b();
    }

    @NotNull
    public final Te d() {
        return this.a.c();
    }

    @NotNull
    public final Eb e() {
        return this.a.a().b().f();
    }

    @Nullable
    public final C4037d9 f() {
        return this.c;
    }

    @NotNull
    public final Te.a g() {
        Te.a i = this.a.c().i();
        i.getClass();
        return i;
    }

    @NotNull
    public final C4346ue h() {
        return this.a;
    }

    @Nullable
    public final Qe i() {
        return this.b;
    }

    public C4185le(@NotNull C4346ue c4346ue, @Nullable Qe qe, @Nullable C4037d9 c4037d9) {
        c4346ue.getClass();
        this.a = c4346ue;
        this.b = qe;
        this.c = c4037d9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4185le(@NotNull C4185le c4185le) {
        this(c4185le.a, c4185le.b, c4185le.c);
        c4185le.getClass();
    }
}

package com.ironsource;

import com.ironsource.C4019c9;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.Kb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4037d9 {

    @NotNull
    private final InterfaceC4193m4 a;

    @NotNull
    private final Kb.a b;

    @Nullable
    private Long c;

    @Nullable
    private Long d;

    @Nullable
    private Kb e;

    @Nullable
    private C4019c9 f;

    public /* synthetic */ C4037d9(InterfaceC4193m4 interfaceC4193m4, Kb.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC4193m4.a() : interfaceC4193m4, (i & 2) != 0 ? new Kb.a.C0185a() : aVar);
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.c = Long.valueOf(str.length());
        this.e = this.b.get();
        this.d = Long.valueOf(this.a.a());
    }

    @Nullable
    public final C4019c9 b() {
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.c;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (this.e == null) {
                    return null;
                }
                long a = this.a.a();
                Kb kb = this.b.get();
                C4019c9 c4019c9 = new C4019c9(a - longValue, new C4019c9.a(Math.max(0L, kb.d() - r1.d()), Math.max(0L, kb.e() - r1.e()), Math.max(0L, kb.f() - r1.f())), longValue2 / 1024);
                this.f = c4019c9;
                return c4019c9;
            }
        }
        return null;
    }

    public C4037d9(@NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull Kb.a aVar) {
        interfaceC4193m4.getClass();
        aVar.getClass();
        this.a = interfaceC4193m4;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4037d9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final C4019c9 a() {
        return this.f;
    }
}

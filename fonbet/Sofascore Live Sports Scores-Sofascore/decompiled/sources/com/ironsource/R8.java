package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import defpackage.gjc;
import defpackage.kdc;
import defpackage.o13;
import defpackage.xka;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R8 implements D7 {

    @NotNull
    private final InterfaceC4375w7 a;

    @NotNull
    private final C4325tb b;

    @NotNull
    private final Q8 c;
    private boolean d;

    @NotNull
    private final List<Pair<String, LevelPlayImpressionDataListener>> e;

    @Nullable
    private Set<String> f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function1<Pair<? extends String, ? extends LevelPlayImpressionDataListener>, Boolean> {
        final /* synthetic */ LevelPlayImpressionDataListener a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
            super(1);
            this.a = levelPlayImpressionDataListener;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull Pair<String, ? extends LevelPlayImpressionDataListener> pair) {
            pair.getClass();
            return Boolean.valueOf(Intrinsics.c(pair.b, this.a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ R8(InterfaceC4375w7 interfaceC4375w7, C4325tb c4325tb, Q8 q8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Ib.v.d().h() : interfaceC4375w7, (i & 2) != 0 ? new C4325tb() : c4325tb, (i & 4) != 0 ? new Q8(null, 1, 0 == true ? 1 : 0) : q8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R8 r8, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        r8.getClass();
        levelPlayImpressionDataListener.getClass();
        r8.c.a(levelPlayImpressionDataListener.getClass());
        if (r8.d) {
            com.ironsource.mediationsdk.p.g().a(new Xa(levelPlayImpressionDataListener));
        } else {
            IronLog.INTERNAL.verbose("removing listener pre-init: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
            o13.A(r8.e, new a(levelPlayImpressionDataListener));
        }
    }

    private final void b(String str, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        if (!b(str)) {
            IronLog.INTERNAL.verbose("subscription denied for: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
            this.c.a(str, levelPlayImpressionDataListener.getClass(), a(str));
        } else {
            IronLog.INTERNAL.verbose("subscription approved for: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
            com.ironsource.mediationsdk.p.g().b(new Xa(levelPlayImpressionDataListener));
        }
    }

    public R8(@NotNull InterfaceC4375w7 interfaceC4375w7, @NotNull C4325tb c4325tb, @NotNull Q8 q8) {
        interfaceC4375w7.getClass();
        c4325tb.getClass();
        q8.getClass();
        this.a = interfaceC4375w7;
        this.b = c4325tb;
        this.c = q8;
        this.e = new ArrayList();
    }

    public R8() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R8 r8, String str, LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        r8.getClass();
        str.getClass();
        levelPlayImpressionDataListener.getClass();
        r8.c.a(str, levelPlayImpressionDataListener.getClass());
        if (!r8.d) {
            IronLog.INTERNAL.verbose("queuing listener pre-init: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
            r8.e.add(new Pair<>(str, levelPlayImpressionDataListener));
        } else {
            r8.b(str, levelPlayImpressionDataListener);
        }
    }

    @Override // com.ironsource.D7
    public void a(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        this.b.a(new gjc(25, this, levelPlayImpressionDataListener));
    }

    @Override // com.ironsource.D7
    public void a(@NotNull String str, @NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        str.getClass();
        levelPlayImpressionDataListener.getClass();
        this.b.a(new kdc(13, this, str, levelPlayImpressionDataListener));
    }

    @Override // com.ironsource.D7
    public void a(@Nullable Set<String> set) {
        this.b.a(new gjc(24, this, set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(R8 r8, Set set) {
        r8.getClass();
        r8.f = set;
        r8.d = true;
        List<Pair> S0 = CollectionsKt.S0(r8.e);
        r8.e.clear();
        for (Pair pair : S0) {
            r8.b((String) pair.a, (LevelPlayImpressionDataListener) pair.b);
        }
    }

    private final boolean b(String str) {
        Set<String> set;
        if (this.a.B() && (set = this.f) != null) {
            return set.contains(str);
        }
        return true;
    }

    private final boolean a(String str) {
        Set<String> set = this.f;
        return (set == null || set.isEmpty() || set.contains(str)) ? false : true;
    }
}

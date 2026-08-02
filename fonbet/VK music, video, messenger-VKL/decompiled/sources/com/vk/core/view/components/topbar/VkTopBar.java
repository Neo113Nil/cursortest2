package com.vk.core.view.components.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.compose.component.topbar.k;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text;
import com.vk.core.view.components.topbar.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.a8d;
import xsna.a8g;
import xsna.ae2;
import xsna.alb0;
import xsna.asp;
import xsna.b8g;
import xsna.bap;
import xsna.bbk0;
import xsna.bko0;
import xsna.blk;
import xsna.br;
import xsna.bt;
import xsna.csk0;
import xsna.dko;
import xsna.dq;
import xsna.dso0;
import xsna.e4;
import xsna.e7p0;
import xsna.efj;
import xsna.eko;
import xsna.epx;
import xsna.f7p0;
import xsna.fai;
import xsna.fcy;
import xsna.fko;
import xsna.fsk;
import xsna.gkg0;
import xsna.gko;
import xsna.gu0;
import xsna.gzs;
import xsna.h5s;
import xsna.ibu;
import xsna.ipi;
import xsna.izs;
import xsna.kai;
import xsna.kg50;
import xsna.knc;
import xsna.l5g;
import xsna.lg90;
import xsna.lmc;
import xsna.lzl0;
import xsna.m2l0;
import xsna.m7p0;
import xsna.mfj;
import xsna.mnh0;
import xsna.mqe0;
import xsna.mtk0;
import xsna.muv0;
import xsna.n0m0;
import xsna.oq;
import xsna.or;
import xsna.p6e0;
import xsna.pco;
import xsna.pg90;
import xsna.pm0;
import xsna.pxj;
import xsna.q630;
import xsna.qoy;
import xsna.r5j0;
import xsna.r6i0;
import xsna.rpo0;
import xsna.rrv0;
import xsna.rte0;
import xsna.s3q0;
import xsna.sf3;
import xsna.sg50;
import xsna.shy;
import xsna.snx;
import xsna.ta8;
import xsna.tg50;
import xsna.tho0;
import xsna.tlh0;
import xsna.tlo0;
import xsna.tq;
import xsna.txj0;
import xsna.uf3;
import xsna.ufu0;
import xsna.ulh0;
import xsna.v590;
import xsna.vak0;
import xsna.vax;
import xsna.vlh0;
import xsna.vua0;
import xsna.w5k0;
import xsna.wep;
import xsna.wh50;
import xsna.wnx;
import xsna.wow;
import xsna.wzs;
import xsna.y3l0;
import xsna.yb1;
import xsna.yfi0;
import xsna.ylu0;
import xsna.z190;
import xsna.zak0;
import xsna.ze4;
import xsna.zhf0;
import xsna.zrp;
import xsna.zy5;

/* compiled from: VkTopBar.kt */
/* loaded from: classes17.dex */
public class VkTopBar extends rpo0 {
    public static final /* synthetic */ int I = 0;
    public final wh50 A;
    public final wh50 B;
    public final wh50 C;
    public final wh50 D;
    public final wh50 E;
    public final wh50 F;
    public final wh50 G;
    public final wh50 H;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final kg50 u;
    public final wh50 v;
    public final wh50 w;
    public final wh50 x;
    public final wh50 y;
    public final wh50 z;

    /* compiled from: VkTopBar.kt */
    public static abstract class a {

        /* compiled from: VkTopBar.kt */
        /* renamed from: com.vk.core.view.components.topbar.VkTopBar$a$a, reason: collision with other inner class name */
        public static final class C0875a {
            public static d a(c cVar, b.C0877b c0877b, int i) {
                if ((i & 2) != 0) {
                    c0877b = null;
                }
                return new d(cVar, c0877b, null);
            }
        }

        /* compiled from: VkTopBar.kt */
        public interface b {

            /* compiled from: VkTopBar.kt */
            /* renamed from: com.vk.core.view.components.topbar.VkTopBar$a$b$a, reason: collision with other inner class name */
            public static final class C0876a implements b {
                public final View a;

                public C0876a(View view) {
                    this.a = view;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0876a) && epx.f(this.a, ((C0876a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return br.b(new StringBuilder("CustomView(view="), this.a, ')');
                }
            }

            /* compiled from: VkTopBar.kt */
            /* renamed from: com.vk.core.view.components.topbar.VkTopBar$a$b$b, reason: collision with other inner class name */
            public static final class C0877b implements b {
                public final dko a;
                public final tlo0 b;
                public final gzs<s3q0> c;
                public final l d;
                public final ipi e;
                public final SemanticsConfiguration f;

                public C0877b() {
                    throw null;
                }

                public /* synthetic */ C0877b(dko dkoVar, tlo0 tlo0Var, gzs gzsVar, l lVar, b8g b8gVar, SemanticsConfiguration semanticsConfiguration, int i) {
                    this(dkoVar, (i & 2) != 0 ? null : tlo0Var, gzsVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : b8gVar, (i & 32) != 0 ? null : semanticsConfiguration);
                }

                public final boolean equals(Object obj) {
                    boolean f;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0877b)) {
                        return false;
                    }
                    C0877b c0877b = (C0877b) obj;
                    if (!epx.f(this.a, c0877b.a) || !epx.f(this.b, c0877b.b) || !epx.f(this.c, c0877b.c) || !epx.f(this.d, c0877b.d) || !epx.f(this.e, c0877b.e)) {
                        return false;
                    }
                    SemanticsConfiguration semanticsConfiguration = c0877b.f;
                    SemanticsConfiguration semanticsConfiguration2 = this.f;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            f = true;
                        }
                        f = false;
                    } else {
                        if (semanticsConfiguration != null) {
                            f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                        }
                        f = false;
                    }
                    return f;
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    tlo0 tlo0Var = this.b;
                    int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                    gzs<s3q0> gzsVar = this.c;
                    int hashCode3 = (hashCode2 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                    l lVar = this.d;
                    int hashCode4 = (hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
                    ipi ipiVar = this.e;
                    int hashCode5 = (hashCode4 + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
                    SemanticsConfiguration semanticsConfiguration = this.f;
                    return hashCode5 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Icon(icon=");
                    sb.append(this.a);
                    sb.append(", iconDescription=");
                    sb.append(this.b);
                    sb.append(", onClick=");
                    sb.append(this.c);
                    sb.append(", topMarker=");
                    sb.append(this.d);
                    sb.append(", iconTint=");
                    sb.append(this.e);
                    sb.append(", semanticsConfiguration=");
                    SemanticsConfiguration semanticsConfiguration = this.f;
                    return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
                }

                public C0877b(dko dkoVar, tlo0 tlo0Var, gzs gzsVar, l lVar, ipi ipiVar, SemanticsConfiguration semanticsConfiguration) {
                    this.a = dkoVar;
                    this.b = tlo0Var;
                    this.c = gzsVar;
                    this.d = lVar;
                    this.e = ipiVar;
                    this.f = semanticsConfiguration;
                }
            }
        }

        /* compiled from: VkTopBar.kt */
        public interface c {

            /* compiled from: VkTopBar.kt */
            /* renamed from: com.vk.core.view.components.topbar.VkTopBar$a$c$a, reason: collision with other inner class name */
            public static final class C0878a implements c {
                public final snx a;
                public final gzs<s3q0> b;
                public final pco c;

                public C0878a() {
                    throw null;
                }

                public C0878a(snx snxVar, gzs gzsVar, pco pcoVar, int i) {
                    pcoVar = (i & 4) != 0 ? null : pcoVar;
                    this.a = snxVar;
                    this.b = gzsVar;
                    this.c = pcoVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0878a)) {
                        return false;
                    }
                    C0878a c0878a = (C0878a) obj;
                    return epx.f(this.a, c0878a.a) && epx.f(this.b, c0878a.b) && epx.f(this.c, c0878a.c);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    gzs<s3q0> gzsVar = this.b;
                    int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                    pco pcoVar = this.c;
                    return (hashCode2 + (pcoVar != null ? Float.hashCode(pcoVar.b) : 0)) * 31;
                }

                public final String toString() {
                    return "Avatar(avatar=" + this.a + ", onClick=" + this.b + ", size=" + this.c + ", semanticsConfiguration=" + ((Object) "null") + ')';
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class b implements c {
                public final tlo0.h a;
                public final boolean b;
                public final float c;
                public final gzs<s3q0> d;
                public final SemanticsConfiguration e;

                public b() {
                    throw null;
                }

                public b(tlo0.h hVar, float f, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar) {
                    this.a = hVar;
                    this.b = true;
                    this.c = f;
                    this.d = gzsVar;
                    this.e = aVar;
                }

                public final boolean equals(Object obj) {
                    boolean equals;
                    if (this != obj) {
                        if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (epx.f(this.a, bVar.a) && this.b == bVar.b && Float.compare(this.c, bVar.c) == 0 && epx.f(this.d, bVar.d)) {
                                SemanticsConfiguration semanticsConfiguration = bVar.e;
                                SemanticsConfiguration semanticsConfiguration2 = this.e;
                                if (semanticsConfiguration2 == null) {
                                    if (semanticsConfiguration == null) {
                                        equals = true;
                                        if (equals) {
                                        }
                                    }
                                    equals = false;
                                    if (equals) {
                                    }
                                } else {
                                    if (semanticsConfiguration != null) {
                                        equals = semanticsConfiguration2.equals(semanticsConfiguration);
                                        if (equals) {
                                        }
                                    }
                                    equals = false;
                                    if (equals) {
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    int a = sf3.a(io.reactivex.rxjava3.subjects.b.a(this.c, qoy.b(this.a.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
                    SemanticsConfiguration semanticsConfiguration = this.e;
                    return a + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(text=");
                    sb.append(this.a);
                    sb.append(", enabled=");
                    sb.append(this.b);
                    sb.append(", alpha=");
                    sb.append(this.c);
                    sb.append(", onClick=");
                    sb.append(this.d);
                    sb.append(", semanticsConfiguration=");
                    SemanticsConfiguration semanticsConfiguration = this.e;
                    return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
                }
            }

            /* compiled from: VkTopBar.kt */
            /* renamed from: com.vk.core.view.components.topbar.VkTopBar$a$c$c, reason: collision with other inner class name */
            public static final class C0879c implements c {
                public final gzs<s3q0> a;
                public final SemanticsConfiguration b;

                public C0879c() {
                    throw null;
                }

                public C0879c(gzs gzsVar, com.vk.core.compose.component.semantics.a aVar) {
                    this.a = gzsVar;
                    this.b = aVar;
                }

                public final boolean equals(Object obj) {
                    boolean f;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0879c)) {
                        return false;
                    }
                    C0879c c0879c = (C0879c) obj;
                    if (!epx.f(this.a, c0879c.a)) {
                        return false;
                    }
                    SemanticsConfiguration semanticsConfiguration = c0879c.b;
                    SemanticsConfiguration semanticsConfiguration2 = this.b;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            f = true;
                        }
                        f = false;
                    } else {
                        if (semanticsConfiguration != null) {
                            f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                        }
                        f = false;
                    }
                    return f;
                }

                public final int hashCode() {
                    gzs<s3q0> gzsVar = this.a;
                    int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                    SemanticsConfiguration semanticsConfiguration = this.b;
                    return hashCode + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Close(onClick=");
                    sb.append(this.a);
                    sb.append(", semanticsConfiguration=");
                    SemanticsConfiguration semanticsConfiguration = this.b;
                    return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class d implements c {
                public final View a;

                public d(View view) {
                    this.a = view;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return br.b(new StringBuilder("CustomView(view="), this.a, ')');
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class e implements c {
                public final com.vk.movika.tools.controls.seekbar.n a;

                public e() {
                    throw null;
                }

                public e(com.vk.movika.tools.controls.seekbar.n nVar) {
                    this.a = nVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    com.vk.movika.tools.controls.seekbar.n nVar = this.a;
                    return (nVar == null ? 0 : nVar.hashCode()) * 31;
                }

                public final String toString() {
                    return "Done(onClick=" + this.a + ", semanticsConfiguration=" + ((Object) "null") + ')';
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class f implements c {
                public final dko a;
                public final tlo0 b;
                public final gzs<s3q0> c;
                public final l d;
                public final ipi e;
                public final SemanticsConfiguration f;

                public f() {
                    throw null;
                }

                public /* synthetic */ f(dko dkoVar, tlo0 tlo0Var, gzs gzsVar, l lVar, b8g b8gVar, SemanticsConfiguration semanticsConfiguration, int i) {
                    this(dkoVar, (i & 2) != 0 ? null : tlo0Var, (i & 4) != 0 ? null : gzsVar, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : b8gVar, (i & 32) != 0 ? null : semanticsConfiguration);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v2, types: [com.vk.core.compose.component.semantics.SemanticsConfiguration] */
                /* JADX WARN: Type inference failed for: r8v5, types: [xsna.dko] */
                /* JADX WARN: Type inference failed for: r9v2, types: [xsna.tlo0] */
                public static f a(f fVar, eko ekoVar, tlo0.f fVar2, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar, int i) {
                    eko ekoVar2 = ekoVar;
                    if ((i & 1) != 0) {
                        ekoVar2 = fVar.a;
                    }
                    eko ekoVar3 = ekoVar2;
                    tlo0.f fVar3 = fVar2;
                    if ((i & 2) != 0) {
                        fVar3 = fVar.b;
                    }
                    tlo0.f fVar4 = fVar3;
                    if ((i & 4) != 0) {
                        gzsVar = fVar.c;
                    }
                    gzs gzsVar2 = gzsVar;
                    l lVar = fVar.d;
                    ipi ipiVar = fVar.e;
                    com.vk.core.compose.component.semantics.a aVar2 = aVar;
                    if ((i & 32) != 0) {
                        aVar2 = fVar.f;
                    }
                    fVar.getClass();
                    return new f(ekoVar3, fVar4, gzsVar2, lVar, ipiVar, aVar2);
                }

                public final boolean equals(Object obj) {
                    boolean f;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    if (!epx.f(this.a, fVar.a) || !epx.f(this.b, fVar.b) || !epx.f(this.c, fVar.c) || !epx.f(this.d, fVar.d) || !epx.f(this.e, fVar.e)) {
                        return false;
                    }
                    SemanticsConfiguration semanticsConfiguration = fVar.f;
                    SemanticsConfiguration semanticsConfiguration2 = this.f;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            f = true;
                        }
                        f = false;
                    } else {
                        if (semanticsConfiguration != null) {
                            f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                        }
                        f = false;
                    }
                    return f;
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    tlo0 tlo0Var = this.b;
                    int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                    gzs<s3q0> gzsVar = this.c;
                    int hashCode3 = (hashCode2 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                    l lVar = this.d;
                    int hashCode4 = (hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
                    ipi ipiVar = this.e;
                    int hashCode5 = (hashCode4 + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
                    SemanticsConfiguration semanticsConfiguration = this.f;
                    return hashCode5 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Icon(icon=");
                    sb.append(this.a);
                    sb.append(", iconDescription=");
                    sb.append(this.b);
                    sb.append(", onClick=");
                    sb.append(this.c);
                    sb.append(", topMarker=");
                    sb.append(this.d);
                    sb.append(", iconTint=");
                    sb.append(this.e);
                    sb.append(", semanticsConfiguration=");
                    SemanticsConfiguration semanticsConfiguration = this.f;
                    return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
                }

                public f(dko dkoVar, tlo0 tlo0Var, gzs gzsVar, l lVar, ipi ipiVar, SemanticsConfiguration semanticsConfiguration) {
                    this.a = dkoVar;
                    this.b = tlo0Var;
                    this.c = gzsVar;
                    this.d = lVar;
                    this.e = ipiVar;
                    this.f = semanticsConfiguration;
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class g implements c {
                public final gu0 a;

                public g() {
                    throw null;
                }

                public g(gu0 gu0Var) {
                    this.a = gu0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
                }

                public final int hashCode() {
                    gu0 gu0Var = this.a;
                    return (gu0Var == null ? 0 : gu0Var.hashCode()) * 31;
                }

                public final String toString() {
                    return "More(onClick=" + this.a + ", semanticsConfiguration=" + ((Object) "null") + ')';
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class h implements c {
                public final long a;

                public h(long j) {
                    this.a = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && l5g.d(this.a, ((h) obj).a);
                }

                public final int hashCode() {
                    int i = l5g.l;
                    return Long.hashCode(this.a);
                }

                public final String toString() {
                    return pm0.d(')', this.a, new StringBuilder("ProgressIndicator(tint="));
                }
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class d extends a {
            public final c a;
            public final b b;
            public final b c;

            public d(c cVar, b bVar, b bVar2) {
                this.a = cVar;
                this.b = bVar;
                this.c = bVar2;
            }

            @Override // com.vk.core.view.components.topbar.VkTopBar.a
            public final a a(c.f fVar) {
                return new d(fVar, this.b, this.c);
            }

            @Override // com.vk.core.view.components.topbar.VkTopBar.a
            public final c b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                b bVar = this.b;
                int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                b bVar2 = this.c;
                return hashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
            }

            public final String toString() {
                return "Milkshake(main=" + this.a + ", extra=" + this.b + ", secondExtra=" + this.c + ')';
            }
        }

        public abstract a a(c.f fVar);

        public abstract c b();
    }

    /* compiled from: VkTopBar.kt */
    public static final class b {
        public final gzs<s3q0> a;
        public final tlo0 b;
        public final l c;
        public final ipi d;
        public final SemanticsConfiguration e;

        public b() {
            throw null;
        }

        public b(gzs gzsVar, tlo0 tlo0Var, l.c cVar, b8g b8gVar, com.vk.core.compose.component.semantics.a aVar, int i) {
            tlo0Var = (i & 2) != 0 ? null : tlo0Var;
            cVar = (i & 4) != 0 ? null : cVar;
            b8gVar = (i & 8) != 0 ? null : b8gVar;
            aVar = (i & 16) != 0 ? null : aVar;
            this.a = gzsVar;
            this.b = tlo0Var;
            this.c = cVar;
            this.d = b8gVar;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            boolean f;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!epx.f(this.a, bVar.a) || !epx.f(this.b, bVar.b) || !epx.f(this.c, bVar.c) || !epx.f(this.d, bVar.d)) {
                return false;
            }
            SemanticsConfiguration semanticsConfiguration = bVar.e;
            SemanticsConfiguration semanticsConfiguration2 = this.e;
            if (semanticsConfiguration2 == null) {
                if (semanticsConfiguration == null) {
                    f = true;
                }
                f = false;
            } else {
                if (semanticsConfiguration != null) {
                    f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                }
                f = false;
            }
            return f;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            tlo0 tlo0Var = this.b;
            int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            l lVar = this.c;
            int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            ipi ipiVar = this.d;
            int hashCode4 = (hashCode3 + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
            SemanticsConfiguration semanticsConfiguration = this.e;
            return hashCode4 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Back(onClick=");
            sb.append(this.a);
            sb.append(", iconDescription=");
            sb.append(this.b);
            sb.append(", topMarker=");
            sb.append(this.c);
            sb.append(", iconTint=");
            sb.append(this.d);
            sb.append(", semanticsConfiguration=");
            SemanticsConfiguration semanticsConfiguration = this.e;
            return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
        }
    }

    /* compiled from: VkTopBar.kt */
    public static final class d extends d.b {
        public final a.b.C0876a d;

        public d(a.b.C0876a c0876a) {
            this.d = c0876a;
        }

        @Override // com.vk.core.compose.component.topbar.d.b
        public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
            androidx.compose.runtime.a M = aVar.M(-285909596);
            int i2 = (M.J(this) ? 256 : 128) | i;
            if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-285909596, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.CustomAfterExtra.Content (VkTopBar.kt:1191)");
                }
                boolean z = (i2 & 896) == 256;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new dso0(this, 21);
                    M.R(x);
                }
                ae2.a(48, 4, M, (izs) x, null, q630.a.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new yb1(this, mtk0Var, i, 15);
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static final class e extends d.c {
        public final a.c.d d;

        public e(a.c.d dVar) {
            this.d = dVar;
        }

        @Override // com.vk.core.compose.component.topbar.d.c
        public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
            androidx.compose.runtime.a M = aVar.M(-758712699);
            int i2 = (M.J(this) ? 256 : 128) | i;
            if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-758712699, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.CustomAfterMain.Content (VkTopBar.kt:1184)");
                }
                boolean z = (i2 & 896) == 256;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new lzl0(this, 17);
                    M.R(x);
                }
                ae2.a(48, 4, M, (izs) x, null, q630.a.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new ta8(this, mtk0Var, i, 6);
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static final class f extends TopBar$Before {
        public final c.e c;

        public f(c.e eVar) {
            this.c = eVar;
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            q630 q630Var2;
            androidx.compose.runtime.a M = aVar.M(-78323650);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-78323650, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.CustomBefore.Content (VkTopBar.kt:1170)");
                }
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new m2l0(this, 23);
                    M.R(x);
                }
                q630Var2 = q630Var;
                ae2.a((i2 << 3) & 112, 4, M, (izs) x, null, q630Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                q630Var2 = q630Var;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new knc(this, q630Var2, i, 7);
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static final class g extends e7p0 {
        public final Middle.b c;

        public g(Middle.b bVar) {
            this.c = bVar;
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Middle
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            q630 q630Var2;
            androidx.compose.runtime.a M = aVar.M(-669871768);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-669871768, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.CustomMiddle.Content (VkTopBar.kt:1177)");
                }
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new r6i0(this, 26);
                    M.R(x);
                }
                q630Var2 = q630Var;
                ae2.a((i2 << 3) & 112, 4, M, (izs) x, null, q630Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                q630Var2 = q630Var;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new a8d(this, q630Var2, i, 7);
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static abstract class h {

        /* compiled from: VkTopBar.kt */
        public static final class a extends h {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a) * 31;
            }

            public final String toString() {
                return h5s.c(this.a, ", topBarOverlapHeight=null)", new StringBuilder("Vertical(statusBarHeight="));
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static abstract class i extends Middle {
    }

    /* compiled from: VkTopBar.kt */
    public interface j {

        /* compiled from: VkTopBar.kt */
        public static final class a implements j {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -436183506;
            }

            public final String toString() {
                return "Regular";
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static final class k implements vax {
        public final String a;

        public k(String str) {
            this.a = str;
        }
    }

    /* compiled from: VkTopBar.kt */
    public interface l {

        /* compiled from: VkTopBar.kt */
        public static final class a implements l {
            public final VkBadge.Appearance a;

            public a(VkBadge.Appearance.Design design) {
                this.a = design;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() * 31;
            }

            public final String toString() {
                return "Badge(appearance=" + this.a + ", semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class b implements l {
            public final VkContentBadge.Size a;
            public final VkContentBadge.Mode b;
            public final VkContentBadge.Appearance.Design c;
            public final gko d;

            public b(VkContentBadge.Appearance.Design design, gko gkoVar) {
                VkContentBadge.Size size = VkContentBadge.Size.Small;
                VkContentBadge.Mode mode = VkContentBadge.Mode.Primary;
                this.a = size;
                this.b = mode;
                this.c = design;
                this.d = gkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
                gko gkoVar = this.d;
                return qoy.b((hashCode + (gkoVar == null ? 0 : Integer.hashCode(gkoVar.a))) * 28629151, 31, false);
            }

            public final String toString() {
                return "ContentBadge(size=" + this.a + ", mode=" + this.b + ", appearance=" + this.c + ", icon=" + this.d + ", iconTint=null, text=null, trailingIcon=null, trailingIconTint=null, capsule=false, semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class c implements l {
            public final int a;
            public final VkCounter.CounterAppearance b;
            public final VkCounter.Mode c;

            public c(int i, VkCounter.CounterAppearance.Appearance appearance, VkCounter.Mode mode, int i2) {
                mode = (i2 & 4) != 0 ? VkCounter.Mode.Primary : mode;
                this.a = i;
                this.b = appearance;
                this.c = mode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
            }

            public final String toString() {
                return "Counter(count=" + this.a + ", appearance=" + this.b + ", mode=" + this.c + ", semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public interface m {

        /* compiled from: VkTopBar.kt */
        public static final class a implements m {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1754815199;
            }

            public final String toString() {
                return "Regular";
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class b implements m {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 688733973;
            }

            public final String toString() {
                return "Transparent";
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static final /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Middle.Text.Title.Size.values().length];
            try {
                iArr[Middle.Text.Title.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Middle.Text.Title.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkTopBar$Middle$Cell$Middle$Text.Title.Overflow.values().length];
            try {
                iArr2[VkTopBar$Middle$Cell$Middle$Text.Title.Overflow.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VkTopBar$Middle$Cell$Middle$Text.Title.Overflow.Fade.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VkTopBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TopBar$Middle.Cell.Middle.Text.Title.a E(VkTopBar$Middle$Cell$Middle$Text.Title.a aVar, androidx.compose.runtime.a aVar2, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1441980453, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.mapCellTitleAlong (VkTopBar.kt:546)");
        }
        boolean z = aVar instanceof VkTopBar$Middle$Cell$Middle$Text.Title.a.C0869a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        TopBar$Middle.Cell.Middle.Text.Title.a.b bVar = null;
        if (z) {
            aVar2.K(1531228631);
            ((VkTopBar$Middle$Cell$Middle$Text.Title.a.C0869a) aVar).getClass();
            String I2 = blk.I(null, aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-500222259, 48, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.Along.Dropdown.Companion.invoke (TopBar.kt:1413)");
            }
            Object x = aVar2.x();
            if (x == c0012a) {
                x = new TopBar$Middle.Cell.Middle.Text.Title.a.C0751a(I2);
                aVar2.R(x);
            }
            TopBar$Middle.Cell.Middle.Text.Title.a.C0751a c0751a = (TopBar$Middle.Cell.Middle.Text.Title.a.C0751a) x;
            ((zak0) c0751a.a).setValue(I2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            bVar = c0751a;
        } else if (aVar instanceof VkTopBar$Middle$Cell$Middle$Text.Title.a.b) {
            aVar2.K(1531234100);
            ((VkTopBar$Middle$Cell$Middle$Text.Title.a.b) aVar).getClass();
            lg90 a2 = fko.a(null, aVar2);
            String I3 = blk.I(null, aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1695848308, 392, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.Along.Icon.Companion.invoke (TopBar.kt:1444)");
            }
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new TopBar$Middle.Cell.Middle.Text.Title.a.b(a2, I3);
                aVar2.R(x2);
            }
            TopBar$Middle.Cell.Middle.Text.Title.a.b bVar2 = (TopBar$Middle.Cell.Middle.Text.Title.a.b) x2;
            ((zak0) bVar2.a).setValue(a2);
            ((zak0) bVar2.b).setValue(I3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            bVar = bVar2;
        } else {
            if (aVar != null) {
                throw alb0.c(1531224983, aVar2);
            }
            aVar2.K(223751106);
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar;
    }

    public static TopBar$Middle.Text.c F(Middle.Text.b bVar, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1500509052, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.mapTextIcon (VkTopBar.kt:645)");
        }
        lg90 a2 = fko.a(bVar.a, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1126664713, 56, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Icon.Companion.invoke (TopBar.kt:1020)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new TopBar$Middle.Text.c(a2);
            aVar.R(x);
        }
        TopBar$Middle.Text.c cVar = (TopBar$Middle.Text.c) x;
        ((zak0) cVar.a).setValue(a2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cVar;
    }

    private final izs<com.vk.core.view.components.topbar.a, s3q0> getOnToolbarEvent() {
        return (izs) ((zak0) this.x).getValue();
    }

    private final void setOnToolbarEvent(izs<? super com.vk.core.view.components.topbar.a, s3q0> izsVar) {
        ((zak0) this.x).setValue(izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0e38  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x080d  */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.vk.core.compose.component.topbar.TopBar$Middle$Text$Title$a$b] */
    /* JADX WARN: Type inference failed for: r8v64, types: [com.vk.core.compose.component.topbar.TopBar$Before$a] */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.vk.core.compose.component.topbar.TopBar$Middle$Text$Title$a$b] */
    @Override // xsna.rpo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(int i2, androidx.compose.runtime.a aVar) {
        wep wepVar;
        Object obj;
        String str;
        String str2;
        int i3;
        int i4;
        char c2;
        TopBar$Middle gVar;
        int i5;
        char c3;
        gzs<s3q0> gzsVar;
        izs<tho0, s3q0> izsVar;
        char c4;
        tlh0.b bVar;
        char c5;
        wh50 wh50Var;
        gzs<s3q0> gzsVar2;
        tlh0 tlh0Var;
        tlh0 l2;
        boolean J;
        Object x;
        TopBar$Middle topBar$Middle;
        char c6;
        TopBar$Middle.Text.Title.a.C0754a c0754a;
        TopBar$Middle.Text.c F;
        TopBar$Middle.Text.Title.Size size;
        TopBar$Middle.Text.c F2;
        TopBar$Middle.Text.d dVar;
        lg90 lg90Var;
        long j2;
        String str3;
        Object obj2;
        TopBar$Middle.Text.a.b bVar2;
        Object x2;
        Object obj3;
        VkTopBar vkTopBar;
        i middleOverlay;
        e7p0 e7p0Var;
        e7p0 e7p0Var2;
        b back;
        boolean z;
        TopBar$Before.e eVar;
        char c7;
        c before;
        int i6;
        TopBar$Before topBar$Before;
        l5g l5gVar;
        Object obj4;
        String str4;
        f7p0 f7p0Var;
        Object obj5;
        Object obj6;
        l5g l5gVar2;
        m transitionHeaderColor;
        long j3;
        j initialMode;
        com.vk.core.compose.component.topbar.k kVar;
        h gradient;
        e7p0 e7p0Var3;
        long j4;
        ibu ibuVar;
        TopBar$Before.c cVar;
        l5g l5gVar3;
        TopBar$Middle.Text.Title.a.C0754a c0754a2;
        TopBar$Middle.Text.c F3;
        TopBar$Middle.Text.c F4;
        TopBar$Middle.Text.d dVar2;
        efj efjVar;
        ArrayList arrayList;
        wep wepVar2;
        z190 z190Var;
        SemanticsConfiguration semanticsConfiguration;
        TopBar$Middle.Cell.Middle.Text.Title.Overflow overflow;
        String str5;
        TopBar$Middle.Cell.Middle.Text.Title.Overflow overflow2;
        TopBar$Middle.Cell.Middle.Text.Title.a aVar2;
        TopBar$Middle.Cell.Middle.Text.Title.a aVar3;
        gzs<s3q0> gzsVar3;
        SemanticsConfiguration semanticsConfiguration2;
        boolean z2;
        TopBar$Middle.Cell.Middle.Text.b bVar3;
        q630 g2;
        androidx.compose.runtime.a aVar4 = aVar;
        aVar4.K(-1142115676);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1142115676, 8, -1, "com.vk.core.view.components.topbar.VkTopBar.ThemedContent (VkTopBar.kt:114)");
        }
        getContext();
        aVar4.K(-35936866);
        q630.a aVar5 = q630.a.a;
        q630 f2 = txj0.f(aVar5, 1.0f);
        r5j0 clipShape = getClipShape();
        q630 q630Var = (clipShape == null || (g2 = f2.g(rte0.d(aVar5, clipShape))) == null) ? f2 : g2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1560187634, 8, -1, "com.vk.core.view.components.topbar.VkTopBar.buildMiddle (VkTopBar.kt:463)");
        }
        Middle middle = getMiddle();
        boolean z3 = middle instanceof Middle.a;
        wep wepVar3 = wep.a;
        Object obj7 = a.C0011a.a;
        if (z3) {
            aVar4.K(-396724349);
            Middle.a aVar6 = (Middle.a) middle;
            com.vk.core.view.components.topbar.b bVar4 = aVar6.a;
            if (bVar4 == null) {
                throw alb0.c(-396724744, aVar4);
            }
            aVar4.K(-396721317);
            snx snxVar = bVar4.a;
            efj c8 = wnx.c(snxVar.a, aVar4);
            ArrayList a2 = wnx.a(snxVar.b, aVar4);
            wnx.b(aVar4);
            z190 d2 = wnx.d(null, aVar4);
            SemanticsConfiguration semanticsConfiguration3 = bVar4.b;
            SemanticsConfiguration semanticsConfiguration4 = semanticsConfiguration3 == null ? null : semanticsConfiguration3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1509761752, 1572864, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Left.Avatar.Companion.invoke (TopBar.kt:1231)");
            }
            Object x3 = aVar4.x();
            if (x3 == a.C0011a.a) {
                x3 = new TopBar$Middle.Cell.a.C0752a(c8, a2, wepVar3, d2, semanticsConfiguration4);
                efjVar = c8;
                arrayList = a2;
                wepVar2 = wepVar3;
                z190Var = d2;
                semanticsConfiguration = semanticsConfiguration4;
                aVar4.R(x3);
            } else {
                efjVar = c8;
                arrayList = a2;
                wepVar2 = wepVar3;
                z190Var = d2;
                semanticsConfiguration = semanticsConfiguration4;
            }
            TopBar$Middle.Cell.a.C0752a c0752a = (TopBar$Middle.Cell.a.C0752a) x3;
            ((zak0) c0752a.a).setValue(efjVar);
            ((zak0) c0752a.b).setValue(new wow(arrayList));
            ((zak0) c0752a.c).setValue(wepVar2);
            ((zak0) c0752a.d).setValue(z190Var);
            ((zak0) c0752a.f).setValue(semanticsConfiguration);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar4.j();
            VkTopBar$Middle$Cell$Middle$Text vkTopBar$Middle$Cell$Middle$Text = aVar6.b;
            if (vkTopBar$Middle$Cell$Middle$Text == null) {
                throw alb0.c(-396706689, aVar4);
            }
            aVar4.K(-396702952);
            VkTopBar$Middle$Cell$Middle$Text.Title title = vkTopBar$Middle$Cell$Middle$Text.a;
            String J2 = blk.J(title.a, aVar4);
            int i7 = n.$EnumSwitchMapping$1[title.b.ordinal()];
            if (i7 == 1) {
                overflow = TopBar$Middle.Cell.Middle.Text.Title.Overflow.None;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                overflow = TopBar$Middle.Cell.Middle.Text.Title.Overflow.Fade;
            }
            gzs<s3q0> gzsVar4 = title.c;
            TopBar$Middle.Cell.Middle.Text.Title.a E = E(title.d, aVar4, 64);
            TopBar$Middle.Cell.Middle.Text.Title.a E2 = E(title.e, aVar4, 64);
            SemanticsConfiguration semanticsConfiguration5 = title.f;
            if (semanticsConfiguration5 == null) {
                semanticsConfiguration5 = null;
            }
            if ((0 & 2) != 0) {
                overflow = TopBar$Middle.Cell.Middle.Text.Title.Overflow.None;
            }
            TopBar$Middle.Cell.Middle.Text.Title.Overflow overflow3 = overflow;
            TopBar$Middle.Cell.Middle.Text.Title.a aVar7 = (0 & 4) != 0 ? null : E;
            TopBar$Middle.Cell.Middle.Text.Title.a aVar8 = (0 & 8) != 0 ? null : E2;
            gzs<s3q0> gzsVar5 = (0 & 16) != 0 ? null : gzsVar4;
            SemanticsConfiguration semanticsConfiguration6 = (0 & 32) != 0 ? null : semanticsConfiguration5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(655251081, 1572864, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Title.Companion.invoke (TopBar.kt:1464)");
            }
            Object x4 = aVar4.x();
            if (x4 == a.C0011a.a) {
                x4 = new TopBar$Middle.Cell.Middle.Text.Title(J2, overflow3, aVar7, aVar8, gzsVar5, semanticsConfiguration6);
                str5 = J2;
                overflow2 = overflow3;
                aVar2 = aVar7;
                aVar3 = aVar8;
                gzsVar3 = gzsVar5;
                semanticsConfiguration2 = semanticsConfiguration6;
                aVar4.R(x4);
            } else {
                str5 = J2;
                overflow2 = overflow3;
                aVar2 = aVar7;
                aVar3 = aVar8;
                gzsVar3 = gzsVar5;
                semanticsConfiguration2 = semanticsConfiguration6;
            }
            TopBar$Middle.Cell.Middle.Text.Title title2 = (TopBar$Middle.Cell.Middle.Text.Title) x4;
            ((zak0) title2.a).setValue(str5);
            ((zak0) title2.b).setValue(overflow2);
            ((zak0) title2.c).setValue(aVar2);
            ((zak0) title2.d).setValue(aVar3);
            ((zak0) title2.e).setValue(gzsVar3);
            ((zak0) title2.f).setValue(semanticsConfiguration2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            VkTopBar$Middle$Cell$Middle$Text.a aVar9 = vkTopBar$Middle$Cell$Middle$Text.b;
            if (aVar9 == null) {
                aVar4.K(587705825);
                aVar4.j();
                bVar3 = null;
            } else {
                aVar4.K(587705826);
                String J3 = blk.J(aVar9.a, aVar4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1876674997, 384, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Subtitle.Companion.invoke (TopBar.kt:1510)");
                }
                Object x5 = aVar4.x();
                if (x5 == obj7) {
                    z2 = false;
                    x5 = new TopBar$Middle.Cell.Middle.Text.b(J3, null);
                    aVar4.R(x5);
                } else {
                    z2 = false;
                }
                bVar3 = (TopBar$Middle.Cell.Middle.Text.b) x5;
                ((zak0) bVar3.a).setValue(J3);
                ((zak0) bVar3.b).setValue(z2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
            }
            if ((0 & 2) != 0) {
                bVar3 = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1865213033, 3072, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Cell.Middle.Text.Companion.invoke (TopBar.kt:1523)");
            }
            Object x6 = aVar4.x();
            if (x6 == a.C0011a.a) {
                x6 = new TopBar$Middle.Cell.Middle.Text(title2, bVar3, null);
                aVar4.R(x6);
            }
            TopBar$Middle.Cell.Middle.Text text = (TopBar$Middle.Cell.Middle.Text) x6;
            ((zak0) text.a).setValue(title2);
            ((zak0) text.b).setValue(bVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar4.j();
            TopBar$Middle cell = new TopBar$Middle.Cell(c0752a, text);
            aVar4.j();
            gVar = cell;
            wepVar = wepVar2;
        } else {
            if (middle instanceof Middle.Text) {
                aVar4.K(-396667722);
                Middle.Text text2 = (Middle.Text) middle;
                Middle.Text.Title title3 = text2.a;
                String J4 = blk.J(title3.a, aVar4);
                gzs<s3q0> gzsVar6 = title3.b;
                Middle.Text.Title.a aVar10 = title3.c;
                if (aVar10 instanceof Middle.Text.Title.a.C0870a) {
                    aVar4.K(-396659006);
                    String I2 = blk.I(((Middle.Text.Title.a.C0870a) aVar10).a, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-833897760, 48, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Dropdown.Companion.invoke (TopBar.kt:721)");
                    }
                    Object x7 = aVar4.x();
                    if (x7 == obj7) {
                        x7 = new TopBar$Middle.Text.Title.a.C0754a(I2);
                        aVar4.R(x7);
                    }
                    c0754a = (TopBar$Middle.Text.Title.a.C0754a) x7;
                    ((zak0) c0754a.a).setValue(I2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    c6 = 384;
                } else if (aVar10 instanceof Middle.Text.Title.a.b) {
                    aVar4.K(-396653111);
                    Middle.Text.Title.a.b bVar5 = (Middle.Text.Title.a.b) aVar10;
                    TopBar$Middle.Text.c F5 = F(bVar5.a, aVar4, 64);
                    Middle.Text.b bVar6 = bVar5.b;
                    if (bVar6 == null) {
                        aVar4.K(588760476);
                        aVar4.j();
                        F = null;
                    } else {
                        aVar4.K(588760477);
                        F = F(bVar6, aVar4, 64);
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        c6 = 384;
                        androidx.compose.runtime.b.f(95732109, 384, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Icons.Companion.invoke (TopBar.kt:753)");
                    } else {
                        c6 = 384;
                    }
                    Object x8 = aVar4.x();
                    if (x8 == obj7) {
                        x8 = new TopBar$Middle.Text.Title.a.b(F5, F);
                        aVar4.R(x8);
                    }
                    ?? r9 = (TopBar$Middle.Text.Title.a.b) x8;
                    ((zak0) r9.a).setValue(F5);
                    ((zak0) r9.b).setValue(F);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    c0754a = r9;
                } else {
                    c6 = 384;
                    if (aVar10 != null) {
                        throw alb0.c(-396663010, aVar4);
                    }
                    aVar4.K(588834287);
                    aVar4.j();
                    c0754a = null;
                }
                int i8 = n.$EnumSwitchMapping$0[title3.d.ordinal()];
                if (i8 == 1) {
                    size = TopBar$Middle.Text.Title.Size.Small;
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    size = TopBar$Middle.Text.Title.Size.Medium;
                }
                SemanticsConfiguration semanticsConfiguration7 = title3.e;
                if (semanticsConfiguration7 == null) {
                    semanticsConfiguration7 = null;
                }
                wepVar = wepVar3;
                TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a(J4, c0754a, size, gzsVar6, semanticsConfiguration7, aVar4, 196608, 0);
                setTitleRect(a3.d());
                Middle.Text.c cVar2 = text2.b;
                if (cVar2 == null) {
                    aVar4.K(589322134);
                    aVar4.j();
                    dVar = null;
                } else {
                    aVar4.K(589322135);
                    String J5 = blk.J(cVar2.a, aVar4);
                    int i9 = cVar2.b;
                    int i10 = cVar2.c;
                    Middle.Text.b bVar7 = cVar2.d;
                    if (bVar7 == null) {
                        aVar4.K(100948757);
                        aVar4.j();
                        F2 = null;
                    } else {
                        aVar4.K(100948758);
                        F2 = F(bVar7, aVar4, 64);
                        aVar4.j();
                    }
                    SemanticsConfiguration semanticsConfiguration8 = cVar2.e;
                    TopBar$Middle.Text.d a4 = TopBar$Middle.Text.d.a.a(J5, i9, i10, F2, semanticsConfiguration8 == null ? null : semanticsConfiguration8, aVar4, 196608, 0);
                    aVar4.j();
                    dVar = a4;
                }
                Middle.Text.a aVar11 = text2.c;
                if (aVar11 == null) {
                    aVar4.K(589758614);
                    aVar4.j();
                    bVar2 = null;
                } else {
                    aVar4.K(589758615);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(370693527, 64, -1, "com.vk.core.view.components.topbar.VkTopBar.buildMiddleTextBefore (VkTopBar.kt:685)");
                    }
                    aVar4.K(-245801622);
                    if (!(aVar11 instanceof Middle.Text.a.b)) {
                        if (!(aVar11 instanceof Middle.Text.a.C0871a)) {
                            throw alb0.c(333611665, aVar4);
                        }
                        aVar4.K(333625419);
                        throw null;
                    }
                    aVar4.K(333614092);
                    lg90 a5 = fko.a(null, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1834197360, 0, -1, "com.vk.core.view.interop.ext.toComposeColorOrNull (ColorSourceExt.kt:13)");
                    }
                    if (oq.h(1999695873, aVar4)) {
                        androidx.compose.runtime.b.e();
                    }
                    long j5 = l5g.k;
                    String I3 = blk.I(null, aVar4);
                    if ((0 & 2) != 0) {
                        j5 = l5g.k;
                    }
                    long j6 = j5;
                    if ((0 & 4) != 0) {
                        I3 = null;
                    }
                    String str6 = I3;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2005695883, 24584, -1, "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Before.Icon.Companion.invoke (TopBar.kt:919)");
                    }
                    Object x9 = aVar4.x();
                    if (x9 == a.C0011a.a) {
                        x9 = new TopBar$Middle.Text.a.b(a5, j6, str6, null);
                        lg90Var = a5;
                        j2 = j6;
                        str3 = str6;
                        obj2 = null;
                        aVar4.R(x9);
                    } else {
                        lg90Var = a5;
                        j2 = j6;
                        str3 = str6;
                        obj2 = null;
                    }
                    TopBar$Middle.Text.a.b bVar8 = (TopBar$Middle.Text.a.b) x9;
                    ((zak0) bVar8.a).setValue(lg90Var);
                    ((zak0) bVar8.b).setValue(new l5g(j2));
                    ((zak0) bVar8.c).setValue(str3);
                    ((zak0) bVar8.d).setValue(obj2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    bVar2 = bVar8;
                }
                SemanticsConfiguration semanticsConfiguration9 = text2.d;
                topBar$Middle = TopBar$Middle.Text.b.a(a3, dVar, bVar2, semanticsConfiguration9 == null ? null : semanticsConfiguration9, aVar, 0);
                aVar4 = aVar;
                aVar4.j();
            } else {
                wepVar = wepVar3;
                if (!(middle instanceof Middle.c)) {
                    if (middle instanceof Middle.d) {
                        aVar4.K(-396609851);
                        Middle.d dVar3 = (Middle.d) middle;
                        if (androidx.compose.runtime.b.d()) {
                            i5 = 64;
                            c3 = 65535;
                            androidx.compose.runtime.b.f(-1165756448, 64, -1, "com.vk.core.view.components.topbar.VkTopBar.mapMiddleSearch (VkTopBar.kt:560)");
                        } else {
                            i5 = 64;
                            c3 = 65535;
                        }
                        tho0 tho0Var = dVar3.b;
                        Middle.d.a aVar12 = dVar3.j;
                        Middle.d.b bVar9 = dVar3.i;
                        boolean z4 = dVar3.c;
                        String str7 = dVar3.a;
                        boolean J6 = aVar4.J(tho0Var);
                        Object x10 = aVar4.x();
                        if (J6 || x10 == obj7) {
                            x10 = androidx.compose.runtime.k.b(dVar3.b);
                            aVar4.R(x10);
                        }
                        wh50 wh50Var2 = (wh50) x10;
                        boolean J7 = aVar4.J(str7);
                        Object x11 = aVar4.x();
                        if (J7 || x11 == obj7) {
                            x11 = androidx.compose.runtime.k.b(str7);
                            aVar4.R(x11);
                        }
                        wh50 wh50Var3 = (wh50) x11;
                        boolean l3 = aVar4.l(z4);
                        Object x12 = aVar4.x();
                        if (l3 || x12 == obj7) {
                            x12 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z4, aVar4);
                        }
                        wh50 wh50Var4 = (wh50) x12;
                        boolean J8 = aVar4.J(bVar9);
                        Object x13 = aVar4.x();
                        if (J8 || x13 == obj7) {
                            x13 = androidx.compose.runtime.k.b(bVar9);
                            aVar4.R(x13);
                        }
                        wh50 wh50Var5 = (wh50) x13;
                        boolean J9 = aVar4.J(aVar12);
                        Object x14 = aVar4.x();
                        if (J9 || x14 == obj7) {
                            x14 = androidx.compose.runtime.k.b(aVar12);
                            aVar4.R(x14);
                        }
                        wh50 wh50Var6 = (wh50) x14;
                        sg50 sg50Var = dVar3.k;
                        boolean J10 = aVar4.J(dVar3) | aVar4.J(wh50Var2);
                        Object x15 = aVar4.x();
                        if (J10 || x15 == obj7) {
                            x15 = new com.vk.core.view.components.topbar.e(dVar3, wh50Var2, null);
                            aVar4.R(x15);
                        }
                        bap.g(sg50Var, (wzs) x15, aVar4, 0);
                        String str8 = (String) wh50Var3.getValue();
                        tho0 tho0Var2 = (tho0) wh50Var2.getValue();
                        boolean booleanValue = ((Boolean) wh50Var4.getValue()).booleanValue();
                        gzs<s3q0> gzsVar7 = dVar3.g;
                        gzs<s3q0> gzsVar8 = dVar3.f;
                        izs<tho0, s3q0> izsVar2 = dVar3.h;
                        int i11 = i5;
                        izs<Boolean, s3q0> izsVar3 = dVar3.d;
                        SemanticsConfiguration semanticsConfiguration10 = dVar3.l;
                        SemanticsConfiguration semanticsConfiguration11 = semanticsConfiguration10 == null ? null : semanticsConfiguration10;
                        Middle.d.b bVar10 = (Middle.d.b) wh50Var5.getValue();
                        if (bVar10 instanceof Middle.d.b.C0874b) {
                            aVar4.K(694564583);
                            Middle.d.b.C0874b c0874b = (Middle.d.b.C0874b) bVar10;
                            gzsVar = gzsVar8;
                            izsVar = izsVar2;
                            tlh0.b a6 = vlh0.a(3072, 4, aVar, null, c0874b.a, c0874b.b);
                            aVar4 = aVar;
                            aVar4.j();
                            bVar = a6;
                            c4 = 4;
                        } else {
                            gzsVar = gzsVar8;
                            izsVar = izsVar2;
                            if (bVar10 instanceof Middle.d.b.a) {
                                aVar4.K(694571812);
                                ((Middle.d.b.a) bVar10).getClass();
                                c4 = 4;
                                tlh0.b a7 = ulh0.a(null, aVar4, 4);
                                aVar4.j();
                                bVar = a7;
                            } else {
                                c4 = 4;
                                aVar4.K(57042461);
                                aVar4.j();
                                bVar = null;
                            }
                        }
                        Middle.d.a aVar13 = (Middle.d.a) wh50Var6.getValue();
                        if (aVar13 instanceof Middle.d.a.C0872a) {
                            aVar4.K(694581502);
                            ((Middle.d.a.C0872a) aVar13).getClass();
                            c5 = 3072;
                            l2 = fsk.v(null, null, aVar4, 3072, 5);
                            aVar4.j();
                        } else {
                            c5 = 3072;
                            if (aVar13 instanceof Middle.d.a.b) {
                                aVar4.K(694585119);
                                l2 = mnh0.l(((Middle.d.a.b) aVar13).a, aVar4, 11);
                                aVar4.j();
                            } else {
                                if (aVar13 instanceof Middle.d.a.c) {
                                    aVar4.K(694588790);
                                    ((Middle.d.a.c) aVar13).getClass();
                                    c2 = c4;
                                    gzsVar2 = gzsVar7;
                                    wh50Var = wh50Var2;
                                    gkg0 e2 = lmc.e(fko.a(null, aVar4), 0L, null, null, null, aVar, 22);
                                    aVar4 = aVar;
                                    aVar4.j();
                                    tlh0Var = e2;
                                } else {
                                    c2 = c4;
                                    wh50Var = wh50Var2;
                                    gzsVar2 = gzsVar7;
                                    if (aVar13 instanceof Middle.d.a.C0873d) {
                                        aVar4.K(694594322);
                                        Middle.d.a.C0873d c0873d = (Middle.d.a.C0873d) aVar13;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1348977052, i11, -1, "com.vk.core.view.components.topbar.VkTopBar.resolvePair (VkTopBar.kt:618)");
                                        }
                                        c0873d.getClass();
                                        aVar4.K(-713171850);
                                        aVar4.j();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar4.K(57629725);
                                    aVar4.j();
                                    tlh0Var = null;
                                }
                                if (tlh0Var != null) {
                                    setSearchRightIconRect(tlh0Var.d());
                                }
                                J = aVar4.J(wh50Var) | aVar4.J(dVar3);
                                x = aVar4.x();
                                if (!J || x == obj7) {
                                    x = new csk0(5, dVar3, wh50Var);
                                    aVar4.R(x);
                                }
                                str2 = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Dropdown.Companion.invoke (TopBar.kt:721)";
                                obj = obj7;
                                str = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Icons.Companion.invoke (TopBar.kt:753)";
                                i3 = i11;
                                androidx.compose.runtime.a aVar14 = aVar4;
                                TopBar$Middle a8 = TopBar$Middle.b.a.a(str8, tho0Var2, (izs) x, bVar, tlh0Var, gzsVar2, izsVar, gzsVar, semanticsConfiguration11, booleanValue, izsVar3, false, aVar14, 0, 384, 2048);
                                aVar4 = aVar14;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar4.j();
                                gVar = a8;
                                i4 = -1;
                            }
                        }
                        c2 = c4;
                        tlh0Var = l2;
                        wh50Var = wh50Var2;
                        gzsVar2 = gzsVar7;
                        if (tlh0Var != null) {
                        }
                        J = aVar4.J(wh50Var) | aVar4.J(dVar3);
                        x = aVar4.x();
                        if (!J) {
                        }
                        x = new csk0(5, dVar3, wh50Var);
                        aVar4.R(x);
                        str2 = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Dropdown.Companion.invoke (TopBar.kt:721)";
                        obj = obj7;
                        str = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Icons.Companion.invoke (TopBar.kt:753)";
                        i3 = i11;
                        androidx.compose.runtime.a aVar142 = aVar4;
                        TopBar$Middle a82 = TopBar$Middle.b.a.a(str8, tho0Var2, (izs) x, bVar, tlh0Var, gzsVar2, izsVar, gzsVar, semanticsConfiguration11, booleanValue, izsVar3, false, aVar142, 0, 384, 2048);
                        aVar4 = aVar142;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        aVar4.j();
                        gVar = a82;
                        i4 = -1;
                    } else {
                        obj = obj7;
                        str = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Icons.Companion.invoke (TopBar.kt:753)";
                        str2 = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Dropdown.Companion.invoke (TopBar.kt:721)";
                        i3 = 64;
                        i4 = -1;
                        c2 = 4;
                        if (!(middle instanceof Middle.b)) {
                            throw alb0.c(-396724766, aVar4);
                        }
                        aVar4.K(-396607902);
                        aVar4.j();
                        gVar = new g((Middle.b) middle);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean showBottomDivider = getShowBottomDivider();
                    x2 = aVar4.x();
                    obj3 = obj;
                    if (x2 != obj3) {
                        vkTopBar = this;
                        x2 = bbk0.b(new y3l0(vkTopBar, 28));
                        aVar4.R(x2);
                    } else {
                        vkTopBar = this;
                    }
                    mtk0 mtk0Var = (mtk0) x2;
                    if (!androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1084156410, 8, i4, "com.vk.core.view.components.topbar.VkTopBar.buildMiddleOverlay (VkTopBar.kt:427)");
                    }
                    middleOverlay = vkTopBar.getMiddleOverlay();
                    if (!(middleOverlay instanceof Middle.Text)) {
                        aVar4.K(-1802736946);
                        Middle.Text text3 = (Middle.Text) middleOverlay;
                        Middle.Text.Title title4 = text3.a;
                        String J11 = blk.J(title4.a, aVar4);
                        gzs<s3q0> gzsVar9 = title4.b;
                        Middle.Text.Title.a aVar15 = title4.c;
                        if (aVar15 instanceof Middle.Text.Title.a.C0870a) {
                            aVar4.K(-1802727186);
                            String I4 = blk.I(((Middle.Text.Title.a.C0870a) aVar15).a, aVar4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-833897760, 48, i4, str2);
                            }
                            Object x16 = aVar4.x();
                            if (x16 == obj3) {
                                x16 = new TopBar$Middle.Text.Title.a.C0754a(I4);
                                aVar4.R(x16);
                            }
                            c0754a2 = (TopBar$Middle.Text.Title.a.C0754a) x16;
                            ((zak0) c0754a2.a).setValue(I4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                        } else if (aVar15 instanceof Middle.Text.Title.a.b) {
                            aVar4.K(-1802721291);
                            Middle.Text.Title.a.b bVar11 = (Middle.Text.Title.a.b) aVar15;
                            TopBar$Middle.Text.c F6 = F(bVar11.a, aVar4, i3);
                            Middle.Text.b bVar12 = bVar11.b;
                            if (bVar12 == null) {
                                aVar4.K(-49680144);
                                aVar4.j();
                                F3 = null;
                            } else {
                                aVar4.K(-49680143);
                                F3 = F(bVar12, aVar4, i3);
                                aVar4.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(95732109, 384, i4, str);
                            }
                            Object x17 = aVar4.x();
                            if (x17 == obj3) {
                                x17 = new TopBar$Middle.Text.Title.a.b(F6, F3);
                                aVar4.R(x17);
                            }
                            ?? r0 = (TopBar$Middle.Text.Title.a.b) x17;
                            ((zak0) r0.a).setValue(F6);
                            ((zak0) r0.b).setValue(F3);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar4.j();
                            c0754a2 = r0;
                        } else {
                            if (aVar15 != null) {
                                throw alb0.c(-1802731407, aVar4);
                            }
                            aVar4.K(-49606333);
                            aVar4.j();
                            c0754a2 = null;
                        }
                        SemanticsConfiguration semanticsConfiguration12 = title4.e;
                        TopBar$Middle.Text.Title a9 = TopBar$Middle.Text.Title.b.a(J11, c0754a2, null, gzsVar9, semanticsConfiguration12 == null ? null : semanticsConfiguration12, aVar4, 196608, 4);
                        Middle.Text.c cVar3 = text3.b;
                        if (cVar3 == null) {
                            aVar4.K(-49418070);
                            aVar4.j();
                            dVar2 = null;
                        } else {
                            aVar4.K(-49418069);
                            String J12 = blk.J(cVar3.a, aVar4);
                            int i12 = cVar3.b;
                            int i13 = cVar3.c;
                            Middle.Text.b bVar13 = cVar3.d;
                            if (bVar13 == null) {
                                aVar4.K(-1823920320);
                                aVar4.j();
                                F4 = null;
                            } else {
                                aVar4.K(-1823920319);
                                F4 = F(bVar13, aVar4, 64);
                                aVar4.j();
                            }
                            SemanticsConfiguration semanticsConfiguration13 = cVar3.e;
                            TopBar$Middle.Text.d a10 = TopBar$Middle.Text.d.a.a(J12, i12, i13, F4, semanticsConfiguration13 == null ? null : semanticsConfiguration13, aVar4, 196608, 0);
                            aVar.j();
                            dVar2 = a10;
                        }
                        SemanticsConfiguration semanticsConfiguration14 = text3.d;
                        e7p0Var2 = TopBar$Middle.Text.b.a(a9, dVar2, null, semanticsConfiguration14 == null ? null : semanticsConfiguration14, aVar, 4);
                        aVar4 = aVar;
                        aVar4.j();
                    } else {
                        if (!(middleOverlay instanceof Middle.c)) {
                            if (middleOverlay != null) {
                                throw alb0.c(-1802739714, aVar4);
                            }
                            aVar4.K(-48855389);
                            aVar4.j();
                            e7p0Var = null;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2117424618, 8, i4, "com.vk.core.view.components.topbar.VkTopBar.buildBack (VkTopBar.kt:350)");
                            }
                            back = vkTopBar.getBack();
                            if (back != null) {
                                aVar4.K(12228972);
                                String I5 = blk.I(back.b, aVar4);
                                ipi ipiVar = back.d;
                                if (ipiVar == null) {
                                    aVar4.K(12328295);
                                    aVar4.j();
                                    l5gVar3 = null;
                                    z = false;
                                } else {
                                    aVar4.K(-969433638);
                                    z = false;
                                    long a11 = ipiVar.a(0, aVar4);
                                    aVar4.j();
                                    l5gVar3 = new l5g(a11);
                                }
                                f7p0 D = vkTopBar.D(back.c, aVar4, 64);
                                gzs<s3q0> gzsVar10 = back.a;
                                SemanticsConfiguration semanticsConfiguration15 = back.e;
                                if (semanticsConfiguration15 == null) {
                                    semanticsConfiguration15 = null;
                                }
                                TopBar$Before.e a12 = e.a.a(gzsVar10, I5, D, l5gVar3, semanticsConfiguration15, aVar4, 196608, 0);
                                aVar4.j();
                                eVar = a12;
                            } else {
                                z = false;
                                aVar4.K(12535251);
                                aVar4.j();
                                eVar = null;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                c7 = '\b';
                                androidx.compose.runtime.b.f(-2050530510, 8, i4, "com.vk.core.view.components.topbar.VkTopBar.buildLeft (VkTopBar.kt:364)");
                            } else {
                                c7 = '\b';
                            }
                            before = vkTopBar.getBefore();
                            if (before instanceof c.a) {
                                aVar4.K(830187739);
                                c.a aVar16 = (c.a) before;
                                snx snxVar2 = aVar16.a;
                                efj c9 = wnx.c(snxVar2.a, aVar4);
                                ArrayList a13 = wnx.a(snxVar2.b, aVar4);
                                wnx.b(aVar4);
                                z190 d3 = wnx.d(null, aVar4);
                                pco pcoVar = aVar16.c;
                                gzs<s3q0> gzsVar11 = aVar16.b;
                                gzs<s3q0> gzsVar12 = aVar16.d;
                                SemanticsConfiguration semanticsConfiguration16 = aVar16.e;
                                if (semanticsConfiguration16 == null) {
                                    semanticsConfiguration16 = null;
                                }
                                ?? a14 = TopBar$Before.a.C0750a.a(c9, a13, pcoVar, wepVar, d3, gzsVar11, gzsVar12, semanticsConfiguration16, aVar, 100663296);
                                aVar4 = aVar;
                                vkTopBar.setLeftAvatarRect(a14.d());
                                aVar4.j();
                                cVar = a14;
                            } else {
                                if (!(before instanceof c.C0880c)) {
                                    if (before instanceof c.d) {
                                        aVar4.K(-33528506);
                                        c.d dVar4 = (c.d) before;
                                        String I6 = blk.I(dVar4.a, aVar4);
                                        ipi ipiVar2 = dVar4.c;
                                        if (ipiVar2 == null) {
                                            aVar4.K(-33418209);
                                            aVar4.j();
                                            l5gVar2 = null;
                                            i6 = 0;
                                        } else {
                                            aVar4.K(830205986);
                                            i6 = 0;
                                            long a15 = ipiVar2.a(0, aVar4);
                                            aVar4.j();
                                            l5gVar2 = new l5g(a15);
                                        }
                                        gzs<s3q0> gzsVar13 = dVar4.b;
                                        SemanticsConfiguration semanticsConfiguration17 = dVar4.d;
                                        if (semanticsConfiguration17 == null) {
                                            semanticsConfiguration17 = null;
                                        }
                                        TopBar$Before a16 = TopBar$Before.d.a.a(I6, gzsVar13, l5gVar2, semanticsConfiguration17, aVar, 24576, 0);
                                        aVar4 = aVar;
                                        aVar4.j();
                                        topBar$Before = a16;
                                    } else {
                                        i6 = 0;
                                        if (before instanceof c.g) {
                                            aVar4.K(830212870);
                                            ((c.g) before).getClass();
                                            String I7 = blk.I(null, aVar4);
                                            f7p0 D2 = vkTopBar.D(null, aVar4, 64);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1394383625, 196608, -1, "com.vk.core.compose.component.topbar.TopBar.Before.LegoIcon.Companion.invoke (TopBar.kt:388)");
                                            }
                                            Object x18 = aVar4.x();
                                            if (x18 == obj3) {
                                                x18 = new TopBar$Before.f(null, I7, D2, null, null);
                                                obj4 = null;
                                                str4 = I7;
                                                f7p0Var = D2;
                                                obj5 = null;
                                                obj6 = null;
                                                aVar4.R(x18);
                                            } else {
                                                obj4 = null;
                                                str4 = I7;
                                                f7p0Var = D2;
                                                obj5 = null;
                                                obj6 = null;
                                            }
                                            TopBar$Before.f fVar = (TopBar$Before.f) x18;
                                            ((zak0) fVar.c).setValue(obj4);
                                            ((zak0) fVar.e).setValue(str4);
                                            ((zak0) fVar.d).setValue(f7p0Var);
                                            ((zak0) fVar.f).setValue(obj5);
                                            ((zak0) fVar.g).setValue(obj6);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            aVar4.j();
                                            topBar$Before = fVar;
                                        } else if (before instanceof c.f) {
                                            aVar4.K(830236469);
                                            c.f fVar2 = (c.f) before;
                                            lg90 a17 = fko.a(fVar2.a, aVar4);
                                            f7p0 D3 = vkTopBar.D(null, aVar4, 64);
                                            String I8 = blk.I(fVar2.b, aVar4);
                                            ipi ipiVar3 = fVar2.d;
                                            if (ipiVar3 == null) {
                                                aVar4.K(-32624609);
                                                aVar4.j();
                                                l5gVar = null;
                                            } else {
                                                aVar4.K(830231586);
                                                long a18 = ipiVar3.a(0, aVar4);
                                                aVar4.j();
                                                l5gVar = new l5g(a18);
                                            }
                                            gzs<s3q0> gzsVar14 = fVar2.c;
                                            SemanticsConfiguration semanticsConfiguration18 = fVar2.e;
                                            if (semanticsConfiguration18 == null) {
                                                semanticsConfiguration18 = null;
                                            }
                                            androidx.compose.runtime.a aVar17 = aVar4;
                                            TopBar$Before.e a19 = TopBar$Before.e.a.a(a17, I8, gzsVar14, D3, l5gVar, semanticsConfiguration18, aVar17, 1572872, 0);
                                            aVar4 = aVar17;
                                            vkTopBar.setLeftBeforeIconRect(a19.d());
                                            izs<com.vk.core.view.components.topbar.a, s3q0> onToolbarEvent = vkTopBar.getOnToolbarEvent();
                                            if (onToolbarEvent != null) {
                                                onToolbarEvent.invoke(new a.b.C0883a(a19.d()));
                                            }
                                            aVar4.j();
                                            topBar$Before = a19;
                                        } else if (before instanceof c.b) {
                                            aVar4.K(830243611);
                                            ((c.b) before).getClass();
                                            String J13 = blk.J(null, aVar4);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1454851285, 196608, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Button.Companion.invoke (TopBar.kt:504)");
                                            }
                                            Object x19 = aVar4.x();
                                            if (x19 == obj3) {
                                                x19 = com.vk.core.compose.component.topbar.f.b;
                                                aVar4.R(x19);
                                            }
                                            aVar4 = aVar;
                                            TopBar$Before topBar$Before2 = (TopBar$Before.b) fai.D(J13, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, (izs) ((fcy) x19), aVar, 196608);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            aVar4.j();
                                            topBar$Before = topBar$Before2;
                                        } else if (before instanceof c.e) {
                                            aVar4.K(830253220);
                                            aVar4.j();
                                            topBar$Before = new f((c.e) before);
                                        } else {
                                            if (before != null) {
                                                throw alb0.c(830172997, aVar4);
                                            }
                                            aVar4.K(-31914709);
                                            aVar4.j();
                                            topBar$Before = null;
                                        }
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    com.vk.core.compose.component.topbar.a C = vkTopBar.C(aVar4);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(31072088, 8, -1, "com.vk.core.view.components.topbar.VkTopBar.buildTransitionHeaderColor (VkTopBar.kt:652)");
                                    }
                                    transitionHeaderColor = vkTopBar.getTransitionHeaderColor();
                                    if (!(transitionHeaderColor instanceof m.a)) {
                                        aVar4.K(-204489016);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, i6, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j3 = ylu0Var.getHeader().a;
                                        aVar4.j();
                                    } else {
                                        if (!(transitionHeaderColor instanceof m.b)) {
                                            throw alb0.c(-204492170, aVar4);
                                        }
                                        aVar4.K(-204485821);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, i6, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j3 = ylu0Var2.d().a;
                                        aVar4.j();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    initialMode = vkTopBar.getInitialMode();
                                    if (!(initialMode instanceof j.a)) {
                                        kVar = k.b.a;
                                    } else if (initialMode instanceof com.vk.core.view.components.topbar.c) {
                                        kVar = k.a.C0761a.a;
                                    } else {
                                        if (!(initialMode instanceof com.vk.core.view.components.topbar.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        kVar = k.a.b.a;
                                    }
                                    gradient = vkTopBar.getGradient();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1717727144, 64, -1, "com.vk.core.view.components.topbar.VkTopBar.buildGradient (VkTopBar.kt:658)");
                                    }
                                    if (gradient != null) {
                                        aVar4.K(-1725857773);
                                        aVar4.j();
                                        e7p0Var3 = e7p0Var;
                                        j4 = j3;
                                        ibuVar = null;
                                    } else {
                                        aVar4.K(-1725857772);
                                        if (gradient instanceof h.a) {
                                            aVar4.K(839896941);
                                            float y = vua0.y(((h.a) gradient).a, aVar4);
                                            aVar4.K(840066758);
                                            aVar4.j();
                                            float f3 = m7p0.b;
                                            float f4 = v590.a;
                                            if ((c2 & 2) != 0) {
                                                f3 = m7p0.b;
                                            }
                                            if ((c2 & 4) != 0) {
                                                f4 = 0;
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                e7p0Var3 = e7p0Var;
                                                j4 = j3;
                                                androidx.compose.runtime.b.f(-1410800582, 3072, -1, "com.vk.core.compose.component.topbar.TopBar.Gradient.Companion.invoke (TopBar.kt:2116)");
                                            } else {
                                                e7p0Var3 = e7p0Var;
                                                j4 = j3;
                                            }
                                            Object x20 = aVar4.x();
                                            if (x20 == a.C0011a.a) {
                                                x20 = new ibu(y, f3, f4);
                                                aVar4.R(x20);
                                            }
                                            ibuVar = (ibu) x20;
                                            ((zak0) ibuVar.b).setValue(new pco(y));
                                            ((zak0) ibuVar.c).setValue(new pco(f3));
                                            ((zak0) ibuVar.d).setValue(new pco(f4));
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            aVar4.j();
                                        } else {
                                            e7p0Var3 = e7p0Var;
                                            j4 = j3;
                                            aVar4.K(840198571);
                                            aVar4.j();
                                            ibuVar = null;
                                        }
                                        aVar4.j();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    androidx.compose.runtime.a aVar18 = aVar4;
                                    muv0.h(gVar, q630Var, kVar, e7p0Var3, eVar, topBar$Before, C, kai.c(804248496, new ze4(vkTopBar, 7), aVar4), showBottomDivider, j4, mtk0Var, ibuVar, vkTopBar.getSlotAlpha(), aVar18, 12582912, 6, 0);
                                    aVar18.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar18.j();
                                }
                                aVar4.K(-33848922);
                                ((c.C0880c) before).getClass();
                                String I9 = blk.I(null, aVar4);
                                aVar4.K(-33738625);
                                aVar4.j();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-637461270, 24576, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Camera.Companion.invoke (TopBar.kt:479)");
                                }
                                Object x21 = aVar4.x();
                                if (x21 == obj3) {
                                    x21 = new TopBar$Before.c(I9);
                                    aVar4.R(x21);
                                }
                                TopBar$Before.c cVar4 = (TopBar$Before.c) x21;
                                ((zak0) cVar4.c).setValue(I9);
                                ((zak0) cVar4.e).setValue(null);
                                ((zak0) cVar4.d).setValue(null);
                                ((zak0) cVar4.f).setValue(null);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar4.j();
                                cVar = cVar4;
                            }
                            i6 = 0;
                            topBar$Before = cVar;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            com.vk.core.compose.component.topbar.a C2 = vkTopBar.C(aVar4);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            transitionHeaderColor = vkTopBar.getTransitionHeaderColor();
                            if (!(transitionHeaderColor instanceof m.a)) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            initialMode = vkTopBar.getInitialMode();
                            if (!(initialMode instanceof j.a)) {
                            }
                            gradient = vkTopBar.getGradient();
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (gradient != null) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            androidx.compose.runtime.a aVar182 = aVar4;
                            muv0.h(gVar, q630Var, kVar, e7p0Var3, eVar, topBar$Before, C2, kai.c(804248496, new ze4(vkTopBar, 7), aVar4), showBottomDivider, j4, mtk0Var, ibuVar, vkTopBar.getSlotAlpha(), aVar182, 12582912, 6, 0);
                            aVar182.j();
                            if (androidx.compose.runtime.b.d()) {
                            }
                            aVar182.j();
                        }
                        aVar4.K(-1802692435);
                        aVar4.j();
                        e7p0Var2 = TopBar$Middle.a.c;
                    }
                    e7p0Var = e7p0Var2;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    back = vkTopBar.getBack();
                    if (back != null) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    before = vkTopBar.getBefore();
                    if (before instanceof c.a) {
                    }
                    i6 = 0;
                    topBar$Before = cVar;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    com.vk.core.compose.component.topbar.a C22 = vkTopBar.C(aVar4);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    transitionHeaderColor = vkTopBar.getTransitionHeaderColor();
                    if (!(transitionHeaderColor instanceof m.a)) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    initialMode = vkTopBar.getInitialMode();
                    if (!(initialMode instanceof j.a)) {
                    }
                    gradient = vkTopBar.getGradient();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (gradient != null) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    androidx.compose.runtime.a aVar1822 = aVar4;
                    muv0.h(gVar, q630Var, kVar, e7p0Var3, eVar, topBar$Before, C22, kai.c(804248496, new ze4(vkTopBar, 7), aVar4), showBottomDivider, j4, mtk0Var, ibuVar, vkTopBar.getSlotAlpha(), aVar1822, 12582912, 6, 0);
                    aVar1822.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    aVar1822.j();
                }
                aVar4.K(-396611679);
                aVar4.j();
                topBar$Middle = TopBar$Middle.a.c;
            }
            gVar = topBar$Middle;
        }
        obj = obj7;
        str = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Icons.Companion.invoke (TopBar.kt:753)";
        str2 = "com.vk.core.compose.component.topbar.TopBar.Middle.Text.Title.Along.Dropdown.Companion.invoke (TopBar.kt:721)";
        i3 = 64;
        i4 = -1;
        c2 = 4;
        if (androidx.compose.runtime.b.d()) {
        }
        boolean showBottomDivider2 = getShowBottomDivider();
        x2 = aVar4.x();
        obj3 = obj;
        if (x2 != obj3) {
        }
        mtk0 mtk0Var2 = (mtk0) x2;
        if (!androidx.compose.runtime.b.d()) {
        }
        middleOverlay = vkTopBar.getMiddleOverlay();
        if (!(middleOverlay instanceof Middle.Text)) {
        }
        e7p0Var = e7p0Var2;
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        back = vkTopBar.getBack();
        if (back != null) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        before = vkTopBar.getBefore();
        if (before instanceof c.a) {
        }
        i6 = 0;
        topBar$Before = cVar;
        if (androidx.compose.runtime.b.d()) {
        }
        com.vk.core.compose.component.topbar.a C222 = vkTopBar.C(aVar4);
        if (androidx.compose.runtime.b.d()) {
        }
        transitionHeaderColor = vkTopBar.getTransitionHeaderColor();
        if (!(transitionHeaderColor instanceof m.a)) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        initialMode = vkTopBar.getInitialMode();
        if (!(initialMode instanceof j.a)) {
        }
        gradient = vkTopBar.getGradient();
        if (androidx.compose.runtime.b.d()) {
        }
        if (gradient != null) {
        }
        if (androidx.compose.runtime.b.d()) {
        }
        androidx.compose.runtime.a aVar18222 = aVar4;
        muv0.h(gVar, q630Var, kVar, e7p0Var3, eVar, topBar$Before, C222, kai.c(804248496, new ze4(vkTopBar, 7), aVar4), showBottomDivider2, j4, mtk0Var2, ibuVar, vkTopBar.getSlotAlpha(), aVar18222, 12582912, 6, 0);
        aVar18222.j();
        if (androidx.compose.runtime.b.d()) {
        }
        aVar18222.j();
    }

    public final d.b B(a.b bVar, androidx.compose.runtime.a aVar, int i2) {
        l5g l5gVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2126022234, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.buildExtra (VkTopBar.kt:301)");
        }
        d.b bVar2 = null;
        if (bVar instanceof a.b.C0877b) {
            aVar.K(-1297049336);
            a.b.C0877b c0877b = (a.b.C0877b) bVar;
            lg90 a2 = fko.a(c0877b.a, aVar);
            f7p0 D = D(c0877b.d, aVar, (i2 & 112) | 64);
            String I2 = blk.I(c0877b.b, aVar);
            ipi ipiVar = c0877b.e;
            if (ipiVar == null) {
                aVar.K(-1553977449);
                aVar.j();
                l5gVar = null;
            } else {
                aVar.K(-1297054294);
                long a3 = ipiVar.a(0, aVar);
                aVar.j();
                l5gVar = new l5g(a3);
            }
            gzs<s3q0> gzsVar = c0877b.c;
            SemanticsConfiguration semanticsConfiguration = c0877b.f;
            bVar2 = d.b.a.C0757a.a(a2, I2, gzsVar, D, l5gVar, semanticsConfiguration == null ? null : semanticsConfiguration, aVar, 12582920, 64);
            setRightExtraRect(bVar2.d());
            izs<com.vk.core.view.components.topbar.a, s3q0> onToolbarEvent = getOnToolbarEvent();
            if (onToolbarEvent != null) {
                onToolbarEvent.invoke(new a.c.C0884a(bVar2.d()));
            }
            aVar.j();
        } else if (bVar instanceof a.b.C0876a) {
            aVar.K(-1297042543);
            aVar.j();
            bVar2 = new d((a.b.C0876a) bVar);
        } else {
            if (bVar != null) {
                throw alb0.c(-1297063060, aVar);
            }
            aVar.K(-1553569117);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.vk.core.compose.component.topbar.a C(androidx.compose.runtime.a aVar) {
        l5g l5gVar;
        SemanticsConfiguration semanticsConfiguration;
        f7p0 f7p0Var;
        lg90 a2;
        CounterMode counterMode;
        d.c cVar;
        z190 z190Var;
        Object obj;
        androidx.compose.runtime.a aVar2 = aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1419715930, 8, -1, "com.vk.core.view.components.topbar.VkTopBar.buildRight (VkTopBar.kt:197)");
        }
        a after = getAfter();
        com.vk.core.compose.component.topbar.a aVar3 = null;
        if (after instanceof a.d) {
            aVar2.K(-1452585112);
            a.d dVar = (a.d) after;
            a.c cVar2 = dVar.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1863285981, 64, -1, "com.vk.core.view.components.topbar.VkTopBar.buildAfterMain (VkTopBar.kt:224)");
            }
            boolean z = cVar2 instanceof a.c.C0878a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                aVar2.K(383539734);
                a.c.C0878a c0878a = (a.c.C0878a) cVar2;
                snx snxVar = c0878a.a;
                efj c2 = wnx.c(snxVar.a, aVar2);
                ArrayList a3 = wnx.a(snxVar.b, aVar2);
                wnx.b(aVar2);
                z190 d2 = wnx.d(null, aVar2);
                pco pcoVar = c0878a.c;
                gzs<s3q0> gzsVar = c0878a.b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(177528859, 12582912, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Avatar.Companion.invoke (TopBar.kt:1716)");
                }
                Object x = aVar2.x();
                wep wepVar = wep.a;
                if (x == c0012a) {
                    d.c.a aVar4 = new d.c.a(c2, a3, wepVar, d2, pcoVar, gzsVar, null);
                    z190Var = d2;
                    obj = null;
                    aVar2.R(aVar4);
                    x = aVar4;
                } else {
                    z190Var = d2;
                    obj = null;
                }
                d.c.a aVar5 = (d.c.a) x;
                ((zak0) aVar5.d).setValue(c2);
                ((zak0) aVar5.e).setValue(new wow(a3));
                ((zak0) aVar5.f).setValue(wepVar);
                ((zak0) aVar5.g).setValue(z190Var);
                ((zak0) aVar5.h).setValue(pcoVar);
                ((zak0) aVar5.j).setValue(obj);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                cVar = aVar5;
            } else {
                if (cVar2 instanceof a.c.b) {
                    aVar2.K(-994754546);
                    a.c.b bVar = (a.c.b) cVar2;
                    String J = blk.J(bVar.a, aVar2);
                    boolean z2 = bVar.b;
                    float f2 = bVar.c;
                    gzs<s3q0> gzsVar2 = bVar.d;
                    SemanticsConfiguration semanticsConfiguration2 = bVar.e;
                    d.c a4 = d.c.b.a.a(J, gzsVar2, z2, f2, semanticsConfiguration2 != null ? semanticsConfiguration2 : null, aVar, 196608, 0);
                    aVar2 = aVar;
                    aVar2.j();
                    cVar = a4;
                } else if (cVar2 instanceof a.c.f) {
                    aVar2.K(-994416522);
                    a.c.f fVar = (a.c.f) cVar2;
                    lg90 a5 = fko.a(fVar.a, aVar2);
                    ipi ipiVar = fVar.e;
                    if (ipiVar == null) {
                        aVar2.K(-994378610);
                        aVar2.j();
                        l5gVar = null;
                    } else {
                        aVar2.K(383565267);
                        long a6 = ipiVar.a(0, aVar2);
                        aVar2.j();
                        l5gVar = new l5g(a6);
                    }
                    l lVar = fVar.d;
                    if (lVar instanceof l.a) {
                        aVar2.K(383569780);
                        BadgeAppearance a7 = zy5.a(((l.a) lVar).a, getContext());
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-263432097, 384, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Badge.Companion.invoke (TopBar.kt:1970)");
                        }
                        Object x2 = aVar2.x();
                        if (x2 == c0012a) {
                            x2 = new f7p0.a(a7, null);
                            aVar2.R(x2);
                        }
                        f7p0.a aVar6 = (f7p0.a) x2;
                        ((zak0) aVar6.a).setValue(a7);
                        ((zak0) aVar6.b).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                        f7p0Var = aVar6;
                    } else if (lVar instanceof l.c) {
                        aVar2.K(383576441);
                        l.c cVar3 = (l.c) lVar;
                        int i2 = cVar3.a;
                        CounterAppearance a8 = pxj.a(cVar3.b);
                        int i3 = pxj.a.$EnumSwitchMapping$0[cVar3.c.ordinal()];
                        if (i3 == 1) {
                            counterMode = CounterMode.Primary;
                        } else if (i3 == 2) {
                            counterMode = CounterMode.Contrast;
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            counterMode = CounterMode.Tertiary;
                        }
                        f7p0.c a9 = f7p0.c.a.a(i2, a8, counterMode, null, aVar, 24576, 0);
                        aVar2 = aVar;
                        aVar2.j();
                        f7p0Var = a9;
                    } else {
                        if (lVar instanceof l.b) {
                            aVar2.K(-993680675);
                            l.b bVar2 = (l.b) lVar;
                            ContentBadgeSize c3 = mfj.c(bVar2.a);
                            ContentBadgeAppearance a10 = mfj.a(bVar2.c, getContext());
                            ContentBadgeMode b2 = mfj.b(bVar2.b);
                            gko gkoVar = bVar2.d;
                            if (gkoVar == null) {
                                aVar2.K(-993462157);
                                aVar2.j();
                                a2 = null;
                            } else {
                                aVar2.K(383594830);
                                a2 = fko.a(gkoVar, aVar2);
                                aVar2.j();
                            }
                            aVar2.K(-993398514);
                            aVar2.j();
                            aVar2.K(-993279629);
                            aVar2.j();
                            aVar2.K(-993200114);
                            aVar2.j();
                            f7p0.b a11 = f7p0.b.a.a(c3, b2, a10, a2, null, null, null, null, aVar);
                            semanticsConfiguration = null;
                            aVar2 = aVar;
                            aVar2.j();
                            f7p0Var = a11;
                        } else {
                            semanticsConfiguration = null;
                            if (lVar != null) {
                                throw alb0.c(383567954, aVar2);
                            }
                            aVar2.K(-993007046);
                            aVar2.j();
                            f7p0Var = null;
                        }
                        String I2 = blk.I(fVar.b, aVar2);
                        SemanticsConfiguration semanticsConfiguration3 = semanticsConfiguration;
                        gzs<s3q0> gzsVar3 = fVar.c;
                        SemanticsConfiguration semanticsConfiguration4 = fVar.f;
                        d.c a12 = d.c.C0760d.a.a(a5, I2, gzsVar3, f7p0Var, l5gVar, semanticsConfiguration4 != null ? semanticsConfiguration3 : semanticsConfiguration4, aVar2, 1572872, 0);
                        aVar2.j();
                        cVar = a12;
                    }
                    semanticsConfiguration = null;
                    String I22 = blk.I(fVar.b, aVar2);
                    SemanticsConfiguration semanticsConfiguration32 = semanticsConfiguration;
                    gzs<s3q0> gzsVar32 = fVar.c;
                    SemanticsConfiguration semanticsConfiguration42 = fVar.f;
                    d.c a122 = d.c.C0760d.a.a(a5, I22, gzsVar32, f7p0Var, l5gVar, semanticsConfiguration42 != null ? semanticsConfiguration32 : semanticsConfiguration42, aVar2, 1572872, 0);
                    aVar2.j();
                    cVar = a122;
                } else if (cVar2 instanceof a.c.h) {
                    aVar2.K(383617951);
                    d.c a13 = d.c.f.a.a(((a.c.h) cVar2).a, aVar2);
                    aVar2.j();
                    cVar = a13;
                } else if (cVar2 instanceof a.c.e) {
                    aVar2.K(383620542);
                    com.vk.movika.tools.controls.seekbar.n nVar = ((a.c.e) cVar2).a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(440016073, 0, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Done.invoke (TopBar.kt:1773)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
                    }
                    lg90 a14 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    d.c a15 = d.c.C0760d.a.a(a14, null, nVar, null, null, null, aVar2, 1572872, 26);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                    cVar = a15;
                } else if (cVar2 instanceof a.c.g) {
                    aVar2.K(383626078);
                    gu0 gu0Var = ((a.c.g) cVar2).a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1036710428, 0, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.More.invoke (TopBar.kt:1785)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1242272540, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreHorizontal28> (VkSdkIcons.kt:2644)");
                    }
                    lg90 b3 = or.b(aVar2, -1191772860, R.drawable.vk_icon_more_horizontal_28, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    d.c a16 = d.c.C0760d.a.a(b3, null, gu0Var, null, null, null, aVar2, 1572872, 26);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.j();
                    cVar = a16;
                } else if (cVar2 instanceof a.c.C0879c) {
                    aVar2.K(383631647);
                    a.c.C0879c c0879c = (a.c.C0879c) cVar2;
                    gzs<s3q0> gzsVar4 = c0879c.a;
                    SemanticsConfiguration semanticsConfiguration5 = c0879c.b;
                    d.c a17 = d.c.C0759c.a(gzsVar4, semanticsConfiguration5 != null ? semanticsConfiguration5 : null, aVar2, 0);
                    aVar2.j();
                    cVar = a17;
                } else {
                    if (!(cVar2 instanceof a.c.d)) {
                        throw alb0.c(383540448, aVar2);
                    }
                    aVar2.K(383636728);
                    aVar2.j();
                    cVar = new e((a.c.d) cVar2);
                }
            }
            d.c cVar4 = cVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            setRightMainRect(cVar4.d());
            izs<com.vk.core.view.components.topbar.a, s3q0> onToolbarEvent = getOnToolbarEvent();
            if (onToolbarEvent != null) {
                onToolbarEvent.invoke(new a.c.b(cVar4.d()));
            }
            aVar3 = d.a.a(cVar4, B(dVar.b, aVar2, 64), B(dVar.c, aVar2, 64), null, aVar, 24576, 8);
            aVar.j();
        } else {
            getContext();
            aVar2.K(-2079561117);
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return aVar3;
    }

    public final f7p0 D(l lVar, androidx.compose.runtime.a aVar, int i2) {
        f7p0 f7p0Var;
        lg90 lg90Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(318644701, i2, -1, "com.vk.core.view.components.topbar.VkTopBar.buildTopMarker (VkTopBar.kt:321)");
        }
        if (lVar instanceof l.a) {
            aVar.K(1274884450);
            BadgeAppearance a2 = zy5.a(((l.a) lVar).a, getContext());
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-263432097, 384, -1, "com.vk.core.compose.component.topbar.TopBar.TopMarker.Badge.Companion.invoke (TopBar.kt:1970)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new f7p0.a(a2, null);
                aVar.R(x);
            }
            f7p0.a aVar2 = (f7p0.a) x;
            ((zak0) aVar2.a).setValue(a2);
            ((zak0) aVar2.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            f7p0Var = aVar2;
        } else if (lVar instanceof l.c) {
            aVar.K(1274890540);
            l.c cVar = (l.c) lVar;
            f7p0.c a3 = f7p0.c.a.a(cVar.a, pxj.a(cVar.b), null, null, aVar, 24576, 4);
            aVar.j();
            f7p0Var = a3;
        } else if (lVar instanceof l.b) {
            aVar.K(867179055);
            l.b bVar = (l.b) lVar;
            ContentBadgeSize c2 = mfj.c(bVar.a);
            ContentBadgeAppearance a4 = mfj.a(bVar.c, getContext());
            ContentBadgeMode b2 = mfj.b(bVar.b);
            gko gkoVar = bVar.d;
            if (gkoVar == null) {
                aVar.K(867383065);
                aVar.j();
                lg90Var = null;
            } else {
                aVar.K(1274906088);
                lg90 a5 = fko.a(gkoVar, aVar);
                aVar.j();
                lg90Var = a5;
            }
            aVar.K(867442740);
            aVar.j();
            aVar.K(867553689);
            aVar.j();
            aVar.K(867629236);
            aVar.j();
            f7p0.b a6 = f7p0.b.a.a(c2, b2, a4, lg90Var, null, null, null, null, aVar);
            aVar.j();
            f7p0Var = a6;
        } else {
            f7p0Var = null;
            if (lVar != null) {
                throw alb0.c(1274883268, aVar);
            }
            aVar.K(867806432);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f7p0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!getAllowMiddleTouchPassthrough() || ((getMiddleOverlay() != null && !epx.f(getMiddleOverlay(), Middle.c.a)) || getTransformFraction() >= 0.1f || motionEvent.getAction() != 0)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long floatToRawIntBits = (Float.floatToRawIntBits(y) & 4294967295L) | (Float.floatToRawIntBits(x) << 32);
        if (getBefore() != null && getLeftBeforeIconRect().a(floatToRawIntBits)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if ((getAfter() == null || !getRightMainRect().a(floatToRawIntBits)) && !getRightExtraRect().a(floatToRawIntBits)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final a getAfter() {
        return (a) ((zak0) this.s).getValue();
    }

    public final boolean getAllowMiddleTouchPassthrough() {
        return ((Boolean) ((zak0) this.G).getValue()).booleanValue();
    }

    public final b getBack() {
        return (b) ((zak0) this.q).getValue();
    }

    public final c getBefore() {
        return (c) ((zak0) this.r).getValue();
    }

    public final View getBottomSlot() {
        return (View) ((zak0) this.t).getValue();
    }

    public final r5j0 getClipShape() {
        return (r5j0) ((zak0) this.E).getValue();
    }

    public final h getGradient() {
        return (h) ((zak0) this.w).getValue();
    }

    public j getInitialMode() {
        return (j) ((zak0) this.n).getValue();
    }

    public final zhf0 getLeftAvatarRect() {
        return (zhf0) ((zak0) this.B).getValue();
    }

    public final zhf0 getLeftBeforeIconRect() {
        return (zhf0) ((zak0) this.D).getValue();
    }

    public final Middle getMiddle() {
        return (Middle) ((zak0) this.o).getValue();
    }

    public final i getMiddleOverlay() {
        return (i) ((zak0) this.p).getValue();
    }

    public final zhf0 getRightExtraRect() {
        return (zhf0) ((zak0) this.A).getValue();
    }

    public final zhf0 getRightMainRect() {
        return (zhf0) ((zak0) this.z).getValue();
    }

    public final zhf0 getSearchRightIconRect() {
        return (zhf0) ((zak0) this.C).getValue();
    }

    public final boolean getShowBottomDivider() {
        return ((Boolean) ((zak0) this.v).getValue()).booleanValue();
    }

    public final float getSlotAlpha() {
        return this.u.getFloatValue();
    }

    public final zhf0 getTitleRect() {
        return (zhf0) ((zak0) this.y).getValue();
    }

    public float getTransformFraction() {
        return ((Number) ((zak0) this.m).getValue()).floatValue();
    }

    public final m getTransitionHeaderColor() {
        return (m) ((zak0) this.F).getValue();
    }

    public final boolean getTransparentBackground() {
        return ((Boolean) ((zak0) this.H).getValue()).booleanValue();
    }

    public final void setAfter(a aVar) {
        ((zak0) this.s).setValue(aVar);
    }

    public final void setAllowMiddleTouchPassthrough(boolean z) {
        ((zak0) this.G).setValue(Boolean.valueOf(z));
    }

    public final void setBack(b bVar) {
        ((zak0) this.q).setValue(bVar);
    }

    public final void setBefore(c cVar) {
        ((zak0) this.r).setValue(cVar);
    }

    public final void setBottomSlot(View view) {
        ((zak0) this.t).setValue(view);
    }

    public final void setClipShape(r5j0 r5j0Var) {
        ((zak0) this.E).setValue(r5j0Var);
    }

    public final void setGradient(h hVar) {
        ((zak0) this.w).setValue(hVar);
    }

    public void setInitialMode(j jVar) {
        ((zak0) this.n).setValue(jVar);
    }

    public final void setLeftAvatarRect(zhf0 zhf0Var) {
        ((zak0) this.B).setValue(zhf0Var);
    }

    public final void setLeftBeforeIconRect(zhf0 zhf0Var) {
        ((zak0) this.D).setValue(zhf0Var);
    }

    public final void setMiddle(Middle middle) {
        ((zak0) this.o).setValue(middle);
    }

    public final void setMiddleOverlay(i iVar) {
        ((zak0) this.p).setValue(iVar);
    }

    public final void setOnToolbarSlotListener(izs<? super com.vk.core.view.components.topbar.a, s3q0> izsVar) {
        setOnToolbarEvent(izsVar);
    }

    public final void setRightExtraRect(zhf0 zhf0Var) {
        ((zak0) this.A).setValue(zhf0Var);
    }

    public final void setRightMainRect(zhf0 zhf0Var) {
        ((zak0) this.z).setValue(zhf0Var);
    }

    public final void setSearchRightIconRect(zhf0 zhf0Var) {
        ((zak0) this.C).setValue(zhf0Var);
    }

    public final void setShowBottomDivider(boolean z) {
        ((zak0) this.v).setValue(Boolean.valueOf(z));
    }

    public final void setSlotAlpha(float f2) {
        ((vak0) this.u).g(f2);
    }

    public final void setTitleRect(zhf0 zhf0Var) {
        ((zak0) this.y).setValue(zhf0Var);
    }

    public void setTransformFraction(float f2) {
        ((zak0) this.m).setValue(Float.valueOf(f2));
    }

    public final void setTransitionHeaderColor(m mVar) {
        ((zak0) this.F).setValue(mVar);
    }

    public final void setTransparentBackground(boolean z) {
        ((zak0) this.H).setValue(Boolean.valueOf(z));
    }

    public VkTopBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.m = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.n = androidx.compose.runtime.k.b(j.a.a);
        this.o = androidx.compose.runtime.k.b(Middle.c.a);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(null);
        this.r = androidx.compose.runtime.k.b(null);
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        this.u = androidx.compose.runtime.d.a(1.0f);
        Boolean bool = Boolean.FALSE;
        this.v = androidx.compose.runtime.k.b(bool);
        this.w = androidx.compose.runtime.k.b(null);
        this.x = androidx.compose.runtime.k.b(null);
        zhf0 zhf0Var = zhf0.e;
        this.y = androidx.compose.runtime.k.b(zhf0Var);
        this.z = androidx.compose.runtime.k.b(zhf0Var);
        this.A = androidx.compose.runtime.k.b(zhf0Var);
        this.B = androidx.compose.runtime.k.b(zhf0Var);
        this.C = androidx.compose.runtime.k.b(zhf0Var);
        this.D = androidx.compose.runtime.k.b(zhf0Var);
        this.E = androidx.compose.runtime.k.b(null);
        this.F = androidx.compose.runtime.k.b(m.a.a);
        this.G = androidx.compose.runtime.k.b(bool);
        this.H = androidx.compose.runtime.k.b(bool);
    }

    /* compiled from: VkTopBar.kt */
    public static abstract class Middle {

        /* compiled from: VkTopBar.kt */
        public static final class a extends Middle {
            public final com.vk.core.view.components.topbar.b a;
            public final VkTopBar$Middle$Cell$Middle$Text b;

            public a(com.vk.core.view.components.topbar.b bVar, VkTopBar$Middle$Cell$Middle$Text vkTopBar$Middle$Cell$Middle$Text) {
                this.a = bVar;
                this.b = vkTopBar$Middle$Cell$Middle$Text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Cell(left=" + this.a + ", middle=" + this.b + ')';
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class b extends Middle {
            public final View a;

            public b(View view) {
                this.a = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return br.b(new StringBuilder("Custom(view="), this.a, ')');
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class c extends i {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1975400559;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class Text extends i {
            public final Title a;
            public final c b;
            public final a c;
            public final SemanticsConfiguration d;

            /* compiled from: VkTopBar.kt */
            public interface a {

                /* compiled from: VkTopBar.kt */
                /* renamed from: com.vk.core.view.components.topbar.VkTopBar$Middle$Text$a$a, reason: collision with other inner class name */
                public static final class C0871a implements a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0871a)) {
                            return false;
                        }
                        ((C0871a) obj).getClass();
                        throw null;
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "Avatar(avatar=" + ((Object) null) + ", semanticsConfiguration=" + ((Object) "null") + ')';
                    }
                }

                /* compiled from: VkTopBar.kt */
                public static final class b implements a {
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class b {
                public final gko a;

                public b(gko gkoVar) {
                    this.a = gkoVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a.equals(((b) obj).a);
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a.a);
                }

                public final String toString() {
                    return "Icon(icon=" + this.a + ')';
                }
            }

            /* compiled from: VkTopBar.kt */
            public static final class c {
                public final tlo0 a;
                public final int b;
                public final int c;
                public final b d;
                public final SemanticsConfiguration e;

                public c(tlo0 tlo0Var, b bVar, com.vk.core.compose.component.semantics.a aVar, int i) {
                    int i2 = (i & 2) != 0 ? Integer.MAX_VALUE : 1;
                    int i3 = (i & 4) == 0 ? 2 : 1;
                    bVar = (i & 8) != 0 ? null : bVar;
                    aVar = (i & 16) != 0 ? null : aVar;
                    this.a = tlo0Var;
                    this.b = i2;
                    this.c = i3;
                    this.d = bVar;
                    this.e = aVar;
                }

                public final boolean equals(Object obj) {
                    boolean f;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    if (!epx.f(this.a, cVar.a) || this.b != cVar.b || this.c != cVar.c || !epx.f(this.d, cVar.d)) {
                        return false;
                    }
                    SemanticsConfiguration semanticsConfiguration = cVar.e;
                    SemanticsConfiguration semanticsConfiguration2 = this.e;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            f = true;
                        }
                        f = false;
                    } else {
                        if (semanticsConfiguration != null) {
                            f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                        }
                        f = false;
                    }
                    return f;
                }

                public final int hashCode() {
                    int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
                    b bVar = this.d;
                    int hashCode = (a + (bVar == null ? 0 : Integer.hashCode(bVar.a.a))) * 31;
                    SemanticsConfiguration semanticsConfiguration = this.e;
                    return hashCode + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Subtitle(subtitle=");
                    sb.append(this.a);
                    sb.append(", maxLines=");
                    sb.append(this.b);
                    sb.append(", overflow=");
                    sb.append((Object) bko0.a(this.c));
                    sb.append(", icon=");
                    sb.append(this.d);
                    sb.append(", semanticsConfiguration=");
                    SemanticsConfiguration semanticsConfiguration = this.e;
                    return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
                }
            }

            public Text(Title title, c cVar, a aVar, SemanticsConfiguration semanticsConfiguration) {
                this.a = title;
                this.b = cVar;
                this.c = aVar;
                this.d = semanticsConfiguration;
            }

            public static Text a(Text text, Title title) {
                return new Text(title, text.b, text.c, text.d);
            }

            public final boolean equals(Object obj) {
                boolean f;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                if (!epx.f(this.a, text.a) || !epx.f(this.b, text.b) || !epx.f(this.c, text.c)) {
                    return false;
                }
                SemanticsConfiguration semanticsConfiguration = text.d;
                SemanticsConfiguration semanticsConfiguration2 = this.d;
                if (semanticsConfiguration2 == null) {
                    if (semanticsConfiguration == null) {
                        f = true;
                    }
                    f = false;
                } else {
                    if (semanticsConfiguration != null) {
                        f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                    }
                    f = false;
                }
                return f;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                c cVar = this.b;
                int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
                a aVar = this.c;
                int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                SemanticsConfiguration semanticsConfiguration = this.d;
                return hashCode3 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Text(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                sb.append(this.b);
                sb.append(", before=");
                sb.append(this.c);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.d;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }

            /* compiled from: VkTopBar.kt */
            public static final class Title {
                public final tlo0 a;
                public final gzs<s3q0> b;
                public final a c;
                public final Size d;
                public final SemanticsConfiguration e;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VkTopBar.kt */
                public static final class Size {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Size[] $VALUES;
                    public static final Size Medium;
                    public static final Size Small;

                    static {
                        Size size = new Size("Small", 0);
                        Small = size;
                        Size size2 = new Size("Medium", 1);
                        Medium = size2;
                        Size[] sizeArr = {size, size2};
                        $VALUES = sizeArr;
                        $ENTRIES = new asp(sizeArr);
                    }

                    public Size() {
                        throw null;
                    }

                    public static Size valueOf(String str) {
                        return (Size) Enum.valueOf(Size.class, str);
                    }

                    public static Size[] values() {
                        return (Size[]) $VALUES.clone();
                    }
                }

                /* compiled from: VkTopBar.kt */
                public interface a {

                    /* compiled from: VkTopBar.kt */
                    /* renamed from: com.vk.core.view.components.topbar.VkTopBar$Middle$Text$Title$a$a, reason: collision with other inner class name */
                    public static final class C0870a implements a {
                        public final tlo0 a;

                        public C0870a() {
                            this(null);
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C0870a) && epx.f(this.a, ((C0870a) obj).a);
                        }

                        public final int hashCode() {
                            tlo0 tlo0Var = this.a;
                            if (tlo0Var == null) {
                                return 0;
                            }
                            return tlo0Var.hashCode();
                        }

                        public final String toString() {
                            return bt.a(new StringBuilder("Dropdown(description="), this.a, ')');
                        }

                        public C0870a(tlo0.f fVar) {
                            this.a = fVar;
                        }
                    }

                    /* compiled from: VkTopBar.kt */
                    public static final class b implements a {
                        public final b a;
                        public final b b;

                        public b(b bVar, b bVar2) {
                            this.a = bVar;
                            this.b = bVar2;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof b)) {
                                return false;
                            }
                            b bVar = (b) obj;
                            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                        }

                        public final int hashCode() {
                            int hashCode = Integer.hashCode(this.a.a.a) * 31;
                            b bVar = this.b;
                            return hashCode + (bVar == null ? 0 : Integer.hashCode(bVar.a.a));
                        }

                        public final String toString() {
                            return "Icons(icon1=" + this.a + ", icon2=" + this.b + ')';
                        }
                    }
                }

                public Title() {
                    throw null;
                }

                public Title(tlo0 tlo0Var, gzs gzsVar, a aVar, Size size, SemanticsConfiguration semanticsConfiguration) {
                    this.a = tlo0Var;
                    this.b = gzsVar;
                    this.c = aVar;
                    this.d = size;
                    this.e = semanticsConfiguration;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v3, types: [xsna.tlo0] */
                /* JADX WARN: Type inference failed for: r8v2, types: [com.vk.core.view.components.topbar.VkTopBar$Middle$Text$Title$a] */
                public static Title a(Title title, tlo0.h hVar, a.C0870a c0870a, int i) {
                    tlo0.h hVar2 = hVar;
                    if ((i & 1) != 0) {
                        hVar2 = title.a;
                    }
                    tlo0.h hVar3 = hVar2;
                    gzs<s3q0> gzsVar = title.b;
                    a.C0870a c0870a2 = c0870a;
                    if ((i & 4) != 0) {
                        c0870a2 = title.c;
                    }
                    Size size = title.d;
                    SemanticsConfiguration semanticsConfiguration = title.e;
                    title.getClass();
                    return new Title(hVar3, gzsVar, c0870a2, size, semanticsConfiguration);
                }

                public final boolean equals(Object obj) {
                    boolean f;
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Title)) {
                        return false;
                    }
                    Title title = (Title) obj;
                    if (!epx.f(this.a, title.a) || !epx.f(this.b, title.b) || !epx.f(this.c, title.c) || this.d != title.d) {
                        return false;
                    }
                    SemanticsConfiguration semanticsConfiguration = title.e;
                    SemanticsConfiguration semanticsConfiguration2 = this.e;
                    if (semanticsConfiguration2 == null) {
                        if (semanticsConfiguration == null) {
                            f = true;
                        }
                        f = false;
                    } else {
                        if (semanticsConfiguration != null) {
                            f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                        }
                        f = false;
                    }
                    return f;
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    gzs<s3q0> gzsVar = this.b;
                    int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                    a aVar = this.c;
                    int hashCode3 = (this.d.hashCode() + ((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
                    SemanticsConfiguration semanticsConfiguration = this.e;
                    return hashCode3 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Title(title=");
                    sb.append(this.a);
                    sb.append(", onClick=");
                    sb.append(this.b);
                    sb.append(", along=");
                    sb.append(this.c);
                    sb.append(", size=");
                    sb.append(this.d);
                    sb.append(", semanticsConfiguration=");
                    SemanticsConfiguration semanticsConfiguration = this.e;
                    return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
                }

                public /* synthetic */ Title(tlo0 tlo0Var, gzs gzsVar, a aVar, Size size, com.vk.core.compose.component.semantics.a aVar2, int i) {
                    this(tlo0Var, (i & 2) != 0 ? null : gzsVar, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? Size.Medium : size, (i & 16) != 0 ? null : aVar2);
                }

                public Title(String str, e4 e4Var, a aVar, Size size, int i) {
                    this(oq.d(tlo0.Companion, str), (i & 2) != 0 ? null : e4Var, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? Size.Medium : size, null, 16);
                }
            }

            public /* synthetic */ Text(Title title, c cVar, a.C0871a c0871a, SemanticsConfiguration semanticsConfiguration, int i) {
                this(title, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : c0871a, (i & 8) != 0 ? null : semanticsConfiguration);
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class d extends Middle {
            public final String a;
            public final tho0 b;
            public final boolean c;
            public final izs<Boolean, s3q0> d;
            public final izs<tho0, s3q0> e;
            public final gzs<s3q0> f;
            public final gzs<s3q0> g;
            public final izs<tho0, s3q0> h;
            public final b i;
            public final a j;
            public final sg50 k;
            public final SemanticsConfiguration l;

            /* compiled from: VkTopBar.kt */
            public interface a {

                /* compiled from: VkTopBar.kt */
                /* renamed from: com.vk.core.view.components.topbar.VkTopBar$Middle$d$a$a, reason: collision with other inner class name */
                public static final class C0872a implements a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0872a)) {
                            return false;
                        }
                        ((C0872a) obj).getClass();
                        return true;
                    }

                    public final int hashCode() {
                        return 0;
                    }

                    public final String toString() {
                        return "Clear(onClick=null)";
                    }
                }

                /* compiled from: VkTopBar.kt */
                public static final class b implements a {
                    public final gzs<s3q0> a;

                    public b() {
                        this(null);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                    }

                    public final int hashCode() {
                        gzs<s3q0> gzsVar = this.a;
                        if (gzsVar == null) {
                            return 0;
                        }
                        return gzsVar.hashCode();
                    }

                    public final String toString() {
                        return uf3.d(new StringBuilder("Filter(onClick="), this.a, ')');
                    }

                    public b(VkTopBarSearchQueryVh.d dVar) {
                        this.a = dVar;
                    }
                }

                /* compiled from: VkTopBar.kt */
                public static final class c implements a {
                }

                /* compiled from: VkTopBar.kt */
                /* renamed from: com.vk.core.view.components.topbar.VkTopBar$Middle$d$a$d, reason: collision with other inner class name */
                public static final class C0873d implements a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0873d)) {
                            return false;
                        }
                        ((C0873d) obj).getClass();
                        return true;
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "Pair(first=null, second=null)";
                    }
                }
            }

            /* compiled from: VkTopBar.kt */
            public interface b {

                /* compiled from: VkTopBar.kt */
                public static final class a implements b {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        ((a) obj).getClass();
                        return true;
                    }

                    public final int hashCode() {
                        return 0;
                    }

                    public final String toString() {
                        return "Marusia(iconDescription=null, onClick=null)";
                    }
                }

                /* compiled from: VkTopBar.kt */
                /* renamed from: com.vk.core.view.components.topbar.VkTopBar$Middle$d$b$b, reason: collision with other inner class name */
                public static final class C0874b implements b {
                    public final String a;
                    public final gzs<s3q0> b;

                    public C0874b() {
                        this((ufu0) null, 3);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0874b)) {
                            return false;
                        }
                        C0874b c0874b = (C0874b) obj;
                        return epx.f(this.a, c0874b.a) && epx.f(this.b, c0874b.b);
                    }

                    public final int hashCode() {
                        String str = this.a;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        gzs<s3q0> gzsVar = this.b;
                        return hashCode + (gzsVar != null ? gzsVar.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Microphone(iconDescription=");
                        sb.append(this.a);
                        sb.append(", onClick=");
                        return uf3.d(sb, this.b, ')');
                    }

                    public C0874b(String str, gzs<s3q0> gzsVar) {
                        this.a = str;
                        this.b = gzsVar;
                    }

                    public /* synthetic */ C0874b(ufu0 ufu0Var, int i) {
                        this((String) null, (i & 2) != 0 ? null : ufu0Var);
                    }
                }
            }

            public d() {
                throw null;
            }

            public d(String str, tho0 tho0Var, boolean z, izs izsVar, izs izsVar2, gzs gzsVar, gzs gzsVar2, izs izsVar3, b bVar, a aVar, sg50 sg50Var, SemanticsConfiguration semanticsConfiguration) {
                this.a = str;
                this.b = tho0Var;
                this.c = z;
                this.d = izsVar;
                this.e = izsVar2;
                this.f = gzsVar;
                this.g = gzsVar2;
                this.h = izsVar3;
                this.i = bVar;
                this.j = aVar;
                this.k = sg50Var;
                this.l = semanticsConfiguration;
            }

            public static d a(d dVar, String str, tho0 tho0Var, boolean z, a aVar, int i) {
                String str2 = (i & 1) != 0 ? dVar.a : str;
                tho0 tho0Var2 = (i & 2) != 0 ? dVar.b : tho0Var;
                boolean z2 = (i & 4) != 0 ? dVar.c : z;
                izs<Boolean, s3q0> izsVar = dVar.d;
                izs<tho0, s3q0> izsVar2 = dVar.e;
                gzs<s3q0> gzsVar = dVar.f;
                gzs<s3q0> gzsVar2 = dVar.g;
                izs<tho0, s3q0> izsVar3 = dVar.h;
                b bVar = dVar.i;
                a aVar2 = (i & 512) != 0 ? dVar.j : aVar;
                sg50 sg50Var = dVar.k;
                SemanticsConfiguration semanticsConfiguration = dVar.l;
                dVar.getClass();
                return new d(str2, tho0Var2, z2, izsVar, izsVar2, gzsVar, gzsVar2, izsVar3, bVar, aVar2, sg50Var, semanticsConfiguration);
            }

            public final boolean equals(Object obj) {
                boolean f;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (!epx.f(this.a, dVar.a) || !epx.f(this.b, dVar.b) || this.c != dVar.c || !epx.f(this.d, dVar.d) || !epx.f(this.e, dVar.e) || !epx.f(this.f, dVar.f) || !epx.f(this.g, dVar.g) || !epx.f(this.h, dVar.h) || !epx.f(this.i, dVar.i) || !epx.f(this.j, dVar.j) || !epx.f(this.k, dVar.k)) {
                    return false;
                }
                SemanticsConfiguration semanticsConfiguration = dVar.l;
                SemanticsConfiguration semanticsConfiguration2 = this.l;
                if (semanticsConfiguration2 == null) {
                    if (semanticsConfiguration == null) {
                        f = true;
                    }
                    f = false;
                } else {
                    if (semanticsConfiguration != null) {
                        f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                    }
                    f = false;
                }
                return f;
            }

            public final int hashCode() {
                int a2 = sf3.a(dq.c(dq.c(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
                gzs<s3q0> gzsVar = this.g;
                int hashCode = (a2 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                izs<tho0, s3q0> izsVar = this.h;
                int hashCode2 = (hashCode + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
                b bVar = this.i;
                int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                a aVar = this.j;
                int hashCode4 = (this.k.hashCode() + ((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
                SemanticsConfiguration semanticsConfiguration = this.l;
                return hashCode4 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Search(hint=");
                sb.append(this.a);
                sb.append(", text=");
                sb.append(this.b);
                sb.append(", requestFocus=");
                sb.append(this.c);
                sb.append(", onFocus=");
                sb.append(this.d);
                sb.append(", onQueryChange=");
                sb.append(this.e);
                sb.append(", onClearClicked=");
                sb.append(this.f);
                sb.append(", onSearchClicked=");
                sb.append(this.g);
                sb.append(", onSearchImeActionClicked=");
                sb.append(this.h);
                sb.append(", voice=");
                sb.append(this.i);
                sb.append(", right=");
                sb.append(this.j);
                sb.append(", interactionSource=");
                sb.append(this.k);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.l;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }

            public d(String str, tho0 tho0Var, boolean z, izs izsVar, izs izsVar2, gzs gzsVar, mqe0 mqe0Var, izs izsVar3, b.C0874b c0874b, com.vk.core.compose.component.semantics.a aVar, int i) {
                this(str, tho0Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new n0m0(17) : izsVar, (i & 16) != 0 ? new p6e0(26) : izsVar2, (i & 32) != 0 ? new w5k0(13) : gzsVar, (i & 64) != 0 ? null : mqe0Var, (i & 128) != 0 ? null : izsVar3, (i & 256) != 0 ? null : c0874b, null, new tg50(), (i & 2048) != 0 ? null : aVar);
            }
        }
    }

    /* compiled from: VkTopBar.kt */
    public static abstract class c {

        /* compiled from: VkTopBar.kt */
        public static final class a extends c {
            public final snx a;
            public final gzs<s3q0> b;
            public final pco c;
            public final gzs<s3q0> d;
            public final SemanticsConfiguration e;

            public a() {
                throw null;
            }

            public a(snx snxVar, gzs gzsVar, pco pcoVar, gzs gzsVar2, com.vk.core.compose.component.semantics.a aVar, int i) {
                pcoVar = (i & 4) != 0 ? null : pcoVar;
                gzsVar2 = (i & 8) != 0 ? null : gzsVar2;
                aVar = (i & 16) != 0 ? null : aVar;
                this.a = snxVar;
                this.b = gzsVar;
                this.c = pcoVar;
                this.d = gzsVar2;
                this.e = aVar;
            }

            public final boolean equals(Object obj) {
                boolean f;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (!epx.f(this.a, aVar.a) || !epx.f(this.b, aVar.b) || !epx.f(this.c, aVar.c) || !epx.f(this.d, aVar.d)) {
                    return false;
                }
                SemanticsConfiguration semanticsConfiguration = aVar.e;
                SemanticsConfiguration semanticsConfiguration2 = this.e;
                if (semanticsConfiguration2 == null) {
                    if (semanticsConfiguration == null) {
                        f = true;
                    }
                    f = false;
                } else {
                    if (semanticsConfiguration != null) {
                        f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                    }
                    f = false;
                }
                return f;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                gzs<s3q0> gzsVar = this.b;
                int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                pco pcoVar = this.c;
                int hashCode3 = (hashCode2 + (pcoVar == null ? 0 : Float.hashCode(pcoVar.b))) * 31;
                gzs<s3q0> gzsVar2 = this.d;
                int hashCode4 = (hashCode3 + (gzsVar2 == null ? 0 : gzsVar2.hashCode())) * 31;
                SemanticsConfiguration semanticsConfiguration = this.e;
                return hashCode4 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Avatar(avatar=");
                sb.append(this.a);
                sb.append(", onClick=");
                sb.append(this.b);
                sb.append(", size=");
                sb.append(this.c);
                sb.append(", onLongClick=");
                sb.append(this.d);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.e;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class b extends c {
            public b() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Button(text=" + ((Object) null) + ", onClick=" + ((Object) null) + ", enabled=false, alpha=" + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + ", semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkTopBar.kt */
        /* renamed from: com.vk.core.view.components.topbar.VkTopBar$c$c, reason: collision with other inner class name */
        public static final class C0880c extends c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0880c)) {
                    return false;
                }
                ((C0880c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "Camera(iconDescription=null, onClick=null, iconTint=null, semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class e extends c {
            public final View a;

            public e(View view) {
                this.a = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return br.b(new StringBuilder("Custom(view="), this.a, ')');
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class f extends c {
            public final dko a;
            public final tlo0 b;
            public final gzs<s3q0> c;
            public final ipi d;
            public final SemanticsConfiguration e;

            public f() {
                throw null;
            }

            public f(dko dkoVar, tlo0 tlo0Var, gzs gzsVar, b8g b8gVar, SemanticsConfiguration semanticsConfiguration, int i) {
                tlo0Var = (i & 2) != 0 ? null : tlo0Var;
                b8gVar = (i & 16) != 0 ? null : b8gVar;
                semanticsConfiguration = (i & 32) != 0 ? null : semanticsConfiguration;
                this.a = dkoVar;
                this.b = tlo0Var;
                this.c = gzsVar;
                this.d = b8gVar;
                this.e = semanticsConfiguration;
            }

            public final boolean equals(Object obj) {
                boolean equals;
                if (this != obj) {
                    if (obj instanceof f) {
                        f fVar = (f) obj;
                        if (epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d)) {
                            SemanticsConfiguration semanticsConfiguration = fVar.e;
                            SemanticsConfiguration semanticsConfiguration2 = this.e;
                            if (semanticsConfiguration2 == null) {
                                if (semanticsConfiguration == null) {
                                    equals = true;
                                    if (equals) {
                                    }
                                }
                                equals = false;
                                if (equals) {
                                }
                            } else {
                                if (semanticsConfiguration != null) {
                                    equals = semanticsConfiguration2.equals(semanticsConfiguration);
                                    if (equals) {
                                    }
                                }
                                equals = false;
                                if (equals) {
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                tlo0 tlo0Var = this.b;
                int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.c;
                int hashCode3 = (hashCode2 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 961;
                ipi ipiVar = this.d;
                int hashCode4 = (hashCode3 + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
                SemanticsConfiguration semanticsConfiguration = this.e;
                return hashCode4 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(icon=");
                sb.append(this.a);
                sb.append(", iconDescription=");
                sb.append(this.b);
                sb.append(", onClick=");
                sb.append(this.c);
                sb.append(", topMarker=null, iconTint=");
                sb.append(this.d);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.e;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class g extends c {
            public g() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                ((g) obj).getClass();
                return epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "LegoIcon(iconType=" + ((Object) null) + ", iconDescription=null, topMarker=null, onClick=" + ((Object) null) + ", semanticsConfiguration=" + ((Object) "null") + ')';
            }
        }

        /* compiled from: VkTopBar.kt */
        public static final class d extends c {
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final ipi c;
            public final SemanticsConfiguration d;

            public d() {
                throw null;
            }

            public d(tlo0 tlo0Var, gzs gzsVar, ipi ipiVar, SemanticsConfiguration semanticsConfiguration) {
                this.a = tlo0Var;
                this.b = gzsVar;
                this.c = ipiVar;
                this.d = semanticsConfiguration;
            }

            public final boolean equals(Object obj) {
                boolean f;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (!epx.f(this.a, dVar.a) || !epx.f(this.b, dVar.b) || !epx.f(this.c, dVar.c)) {
                    return false;
                }
                SemanticsConfiguration semanticsConfiguration = dVar.d;
                SemanticsConfiguration semanticsConfiguration2 = this.d;
                if (semanticsConfiguration2 == null) {
                    if (semanticsConfiguration == null) {
                        f = true;
                    }
                    f = false;
                } else {
                    if (semanticsConfiguration != null) {
                        f = epx.f(semanticsConfiguration2, semanticsConfiguration);
                    }
                    f = false;
                }
                return f;
            }

            public final int hashCode() {
                tlo0 tlo0Var = this.a;
                int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
                gzs<s3q0> gzsVar = this.b;
                int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                ipi ipiVar = this.c;
                int hashCode3 = (hashCode2 + (ipiVar == null ? 0 : ipiVar.hashCode())) * 31;
                SemanticsConfiguration semanticsConfiguration = this.d;
                return hashCode3 + (semanticsConfiguration != null ? semanticsConfiguration.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Cancel(iconDescription=");
                sb.append(this.a);
                sb.append(", onClick=");
                sb.append(this.b);
                sb.append(", iconTint=");
                sb.append(this.c);
                sb.append(", semanticsConfiguration=");
                SemanticsConfiguration semanticsConfiguration = this.d;
                return tq.f(sb, semanticsConfiguration == null ? "null" : yfi0.a(semanticsConfiguration), ')');
            }

            public /* synthetic */ d(tlo0.f fVar, gzs gzsVar, a8g a8gVar, com.vk.core.compose.component.semantics.a aVar, int i) {
                this((i & 1) != 0 ? null : fVar, gzsVar, (i & 4) != 0 ? null : a8gVar, (i & 8) != 0 ? null : aVar);
            }
        }
    }

    public /* synthetic */ VkTopBar(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}

package com.vk.core.compose.component.topbar;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.commons.http.Http;
import xsna.a7p0;
import xsna.cdi;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.e5l;
import xsna.efj;
import xsna.f7p0;
import xsna.fai;
import xsna.fc1;
import xsna.fcy;
import xsna.gzs;
import xsna.ir;
import xsna.izs;
import xsna.ja8;
import xsna.jn7;
import xsna.jnc;
import xsna.k18;
import xsna.k9q0;
import xsna.kai;
import xsna.kqu0;
import xsna.l5g;
import xsna.ldu0;
import xsna.lg90;
import xsna.mg;
import xsna.mtk0;
import xsna.n34;
import xsna.ojc;
import xsna.or;
import xsna.pco;
import xsna.pdh0;
import xsna.q630;
import xsna.qri;
import xsna.ra8;
import xsna.rzb0;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.sy90;
import xsna.txj0;
import xsna.ur;
import xsna.wh50;
import xsna.wja;
import xsna.wow;
import xsna.xp8;
import xsna.yzs;
import xsna.z190;
import xsna.zak0;
import xsna.zhf0;
import xsna.znk0;

/* compiled from: TopBar.kt */
/* loaded from: classes17.dex */
public abstract class d {
    public final wh50<Float> a = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final wh50 b = androidx.compose.runtime.k.b(k.b.a);

    /* compiled from: TopBar.kt */
    public static final class a {
        public static com.vk.core.compose.component.topbar.a a(c cVar, b bVar, b bVar2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            if ((i2 & 2) != 0) {
                bVar = null;
            }
            if ((i2 & 4) != 0) {
                bVar2 = null;
            }
            if ((i2 & 8) != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(785186198, i, -1, "com.vk.core.compose.component.topbar.TopBar.After.Companion.invoke (TopBar.kt:1927)");
            }
            int i3 = (i >> 12) & 14;
            int i4 = i << 3;
            int i5 = (i4 & 57344) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1895811935, i5, -1, "com.vk.core.compose.component.topbar.remember (AfterImpl.kt:56)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new com.vk.core.compose.component.topbar.a(cVar, bVar, bVar2, aVar);
                aVar2.R(x);
            }
            com.vk.core.compose.component.topbar.a aVar3 = (com.vk.core.compose.component.topbar.a) x;
            ((zak0) aVar3.c).setValue(cVar);
            ((zak0) aVar3.d).setValue(bVar);
            ((zak0) aVar3.e).setValue(bVar2);
            ((zak0) aVar3.f).setValue(aVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return aVar3;
        }
    }

    /* compiled from: TopBar.kt */
    public static abstract class b implements rzb0 {
        public final wh50<zhf0> a;
        public final wh50 b;
        public final wh50 c;

        /* compiled from: TopBar.kt */
        public static final class a extends b {
            public final wh50 d;
            public final wh50 e;
            public final wh50 f;
            public final wh50 g;
            public final wh50 h;
            public final wh50 i;
            public final wh50 j;

            /* compiled from: TopBar.kt */
            /* renamed from: com.vk.core.compose.component.topbar.d$b$a$a, reason: collision with other inner class name */
            public static final class C0757a {
                public static a a(lg90 lg90Var, String str, gzs gzsVar, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                    String str2 = (i2 & 2) != 0 ? null : str;
                    gzs gzsVar2 = (i2 & 4) != 0 ? null : gzsVar;
                    f7p0 f7p0Var2 = (i2 & 8) != 0 ? null : f7p0Var;
                    l5g l5gVar2 = (i2 & 16) != 0 ? null : l5gVar;
                    SemanticsConfiguration semanticsConfiguration2 = (i2 & 32) != 0 ? null : semanticsConfiguration;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1384697719, i, -1, "com.vk.core.compose.component.topbar.TopBar.After.Extra.Icon.Companion.invoke (TopBar.kt:1897)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        a aVar2 = new a(lg90Var, str2, gzsVar2, f7p0Var2, l5gVar2, semanticsConfiguration2);
                        aVar.R(aVar2);
                        x = aVar2;
                    }
                    a aVar3 = (a) x;
                    ((zak0) aVar3.d).setValue(lg90Var);
                    ((zak0) aVar3.f).setValue(str2);
                    ((zak0) aVar3.g).setValue(gzsVar2);
                    ((zak0) aVar3.h).setValue(f7p0Var2);
                    ((zak0) aVar3.e).setValue(l5gVar2);
                    ((zak0) aVar3.i).setValue(semanticsConfiguration2);
                    ((zak0) aVar3.j).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return aVar3;
                }
            }

            public a() {
                throw null;
            }

            public a(lg90 lg90Var, String str, gzs gzsVar, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration) {
                this.d = androidx.compose.runtime.k.b(lg90Var);
                this.e = androidx.compose.runtime.k.b(l5gVar);
                this.f = androidx.compose.runtime.k.b(str);
                this.g = androidx.compose.runtime.k.b(gzsVar);
                this.h = androidx.compose.runtime.k.b(f7p0Var);
                this.i = androidx.compose.runtime.k.b(semanticsConfiguration);
                this.j = androidx.compose.runtime.k.b(null);
            }

            @Override // com.vk.core.compose.component.topbar.d.b, xsna.rzb0
            public final zhf0 d() {
                return (zhf0) ((zak0) this.a).getValue();
            }

            @Override // com.vk.core.compose.component.topbar.d.b
            public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
                int i2;
                s3q0 s3q0Var;
                cri.a.C2678a c2678a;
                cri.a.b bVar;
                cri.a.c cVar;
                cri.a.d dVar;
                wh50 wh50Var;
                cri.a.e eVar;
                androidx.compose.runtime.a M = aVar.M(-1444041490);
                int i3 = i & 6;
                q630.a aVar2 = q630.a.a;
                if (i3 == 0) {
                    i2 = i | (M.J(aVar2) ? 4 : 2);
                } else {
                    i2 = i;
                }
                int i4 = i2 | (M.J(mtk0Var) ? 32 : 16) | (M.J(this) ? 256 : 128);
                if (M.t(i4 & 1, (i4 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1444041490, i4, -1, "com.vk.core.compose.component.topbar.TopBar.After.Extra.Icon.Content (TopBar.kt:1837)");
                    }
                    com.vk.core.compose.component.topbar.b z = znk0.z();
                    TopBar$Before.IconType iconType = TopBar$Before.IconType.Close;
                    q630 H = cdi.H(com.vk.core.compose.component.semantics.b.b(txj0.r(z.e(), aVar2), (SemanticsConfiguration) ((zak0) this.i).getValue()), this.a);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(M, d, cVar2);
                    cri.a.e eVar2 = cri.a.e;
                    k9q0.w(M, D, eVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(M, valueOf, bVar2);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(M, c2678a2);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(M, c, dVar2);
                    yzs yzsVar = (yzs) ((zak0) this.j).getValue();
                    if (yzsVar == null) {
                        M.K(-1358362705);
                        M.j();
                        s3q0Var = null;
                    } else {
                        M.K(-1358362704);
                        yzsVar.invoke(kai.c(223011217, new jn7(11, this, mtk0Var), M), M, 6);
                        M.j();
                        s3q0Var = s3q0.a;
                    }
                    wh50 wh50Var2 = this.g;
                    if (s3q0Var == null) {
                        M.K(-1357761397);
                        c2678a = c2678a2;
                        bVar = bVar2;
                        dVar = dVar2;
                        wh50Var = wh50Var2;
                        eVar = eVar2;
                        cVar = cVar2;
                        l.a((k) ((zak0) this.c).getValue(), (gzs) ((zak0) wh50Var2).getValue(), (lg90) ((zak0) this.d).getValue(), (String) ((zak0) this.f).getValue(), mtk0Var, aVar2, (l5g) ((zak0) this.e).getValue(), null, M, 197120 | ((i4 << 9) & 57344), 128);
                        M.j();
                    } else {
                        c2678a = c2678a2;
                        bVar = bVar2;
                        cVar = cVar2;
                        dVar = dVar2;
                        wh50Var = wh50Var2;
                        eVar = eVar2;
                        M.K(1895844365);
                        M.j();
                    }
                    f7p0 f7p0Var = (f7p0) ((zak0) this.h).getValue();
                    if (f7p0Var == null) {
                        M.K(-1357242334);
                    } else {
                        M.K(-1357242333);
                        q630 b = ra8.a.b(aVar2, dt1.a.d);
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = ir.h(M);
                        }
                        sg50 sg50Var = (sg50) x;
                        boolean z2 = ((gzs) ((zak0) wh50Var).getValue()) != null;
                        gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                        if (gzsVar == null) {
                            M.K(445934123);
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = new a7p0(0);
                                M.R(x2);
                            }
                            gzsVar = (gzs) x2;
                        } else {
                            M.K(-678352030);
                        }
                        M.j();
                        q630 b2 = ojc.b(b, sg50Var, null, z2, null, gzsVar, 24);
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c2 = qri.c(M, b2);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, d2, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar, M, c2678a);
                        k9q0.w(M, c2, dVar);
                        f7p0Var.a(aVar2, M, 6);
                        M.G();
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new jnc(this, mtk0Var, i);
                }
            }
        }

        public b() {
            wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
            this.a = b;
            this.b = b;
            this.c = androidx.compose.runtime.k.b(k.b.a);
        }

        @Override // xsna.rzb0
        public zhf0 d() {
            return (zhf0) ((zak0) this.b).getValue();
        }

        public abstract void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: TopBar.kt */
    public static abstract class c implements rzb0 {
        public final wh50<zhf0> a;
        public final wh50 b;
        public final wh50 c;

        /* compiled from: TopBar.kt */
        public static final class a extends c {
            public final wh50 d;
            public final wh50 e;
            public final wh50 f;
            public final wh50 g;
            public final wh50 h;
            public final wh50 i;
            public final wh50 j;

            public a(efj efjVar, ArrayList arrayList, k18 k18Var, z190 z190Var, pco pcoVar, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
                this.d = androidx.compose.runtime.k.b(efjVar);
                this.e = androidx.compose.runtime.k.b(new wow(arrayList));
                this.f = androidx.compose.runtime.k.b(k18Var);
                this.g = androidx.compose.runtime.k.b(z190Var);
                this.h = androidx.compose.runtime.k.b(pcoVar);
                this.i = androidx.compose.runtime.k.b(gzsVar);
                this.j = androidx.compose.runtime.k.b(semanticsConfiguration);
            }

            @Override // com.vk.core.compose.component.topbar.d.c
            public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
                float f;
                androidx.compose.runtime.a M = aVar.M(-1019818193);
                int i2 = (M.J(this) ? 256 : 128) | i;
                if (M.t(i2 & 1, (i2 & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1019818193, i2, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Avatar.Content (TopBar.kt:1672)");
                    }
                    q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.j).getValue());
                    wh50 wh50Var = this.i;
                    boolean z = ((gzs) ((zak0) wh50Var).getValue()) != null;
                    gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                    if (gzsVar == null) {
                        M.K(1195185713);
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new pdh0(3);
                            M.R(x);
                        }
                        gzsVar = (gzs) x;
                    } else {
                        M.K(-792729956);
                    }
                    M.j();
                    q630 c = ojc.c(b, z, null, null, gzsVar, 14);
                    znk0.z().getClass();
                    q630 D = s200.D(c, kqu0.t);
                    efj efjVar = (efj) ((zak0) this.d).getValue();
                    pco pcoVar = (pco) ((zak0) this.h).getValue();
                    if (pcoVar == null) {
                        M.K(-792723776);
                        znk0.z().getClass();
                        f = 32;
                        M.j();
                    } else {
                        M.K(-792724551);
                        M.j();
                        f = pcoVar.b;
                    }
                    ldu0.a(efjVar, f, ((wow) ((zak0) this.e).getValue()).b, D, (k18) ((zak0) this.f).getValue(), false, (z190) ((zak0) this.g).getValue(), null, null, M, 0, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new e5l(this, mtk0Var, i, 5);
                }
            }
        }

        /* compiled from: TopBar.kt */
        public static final class b extends c {
            public final xp8 d;

            /* compiled from: TopBar.kt */
            public static final class a {

                /* compiled from: TopBar.kt */
                /* renamed from: com.vk.core.compose.component.topbar.d$c$b$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0758a extends FunctionReferenceImpl implements izs<xp8, b> {
                    public static final C0758a b = new C0758a(1, b.class, "<init>", "<init>(Lcom/vk/core/compose/component/topbar/ButtonImpl;)V", 0);

                    @Override // xsna.izs
                    public final b invoke(xp8 xp8Var) {
                        return new b(xp8Var);
                    }
                }

                public static b a(String str, gzs gzsVar, boolean z, float f, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                    if ((i2 & 4) != 0) {
                        z = true;
                    }
                    boolean z2 = z;
                    if ((i2 & 8) != 0) {
                        f = 1.0f;
                    }
                    float f2 = f;
                    if ((i2 & 16) != 0) {
                        semanticsConfiguration = null;
                    }
                    SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1914587517, i, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Button.Companion.invoke (TopBar.kt:1754)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = C0758a.b;
                        aVar.R(x);
                    }
                    b bVar = (b) fai.D(str, gzsVar, z2, f2, semanticsConfiguration2, (izs) ((fcy) x), aVar, (i & 14) | 196608 | (i & 112) | (i & 896) | (i & 7168) | (57344 & i));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return bVar;
                }
            }

            public b(xp8 xp8Var) {
                this.d = xp8Var;
            }

            @Override // com.vk.core.compose.component.topbar.d.c
            public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
                androidx.compose.runtime.a M = aVar.M(-903471736);
                int i2 = (M.J(this) ? 256 : 128) | i;
                if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-903471736, i2, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Button.Content (TopBar.kt:1741)");
                    }
                    this.d.a(cdi.H(q630.a.a, this.a), M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wja(this, mtk0Var, i, 10);
                }
            }
        }

        /* compiled from: TopBar.kt */
        /* renamed from: com.vk.core.compose.component.topbar.d$c$c, reason: collision with other inner class name */
        public static final class C0759c {
            public static C0760d a(gzs gzsVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
                if ((i & 2) != 0) {
                    semanticsConfiguration = null;
                }
                SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1200268963, 0, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Close.invoke (TopBar.kt:1797)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b = or.b(aVar, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                C0760d a = C0760d.a.a(b, null, gzsVar, null, null, semanticsConfiguration2, aVar, 1572872, 26);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        /* compiled from: TopBar.kt */
        /* renamed from: com.vk.core.compose.component.topbar.d$c$d, reason: collision with other inner class name */
        public static final class C0760d extends c {
            public final wh50 d;
            public final wh50 e;
            public final wh50 f;
            public final wh50 g;
            public final wh50 h;
            public final wh50 i;

            /* compiled from: TopBar.kt */
            /* renamed from: com.vk.core.compose.component.topbar.d$c$d$a */
            public static final class a {
                public static C0760d a(lg90 lg90Var, String str, gzs gzsVar, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                    String str2 = (i2 & 2) != 0 ? null : str;
                    gzs gzsVar2 = (i2 & 4) != 0 ? null : gzsVar;
                    f7p0 f7p0Var2 = (i2 & 8) != 0 ? null : f7p0Var;
                    l5g l5gVar2 = (i2 & 16) != 0 ? null : l5gVar;
                    SemanticsConfiguration semanticsConfiguration2 = (i2 & 32) != 0 ? null : semanticsConfiguration;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2061579820, i, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Icon.Companion.invoke (TopBar.kt:1632)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        C0760d c0760d = new C0760d(lg90Var, str2, gzsVar2, f7p0Var2, l5gVar2, semanticsConfiguration2);
                        aVar.R(c0760d);
                        x = c0760d;
                    }
                    C0760d c0760d2 = (C0760d) x;
                    ((zak0) c0760d2.d).setValue(lg90Var);
                    ((zak0) c0760d2.f).setValue(str2);
                    ((zak0) c0760d2.g).setValue(gzsVar2);
                    ((zak0) c0760d2.h).setValue(f7p0Var2);
                    ((zak0) c0760d2.e).setValue(l5gVar2);
                    ((zak0) c0760d2.i).setValue(semanticsConfiguration2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return c0760d2;
                }
            }

            public C0760d() {
                throw null;
            }

            public C0760d(lg90 lg90Var, String str, gzs gzsVar, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration) {
                this.d = androidx.compose.runtime.k.b(lg90Var);
                this.e = androidx.compose.runtime.k.b(l5gVar);
                this.f = androidx.compose.runtime.k.b(str);
                this.g = androidx.compose.runtime.k.b(gzsVar);
                this.h = androidx.compose.runtime.k.b(f7p0Var);
                this.i = androidx.compose.runtime.k.b(semanticsConfiguration);
            }

            @Override // com.vk.core.compose.component.topbar.d.c, xsna.rzb0
            public final zhf0 d() {
                return (zhf0) ((zak0) this.a).getValue();
            }

            @Override // com.vk.core.compose.component.topbar.d.c
            public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
                androidx.compose.runtime.a M = aVar.M(336887375);
                int i2 = i | (M.J(mtk0Var) ? 32 : 16) | (M.J(this) ? 256 : 128);
                if (M.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(336887375, i2, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.Icon.Content (TopBar.kt:1587)");
                    }
                    com.vk.core.compose.component.topbar.b z = znk0.z();
                    TopBar$Before.IconType iconType = TopBar$Before.IconType.Close;
                    long e = z.e();
                    q630.a aVar2 = q630.a.a;
                    q630 H = cdi.H(com.vk.core.compose.component.semantics.b.b(txj0.r(e, aVar2), (SemanticsConfiguration) ((zak0) this.i).getValue()), this.a);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c, dVar);
                    k kVar = (k) ((zak0) this.c).getValue();
                    wh50 wh50Var = this.g;
                    l.a(kVar, (gzs) ((zak0) wh50Var).getValue(), (lg90) ((zak0) this.d).getValue(), (String) ((zak0) this.f).getValue(), mtk0Var, aVar2, (l5g) ((zak0) this.e).getValue(), null, M, 197120 | ((i2 << 9) & 57344), 128);
                    f7p0 f7p0Var = (f7p0) ((zak0) this.h).getValue();
                    if (f7p0Var == null) {
                        M.K(1218964141);
                    } else {
                        M.K(1218964142);
                        q630 b = ra8.a.b(aVar2, dt1.a.d);
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = ir.h(M);
                        }
                        sg50 sg50Var = (sg50) x;
                        boolean z2 = ((gzs) ((zak0) wh50Var).getValue()) != null;
                        gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                        if (gzsVar == null) {
                            M.K(-79665311);
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = new mg(29);
                                M.R(x2);
                            }
                            gzsVar = (gzs) x2;
                        } else {
                            M.K(1937092460);
                        }
                        M.j();
                        q630 b2 = ojc.b(b, sg50Var, null, z2, null, gzsVar, 24);
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        sy90 D2 = M.D();
                        q630 c2 = qri.c(M, b2);
                        if (M.N() == null) {
                            n34.r();
                            throw null;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, d2, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar, M, c2678a);
                        k9q0.w(M, c2, dVar);
                        f7p0Var.a(aVar2, M, 6);
                        M.G();
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new fc1(this, mtk0Var, i, 5);
                }
            }
        }

        /* compiled from: TopBar.kt */
        public static final class e {
        }

        /* compiled from: TopBar.kt */
        public static abstract class f extends c {

            /* compiled from: TopBar.kt */
            public static final class a {
                public static com.vk.core.compose.component.topbar.c a(long j, androidx.compose.runtime.a aVar) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(305767878, 48, -1, "com.vk.core.compose.component.topbar.TopBar.After.Main.ProgressIndicator.Companion.invoke (TopBar.kt:1764)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1441706052, 6, -1, "com.vk.core.compose.component.topbar.remember (ProgressIndicatorImpl.kt:36)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new com.vk.core.compose.component.topbar.c(j);
                        aVar.R(x);
                    }
                    com.vk.core.compose.component.topbar.c cVar = (com.vk.core.compose.component.topbar.c) x;
                    ((zak0) cVar.d).setValue(new l5g(j));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return cVar;
                }
            }
        }

        public c() {
            wh50<zhf0> b2 = androidx.compose.runtime.k.b(zhf0.e);
            this.a = b2;
            this.b = b2;
            this.c = androidx.compose.runtime.k.b(k.b.a);
        }

        @Override // xsna.rzb0
        public zhf0 d() {
            return (zhf0) ((zak0) this.b).getValue();
        }

        public abstract void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i);
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);

    public final k b() {
        return (k) ((zak0) this.b).getValue();
    }
}

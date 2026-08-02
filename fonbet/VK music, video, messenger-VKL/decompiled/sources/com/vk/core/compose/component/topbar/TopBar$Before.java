package com.vk.core.compose.component.topbar;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import ru.ok.android.commons.http.Http;
import xsna.a8j0;
import xsna.ao1;
import xsna.asp;
import xsna.cdi;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.efj;
import xsna.f7p0;
import xsna.gzs;
import xsna.ir;
import xsna.ja8;
import xsna.k18;
import xsna.k9q0;
import xsna.kka;
import xsna.kqu0;
import xsna.l5g;
import xsna.ldu0;
import xsna.lg90;
import xsna.mka;
import xsna.n34;
import xsna.ohf;
import xsna.ojc;
import xsna.or;
import xsna.pco;
import xsna.phw;
import xsna.q630;
import xsna.qri;
import xsna.ra8;
import xsna.rep;
import xsna.rzb0;
import xsna.s200;
import xsna.sg50;
import xsna.sy90;
import xsna.tgp;
import xsna.txj0;
import xsna.ur;
import xsna.wep;
import xsna.wh50;
import xsna.wow;
import xsna.xp8;
import xsna.xyc;
import xsna.y6g;
import xsna.z190;
import xsna.zak0;
import xsna.zbo;
import xsna.zhf0;
import xsna.znk0;
import xsna.zrp;

/* compiled from: TopBar.kt */
/* loaded from: classes17.dex */
public abstract class TopBar$Before {
    public final wh50<Float> a = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final wh50 b = androidx.compose.runtime.k.b(k.b.a);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TopBar.kt */
    public static final class IconType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;
        public static final IconType Chevron;
        public static final IconType Close;
        public static final IconType Dropdown;
        public static final IconType Icon;

        static {
            IconType iconType = new IconType("Close", 0);
            Close = iconType;
            IconType iconType2 = new IconType("Chevron", 1);
            Chevron = iconType2;
            IconType iconType3 = new IconType("Dropdown", 2);
            Dropdown = iconType3;
            IconType iconType4 = new IconType("Icon", 3);
            Icon = iconType4;
            IconType[] iconTypeArr = {iconType, iconType2, iconType3, iconType4};
            $VALUES = iconTypeArr;
            $ENTRIES = new asp(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    /* compiled from: TopBar.kt */
    public static final class a extends TopBar$Before implements rzb0 {
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;
        public final wh50 h;
        public final wh50 i;
        public final wh50 j;
        public final wh50<zhf0> k;
        public final wh50 l;

        /* compiled from: TopBar.kt */
        /* renamed from: com.vk.core.compose.component.topbar.TopBar$Before$a$a, reason: collision with other inner class name */
        public static final class C0750a {
            public static a a(efj efjVar, List list, pco pcoVar, k18 k18Var, z190 z190Var, gzs gzsVar, gzs gzsVar2, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1405158745, i, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Avatar.Companion.invoke (TopBar.kt:234)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    a aVar2 = new a(efjVar, list, pcoVar, k18Var, z190Var, gzsVar, gzsVar2, semanticsConfiguration);
                    aVar.R(aVar2);
                    x = aVar2;
                }
                a aVar3 = (a) x;
                ((zak0) aVar3.c).setValue(efjVar);
                ((zak0) aVar3.d).setValue(new wow(list));
                ((zak0) aVar3.f).setValue(k18Var);
                ((zak0) aVar3.g).setValue(z190Var);
                ((zak0) aVar3.e).setValue(pcoVar);
                ((zak0) aVar3.j).setValue(semanticsConfiguration);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return aVar3;
            }

            public static a b(phw phwVar, gzs gzsVar, gzs gzsVar2, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                rep repVar = rep.a;
                znk0.z().getClass();
                pco pcoVar = new pco(28);
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 128) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1483308822, i, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Avatar.Companion.invoke (TopBar.kt:213)");
                }
                a a = a(phwVar, Collections.singletonList(repVar), pcoVar, wep.a, tgp.a, gzsVar, gzsVar2, aVar3, aVar2, i & 268435342);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return a;
            }
        }

        public a(efj efjVar, List list, pco pcoVar, k18 k18Var, z190 z190Var, gzs gzsVar, gzs gzsVar2, SemanticsConfiguration semanticsConfiguration) {
            this.c = androidx.compose.runtime.k.b(efjVar);
            this.d = androidx.compose.runtime.k.b(new wow(list));
            this.e = androidx.compose.runtime.k.b(pcoVar);
            this.f = androidx.compose.runtime.k.b(k18Var);
            this.g = androidx.compose.runtime.k.b(z190Var);
            this.h = androidx.compose.runtime.k.b(gzsVar);
            this.i = androidx.compose.runtime.k.b(gzsVar2);
            this.j = androidx.compose.runtime.k.b(semanticsConfiguration);
            wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
            this.k = b;
            this.l = b;
        }

        @Override // xsna.rzb0
        public final zhf0 d() {
            return (zhf0) ((zak0) this.l).getValue();
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            float f;
            androidx.compose.runtime.a M = aVar.M(-1990737348);
            if ((i & 48) == 0) {
                i2 = (M.J(this) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if (M.t(i2 & 1, (i2 & 17) != 16)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1990737348, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Avatar.Content (TopBar.kt:178)");
                }
                M.K(-1838133297);
                SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.j).getValue();
                q630.a aVar2 = q630.a.a;
                q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
                znk0.z().getClass();
                q630 D = s200.D(b, kqu0.t);
                wh50 wh50Var = this.h;
                gzs gzsVar = (gzs) ((zak0) wh50Var).getValue();
                wh50 wh50Var2 = this.i;
                if (gzsVar != null || ((gzs) ((zak0) wh50Var2).getValue()) != null) {
                    gzs gzsVar2 = (gzs) ((zak0) wh50Var).getValue();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (gzsVar2 == null) {
                        M.K(1725614536);
                        Object x = M.x();
                        if (x == c0012a) {
                            x = new a8j0(7);
                            M.R(x);
                        }
                        gzsVar2 = (gzs) x;
                    } else {
                        M.K(1164043301);
                    }
                    M.j();
                    gzs gzsVar3 = gzsVar2;
                    gzs gzsVar4 = (gzs) ((zak0) wh50Var2).getValue();
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = ir.h(M);
                    }
                    D = D.g(ojc.d(aVar2, (sg50) x2, null, true, null, gzsVar4, gzsVar3, 440));
                }
                M.j();
                q630 H = cdi.H(D, this.k);
                efj efjVar = (efj) ((zak0) this.c).getValue();
                pco pcoVar = (pco) ((zak0) this.e).getValue();
                if (pcoVar == null) {
                    M.K(-1838113675);
                    znk0.z().getClass();
                    f = 28;
                    M.j();
                } else {
                    M.K(-1838114667);
                    M.j();
                    f = pcoVar.b;
                }
                ldu0.a(efjVar, f, ((wow) ((zak0) this.d).getValue()).b, H, (k18) ((zak0) this.f).getValue(), false, (z190) ((zak0) this.g).getValue(), null, null, M, 0, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new zbo(this, q630Var, i, 2);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class b extends TopBar$Before {
        public final xp8 c;

        public b(xp8 xp8Var) {
            this.c = xp8Var;
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-97813547);
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
                    androidx.compose.runtime.b.f(-97813547, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Button.Content (TopBar.kt:492)");
                }
                this.c.a(q630Var, M, i2 & 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new xyc(this, q630Var, i, 6);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class c extends TopBar$Before {
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;

        public c() {
            throw null;
        }

        public c(String str) {
            this.c = androidx.compose.runtime.k.b(str);
            this.d = androidx.compose.runtime.k.b(null);
            this.e = androidx.compose.runtime.k.b(null);
            this.f = androidx.compose.runtime.k.b(null);
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1651116296);
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
                    androidx.compose.runtime.b.f(1651116296, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Camera.Content (TopBar.kt:458)");
                }
                k kVar = (k) ((zak0) this.b).getValue();
                gzs gzsVar = (gzs) ((zak0) this.e).getValue();
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.f).getValue());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1143959078, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CameraOutline28> (VkSdkIcons.kt:202)");
                }
                lg90 b2 = or.b(M, -880424453, R.drawable.vk_icon_camera_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l.a(kVar, gzsVar, b2, (String) ((zak0) this.c).getValue(), this.a, b, (l5g) ((zak0) this.d).getValue(), null, M, 512, 128);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new kka(this, q630Var, i, 3);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class d extends TopBar$Before {
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;

        /* compiled from: TopBar.kt */
        public static final class a {
            public static d a(String str, gzs gzsVar, l5g l5gVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                if ((i2 & 1) != 0) {
                    str = null;
                }
                if ((i2 & 2) != 0) {
                    gzsVar = null;
                }
                if ((i2 & 4) != 0) {
                    l5gVar = null;
                }
                if ((i2 & 8) != 0) {
                    semanticsConfiguration = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-106024694, i, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Cancel.Companion.invoke (TopBar.kt:436)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new d(str, gzsVar, l5gVar, semanticsConfiguration);
                    aVar.R(x);
                }
                d dVar = (d) x;
                ((zak0) dVar.c).setValue(str);
                ((zak0) dVar.e).setValue(gzsVar);
                ((zak0) dVar.d).setValue(l5gVar);
                ((zak0) dVar.f).setValue(semanticsConfiguration);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return dVar;
            }
        }

        public d() {
            throw null;
        }

        public d(String str, gzs gzsVar, l5g l5gVar, SemanticsConfiguration semanticsConfiguration) {
            this.c = androidx.compose.runtime.k.b(str);
            this.d = androidx.compose.runtime.k.b(l5gVar);
            this.e = androidx.compose.runtime.k.b(gzsVar);
            this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1030946531);
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
                    androidx.compose.runtime.b.f(-1030946531, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Cancel.Content (TopBar.kt:415)");
                }
                k kVar = (k) ((zak0) this.b).getValue();
                gzs gzsVar = (gzs) ((zak0) this.e).getValue();
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.f).getValue());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-218864772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel28> (VkSdkIcons.kt:236)");
                }
                lg90 b2 = or.b(M, -439898899, R.drawable.vk_icon_cancel_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l.a(kVar, gzsVar, b2, (String) ((zak0) this.c).getValue(), this.a, b, (l5g) ((zak0) this.d).getValue(), null, M, 512, 128);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new ohf(this, q630Var, i, 3);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class e extends TopBar$Before implements rzb0 {
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;
        public final wh50 h;
        public final wh50<zhf0> i;
        public final wh50 j;

        /* compiled from: TopBar.kt */
        public static final class a {
            public static e a(lg90 lg90Var, String str, gzs gzsVar, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
                String str2 = (i2 & 2) != 0 ? null : str;
                f7p0 f7p0Var2 = (i2 & 8) != 0 ? null : f7p0Var;
                l5g l5gVar2 = (i2 & 16) != 0 ? null : l5gVar;
                SemanticsConfiguration semanticsConfiguration2 = (i2 & 32) != 0 ? null : semanticsConfiguration;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2070157670, i, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Icon.Companion.invoke (TopBar.kt:312)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    e eVar = new e(lg90Var, str2, gzsVar, f7p0Var2, l5gVar2, semanticsConfiguration2);
                    aVar.R(eVar);
                    x = eVar;
                }
                e eVar2 = (e) x;
                wh50 wh50Var = eVar2.c;
                wh50 wh50Var2 = eVar2.g;
                ((zak0) wh50Var).setValue(lg90Var);
                ((zak0) eVar2.e).setValue(str2);
                ((zak0) eVar2.f).setValue(gzsVar);
                ((zak0) wh50Var2).setValue(f7p0Var2);
                ((zak0) wh50Var2).setValue((f7p0) ((zak0) wh50Var2).getValue());
                ((zak0) eVar2.d).setValue(l5gVar2);
                ((zak0) eVar2.h).setValue(semanticsConfiguration2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return eVar2;
            }
        }

        public e() {
            throw null;
        }

        public e(lg90 lg90Var, String str, gzs gzsVar, f7p0 f7p0Var, l5g l5gVar, SemanticsConfiguration semanticsConfiguration) {
            this.c = androidx.compose.runtime.k.b(lg90Var);
            this.d = androidx.compose.runtime.k.b(l5gVar);
            this.e = androidx.compose.runtime.k.b(str);
            this.f = androidx.compose.runtime.k.b(gzsVar);
            this.g = androidx.compose.runtime.k.b(f7p0Var);
            this.h = androidx.compose.runtime.k.b(semanticsConfiguration);
            wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
            this.i = b;
            this.j = b;
        }

        @Override // xsna.rzb0
        public final zhf0 d() {
            return (zhf0) ((zak0) this.j).getValue();
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(243928092);
            if ((i & 6) == 0) {
                i2 = i | (M.J(q630Var) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(243928092, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Before.Icon.Content (TopBar.kt:275)");
                }
                com.vk.core.compose.component.topbar.b z = znk0.z();
                IconType iconType = IconType.Icon;
                q630 H = cdi.H(com.vk.core.compose.component.semantics.b.b(txj0.r(z.e(), q630Var), (SemanticsConfiguration) ((zak0) this.h).getValue()), this.i);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, H);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
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
                k kVar = (k) ((zak0) this.b).getValue();
                gzs gzsVar = (gzs) ((zak0) this.f).getValue();
                lg90 lg90Var = (lg90) ((zak0) this.c).getValue();
                String str = (String) ((zak0) this.e).getValue();
                l5g l5gVar = (l5g) ((zak0) this.d).getValue();
                wh50<Float> wh50Var = this.a;
                q630.a aVar3 = q630.a.a;
                l.a(kVar, gzsVar, lg90Var, str, wh50Var, aVar3, l5gVar, iconType, M, 12780032, 0);
                f7p0 f7p0Var = (f7p0) ((zak0) this.g).getValue();
                if (f7p0Var == null) {
                    M.K(385296340);
                } else {
                    M.K(385296341);
                    q630 r = txj0.r(znk0.z().e(), aVar3);
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, r);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    f7p0Var.a(ra8.a.b(aVar3, dt1.a.d), M, 0);
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
                s.d = new mka(this, q630Var, i, 3);
            }
        }
    }

    /* compiled from: TopBar.kt */
    public static final class f extends TopBar$Before implements rzb0 {
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;
        public final wh50<zhf0> h;
        public final wh50 i;

        public f() {
            throw null;
        }

        public f(IconType iconType, String str, f7p0 f7p0Var, gzs gzsVar, SemanticsConfiguration semanticsConfiguration) {
            this.c = androidx.compose.runtime.k.b(iconType);
            this.d = androidx.compose.runtime.k.b(f7p0Var);
            this.e = androidx.compose.runtime.k.b(str);
            this.f = androidx.compose.runtime.k.b(gzsVar);
            this.g = androidx.compose.runtime.k.b(semanticsConfiguration);
            wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
            this.h = b;
            this.i = b;
        }

        @Override // com.vk.core.compose.component.topbar.TopBar$Before
        public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-49441763);
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
                    androidx.compose.runtime.b.f(-49441763, i2, -1, "com.vk.core.compose.component.topbar.TopBar.Before.LegoIcon.Content (TopBar.kt:352)");
                }
                com.vk.core.compose.component.topbar.b z = znk0.z();
                wh50 wh50Var = this.c;
                q630 H = cdi.H(com.vk.core.compose.component.semantics.b.b(txj0.r(z.e(), q630Var), (SemanticsConfiguration) ((zak0) this.g).getValue()), this.h);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, H);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
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
                k kVar = (k) ((zak0) this.b).getValue();
                gzs gzsVar = (gzs) ((zak0) this.f).getValue();
                com.vk.core.compose.component.topbar.b z2 = znk0.z();
                z2.getClass();
                M.K(-994737235);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-994737235, 0, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.beforeIconPainter (MilkshakeTopBarDefaults.kt:107)");
                }
                y6g y6gVar = new y6g(l5g.j);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                String str = (String) ((zak0) this.e).getValue();
                IconType iconType = (IconType) ((zak0) wh50Var).getValue();
                wh50<Float> wh50Var2 = this.a;
                q630.a aVar3 = q630.a.a;
                l.a(kVar, gzsVar, y6gVar, str, wh50Var2, aVar3, null, iconType, M, 197120, 64);
                f7p0 f7p0Var = (f7p0) ((zak0) this.d).getValue();
                if (f7p0Var == null) {
                    M.K(-222236136);
                } else {
                    M.K(-222236135);
                    com.vk.core.compose.component.topbar.b z3 = znk0.z();
                    q630 r = txj0.r(z3.e(), aVar3);
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, r);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    f7p0Var.a(ra8.a.b(aVar3, dt1.a.d), M, 0);
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
                s.d = new ao1(this, q630Var, i, 4);
            }
        }
    }

    public abstract void e(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}

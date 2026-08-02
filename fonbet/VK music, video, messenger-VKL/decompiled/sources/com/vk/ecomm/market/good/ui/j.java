package com.vk.ecomm.market.good.ui;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.market.good.ui.a;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.a690;
import xsna.a6d0;
import xsna.ahn;
import xsna.alb0;
import xsna.au00;
import xsna.bhu0;
import xsna.byc0;
import xsna.ck70;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.d9c;
import xsna.drm0;
import xsna.dt1;
import xsna.e43;
import xsna.es3;
import xsna.f7c;
import xsna.fcy;
import xsna.frv0;
import xsna.gp;
import xsna.gzs;
import xsna.hid0;
import xsna.hr80;
import xsna.i3h;
import xsna.i7c;
import xsna.iu6;
import xsna.ja8;
import xsna.jai;
import xsna.jjd0;
import xsna.k9q0;
import xsna.lg90;
import xsna.n34;
import xsna.nfe;
import xsna.pg90;
import xsna.q630;
import xsna.qq0;
import xsna.qri;
import xsna.qzu0;
import xsna.r8t;
import xsna.rbg0;
import xsna.rrv0;
import xsna.s0i0;
import xsna.s200;
import xsna.s3q0;
import xsna.sbg0;
import xsna.sy90;
import xsna.szw;
import xsna.txj0;
import xsna.uco;
import xsna.ur;
import xsna.us2;
import xsna.wuv0;
import xsna.wzs;
import xsna.xpy;
import xsna.xyc;
import xsna.yjk;
import xsna.ylu0;
import xsna.yqv0;
import xsna.z170;
import xsna.zid0;
import xsna.zq;
import xsna.zt00;
import xsna.zv9;

/* compiled from: ProductButtonsBinderRefactoredImpl.kt */
/* loaded from: classes18.dex */
public final class j implements com.vk.ecomm.market.good.ui.d {
    public final ComposeView a;
    public final zid0 b;

    /* compiled from: ProductButtonsBinderRefactoredImpl.kt */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* compiled from: ProductButtonsBinderRefactoredImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).a();
            return s3q0.a;
        }
    }

    /* compiled from: ProductButtonsBinderRefactoredImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).a();
            return s3q0.a;
        }
    }

    /* compiled from: ProductButtonsBinderRefactoredImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).b();
            return s3q0.a;
        }
    }

    static {
        int i = ComposeView.n;
    }

    public j(ComposeView composeView, zid0 zid0Var) {
        this.a = composeView;
        this.b = zid0Var;
    }

    @Override // com.vk.ecomm.market.good.ui.d
    public final void a(com.vk.ecomm.market.good.ui.c cVar) {
        this.a.setContent(new jai(-1615463800, new f7c(5, cVar, this), true));
    }

    public final void b(final zv9 zv9Var, final boolean z, final boolean z2, final a aVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        int i3;
        int i4;
        String a2;
        boolean z3;
        a.C0011a.C0012a c0012a;
        a.C0011a.C0012a c0012a2;
        fcy fcyVar;
        a.C0011a.C0012a c0012a3;
        androidx.compose.runtime.a M = aVar2.M(510408056);
        if ((i & 6) == 0) {
            i2 = (M.J(zv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(510408056, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.CartButton (ProductButtonsBinderRefactoredImpl.kt:257)");
            }
            boolean o = M.o(zv9Var.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a4 = a.C0011a.a;
            if (o || x == c0012a4) {
                x = Boolean.valueOf(zv9Var.a > 0);
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            ButtonStyle buttonStyle = booleanValue ? ButtonStyle.Primary : z2 ? ButtonStyle.Secondary : ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = booleanValue ? ButtonAppearance.Positive : ButtonAppearance.Accent;
            if (booleanValue) {
                a2 = zq.a(M, 875892936, R.string.product_card_go_to_cart, M, 0);
            } else {
                if (z) {
                    i3 = 875895598;
                    i4 = R.string.market_cta_button_add_to_cart;
                } else {
                    i3 = 875897984;
                    i4 = R.string.market_cart_add;
                }
                a2 = zq.a(M, i3, i4, M, 0);
            }
            String str = a2;
            if (booleanValue) {
                M.K(1383141393);
                boolean z4 = (i2 & 7168) == 2048;
                Object x2 = M.x();
                if (z4 || x2 == c0012a4) {
                    z3 = false;
                    c0012a3 = c0012a4;
                    h hVar = new h(0, aVar, a.class, "onGoToCartClick", "onGoToCartClick()V", 0);
                    M.R(hVar);
                    x2 = hVar;
                } else {
                    c0012a3 = c0012a4;
                    z3 = false;
                }
                fcyVar = (fcy) x2;
                M.j();
                c0012a2 = c0012a3;
            } else {
                z3 = false;
                M.K(1383187056);
                boolean z5 = (i2 & 7168) == 2048;
                Object x3 = M.x();
                if (z5) {
                    c0012a = c0012a4;
                } else {
                    c0012a = c0012a4;
                    if (x3 != c0012a) {
                        c0012a2 = c0012a;
                        fcyVar = (fcy) x3;
                        M.j();
                    }
                }
                c0012a2 = c0012a;
                x3 = new i(0, aVar, a.class, "onAddToCartClick", "onAddToCartClick()V", 0);
                M.R(x3);
                fcyVar = (fcy) x3;
                M.j();
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ButtonSize buttonSize = ButtonSize.Large;
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? true : z3)) {
                szw.a("invalid weight; must be greater than zero");
            }
            bhu0.e((gzs) fcyVar, buttonSize, buttonStyle, buttonAppearance, ahn.E(new xpy(1.0f, true), "cart_button_tag"), null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, 48, 0, 0, 4190176);
            if (booleanValue) {
                M.K(-2116710525);
                int i5 = i2 & 7168;
                boolean z6 = i5 == 2048 ? true : z3;
                Object x4 = M.x();
                a.C0011a.C0012a c0012a5 = c0012a2;
                if (z6 || x4 == c0012a5) {
                    f fVar = new f(0, aVar, a.class, "onIncrementClick", "onIncrementClick()V", 0);
                    M.R(fVar);
                    x4 = fVar;
                }
                gzs gzsVar = (gzs) ((fcy) x4);
                boolean z7 = i5 == 2048 ? true : z3;
                Object x5 = M.x();
                if (z7 || x5 == c0012a5) {
                    g gVar = new g(0, aVar, a.class, "onDecrementClick", "onDecrementClick()V", 0);
                    M.R(gVar);
                    x5 = gVar;
                }
                c(zv9Var, gzsVar, (gzs) ((fcy) x5), null, M, (i2 & 14) | ((i2 >> 3) & 57344));
            } else {
                M.K(-2127498618);
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
            s.d = new wzs() { // from class: xsna.djd0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.ecomm.market.good.ui.j.this.b(zv9Var, z, z2, aVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(zv9 zv9Var, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-584496344);
        if ((i & 6) == 0) {
            i2 = (M.J(zv9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-584496344, i3, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.CartQuantityControl (ProductButtonsBinderRefactoredImpl.kt:309)");
            }
            int i4 = i3 << 3;
            q630.a aVar2 = q630.a.a;
            jjd0.a(zv9Var.a, zv9Var.b, gzsVar, gzsVar2, true, aVar2, M, (i4 & 7168) | (i4 & 896) | 24576 | ((i3 << 6) & 458752), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new es3(this, zv9Var, gzsVar, gzsVar2, q630Var2, i, 2);
        }
    }

    public final void d(hid0 hid0Var, a aVar, androidx.compose.runtime.a aVar2, int i) {
        a aVar3;
        androidx.compose.runtime.a M = aVar2.M(2032900414);
        int i2 = i | (M.J(hid0Var) ? 4 : 2) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2032900414, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.Content (ProductButtonsBinderRefactoredImpl.kt:57)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 E = s200.E(txj0.f(aVar4, 1.0f), 16, 12);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, E);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            int i3 = i2 << 3;
            int i4 = i3 & 112;
            int i5 = (i2 & 896) | 6 | i4;
            e(hid0Var, M, i5);
            int i6 = (i3 & 7168) | i4 | 390;
            aVar3 = aVar;
            h(hid0Var, aVar3, M, i6);
            k(hid0Var, M, i5);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = aVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 7, this, hid0Var, aVar3);
        }
    }

    public final void e(hid0 hid0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(694515477);
        if ((i & 48) == 0) {
            i2 = (M.J(hid0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(694515477, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.LegalDisclaimer (ProductButtonsBinderRefactoredImpl.kt:321)");
            }
            String str = hid0Var.c;
            if (str == null) {
                M.K(1453269196);
                M.j();
            } else {
                M.K(1453269197);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.m0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                q630.a aVar2 = q630.a.a;
                yqv0.c(str, txj0.f(aVar2, 1.0f), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8184);
                M = M;
                ck70.b(aVar2, 16, M, 6);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xyc(this, hid0Var, i, 4);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-445295679);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-445295679, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.OzonPrimaryButton (ProductButtonsBinderRefactoredImpl.kt:209)");
            }
            String N = d370.N(R.string.market_card_ozon_cta_button_title, 0, M);
            qzu0.a.getClass();
            lg90 G0 = qzu0.G0(M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new uco(byc0.b(53, 20));
                M.R(x);
            }
            zt00.a(gzsVar, ButtonStyle.Primary, ButtonAppearance.Accent, ahn.E(q630Var, "ozon_button_tag"), null, au00.b.a.a(N, null, G0, new uco(((uco) x).a), d370.N(R.string.ozon_primary_button_logo_accessibility_text, 0, M), null, null, M, 805331456, ApiInvocationException.ErrorCodes.PRIVACY_RESTRICTION), false, null, null, M, (i2 & 14) | Tensorflow.FRAME_WIDTH, 2000);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6d0(this, gzsVar, q630Var, i, 1);
        }
    }

    public final void g(com.vk.ecomm.market.good.ui.a aVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-376854400);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(aVar) : M.y(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(this) : M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-376854400, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.PrimaryButton (ProductButtonsBinderRefactoredImpl.kt:178)");
            }
            if (aVar instanceof a.b) {
                M.K(-1379817738);
                m((a.b) aVar, gzsVar, q630Var, M, i2 & 8176);
                M.j();
            } else {
                if (!(aVar instanceof a.C0947a)) {
                    throw alb0.c(-1379819757, M);
                }
                M.K(-1379814652);
                f((i2 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, M, gzsVar, q630Var);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z170(i, 1, this, aVar, gzsVar, q630Var);
        }
    }

    public final void h(hid0 hid0Var, a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(-856446685);
        if ((i & 48) == 0) {
            i2 = (M.J(hid0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(this) : M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-856446685, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.ProductButtons (ProductButtonsBinderRefactoredImpl.kt:79)");
            }
            if (hid0Var.d) {
                M.K(1997724464);
                i(hid0Var, aVar, M, (i2 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            } else {
                M.K(1997808722);
                j(hid0Var, aVar, M, (i2 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iu6(i, 3, this, hid0Var, aVar);
        }
    }

    public final void i(final hid0 hid0Var, final a aVar, androidx.compose.runtime.a aVar2, final int i) {
        Object obj;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(167942086);
        int i2 = (i & 6) == 0 ? (M.J(hid0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= M.J(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(this) : M.y(this) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(167942086, i3, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.ProductsButtonsHorizontal (ProductButtonsBinderRefactoredImpl.kt:129)");
            }
            List<yjk> list = hid0Var.a;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof zv9) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (!(obj instanceof zv9)) {
                obj = null;
            }
            zv9 zv9Var = (zv9) obj;
            if (zv9Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.cjd0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            int I = ne7.I(i | 1);
                            com.vk.ecomm.market.good.ui.j.this.i(hid0Var, aVar, (androidx.compose.runtime.a) obj2, I);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            int i4 = zv9Var.a;
            boolean o = M.o(i4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = Boolean.valueOf(i4 > 0);
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            a.j g = androidx.compose.foundation.layout.a.g(12);
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (booleanValue) {
                M.K(321496812);
                b(zv9Var, true, false, aVar, txj0.f(aVar4, 1.0f), M, ((i3 << 6) & 7168) | 25008 | ((i3 << 9) & 458752));
                M.j();
            } else {
                androidx.compose.runtime.a aVar6 = M;
                aVar6.K(321820638);
                for (yjk yjkVar : list) {
                    if (yjkVar instanceof com.vk.ecomm.market.good.ui.a) {
                        aVar6.K(-341461249);
                        com.vk.ecomm.market.good.ui.a aVar7 = (com.vk.ecomm.market.good.ui.a) yjkVar;
                        boolean z = (i3 & 112) == 32;
                        Object x2 = aVar6.x();
                        if (z || x2 == c0012a) {
                            b bVar = new b(0, aVar, a.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0);
                            aVar6.R(bVar);
                            x2 = bVar;
                        }
                        gzs gzsVar = (gzs) ((fcy) x2);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        androidx.compose.runtime.a aVar8 = aVar6;
                        g(aVar7, gzsVar, new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), aVar8, (i3 << 3) & 7168);
                        aVar3 = aVar8;
                        aVar3.j();
                    } else {
                        aVar3 = aVar6;
                        if (yjkVar instanceof zv9) {
                            aVar3.K(-341115413);
                            zv9 zv9Var2 = (zv9) yjkVar;
                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            b(zv9Var2, true, true, aVar, new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), aVar3, ((i3 << 6) & 7168) | Tensorflow.FRAME_WIDTH | ((i3 << 9) & 458752));
                            aVar3.j();
                        } else {
                            aVar3.K(-2089200771);
                            aVar3.j();
                        }
                    }
                    aVar6 = aVar3;
                }
                M = aVar6;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new d9c(i, 3, this, hid0Var, aVar);
        }
    }

    public final void j(hid0 hid0Var, a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        q630.a aVar3;
        j jVar = this;
        androidx.compose.runtime.a M = aVar2.M(220736600);
        int i3 = (i & 6) == 0 ? (M.J(hid0Var) ? 4 : 2) | i : i;
        Object obj = aVar;
        if ((i & 48) == 0) {
            i3 |= M.J(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(jVar) : M.y(jVar) ? 256 : 128;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(220736600, i4, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.ProductsButtonsVertical (ProductButtonsBinderRefactoredImpl.kt:91)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(12);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c2 = qri.c(M, aVar4);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            M.K(-26264715);
            int i5 = 0;
            for (Object obj2 : hid0Var.a) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                yjk yjkVar = (yjk) obj2;
                boolean z = yjkVar instanceof com.vk.ecomm.market.good.ui.a;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    M.K(364578521);
                    com.vk.ecomm.market.good.ui.a aVar6 = (com.vk.ecomm.market.good.ui.a) yjkVar;
                    boolean z2 = (i4 & 112) == 32;
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        c cVar = new c(0, obj, a.class, "onPrimaryButtonClick", "onPrimaryButtonClick()V", 0);
                        M.R(cVar);
                        x = cVar;
                    }
                    jVar.g(aVar6, (gzs) ((fcy) x), txj0.f(aVar4, 1.0f), M, ((i4 << 3) & 7168) | 384);
                    M.j();
                } else if (yjkVar instanceof s0i0) {
                    M.K(364903091);
                    s0i0 s0i0Var = (s0i0) yjkVar;
                    boolean z3 = (i4 & 112) == 32;
                    Object x2 = M.x();
                    if (z3 || x2 == c0012a) {
                        d dVar = new d(0, aVar, a.class, "onSecondaryButtonClick", "onSecondaryButtonClick()V", 0);
                        M.R(dVar);
                        x2 = dVar;
                    }
                    l(s0i0Var, (gzs) ((fcy) x2), txj0.f(aVar4, 1.0f), M, ((i4 << 3) & 7168) | 384);
                    M.j();
                } else {
                    if (!(yjkVar instanceof zv9)) {
                        throw alb0.c(-403882502, M);
                    }
                    M.K(365231846);
                    zv9 zv9Var = (zv9) yjkVar;
                    int i7 = i5;
                    boolean z4 = hid0Var.d;
                    boolean z5 = i7 != 0;
                    int i8 = ((i4 << 6) & 7168) | 24576 | ((i4 << 9) & 458752);
                    i2 = i4;
                    aVar3 = aVar4;
                    androidx.compose.runtime.a aVar7 = M;
                    b(zv9Var, z4, z5, aVar, txj0.f(aVar4, 1.0f), aVar7, i8);
                    M = aVar7;
                    M.j();
                    jVar = this;
                    obj = aVar;
                    i4 = i2;
                    aVar4 = aVar3;
                    i5 = i6;
                }
                i2 = i4;
                aVar3 = aVar4;
                jVar = this;
                obj = aVar;
                i4 = i2;
                aVar4 = aVar3;
                i5 = i6;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i3h(i, 4, this, hid0Var, aVar);
        }
    }

    public final void k(hid0 hid0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        us2 a2;
        androidx.compose.runtime.a M = aVar.M(758841567);
        if ((i & 48) == 0) {
            i2 = (M.J(hid0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(758841567, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.ResponseTime (ProductButtonsBinderRefactoredImpl.kt:335)");
            }
            rbg0 rbg0Var = hid0Var.b;
            us2 us2Var = null;
            if (rbg0Var == null) {
                M.K(-2058553208);
                M.j();
                a2 = null;
            } else {
                M.K(-2058553207);
                a2 = sbg0.a(rbg0Var.a, rbg0Var.b, M);
                M.j();
            }
            if (a2 != null && !drm0.N(a2)) {
                us2Var = a2;
            }
            if (us2Var == null) {
                M.K(-2058322506);
            } else {
                M.K(-2058322505);
                q630.a aVar2 = q630.a.a;
                if (a690.d(aVar2, 8, M, 6)) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.m0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.d(us2Var, txj0.f(aVar2, 1.0f), ylu0Var.getText().p, 3, null, 0, false, 0, null, null, frv0Var, M, 48, 0, 8120);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i7c(this, hid0Var, i, 4);
        }
    }

    public final void l(s0i0 s0i0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        lg90 a2;
        androidx.compose.runtime.a M = aVar.M(161583388);
        if ((i & 6) == 0) {
            i2 = (M.J(s0i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(161583388, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.SecondaryButton (ProductButtonsBinderRefactoredImpl.kt:235)");
            }
            String str = s0i0Var.a;
            Integer num = s0i0Var.b;
            if (num == null) {
                M.K(-927358230);
                M.j();
                a2 = null;
            } else {
                M.K(-927358229);
                a2 = pg90.a(num.intValue(), 0, M);
                M.j();
            }
            aVar2 = M;
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Secondary, ButtonAppearance.Accent, ahn.E(q630Var, "secondary_button_tag"), null, false, false, a2, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | 1073745328, 0, 0, 4189664);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nfe(this, s0i0Var, gzsVar, q630Var, i, 1);
        }
    }

    public final void m(a.b bVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        lg90 a2;
        androidx.compose.runtime.a M = aVar.M(-3087443);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-3087443, i2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderRefactoredImpl.VKPrimaryButton (ProductButtonsBinderRefactoredImpl.kt:190)");
            }
            String str = bVar.a;
            Integer num = bVar.b;
            if (num == null) {
                M.K(-1783437479);
                M.j();
                a2 = null;
            } else {
                M.K(-1783437478);
                a2 = pg90.a(num.intValue(), 0, M);
                M.j();
            }
            aVar2 = M;
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, ahn.E(q630Var, "primary_button_tag"), null, false, false, a2, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | 1073745328, 0, 0, 4189664);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new r8t(this, bVar, gzsVar, q630Var, i, 1);
        }
    }
}

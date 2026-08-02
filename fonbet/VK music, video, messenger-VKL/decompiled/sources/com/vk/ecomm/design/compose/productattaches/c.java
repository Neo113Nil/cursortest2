package com.vk.ecomm.design.compose.productattaches;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.a8d;
import xsna.ahn;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.e5l;
import xsna.f9t;
import xsna.k9q0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.rbh;
import xsna.sw00;
import xsna.sy90;
import xsna.txj0;
import xsna.ur;
import xsna.wh50;
import xsna.wlb0;
import xsna.yqv0;
import xsna.zak0;

/* compiled from: VideoAttachTextContent.kt */
/* loaded from: classes18.dex */
public final class c {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final q630 e;
    public final q630 f;
    public final q630 g;
    public final q630 h;
    public final q630 i;

    /* compiled from: VideoAttachTextContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductVideoAttach.StatusType.values().length];
            try {
                iArr[ProductVideoAttach.StatusType.Adult.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(ProductVideoAttach.StatusType statusType, ProductVideoAttach.a aVar, String str, String str2) {
        this.a = k.b(str);
        this.b = k.b(str2);
        this.c = k.b(aVar);
        this.d = k.b(statusType);
        q630.a aVar2 = q630.a.a;
        this.e = txj0.h(aVar2, 4);
        this.f = txj0.v(aVar2, 6);
        this.g = ahn.E(aVar2, "title");
        this.h = ahn.E(aVar2, "price");
        this.i = ahn.E(aVar2, "discount");
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1980723675);
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
                androidx.compose.runtime.b.f(-1980723675, i2, -1, "com.vk.ecomm.design.compose.productattaches.VideoAttachTextContent.AdultContent (VideoAttachTextContent.kt:94)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.n, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            yqv0.c(d370.N(R.string.product_video_attach_status_badge_for_adults, 0, M), this.g, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).i0, aVar2, 0, 48, 6136);
            f9t.e(this.e, aVar2, 0);
            yqv0.c(d370.N(R.string.product_video_attach_confirm_age, 0, aVar2), this.h, wlb0.h(aVar2).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).l0, aVar2, 0, 0, 8184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new rbh(this, q630Var, i, 3);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1020749266);
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
                androidx.compose.runtime.b.f(1020749266, i2, -1, "com.vk.ecomm.design.compose.productattaches.VideoAttachTextContent.BaseContent (VideoAttachTextContent.kt:58)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.n, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            yqv0.c((String) ((zak0) this.a).getValue(), this.g, wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663296, 48, 5880);
            M = M;
            String str = (String) ((zak0) this.b).getValue();
            if (str == null || str.length() == 0) {
                M.K(508926842);
            } else {
                M.K(511642380);
                f9t.e(this.e, M, 0);
                androidx.compose.foundation.layout.k a3 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, q630.a.a);
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
                k9q0.w(M, a3, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                yqv0.c(str, this.h, wlb0.h(M).getText().d, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).l0, M, 0, 0, 8184);
                M = M;
                f9t.e(this.f, M, 0);
                ProductVideoAttach.a aVar3 = (ProductVideoAttach.a) ((zak0) this.c).getValue();
                if (aVar3 == null) {
                    M.K(403181950);
                } else {
                    M.K(403181951);
                    sw00.a(aVar3.a, this.i, null, M, 0, 4);
                }
                M.j();
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
        f s = M.s();
        if (s != null) {
            s.d = new a8d(this, q630Var, i, 5);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-956414645);
        int i2 = (M.J(q630Var) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-956414645, i2, -1, "com.vk.ecomm.design.compose.productattaches.VideoAttachTextContent.Content (VideoAttachTextContent.kt:45)");
            }
            if (a.$EnumSwitchMapping$0[((ProductVideoAttach.StatusType) ((zak0) this.d).getValue()).ordinal()] == 1) {
                M.K(264483105);
                a(q630Var, M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            } else {
                M.K(264558466);
                b(q630Var, M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new e5l(this, q630Var, i, 7);
        }
    }
}

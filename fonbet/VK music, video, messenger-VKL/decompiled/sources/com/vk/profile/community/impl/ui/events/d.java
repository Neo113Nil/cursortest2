package com.vk.profile.community.impl.ui.events;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.alb0;
import xsna.cp10;
import xsna.cri;
import xsna.crx0;
import xsna.d370;
import xsna.dt1;
import xsna.gzs;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.ldv0;
import xsna.lqy;
import xsna.muv0;
import xsna.n2h;
import xsna.n34;
import xsna.o2h;
import xsna.p2h;
import xsna.q0;
import xsna.q630;
import xsna.q9g;
import xsna.qri;
import xsna.qz5;
import xsna.s0;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.v78;
import xsna.x78;
import xsna.xvy;
import xsna.yu1;
import xsna.zfr0;
import xsna.zra0;

/* compiled from: CommunityEventsFragment.kt */
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: CommunityEventsFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityEventsState.Content.Items.Paging.values().length];
            try {
                iArr[CommunityEventsState.Content.Items.Paging.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityEventsState.Content.Items.Paging.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityEventsState.Content.Items.Paging.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1952637351);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1952637351, i2, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsEmpty (CommunityEventsFragment.kt:297)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ldv0.d(txj0.f(q630.a.a, 1.0f), null, zra0.a.a(null, null, d370.N(R.string.community_events_empty, 0, M), null, M, 196608, 27), null, null, null, false, M, 6, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p2h(q630Var, i, 0);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1493230497);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1493230497, i2, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsError (CommunityEventsFragment.kt:279)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new o2h(izsVar, 0);
                M.R(x);
            }
            ldv0.b(f, false, null, (gzs) x, M, 6, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qz5(izsVar, q630Var, i, 2);
        }
    }

    public static final void c(CommunityEventsState.Content.Items items, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1676336563);
        int i2 = i | (M.J(items) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1676336563, i2, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsItems (CommunityEventsFragment.kt:187)");
            }
            boolean z = items.b;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new q0(izsVar, 1);
                M.R(x);
            }
            xvy z3 = crx0.z(z, (gzs) x, 0, M, 0, 60);
            boolean z4 = ((i2 & 14) == 4) | (i3 == 32);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new yu1(5, items, izsVar);
                M.R(x2);
            }
            M = M;
            lqy.a(q630Var, z3, null, null, null, null, false, null, (izs) x2, M, (i2 >> 6) & 14, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s0(i, 6, items, izsVar, q630Var);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-901170552);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-901170552, i2, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsLoading (CommunityEventsFragment.kt:266)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zfr0.e(null, 0L, null, M, 0, 7);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n2h(q630Var, i, 0);
        }
    }

    public static final void e(CommunityEventsState communityEventsState, izs<? super com.vk.profile.community.impl.ui.events.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2551365);
        int i2 = i | (M.J(communityEventsState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2551365, i2, -1, "com.vk.profile.community.impl.ui.events.CommunityEventsScreen (CommunityEventsFragment.kt:123)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.community_events_top_bar_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            q630 f = txj0.f(aVar2, 1.0f);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new v78(izsVar, 1);
                M.R(x);
            }
            muv0.h(a3, f, null, null, e.a.a((gzs) x, d370.N(R.string.community_events_top_bar_back_description, 0, M), null, null, null, M, 196608, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            M = M;
            CommunityEventsState.Content content = communityEventsState.c;
            if (content instanceof CommunityEventsState.Content.c) {
                M.K(1040665715);
                d(q9g.a(txj0.f(aVar2, 1.0f), 1.0f), M, 0);
                M.j();
            } else if (content instanceof CommunityEventsState.Content.b) {
                M.K(1040889132);
                b((i2 >> 3) & 14, M, izsVar, q9g.a(txj0.f(aVar2, 1.0f), 1.0f));
                M.j();
            } else if (content instanceof CommunityEventsState.Content.a) {
                M.K(1041148757);
                a(q9g.a(txj0.f(aVar2, 1.0f), 1.0f), M, 0);
                M.j();
            } else {
                if (!(content instanceof CommunityEventsState.Content.Items)) {
                    throw alb0.c(1419042217, M);
                }
                M.K(1041371585);
                c((CommunityEventsState.Content.Items) communityEventsState.c, izsVar, q9g.a(txj0.f(aVar2, 1.0f), 1.0f), M, i3);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x78(communityEventsState, izsVar, i, 1);
        }
    }
}

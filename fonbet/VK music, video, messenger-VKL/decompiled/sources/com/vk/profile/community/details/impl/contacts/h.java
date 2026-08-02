package com.vk.profile.community.details.impl.contacts;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.y;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.ahn;
import xsna.alb0;
import xsna.ao50;
import xsna.be1;
import xsna.bhu0;
import xsna.bqg;
import xsna.bv1;
import xsna.cp10;
import xsna.cqg;
import xsna.cri;
import xsna.d370;
import xsna.d5f;
import xsna.dqg;
import xsna.dt1;
import xsna.ec2;
import xsna.edi;
import xsna.epx;
import xsna.eqg;
import xsna.f8s;
import xsna.fm50;
import xsna.fvr;
import xsna.g8s;
import xsna.gzs;
import xsna.h8s;
import xsna.i6v0;
import xsna.iu9;
import xsna.ixg;
import xsna.izs;
import xsna.ja8;
import xsna.jgz;
import xsna.jk50;
import xsna.k9q0;
import xsna.kqu0;
import xsna.lv7;
import xsna.mxr;
import xsna.n0u0;
import xsna.n34;
import xsna.nek0;
import xsna.nvu0;
import xsna.ok50;
import xsna.ong;
import xsna.or;
import xsna.p490;
import xsna.q630;
import xsna.qko0;
import xsna.qri;
import xsna.ra8;
import xsna.rgy;
import xsna.s0;
import xsna.s200;
import xsna.s2x;
import xsna.s3q0;
import xsna.sy90;
import xsna.tho0;
import xsna.txj0;
import xsna.u2x;
import xsna.uey;
import xsna.ur;
import xsna.uvi;
import xsna.vvr;
import xsna.w8;
import xsna.wh50;
import xsna.wje;
import xsna.wzs;
import xsna.yad;
import xsna.ybo0;
import xsna.yzs;
import xsna.yzt0;

/* compiled from: CommunityAddContactsView.kt */
/* loaded from: classes5.dex */
public final class h extends i6v0<eqg, com.vk.profile.community.details.impl.contacts.a> {

    /* compiled from: CommunityAddContactsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityAddContactsState.ContactField.ContactViewType.values().length];
            try {
                iArr[CommunityAddContactsState.ContactField.ContactViewType.CITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Pair l(CommunityAddContactsState.ContactField contactField, androidx.compose.runtime.a aVar, int i) {
        Pair pair;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1641812024, i, -1, "com.vk.profile.community.details.impl.contacts.CommunityAddContactsView.getFieldState (CommunityAddContactsView.kt:244)");
        }
        CommunityAddContactsState.ContactField.b bVar = contactField.b;
        if (epx.f(bVar, CommunityAddContactsState.ContactField.b.a.a)) {
            aVar.K(-134241703);
            aVar.j();
            pair = new Pair(InputSelect$State.Default, null);
        } else {
            if (!(bVar instanceof CommunityAddContactsState.ContactField.b.C1552b)) {
                throw alb0.c(-1528353055, aVar);
            }
            aVar.K(-134118323);
            InputSelect$State inputSelect$State = InputSelect$State.Error;
            String N = d370.N(((CommunityAddContactsState.ContactField.b.C1552b) bVar).a, 0, aVar);
            FormField$Style formField$Style = FormField$Style.Error;
            boolean z = (((i & 14) ^ 6) > 4 && aVar.y(contactField)) || (i & 6) == 4;
            Object x = aVar.x();
            if (z || x == a.C0011a.a) {
                x = new w8(contactField, 29);
                aVar.R(x);
            }
            pair = new Pair(inputSelect$State, f8s.a.a(N, formField$Style, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar, 3120, 0));
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return pair;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        k((eqg) ao50Var, izsVar, aVar, 512);
    }

    public final void h(CommunityAddContactsState.ContactField contactField, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-695742083);
        int i2 = i | (M.J(contactField) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-695742083, i2, -1, "com.vk.profile.community.details.impl.contacts.CommunityAddContactsView.CommunityContactSelectCityField (CommunityAddContactsView.kt:221)");
            }
            int i3 = i2 & 14;
            Pair l = l(contactField, M, i3 | 64 | ((i2 >> 3) & 112));
            CommunityAddContactsState.ContactField.a aVar2 = contactField.c;
            InputSelect$State inputSelect$State = (InputSelect$State) l.d();
            f8s f8sVar = (f8s) l.g();
            String str = contactField.a.a;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new ong(1, gzsVar);
                M.R(x);
            }
            gzs gzsVar2 = (gzs) x;
            String N = d370.N(aVar2.b, 0, M);
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new yad(contactField, 12);
                M.R(x2);
            }
            u2x a2 = g8s.b.a.a(s2x.b.a.a(str, gzsVar2, N, 0L, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 805306368, 248), inputSelect$State, false, null, M, 24576, 12);
            M = M;
            nvu0.a(a2, null, h8s.a.a(d370.N(aVar2.a, 0, M), false, null, null, null, M, 196608, 30), null, f8sVar, M, 0, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s0(i, 5, this, contactField, gzsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(final CommunityAddContactsState.ContactField contactField, final yzs<? super CommunityAddContactsState.ContactField.ContactViewType, ? super String, ? super qko0, s3q0> yzsVar, final wzs<? super CommunityAddContactsState.ContactField.ContactViewType, ? super Boolean, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long c;
        androidx.compose.runtime.a M = aVar.M(-639747828);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(contactField) : M.y(contactField) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(wzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(this) : M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-639747828, i2, -1, "com.vk.profile.community.details.impl.contacts.CommunityAddContactsView.CommunityContactTextInputFiled (CommunityAddContactsView.kt:165)");
            }
            CommunityAddContactsState.ContactField.c cVar = contactField.a;
            CommunityAddContactsState.ContactField.a aVar2 = contactField.c;
            String str = cVar.a;
            qko0 qko0Var = cVar.b;
            if (qko0Var != null) {
                c = qko0Var.a;
            } else {
                int length = str.length();
                c = jgz.c(length, length);
            }
            int i3 = i2 & 14;
            Pair l = l(contactField, M, i3 | 64 | ((i2 >> 6) & 112));
            InputSelect$State inputSelect$State = (InputSelect$State) l.d();
            f8s f8sVar = (f8s) l.g();
            int i4 = contactField.d == CommunityAddContactsState.ContactField.ContactViewType.PHONE ? 4 : 0;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = or.a(str, c, 4, M);
            }
            wh50 wh50Var = (wh50) x;
            vvr vvrVar = (vvr) M.r(uvi.i);
            nek0 nek0Var = (nek0) M.r(uvi.q);
            boolean z = (i3 == 4 || ((i2 & 8) != 0 && M.y(contactField))) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new y(5, wzsVar, contactField);
                M.R(x2);
            }
            q630 b = mxr.b(3, fvr.u(q630.a.a, (izs) x2), false);
            tho0 tho0Var = (tho0) wh50Var.getValue();
            rgy rgyVar = new rgy(i4, 7, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            boolean y = M.y(vvrVar) | M.J(nek0Var);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new bv1(7, vvrVar, nek0Var);
                M.R(x3);
            }
            uey ueyVar = new uey((izs) x3, null, null, 62);
            String N = d370.N(aVar2.b, 0, M);
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && M.y(contactField));
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new wje(contactField, 4);
                M.R(x4);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
            boolean z3 = ((i2 & 112) == 32) | (i3 == 4 || ((i2 & 8) != 0 && M.y(contactField)));
            Object x5 = M.x();
            if (z3 || x5 == c0012a) {
                x5 = new iu9(yzsVar, contactField, wh50Var, 2);
                M.R(x5);
            }
            ybo0 a3 = g8s.e.a.a(tho0Var, (izs) x5, N, inputSelect$State, 0, 1, false, rgyVar, ueyVar, null, a2, M, 196608, 24576, 7376);
            M = M;
            nvu0.a(a3, b, h8s.a.a(d370.N(aVar2.a, 0, M), false, null, null, null, M, 196608, 30), null, f8sVar, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.aqg
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.profile.community.details.impl.contacts.h.this.i(contactField, yzsVar, wzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(206723593);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(list) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(206723593, i3, -1, "com.vk.profile.community.details.impl.contacts.CommunityAddContactsView.CommunityContactsFields (CommunityAddContactsView.kt:128)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CommunityAddContactsState.ContactField contactField = (CommunityAddContactsState.ContactField) it.next();
                int i4 = a.$EnumSwitchMapping$0[contactField.d.ordinal()];
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i4 == 1) {
                    M.K(1076784502);
                    boolean z = (i3 & 14) == 4;
                    Object x = M.x();
                    if (z || x == c0012a) {
                        x = new lv7(izsVar, 1);
                        M.R(x);
                    }
                    h(contactField, (gzs) x, M, (i3 & 896) | 512);
                    M.j();
                } else {
                    M.K(1076791725);
                    int i5 = i3 & 14;
                    boolean z2 = i5 == 4;
                    Object x2 = M.x();
                    if (z2 || x2 == c0012a) {
                        x2 = new dqg(izsVar, 0);
                        M.R(x2);
                    }
                    yzs<? super CommunityAddContactsState.ContactField.ContactViewType, ? super String, ? super qko0, s3q0> yzsVar = (yzs) x2;
                    boolean z3 = i5 == 4;
                    Object x3 = M.x();
                    if (z3 || x3 == c0012a) {
                        x3 = new be1(izsVar, 1, (byte) 0);
                        M.R(x3);
                    }
                    i(contactField, yzsVar, (wzs) x3, M, ((i3 << 3) & 7168) | 4096);
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ec2(i, 1, this, izsVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(eqg eqgVar, izs<? super com.vk.profile.community.details.impl.contacts.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> cqgVar;
        wh50 c;
        androidx.compose.runtime.a M = aVar.M(-1683009901);
        int i2 = i | (M.J(eqgVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1683009901, i2, -1, "com.vk.profile.community.details.impl.contacts.CommunityAddContactsView.ThemedContent (CommunityAddContactsView.kt:75)");
            }
            int i3 = i2 & 896;
            fm50 fm50Var = (fm50) d(ok50.a, new n0u0[]{eqgVar.a}, M, 512 | i3).getValue();
            ixg ixgVar = fm50Var instanceof ixg ? (ixg) fm50Var : null;
            yzt0<i> yzt0Var = ixgVar != null ? ixgVar.a : null;
            if (yzt0Var == null) {
                M.K(900586405);
                M.j();
                c = null;
            } else {
                M.K(1830166492);
                c = jk50.c(yzt0Var, M);
                M.j();
            }
            if (c == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    cqgVar = new bqg(i, 0, this, eqgVar, izsVar);
                    s.d = cqgVar;
                }
                return;
            }
            nek0 nek0Var = (nek0) M.r(uvi.q);
            vvr vvrVar = (vvr) M.r(uvi.i);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
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
            q630 D2 = p490.D(s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56, 7), p490.x(M), 14);
            wh50 wh50Var = c;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            j(((i2 >> 3) & 14) | 512 | i3, M, ((i) wh50Var.getValue()).a, izsVar);
            M.G();
            q630 E = ahn.E(txj0.f(ra8.a.b(s200.E(aVar2, kqu0.w, kqu0.v), dt1.a.i), 1.0f), "ContactsSaveButton");
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonSize buttonSize = ButtonSize.Large;
            boolean z = ((i) wh50Var.getValue()).b;
            boolean y = M.y(vvrVar) | M.J(nek0Var) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new d5f(vvrVar, nek0Var, izsVar, 1);
                M.R(x);
            }
            bhu0.c((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, null, z, null, null, null, false, edi.c, M, X2.b.f, 384, 3936);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            cqgVar = new cqg(i, 0, this, eqgVar, izsVar);
            s.d = cqgVar;
        }
    }
}

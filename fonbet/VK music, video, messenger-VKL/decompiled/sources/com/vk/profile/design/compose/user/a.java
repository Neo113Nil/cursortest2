package com.vk.profile.design.compose.user;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.er;
import xsna.izs;
import xsna.jai;
import xsna.jf7;
import xsna.k71;
import xsna.k9q0;
import xsna.kai;
import xsna.l8c;
import xsna.ljf;
import xsna.n34;
import xsna.phu0;
import xsna.q630;
import xsna.qri;
import xsna.rrv0;
import xsna.s200;
import xsna.s8u0;
import xsna.sy90;
import xsna.udv0;
import xsna.uog0;
import xsna.us2;
import xsna.w9b0;
import xsna.wp80;
import xsna.wzs;
import xsna.ylu0;
import xsna.yqv0;

/* compiled from: VkProfileFriendsAndFollowersInfo.kt */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: VkProfileFriendsAndFollowersInfo.kt */
    /* renamed from: com.vk.profile.design.compose.user.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1666a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jf7.values().length];
            try {
                iArr[jf7.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jf7.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jf7.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(us2 us2Var, us2 us2Var2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1478907194);
        int i2 = i | (M.J(us2Var) ? 4 : 2) | (M.J(us2Var2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(-1478907194, i2, -1, "com.vk.profile.design.compose.user.BlockText (VkProfileFriendsAndFollowersInfo.kt:185)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            yqv0.d(us2Var, null, 0L, 0, null, 0, false, 1, null, null, null, aVar2, i2 & 14, 6, 15358);
            if (us2Var2 != null) {
                aVar2.K(1573674058);
                yqv0.d(us2Var2, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, 0, null, 2, false, 1, null, null, null, aVar2, ((i2 >> 3) & 14) | 100663344, 6, 15100);
                aVar2 = aVar2;
            } else {
                aVar2.K(1566503014);
            }
            aVar2.j();
            aVar2.G();
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new l8c(i, 9, us2Var, us2Var2, q630Var);
        }
    }

    public static final void b(FriendsAndFollowersBlockData friendsAndFollowersBlockData, jf7 jf7Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1074570306);
        int i2 = (M.J(friendsAndFollowersBlockData) ? 4 : 2) | i | (M.o(jf7Var.ordinal()) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (b.d()) {
                b.f(1074570306, i2, -1, "com.vk.profile.design.compose.user.FluidBlockContent (VkProfileFriendsAndFollowersInfo.kt:124)");
            }
            jai h = wp80.h(kai.c(1015094805, new ljf(8, friendsAndFollowersBlockData, jf7Var), M));
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = udv0.a;
                M.R(x);
            }
            cp10 cp10Var = (cp10) x;
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
            k9q0.w(M, cp10Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f(0, M, h)) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new k71(i, 12, friendsAndFollowersBlockData, jf7Var, q630Var);
        }
    }

    public static final void c(final FriendsAndFollowersBlockData friendsAndFollowersBlockData, final FriendsAndFollowersBlockData friendsAndFollowersBlockData2, uog0 uog0Var, final izs izsVar, q630 q630Var, final q630 q630Var2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1097102565);
        int i2 = i | (M.J(friendsAndFollowersBlockData) ? 4 : 2) | (M.J(friendsAndFollowersBlockData2) ? 32 : 16) | (M.J(uog0Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.J(q630Var2) ? 131072 : 65536) | 1572864;
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (b.d()) {
                b.f(-1097102565, i2, -1, "com.vk.profile.design.compose.user.VkProfileFriendsAndFollowersInfo (VkProfileFriendsAndFollowersInfo.kt:48)");
            }
            boolean z = (friendsAndFollowersBlockData == null || friendsAndFollowersBlockData2 == null) ? false : true;
            final jf7 jf7Var = !z ? jf7.Large : jf7.Medium;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            final boolean z2 = z;
            phu0.a(q630Var, uog0Var, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1233257965, new wzs() { // from class: xsna.sdv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    jf7 jf7Var2;
                    izs izsVar2;
                    Object obj3;
                    u890 u890Var;
                    u890 u890Var2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1233257965, intValue, -1, "com.vk.profile.design.compose.user.VkProfileFriendsAndFollowersInfo.<anonymous> (VkProfileFriendsAndFollowersInfo.kt:59)");
                        }
                        IntrinsicSize intrinsicSize = IntrinsicSize.Min;
                        q630.a aVar3 = q630.a.a;
                        q630 u = m200.u(aVar3, intrinsicSize);
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, u);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        aVar2.K(1741139115);
                        aVar2.j();
                        FriendsAndFollowersBlockData friendsAndFollowersBlockData3 = FriendsAndFollowersBlockData.this;
                        boolean z4 = z2;
                        jf7 jf7Var3 = jf7Var;
                        izs izsVar3 = izsVar;
                        Object obj4 = a.C0011a.a;
                        if (friendsAndFollowersBlockData3 != null) {
                            aVar2.K(1744032593);
                            if (z4) {
                                float d = com.vk.profile.design.compose.user.a.d(friendsAndFollowersBlockData3, false);
                                u890Var2 = new u890(16, d, 12, d);
                            } else {
                                float d2 = com.vk.profile.design.compose.user.a.d(friendsAndFollowersBlockData3, true);
                                float f = 16;
                                u890Var2 = new u890(f, d2, f, d2);
                            }
                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            q630 f2 = txj0.f(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                            boolean z5 = friendsAndFollowersBlockData3.e;
                            boolean J = aVar2.J(izsVar3) | aVar2.J(friendsAndFollowersBlockData3);
                            Object x = aVar2.x();
                            if (J || x == obj4) {
                                x = new sk(29, izsVar3, friendsAndFollowersBlockData3);
                                aVar2.R(x);
                            }
                            com.vk.profile.design.compose.user.a.b(friendsAndFollowersBlockData3, jf7Var3, s200.C(ojc.c(f2, z5, null, null, (gzs) x, 14), u890Var2), aVar2, 0);
                        } else {
                            aVar2.K(1741139115);
                        }
                        aVar2.j();
                        if (z4) {
                            aVar2.K(1744689111);
                            izsVar2 = izsVar3;
                            obj3 = obj4;
                            z3 = z4;
                            jf7Var2 = jf7Var3;
                            ijv0.b(SeparatorDpi.At2x, SeparatorAppearance.Primary, false, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, 1, txj0.c(aVar3, 1.0f)), new pco((float) 0.5d), aVar2, 28086);
                        } else {
                            z3 = z4;
                            jf7Var2 = jf7Var3;
                            izsVar2 = izsVar3;
                            obj3 = obj4;
                            aVar2.K(1741139115);
                        }
                        aVar2.j();
                        FriendsAndFollowersBlockData friendsAndFollowersBlockData4 = friendsAndFollowersBlockData2;
                        if (friendsAndFollowersBlockData4 != null) {
                            aVar2.K(1745135449);
                            if (z3) {
                                float d3 = com.vk.profile.design.compose.user.a.d(friendsAndFollowersBlockData4, false);
                                u890Var = new u890(12, d3, 16, d3);
                            } else {
                                float d4 = com.vk.profile.design.compose.user.a.d(friendsAndFollowersBlockData4, true);
                                float f3 = 16;
                                u890Var = new u890(f3, d4, f3, d4);
                            }
                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                szw.a("invalid weight; must be greater than zero");
                            }
                            q630 f4 = txj0.f(q630Var2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 1.0f);
                            boolean z6 = friendsAndFollowersBlockData4.e;
                            boolean J2 = aVar2.J(izsVar2) | aVar2.J(friendsAndFollowersBlockData4);
                            Object x2 = aVar2.x();
                            if (J2 || x2 == obj3) {
                                x2 = new tx(24, (Object) friendsAndFollowersBlockData4, izsVar2);
                                aVar2.R(x2);
                            }
                            com.vk.profile.design.compose.user.a.b(friendsAndFollowersBlockData4, jf7Var2, s200.C(ojc.c(f4, z6, null, null, (gzs) x2, 14), u890Var), aVar2, 0);
                        } else {
                            aVar2.K(1741139115);
                        }
                        aVar2.j();
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 12) & 14) | 1572864 | ((i2 >> 3) & 112), 56);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new w9b0(friendsAndFollowersBlockData, friendsAndFollowersBlockData2, uog0Var, izsVar, q630Var, q630Var2, i, 1);
        }
    }

    public static final float d(FriendsAndFollowersBlockData friendsAndFollowersBlockData, boolean z) {
        s8u0 s8u0Var = friendsAndFollowersBlockData.b;
        return (s8u0Var == null && z) ? 14 : s8u0Var != null ? 14 : 18;
    }
}

package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.i;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.ahn;
import xsna.ao50;
import xsna.bhu0;
import xsna.bk4;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.f430;
import xsna.fm50;
import xsna.frv0;
import xsna.gcv;
import xsna.gzs;
import xsna.i6v0;
import xsna.izs;
import xsna.j430;
import xsna.jk50;
import xsna.k9q0;
import xsna.kai;
import xsna.me0;
import xsna.n0u0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.ri1;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.sy90;
import xsna.txj0;
import xsna.us2;
import xsna.wh50;
import xsna.ws2;
import xsna.wuv0;
import xsna.wzs;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zq;
import xsna.zyf;

/* compiled from: ModerationBlockedItemView.kt */
/* loaded from: classes18.dex */
public final class h extends i6v0<i, a> {
    public final boolean f;

    public h(Context context, b bVar, boolean z) {
        super(context, bVar);
        this.f = z;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((i) ao50Var, izsVar, aVar, 512);
    }

    public final void h(final us2 us2Var, final us2 us2Var2, final String str, final boolean z, final izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        boolean z2;
        String str2;
        androidx.compose.runtime.a M = aVar.M(1716231115);
        if ((i & 6) == 0) {
            i2 = (M.J(us2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(us2Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1716231115, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.ModerationBlockedItemView.ContentView (ModerationBlockedItemView.kt:128)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f2 = 8;
            j430.a(str, s200.H(new gcv(dt1.a.o), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, (i2 >> 6) & 14);
            float f3 = 16;
            q630 f4 = txj0.f(s200.H(ahn.E(aVar3, "HardBlockDialogTitle"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            String N = d370.N(R.string.moderation_blocked_good_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.C;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, f4, ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 48, 0, 8120);
            j430.b(us2Var, 4, txj0.f(s200.H(ahn.E(aVar3, "HardBlockDialogSubtitle"), f3, f2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f), M, (i2 & 14) | 48);
            j430.b(us2Var2, 1, txj0.f(s200.H(ahn.E(aVar3, "HardBlockDialogMarketRule"), f3, 10, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f), M, ((i2 >> 3) & 14) | 48);
            q630 f5 = txj0.f(s200.H(ahn.E(aVar3, "HardBlockDialogDeleteButton"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            ButtonSize buttonSize = ButtonSize.Large;
            int i3 = i2;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            if (z) {
                z2 = false;
                M.K(-1394112835);
                M.j();
                str2 = "";
            } else {
                z2 = false;
                str2 = zq.a(M, 786310557, R.string.moderation_blocked_good_delete, M, 0);
            }
            String str3 = str2;
            int i4 = 57344 & i3;
            boolean z3 = i4 == 16384 ? true : z2;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new zyf(izsVar, 3);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f5, null, z, false, null, null, null, str3, null, null, null, null, false, null, null, null, M, ((i3 << 12) & 29360128) | 28080, 0, 0, 4190048);
            q630 f6 = txj0.f(s200.H(ahn.E(aVar3, "HardBlockDialogSupportButton"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
            String N2 = d370.N(R.string.moderation_blocked_good_support, 0, M);
            boolean z4 = i4 == 16384;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new me0(izsVar, 7);
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, f6, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.h430
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.h.this.h(us2Var, us2Var2, str, z, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(i iVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(178808875);
        int i2 = i | (M.J(iVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(178808875, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.ModerationBlockedItemView.ThemedContent (ModerationBlockedItemView.kt:61)");
            }
            fm50 fm50Var = (fm50) d(i.b.a, new n0u0[]{iVar.a}, M, (i2 & 896) | 518).getValue();
            if (fm50Var instanceof i.a) {
                M.K(1136107284);
                i.a aVar2 = (i.a) fm50Var;
                wh50 c = jk50.c(aVar2.b, M);
                wh50 c2 = jk50.c(aVar2.c, M);
                wh50 a = jk50.a(aVar2.a, M, 0, 3);
                wh50 c3 = jk50.c(aVar2.d, M);
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (z || x == obj) {
                    x = new f430(izsVar, 0);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean J = M.J((CharSequence) c.getValue()) | M.J(izsVar2);
                Object x2 = M.x();
                if (J || x2 == obj) {
                    x2 = ws2.d((CharSequence) c.getValue(), izsVar2);
                    M.R(x2);
                }
                us2 us2Var = (us2) x2;
                boolean J2 = M.J((CharSequence) c2.getValue()) | M.J(izsVar2);
                Object x3 = M.x();
                if (J2 || x3 == obj) {
                    x3 = ws2.d((CharSequence) c2.getValue(), izsVar2);
                    M.R(x3);
                }
                String str = (String) a.getValue();
                boolean booleanValue = ((Boolean) c3.getValue()).booleanValue();
                int i3 = i2 << 9;
                j(us2Var, (us2) x3, str, booleanValue, izsVar, M, (57344 & i3) | SQLiteDatabase.OPEN_PRIVATECACHE | (i3 & 458752));
                M.j();
            } else {
                M.K(36681135);
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
            s.d = new ri1(i, 5, this, iVar, izsVar);
        }
    }

    public final void j(final us2 us2Var, final us2 us2Var2, final String str, final boolean z, final izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        us2 us2Var3;
        int i2;
        us2 us2Var4;
        String str2;
        boolean z2;
        izs<? super a, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(367127760);
        if ((i & 6) == 0) {
            us2Var3 = us2Var;
            i2 = (M.J(us2Var3) ? 4 : 2) | i;
        } else {
            us2Var3 = us2Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            us2Var4 = us2Var2;
            i2 |= M.J(us2Var4) ? 32 : 16;
        } else {
            us2Var4 = us2Var2;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i2 |= M.J(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 16384 : 8192;
        } else {
            izsVar2 = izsVar;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(367127760, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.ModerationBlockedItemView.ThemedContentView (ModerationBlockedItemView.kt:99)");
            }
            if (this.f) {
                M.K(2116637733);
                rrv0.e(true, null, null, null, null, null, kai.c(-514256050, new bk4(this, us2Var3, us2Var4, str2, z2, izsVar2), M), M, 1572870, 62);
                aVar2 = M;
                aVar2.j();
            } else {
                aVar2 = M;
                aVar2.K(2116971200);
                h(us2Var, us2Var2, str, z, izsVar, aVar2, (65534 & i2) | SQLiteDatabase.OPEN_PRIVATECACHE | (458752 & i2));
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.g430
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.h.this.j(us2Var, us2Var2, str, z, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

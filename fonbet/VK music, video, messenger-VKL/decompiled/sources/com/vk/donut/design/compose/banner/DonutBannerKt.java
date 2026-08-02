package com.vk.donut.design.compose.banner;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.e;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.group.header.g;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.a;
import com.vk.donut.design.compose.banner.c;
import com.vk.movika.sdk.base.ui.q0;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a690;
import xsna.ahn;
import xsna.alb0;
import xsna.apj;
import xsna.azl;
import xsna.bap;
import xsna.bhu0;
import xsna.bzm;
import xsna.c6j;
import xsna.cj1;
import xsna.ck70;
import xsna.cku;
import xsna.cp10;
import xsna.cq;
import xsna.cri;
import xsna.d370;
import xsna.dh5;
import xsna.doi;
import xsna.dp10;
import xsna.dt1;
import xsna.e4p0;
import xsna.egi0;
import xsna.ep10;
import xsna.et9;
import xsna.f9t;
import xsna.frv0;
import xsna.gvw;
import xsna.gzs;
import xsna.h6j;
import xsna.hp7;
import xsna.hr80;
import xsna.hwv;
import xsna.hzn;
import xsna.ijv0;
import xsna.ikg0;
import xsna.ir;
import xsna.ixn;
import xsna.iyk0;
import xsna.izs;
import xsna.j7d;
import xsna.ja8;
import xsna.jai;
import xsna.jcv;
import xsna.jgp;
import xsna.jor0;
import xsna.joy;
import xsna.jxn;
import xsna.k9q0;
import xsna.kai;
import xsna.kp5;
import xsna.kqu0;
import xsna.kr;
import xsna.l5g;
import xsna.lg90;
import xsna.lgu0;
import xsna.m6j;
import xsna.mlg0;
import xsna.mxn;
import xsna.n34;
import xsna.nr2;
import xsna.ojc;
import xsna.op10;
import xsna.oq;
import xsna.p3u;
import xsna.pco;
import xsna.pe1;
import xsna.pg90;
import xsna.plg0;
import xsna.pzu0;
import xsna.q5j;
import xsna.q630;
import xsna.qer0;
import xsna.qri;
import xsna.qw7;
import xsna.qxn;
import xsna.qzu0;
import xsna.r5j0;
import xsna.ra8;
import xsna.rek0;
import xsna.rrk;
import xsna.rrv0;
import xsna.rte0;
import xsna.s200;
import xsna.s3q0;
import xsna.s5j;
import xsna.s890;
import xsna.sg50;
import xsna.spx0;
import xsna.swm0;
import xsna.sxn;
import xsna.sy90;
import xsna.szw;
import xsna.t190;
import xsna.tgi0;
import xsna.tra0;
import xsna.twn;
import xsna.txj0;
import xsna.txn;
import xsna.ty6;
import xsna.u890;
import xsna.ua8;
import xsna.uco;
import xsna.uma;
import xsna.ur;
import xsna.uvi;
import xsna.uxn;
import xsna.vjw;
import xsna.vog0;
import xsna.vs9;
import xsna.w65;
import xsna.wa5;
import xsna.wh50;
import xsna.wlb0;
import xsna.wuv0;
import xsna.wxn;
import xsna.wzs;
import xsna.x190;
import xsna.x5j;
import xsna.xga0;
import xsna.xpy;
import xsna.y190;
import xsna.yb1;
import xsna.yk8;
import xsna.ylu0;
import xsna.yqv0;
import xsna.yzs;
import xsna.z77;
import xsna.zak0;
import xsna.zo10;
import xsna.zzs;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class DonutBannerKt {

    /* compiled from: DonutBanner.kt */
    public static final class a implements izs<q5j, s3q0> {
        public final /* synthetic */ s5j b;

        public a(s5j s5jVar) {
            this.b = s5jVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(q5j q5jVar) {
            q5j q5jVar2 = q5jVar;
            q5jVar2.d(new bzm("spread"));
            x5j x5jVar = q5jVar2.e;
            s5j s5jVar = q5jVar2.c;
            jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
            jcv.b(q5jVar2.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
            jor0.a(q5jVar2.d, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
            jor0.a(q5jVar2.f, this.b.c, 4, 4);
            return s3q0.a;
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final class b implements izs<q5j, s3q0> {
        public final /* synthetic */ s5j b;

        public b(s5j s5jVar) {
            this.b = s5jVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(q5j q5jVar) {
            q5j q5jVar2 = q5jVar;
            x5j x5jVar = q5jVar2.e;
            s5j s5jVar = q5jVar2.c;
            jcv.b(x5jVar, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
            m6j m6jVar = q5jVar2.d;
            s5j s5jVar2 = this.b;
            jor0.a(m6jVar, s5jVar2.e, 4, 4);
            jor0.a(q5jVar2.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
            jcv.b(q5jVar2.g, s5jVar2.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
            q5jVar2.c(new bzm("spread"));
            q5jVar2.d(new bzm("spread"));
            return s3q0.a;
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[et9.values().length];
            try {
                iArr[et9.DOUBLE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[et9.SINGLE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DonutContentType.values().length];
            try {
                iArr2[DonutContentType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DonutContentType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DonutContentType.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DonutContentType.ARTICLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DonutContentType.PODCAST.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InfoBannerIcon.values().length];
            try {
                iArr3[InfoBannerIcon.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void a(final vs9 vs9Var, final boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> txnVar;
        androidx.compose.runtime.a M = aVar.M(2103159093);
        if ((i & 6) == 0) {
            i2 = (M.J(vs9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2103159093, i3, -1, "com.vk.donut.design.compose.banner.CardContainerActionButton (DonutBanner.kt:741)");
            }
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (!z) {
                M.K(229976840);
                String str = vs9Var.a.c;
                int i4 = i3 & 896;
                boolean z2 = ((i3 & 14) == 4) | (i4 == 256);
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new kp5(10, vs9Var, gzsVar);
                    M.R(x);
                }
                q630 a2 = egi0.a(q630.a.a, (izs) x);
                boolean z3 = i4 == 256;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new qxn(0, gzsVar);
                    M.R(x2);
                }
                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, a2, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    txnVar = new wzs() { // from class: xsna.rxn
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int I = ne7.I(i | 1);
                            DonutBannerKt.a(vs9.this, z, gzsVar, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    s.d = txnVar;
                }
                return;
            }
            M.K(202963533);
            M.j();
            lgu0 b2 = hr80.z().b(buttonStyle, buttonAppearance, M, 54);
            s890 value = hr80.z().c(buttonSize, buttonStyle, false, M, 54, 4).getValue();
            r5j0 x3 = hr80.z().x(6, M);
            boolean z4 = (i3 & 896) == 256;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new sxn(0, gzsVar);
                M.R(x4);
            }
            bhu0.f((gzs) x4, null, false, null, null, null, null, null, x3, b2, value, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(-557005620, new doi(vs9Var, 1), M), M, 0, 1572864, 63742);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            txnVar = new txn(vs9Var, z, gzsVar, i);
            s.d = txnVar;
        }
    }

    public static final void b(String str, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-222314441);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-222314441, i2, -1, "com.vk.donut.design.compose.banner.CardTitleAndContentPart (DonutBanner.kt:780)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.h0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            yqv0.c(str, null, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 2, null, frv0Var, M, i2 & 14, 48, 6138);
            f9t.e(txj0.h(q630.a.a, 6), M, 6);
            jaiVar2 = jaiVar;
            if (cq.i((i3 >> 3) & 14, M, jaiVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new uxn(str, jaiVar2, i, 0);
        }
    }

    public static final void c(hzn hznVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        lg90 a2;
        androidx.compose.runtime.a M = aVar.M(-954709463);
        int i2 = (M.J(hznVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-954709463, i2, -1, "com.vk.donut.design.compose.banner.ContentChip (DonutBanner.kt:841)");
            }
            dt1.a.getClass();
            k a3 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i3 = i2 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2077511481, i3, -1, "com.vk.donut.design.compose.banner.getDonutContentItemIconPainter (DonutBanner.kt:857)");
            }
            int i4 = c.$EnumSwitchMapping$1[hznVar.a.ordinal()];
            if (i4 == 1) {
                M.K(671263802);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-283525342, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArticleBoxOutline12> (VkIcons.kt:468)");
                }
                a2 = pg90.a(R.drawable.vk_icon_article_box_outline_12, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i4 == 2) {
                M.K(671265659);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(656719554, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-VideoSquareOutline12> (VkIcons.kt:11570)");
                }
                a2 = pg90.a(R.drawable.vk_icon_video_square_outline_12, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i4 == 3) {
                M.K(671267511);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1771284898, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageOutline12> (VkIcons.kt:7450)");
                }
                a2 = pg90.a(R.drawable.vk_icon_message_outline_12, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i4 == 4) {
                M.K(671269336);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-908392430, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ArticlesOutline12> (VkIcons.kt:504)");
                }
                a2 = pg90.a(R.drawable.vk_icon_articles_outline_12, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                if (i4 != 5) {
                    throw alb0.c(671262296, M);
                }
                M.K(671271191);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1173973310, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PodcastOutline12> (VkIcons.kt:9084)");
                }
                a2 = pg90.a(R.drawable.vk_icon_podcast_outline_12, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var = a2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(lg90Var, null, null, wlb0.h(M).getIcon().j, M, 56, 4);
            f9t.e(txj0.v(aVar3, 2), M, 6);
            aVar2 = M;
            yqv0.c(hznVar.b, null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, aVar2, 0, 0, 8186);
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
            s.d = new q0(hznVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, final String str2, final com.vk.donut.design.compose.banner.a aVar, final gzs gzsVar, final gzs gzsVar2, q630 q630Var, final String str3, final gvw gvwVar, boolean z, final gzs gzsVar3, final gzs gzsVar4, izs izsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        String str4;
        com.vk.donut.design.compose.banner.a aVar3;
        gzs gzsVar5;
        gzs gzsVar6;
        q630 q630Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar4;
        final boolean z3;
        final q630 q630Var3;
        final izs izsVar2;
        f s;
        int i9;
        q630 q630Var4;
        boolean z4;
        androidx.compose.runtime.a M = aVar2.M(2094176295);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i3 |= M.J(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            aVar3 = aVar;
            i3 |= M.J(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i & 3072) == 0) {
            gzsVar5 = gzsVar;
            i3 |= M.y(gzsVar5) ? 2048 : 1024;
        } else {
            gzsVar5 = gzsVar;
        }
        if ((i & 24576) == 0) {
            gzsVar6 = gzsVar2;
            i3 |= M.y(gzsVar6) ? 16384 : 8192;
        } else {
            gzsVar6 = gzsVar2;
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 131072 : 65536;
            if ((i & 1572864) == 0) {
                i3 |= M.J(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((i & 12582912) == 0) {
                i3 |= M.J(gvwVar) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 100663296) == 0) {
                    i3 |= M.l(z2) ? 67108864 : 33554432;
                }
            }
            if ((i & 805306368) == 0) {
                i3 |= M.y(gzsVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            int i11 = !M.y(gzsVar4) ? 4 : 2;
            i5 = i2 & 2048;
            if (i5 == 0) {
                i7 = i11 | 48;
                i6 = i5;
            } else {
                i6 = i5;
                i7 = i11 | (M.y(izsVar) ? 32 : 16);
            }
            i8 = i7;
            if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i8 & 19) != 18)) {
                aVar4 = M;
                aVar4.h();
                z3 = z2;
                q630Var3 = q630Var2;
                izsVar2 = izsVar;
            } else {
                if (i10 != 0) {
                    int i12 = i6;
                    q630Var4 = q630.a.a;
                    i9 = i12;
                } else {
                    i9 = i6;
                    q630Var4 = q630Var2;
                }
                if (i4 != 0) {
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                        comFeatures.getClass();
                        x = Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
                        M.R(x);
                    }
                    z4 = ((Boolean) x).booleanValue();
                } else {
                    z4 = z2;
                }
                izs izsVar3 = i9 != 0 ? null : izsVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2094176295, i3, i8, "com.vk.donut.design.compose.banner.DonutBanner (DonutBanner.kt:106)");
                }
                M.K(-1087790504);
                aVar4 = M;
                k(str, str4, aVar3, gzsVar5, gzsVar6, q630Var4, str3, gvwVar, z4, gzsVar3, gzsVar4, izsVar3, aVar4, i3 & 2147483646, i8 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                aVar4.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
                z3 = z4;
                izsVar2 = izsVar3;
            }
            s = aVar4.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.hxn
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        DonutBannerKt.d(str, str2, aVar, gzsVar, gzsVar2, q630Var3, str3, gvwVar, z3, gzsVar3, gzsVar4, izsVar2, (androidx.compose.runtime.a) obj, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (!M.y(gzsVar4)) {
        }
        i5 = i2 & 2048;
        if (i5 == 0) {
        }
        i8 = i7;
        if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i8 & 19) != 18)) {
        }
        s = aVar4.s();
        if (s == null) {
        }
    }

    public static final void e(String str, gzs gzsVar, String str2, String str3, gzs gzsVar2, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar3;
        izs izsVar2;
        gzs gzsVar4;
        String str4;
        String str5;
        androidx.compose.runtime.a M = aVar.M(1382600671);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1382600671, i2, -1, "com.vk.donut.design.compose.banner.DonutBannerHeader (DonutBanner.kt:257)");
            }
            boolean z = str3 != null;
            if (str2 != null) {
                M.K(320586582);
                ck70.b(q630.a.a, 6, M, 6);
            } else {
                M.K(309435107);
                M.j();
            }
            if (z) {
                izsVar2 = izsVar;
                gzsVar4 = gzsVar;
                str4 = str2;
                M.K(320931271);
                int i3 = i2 & 14;
                int i4 = i2 >> 3;
                int i5 = (i4 & 57344) | i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
                str5 = str3;
                g(str, str4, str5, gzsVar2, izsVar2, M, i5);
                gzsVar3 = gzsVar2;
                M.j();
            } else {
                M.K(320666686);
                int i6 = i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                int i7 = i2 >> 3;
                gzsVar4 = gzsVar;
                h(str, gzsVar4, str2, gzsVar2, izsVar, M, i6 | (i7 & 7168) | (i7 & 57344));
                str4 = str2;
                gzsVar3 = gzsVar2;
                izsVar2 = izsVar;
                M.j();
                str5 = str3;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar3 = gzsVar2;
            izsVar2 = izsVar;
            gzsVar4 = gzsVar;
            str4 = str2;
            str5 = str3;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new j7d(str, gzsVar4, str4, str5, gzsVar3, izsVar2, i);
        }
    }

    public static final void f(final String str, final boolean z, final vs9 vs9Var, final gzs gzsVar, final boolean z2, final q630 q630Var, final lg90 lg90Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(569609073);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(vs9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(569609073, i2, -1, "com.vk.donut.design.compose.banner.DonutCardContainer (DonutBanner.kt:650)");
            }
            if (z) {
                M.K(-191551255);
                int i3 = i2 >> 3;
                n(str, vs9Var, gzsVar2, z2, q630Var, jaiVar, M, (57344 & i3) | (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & (i2 >> 6)));
                M = M;
                M.j();
            } else {
                M.K(-191281183);
                int i4 = i2 & 14;
                int i5 = i2 >> 3;
                i(str, vs9Var, gzsVar, z2, q630Var, lg90Var, jaiVar, M, (458752 & i5) | i4 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | SQLiteDatabase.OPEN_PRIVATECACHE | (i5 & 3670016));
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
            s.d = new wzs() { // from class: xsna.kxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DonutBannerKt.f(str, z, vs9Var, gzsVar, z2, q630Var, lg90Var, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [com.vk.core.compose.component.group.header.GroupHeader$Right] */
    public static final void g(String str, String str2, String str3, gzs gzsVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        com.vk.core.compose.component.group.header.c cVar;
        int i3;
        androidx.compose.runtime.a aVar2;
        int i4;
        SemanticsConfiguration.Mode mode;
        int i5;
        cku a2;
        androidx.compose.runtime.a aVar3;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-1969843144);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1969843144, i2, -1, "com.vk.donut.design.compose.banner.DonutHeaderWithDiscount (DonutBanner.kt:289)");
            }
            b.c cVar2 = b.c.a;
            if (str3 != null) {
                M.K(-1458504832);
                ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Positive;
                ContentBadgeMode contentBadgeMode = ContentBadgeMode.Secondary;
                ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
                int i6 = ((i2 >> 6) & 14) | 200112;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1741757991, i6, -1, "com.vk.core.compose.component.group.header.GroupHeader.Title.Along.Badge.Companion.invoke (GroupHeader.kt:353)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new com.vk.core.compose.component.group.header.c(str3, design, contentBadgeMode, contentBadgeSize);
                    M.R(x);
                }
                com.vk.core.compose.component.group.header.c cVar3 = (com.vk.core.compose.component.group.header.c) x;
                ((zak0) cVar3.a).setValue(str3);
                ((zak0) cVar3.d).setValue(design);
                ((zak0) cVar3.c).setValue(contentBadgeSize);
                ((zak0) cVar3.b).setValue(contentBadgeMode);
                ((zak0) cVar3.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                cVar = cVar3;
            } else {
                M.K(-1458180386);
                M.j();
                cVar = null;
            }
            com.vk.core.compose.component.group.header.f a3 = f.a.a(str, null, null, cVar, null, null, null, null, false, M, (i2 & 14) | 805306368, 502);
            if (str2 == null) {
                M.K(-1458087170);
                M.j();
                i4 = i2;
                aVar2 = M;
                a2 = null;
                mode = null;
                i5 = -1;
                i3 = 0;
            } else {
                M.K(-1458087169);
                i3 = 0;
                aVar2 = M;
                i4 = i2;
                mode = null;
                i5 = -1;
                a2 = cku.b.a(str2, null, null, null, aVar2, 24576, 14);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, 384, i5, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x2 = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x2 == c0012a) {
                x2 = new com.vk.core.compose.component.group.header.a(a3, a2);
                aVar2.R(x2);
            }
            com.vk.core.compose.component.group.header.a aVar4 = (com.vk.core.compose.component.group.header.a) x2;
            ((zak0) aVar4.a).setValue(a3);
            ((zak0) aVar4.b).setValue(a2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (gzsVar == null) {
                aVar2.K(-1457983103);
                aVar2.j();
                aVar3 = aVar2;
                obj = mode;
            } else {
                aVar2.K(-1457983102);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(436746370, i3, i5, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GearOutline20> (VkSdkIcons.kt:964)");
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_gear_outline_20, i3, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i3, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().l;
                GroupHeader$Right.Icon.ContainerSize containerSize = GroupHeader$Right.Icon.ContainerSize.ExtraSmall;
                String N = d370.N(R.string.donut_banner_accessibility_admin, i3, aVar2);
                Object x3 = aVar2.x();
                if (x3 == c0012a) {
                    x3 = new pe1(21);
                    aVar2.R(x3);
                }
                com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 3);
                boolean J = aVar2.J(gzsVar);
                Object x4 = aVar2.x();
                if (J || x4 == c0012a) {
                    x4 = new rrk(1, gzsVar);
                    aVar2.R(x4);
                }
                androidx.compose.runtime.a aVar5 = aVar2;
                aVar3 = aVar5;
                Object a6 = GroupHeader$Right.c.a(null, GroupHeader$Right.Icon.a.a(a4, j, N, (gzs) x4, containerSize, a5, izsVar, aVar5, 100859912 | ((i4 << 9) & 29360128), 4), null, null, aVar3, 13);
                aVar3.j();
                obj = a6;
            }
            androidx.compose.runtime.a aVar6 = aVar3;
            g.a(aVar4, null, cVar2, null, obj, false, aVar6, 384, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            M = aVar6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uma(str, str2, str3, gzsVar, izsVar, i);
        }
    }

    public static final void h(String str, gzs gzsVar, String str2, gzs gzsVar2, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        a.C0011a.C0012a c0012a;
        cku a2;
        int i4;
        ikg0 ikg0Var;
        androidx.compose.runtime.a M = aVar.M(2006399111);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2006399111, i5, -1, "com.vk.donut.design.compose.banner.DonutHeaderWithoutDiscount (DonutBanner.kt:331)");
            }
            b.c cVar = b.c.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2006929454, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-InfoOutline16> (VkSdkIcons.kt:1288)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_info_outline_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().l;
            String N = d370.N(R.string.donut_banner_accessibility_about, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = new dh5(22);
                M.R(x);
            }
            int i6 = i5 << 9;
            e a4 = e.a.a(a3, j, N, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), gzsVar, M, 196616 | (i6 & 57344), 0);
            androidx.compose.runtime.a aVar2 = M;
            if (gzsVar == null) {
                a4 = null;
            }
            com.vk.core.compose.component.group.header.f a5 = f.a.a(str, a4, null, null, null, null, null, null, false, aVar2, (i5 & 14) | 805306368, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (str2 == null) {
                aVar2.K(-423012785);
                aVar2.j();
                i3 = 0;
                c0012a = c0012a2;
                a2 = null;
            } else {
                aVar2.K(-423012784);
                i3 = 0;
                c0012a = c0012a2;
                a2 = cku.b.a(str2, null, null, null, aVar2, 24576, 14);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                i4 = -1;
                androidx.compose.runtime.b.f(958254720, 384, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            } else {
                i4 = -1;
            }
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new com.vk.core.compose.component.group.header.a(a5, a2);
                aVar2.R(x2);
            }
            com.vk.core.compose.component.group.header.a aVar3 = (com.vk.core.compose.component.group.header.a) x2;
            ((zak0) aVar3.a).setValue(a5);
            ((zak0) aVar3.b).setValue(a2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (gzsVar2 == null) {
                aVar2.K(-422908718);
                aVar2.j();
                ikg0Var = null;
            } else {
                aVar2.K(-422908717);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(436746370, i3, i4, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GearOutline20> (VkSdkIcons.kt:964)");
                }
                lg90 a6 = pg90.a(R.drawable.vk_icon_gear_outline_20, i3, aVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i3, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().l;
                GroupHeader$Right.Icon.ContainerSize containerSize = GroupHeader$Right.Icon.ContainerSize.ExtraSmall;
                String N2 = d370.N(R.string.donut_banner_accessibility_admin, i3, aVar2);
                Object x3 = aVar2.x();
                if (x3 == c0012a) {
                    x3 = new cj1(22);
                    aVar2.R(x3);
                }
                com.vk.core.compose.component.semantics.a a7 = com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3);
                boolean J = aVar2.J(gzsVar2);
                Object x4 = aVar2.x();
                if (J || x4 == c0012a) {
                    x4 = new ixn(0, gzsVar2);
                    aVar2.R(x4);
                }
                ikg0 a8 = GroupHeader$Right.c.a(null, GroupHeader$Right.Icon.a.a(a6, j2, N2, (gzs) x4, containerSize, a7, izsVar, aVar2, 100859912 | (i6 & 29360128), 4), null, null, aVar2, 13);
                aVar2 = aVar2;
                aVar2.j();
                ikg0Var = a8;
            }
            androidx.compose.runtime.a aVar4 = aVar2;
            g.a(aVar3, null, cVar, null, ikg0Var, false, aVar4, 384, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jxn(str, gzsVar, str2, gzsVar2, izsVar, i);
        }
    }

    public static final void i(final String str, final vs9 vs9Var, final gzs gzsVar, final boolean z, final q630 q630Var, final lg90 lg90Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        vs9 vs9Var2;
        boolean z2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(2088389792);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vs9Var2 = vs9Var;
            i2 |= M.J(vs9Var2) ? 32 : 16;
        } else {
            vs9Var2 = vs9Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            jaiVar2 = jaiVar;
            i2 |= M.y(jaiVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            jaiVar2 = jaiVar;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2088389792, i2, -1, "com.vk.donut.design.compose.banner.DoubleCardContainer (DonutBanner.kt:706)");
            }
            q630 d = rte0.d(q630Var, vog0.b(12));
            boolean z3 = (i2 & 896) == 256;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new mxn(0, gzsVar);
                M.R(x);
            }
            final vs9 vs9Var3 = vs9Var2;
            final boolean z4 = z2;
            final jai jaiVar3 = jaiVar2;
            ua8.a(ojc.c(d, false, null, null, (gzs) x, 15), null, false, kai.c(-657858422, new yzs() { // from class: xsna.nxn
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-657858422, intValue, -1, "com.vk.donut.design.compose.banner.DoubleCardContainer.<anonymous> (DonutBanner.kt:712)");
                        }
                        q630.a aVar3 = q630.a.a;
                        lg90 lg90Var2 = lg90.this;
                        if (lg90Var2 == null) {
                            aVar2.K(-324430568);
                        } else {
                            aVar2.K(-324430567);
                            vjw.a(lg90Var2, null, va8Var.a(aVar3), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 56, 120);
                        }
                        aVar2.j();
                        q630 D = s200.D(aVar3, 10);
                        if (o6j.f(va8Var.f())) {
                            D = D.g(txj0.h(aVar3, o6j.h(va8Var.f())));
                        }
                        a.h hVar = androidx.compose.foundation.layout.a.g;
                        dt1.a.getClass();
                        ty6.a aVar4 = dt1.a.n;
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(hVar, aVar4, aVar2, 6);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c2 = qri.c(aVar2, D);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar5);
                        } else {
                            aVar2.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, a2, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D2, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c2, dVar);
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar4, aVar2, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D3 = aVar2.D();
                        q630 c3 = qri.c(aVar2, aVar3);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar5);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a3, cVar);
                        k9q0.w(aVar2, D3, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c3, dVar);
                        DonutBannerKt.b(str, jaiVar3, aVar2, 0);
                        aVar2.G();
                        f9t.e(txj0.j(36, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), aVar2, 6);
                        DonutBannerKt.a(vs9Var3, z4, gzsVar, aVar2, 0);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.oxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DonutBannerKt.i(str, vs9Var, gzsVar, z, q630Var, lg90Var, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void j(final p3u p3uVar, et9 et9Var, final gzs gzsVar, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar2;
        et9 et9Var2;
        String str;
        int i3;
        twn F;
        androidx.compose.runtime.a M = aVar.M(1218863462);
        if ((i & 6) == 0) {
            i2 = (M.J(p3uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(et9Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1218863462, i2, -1, "com.vk.donut.design.compose.banner.GoalCard (DonutBanner.kt:524)");
            }
            String str2 = p3uVar.a;
            et9Var2 = et9Var;
            boolean z2 = et9Var2 == et9.SINGLE_CARD;
            q630 E = ahn.E(q630Var, "donut_new_banner_goal_card");
            vs9 vs9Var = p3uVar.c;
            int i4 = (i2 >> 9) & 14;
            M.K(-61389977);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-61389977, i4, -1, "com.vk.donut.design.compose.banner.getGoalCardBackgroundPainter (DonutBanner.kt:545)");
            }
            if (z) {
                str = str2;
                i3 = i2;
                if (oq.h(767286395, M)) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean s = ylu0Var.s();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var = new rek0(ylu0Var2.getBackground().B);
                qzu0.a.getClass();
                F = nr2.F(s, rek0Var, new hwv(qzu0.o0(M), qzu0.o0(M), 80, (Float.floatToRawIntBits(28) << 32) | (Float.floatToRawIntBits(12) & 4294967295L)), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(787398854);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean s2 = ylu0Var3.s();
                if (androidx.compose.runtime.b.d()) {
                    str = str2;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    str = str2;
                }
                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var2 = new rek0(ylu0Var4.getBackground().B);
                qzu0.a.getClass();
                i3 = i2;
                F = nr2.F(s2, rek0Var2, new hwv(qzu0.n0(M), qzu0.m0(M), 104, (Float.floatToRawIntBits(39) << 32) | (Float.floatToRawIntBits(14) & 4294967295L)), M);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            twn twnVar = F;
            int i5 = i3 << 3;
            f(str, z2, vs9Var, gzsVar2, z, E, twnVar, kai.c(-1314832669, new wa5(p3uVar, 5), M), M, (i5 & 57344) | (i5 & 7168) | 12582912 | 2097152);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            et9Var2 = et9Var;
            M.h();
        }
        androidx.compose.runtime.f s3 = M.s();
        if (s3 != null) {
            final et9 et9Var3 = et9Var2;
            s3.d = new wzs() { // from class: xsna.yxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DonutBannerKt.j(p3u.this, et9Var3, gzsVar, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void k(final String str, final String str2, final com.vk.donut.design.compose.banner.a aVar, final gzs gzsVar, final gzs gzsVar2, final q630 q630Var, final String str3, final gvw gvwVar, final boolean z, final gzs gzsVar3, final gzs gzsVar4, final izs izsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a aVar3;
        int i5;
        q630.a aVar4;
        androidx.compose.runtime.a aVar5;
        int i6;
        boolean z2;
        cri.a.C2678a c2678a;
        boolean z3;
        q630 q630Var2;
        hwv hwvVar;
        lg90 i0;
        boolean z4;
        hwv hwvVar2;
        lg90 k0;
        lg90 j0;
        long j;
        long floatToRawIntBits;
        int floatToRawIntBits2;
        androidx.compose.runtime.a M = aVar2.M(-151988426);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.J(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.J(gvwVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.y(gzsVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.y(gzsVar4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(izsVar) ? 32 : 16;
        }
        int i7 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-151988426, i3, i7, "com.vk.donut.design.compose.banner.MilkshakeDonutBanner (DonutBanner.kt:153)");
            }
            boolean z5 = str3 != null && z;
            M.K(-31966054);
            q630 d = rte0.d(q630Var, vog0.b(20));
            boolean z6 = aVar instanceof a.c;
            q630.a aVar6 = q630.a.a;
            boolean z7 = z5;
            if (z6) {
                i5 = i3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                d = d.g(hr80.m(aVar6, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a));
            } else {
                i5 = i3;
            }
            M.j();
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
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
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            boolean z8 = aVar instanceof a.b;
            if (z8) {
                M.K(945575917);
                boolean z9 = ((a.b) aVar).a instanceof p3u;
                float f = gzsVar4 != null ? 37 : 29;
                q630 a2 = ra8.a.a(aVar6);
                if (androidx.compose.runtime.b.d()) {
                    q630Var2 = a2;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    q630Var2 = a2;
                }
                c2678a = c2678a2;
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean s = ylu0Var2.s();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var = new rek0(ylu0Var3.getBackground().g);
                int i8 = (i5 >> 24) & 14;
                M.K(-773226202);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-773226202, i8, -1, "com.vk.donut.design.compose.banner.getIllustrationParamsForSingleMode (DonutBanner.kt:224)");
                }
                if (z) {
                    M.K(-1281648932);
                    M.j();
                    if (z9) {
                        M.K(-1271428759);
                        qzu0.a.getClass();
                        hwvVar = new hwv(qzu0.o0(M), qzu0.o0(M), 96, (Float.floatToRawIntBits(22) << 32) | (Float.floatToRawIntBits(17) & 4294967295L));
                        M.j();
                        z4 = s;
                    } else {
                        M.K(-1271149418);
                        if (z7) {
                            M.K(-41002004);
                            qzu0.a.getClass();
                            i0 = qzu0.l0(M);
                        } else {
                            M.K(-41000344);
                            qzu0.a.getClass();
                            i0 = qzu0.i0(M);
                        }
                        M.j();
                        lg90 lg90Var = i0;
                        z4 = s;
                        hwvVar = new hwv(lg90Var, lg90Var, 96, (Float.floatToRawIntBits(14) << 32) | (Float.floatToRawIntBits(15) & 4294967295L));
                        M.j();
                    }
                    hwvVar2 = hwvVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(-1271933935);
                    if (z9) {
                        M.K(-41027707);
                        qzu0.a.getClass();
                        k0 = qzu0.n0(M);
                    } else {
                        M.K(-41026265);
                        qzu0.a.getClass();
                        k0 = qzu0.k0(M);
                    }
                    M.j();
                    lg90 lg90Var2 = k0;
                    if (z9) {
                        M.K(-41023484);
                        qzu0.a.getClass();
                        j0 = qzu0.m0(M);
                    } else {
                        M.K(-41022074);
                        qzu0.a.getClass();
                        j0 = qzu0.j0(M);
                    }
                    M.j();
                    lg90 lg90Var3 = j0;
                    float f2 = z9 ? 158 : 168;
                    if (z9) {
                        j = 4294967295L;
                        floatToRawIntBits = Float.floatToRawIntBits(42);
                        floatToRawIntBits2 = Float.floatToRawIntBits(f);
                    } else {
                        j = 4294967295L;
                        floatToRawIntBits = Float.floatToRawIntBits(45);
                        floatToRawIntBits2 = Float.floatToRawIntBits(39);
                    }
                    hwvVar2 = new hwv(lg90Var2, lg90Var3, f2, (floatToRawIntBits << 32) | (floatToRawIntBits2 & j));
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    z4 = s;
                }
                twn F = nr2.F(z4, rek0Var, hwvVar2, M);
                i6 = i7;
                aVar4 = aVar6;
                z3 = z8;
                z2 = z6;
                vjw.a(F, null, q630Var2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
                aVar5 = M;
            } else {
                aVar4 = aVar6;
                aVar5 = M;
                i6 = i7;
                z2 = z6;
                c2678a = c2678a2;
                z3 = z8;
                aVar5.K(938302790);
            }
            aVar5.j();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar5, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar5));
            sy90 D2 = aVar5.D();
            q630 c3 = qri.c(aVar5, aVar4);
            if (aVar5.N() == null) {
                n34.r();
                throw null;
            }
            aVar5.H();
            if (aVar5.L()) {
                aVar5.I(aVar7);
            } else {
                aVar5.f();
            }
            k9q0.w(aVar5, a3, cVar);
            k9q0.w(aVar5, D2, eVar);
            ur.d(hashCode2, aVar5, bVar, aVar5, c2678a);
            k9q0.w(aVar5, c3, dVar);
            int i9 = i6 << 12;
            boolean z10 = z3;
            androidx.compose.runtime.a aVar8 = aVar5;
            e(str, gzsVar3, str2, z ? str3 : null, gzsVar4, izsVar, aVar8, (i5 & 14) | ((i5 >> 24) & 112) | ((i5 << 3) & 896) | (i9 & 57344) | (i9 & 458752));
            aVar3 = aVar8;
            if (z10) {
                aVar3.K(-1738959339);
                m((a.b) aVar, gzsVar, gzsVar2, z, z7, aVar3, ((i5 >> 6) & 1008) | ((i5 >> 15) & 7168));
                aVar3 = aVar3;
                aVar3.j();
            } else if (z2) {
                aVar3.K(-1738947120);
                q((a.c) aVar, gzsVar, gzsVar2, gvwVar != null, z, z7, aVar3, ((i5 >> 6) & 1008) | ((i5 >> 12) & 57344));
                aVar3.j();
            } else {
                if (!(aVar instanceof a.C0900a)) {
                    throw alb0.c(-1738961618, aVar3);
                }
                aVar3.K(-1738933546);
                aVar3.j();
            }
            if (gvwVar != null) {
                aVar3.K(1927693049);
                l(gvwVar, z10, aVar3, (i5 >> 21) & 14);
            } else {
                aVar3.K(1918353648);
            }
            aVar3.j();
            if (kr.f(aVar3)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s2 = aVar3.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.lxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    DonutBannerKt.k(str, str2, aVar, gzsVar, gzsVar2, q630Var, str3, gvwVar, z, gzsVar3, gzsVar4, izsVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void l(gvw gvwVar, boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630.a aVar2;
        cri.a.e eVar;
        cri.a.C2678a c2678a;
        cri.a.b bVar;
        LayoutNode.a aVar3;
        cri.a.c cVar;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1410858957);
        if ((i & 6) == 0) {
            i2 = (M.J(gvwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1410858957, i2, -1, "com.vk.donut.design.compose.banner.Notification (DonutBanner.kt:866)");
            }
            u890 n = z ? s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 108, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11) : s200.m(kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            q630.a aVar4 = q630.a.a;
            q630 C = s200.C(aVar4, n);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, C);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a2, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            if (z) {
                M.K(-628899965);
                aVar2 = aVar4;
                eVar = eVar2;
                bVar = bVar2;
                cVar = cVar2;
                aVar3 = aVar5;
                c2678a = c2678a2;
                ijv0.a(SeparatorDpi.At3x, SeparatorAppearance.Primary, true, null, new pco(2), M, 25014, 8);
            } else {
                aVar2 = aVar4;
                eVar = eVar2;
                c2678a = c2678a2;
                bVar = bVar2;
                aVar3 = aVar5;
                cVar = cVar2;
                M.K(-660573223);
            }
            M.j();
            float f = kqu0.b;
            float f2 = kqu0.c;
            u890 u890Var = new u890(f, f2, 0, f2);
            float f3 = kqu0.v;
            u890 u890Var2 = new u890(f3, f2, f3, f2);
            a.j g = androidx.compose.foundation.layout.a.g(6);
            if (!z) {
                u890Var = u890Var2;
            }
            q630.a aVar6 = aVar2;
            q630 C2 = s200.C(aVar6, u890Var);
            k a3 = j.a(g, dt1.a.k, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, C2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 H = s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            if (c.$EnumSwitchMapping$2[gvwVar.a.ordinal()] != 1) {
                throw alb0.c(-1239761443, M);
            }
            M.K(-1239759074);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(255741886, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ErrorCircleFill12> (VkIcons.kt:2384)");
            } else {
                i3 = -1;
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_error_circle_fill_12, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            pzu0.b(a4, null, H, l5g.k, M, 3512, 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            String str = gvwVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, xpyVar, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, M, 0, 0, 8184);
            M = M;
            M.G();
            if (xga0.c(aVar6, 4, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wxn(gvwVar, z, i);
        }
    }

    public static final void m(final a.b<?> bVar, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs<s3q0> gzsVar3;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1970367265);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar3 = gzsVar2;
            i2 |= M.y(gzsVar3) ? 256 : 128;
        } else {
            gzsVar3 = gzsVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= M.l(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1970367265, i2, -1, "com.vk.donut.design.compose.banner.SingleCardContent (DonutBanner.kt:495)");
            }
            T t = bVar.a;
            boolean z4 = t instanceof p3u;
            q630.a aVar2 = q630.a.a;
            if (z4) {
                M.K(107149440);
                j((p3u) t, et9.SINGLE_CARD, gzsVar, z, txj0.f(aVar2, 1.0f), M, ((i2 << 3) & 896) | 24624 | (i2 & 7168));
                M.j();
            } else {
                if (!(t instanceof swm0)) {
                    throw alb0.c(557644231, M);
                }
                M.K(107439104);
                o((swm0) t, et9.SINGLE_CARD, gzsVar3, z, z3, txj0.f(aVar2, 1.0f), M, (i2 & 896) | 196656 | (i2 & 7168) | (i2 & 57344));
                M = M;
                M.j();
            }
            if (a690.d(aVar2, 16, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    DonutBannerKt.m(a.b.this, gzsVar, gzsVar2, z, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void n(String str, vs9 vs9Var, gzs gzsVar, boolean z, q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1363606700);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(vs9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1363606700, i2, -1, "com.vk.donut.design.compose.banner.SingleLineCardContainer (DonutBanner.kt:681)");
            }
            float f = 16;
            q630 H = s200.H(q630Var, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            mlg0 a2 = qer0.a(uco.c(((spx0) M.r(uvi.u)).a()), 4, 0L, false);
            plg0 plg0Var = new plg0(0);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new qw7(1, gzsVar);
                M.R(x2);
            }
            q630 b2 = ojc.b(H, sg50Var, a2, false, plg0Var, (gzs) x2, 12);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            b(str, jaiVar, M, (i2 & 14) | ((i2 >> 12) & 112));
            f9t.e(txj0.h(q630.a.a, f), M, 6);
            a(vs9Var, z, gzsVar, M, ((i2 >> 3) & 14) | ((i2 >> 6) & 112) | i3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new apj(str, vs9Var, gzsVar, z, q630Var, jaiVar, i);
        }
    }

    public static final void o(final swm0 swm0Var, final et9 et9Var, final gzs gzsVar, final boolean z, final boolean z2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        String str;
        vs9 vs9Var;
        lg90 i0;
        androidx.compose.runtime.a aVar3;
        twn F;
        androidx.compose.runtime.a M = aVar.M(-1847641858);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(swm0Var) : M.y(swm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(et9Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1847641858, i2, -1, "com.vk.donut.design.compose.banner.SubscribeCard (DonutBanner.kt:579)");
            }
            String str2 = swm0Var.a;
            boolean z3 = et9Var == et9.SINGLE_CARD;
            q630 E = ahn.E(q630Var, "donut_new_banner_regular_support");
            int i3 = i2;
            vs9 vs9Var2 = swm0Var.c;
            int i4 = ((i3 >> 12) & 14) | ((i3 >> 6) & 112);
            M.K(692933074);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(692933074, i4, -1, "com.vk.donut.design.compose.banner.getSubscribedCardBackgroundPainter (DonutBanner.kt:616)");
            }
            if (z) {
                str = str2;
                vs9Var = vs9Var2;
                if (oq.h(1533846704, M)) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean s = ylu0Var.s();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var = new rek0(ylu0Var2.getBackground().B);
                if (z2) {
                    M.K(188784792);
                    qzu0.a.getClass();
                    i0 = qzu0.l0(M);
                } else {
                    M.K(188786452);
                    qzu0.a.getClass();
                    i0 = qzu0.i0(M);
                }
                M.j();
                lg90 lg90Var = i0;
                aVar3 = M;
                F = nr2.F(s, rek0Var, new hwv(lg90Var, lg90Var, 80, (Float.floatToRawIntBits(32) << 32) | (Float.floatToRawIntBits(12) & 4294967295L)), aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
            } else {
                M.K(1556557335);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean s2 = ylu0Var3.s();
                if (androidx.compose.runtime.b.d()) {
                    str = str2;
                    vs9Var = vs9Var2;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    str = str2;
                    vs9Var = vs9Var2;
                }
                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var2 = new rek0(ylu0Var4.getBackground().B);
                qzu0.a.getClass();
                F = nr2.F(s2, rek0Var2, new hwv(qzu0.k0(M), qzu0.j0(M), 104, (Float.floatToRawIntBits(38) << 32) | (Float.floatToRawIntBits(19) & 4294967295L)), M);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                aVar3 = M;
            }
            int i5 = i3 << 3;
            androidx.compose.runtime.a aVar4 = aVar3;
            f(str, z3, vs9Var, gzsVar2, z, E, F, kai.c(1387980897, new yb1(4, swm0Var, et9Var), aVar3), aVar4, (i5 & 57344) | (i5 & 7168) | 12582912 | 2097152);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s3 = aVar2.s();
        if (s3 != null) {
            s3.d = new wzs() { // from class: xsna.zxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DonutBannerKt.o(swm0.this, et9Var, gzsVar, z, z2, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void p(c.a aVar, et9 et9Var, androidx.compose.runtime.a aVar2, int i) {
        final long j;
        float f;
        androidx.compose.runtime.a M = aVar2.M(-663405127);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.o(et9Var.ordinal()) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-663405127, i2, -1, "com.vk.donut.design.compose.banner.SubscribedCardContentBenefits (DonutBanner.kt:796)");
            }
            int[] iArr = c.$EnumSwitchMapping$0;
            int i3 = iArr[et9Var.ordinal()];
            if (i3 == 1) {
                M.K(-1877157429);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().B;
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(-1877160130, M);
                }
                M.K(-1877154742);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getBackground().g;
                M.j();
            }
            int i4 = et9Var == et9.SINGLE_CARD ? 1 : 2;
            float f2 = 8;
            float f3 = 4;
            float f4 = 40;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1226589663, 54, -1, "com.vk.donut.design.compose.banner.utils.OverflowDetectionPolicy.Companion.availableSpace (OverflowDetectionPolicy.kt:38)");
            }
            t190.a aVar3 = new t190.a(((azl) M.r(uvi.h)).r0(f4));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y190.a aVar4 = new y190.a();
            int i5 = iArr[et9Var.ordinal()];
            if (i5 == 1) {
                f = f2;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 56;
            }
            x190.a(kai.c(-1110887703, new zzs() { // from class: xsna.pxn
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    String str;
                    int intValue = ((Integer) obj).intValue();
                    ((Integer) obj2).getClass();
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= aVar5.o(intValue) ? 4 : 2;
                    }
                    if (aVar5.t(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1110887703, intValue2, -1, "com.vk.donut.design.compose.banner.SubscribedCardContentBenefits.<anonymous> (DonutBanner.kt:808)");
                        }
                        boolean z = intValue == 0;
                        float I0 = ((azl) aVar5.r(uvi.h)).I0(z ? 10 : 16);
                        if (z) {
                            aVar5.K(-1732217963);
                            aVar5.j();
                            str = "";
                        } else {
                            str = zq.a(aVar5, 1883782535, R.string.donut_banner_benefits_more, aVar5, 0);
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.i0;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var3.getText().f;
                        long j3 = j;
                        yqv0.c(str, s200.H(txj0.x(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.l(q630.a.a, yk8.a.a(e43.l(new l5g(l5g.c(14, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new l5g(j3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, I0, 10), null, 6)), 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), j2, null, null, 0, 6, null, 0, false, 0, 0, null, frv0Var, aVar5, 0, 0, 8120);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), i4, f2, f3, aVar3, aVar4, kai.c(1601228518, new z77(aVar, 4), M), M, 14183430);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hp7(aVar, et9Var, i, 3);
        }
    }

    public static final void q(final a.c cVar, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final boolean z, final boolean z2, final boolean z3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs<s3q0> gzsVar3;
        gzs<s3q0> gzsVar4;
        boolean z4;
        boolean z5;
        c6j c6jVar;
        androidx.compose.runtime.a M = aVar.M(-288353266);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar3 = gzsVar;
            i2 |= M.y(gzsVar3) ? 32 : 16;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((i & 384) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 256 : 128;
        } else {
            gzsVar4 = gzsVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= M.l(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            z5 = z3;
            i2 |= M.l(z5) ? 131072 : 65536;
        } else {
            z5 = z3;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-288353266, i2, -1, "com.vk.donut.design.compose.banner.TwoCardContent (DonutBanner.kt:449)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 6;
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f));
            M.K(-1003410150);
            M.K(212064437);
            M.j();
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new op10(azlVar);
                M.R(x);
            }
            final op10 op10Var = (op10) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new c6j();
                M.R(x2);
            }
            c6j c6jVar2 = (c6j) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            final wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new h6j(c6jVar2);
                M.R(x4);
            }
            final h6j h6jVar = (h6j) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                c6jVar = c6jVar2;
                x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                M.R(x5);
            } else {
                c6jVar = c6jVar2;
            }
            final wh50 wh50Var2 = (wh50) x5;
            boolean y = M.y(op10Var) | M.o(257);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                x6 = new cp10() { // from class: com.vk.donut.design.compose.banner.DonutBannerKt$TwoCardContent$$inlined$ConstraintLayout$2
                    @Override // xsna.cp10
                    public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        wh50.this.getValue();
                        long f2 = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                        wh50Var.getValue();
                        final op10 op10Var2 = op10Var;
                        return ep10Var.Q((int) (f2 >> 32), (int) (f2 & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.donut.design.compose.banner.DonutBannerKt$TwoCardContent$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public final s3q0 invoke(tra0.a aVar3) {
                                op10.this.e(aVar3, list, linkedHashMap);
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(x6);
            }
            cp10 cp10Var = (cp10) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new gzs<s3q0>() { // from class: com.vk.donut.design.compose.banner.DonutBannerKt$TwoCardContent$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final s3q0 invoke() {
                        wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        h6jVar.e = true;
                        return s3q0.a;
                    }
                };
                M.R(x7);
            }
            final gzs gzsVar5 = (gzs) x7;
            boolean y2 = M.y(op10Var);
            Object x8 = M.x();
            if (y2 || x8 == c0012a) {
                x8 = new izs<tgi0, s3q0>() { // from class: com.vk.donut.design.compose.banner.DonutBannerKt$TwoCardContent$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public final s3q0 invoke(tgi0 tgi0Var) {
                        e4p0.a(tgi0Var, op10.this);
                        return s3q0.a;
                    }
                };
                M.R(x8);
            }
            q630 b2 = egi0.b(F, false, (izs) x8);
            final gzs<s3q0> gzsVar6 = gzsVar3;
            final boolean z6 = z5;
            final c6j c6jVar3 = c6jVar;
            final gzs<s3q0> gzsVar7 = gzsVar4;
            final boolean z7 = z4;
            joy.a(b2, kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.donut.design.compose.banner.DonutBannerKt$TwoCardContent$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // xsna.wzs
                public final s3q0 invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    androidx.compose.runtime.a aVar4 = aVar3;
                    int intValue = num.intValue();
                    if ((intValue & 3) == 2 && aVar4.e()) {
                        aVar4.h();
                    } else {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        wh50.this.setValue(s3q0.a);
                        c6j c6jVar4 = c6jVar3;
                        int i3 = c6jVar4.b;
                        c6jVar4.l();
                        c6j c6jVar5 = c6jVar3;
                        aVar4.K(-1557837132);
                        c6j c6jVar6 = c6j.this;
                        s5j j = c6jVar6.j();
                        s5j j2 = c6jVar6.j();
                        swm0 swm0Var = cVar.a;
                        et9 et9Var = et9.DOUBLE_CARD;
                        boolean J = aVar4.J(j2);
                        Object x9 = aVar4.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (J || x9 == c0012a2) {
                            x9 = new DonutBannerKt.a(j2);
                            aVar4.R(x9);
                        }
                        q630.a aVar5 = q630.a.a;
                        DonutBannerKt.o(swm0Var, et9Var, gzsVar7, z7, z6, c6j.i(aVar5, j, (izs) x9), aVar4, 48);
                        p3u p3uVar = cVar.b;
                        boolean J2 = aVar4.J(j);
                        Object x10 = aVar4.x();
                        if (J2 || x10 == c0012a2) {
                            x10 = new DonutBannerKt.b(j);
                            aVar4.R(x10);
                        }
                        DonutBannerKt.j(p3uVar, et9Var, gzsVar6, z7, c6j.i(aVar5, j2, (izs) x10), aVar4, 48);
                        aVar4.j();
                        if (c6jVar3.b != i3) {
                            bap.i(gzsVar5, aVar4, 6);
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                    return s3q0.a;
                }
            }, M), cp10Var, M, 48, 0);
            M.j();
            if (a690.d(aVar2, z ? 4 : f, M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xxn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    DonutBannerKt.q(a.c.this, gzsVar, gzsVar2, z, z2, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

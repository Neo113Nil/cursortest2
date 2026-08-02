package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.lrl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rpm {
    public static final BlazeDp a = new BlazeDp(4);
    public static final BlazeDp b = new BlazeDp(2);

    public static final void a(int i, of3 of3Var) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(628214051);
        if (i == 0 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            udj.b(oea.v(R.string.blaze_search_error_generic, av8Var2), l98.f0(bkh.d(utc.a, 1.0f), 16.0f, 32.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), l3m.c, v8a.v(14), 0L, 0L, 0, false, 0, 0, null, av8Var, 3456, 0, 131056);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new o81(i, 13);
        }
    }

    public static final void b(lrl lrlVar, String str, Function1 function1, Function1 function12, Function0 function0, Function0 function02, BlazeWidgetDelegate blazeWidgetDelegate, p3e p3eVar, of3 of3Var, int i) {
        int i2;
        lrl lrlVar2;
        boolean z;
        g28 g28Var;
        a99 a99Var;
        av8 av8Var;
        av8 av8Var2;
        g28 g28Var2;
        lrlVar.getClass();
        str.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        blazeWidgetDelegate.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1588227264);
        if ((i & 6) == 0) {
            i2 = (av8Var3.g(lrlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var3.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var3.i(function12) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var3.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var3.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? av8Var3.g(blazeWidgetDelegate) : av8Var3.i(blazeWidgetDelegate) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var3.g(p3eVar) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((i3 & 4793491) == 4793490 && av8Var3.D()) {
            av8Var3.W();
            lrlVar2 = lrlVar;
        } else {
            g28 g28Var3 = bkh.c;
            xtc a0 = l98.a0(n9e.q(g28Var3, l3m.a, oyn.e), p3eVar);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int G = z8e.G(av8Var3);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, a0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var3.S || !Intrinsics.c(av8Var3.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var3, G, f50Var);
            }
            waa.K(av8Var3, C, hf3.d);
            waa.o(str, function1, function12, function0, function02, null, av8Var3, (i3 >> 3) & 65534);
            if (lrlVar instanceof nvl) {
                av8Var3.d0(710652677);
                e12.a(6, av8Var3, g28Var3);
                av8Var3.s(false);
                av8Var3 = av8Var3;
                z = true;
                lrlVar2 = lrlVar;
            } else {
                boolean z2 = lrlVar instanceof lrl.d;
                a99 a99Var2 = nf3.a;
                if (z2) {
                    av8Var3.d0(710776491);
                    lrl.d dVar = (lrl.d) lrlVar;
                    BlazeDataSourceType blazeDataSourceType = dVar.a;
                    av8Var3.d0(1269855086);
                    boolean g = av8Var3.g(blazeDataSourceType);
                    Object O = av8Var3.O();
                    if (g || O == a99Var2) {
                        BlazeDataSourceType blazeDataSourceType2 = dVar.a;
                        BlazeWidgetLayout blazeWidgetLayout = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(BlazeWidgetLayout.Presets.MomentsWidget.Grid.INSTANCE.getThreeColumnsVerticalRectangles());
                        BlazeWidgetItemStyle widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle();
                        BlazeWidgetItemImageStyle image = widgetItemStyle.getImage();
                        image.setMargins(new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)));
                        image.setCornerRadius(new BlazeDp(0));
                        image.getGradientOverlay().setVisible(false);
                        widgetItemStyle.getTitle().setVisible(false);
                        widgetItemStyle.getStatusIndicator().setVisible(false);
                        widgetItemStyle.getBadge().setVisible(false);
                        widgetItemStyle.getDurationElement().setVisible(false);
                        widgetItemStyle.getEventTime$blazesdk_release().setVisible(false);
                        widgetItemStyle.setCornerRadius(new BlazeDp(0));
                        BlazeDp blazeDp = b;
                        blazeWidgetLayout.setHorizontalItemsSpacing(blazeDp);
                        blazeWidgetLayout.setVerticalItemsSpacing(blazeDp);
                        blazeWidgetLayout.setMargins(new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)));
                        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(BlazeMomentsPlayerStyle.INSTANCE.base());
                        blazeMomentsPlayerStyle.getButtons().getSearch().setVisible(false);
                        av8Var2 = av8Var3;
                        g28Var2 = g28Var3;
                        BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler = new BlazeComposeWidgetMomentsStateHandler("blaze_inner_search_suggestions_moments_grid", blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType2, null, false, blazeWidgetDelegate, null, null, null, null, 1936, null);
                        av8Var2.n0(blazeComposeWidgetMomentsStateHandler);
                        O = blazeComposeWidgetMomentsStateHandler;
                    } else {
                        g28Var2 = g28Var3;
                        av8Var2 = av8Var3;
                    }
                    av8Var2.s(false);
                    s9a.l(g28Var2, (BlazeComposeWidgetMomentsStateHandler) O, av8Var2, 48);
                    av8Var2.s(false);
                    z = true;
                    lrlVar2 = lrlVar;
                    av8Var3 = av8Var2;
                } else {
                    lrlVar2 = lrlVar;
                    if (lrlVar2 instanceof lrl.c) {
                        av8Var3.d0(711184017);
                        av8Var3.d0(1269867873);
                        Object O2 = av8Var3.O();
                        if (O2 == a99Var2) {
                            BlazeDataSourceType.Search search = new BlazeDataSourceType.Search(((lrl.c) lrlVar2).a, null, null, 6, null);
                            BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(BlazeMomentsPlayerStyle.INSTANCE.base());
                            blazeMomentsPlayerStyle2.getButtons().getSearch().setVisible(false);
                            a99Var = a99Var2;
                            BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler = new BlazeComposeWidgetStoriesStateHandler("blaze_inner_search_stories", BlazeWidgetLayout.Presets.StoriesWidget.Row.INSTANCE.getCircles(), null, search, null, blazeWidgetDelegate, null, false, null, null, 852, null);
                            BlazeWidgetLayout blazeWidgetLayout2 = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(BlazeWidgetLayout.Presets.MomentsWidget.Row.INSTANCE.getVerticalAnimatedThumbnailsRectangles());
                            BlazeWidgetItemImageStyle image2 = blazeWidgetLayout2.getWidgetItemStyle().getImage();
                            BlazeDp blazeDp2 = a;
                            image2.setCornerRadius(blazeDp2);
                            g28Var = g28Var3;
                            BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler2 = new BlazeComposeWidgetMomentsStateHandler("blaze_inner_search_moments", blazeWidgetLayout2, blazeMomentsPlayerStyle2, search, null, false, blazeWidgetDelegate, null, null, null, null, 1936, null);
                            BlazeWidgetLayout blazeWidgetLayout3 = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(BlazeWidgetLayout.Presets.VideosWidget.Row.INSTANCE.getHorizontalRectangles());
                            blazeWidgetLayout3.getWidgetItemStyle().getImage().setCornerRadius(blazeDp2);
                            Unit unit = Unit.a;
                            zbm zbmVar = new zbm(blazeComposeWidgetStoriesStateHandler, blazeComposeWidgetMomentsStateHandler2, new BlazeComposeWidgetVideosStateHandler("blaze_inner_search_videos", blazeWidgetLayout3, null, search, null, false, blazeWidgetDelegate, null, null, 404, null));
                            av8Var = av8Var3;
                            av8Var.n0(zbmVar);
                            O2 = zbmVar;
                        } else {
                            g28Var = g28Var3;
                            a99Var = a99Var2;
                            av8Var = av8Var3;
                        }
                        zbm zbmVar2 = (zbm) O2;
                        av8Var.s(false);
                        Object[] objArr = new Object[0];
                        av8Var.d0(1269873005);
                        Object O3 = av8Var.O();
                        a99 a99Var3 = a99Var;
                        if (O3 == a99Var3) {
                            O3 = new wel(26);
                            av8Var.n0(O3);
                        }
                        av8Var.s(false);
                        e1d e1dVar = (e1d) o3a.L(objArr, null, null, (Function0) O3, av8Var, 3072, 6);
                        av8Var.d0(1269874836);
                        boolean g2 = av8Var.g(e1dVar) | ((i3 & 14) == 4) | av8Var.i(zbmVar2);
                        Object O4 = av8Var.O();
                        if (g2 || O4 == a99Var3) {
                            lrlVar2 = lrlVar;
                            O4 = new mth(14, e1dVar, lrlVar2, zbmVar2);
                            av8Var.n0(O4);
                        } else {
                            lrlVar2 = lrlVar;
                        }
                        av8Var.s(false);
                        hz8.t((Function0) O4, av8Var);
                        av8 av8Var4 = av8Var;
                        tmm.a((lrl.c) lrlVar2, zbmVar2.a, zbmVar2.b, zbmVar2.c, g28Var, av8Var4, 24576);
                        av8Var3 = av8Var4;
                        av8Var3.s(false);
                    } else {
                        av8Var3 = av8Var3;
                        if (lrlVar2 instanceof lrl.b) {
                            av8Var3.d0(712085528);
                            c(((lrl.b) lrlVar2).a, av8Var3, 0);
                            av8Var3.s(false);
                        } else {
                            if (!(lrlVar2 instanceof lrl.a)) {
                                throw dmi.h(av8Var3, 1269850148, false);
                            }
                            av8Var3.d0(712206397);
                            a(0, av8Var3);
                            av8Var3.s(false);
                        }
                    }
                    z = true;
                }
            }
            av8Var3.s(z);
        }
        eqf u = av8Var3.u();
        if (u != null) {
            u.d = new e41(lrlVar2, str, function1, function12, function0, function02, blazeWidgetDelegate, p3eVar, i);
        }
    }

    public static final void c(String str, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(350382785);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && av8Var2.D()) {
            av8Var2.W();
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            udj.b(oea.w(R.string.blaze_search_no_results, new Object[]{str}, av8Var2), l98.f0(bkh.d(utc.a, 1.0f), 16.0f, 32.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), l3m.c, v8a.v(14), 0L, 0L, 0, false, 0, 0, null, av8Var, 3456, 0, 131056);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k93(str, i, 2);
        }
    }
}

package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.row.BlazeComposeStoriesWidgetRowViewKt;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class oml {
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(n5c n5cVar, xtc xtcVar, String str, ia9 ia9Var, boolean z, Function1 function1, Function0 function0, of3 of3Var, int i, int i2) {
        int i3;
        String str2;
        boolean z2;
        int i4;
        Function1 function12;
        int i5;
        Function0 function02;
        n5c n5cVar2;
        Function1 function13;
        eqf u;
        int i6;
        boolean z3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-424853536);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(n5cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str2 = str;
            i3 |= av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var.e(ia9Var.ordinal()) ? a.o : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= av8Var.h(z2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function12 = function1;
                i3 |= av8Var.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function02 = function0;
                    i3 |= av8Var.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if (av8Var.T(i3 & 1, (599187 & i3) == 599186)) {
                        n5cVar2 = n5cVar;
                        av8Var.W();
                        function13 = function12;
                    } else {
                        if (i7 != 0) {
                            z2 = false;
                        }
                        Function1 function14 = i4 != 0 ? null : function12;
                        Function0 function03 = i5 != 0 ? null : function02;
                        Context context = (Context) av8Var.k(nz.b);
                        WSCStory wSCStory = n5cVar.a;
                        boolean g = av8Var.g(wSCStory.getSdkId());
                        Object O = av8Var.O();
                        Object obj = nf3.a;
                        if (g || O == obj) {
                            O = e.f(Boolean.FALSE);
                            av8Var.n0(O);
                        }
                        e1d e1dVar = (e1d) O;
                        boolean g2 = av8Var.g(wSCStory.getSdkId());
                        Object O2 = av8Var.O();
                        if (g2 || O2 == obj) {
                            i6 = i3;
                            pml pmlVar = new pml(new ndk(n5cVar, 13), new hcc(context, ia9Var), new gfl(1, e1dVar), new gfl(2, e1dVar));
                            av8Var.n0(pmlVar);
                            O2 = pmlVar;
                        } else {
                            i6 = i3;
                        }
                        BlazeWidgetDelegate blazeWidgetDelegate = (BlazeWidgetDelegate) O2;
                        boolean g3 = av8Var.g(wSCStory.getSdkId());
                        Object O3 = av8Var.O();
                        if (g3 || O3 == obj) {
                            BlazeWidgetLayout.Presets.StoriesWidget.Row row = BlazeWidgetLayout.Presets.StoriesWidget.Row.INSTANCE;
                            BlazeWidgetLayout blazeWidgetLayout = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(row.getSingleItemHorizontalRectangle());
                            blazeWidgetLayout.setHorizontalItemsSpacing(new BlazeDp(0));
                            blazeWidgetLayout.setVerticalItemsSpacing(new BlazeDp(0));
                            BlazeInsets blazeInsets = (BlazeInsets) ParcelableExtensionKt.blazeDeepCopy(row.getSingleItemHorizontalRectangle().getMargins());
                            blazeInsets.setStart(new BlazeDp(0));
                            blazeInsets.setEnd(new BlazeDp(0));
                            blazeInsets.setTop(new BlazeDp(0));
                            blazeInsets.setBottom(new BlazeDp(0));
                            blazeWidgetLayout.setMargins(blazeInsets);
                            BlazeWidgetItemStyle blazeWidgetItemStyle = (BlazeWidgetItemStyle) ParcelableExtensionKt.blazeDeepCopy(row.getSingleItemHorizontalRectangle().getWidgetItemStyle());
                            blazeWidgetItemStyle.setCornerRadius(new BlazeDp(16));
                            blazeWidgetItemStyle.setCornerRadiusRatio(null);
                            BlazeWidgetItemImageStyle blazeWidgetItemImageStyle = (BlazeWidgetItemImageStyle) ParcelableExtensionKt.blazeDeepCopy(row.getSingleItemHorizontalRectangle().getWidgetItemStyle().getImage());
                            blazeWidgetItemImageStyle.setCornerRadius(new BlazeDp(16));
                            blazeWidgetItemImageStyle.setCornerRadiusRatio(null);
                            blazeWidgetItemStyle.setImage(blazeWidgetItemImageStyle);
                            BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle = (BlazeWidgetItemBadgeStyle) ParcelableExtensionKt.blazeDeepCopy(row.getSingleItemHorizontalRectangle().getWidgetItemStyle().getBadge());
                            blazeWidgetItemBadgeStyle.setVisible(false);
                            blazeWidgetItemStyle.setBadge(blazeWidgetItemBadgeStyle);
                            blazeWidgetItemStyle.getTitle().setVisible(false);
                            BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle = (BlazeWidgetItemStatusIndicatorStyle) ParcelableExtensionKt.blazeDeepCopy(row.getSingleItemHorizontalRectangle().getWidgetItemStyle().getStatusIndicator());
                            blazeWidgetItemStatusIndicatorStyle.setVisible(false);
                            blazeWidgetItemStyle.setStatusIndicator(blazeWidgetItemStatusIndicatorStyle);
                            blazeWidgetLayout.setWidgetItemStyle(blazeWidgetItemStyle);
                            O3 = new BlazeComposeWidgetStoriesStateHandler(str2, blazeWidgetLayout, BlazeStoryPlayerStyle.INSTANCE.base(), new BlazeDataSourceType.Ids(kotlin.collections.a.c(wSCStory.getSdkId()), null, null, 6, null), null, blazeWidgetDelegate, null, false, null, null, 976, null);
                            av8Var.n0(O3);
                        }
                        BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler = (BlazeComposeWidgetStoriesStateHandler) O3;
                        Unit unit = Unit.a;
                        boolean i8 = av8Var.i(blazeComposeWidgetStoriesStateHandler);
                        Object O4 = av8Var.O();
                        if (i8 || O4 == obj) {
                            O4 = new hje(blazeComposeWidgetStoriesStateHandler, null, 16);
                            av8Var.n0(O4);
                        }
                        hz8.o(av8Var, unit, (Function2) O4);
                        if (function03 == null) {
                            av8Var.d0(459694266);
                            av8Var.s(false);
                            z3 = true;
                        } else {
                            av8Var.d0(459694267);
                            d6b d6bVar = d6b.ON_RESUME;
                            boolean g4 = av8Var.g(function03);
                            Object O5 = av8Var.O();
                            if (g4 || O5 == obj) {
                                z3 = true;
                                O5 = new vdl(1, function03);
                                av8Var.n0(O5);
                            } else {
                                z3 = true;
                            }
                            jca.b(d6bVar, null, (Function0) O5, av8Var, 6);
                            av8Var.s(false);
                        }
                        xtc O6 = kda.O(wnn.A(qx9.p(bkh.d(xtcVar, 1.0f), 1.7777778f), o7g.a(16.0f)), "wsc_clip_card", av8Var);
                        k1c c = e12.c(uxf.c, false);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, O6);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        n12 n12Var = n12.a;
                        utc utcVar = utc.a;
                        Function0 function04 = function03;
                        BlazeComposeStoriesWidgetRowViewKt.BlazeComposeStoriesWidgetRowView(f6a.D(n12Var.b(utcVar), 1.05f, 1.05f), blazeComposeWidgetStoriesStateHandler, false, av8Var, BlazeComposeWidgetStoriesStateHandler.$stable << 3, 4);
                        Boolean isImageBasedStory = wSCStory.isImageBasedStory();
                        Boolean bool = Boolean.TRUE;
                        yqo.j(0, av8Var, n12Var.a(utcVar, uxf.e), n5cVar.c, Intrinsics.c(isImageBasedStory, bool));
                        n5cVar2 = n5cVar;
                        kq9.b(s6a.N(R.drawable.ic_highlights_white, 6, av8Var), null, n12Var.a(bkh.l(utcVar, 48.0f), uxf.g), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                        av8Var = av8Var;
                        Function1 function15 = function14;
                        yso.m(Intrinsics.c(wSCStory.isImageBasedStory(), bool), wSCStory.getType(), n5cVar2.c, z2, n12Var.a(utcVar, uxf.j), function15, av8Var, ((i6 >> 3) & 7168) | (i6 & 458752));
                        fz8.e(((Boolean) e1dVar.getValue()).booleanValue(), n12Var.b(utcVar), null, null, null, yqo.H(2139451454, av8Var, new e6i(27, blazeComposeWidgetStoriesStateHandler, n5cVar2)), av8Var, 196608, 28);
                        av8Var.s(true);
                        function02 = function04;
                        function13 = function15;
                    }
                    u = av8Var.u();
                    if (u == null) {
                        u.d = new x72(n5cVar2, xtcVar, str, ia9Var, z2, function13, function02, i, i2);
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (av8Var.T(i3 & 1, (599187 & i3) == 599186)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function02 = function0;
            if (av8Var.T(i3 & 1, (599187 & i3) == 599186)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function02 = function0;
        if (av8Var.T(i3 & 1, (599187 & i3) == 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}

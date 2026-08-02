package com.blaze.blazesdk.features.videos.widgets.compose.row;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract;
import com.blaze.blazesdk.features.videos.widgets.base.BlazeBaseVideosWidget;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.features.videos.widgets.row.BlazeVideosWidgetRowView;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.av8;
import defpackage.bql;
import defpackage.di;
import defpackage.eqf;
import defpackage.fqj;
import defpackage.ls1;
import defpackage.nf3;
import defpackage.nz;
import defpackage.of3;
import defpackage.ox1;
import defpackage.td4;
import defpackage.x80;
import defpackage.xtc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxtc;", "modifier", "Lcom/blaze/blazesdk/features/videos/widgets/compose/BlazeComposeWidgetVideosStateHandler;", "widgetVideosStateHandler", "", "supportsNestedHorizontalScroll", "", "BlazeComposeVideosWidgetRowView", "(Lxtc;Lcom/blaze/blazesdk/features/videos/widgets/compose/BlazeComposeWidgetVideosStateHandler;ZLof3;II)V", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeComposeVideosWidgetRowViewKt {
    @Keep
    public static final void BlazeComposeVideosWidgetRowView(@NotNull xtc xtcVar, @NotNull BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, boolean z, @Nullable of3 of3Var, int i, int i2) {
        int i3;
        xtcVar.getClass();
        blazeComposeWidgetVideosStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-651431943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= av8Var.i(blazeComposeWidgetVideosStateHandler) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            if (i4 != 0) {
                z = false;
            }
            a(xtcVar, blazeComposeWidgetVideosStateHandler, z, av8Var, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        }
        boolean z2 = z;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x80(i, i2, 3, xtcVar, blazeComposeWidgetVideosStateHandler, z2);
        }
    }

    public static final void a(xtc xtcVar, BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, boolean z, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2072308760);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(blazeComposeWidgetVideosStateHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            WidgetVideosContract widgetNativeView = blazeComposeWidgetVideosStateHandler.getWidgetNativeView();
            BlazeVideosWidgetRowView blazeVideosWidgetRowView = widgetNativeView instanceof BlazeVideosWidgetRowView ? (BlazeVideosWidgetRowView) widgetNativeView : null;
            av8Var.d0(-1391093824);
            if (blazeVideosWidgetRowView == null) {
                BlazeVideosWidgetRowView blazeVideosWidgetRowView2 = new BlazeVideosWidgetRowView((Context) av8Var.k(nz.b), null, 0, 0, 14, null);
                blazeComposeWidgetVideosStateHandler.setWidgetNativeView$blazesdk_release(blazeVideosWidgetRowView2);
                BlazeBaseVideosWidget.initWidget$default(blazeVideosWidgetRowView2, blazeComposeWidgetVideosStateHandler.getWidgetLayout(), blazeComposeWidgetVideosStateHandler.getPlayerStyle(), blazeComposeWidgetVideosStateHandler.getDataSourceType(), blazeComposeWidgetVideosStateHandler.getCachingLevel(), blazeComposeWidgetVideosStateHandler.getWidgetId(), null, blazeComposeWidgetVideosStateHandler.getShouldOrderWidgetByReadStatus(), blazeComposeWidgetVideosStateHandler.getWidgetDelegate(), blazeComposeWidgetVideosStateHandler.getPerItemStyleOverrides$blazesdk_release(), null, blazeComposeWidgetVideosStateHandler.getOnWidgetItemClickHandler$blazesdk_release(), 544, null);
                blazeVideosWidgetRowView = blazeVideosWidgetRowView2;
            }
            av8Var.s(false);
            if (z) {
                BlazeWidgetLayout widgetLayout = blazeComposeWidgetVideosStateHandler.getWidgetLayout();
                xtcVar.getClass();
                widgetLayout.getClass();
                xtcVar2 = fqj.q(xtcVar, new bql(widgetLayout, blazeVideosWidgetRowView));
            } else {
                xtcVar2 = xtcVar;
            }
            av8Var.d0(-1391052950);
            boolean i4 = av8Var.i(blazeVideosWidgetRowView);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (i4 || O == obj) {
                O = new ox1(blazeVideosWidgetRowView, i3);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            av8Var.s(false);
            av8Var.d0(-1391051018);
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new ls1(27);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            td4.a(function1, xtcVar2, (Function1) O2, av8Var, 384, 0);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new di(xtcVar, blazeComposeWidgetVideosStateHandler, z, i, 3);
        }
    }
}

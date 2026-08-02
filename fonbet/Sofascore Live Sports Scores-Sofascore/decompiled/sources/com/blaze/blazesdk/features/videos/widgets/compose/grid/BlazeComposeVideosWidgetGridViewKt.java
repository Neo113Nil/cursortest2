package com.blaze.blazesdk.features.videos.widgets.compose.grid;

import android.content.Context;
import androidx.annotation.Keep;
import com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract;
import com.blaze.blazesdk.features.videos.widgets.base.BlazeBaseVideosWidget;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.features.videos.widgets.grid.BlazeVideosWidgetGridView;
import defpackage.a99;
import defpackage.av8;
import defpackage.eqf;
import defpackage.lj;
import defpackage.ls1;
import defpackage.nf3;
import defpackage.nz;
import defpackage.of3;
import defpackage.ox1;
import defpackage.td4;
import defpackage.xtc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxtc;", "modifier", "Lcom/blaze/blazesdk/features/videos/widgets/compose/BlazeComposeWidgetVideosStateHandler;", "widgetVideosStateHandler", "", "BlazeComposeVideosWidgetGridView", "(Lxtc;Lcom/blaze/blazesdk/features/videos/widgets/compose/BlazeComposeWidgetVideosStateHandler;Lof3;I)V", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeComposeVideosWidgetGridViewKt {
    @Keep
    public static final void BlazeComposeVideosWidgetGridView(@NotNull xtc xtcVar, @NotNull BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler, @Nullable of3 of3Var, int i) {
        int i2;
        xtcVar.getClass();
        blazeComposeWidgetVideosStateHandler.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-505983019);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(blazeComposeWidgetVideosStateHandler) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            WidgetVideosContract widgetNativeView = blazeComposeWidgetVideosStateHandler.getWidgetNativeView();
            BlazeVideosWidgetGridView blazeVideosWidgetGridView = widgetNativeView instanceof BlazeVideosWidgetGridView ? (BlazeVideosWidgetGridView) widgetNativeView : null;
            av8Var.d0(-806280733);
            if (blazeVideosWidgetGridView == null) {
                BlazeVideosWidgetGridView blazeVideosWidgetGridView2 = new BlazeVideosWidgetGridView((Context) av8Var.k(nz.b), null, 0, 0, 14, null);
                blazeComposeWidgetVideosStateHandler.setWidgetNativeView$blazesdk_release(blazeVideosWidgetGridView2);
                BlazeBaseVideosWidget.initWidget$default(blazeVideosWidgetGridView2, blazeComposeWidgetVideosStateHandler.getWidgetLayout(), blazeComposeWidgetVideosStateHandler.getPlayerStyle(), blazeComposeWidgetVideosStateHandler.getDataSourceType(), blazeComposeWidgetVideosStateHandler.getCachingLevel(), blazeComposeWidgetVideosStateHandler.getWidgetId(), null, blazeComposeWidgetVideosStateHandler.getShouldOrderWidgetByReadStatus(), blazeComposeWidgetVideosStateHandler.getWidgetDelegate(), blazeComposeWidgetVideosStateHandler.getPerItemStyleOverrides$blazesdk_release(), null, blazeComposeWidgetVideosStateHandler.getOnWidgetItemClickHandler$blazesdk_release(), 544, null);
                blazeVideosWidgetGridView = blazeVideosWidgetGridView2;
            }
            av8Var.s(false);
            av8Var.d0(-806248757);
            boolean i3 = av8Var.i(blazeVideosWidgetGridView);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i3 || O == a99Var) {
                O = new ox1(blazeVideosWidgetGridView, 1);
                av8Var.n0(O);
            }
            Function1 function1 = (Function1) O;
            av8Var.s(false);
            av8Var.d0(-806246824);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new ls1(26);
                av8Var.n0(O2);
            }
            av8Var.s(false);
            td4.a(function1, xtcVar, (Function1) O2, av8Var, ((i2 << 3) & 112) | 384, 0);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(xtcVar, (Object) blazeComposeWidgetVideosStateHandler, i, 4);
        }
    }
}

package com.sofascore.results.wc26.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import defpackage.auh;
import defpackage.sy8;
import defpackage.t01;
import defpackage.wca;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/wc26/widget/WorldCupWidgetReceiver;", "Lsy8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WorldCupWidgetReceiver extends sy8 {
    public final auh c = new auh(1);

    @Override // defpackage.sy8
    public final t01 a() {
        return this.c;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        context.getClass();
        super.onDisabled(context);
        wca.r(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        wca.G(context);
    }

    @Override // defpackage.sy8, android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        super.onUpdate(context, appWidgetManager, iArr);
        wca.G(context);
    }
}

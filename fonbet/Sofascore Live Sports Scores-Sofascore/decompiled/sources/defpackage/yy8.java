package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yy8 {
    public static final void a(@NotNull RemoteViews remoteViews, @NotNull Context context, int i, int i2, @NotNull String str, @NotNull ixf ixfVar) {
        if (Build.VERSION.SDK_INT > 31) {
            g13.a.a(remoteViews, i2, ixfVar);
            return;
        }
        Intent putExtra = new Intent(context, (Class<?>) GlanceRemoteViewsService.class).putExtra("appWidgetId", i).putExtra("androidx.glance.widget.extra.view_id", i2).putExtra("androidx.glance.widget.extra.size_info", str);
        putExtra.setData(Uri.parse(putExtra.toUri(1)));
        if (context.getPackageManager().resolveService(putExtra, 0) == null) {
            a70.r("GlanceRemoteViewsService could not be resolved, check the app manifest.");
            return;
        }
        remoteViews.setRemoteAdapter(i2, putExtra);
        l3a l3aVar = GlanceRemoteViewsService.a;
        synchronized (l3aVar) {
            l3aVar.a.put(l3a.c(i, i2, str), ixfVar);
            Unit unit = Unit.a;
        }
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, i2);
    }
}

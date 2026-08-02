package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class sy8 extends AppWidgetProvider {
    public static final /* synthetic */ int b = 0;
    public final hs4 a = z45.a;

    public abstract t01 a();

    public final void b(ku3 ku3Var, Context context) {
        xw3.L(ku3Var, null, null, new yp7(context, this, (rq3) null, 15), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        rz8.G(this, this.a, new mj5(this, context, i, bundle, (rq3) null, 3));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        rz8.G(this, this.a, new xy5(this, context, iArr, (rq3) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x001f, B:14:0x0028, B:16:0x0030, B:18:0x0039, B:21:0x0048, B:22:0x004f, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:28:0x00a3, B:30:0x006e, B:32:0x0080, B:34:0x008b, B:35:0x0097, B:37:0x0093, B:38:0x009b, B:39:0x00a2, B:40:0x0063), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:3:0x0002, B:5:0x0008, B:11:0x001f, B:14:0x0028, B:16:0x0030, B:18:0x0039, B:21:0x0048, B:22:0x004f, B:23:0x0050, B:24:0x0057, B:25:0x0058, B:28:0x00a3, B:30:0x006e, B:32:0x0080, B:34:0x008b, B:35:0x0097, B:37:0x0093, B:38:0x009b, B:39:0x00a2, B:40:0x0063), top: B:2:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        sy8 sy8Var;
        Context context2;
        String canonicalName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -19011148) {
                    sy8Var = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        super.onReceive(context2, intent);
                    }
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context2);
                    String packageName = context2.getPackageName();
                    canonicalName = sy8Var.getClass().getCanonicalName();
                    if (canonicalName != null) {
                    }
                } else {
                    if (hashCode == 649033583) {
                        sy8Var = this;
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                            super.onReceive(context2, intent);
                        }
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context2);
                        String packageName2 = context2.getPackageName();
                        canonicalName = sy8Var.getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        ComponentName componentName = new ComponentName(packageName2, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            appWidgetIds.getClass();
                        } else {
                            appWidgetIds = appWidgetManager2.getAppWidgetIds(componentName);
                        }
                        sy8Var.onUpdate(context2, appWidgetManager2, appWidgetIds);
                        return;
                    }
                    if (hashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        rz8.G(this, this.a, new mj5(this, context, intExtra, stringExtra, (rq3) null, 4));
                        return;
                    }
                }
            }
            sy8Var = this;
            context2 = context;
            super.onReceive(context2, intent);
        } catch (Throwable unused) {
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        rz8.G(this, this.a, new va8(this, context, iArr, (rq3) null, 3));
    }
}

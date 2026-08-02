package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.sofascore.results.R;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xy8 implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService a;
    public final int b;
    public final int c;
    public final String d;

    public xy8(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.a = glanceRemoteViewsService;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final ixf a() {
        ixf ixfVar;
        l3a l3aVar = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        l3a l3aVar2 = GlanceRemoteViewsService.a;
        synchronized (l3aVar2) {
            ixfVar = (ixf) l3aVar2.a.get(l3a.c(i, i2, str));
            if (ixfVar == null) {
                ixfVar = ixf.e;
            }
        }
        return ixfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (r12.Z(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r12 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(re0 re0Var, sq3 sq3Var) {
        wy8 wy8Var;
        int i;
        t01 t01Var;
        ComponentName componentName;
        String className;
        yda ydaVar;
        if (sq3Var instanceof wy8) {
            wy8Var = (wy8) sq3Var;
            int i2 = wy8Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wy8Var.u = i2 - Integer.MIN_VALUE;
                Object obj = wy8Var.s;
                lu3 lu3Var = lu3.a;
                i = wy8Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.a).getAppWidgetInfo(this.b);
                    if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
                        t01Var = null;
                    } else {
                        Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                        newInstance.getClass();
                        t01Var = ((sy8) newInstance).a();
                    }
                    if (t01Var != null) {
                        l8h l8hVar = m8h.a;
                        va8 va8Var = new va8(this, re0Var, t01Var, rq3Var, 4);
                        wy8Var.r = this;
                        wy8Var.u = 1;
                        obj = l8hVar.a(va8Var, wy8Var);
                        if (obj != lu3Var) {
                            this = this;
                        }
                        return lu3Var;
                    }
                    jle jleVar = UnmanagedSessionReceiver.a;
                    jle.i(this.b);
                    ydaVar = null;
                    if (ydaVar != null) {
                    }
                } else if (i == 1) {
                    this = wy8Var.r;
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    ydaVar = (yda) obj;
                    if (ydaVar != null) {
                        return Unit.a;
                    }
                    wy8Var.r = null;
                    wy8Var.u = 3;
                }
                ydaVar = (yda) obj;
            }
        }
        wy8Var = new wy8(this, sq3Var);
        Object obj2 = wy8Var.s;
        lu3 lu3Var2 = lu3.a;
        i = wy8Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        ydaVar = (yda) obj2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return a().a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return a().a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return a().b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return a().d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return a().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ok3.J(new d17(this, null, 25));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        l3a l3aVar = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        l3a l3aVar2 = GlanceRemoteViewsService.a;
        synchronized (l3aVar2) {
            l3aVar2.a.remove(l3a.c(i, i2, str));
            Unit unit = Unit.a;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}

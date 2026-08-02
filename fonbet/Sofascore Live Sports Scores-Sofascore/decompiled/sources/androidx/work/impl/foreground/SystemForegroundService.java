package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a8p;
import defpackage.d6b;
import defpackage.dti;
import defpackage.g6b;
import defpackage.hcc;
import defpackage.ix1;
import defpackage.n5h;
import defpackage.nq8;
import defpackage.rik;
import defpackage.u6b;
import defpackage.vqi;
import defpackage.xbl;
import defpackage.y6b;
import defpackage.zbl;
import defpackage.zti;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class SystemForegroundService extends Service implements u6b {
    public static final /* synthetic */ int e = 0;
    public final hcc a = new hcc(this);
    public boolean b;
    public vqi c;
    public NotificationManager d;

    static {
        rik.x("SystemFgService");
    }

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        vqi vqiVar = new vqi(getApplicationContext());
        this.c = vqiVar;
        if (vqiVar.j != null) {
            rik.o().getClass();
        } else {
            vqiVar.j = this;
        }
    }

    public final void b() {
        hcc hccVar = this.a;
        hccVar.getClass();
        hccVar.V(d6b.ON_CREATE);
        super.onCreate();
    }

    public final void c() {
        hcc hccVar = this.a;
        hccVar.getClass();
        hccVar.V(d6b.ON_STOP);
        hccVar.V(d6b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        return (y6b) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        hcc hccVar = this.a;
        hccVar.getClass();
        hccVar.V(d6b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        b();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c();
        this.c.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        hcc hccVar = this.a;
        hccVar.getClass();
        hccVar.V(d6b.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = false;
        if (this.b) {
            rik.o().getClass();
            this.c.e();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        vqi vqiVar = this.c;
        vqiVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            rik o = rik.o();
            Objects.toString(intent);
            o.getClass();
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            zti ztiVar = vqiVar.c;
            a8p a8pVar = new a8p(vqiVar, stringExtra, z, 22);
            ztiVar.getClass();
            ((zbl) ztiVar).a.execute(a8pVar);
            vqiVar.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            vqiVar.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            rik.o().getClass();
            SystemForegroundService systemForegroundService = vqiVar.j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            rik.o().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        rik o2 = rik.o();
        Objects.toString(intent);
        o2.getClass();
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        xbl xblVar = vqiVar.b;
        UUID fromString = UUID.fromString(stringExtra2);
        xblVar.getClass();
        fromString.getClass();
        dti dtiVar = xblVar.b.g;
        n5h n5hVar = ((zbl) xblVar.d).a;
        n5hVar.getClass();
        nq8.G(dtiVar, "CancelWorkById", n5hVar, new ix1(15, xblVar, fromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, a.o);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}

package c0;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o extends Service {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f3289f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public n f3290a;

    /* renamed from: b, reason: collision with root package name */
    public j f3291b;

    /* renamed from: c, reason: collision with root package name */
    public i f3292c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3293d = false;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3294e;

    public o() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3294e = null;
        } else {
            this.f3294e = new ArrayList();
        }
    }

    public final void a(boolean z5) {
        if (this.f3292c == null) {
            this.f3292c = new i(this);
            j jVar = this.f3291b;
            if (jVar != null && z5) {
                synchronized (jVar) {
                    try {
                        if (!jVar.f3277c) {
                            jVar.f3277c = true;
                            jVar.f3276b.acquire(600000L);
                            jVar.f3275a.release();
                        }
                    } finally {
                    }
                }
            }
            this.f3292c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f3294e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f3292c = null;
                    ArrayList arrayList2 = this.f3294e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f3293d) {
                        this.f3291b.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        n nVar = this.f3290a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            this.f3290a = new n(this);
            this.f3291b = null;
            return;
        }
        this.f3290a = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = f3289f;
        j jVar = (j) hashMap.get(componentName);
        if (jVar == null) {
            if (i5 >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            jVar = new j(this, componentName);
            hashMap.put(componentName, jVar);
        }
        this.f3291b = jVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f3294e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3293d = true;
                this.f3291b.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        if (this.f3294e == null) {
            return 2;
        }
        this.f3291b.b();
        synchronized (this.f3294e) {
            ArrayList arrayList = this.f3294e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new k(this, intent, i10));
            a(true);
        }
        return 3;
    }
}

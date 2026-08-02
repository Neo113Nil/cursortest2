package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rqi implements ComponentCallbacks2 {
    public final Context a;
    public final WeakReference b;
    public final lad c;
    public volatile boolean d;
    public final AtomicBoolean e;

    public rqi(bpf bpfVar, Context context, boolean z) {
        lad it7Var;
        this.a = context;
        this.b = new WeakReference(bpfVar);
        if (z) {
            zid zidVar = bpfVar.d;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
            if (connectivityManager == null || eq3.b(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                it7Var = new it7(22);
            } else {
                try {
                    it7Var = new l2a(connectivityManager, this);
                } catch (Exception e) {
                    if (zidVar != null) {
                        RuntimeException runtimeException = new RuntimeException("Failed to register network observer.", e);
                        if (zidVar.b <= 6) {
                            StringWriter stringWriter = new StringWriter();
                            runtimeException.printStackTrace(new PrintWriter(stringWriter));
                            stringWriter.toString();
                        }
                    }
                    it7Var = new it7(22);
                }
            }
        } else {
            it7Var = new it7(22);
        }
        this.c = it7Var;
        this.d = it7Var.c();
        this.e = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.a.unregisterComponentCallbacks(this);
        this.c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((bpf) this.b.get()) == null) {
            a();
            Unit unit = Unit.a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Unit unit;
        bpf bpfVar = (bpf) this.b.get();
        if (bpfVar != null) {
            gpf gpfVar = (gpf) bpfVar.c.getValue();
            if (gpfVar != null) {
                gpfVar.a.b(i);
                gpfVar.b.b(i);
            }
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a();
        }
    }
}

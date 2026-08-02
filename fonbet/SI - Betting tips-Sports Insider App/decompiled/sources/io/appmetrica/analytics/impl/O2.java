package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class O2 implements InterfaceC0313lk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12676a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f12677b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12678c;

    /* renamed from: d, reason: collision with root package name */
    public final G5 f12679d;

    /* renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f12680e;

    public O2(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f12676a.add(consumer);
        return this.f12677b;
    }

    public final void b() {
        this.f12677b = null;
        G5 g52 = this.f12679d;
        Context context = this.f12678c;
        synchronized (g52) {
            if (g52.f12254b) {
                try {
                    context.unregisterReceiver(g52.f12253a);
                    g52.f12254b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313lk
    public final synchronized void onCreate() {
        Intent a7 = a();
        this.f12677b = a7;
        Iterator it = this.f12676a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a7);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313lk
    public final synchronized void onDestroy() {
        this.f12677b = null;
        b();
        Iterator it = this.f12676a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public O2(Context context, IHandlerExecutor iHandlerExecutor, int i5) {
        this.f12676a = new ArrayList();
        this.f12677b = null;
        this.f12678c = context;
        this.f12680e = iHandlerExecutor;
        this.f12679d = F5.a(new C0494t2(new N2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        G5 g52 = this.f12679d;
        Context context = this.f12678c;
        IHandlerExecutor iHandlerExecutor = this.f12680e;
        synchronized (g52) {
            intent = null;
            try {
                intent = context.registerReceiver(g52.f12253a, intentFilter, null, iHandlerExecutor.getHandler());
                g52.f12254b = true;
            } catch (Throwable unused) {
            }
        }
        return intent;
    }
}

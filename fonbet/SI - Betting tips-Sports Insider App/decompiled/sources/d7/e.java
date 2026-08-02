package d7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e6.k;
import f7.l;
import f7.o;
import f7.p;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.b6;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l5.i;
import oi.a0;
import oi.n;
import x5.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements w7.a, OnCompleteListener, b3.a, k, ILogger, g5.b, oi.f {

    /* renamed from: d, reason: collision with root package name */
    public static e f8266d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8267a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8268b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8269c;

    public /* synthetic */ e(int i5, Object obj) {
        this.f8267a = i5;
        this.f8269c = obj;
    }

    public static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void j(Context context) {
        if (g(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        w0.d("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    @Override // oi.f
    public Type a() {
        return (Type) this.f8268b;
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        f7.a aVar = new f7.a((f7.b) this.f8268b, (w7.g) obj2);
        p pVar = (p) ((o) obj).m();
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) this.f8269c;
        ApiMetadata a7 = f7.e.a();
        Parcel a10 = pVar.a();
        int i5 = l.f9493a;
        a10.writeStrongBinder(aVar);
        l.b(a10, savePasswordRequest);
        l.b(a10, a7);
        pVar.e(a10, 2);
    }

    @Override // io.sentry.ILogger
    public void b(b5 b5Var, Throwable th2, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f8269c;
        if (iLogger == null || !i(b5Var)) {
            return;
        }
        iLogger.b(b5Var, th2, str, objArr);
    }

    @Override // oi.f
    public Object c(a0 a0Var) {
        Executor executor = (Executor) this.f8269c;
        return executor == null ? a0Var : new n(executor, a0Var);
    }

    public byte[] d() {
        Callable callable;
        if (((byte[]) this.f8268b) == null && (callable = (Callable) this.f8269c) != null) {
            this.f8268b = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.f8268b;
        return bArr != null ? bArr : new byte[0];
    }

    @Override // io.sentry.ILogger
    public void e(b5 b5Var, String str, Throwable th2) {
        ILogger iLogger = (ILogger) this.f8269c;
        if (iLogger == null || !i(b5Var)) {
            return;
        }
        iLogger.e(b5Var, str, th2);
    }

    @Override // w7.a
    public Object f(Task task) {
        b6.b bVar = (b6.b) this.f8268b;
        Bundle bundle = (Bundle) this.f8269c;
        bVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : bVar.a(bundle).l(b6.g.f3048c, b6.d.f3044d);
    }

    @Override // ff.a
    public Object get() {
        int i5 = 1;
        m8.a aVar = new m8.a(i5);
        m7.b bVar = new m7.b(i5);
        Object obj = ((ff.a) this.f8268b).get();
        ff.a aVar2 = (ff.a) this.f8269c;
        return new i(aVar, bVar, l5.a.f19365f, (l5.k) obj, aVar2);
    }

    @Override // b3.a
    public View getRoot() {
        return (LinearLayout) this.f8268b;
    }

    @Override // io.sentry.ILogger
    public void h(b5 b5Var, String str, Object... objArr) {
        ILogger iLogger = (ILogger) this.f8269c;
        if (iLogger == null || !i(b5Var)) {
            return;
        }
        iLogger.h(b5Var, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean i(b5 b5Var) {
        b6 b6Var = (b6) this.f8268b;
        return b5Var != null && b6Var.isDebug() && b5Var.ordinal() >= b6Var.getDiagnosticLevel().ordinal();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((h) this.f8269c).f25410b).remove((w7.g) this.f8268b);
    }

    public String toString() {
        switch (this.f8267a) {
            case 15:
                String str = "[ ";
                if (((v.g) this.f8268b) != null) {
                    for (int i5 = 0; i5 < 9; i5++) {
                        StringBuilder b10 = v.f.b(str);
                        b10.append(((v.g) this.f8268b).f24375h[i5]);
                        b10.append(" ");
                        str = b10.toString();
                    }
                }
                StringBuilder c2 = v.f.c(str, "] ");
                c2.append((v.g) this.f8268b);
                return c2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i5, Object obj, Object obj2) {
        this.f8267a = i5;
        this.f8268b = obj;
        this.f8269c = obj2;
    }

    public e(com.android.billingclient.api.k kVar, ArrayList arrayList) {
        this.f8267a = 4;
        this.f8268b = arrayList;
        this.f8269c = kVar;
    }

    public e(Context context, int i5) {
        e eVar;
        this.f8267a = i5;
        switch (i5) {
            case 1:
                this.f8268b = new g(context, c6.d.f3660b);
                synchronized (e.class) {
                    try {
                        if (f8266d == null) {
                            f8266d = new e(context.getApplicationContext(), 0);
                        }
                        eVar = f8266d;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f8269c = eVar;
                return;
            default:
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.f8269c = Executors.newSingleThreadExecutor();
                this.f8268b = context;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(new androidx.core.widget.b(5, this), 0L, 86400L, TimeUnit.SECONDS);
                return;
        }
    }

    public e(h hVar, w7.g gVar) {
        this.f8267a = 5;
        this.f8268b = gVar;
        Objects.requireNonNull(hVar);
        this.f8269c = hVar;
    }

    public e(a9.a aVar) {
        this.f8267a = 11;
        this.f8269c = DesugarCollections.synchronizedMap(new HashMap());
        this.f8268b = aVar;
    }

    public e(int i5) {
        this.f8267a = i5;
        switch (i5) {
            case 14:
                break;
            default:
                this.f8268b = new ArrayList();
                this.f8269c = new ArrayList();
                break;
        }
    }
}

package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import n8.C8451a;
import n8.l;

@KeepForSdk
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f60034b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static h f60035c;

    /* renamed from: a, reason: collision with root package name */
    private n8.l f60036a;

    private h() {
    }

    @NonNull
    @KeepForSdk
    public static h c() {
        h hVar;
        synchronized (f60034b) {
            Preconditions.checkState(f60035c != null, "MlKitContext has not been initialized");
            hVar = (h) Preconditions.checkNotNull(f60035c);
        }
        return hVar;
    }

    @NonNull
    public static void d(@NonNull Context context) {
        synchronized (f60034b) {
            e(context, TaskExecutors.MAIN_THREAD);
        }
    }

    @NonNull
    public static h e(@NonNull Context context, @NonNull Executor executor) {
        h hVar;
        synchronized (f60034b) {
            Preconditions.checkState(f60035c == null, "MlKitContext is already initialized");
            h hVar2 = new h();
            f60035c = hVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList a11 = n8.d.b(context, MlKitComponentDiscoveryService.class).a();
            l.a g10 = n8.l.g(executor);
            g10.c(a11);
            g10.a(C8451a.n(context, Context.class, new Class[0]));
            g10.a(C8451a.n(hVar2, h.class, new Class[0]));
            n8.l d11 = g10.d();
            hVar2.f60036a = d11;
            d11.i(true);
            hVar = f60035c;
        }
        return hVar;
    }

    @NonNull
    @KeepForSdk
    public final <T> T a(@NonNull Class<T> cls) {
        Preconditions.checkState(f60035c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f60036a);
        return (T) this.f60036a.a(cls);
    }

    @NonNull
    @KeepForSdk
    public final Context b() {
        return (Context) a(Context.class);
    }
}

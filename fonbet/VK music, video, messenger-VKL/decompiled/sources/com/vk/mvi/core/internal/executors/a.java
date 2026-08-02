package com.vk.mvi.core.internal.executors;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.d4m;
import xsna.epx;
import xsna.gzs;
import xsna.nx3;
import xsna.rk50;
import xsna.sk50;
import xsna.tk50;
import xsna.un50;

/* compiled from: MviExecutors.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final ExecutorService a = Executors.newSingleThreadExecutor(new rk50());
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new sk50(0));

    public static void a(gzs gzsVar) {
        ThreadType.Companion.getClass();
        if (epx.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            gzsVar.invoke();
        } else {
            io.reactivex.rxjava3.android.schedulers.a.b().c(new tk50(0, gzsVar));
        }
    }

    public static void b(gzs gzsVar) {
        ThreadType.Companion.getClass();
        Thread currentThread = Thread.currentThread();
        if ((currentThread instanceof un50) && ((un50) currentThread).b == ThreadType.STATE) {
            gzsVar.invoke();
        } else {
            a.execute(new d4m(2, gzsVar));
        }
    }

    public static void c(gzs gzsVar) {
        ThreadType.Companion.getClass();
        Thread currentThread = Thread.currentThread();
        if ((currentThread instanceof un50) && ((un50) currentThread).b == ThreadType.UTIL) {
            gzsVar.invoke();
        } else {
            b.execute(new nx3(gzsVar, 10));
        }
    }
}

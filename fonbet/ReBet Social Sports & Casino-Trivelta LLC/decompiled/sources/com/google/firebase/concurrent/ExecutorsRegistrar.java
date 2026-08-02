package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import ib.InterfaceC4541a;
import ib.b;
import ib.c;
import ib.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import mb.C5576c;
import mb.D;
import mb.InterfaceC5577d;
import mb.g;
import mb.w;
import nb.ThreadFactoryC5693b;
import nb.o;
import wb.InterfaceC6736b;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final w f37729a = new w(new InterfaceC6736b() { // from class: nb.r
        @Override // wb.InterfaceC6736b
        public final Object get() {
            ScheduledExecutorService m10;
            m10 = ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
            return m10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final w f37730b = new w(new InterfaceC6736b() { // from class: nb.s
        @Override // wb.InterfaceC6736b
        public final Object get() {
            ScheduledExecutorService m10;
            m10 = ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
            return m10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final w f37731c = new w(new InterfaceC6736b() { // from class: nb.t
        @Override // wb.InterfaceC6736b
        public final Object get() {
            ScheduledExecutorService m10;
            m10 = ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
            return m10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final w f37732d = new w(new InterfaceC6736b() { // from class: nb.u
        @Override // wb.InterfaceC6736b
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC5577d interfaceC5577d) {
        return (ScheduledExecutorService) f37730b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC5577d interfaceC5577d) {
        return (ScheduledExecutorService) f37731c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC5577d interfaceC5577d) {
        return (ScheduledExecutorService) f37729a.get();
    }

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i10) {
        return new ThreadFactoryC5693b(str, i10, null);
    }

    public static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC5693b(str, i10, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f37732d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C5576c.f(D.a(InterfaceC4541a.class, ScheduledExecutorService.class), D.a(InterfaceC4541a.class, ExecutorService.class), D.a(InterfaceC4541a.class, Executor.class)).f(new g() { // from class: nb.v
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return ExecutorsRegistrar.g(interfaceC5577d);
            }
        }).d(), C5576c.f(D.a(b.class, ScheduledExecutorService.class), D.a(b.class, ExecutorService.class), D.a(b.class, Executor.class)).f(new g() { // from class: nb.w
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return ExecutorsRegistrar.e(interfaceC5577d);
            }
        }).d(), C5576c.f(D.a(c.class, ScheduledExecutorService.class), D.a(c.class, ExecutorService.class), D.a(c.class, Executor.class)).f(new g() { // from class: nb.x
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return ExecutorsRegistrar.a(interfaceC5577d);
            }
        }).d(), C5576c.e(D.a(d.class, Executor.class)).f(new g() { // from class: nb.y
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                Executor executor;
                executor = B.INSTANCE;
                return executor;
            }
        }).d());
    }
}

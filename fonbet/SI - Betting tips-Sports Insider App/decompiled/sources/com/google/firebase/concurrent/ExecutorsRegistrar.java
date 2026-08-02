package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import n8.c;
import n8.d;
import o8.b;
import o8.l;
import o8.p;
import p8.a;
import p8.e;
import p8.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final l f6054a = new l(new n(4));

    /* renamed from: b, reason: collision with root package name */
    public static final l f6055b = new l(new n(5));

    /* renamed from: c, reason: collision with root package name */
    public static final l f6056c = new l(new n(6));

    /* renamed from: d, reason: collision with root package name */
    public static final l f6057d = new l(new n(7));

    public static e a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i5 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i5 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new e(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) f6057d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(n8.a.class, ScheduledExecutorService.class);
        int i5 = 0;
        int i10 = 1;
        p[] pVarArr = {new p(n8.a.class, ExecutorService.class), new p(n8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            io.sentry.config.a.b(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new io.sentry.clientreport.a(28), hashSet3);
        p pVar3 = new p(n8.b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(n8.b.class, ExecutorService.class), new p(n8.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            io.sentry.config.a.b(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new io.sentry.clientreport.a(29), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            io.sentry.config.a.b(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new h(i5), hashSet9);
        o8.a b10 = b.b(new p(d.class, Executor.class));
        b10.f21100f = new h(i10);
        return Arrays.asList(bVar, bVar2, bVar3, b10.b());
    }
}

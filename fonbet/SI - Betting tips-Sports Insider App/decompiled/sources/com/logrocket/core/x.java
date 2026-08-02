package com.logrocket.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.v0;
import j$.util.Iterator$EL;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f6645a = Executors.newSingleThreadScheduledExecutor(new aa.j("lr-scanner"));

    /* renamed from: b, reason: collision with root package name */
    public final LogRocketCore f6646b;

    /* renamed from: c, reason: collision with root package name */
    public final LogRocketCore f6647c;

    /* renamed from: d, reason: collision with root package name */
    public final ba.d f6648d;

    /* renamed from: e, reason: collision with root package name */
    public final ba.b f6649e;

    /* renamed from: f, reason: collision with root package name */
    public final com.logrocket.core.graphics.f f6650f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f6651g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6652h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6653i;
    public final AtomicBoolean j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f6654k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f6655l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f6656m;

    /* renamed from: n, reason: collision with root package name */
    public ScheduledFuture f6657n;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f6658o;

    public x(LogRocketCore logRocketCore, LogRocketCore logRocketCore2, f fVar, v9.d dVar, HashMap hashMap) {
        ba.d dVar2 = new ba.d("view-scanner");
        this.f6648d = dVar2;
        this.f6649e = new ba.b(dVar2);
        this.f6653i = new Object();
        this.j = new AtomicBoolean(false);
        this.f6654k = new AtomicBoolean(false);
        this.f6655l = new AtomicBoolean(false);
        this.f6656m = new AtomicBoolean(false);
        this.f6646b = logRocketCore;
        this.f6647c = logRocketCore2;
        com.logrocket.core.graphics.f fVar2 = new com.logrocket.core.graphics.f(fVar, logRocketCore, hashMap);
        this.f6650f = fVar2;
        if (fVar.f6440r) {
            this.f6651g = new j0(logRocketCore, fVar2, fVar);
        } else {
            this.f6651g = null;
        }
        this.f6652h = 1;
        this.f6658o = new v0(dVar);
    }

    public final void a(boolean z5) {
        try {
            synchronized (this.f6653i) {
                this.f6657n = null;
            }
            boolean z7 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            androidx.fragment.app.d dVar = new androidx.fragment.app.d(this, new ArrayList(), countDownLatch, 8);
            AtomicReference atomicReference = aa.l.f112a;
            Handler handler = (Handler) atomicReference.get();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                atomicReference.set(handler);
            }
            handler.postAtFrontOfQueue(dVar);
            try {
                countDownLatch.await();
                e();
                aa.a e7 = aa.b.e();
                com.logrocket.protobuf.j p10 = this.f6650f.f6545o.p(e7.f86a, e7.f87b, r3.f6550u.f6526e);
                if (p10.size() != 0) {
                    z7 = false;
                }
                if (!z7) {
                    long currentTimeMillis = System.currentTimeMillis();
                    com.logrocket.core.graphics.n nVar = this.f6650f.f6545o;
                    nVar.getClass();
                    HashMap hashMap = nVar.f6578m;
                    HashMap hashMap2 = new HashMap(hashMap);
                    hashMap.clear();
                    com.logrocket.core.graphics.n nVar2 = this.f6650f.f6545o;
                    nVar2.getClass();
                    HashMap hashMap3 = nVar2.f6579n;
                    HashMap hashMap4 = new HashMap(hashMap3);
                    hashMap3.clear();
                    com.logrocket.core.graphics.n nVar3 = this.f6650f.f6545o;
                    nVar3.getClass();
                    HashSet hashSet = nVar3.f6580o;
                    HashSet hashSet2 = new HashSet(hashSet);
                    hashSet.clear();
                    this.f6658o.Z(hashMap2, hashMap4, hashSet2, currentTimeMillis);
                    this.f6646b.g(12, p10, null, false, Long.valueOf(currentTimeMillis));
                }
                this.f6646b.h(this.f6650f.f6550u.f6526e);
            } catch (InterruptedException e9) {
                if (!this.f6645a.isShutdown()) {
                    this.f6649e.d("Interrupted while processing frame.");
                    LogRocketCore.l("Interrupted while processing frame.", e9);
                    h0.c(e9);
                }
            }
            if (z5) {
                c(false);
            }
        } catch (Throwable th2) {
            if (this.f6645a.isShutdown()) {
                return;
            }
            this.f6648d.e("Error scanning views, shutting down LogRocket", th2);
            h0.c(th2);
            this.f6647c.s("errorScanningView");
        }
    }

    public final void b() {
        synchronized (this.f6653i) {
            try {
                if (this.f6657n != null) {
                    this.f6648d.o("Pausing view scanner");
                    this.f6657n.cancel(false);
                    this.f6657n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z5) {
        if (!this.j.get() || !this.f6656m.get() || this.f6654k.get() || this.f6655l.get() || this.f6645a.isShutdown()) {
            return;
        }
        synchronized (this.f6653i) {
            try {
                if (this.f6657n == null) {
                    this.f6657n = this.f6645a.schedule(new v(this, 0), z5 ? 0L : this.f6652h, TimeUnit.SECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ArrayList d() {
        ba.d dVar = this.f6648d;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                Method method = aa.k.f110a;
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method d10 = aa.k.d(cls, "getInstance", new Class[0]);
                Method d11 = aa.k.d(cls, "getViewRootNames", new Class[0]);
                Method d12 = aa.k.d(cls, "getRootView", String.class);
                Object invoke = d10.invoke(null, null);
                String[] strArr = (String[]) d11.invoke(invoke, null);
                if (strArr != null) {
                    for (String str : strArr) {
                        try {
                            arrayList.add((View) d12.invoke(invoke, str));
                        } catch (IllegalAccessException | InvocationTargetException e7) {
                            LogRocketCore.l("Access to view '" + str + "' failed.", e7);
                            dVar.e("Access to view '" + str + "' failed.", e7);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException e9) {
                LogRocketCore.l("Unable to access root views on WindowManagerGlobal", e9);
                dVar.e("Unable to access root views on WindowManagerGlobal", e9);
            }
        } catch (ClassNotFoundException e10) {
            LogRocketCore.l("Unable to load WindowManagerGlobal", e10);
            dVar.e("Unable to load WindowManagerGlobal", e10);
        } catch (NoSuchMethodException e11) {
            LogRocketCore.l("Unable to find method on WindowManagerGlobal", e11);
            dVar.e("Unable to find method on WindowManagerGlobal", e11);
        }
        return arrayList;
    }

    public final void e() {
        byte[] copyOfRange;
        com.logrocket.core.graphics.b bVar = this.f6650f.f6544n;
        HashMap hashMap = bVar.f6480d;
        bVar.f6480d = new HashMap();
        if (bVar.f6481e >= 5) {
            Iterator it = bVar.f6478b.entrySet().iterator();
            while (it.hasNext()) {
                if (((com.logrocket.core.graphics.a) ((Map.Entry) it.next()).getValue()).f6476b < 2) {
                    it.remove();
                }
            }
            bVar.f6481e = 0;
        }
        if (hashMap.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        xg.k q = xg.l.q();
        Iterator it2 = hashMap.entrySet().iterator();
        int i5 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            LogRocketCore logRocketCore = this.f6646b;
            if (!hasNext) {
                long currentTimeMillis2 = System.currentTimeMillis();
                xg.m r5 = xg.n.r();
                r5.d();
                xg.n.q((xg.n) r5.f6816b, (xg.l) q.a());
                r5.d();
                xg.n.p((xg.n) r5.f6816b, currentTimeMillis2 - currentTimeMillis);
                logRocketCore.a(9, r5);
                return;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Bitmap bitmap = (Bitmap) entry.getValue();
            if (!bitmap.isRecycled()) {
                if (i5 > 150000) {
                    final ArrayList arrayList = new ArrayList();
                    Iterator$EL.forEachRemaining(it2, new Consumer() { // from class: com.logrocket.core.w
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void n(Object obj) {
                            Map.Entry entry2 = (Map.Entry) obj;
                            dh.e s8 = dh.f.s();
                            int intValue = ((Integer) entry2.getKey()).intValue();
                            s8.d();
                            dh.f.p((dh.f) s8.f6816b, intValue);
                            int byteCount = ((Bitmap) entry2.getValue()).getByteCount();
                            s8.d();
                            dh.f.q((dh.f) s8.f6816b, byteCount);
                            arrayList.add((dh.f) s8.a());
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    dh.d s8 = dh.g.s();
                    s8.d();
                    dh.g.p((dh.g) s8.f6816b, 2);
                    s8.d();
                    dh.g.r((dh.g) s8.f6816b, arrayList);
                    logRocketCore.a(26, s8);
                    bitmap.recycle();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.WEBP, 50, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    i5 += byteArray.length;
                    if (byteArray.length > 15000) {
                        dh.d s10 = dh.g.s();
                        s10.d();
                        dh.g.p((dh.g) s10.f6816b, 1);
                        dh.e s11 = dh.f.s();
                        int intValue = ((Integer) entry.getKey()).intValue();
                        s11.d();
                        dh.f.p((dh.f) s11.f6816b, intValue);
                        int byteCount = bitmap.getByteCount();
                        s11.d();
                        dh.f.q((dh.f) s11.f6816b, byteCount);
                        int length = byteArray.length;
                        s11.d();
                        dh.f.r((dh.f) s11.f6816b, length);
                        s10.d();
                        dh.g.q((dh.g) s10.f6816b, (dh.f) s11.a());
                        logRocketCore.a(26, s10);
                        i5 -= byteArray.length;
                        bitmap.recycle();
                    } else {
                        bitmap.recycle();
                        Integer num = (Integer) entry.getKey();
                        num.getClass();
                        xg.h r6 = xg.i.r();
                        int length2 = byteArray.length;
                        com.logrocket.protobuf.j.d(0, length2, byteArray.length);
                        switch (com.logrocket.protobuf.j.f6737c.f6688a) {
                            case 0:
                                copyOfRange = Arrays.copyOfRange(byteArray, 0, length2);
                                break;
                            default:
                                copyOfRange = new byte[length2];
                                System.arraycopy(byteArray, 0, copyOfRange, 0, length2);
                                break;
                        }
                        com.logrocket.protobuf.i iVar = new com.logrocket.protobuf.i(copyOfRange);
                        r6.d();
                        xg.i.p((xg.i) r6.f6816b, iVar);
                        xg.i iVar2 = (xg.i) r6.a();
                        q.getClass();
                        q.d();
                        xg.l.p((xg.l) q.f6816b).put(num, iVar2);
                    }
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f6653i) {
            try {
                if (this.f6657n != null) {
                    this.f6648d.o("Cancelling pending view scanner task.");
                    this.f6657n.cancel(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j0 j0Var = this.f6651g;
        if (j0Var != null) {
            Iterator it = j0Var.f6609b.keySet().iterator();
            while (it.hasNext()) {
                ((w9.a) it.next()).f25030i = true;
                androidx.appcompat.widget.a0 a0Var = w9.a.q;
                aa.g gVar = (aa.g) a0Var.f682d;
                if (gVar != null) {
                    gVar.d();
                    a0Var.f682d = null;
                }
                ((HashMap) a0Var.f683e).clear();
                ((WeakHashMap) a0Var.f681c).clear();
            }
        }
        this.f6645a.shutdownNow();
        com.logrocket.core.graphics.f fVar = this.f6650f;
        if (!fVar.f6538g.isRecycled()) {
            fVar.f6538g.recycle();
        }
        fVar.f6543m = null;
    }
}

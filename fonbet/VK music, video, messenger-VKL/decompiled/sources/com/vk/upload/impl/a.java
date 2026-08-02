package com.vk.upload.impl;

import android.os.Parcelable;
import com.vk.log.L;
import com.vk.upload.impl.UploadNotification;
import com.vk.upload.impl.tasks.x;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.io.InterruptedIOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.adz;
import xsna.e0s;
import xsna.fyo0;
import xsna.gxj0;
import xsna.hg1;
import xsna.i9e;
import xsna.izs;
import xsna.lw30;
import xsna.nh40;
import xsna.pdw;
import xsna.rgl;
import xsna.sp6;
import xsna.ut30;
import xsna.uyb;
import xsna.wii0;
import xsna.y6x;
import xsna.ysg0;
import xsna.z6x;

/* compiled from: Upload.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final ConcurrentHashMap<Integer, UploadNotification.a> a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, sp6<?>> b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, sp6<?>> c = new ConcurrentHashMap<>();
    public static final AtomicInteger d = new AtomicInteger((int) (System.currentTimeMillis() / 1000));

    public static boolean a(int i) {
        return b.containsKey(Integer.valueOf(i)) || c.containsKey(Integer.valueOf(i));
    }

    public static final void b(int i, String str) {
        if (str == null) {
            rgl rglVar = z6x.a.a;
            ((y6x) (rglVar != null ? rglVar : null).c()).l(new i9e(i, 3));
        } else {
            rgl rglVar2 = z6x.a.a;
            ((y6x) (rglVar2 != null ? rglVar2 : null).c()).k(str, new e0s(i, 1));
        }
    }

    public static final int d() {
        return d.getAndIncrement();
    }

    public static final void e(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap<Integer, sp6<?>> concurrentHashMap = b;
        if (concurrentHashMap.containsKey(valueOf)) {
            i(concurrentHashMap.remove(Integer.valueOf(i)));
            return;
        }
        Integer valueOf2 = Integer.valueOf(i);
        ConcurrentHashMap<Integer, sp6<?>> concurrentHashMap2 = c;
        if (concurrentHashMap2.containsKey(valueOf2)) {
            sp6<?> remove = concurrentHashMap2.remove(Integer.valueOf(i));
            remove.e = false;
            i(remove);
        }
    }

    public static void f(b bVar) {
        ConcurrentHashMap<Integer, sp6<?>> concurrentHashMap = c;
        try {
            bVar.X();
            a.remove(Integer.valueOf(bVar.d));
        } catch (InterruptedIOException e) {
            concurrentHashMap.put(Integer.valueOf(bVar.d), bVar);
            throw e;
        } catch (InterruptedException e2) {
            concurrentHashMap.put(Integer.valueOf(bVar.d), bVar);
            throw e2;
        } catch (Exception e3) {
            b.put(Integer.valueOf(bVar.d), bVar);
            throw e3;
        } catch (Throwable th) {
            L.E(th, new Object[0]);
            throw th;
        }
    }

    public static final void g(b bVar, UploadNotification.a aVar) {
        a.put(Integer.valueOf(bVar.d), aVar);
    }

    public static final int h(b bVar, izs izsVar) {
        if (izsVar != null) {
            f<Object> fVar = ysg0.b.a;
            wii0 wii0Var = new wii0(bVar, 9);
            fVar.getClass();
            new i0(fVar, wii0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lw30(izsVar, 16), new uyb());
        }
        rgl rglVar = z6x.a.a;
        if (rglVar == null) {
            rglVar = null;
        }
        ((y6x) rglVar.c()).a(bVar);
        return bVar.d;
    }

    public static final int i(sp6<?> sp6Var) {
        rgl rglVar = z6x.a.a;
        if (rglVar == null) {
            rglVar = null;
        }
        ((y6x) rglVar.c()).a(sp6Var);
        return sp6Var.d;
    }

    public static final Parcelable j(x xVar) {
        f<Object> fVar = ysg0.b.a;
        hg1.e4 e4Var = new hg1.e4();
        fVar.getClass();
        int i = 28;
        return (Parcelable) new c0(new i0(new i0(fVar, e4Var), new adz(new fyo0(2), 14)).U(new nh40(new gxj0(6), 19)), new pdw(new ut30(xVar, i), i), io.reactivex.rxjava3.internal.functions.a.c).a();
    }
}

package com.android.billingclient.api;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import io.appmetrica.analytics.impl.ap;
import io.sentry.a2;
import io.sentry.b2;
import io.sentry.u1;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x1;
import io.sentry.y1;
import io.sentry.z1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4046a;

    public /* synthetic */ m(HashSet hashSet) {
        this.f4046a = new ArrayList(DesugarCollections.unmodifiableList(new ArrayList(hashSet)));
    }

    public w1 a() {
        ArrayList arrayList = this.f4046a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (w1) arrayList.get(arrayList.size() - 1);
    }

    public boolean b() {
        if (this.f4046a.size() == 1) {
            return true;
        }
        w1 a7 = a();
        e();
        if (!(a() instanceof z1)) {
            if (!(a() instanceof x1)) {
                return false;
            }
            x1 x1Var = (x1) a();
            if (a7 == null || x1Var == null) {
                return false;
            }
            x1Var.f17242a.add(a7.getValue());
            return false;
        }
        z1 z1Var = (z1) a();
        e();
        y1 y1Var = (y1) a();
        if (z1Var == null || a7 == null || y1Var == null) {
            return false;
        }
        y1Var.f17253a.put(z1Var.f17269a, a7.getValue());
        return false;
    }

    public boolean c(v1 v1Var) {
        Object c2 = v1Var.c();
        if (a() == null && c2 != null) {
            this.f4046a.add(new a2(c2));
            return true;
        }
        if (a() instanceof z1) {
            z1 z1Var = (z1) a();
            e();
            ((y1) a()).f17253a.put(z1Var.f17269a, c2);
            return false;
        }
        if (!(a() instanceof x1)) {
            return false;
        }
        ((x1) a()).f17242a.add(c2);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void d(final b2 b2Var) {
        boolean z5;
        int[] iArr = u1.f17148a;
        io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) b2Var.f16208b;
        int i5 = iArr[aVar.h0().ordinal()];
        ArrayList arrayList = this.f4046a;
        switch (i5) {
            case 1:
                b2Var.c();
                arrayList.add(new x1());
                z5 = false;
                break;
            case 2:
                b2Var.n();
                z5 = b();
                break;
            case 3:
                b2Var.k();
                arrayList.add(new y1());
                z5 = false;
                break;
            case 4:
                b2Var.r();
                z5 = b();
                break;
            case 5:
                arrayList.add(new z1(aVar.U()));
                z5 = false;
                break;
            case 6:
                final int i10 = 0;
                z5 = c(new v1() { // from class: io.sentry.t1
                    @Override // io.sentry.v1
                    public final Object c() {
                        switch (i10) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) b2Var.f16208b).d0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f16208b).K());
                        }
                    }
                });
                break;
            case 7:
                z5 = c(new com.google.firebase.messaging.g(6, this, b2Var));
                break;
            case 8:
                final int i11 = 1;
                z5 = c(new v1() { // from class: io.sentry.t1
                    @Override // io.sentry.v1
                    public final Object c() {
                        switch (i11) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) b2Var.f16208b).d0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f16208b).K());
                        }
                    }
                });
                break;
            case 9:
                aVar.Y();
                z5 = c(new ap(10));
                break;
            case 10:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        if (z5) {
            return;
        }
        d(b2Var);
    }

    public void e() {
        ArrayList arrayList = this.f4046a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public hg.g f(m3.o spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4046a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j3.d) next).b(spec)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((j3.d) it2.next()).a(spec.j));
        }
        return hg.u0.i(new c1.u(4, (hg.g[]) CollectionsKt.W(arrayList2).toArray(new hg.g[0])));
    }

    public m(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i5);
                if (optJSONObject != null) {
                    arrayList.add(new o(optJSONObject));
                }
            }
        }
        this.f4046a = arrayList;
    }

    public m() {
        this.f4046a = new ArrayList();
    }

    public m(List list) {
        this.f4046a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public m(c4.d trackers) {
        i3.e eVar;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        j3.c cVar = new j3.c((k3.a) trackers.f3578c);
        j3.c cVar2 = new j3.c((k3.a) trackers.f3579d, (byte) 0);
        j3.c cVar3 = new j3.c((k3.a) trackers.f3581f, (char) 0);
        k3.f fVar = (k3.f) trackers.f3580e;
        j3.c cVar4 = new j3.c(fVar, 2);
        j3.c cVar5 = new j3.c(fVar, 3);
        j3.f fVar2 = new j3.f(fVar);
        j3.e eVar2 = new j3.e(fVar);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) trackers.f3577b;
            String str = i3.k.f10922a;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            eVar = new i3.e((ConnectivityManager) systemService);
        } else {
            eVar = null;
        }
        j3.d[] elements = {cVar, cVar2, cVar3, cVar4, cVar5, fVar2, eVar2, eVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList controllers = kotlin.collections.p.q(elements);
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.f4046a = controllers;
    }
}

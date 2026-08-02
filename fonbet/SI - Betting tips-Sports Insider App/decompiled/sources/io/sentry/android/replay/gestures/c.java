package io.sentry.android.replay.gestures;

import android.os.Bundle;
import android.os.SystemClock;
import com.android.billingclient.api.l0;
import io.sentry.android.core.s;
import io.sentry.transport.f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.d;
import l4.e;
import s7.e2;
import s7.e3;
import s7.f1;
import s7.f3;
import s7.n0;
import s7.o2;
import s7.v0;
import s7.v3;
import s7.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16042a;

    /* renamed from: b, reason: collision with root package name */
    public long f16043b;

    /* renamed from: c, reason: collision with root package name */
    public long f16044c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16045d;

    public c(f3 f3Var) {
        this.f16042a = f3Var;
        f1 f1Var = (f1) f3Var.f3328a;
        this.f16045d = new e3(this, f1Var, 0);
        f1Var.f22749k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f16043b = elapsedRealtime;
        this.f16044c = elapsedRealtime;
    }

    public void a(Object obj, Object obj2, d dVar) {
        d dVar2 = (d) obj2;
        ((l0) ((e) this.f16045d).f19360b).m((l4.a) obj, dVar2.f19356a, dVar2.f19357b, dVar2.f19358c);
    }

    public long b() {
        if (this.f16044c == -1) {
            long j = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f16042a).entrySet()) {
                j += c(entry.getKey(), entry.getValue());
            }
            this.f16044c = j;
        }
        return this.f16044c;
    }

    public long c(Object obj, Object obj2) {
        try {
            long j = ((d) obj2).f19358c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e7) {
            this.f16044c = -1L;
            throw e7;
        }
    }

    public void d(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f16042a;
        while (b() > j) {
            if (linkedHashMap.isEmpty()) {
                if (b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.E(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f16044c = b() - c(key, value);
            a(key, value, null);
        }
    }

    public boolean e(long j, boolean z5, boolean z7) {
        f3 f3Var = (f3) this.f16042a;
        f3Var.j();
        f3Var.k();
        f1 f1Var = (f1) f3Var.f3328a;
        boolean d10 = f1Var.d();
        n0 n0Var = f1Var.f22745f;
        if (d10) {
            v0 v0Var = f1Var.f22744e;
            f1.k(v0Var);
            s sVar = v0Var.f23136p;
            f1Var.f22749k.getClass();
            sVar.b(System.currentTimeMillis());
        }
        long j6 = j - this.f16043b;
        if (!z5 && j6 < 1000) {
            f1.m(n0Var);
            n0Var.f22910n.b(Long.valueOf(j6), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z7) {
            j6 = j - this.f16044c;
            this.f16044c = j;
        }
        f1.m(n0Var);
        n0Var.f22910n.b(Long.valueOf(j6), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j6);
        boolean z10 = !f1Var.f22743d.x();
        o2 o2Var = f1Var.f22750l;
        f1.l(o2Var);
        v3.c0(o2Var.p(z10), bundle, true);
        if (!z7) {
            e2 e2Var = f1Var.f22751m;
            f1.l(e2Var);
            e2Var.q("auto", "_e", bundle);
        }
        this.f16043b = j;
        e3 e3Var = (e3) this.f16045d;
        e3Var.c();
        e3Var.b(((Long) x.f23214r0.a(null)).longValue());
        return true;
    }

    public c(e eVar, long j) {
        this.f16045d = eVar;
        this.f16042a = new LinkedHashMap(0, 0.75f, true);
        this.f16043b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public c(f dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f16045d = dateProvider;
        this.f16042a = new LinkedHashMap(10);
    }
}

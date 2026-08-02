package com.inmobi.media;

import android.content.Context;
import defpackage.ku3;
import defpackage.ok3;
import defpackage.w1l;
import defpackage.w2g;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xh {
    public final Context a;
    public final long b;
    public final int c;
    public boolean d;
    public final Pb e;
    public final C3347cj f;
    public final List g;
    public final ConcurrentHashMap h;
    public final AtomicBoolean i;
    public String j;
    public final AtomicInteger k;

    public Xh(Context context, double d, Nb nb, long j, int i) {
        context.getClass();
        nb.getClass();
        this.a = context;
        this.b = j;
        this.c = i;
        this.d = false;
        this.e = new Pb(nb);
        this.f = new C3347cj(d);
        this.g = w1l.n();
        this.h = new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.j = "";
        this.k = new AtomicInteger(0);
    }

    public final void a(Nb nb, String str, String str2) {
        nb.getClass();
        str.getClass();
        str2.getClass();
        if (this.i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Qb.a;
        nb.getClass();
        str.getClass();
        str2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", nb.name());
        jSONObject.put("timestamp", Qb.a.format(new Date()));
        jSONObject.put("tag", str);
        jSONObject.put("data", str2);
        ku3 ku3Var = AbstractC3417fc.a;
        AbstractC3391ec.a(new Vh(this, nb, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.getAndSet(true)) {
            ku3 ku3Var = AbstractC3417fc.a;
            AbstractC3391ec.a(new Uh(this, null));
        }
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.h) {
            try {
                for (Map.Entry entry : this.h.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String jSONObject3 = jSONObject.toString();
        jSONObject3.getClass();
        return jSONObject3;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List list = this.g;
        list.getClass();
        synchronized (list) {
            try {
                List list2 = this.g;
                list2.getClass();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    public final boolean e() {
        if (this.g.isEmpty() || this.h.isEmpty()) {
            return true;
        }
        String c = c();
        c.getClass();
        return Intrinsics.c(c, "{}");
    }

    public final void b(boolean z) {
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.d = z;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.h.put(str, str2);
    }

    public final void a() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.get()) {
            ku3 ku3Var = AbstractC3417fc.a;
            AbstractC3391ec.a(new Th(this, null));
        }
    }

    public final void a(boolean z) {
        Objects.toString(this.i);
        ku3 ku3Var = AbstractC3417fc.a;
        if (w2g.a(AbstractC3391ec.a(new defpackage.m1(this, z, 9))) != null) {
            try {
                Unit unit = Unit.a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final Unit a(Xh xh, boolean z) {
        if (xh.e()) {
            return Unit.a;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (xh.j.length() == 0) {
            ku3 ku3Var = AbstractC3417fc.a;
            xh.j = AbstractC3391ec.a(xh.a, timeInMillis);
        }
        if (xh.a(xh.j)) {
            ok3.J(new Wh(xh, timeInMillis, z, null));
        }
        return Unit.a;
    }

    public final boolean a(String str) {
        return AbstractC3443gc.a("RemoteLogger", c(), str);
    }
}

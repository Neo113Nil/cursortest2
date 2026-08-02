package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596x4 implements Ea, Ql, Ga {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14894a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f14895b;

    /* renamed from: c, reason: collision with root package name */
    public final Am f14896c;

    /* renamed from: d, reason: collision with root package name */
    public final C0659zh f14897d;

    /* renamed from: e, reason: collision with root package name */
    public final E4 f14898e;

    /* renamed from: f, reason: collision with root package name */
    public final C0316ln f14899f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f14900g;

    /* renamed from: h, reason: collision with root package name */
    public final R4 f14901h;

    /* renamed from: i, reason: collision with root package name */
    public final C0309lg f14902i;
    public final T3 j;

    /* renamed from: k, reason: collision with root package name */
    public final C0434qg f14903k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14904l;

    public C0596x4(@NonNull Context context, @NonNull Hl hl, @NonNull Q4 q42, @NonNull C0397p4 c0397p4, @NonNull C0309lg c0309lg) {
        this(context, hl, q42, c0397p4, new C0659zh(c0397p4.f14456b), c0309lg, new R4(), new C0646z4(), new C0434qg());
    }

    public static void b(C0397p4 c0397p4) {
        C0353na.I.c().b(!Boolean.FALSE.equals(c0397p4.f14456b.f14393n));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void a(@NonNull C0372o4 c0372o4) {
        C0659zh c0659zh = this.f14897d;
        c0659zh.f14999a = c0659zh.f14999a.mergeFrom(c0372o4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    public final C0372o4 d() {
        return this.f14897d.f14999a;
    }

    @NonNull
    public final C0309lg e() {
        return this.f14902i;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    @NonNull
    public final Context getContext() {
        return this.f14894a;
    }

    public C0596x4(Context context, Hl hl, Q4 q42, C0397p4 c0397p4, C0659zh c0659zh, C0309lg c0309lg, R4 r42, C0646z4 c0646z4, C0434qg c0434qg) {
        this.f14900g = new ArrayList();
        this.f14904l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f14894a = applicationContext;
        this.f14895b = q42;
        this.f14897d = c0659zh;
        this.f14901h = r42;
        this.f14898e = C0646z4.a(this);
        b(c0397p4);
        Am a7 = hl.a(applicationContext, q42, c0397p4.f14455a);
        this.f14896c = a7;
        this.j = U3.a(a7, C0353na.k().c());
        this.f14899f = c0646z4.a(this, a7);
        this.f14902i = c0309lg;
        this.f14903k = c0434qg;
        hl.a(q42, this);
    }

    public final synchronized void a(@NonNull C0521u4 c0521u4) {
        this.f14901h.f12802a.add(c0521u4);
        B6.a(c0521u4.f14700c, this.j.a(Fm.a(this.f14896c.e().f13763l)));
    }

    public final synchronized void b(@NonNull C0521u4 c0521u4) {
        this.f14901h.f12802a.remove(c0521u4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    @NonNull
    public final Q4 b() {
        return this.f14895b;
    }

    public final void a(@NonNull P5 p52, @NonNull C0521u4 c0521u4) {
        E4 e42 = this.f14898e;
        e42.getClass();
        e42.a(p52, new D4(c0521u4));
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull Jl jl, C0161fm c0161fm) {
        synchronized (this.f14904l) {
            try {
                Iterator it = this.f14900g.iterator();
                while (it.hasNext()) {
                    Xa xa2 = (Xa) it.next();
                    B6.a(xa2.f13180a, jl, this.j.a(xa2.f13182c));
                }
                this.f14900g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull C0161fm c0161fm) {
        synchronized (this.f14904l) {
            try {
                Iterator it = this.f14901h.f12802a.iterator();
                while (it.hasNext()) {
                    C0521u4 c0521u4 = (C0521u4) it.next();
                    B6.a(c0521u4.f14700c, this.j.a(Fm.a(c0161fm.f13763l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f14900g.iterator();
                while (it2.hasNext()) {
                    Xa xa2 = (Xa) it2.next();
                    if (AbstractC0084cm.a(c0161fm, xa2.f13181b, xa2.f13182c, new Va())) {
                        B6.a(xa2.f13180a, this.j.a(xa2.f13182c));
                    } else {
                        arrayList.add(xa2);
                    }
                }
                this.f14900g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f14899f.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Xa xa2) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (xa2 != null) {
            list = xa2.f13181b;
            resultReceiver = xa2.f13180a;
            hashMap = xa2.f13182c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a7 = this.f14896c.a(list, hashMap);
        if (!a7) {
            B6.a(resultReceiver, this.j.a(hashMap));
        }
        if (!this.f14896c.g()) {
            if (a7) {
                B6.a(resultReceiver, this.j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f14904l) {
            if (a7 && xa2 != null) {
                try {
                    this.f14900g.add(xa2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f14899f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f14903k.a(new C0571w4(resultReceiver));
    }

    @NonNull
    public final T3 a() {
        return this.j;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@NonNull C0397p4 c0397p4) {
        this.f14896c.a(c0397p4.f14455a);
        a(c0397p4.f14456b);
    }
}

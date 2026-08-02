package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279kb {

    /* renamed from: a, reason: collision with root package name */
    public final C0141f2 f14117a = new C0141f2();

    /* renamed from: b, reason: collision with root package name */
    public final C0274k6 f14118b = new C0274k6();

    /* renamed from: c, reason: collision with root package name */
    public C0665zn f14119c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14120d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14121e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ta ta2) {
        if (this.f14121e) {
            return;
        }
        kotlin.collections.z.o(this.f14118b.f14101a, new Fa[]{this.f14117a.a(context, appMetricaConfig, ta2)});
        this.f14121e = true;
    }

    public final synchronized void b() {
        if (this.f14120d) {
            return;
        }
        C0274k6 c0274k6 = this.f14118b;
        ArrayList arrayList = C0040b4.l().f13380i.f14286a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.v.k(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0274k6.f14101a.addAll(arrayList2);
        this.f14120d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f14119c != null) {
                return;
            }
            O1 o12 = new O1(this.f14118b);
            this.f14119c = new C0665zn(o12);
            C0640yn c0640yn = new C0640yn();
            c0640yn.f14979a.add(o12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c0640yn.f14979a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c0640yn);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        this.f14118b.f14101a.clear();
        this.f14120d = false;
        this.f14121e = false;
    }
}

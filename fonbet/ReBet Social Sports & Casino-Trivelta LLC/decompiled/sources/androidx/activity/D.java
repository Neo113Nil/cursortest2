package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16341a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f16342b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16343c;

    /* renamed from: d, reason: collision with root package name */
    public int f16344d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16345e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16346f;

    /* renamed from: g, reason: collision with root package name */
    public final List f16347g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f16348h;

    public D(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f16341a = executor;
        this.f16342b = reportFullyDrawn;
        this.f16343c = new Object();
        this.f16347g = new ArrayList();
        this.f16348h = new Runnable() { // from class: androidx.activity.C
            @Override // java.lang.Runnable
            public final void run() {
                D.d(D.this);
            }
        };
    }

    public static final void d(D d10) {
        synchronized (d10.f16343c) {
            try {
                d10.f16345e = false;
                if (d10.f16344d == 0 && !d10.f16346f) {
                    d10.f16342b.invoke();
                    d10.b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f16343c) {
            try {
                this.f16346f = true;
                Iterator it = this.f16347g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f16347g.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f16343c) {
            z10 = this.f16346f;
        }
        return z10;
    }
}

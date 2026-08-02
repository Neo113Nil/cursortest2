package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.q;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D extends LiveData {

    /* renamed from: b, reason: collision with root package name */
    public final w f23250b;

    /* renamed from: c, reason: collision with root package name */
    public final o f23251c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23252d;

    /* renamed from: e, reason: collision with root package name */
    public final Callable f23253e;

    /* renamed from: f, reason: collision with root package name */
    public final q.c f23254f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f23255g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f23256h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f23257i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f23258j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f23259k;

    public static final class a extends q.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D f23260a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String[] strArr, D d10) {
            super(strArr);
            this.f23260a = d10;
        }

        @Override // androidx.room.q.c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            s.c.h().b(this.f23260a.e());
        }
    }

    public D(w database, o container, boolean z10, Callable computeFunction, String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f23250b = database;
        this.f23251c = container;
        this.f23252d = z10;
        this.f23253e = computeFunction;
        this.f23254f = new a(tableNames, this);
        this.f23255g = new AtomicBoolean(true);
        this.f23256h = new AtomicBoolean(false);
        this.f23257i = new AtomicBoolean(false);
        this.f23258j = new Runnable() { // from class: androidx.room.B
            @Override // java.lang.Runnable
            public final void run() {
                D.h(D.this);
            }
        };
        this.f23259k = new Runnable() { // from class: androidx.room.C
            @Override // java.lang.Runnable
            public final void run() {
                D.g(D.this);
            }
        };
    }

    public static final void g(D this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.f23255g.compareAndSet(false, true) && hasActiveObservers) {
            this$0.f().execute(this$0.f23258j);
        }
    }

    public static final void h(D this$0) {
        boolean z10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f23257i.compareAndSet(false, true)) {
            this$0.f23250b.getInvalidationTracker().d(this$0.f23254f);
        }
        do {
            if (this$0.f23256h.compareAndSet(false, true)) {
                Object obj = null;
                z10 = false;
                while (this$0.f23255g.compareAndSet(true, false)) {
                    try {
                        try {
                            obj = this$0.f23253e.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        this$0.f23256h.set(false);
                    }
                }
                if (z10) {
                    this$0.postValue(obj);
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } while (this$0.f23255g.get());
    }

    public final Runnable e() {
        return this.f23259k;
    }

    public final Executor f() {
        return this.f23252d ? this.f23250b.getTransactionExecutor() : this.f23250b.getQueryExecutor();
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        o oVar = this.f23251c;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        oVar.b(this);
        f().execute(this.f23258j);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        o oVar = this.f23251c;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        oVar.c(this);
    }
}

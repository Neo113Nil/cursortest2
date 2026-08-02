package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.room.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2265c {

    /* renamed from: m, reason: collision with root package name */
    public static final a f23291m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public E2.h f23292a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f23293b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f23294c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23295d;

    /* renamed from: e, reason: collision with root package name */
    public long f23296e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f23297f;

    /* renamed from: g, reason: collision with root package name */
    public int f23298g;

    /* renamed from: h, reason: collision with root package name */
    public long f23299h;

    /* renamed from: i, reason: collision with root package name */
    public E2.g f23300i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23301j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f23302k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f23303l;

    /* renamed from: androidx.room.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C2265c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f23293b = new Handler(Looper.getMainLooper());
        this.f23295d = new Object();
        this.f23296e = autoCloseTimeUnit.toMillis(j10);
        this.f23297f = autoCloseExecutor;
        this.f23299h = SystemClock.uptimeMillis();
        this.f23302k = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                C2265c.f(C2265c.this);
            }
        };
        this.f23303l = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                C2265c.c(C2265c.this);
            }
        };
    }

    public static final void c(C2265c this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f23295d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f23299h < this$0.f23296e) {
                    return;
                }
                if (this$0.f23298g != 0) {
                    return;
                }
                Runnable runnable = this$0.f23294c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                E2.g gVar = this$0.f23300i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f23300i = null;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void f(C2265c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f23297f.execute(this$0.f23303l);
    }

    public final void d() {
        synchronized (this.f23295d) {
            try {
                this.f23301j = true;
                E2.g gVar = this.f23300i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f23300i = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f23295d) {
            try {
                int i10 = this.f23298g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f23298g = i11;
                if (i11 == 0) {
                    if (this.f23300i == null) {
                        return;
                    } else {
                        this.f23293b.postDelayed(this.f23302k, this.f23296e);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final E2.g h() {
        return this.f23300i;
    }

    public final E2.h i() {
        E2.h hVar = this.f23292a;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final E2.g j() {
        synchronized (this.f23295d) {
            this.f23293b.removeCallbacks(this.f23302k);
            this.f23298g++;
            if (this.f23301j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            E2.g gVar = this.f23300i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            E2.g writableDatabase = i().getWritableDatabase();
            this.f23300i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void k(E2.h delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        n(delegateOpenHelper);
    }

    public final boolean l() {
        return !this.f23301j;
    }

    public final void m(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f23294c = onAutoClose;
    }

    public final void n(E2.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f23292a = hVar;
    }
}

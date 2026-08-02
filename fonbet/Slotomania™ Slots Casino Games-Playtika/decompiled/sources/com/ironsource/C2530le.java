package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2530le extends ScheduledThreadPoolExecutor {
    private final Function1<Throwable, Unit> a;
    private final Function1<String, Unit> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.le$a */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.le$b */
    public static final class b extends Lambda implements Function1<String, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.INSTANCE;
        }
    }

    public C2530le() {
        this(0, null, null, 7, null);
    }

    private final String a(String str) {
        return C2530le.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th != null) {
            this.b.invoke(a(th.toString()));
            this.a.invoke(th);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e) {
                C2556n4.d().a(e);
                this.b.invoke(a(e.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e2) {
                C2556n4.d().a(e2);
                this.b.invoke(a(e2.toString()));
                this.a.invoke(e2);
            } catch (ExecutionException e3) {
                C2556n4.d().a(e3);
                this.b.invoke(a(e3.toString()));
                this.a.invoke(e3.getCause());
            }
        }
    }

    public /* synthetic */ C2530le(int i, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C2548me.a : i, (i2 & 2) != 0 ? a.a : function1, (i2 & 4) != 0 ? b.a : function12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2530le(int i, Function1<? super Throwable, Unit> report, Function1<? super String, Unit> log) {
        super(i, new ThreadFactoryC2401ea());
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(log, "log");
        this.a = report;
        this.b = log;
    }
}

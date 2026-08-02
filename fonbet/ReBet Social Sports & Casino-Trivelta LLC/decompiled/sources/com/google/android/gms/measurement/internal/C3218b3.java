package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: com.google.android.gms.measurement.internal.b3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3218b3 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f33930a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33931b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3234d3 f33933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3218b3(C3234d3 c3234d3, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        Objects.requireNonNull(c3234d3);
        this.f33933d = c3234d3;
        AbstractC3191o.m(str);
        atomicLong = C3234d3.f33977k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f33930a = andIncrement;
        this.f33932c = str;
        this.f33931b = z10;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            c3234d3.f33578a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C3218b3 c3218b3 = (C3218b3) obj;
        boolean z10 = c3218b3.f33931b;
        boolean z11 = this.f33931b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f33930a;
        long j11 = c3218b3.f33930a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f33933d.f33578a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f33933d.f33578a.a().o().b(this.f33932c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3218b3(C3234d3 c3234d3, Callable callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        Objects.requireNonNull(c3234d3);
        this.f33933d = c3234d3;
        AbstractC3191o.m("Task exception on worker thread");
        atomicLong = C3234d3.f33977k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f33930a = andIncrement;
        this.f33932c = "Task exception on worker thread";
        this.f33931b = z10;
        if (andIncrement == LongCompanionObject.MAX_VALUE) {
            c3234d3.f33578a.a().o().a("Tasks index overflow");
        }
    }
}

package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import com.plaid.internal.C3556a6;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class H6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final N6 f39275a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Ph.P f39276b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<I6> f39277c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile L6 f39278d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f39279e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39280a;

        static {
            int[] iArr = new int[L6.values().length];
            try {
                iArr[L6.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L6.ERRORS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L6.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39280a = iArr;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.remotelog.RemoteLogControllerImpl$maybeFlushEvents$1", f = "RemoteLogControllerImpl.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f39281a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L6 f39283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L6 l62, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f39283c = l62;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return H6.this.new b(this.f39283c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return H6.this.new b(this.f39283c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ConcurrentLinkedQueue<I6> concurrentLinkedQueue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39281a;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    H6 h62 = H6.this;
                    L6 l62 = this.f39283c;
                    this.f39281a = 1;
                    if (h62.a(l62, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!concurrentLinkedQueue.isEmpty()) {
                    H6.this.a();
                }
                return Unit.INSTANCE;
            } finally {
                H6.this.f39279e.set(false);
                if (!H6.this.f39277c.isEmpty()) {
                    H6.this.a();
                }
            }
        }
    }

    public H6(N6 eventSender) {
        Ph.P scope = Ph.Q.a(C1452g0.b().plus(Ph.X0.b(null, 1, null)));
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f39275a = eventSender;
        this.f39276b = scope;
        this.f39277c = new ConcurrentLinkedQueue<>();
        this.f39279e = new AtomicBoolean(false);
    }

    @Override // com.plaid.internal.G6
    public final void a(@NotNull String eventName, @NotNull Map<String, String> metadata, @NotNull J6 logLevel) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        a(new I6(eventName, metadata, logLevel));
    }

    @Override // com.plaid.internal.G6
    public final void clear() {
        this.f39277c.clear();
        this.f39278d = null;
        this.f39279e.set(false);
        N6 n62 = this.f39275a;
        n62.f39462e = null;
        n62.f39463f = null;
        n62.f39464g = null;
        C3556a6.f39823a.getClass();
        C3556a6.a.a("RemoteLogSender: session data cleared", true);
        C3556a6.a.a("Remote log controller cleared", true);
    }

    public final void a(@NotNull I6 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f39277c.offer(event);
        C3556a6.a.a(C3556a6.f39823a, "Remote log event queued: " + event.a() + ", queue size: " + this.f39277c.size());
        a();
    }

    public final void a(@NotNull L6 threshold) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        if (this.f39278d != threshold) {
            C3556a6.a.e(C3556a6.f39823a, "Log level threshold is being changed from " + this.f39278d + " to " + threshold);
        }
        this.f39278d = threshold;
        C3556a6.a.a(C3556a6.f39823a, "Remote log level threshold set: " + threshold);
        a();
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        this.f39275a.a(str, str2);
    }

    public final void a() {
        L6 l62 = this.f39278d;
        if (this.f39275a.f39462e == null || l62 == null || this.f39277c.isEmpty() || !this.f39279e.compareAndSet(false, true)) {
            return;
        }
        AbstractC1459k.d(this.f39276b, null, null, new b(l62, null), 3, null);
    }

    public final Object a(L6 l62, b bVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        while (!this.f39277c.isEmpty()) {
            I6 poll = this.f39277c.poll();
            if (poll != null && (i10 = a.f39280a[l62.ordinal()]) != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (poll.f39302d == J6.ERROR) {
                }
                arrayList.add(poll);
            }
        }
        if (!arrayList.isEmpty()) {
            C3556a6.a.a(C3556a6.f39823a, "Flushing " + arrayList.size() + " remote log events");
            Object a10 = this.f39275a.a(arrayList, bVar);
            return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

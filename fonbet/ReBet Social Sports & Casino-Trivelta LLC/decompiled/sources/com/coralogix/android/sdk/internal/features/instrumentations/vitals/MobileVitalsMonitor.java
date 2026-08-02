package com.coralogix.android.sdk.internal.features.instrumentations.vitals;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Q5.q;
import W9.d;
import X9.m;
import android.app.Application;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2193s;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bumptech.glide.gifdecoder.e;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import e5.MobileVitalsAggregation;
import h5.C4464a;
import i3.C4527h;
import i5.C4531c;
import j5.C5093a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R*\u0010+\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%j\u0002`(0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R-\u00100\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%j\u0002`(0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001b\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/coralogix/android/sdk/internal/features/instrumentations/vitals/MobileVitalsMonitor;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/app/Application;", "application", "LPh/P;", "monitorScope", "", "LQ5/q;", "", "mobileVitalsConfig", "<init>", "(Landroid/app/Application;LPh/P;Ljava/util/Map;)V", "", d.f13160a, "()V", "shouldResetMeasurementWindows", "Le5/b;", "c", "(Z)Le5/b;", e.f29601m, "Landroidx/lifecycle/s;", "owner", "onPause", "(Landroidx/lifecycle/s;)V", "onResume", "a", "Landroid/app/Application;", b.f37029b, "LPh/P;", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "running", "", "Ljava/lang/Object;", "lock", "Lkotlinx/coroutines/flow/x;", "Lkotlin/Pair;", "", "Lkotlinx/serialization/json/JsonObject;", "Lcom/coralogix/android/sdk/internal/features/instrumentations/vitals/OneShotEvent;", "f", "Lkotlinx/coroutines/flow/x;", "_events", "Lkotlinx/coroutines/flow/C;", "g", "Lkotlinx/coroutines/flow/C;", "()Lkotlinx/coroutines/flow/C;", "events", "Lg5/i;", C4527h.f48087o, "Lg5/i;", "appStartTimeDetector", "Li5/c;", i.f35755A, "Li5/c;", "fpsDetector", "Lh5/a;", "j", "Lh5/a;", "cpuUsageDetector", "Lj5/a;", "k", "Lj5/a;", "memoryUsageDetector", "Ll5/d;", "l", "Ll5/d;", "slowFrozenFramesDetector", "", "LPh/C0;", m.f13664a, "Ljava/util/List;", "oneShotCollectors", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMobileVitalsMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileVitalsMonitor.kt\ncom/coralogix/android/sdk/internal/features/instrumentations/vitals/MobileVitalsMonitor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1863#2,2:158\n1#3:160\n*S KotlinDebug\n*F\n+ 1 MobileVitalsMonitor.kt\ncom/coralogix/android/sdk/internal/features/instrumentations/vitals/MobileVitalsMonitor\n*L\n131#1:158,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MobileVitalsMonitor implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Application application;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final P monitorScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Map mobileVitalsConfig;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean running;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final x _events;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final C events;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public g5.i appStartTimeDetector;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public C4531c fpsDetector;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public C4464a cpuUsageDetector;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C5093a memoryUsageDetector;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public l5.d slowFrozenFramesDetector;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final List oneShotCollectors;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f30172n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g5.i f30173o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ MobileVitalsMonitor f30174p;

        /* renamed from: com.coralogix.android.sdk.internal.features.instrumentations.vitals.MobileVitalsMonitor$a$a, reason: collision with other inner class name */
        public static final class C0476a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MobileVitalsMonitor f30175a;

            public C0476a(MobileVitalsMonitor mobileVitalsMonitor) {
                this.f30175a = mobileVitalsMonitor;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair pair, Continuation continuation) {
                Object emit = this.f30175a._events.emit(pair, continuation);
                return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g5.i iVar, MobileVitalsMonitor mobileVitalsMonitor, Continuation continuation) {
            super(2, continuation);
            this.f30173o = iVar;
            this.f30174p = mobileVitalsMonitor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f30173o, this.f30174p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f30172n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C z02 = this.f30173o.z0();
                C0476a c0476a = new C0476a(this.f30174p);
                this.f30172n = 1;
                if (z02.collect(c0476a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public MobileVitalsMonitor(Application application, P monitorScope, Map mobileVitalsConfig) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(monitorScope, "monitorScope");
        Intrinsics.checkNotNullParameter(mobileVitalsConfig, "mobileVitalsConfig");
        this.application = application;
        this.monitorScope = monitorScope;
        this.mobileVitalsConfig = mobileVitalsConfig;
        this.running = new AtomicBoolean(false);
        this.lock = new Object();
        x a10 = E.a(0, 8, Rh.d.f10308b);
        this._events = a10;
        this.events = AbstractC5323h.a(a10);
        this.oneShotCollectors = new ArrayList();
    }

    /* renamed from: b, reason: from getter */
    public final C getEvents() {
        return this.events;
    }

    public final MobileVitalsAggregation c(boolean shouldResetMeasurementWindows) {
        synchronized (this.lock) {
            try {
                if (!this.running.get()) {
                    return null;
                }
                E5.b.f3006a.a("Aggregating data, shouldResetMeasurementWindows: " + shouldResetMeasurementWindows);
                C4531c c4531c = this.fpsDetector;
                Map b22 = c4531c != null ? c4531c.b2(shouldResetMeasurementWindows) : null;
                C4464a c4464a = this.cpuUsageDetector;
                Map Z12 = c4464a != null ? c4464a.Z1(shouldResetMeasurementWindows) : null;
                C5093a c5093a = this.memoryUsageDetector;
                Map y12 = c5093a != null ? c5093a.y1(shouldResetMeasurementWindows) : null;
                l5.d dVar = this.slowFrozenFramesDetector;
                return new MobileVitalsAggregation(b22, Z12, y12, dVar != null ? dVar.h2(shouldResetMeasurementWindows) : null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        C0 d10;
        synchronized (this.lock) {
            try {
                if (!this.running.getAndSet(true)) {
                    ProcessLifecycleOwner.INSTANCE.a().getLifecycle().a(this);
                    Boolean bool = (Boolean) this.mobileVitalsConfig.get(q.f9462a);
                    boolean booleanValue = bool != null ? bool.booleanValue() : true;
                    Boolean bool2 = (Boolean) this.mobileVitalsConfig.get(q.f9463b);
                    boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                    if (booleanValue || booleanValue2) {
                        E5.b.f3006a.a("Starting App Start Time Monitoring with coldStartTimeEnabled: " + booleanValue + ", warmStartTimeEnabled: " + booleanValue2);
                        g5.i iVar = new g5.i(this.application, null, booleanValue, booleanValue2, 2, null);
                        iVar.start();
                        List list = this.oneShotCollectors;
                        d10 = AbstractC1459k.d(this.monitorScope, null, null, new a(iVar, this, null), 3, null);
                        list.add(d10);
                        this.appStartTimeDetector = iVar;
                    }
                    Boolean bool3 = (Boolean) this.mobileVitalsConfig.get(q.f9467f);
                    if (bool3 != null ? bool3.booleanValue() : true) {
                        E5.b.f3006a.a("Starting FPS Monitoring");
                        C4531c c4531c = new C4531c(0L, null, 3, null);
                        this.fpsDetector = c4531c;
                        c4531c.start();
                    }
                    Boolean bool4 = (Boolean) this.mobileVitalsConfig.get(q.f9464c);
                    if (bool4 != null ? bool4.booleanValue() : true) {
                        E5.b.f3006a.a("Starting CPU Usage Monitoring");
                        C4464a c4464a = new C4464a(0L, null, 3, null);
                        this.cpuUsageDetector = c4464a;
                        c4464a.start();
                    }
                    Boolean bool5 = (Boolean) this.mobileVitalsConfig.get(q.f9465d);
                    if (bool5 != null ? bool5.booleanValue() : true) {
                        E5.b.f3006a.a("Starting Memory Usage Monitoring");
                        C5093a c5093a = new C5093a(0L, null, 3, null);
                        this.memoryUsageDetector = c5093a;
                        c5093a.start();
                    }
                    Boolean bool6 = (Boolean) this.mobileVitalsConfig.get(q.f9466e);
                    if (bool6 != null ? bool6.booleanValue() : true) {
                        E5.b.f3006a.a("Starting Slow Frozen Frames Monitoring");
                        l5.d dVar = new l5.d(this.application, 0.0d, 0.0d, 0L, null, 30, null);
                        this.slowFrozenFramesDetector = dVar;
                        dVar.start();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.lock) {
            try {
                if (this.running.getAndSet(false)) {
                    ProcessLifecycleOwner.INSTANCE.a().getLifecycle().d(this);
                    g5.i iVar = this.appStartTimeDetector;
                    if (iVar != null) {
                        iVar.close();
                    }
                    C4464a c4464a = this.cpuUsageDetector;
                    if (c4464a != null) {
                        c4464a.close();
                    }
                    C4531c c4531c = this.fpsDetector;
                    if (c4531c != null) {
                        c4531c.close();
                    }
                    C5093a c5093a = this.memoryUsageDetector;
                    if (c5093a != null) {
                        c5093a.close();
                    }
                    l5.d dVar = this.slowFrozenFramesDetector;
                    if (dVar != null) {
                        dVar.close();
                    }
                    this.appStartTimeDetector = null;
                    this.cpuUsageDetector = null;
                    this.fpsDetector = null;
                    this.memoryUsageDetector = null;
                    this.slowFrozenFramesDetector = null;
                    Iterator it = this.oneShotCollectors.iterator();
                    while (it.hasNext()) {
                        C0.a.b((C0) it.next(), null, 1, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    this.oneShotCollectors.clear();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(InterfaceC2193s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        synchronized (this.lock) {
            try {
                if (this.running.get()) {
                    C4464a c4464a = this.cpuUsageDetector;
                    if (c4464a != null) {
                        c4464a.pause();
                    }
                    C4531c c4531c = this.fpsDetector;
                    if (c4531c != null) {
                        c4531c.pause();
                    }
                    C5093a c5093a = this.memoryUsageDetector;
                    if (c5093a != null) {
                        c5093a.pause();
                    }
                    l5.d dVar = this.slowFrozenFramesDetector;
                    if (dVar != null) {
                        dVar.pause();
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC2193s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        synchronized (this.lock) {
            try {
                if (this.running.get()) {
                    C4464a c4464a = this.cpuUsageDetector;
                    if (c4464a != null) {
                        c4464a.resume();
                    }
                    C4531c c4531c = this.fpsDetector;
                    if (c4531c != null) {
                        c4531c.resume();
                    }
                    C5093a c5093a = this.memoryUsageDetector;
                    if (c5093a != null) {
                        c5093a.resume();
                    }
                    l5.d dVar = this.slowFrozenFramesDetector;
                    if (dVar != null) {
                        dVar.resume();
                        Unit unit = Unit.INSTANCE;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.ovj;
import xsna.rsr;
import xsna.s3q0;
import xsna.scy;
import xsna.spj;
import xsna.ttk0;
import xsna.utk0;
import xsna.vtk0;
import xsna.xh50;
import xsna.zvj;

/* compiled from: OrientationRepository.kt */
/* loaded from: classes14.dex */
public final class OrientationRepository {
    private final xh50<Integer> _resumedActivityOrientation;
    private final ovj defaultDispatcher;
    private final AndroidGetLifecycleFlow getLifecycleFlow;
    private final xh50<Boolean> isRunning = vtk0.a(Boolean.FALSE);
    private final ttk0<Integer> resumedActivityOrientation;

    public OrientationRepository(AndroidGetLifecycleFlow androidGetLifecycleFlow, ovj ovjVar) {
        this.getLifecycleFlow = androidGetLifecycleFlow;
        this.defaultDispatcher = ovjVar;
        utk0 a = vtk0.a(-1);
        this._resumedActivityOrientation = a;
        this.resumedActivityOrientation = a;
    }

    public final ttk0<Integer> getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        xh50<Boolean> xh50Var = this.isRunning;
        do {
            value = xh50Var.getValue();
            bool = value;
            bool.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final ksr<LifecycleEvent> invoke = this.getLifecycleFlow.invoke();
        final ksr<Object> ksrVar = new ksr<Object>() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                if (obj instanceof LifecycleEvent.Resumed) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        final OrientationRepository$invoke$3 orientationRepository$invoke$3 = new PropertyReference1Impl() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public Object get(Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ksr<WeakReference<Activity>>() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;
                final /* synthetic */ scy receiver$inlined;

                @b6l(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar, scy scyVar) {
                    this.$this_unsafeFlow = lsrVar;
                    this.receiver$inlined = scyVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                Object obj3 = this.receiver$inlined.get((LifecycleEvent) obj);
                                anonymousClass1.label = 1;
                                if (lsrVar.emit(obj3, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super WeakReference<Activity>> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, orientationRepository$invoke$3), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new OrientationRepository$invoke$4(this, null)), zvj.a(this.defaultDispatcher));
    }
}

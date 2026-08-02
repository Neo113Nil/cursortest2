package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import defpackage.a70;
import defpackage.au3;
import defpackage.b98;
import defpackage.ddi;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.il4;
import defpackage.kef;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.v98;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "getLifecycleFlow", "Lau3;", "defaultDispatcher", "<init>", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lau3;)V", "", "invoke", "()V", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "Lau3;", "Lf1d;", "", "isRunning", "Lf1d;", "", "_resumedActivityOrientation", "Lddi;", "resumedActivityOrientation", "Lddi;", "getResumedActivityOrientation", "()Lddi;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrientationRepository {

    @NotNull
    private final f1d _resumedActivityOrientation;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final AndroidGetLifecycleFlow getLifecycleFlow;

    @NotNull
    private final f1d isRunning;

    @NotNull
    private final ddi resumedActivityOrientation;

    public OrientationRepository(@NotNull AndroidGetLifecycleFlow androidGetLifecycleFlow, @NotNull au3 au3Var) {
        androidGetLifecycleFlow.getClass();
        au3Var.getClass();
        this.getLifecycleFlow = androidGetLifecycleFlow;
        this.defaultDispatcher = au3Var;
        this.isRunning = gdi.a(Boolean.FALSE);
        fdi a = gdi.a(-1);
        this._resumedActivityOrientation = a;
        this.resumedActivityOrientation = a;
    }

    @NotNull
    public final ddi getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        fdi fdiVar;
        Object value;
        Boolean bool;
        f1d f1dVar = this.isRunning;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!fdiVar.k(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final z88 invoke = this.getLifecycleFlow.invoke();
        final z88 z88Var = new z88() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;

                @il4(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(rq3 rq3Var) {
                        super(rq3Var);
                    }

                    @Override // defpackage.h21
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(b98 b98Var) {
                    this.$this_unsafeFlow = b98Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.b98
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, rq3 rq3Var) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj2);
                                b98 b98Var = this.$this_unsafeFlow;
                                if (obj instanceof LifecycleEvent.Resumed) {
                                    anonymousClass1.label = 1;
                                    if (b98Var.emit(obj, anonymousClass1) == lu3Var) {
                                        return lu3Var;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj22 = anonymousClass1.result;
                    lu3 lu3Var2 = lu3.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.z88
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        };
        final OrientationRepository$invoke$3 orientationRepository$invoke$3 = new kef() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$3
            @Override // defpackage.kef, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        fcp.m0(new v98(new z88() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements b98 {
                final /* synthetic */ b98 $this_unsafeFlow;
                final /* synthetic */ KProperty1 receiver$inlined;

                @il4(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends sq3 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(rq3 rq3Var) {
                        super(rq3Var);
                    }

                    @Override // defpackage.h21
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(b98 b98Var, KProperty1 kProperty1) {
                    this.$this_unsafeFlow = b98Var;
                    this.receiver$inlined = kProperty1;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.b98
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, rq3 rq3Var) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (rq3Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) rq3Var;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            lu3 lu3Var = lu3.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                y6a.M(obj2);
                                b98 b98Var = this.$this_unsafeFlow;
                                Object obj3 = this.receiver$inlined.get((LifecycleEvent) obj);
                                anonymousClass1.label = 1;
                                if (b98Var.emit(obj3, anonymousClass1) == lu3Var) {
                                    return lu3Var;
                                }
                            } else {
                                if (i != 1) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y6a.M(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(rq3Var);
                    Object obj22 = anonymousClass1.result;
                    lu3 lu3Var2 = lu3.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.z88
            public Object collect(b98 b98Var, rq3 rq3Var) {
                Object collect = z88.this.collect(new AnonymousClass2(b98Var, orientationRepository$invoke$3), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            }
        }, new OrientationRepository$invoke$4(this, null), 3), s9a.c(this.defaultDispatcher));
    }
}

package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.a70;
import defpackage.au3;
import defpackage.b98;
import defpackage.beh;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.un0;
import defpackage.weh;
import defpackage.xdh;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusRepository;", "", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "getLifecycleFlow", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lau3;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/core/log/Logger;", "Lxdh;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "focusState", "Lxdh;", "getFocusState", "()Lxdh;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusRepository {

    @NotNull
    private final xdh focusState;

    @NotNull
    private final Logger logger;

    public FocusRepository(@NotNull AndroidGetLifecycleFlow androidGetLifecycleFlow, @NotNull au3 au3Var, @NotNull Logger logger) {
        xdh b;
        androidGetLifecycleFlow.getClass();
        au3Var.getClass();
        logger.getClass();
        this.logger = logger;
        try {
            final z88 invoke = androidGetLifecycleFlow.invoke();
            final z88 z88Var = new z88() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements b98 {
                    final /* synthetic */ b98 $this_unsafeFlow;

                    @il4(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", l = {50}, m = "emit")
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                                    LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                                    if ((lifecycleEvent instanceof LifecycleEvent.Paused) || (lifecycleEvent instanceof LifecycleEvent.Resumed)) {
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
            b = un0.H(new z88() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements b98 {
                    final /* synthetic */ b98 $this_unsafeFlow;

                    @il4(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", l = {50}, m = "emit")
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
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
                                    LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
                                    Object focused = lifecycleEvent instanceof LifecycleEvent.Resumed ? new FocusState.Focused(((LifecycleEvent.Resumed) lifecycleEvent).getActivity()) : new FocusState.Unfocused(lifecycleEvent.getActivity());
                                    anonymousClass1.label = 1;
                                    if (b98Var.emit(focused, anonymousClass1) == lu3Var) {
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
                    Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                    return collect == lu3.a ? collect : Unit.a;
                }
            }, s9a.c(au3Var), weh.a, 1);
        } catch (Exception e) {
            this.logger.error("Could not subscribe to lifecycle flow", e);
            b = beh.b(0, 0, null, 7);
        }
        this.focusState = b;
    }

    @NotNull
    public final xdh getFocusState() {
        return this.focusState;
    }
}

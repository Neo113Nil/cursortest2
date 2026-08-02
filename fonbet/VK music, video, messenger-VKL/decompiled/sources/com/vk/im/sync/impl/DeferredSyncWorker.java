package com.vk.im.sync.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.c;
import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import com.vk.im.sync.impl.DeferredSyncWorker;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import xsna.b1j;
import xsna.b6l;
import xsna.bpn0;
import xsna.eoo;
import xsna.fpf0;
import xsna.k7m;
import xsna.kci;
import xsna.ksr;
import xsna.l5m;
import xsna.lsr;
import xsna.m7m;
import xsna.psr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.w8i;
import xsna.xzv;
import xsna.zno;

/* compiled from: DeferredSyncWorker.kt */
/* loaded from: classes.dex */
public final class DeferredSyncWorker extends CoroutineWorker implements w8i {
    public final Context b;
    public final bpn0 c;

    /* compiled from: DeferredSyncWorker.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final String a;

        /* compiled from: DeferredSyncWorker.kt */
        /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$a$a, reason: collision with other inner class name */
        public static final class C1140a extends a {
            public final Exception b;

            public C1140a(Exception exc) {
                super("error");
                this.b = exc;
            }

            public final Throwable b() {
                return this.b;
            }
        }

        /* compiled from: DeferredSyncWorker.kt */
        public static final class b extends a {
            public static final b b = new b("success");
        }

        /* compiled from: DeferredSyncWorker.kt */
        public static final class c extends a {
            public static final c b = new c("timeout_exceeded");
        }

        public a(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: DeferredSyncWorker.kt */
    @b6l(c = "com.vk.im.sync.impl.DeferredSyncWorker", f = "DeferredSyncWorker.kt", l = {47}, m = "doWork")
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeferredSyncWorker.this.doWork(this);
        }
    }

    public DeferredSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = context;
        this.c = new bpn0(new b1j(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        com.vk.im.sync.impl.a aVar;
        int i;
        try {
            if (continuationImpl instanceof com.vk.im.sync.impl.a) {
                aVar = (com.vk.im.sync.impl.a) continuationImpl;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        xzv l = ((ImCoroutinesEventObserverComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImCoroutinesEventObserverComponent.class))).l();
                        c experiments = ((ImExperimentsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImExperimentsComponent.class))).getExperiments();
                        final DeferredSyncWorker$awaitSync$$inlined$map$1 deferredSyncWorker$awaitSync$$inlined$map$1 = new DeferredSyncWorker$awaitSync$$inlined$map$1(new DeferredSyncWorker$awaitSync$$inlined$filterIsInstance$1(l.a()));
                        final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new ksr<ImBgSyncState>() { // from class: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$filter$1

                            /* compiled from: Emitters.kt */
                            /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$filter$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements lsr {
                                public final /* synthetic */ lsr b;

                                @b6l(c = "com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$filter$1$2", f = "DeferredSyncWorker.kt", l = {50}, m = "emit")
                                /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$filter$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    int I$0;
                                    Object L$0;
                                    Object L$1;
                                    Object L$2;
                                    Object L$3;
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
                                    this.b = lsrVar;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
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
                                                kotlin.a.a(obj2);
                                                if (((ImBgSyncState) obj) == ImBgSyncState.CONNECTED) {
                                                    anonymousClass1.L$0 = null;
                                                    anonymousClass1.L$1 = null;
                                                    anonymousClass1.L$2 = null;
                                                    anonymousClass1.L$3 = null;
                                                    anonymousClass1.I$0 = 0;
                                                    anonymousClass1.label = 1;
                                                    if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.a.a(obj2);
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
                            public final Object collect(lsr<? super ImBgSyncState> lsrVar, spj spjVar) {
                                Object collect = DeferredSyncWorker$awaitSync$$inlined$map$1.this.collect(new AnonymousClass2(lsrVar), spjVar);
                                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                            }
                        });
                        ?? r4 = new ksr<a.b>() { // from class: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$2

                            /* compiled from: Emitters.kt */
                            /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$2$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements lsr {
                                public final /* synthetic */ lsr b;

                                @b6l(c = "com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$2$2", f = "DeferredSyncWorker.kt", l = {50}, m = "emit")
                                /* renamed from: com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$2$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    int I$0;
                                    Object L$0;
                                    Object L$1;
                                    Object L$2;
                                    Object L$3;
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
                                    this.b = lsrVar;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
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
                                                kotlin.a.a(obj2);
                                                anonymousClass1.L$0 = null;
                                                anonymousClass1.L$1 = null;
                                                anonymousClass1.L$2 = null;
                                                anonymousClass1.L$3 = null;
                                                anonymousClass1.I$0 = 0;
                                                anonymousClass1.label = 1;
                                                if (this.b.emit(DeferredSyncWorker.a.b.b, anonymousClass1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                kotlin.a.a(obj2);
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
                            public final Object collect(lsr<? super DeferredSyncWorker.a.b> lsrVar, spj spjVar) {
                                Object collect = FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(new AnonymousClass2(lsrVar), spjVar);
                                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                            }
                        };
                        zno.a aVar2 = zno.c;
                        experiments.getClass();
                        psr p = kci.p(r4, eoo.f(8000L, DurationUnit.MILLISECONDS));
                        aVar.L$0 = null;
                        aVar.L$1 = null;
                        aVar.label = 1;
                        obj = rsr.n(p, aVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (a) obj;
                }
            }
            if (i != 0) {
            }
            return (a) obj;
        } catch (Exception e) {
            return e instanceof TimeoutException ? a.c.b : new a.C1140a(e);
        }
        aVar = new com.vk.im.sync.impl.a(this, continuationImpl);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        com.vk.im.sync.impl.b bVar;
        int i;
        try {
            if (continuationImpl instanceof com.vk.im.sync.impl.b) {
                bVar = (com.vk.im.sync.impl.b) continuationImpl;
                int i2 = bVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ((ImSynchronizationHelpersComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImSynchronizationHelpersComponent.class))).x3().a();
                        bVar.L$0 = null;
                        bVar.label = 1;
                        obj = b(bVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return (a) obj;
                }
            }
            if (i != 0) {
            }
            return (a) obj;
        } catch (Exception e) {
            return new a.C1140a(e);
        }
        bVar = new com.vk.im.sync.impl.b(this, continuationImpl);
        Object obj3 = bVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(spj<? super b.a> spjVar) {
        b bVar;
        int i;
        a aVar;
        String d;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bVar.label = 1;
                    obj = c(bVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                aVar = (a) obj;
                d = getInputData().d("sync_worker_caller");
                if (d == null) {
                    d = "default_caller";
                }
                String str = d;
                int intValue = ((Number) this.c.getValue()).intValue();
                int i3 = Build.VERSION.SDK_INT;
                if (aVar instanceof a.C1140a) {
                    com.vk.metrics.eventtracking.b.a.a(((a.C1140a) aVar).b());
                }
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.IM_DEFERRED_BACKGROUND_SYNC.h(), null, aVar.a(), Integer.valueOf(intValue), str, Integer.valueOf(i3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                return new b.a.c();
            }
        }
        bVar = new b(spjVar);
        Object obj3 = bVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        aVar = (a) obj3;
        d = getInputData().d("sync_worker_caller");
        if (d == null) {
        }
        String str2 = d;
        int intValue2 = ((Number) this.c.getValue()).intValue();
        int i32 = Build.VERSION.SDK_INT;
        if (aVar instanceof a.C1140a) {
        }
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2 = new SchemeStat$TypeDevNullItem(DevNullEventKey.IM_DEFERRED_BACKGROUND_SYNC.h(), null, aVar.a(), Integer.valueOf(intValue2), str2, Integer.valueOf(i32), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -62, 3, null);
        l5m l5mVar2 = new l5m(null, null, 3);
        l5mVar2.g = schemeStat$TypeDevNullItem2;
        l5mVar2.q();
        return new b.a.c();
    }
}

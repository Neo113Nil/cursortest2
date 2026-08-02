package com.vk.donut.video.subscription.impl;

import com.vk.api.generated.donut.dto.DonutDonatorSubscriptionInfoDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.donut.video.subscription.impl.model.CachedSubscription;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.a3o;
import xsna.b3o;
import xsna.b4q;
import xsna.b6l;
import xsna.c3o;
import xsna.caj0;
import xsna.d3o;
import xsna.e3o;
import xsna.evj;
import xsna.hpj;
import xsna.hqu0;
import xsna.kr;
import xsna.ksr;
import xsna.lr;
import xsna.lsr;
import xsna.lyd;
import xsna.myc0;
import xsna.qni0;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.tfx;
import xsna.whn0;
import xsna.wzs;
import xsna.yfb;
import xsna.yvj;
import xsna.z2o;
import xsna.zvj;

/* compiled from: DonutSubscriptionManagerImpl.kt */
/* loaded from: classes.dex */
public final class DonutSubscriptionManagerImpl implements b3o {
    public final a3o a;
    public final e3o b;
    public final hpj c = zvj.a(d.a.a(whn0.a(), hqu0.b()));
    public final caj0 d = lyd.a(0, 1, BufferOverflow.DROP_OLDEST);

    /* compiled from: DonutSubscriptionManagerImpl.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutDonatorSubscriptionInfoDto.StatusDto.values().length];
            try {
                iArr[DonutDonatorSubscriptionInfoDto.StatusDto.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutDonatorSubscriptionInfoDto.StatusDto.EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DonutSubscriptionManagerImpl.kt */
    @b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$softRelease$1", f = "DonutSubscriptionManagerImpl.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes18.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return DonutSubscriptionManagerImpl.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                a3o a3oVar = DonutSubscriptionManagerImpl.this.a;
                this.label = 1;
                if (a3oVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public DonutSubscriptionManagerImpl(a3o a3oVar, e3o e3oVar) {
        this.a = a3oVar;
        this.b = e3oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DonutSubscriptionManagerImpl donutSubscriptionManagerImpl, UserId userId, ContinuationImpl continuationImpl) {
        com.vk.donut.video.subscription.impl.b bVar;
        Object obj;
        int i;
        UserId userId2;
        VKApiExecutionException vKApiExecutionException;
        DonutDonatorSubscriptionInfoDto donutDonatorSubscriptionInfoDto;
        donutSubscriptionManagerImpl.getClass();
        if (continuationImpl instanceof com.vk.donut.video.subscription.impl.b) {
            bVar = (com.vk.donut.video.subscription.impl.b) continuationImpl;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    try {
                        e3o e3oVar = donutSubscriptionManagerImpl.b;
                        bVar.L$0 = userId;
                        bVar.label = 1;
                        e3oVar.a.getClass();
                        tfx tfxVar = new tfx("donut.getSubscription", new kr(18), new lr(14));
                        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                        obj2 = evj.p(yfb.A(tfxVar), bVar);
                        if (obj2 == obj) {
                            return obj;
                        }
                        userId2 = userId;
                    } catch (VKApiExecutionException e) {
                        e = e;
                        userId2 = userId;
                        vKApiExecutionException = e;
                        if (vKApiExecutionException.s() == 104) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    }
                    userId2 = (UserId) bVar.L$0;
                    try {
                        kotlin.a.a(obj2);
                    } catch (VKApiExecutionException e2) {
                        e = e2;
                        vKApiExecutionException = e;
                        if (vKApiExecutionException.s() == 104) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.w(l, L.LogType.e, vKApiExecutionException, new Object[]{"DonutSubscriptionManagerImpl", b4q.b(userId2, "Failed to get donut subscription for owner ")}, null, null, 24);
                            }
                            return s3q0.a;
                        }
                        donutDonatorSubscriptionInfoDto = null;
                        bVar.L$0 = null;
                        bVar.L$1 = null;
                        bVar.label = 2;
                        if (donutSubscriptionManagerImpl.f(userId2, donutDonatorSubscriptionInfoDto, bVar) == obj) {
                        }
                        return s3q0.a;
                    }
                }
                donutDonatorSubscriptionInfoDto = (DonutDonatorSubscriptionInfoDto) obj2;
                bVar.L$0 = null;
                bVar.L$1 = null;
                bVar.label = 2;
                if (donutSubscriptionManagerImpl.f(userId2, donutDonatorSubscriptionInfoDto, bVar) == obj) {
                    return obj;
                }
                return s3q0.a;
            }
        }
        bVar = new com.vk.donut.video.subscription.impl.b(donutSubscriptionManagerImpl, continuationImpl);
        Object obj22 = bVar.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        donutDonatorSubscriptionInfoDto = (DonutDonatorSubscriptionInfoDto) obj22;
        bVar.L$0 = null;
        bVar.L$1 = null;
        bVar.label = 2;
        if (donutSubscriptionManagerImpl.f(userId2, donutDonatorSubscriptionInfoDto, bVar) == obj) {
        }
        return s3q0.a;
    }

    @Override // xsna.b3o
    public final void b(boolean z) {
        if (z) {
            myc0.h(this.c, null, null, new b(null), 3);
        }
    }

    @Override // xsna.b3o
    public final void c() {
        this.d.e(s3q0.a);
    }

    @Override // xsna.b3o
    public final boolean d(UserId userId) {
        return ((Boolean) myc0.i(EmptyCoroutineContext.b, new c3o(this, userId, null))).booleanValue();
    }

    @Override // xsna.b3o
    public final void e(UserId userId) {
        myc0.h(this.c, null, null, new d3o(this, userId, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(UserId userId, DonutDonatorSubscriptionInfoDto donutDonatorSubscriptionInfoDto, ContinuationImpl continuationImpl) {
        com.vk.donut.video.subscription.impl.a aVar;
        int i;
        UserId userId2;
        CachedSubscription cachedSubscription;
        CachedSubscription.Status status;
        if (continuationImpl instanceof com.vk.donut.video.subscription.impl.a) {
            aVar = (com.vk.donut.video.subscription.impl.a) continuationImpl;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (donutDonatorSubscriptionInfoDto != null) {
                        UserId q = donutDonatorSubscriptionInfoDto.q();
                        int i3 = a.$EnumSwitchMapping$0[donutDonatorSubscriptionInfoDto.f().ordinal()];
                        if (i3 == 1) {
                            status = CachedSubscription.Status.ACTIVE;
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            status = CachedSubscription.Status.EXPIRING;
                        }
                        cachedSubscription = new CachedSubscription(q, status, donutDonatorSubscriptionInfoDto.d(), qni0.b());
                        userId2 = userId;
                    } else {
                        userId2 = userId;
                        cachedSubscription = new CachedSubscription(userId2, CachedSubscription.Status.EXPIRED, 0L, qni0.b());
                    }
                    aVar.L$0 = null;
                    aVar.L$1 = null;
                    aVar.L$2 = null;
                    aVar.label = 1;
                    Object k = myc0.k(hqu0.b(), new z2o(this.a, userId2, cachedSubscription, null), aVar);
                    if (k != obj2) {
                        k = s3q0.a;
                    }
                    if (k == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        aVar = new com.vk.donut.video.subscription.impl.a(this, continuationImpl);
        Object obj3 = aVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    @Override // xsna.b3o
    public final void init() {
        final DonutSubscriptionManagerImpl$init$$inlined$map$2 donutSubscriptionManagerImpl$init$$inlined$map$2 = new DonutSubscriptionManagerImpl$init$$inlined$map$2(new DonutSubscriptionManagerImpl$init$$inlined$map$1(this.d, this));
        rsr.s(new ksr<s3q0>() { // from class: com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ DonutSubscriptionManagerImpl c;

                @b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$3$2", f = "DonutSubscriptionManagerImpl.kt", l = {51, 50}, m = "emit")
                /* renamed from: com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl$init$$inlined$map$3$2$1, reason: invalid class name */
                /* loaded from: classes18.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    int I$2;
                    int I$3;
                    Object L$0;
                    Object L$1;
                    Object L$10;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    Object L$7;
                    Object L$8;
                    Object L$9;
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

                public AnonymousClass2(lsr lsrVar, DonutSubscriptionManagerImpl donutSubscriptionManagerImpl) {
                    this.b = lsrVar;
                    this.c = donutSubscriptionManagerImpl;
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
                
                    if (r8.emit(r11, r0) == r1) goto L24;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Iterator<T> it;
                    lsr lsrVar;
                    int i2;
                    int i3;
                    int i4;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i5 = anonymousClass1.label;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i5 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.a.a(obj2);
                                it = ((List) obj).iterator();
                                lsrVar = this.b;
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.a.a(obj2);
                                    return s3q0.a;
                                }
                                i2 = anonymousClass1.I$2;
                                i3 = anonymousClass1.I$1;
                                i4 = anonymousClass1.I$0;
                                it = (Iterator) anonymousClass1.L$8;
                                lsrVar = (lsr) anonymousClass1.L$4;
                                kotlin.a.a(obj2);
                            }
                            while (true) {
                                if (it.hasNext()) {
                                    s3q0 s3q0Var = s3q0.a;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.L$6 = null;
                                    anonymousClass1.L$7 = null;
                                    anonymousClass1.L$8 = null;
                                    anonymousClass1.L$9 = null;
                                    anonymousClass1.L$10 = null;
                                    anonymousClass1.I$0 = i4;
                                    anonymousClass1.label = 2;
                                } else {
                                    UserId b = ((CachedSubscription) it.next()).b();
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = lsrVar;
                                    anonymousClass1.L$5 = null;
                                    anonymousClass1.L$6 = null;
                                    anonymousClass1.L$7 = null;
                                    anonymousClass1.L$8 = it;
                                    anonymousClass1.L$9 = null;
                                    anonymousClass1.L$10 = null;
                                    anonymousClass1.I$0 = i4;
                                    anonymousClass1.I$1 = i3;
                                    anonymousClass1.I$2 = i2;
                                    anonymousClass1.I$3 = 0;
                                    anonymousClass1.label = 1;
                                    if (DonutSubscriptionManagerImpl.a(this.c, b, anonymousClass1) == coroutineSingletons) {
                                        break;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    return coroutineSingletons2;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super s3q0> lsrVar, spj spjVar) {
                Object collect = DonutSubscriptionManagerImpl$init$$inlined$map$2.this.collect(new AnonymousClass2(lsrVar, this), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, this.c);
    }
}

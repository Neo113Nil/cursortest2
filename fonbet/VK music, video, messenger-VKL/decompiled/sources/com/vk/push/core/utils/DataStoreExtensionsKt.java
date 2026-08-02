package com.vk.push.core.utils;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fvk;
import xsna.ksr;
import xsna.lsr;
import xsna.nh50;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.uyc0;
import xsna.wzs;
import xsna.xyc0;

/* compiled from: DataStoreExtensions.kt */
/* loaded from: classes5.dex */
public final class DataStoreExtensionsKt {

    /* compiled from: DataStoreExtensions.kt */
    @b6l(c = "com.vk.push.core.utils.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", l = {14}, m = "getValue")
    public static final class a<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataStoreExtensionsKt.getValue(null, null, null, this);
        }
    }

    /* compiled from: DataStoreExtensions.kt */
    @b6l(c = "com.vk.push.core.utils.DataStoreExtensionsKt$setValue$2", f = "DataStoreExtensions.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<nh50, spj<? super s3q0>, Object> {
        final /* synthetic */ uyc0.a<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t, uyc0.a<T> aVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$value = t;
            this.$key = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$value, this.$key, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(nh50 nh50Var, spj<? super s3q0> spjVar) {
            return ((b) create(nh50Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            nh50 nh50Var = (nh50) this.L$0;
            Object obj2 = this.$value;
            if (obj2 != null) {
                nh50Var.d(this.$key, obj2);
            } else {
                Object obj3 = this.$key;
                nh50Var.c();
                nh50Var.a.remove(obj3);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object getValue(fvk<uyc0> fvkVar, uyc0.a<T> aVar, T t, spj<? super T> spjVar) {
        a aVar2;
        int i;
        if (spjVar instanceof a) {
            aVar2 = (a) spjVar;
            int i2 = aVar2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar2.L$0 = t;
                    aVar2.label = 1;
                    obj = getValue(fvkVar, aVar, aVar2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) aVar2.L$0;
                    kotlin.a.a(obj);
                }
                return obj != null ? t : obj;
            }
        }
        aVar2 = new a(spjVar);
        Object obj2 = aVar2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar2.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
    }

    public static final <T> ksr<T> getValueFlow(fvk<uyc0> fvkVar, final uyc0.a<T> aVar) {
        final ksr<uyc0> data = fvkVar.getData();
        return new ksr<T>() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ uyc0.a c;

                /* compiled from: Emitters.kt */
                @b6l(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValueFlow$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar, uyc0.a aVar) {
                    this.b = lsrVar;
                    this.c = aVar;
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
                                Object b = ((uyc0) obj).b(this.c);
                                anonymousClass1.label = 1;
                                if (this.b.emit(b, anonymousClass1) == coroutineSingletons) {
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
            public Object collect(lsr lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, aVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object setValue(fvk<uyc0> fvkVar, uyc0.a<T> aVar, T t, spj<? super s3q0> spjVar) {
        Object a2 = fvkVar.a(new xyc0(new b(t, aVar, null), null), spjVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    public static final <T> Object getValue(fvk<uyc0> fvkVar, final uyc0.a<T> aVar, spj<? super T> spjVar) {
        final ksr<uyc0> data = fvkVar.getData();
        return rsr.p(new ksr<T>() { // from class: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ uyc0.a c;

                /* compiled from: Emitters.kt */
                @b6l(c = "com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2", f = "DataStoreExtensions.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.vk.push.core.utils.DataStoreExtensionsKt$getValue$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(lsr lsrVar, uyc0.a aVar) {
                    this.b = lsrVar;
                    this.c = aVar;
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
                                Object b = ((uyc0) obj).b(this.c);
                                anonymousClass1.label = 1;
                                if (this.b.emit(b, anonymousClass1) == coroutineSingletons) {
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
            public Object collect(lsr lsrVar, spj spjVar2) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, aVar), spjVar2);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, spjVar);
    }
}

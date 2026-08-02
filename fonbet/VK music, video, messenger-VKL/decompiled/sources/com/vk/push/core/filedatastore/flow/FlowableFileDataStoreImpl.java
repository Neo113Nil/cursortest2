package com.vk.push.core.filedatastore.flow;

import com.vk.push.core.filedatastore.FileDataStore;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.bpn0;
import xsna.caj0;
import xsna.gzs;
import xsna.izs;
import xsna.ksr;
import xsna.lsr;
import xsna.lyd;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.xxm0;
import xsna.yvj;

/* compiled from: FlowableFileDataStoreImpl.kt */
/* loaded from: classes.dex */
public final class FlowableFileDataStoreImpl<T> implements FlowableFileDataStore<T>, FileDataStore<T> {
    public final FileDataStore<T> a;
    public final bpn0 b;

    /* compiled from: FlowableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl", f = "FlowableFileDataStoreImpl.kt", l = {36, 37}, m = "clear")
    /* loaded from: classes5.dex */
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = flowableFileDataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.clear(this);
        }
    }

    /* compiled from: FlowableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl", f = "FlowableFileDataStoreImpl.kt", l = {30, 31, 31}, m = "edit")
    /* loaded from: classes5.dex */
    public static final class b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl, spj<? super b> spjVar) {
            super(spjVar);
            this.this$0 = flowableFileDataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.edit(null, this);
        }
    }

    /* compiled from: FlowableFileDataStoreImpl.kt */
    public static final class c extends Lambda implements gzs<sh50<T>> {
        final /* synthetic */ yvj $scope;
        final /* synthetic */ FlowableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yvj yvjVar, FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl) {
            super(0);
            this.$scope = yvjVar;
            this.this$0 = flowableFileDataStoreImpl;
        }

        @Override // xsna.gzs
        public final Object invoke() {
            caj0 b = lyd.b(1, 0, null, 6);
            yvj yvjVar = this.$scope;
            FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl = this.this$0;
            final xxm0 g = b.g();
            rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.l(new ksr<Boolean>() { // from class: com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    /* compiled from: Emitters.kt */
                    @b6l(c = "com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1$2", f = "FlowableFileDataStoreImpl.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    /* renamed from: com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$invoke$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(lsr lsrVar) {
                        this.b = lsrVar;
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
                                    kotlin.a.a(obj2);
                                    Boolean valueOf = Boolean.valueOf(((Number) obj).intValue() != 0);
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(valueOf, anonymousClass1) == coroutineSingletons) {
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
                public Object collect(lsr<? super Boolean> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            }), new com.vk.push.core.filedatastore.flow.a(b, flowableFileDataStoreImpl, null)), yvjVar);
            return b;
        }
    }

    /* compiled from: FlowableFileDataStoreImpl.kt */
    @b6l(c = "com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl", f = "FlowableFileDataStoreImpl.kt", l = {42, 43}, m = "write")
    /* loaded from: classes5.dex */
    public static final class d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FlowableFileDataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl, spj<? super d> spjVar) {
            super(spjVar);
            this.this$0 = flowableFileDataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.write(null, this);
        }
    }

    public FlowableFileDataStoreImpl(FileDataStore<T> fileDataStore, yvj yvjVar) {
        this.a = fileDataStore;
        this.b = new bpn0(new c(yvjVar, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clear(spj<? super Boolean> spjVar) {
        a aVar;
        int i;
        FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar.L$0 = this;
                    aVar.label = 1;
                    obj = this.a.clear(aVar);
                    if (obj != coroutineSingletons) {
                        flowableFileDataStoreImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = aVar.L$0;
                    kotlin.a.a(obj);
                    return obj2;
                }
                flowableFileDataStoreImpl = (FlowableFileDataStoreImpl) aVar.L$0;
                kotlin.a.a(obj);
                ((Boolean) obj).getClass();
                sh50 sh50Var = (sh50) flowableFileDataStoreImpl.b.getValue();
                aVar.L$0 = obj;
                aVar.label = 2;
                return sh50Var.emit(null, aVar) != coroutineSingletons ? coroutineSingletons : obj;
            }
        }
        aVar = new a(this, spjVar);
        Object obj3 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        ((Boolean) obj3).getClass();
        sh50 sh50Var2 = (sh50) flowableFileDataStoreImpl.b.getValue();
        aVar.L$0 = obj3;
        aVar.label = 2;
        if (sh50Var2.emit(null, aVar) != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object edit(izs<? super T, ? extends T> izsVar, spj<? super Boolean> spjVar) {
        b bVar;
        Object obj;
        int i;
        FlowableFileDataStoreImpl flowableFileDataStoreImpl;
        Object read;
        sh50 sh50Var;
        Object obj2;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj3 = bVar.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj3 = this.a.edit(izsVar, bVar);
                    if (obj3 != obj) {
                        flowableFileDataStoreImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj4 = bVar.L$0;
                        kotlin.a.a(obj3);
                        return obj4;
                    }
                    sh50 sh50Var2 = (sh50) bVar.L$1;
                    obj2 = bVar.L$0;
                    kotlin.a.a(obj3);
                    sh50Var = sh50Var2;
                    bVar.L$0 = obj2;
                    bVar.L$1 = null;
                    bVar.label = 3;
                    return sh50Var.emit(obj3, bVar) != obj ? obj : obj2;
                }
                flowableFileDataStoreImpl = (FlowableFileDataStoreImpl) bVar.L$0;
                kotlin.a.a(obj3);
                ((Boolean) obj3).getClass();
                sh50 sh50Var3 = (sh50) flowableFileDataStoreImpl.b.getValue();
                bVar.L$0 = obj3;
                bVar.L$1 = sh50Var3;
                bVar.label = 2;
                read = flowableFileDataStoreImpl.read(bVar);
                if (read != obj) {
                    Object obj5 = obj3;
                    obj3 = read;
                    sh50Var = sh50Var3;
                    obj2 = obj5;
                    bVar.L$0 = obj2;
                    bVar.L$1 = null;
                    bVar.label = 3;
                    if (sh50Var.emit(obj3, bVar) != obj) {
                    }
                }
            }
        }
        bVar = new b(this, spjVar);
        Object obj32 = bVar.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        ((Boolean) obj32).getClass();
        sh50 sh50Var32 = (sh50) flowableFileDataStoreImpl.b.getValue();
        bVar.L$0 = obj32;
        bVar.L$1 = sh50Var32;
        bVar.label = 2;
        read = flowableFileDataStoreImpl.read(bVar);
        if (read != obj) {
        }
    }

    @Override // com.vk.push.core.filedatastore.flow.FlowableFileDataStore
    public ksr<T> flow() {
        return rsr.l((sh50) this.b.getValue());
    }

    @Override // com.vk.push.core.filedatastore.FileDataStore
    public Object read(spj<? super T> spjVar) {
        return this.a.read(spjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.vk.push.core.filedatastore.FileDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object write(T t, spj<? super Boolean> spjVar) {
        d dVar;
        int i;
        FlowableFileDataStoreImpl<T> flowableFileDataStoreImpl;
        if (spjVar instanceof d) {
            dVar = (d) spjVar;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    dVar.L$0 = this;
                    dVar.L$1 = t;
                    dVar.label = 1;
                    obj = this.a.write(t, dVar);
                    if (obj != coroutineSingletons) {
                        flowableFileDataStoreImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = dVar.L$0;
                    kotlin.a.a(obj);
                    return obj2;
                }
                t = (T) dVar.L$1;
                flowableFileDataStoreImpl = (FlowableFileDataStoreImpl) dVar.L$0;
                kotlin.a.a(obj);
                ((Boolean) obj).getClass();
                sh50 sh50Var = (sh50) flowableFileDataStoreImpl.b.getValue();
                dVar.L$0 = obj;
                dVar.L$1 = null;
                dVar.label = 2;
                return sh50Var.emit(t, dVar) != coroutineSingletons ? coroutineSingletons : obj;
            }
        }
        dVar = new d(this, spjVar);
        Object obj3 = dVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.label;
        if (i != 0) {
        }
        ((Boolean) obj3).getClass();
        sh50 sh50Var2 = (sh50) flowableFileDataStoreImpl.b.getValue();
        dVar.L$0 = obj3;
        dVar.L$1 = null;
        dVar.label = 2;
        if (sh50Var2.emit(t, dVar) != coroutineSingletons2) {
        }
    }
}

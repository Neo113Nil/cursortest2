package com.vk.ecomm.storefrontservices.impl.presentation.ui;

import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.epx;
import xsna.fh9;
import xsna.ksr;
import xsna.lnl0;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xvy;
import xsna.yvj;

/* compiled from: StorefrontServicesContent.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt$StorefrontServicesContent$1$1", f = "StorefrontServicesContent.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class StorefrontServicesContentKt$StorefrontServicesContent$1$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr<lnl0.b> $effects;
    final /* synthetic */ xvy $lazyColumnState;
    int label;

    /* compiled from: StorefrontServicesContent.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ xvy b;

        public a(xvy xvyVar) {
            this.b = xvyVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            if (!epx.f((lnl0.b.a) obj, lnl0.b.a.C3279a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            fh9 fh9Var = xvy.y;
            Object k = this.b.k(0, 0, spjVar);
            return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StorefrontServicesContentKt$StorefrontServicesContent$1$1(ksr<? extends lnl0.b> ksrVar, xvy xvyVar, spj<? super StorefrontServicesContentKt$StorefrontServicesContent$1$1> spjVar) {
        super(2, spjVar);
        this.$effects = ksrVar;
        this.$lazyColumnState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new StorefrontServicesContentKt$StorefrontServicesContent$1$1(this.$effects, this.$lazyColumnState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((StorefrontServicesContentKt$StorefrontServicesContent$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final ksr<lnl0.b> ksrVar = this.$effects;
            ksr<Object> ksrVar2 = new ksr<Object>() { // from class: com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt$StorefrontServicesContent$1$1$invokeSuspend$$inlined$filterIsInstance$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt$StorefrontServicesContent$1$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt$StorefrontServicesContent$1$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "StorefrontServicesContent.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt$StorefrontServicesContent$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                    a.a(obj2);
                                    if (obj instanceof lnl0.b.a) {
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
                public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            };
            a aVar = new a(this.$lazyColumnState);
            this.label = 1;
            if (ksrVar2.collect(aVar, this) == coroutineSingletons) {
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

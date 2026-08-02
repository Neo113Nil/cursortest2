package com.vk.ecomm.storefrontservices.impl.presentation.ui;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b6l;
import xsna.epx;
import xsna.g0t;
import xsna.gzs;
import xsna.izs;
import xsna.kci;
import xsna.ksr;
import xsna.lsr;
import xsna.nr2;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.tho0;
import xsna.wzs;
import xsna.xzs;
import xsna.yvj;

/* compiled from: StorefrontServicesTopBar.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$Debounce$1$1", f = "StorefrontServicesTopBar.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class StorefrontServicesTopBarKt$Debounce$1$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ izs<String, s3q0> $onAction;
    final /* synthetic */ gzs<tho0> $text;
    int label;

    /* compiled from: StorefrontServicesTopBar.kt */
    public static final /* synthetic */ class a implements lsr, g0t {
        public final /* synthetic */ izs<String, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super String, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.invoke((String) obj);
            s3q0 s3q0Var = s3q0.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return s3q0Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.b, epx.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StorefrontServicesTopBarKt$Debounce$1$1(gzs<tho0> gzsVar, long j, izs<? super String, s3q0> izsVar, spj<? super StorefrontServicesTopBarKt$Debounce$1$1> spjVar) {
        super(2, spjVar);
        this.$text = gzsVar;
        this.$delayMs = j;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new StorefrontServicesTopBarKt$Debounce$1$1(this.$text, this.$delayMs, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((StorefrontServicesTopBarKt$Debounce$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final ksr e = kci.e(nr2.M(this.$text), this.$delayMs);
            ksr l = rsr.l(new ksr<String>() { // from class: com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$Debounce$1$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$Debounce$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$Debounce$1$1$invokeSuspend$$inlined$map$1$2", f = "StorefrontServicesTopBar.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesTopBarKt$Debounce$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    String str = ((tho0) obj).a.c;
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(str, anonymousClass1) == coroutineSingletons) {
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
                public final Object collect(lsr<? super String> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            a aVar = new a(this.$onAction);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
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

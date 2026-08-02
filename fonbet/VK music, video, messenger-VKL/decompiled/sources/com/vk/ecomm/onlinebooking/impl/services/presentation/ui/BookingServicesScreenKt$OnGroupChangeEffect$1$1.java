package com.vk.ecomm.onlinebooking.impl.services.presentation.ui;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ac;
import xsna.b6l;
import xsna.izg0;
import xsna.izs;
import xsna.ksr;
import xsna.lsr;
import xsna.nr2;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.xvy;
import xsna.yvj;

/* compiled from: BookingServicesScreen.kt */
@b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$OnGroupChangeEffect$1$1", f = "BookingServicesScreen.kt", l = {498}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class BookingServicesScreenKt$OnGroupChangeEffect$1$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $currentGroupEndIndex;
    final /* synthetic */ int $currentGroupStartIndex;
    final /* synthetic */ xvy $listState;
    final /* synthetic */ izs<Integer, s3q0> $onGroupChanged;
    int label;

    /* compiled from: BookingServicesScreen.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ izs<Integer, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super Integer, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.invoke(new Integer(((Number) obj).intValue()));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BookingServicesScreenKt$OnGroupChangeEffect$1$1(xvy xvyVar, int i, int i2, izs<? super Integer, s3q0> izsVar, spj<? super BookingServicesScreenKt$OnGroupChangeEffect$1$1> spjVar) {
        super(2, spjVar);
        this.$listState = xvyVar;
        this.$currentGroupStartIndex = i;
        this.$currentGroupEndIndex = i2;
        this.$onGroupChanged = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new BookingServicesScreenKt$OnGroupChangeEffect$1$1(this.$listState, this.$currentGroupStartIndex, this.$currentGroupEndIndex, this.$onGroupChanged, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((BookingServicesScreenKt$OnGroupChangeEffect$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final izg0 M = nr2.M(new ac(this.$listState, 10));
            final int i2 = this.$currentGroupStartIndex;
            final int i3 = this.$currentGroupEndIndex;
            ksr l = rsr.l(new ksr<Integer>() { // from class: com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$OnGroupChangeEffect$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$OnGroupChangeEffect$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ int d;

                    @b6l(c = "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$OnGroupChangeEffect$1$1$invokeSuspend$$inlined$filter$1$2", f = "BookingServicesScreen.kt", l = {50}, m = "emit")
                    /* renamed from: com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt$OnGroupChangeEffect$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(lsr lsrVar, int i, int i2) {
                        this.b = lsrVar;
                        this.c = i;
                        this.d = i2;
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
                                    int intValue = ((Number) obj).intValue();
                                    if (this.c > intValue || intValue > this.d) {
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
                public final Object collect(lsr<? super Integer> lsrVar, spj spjVar) {
                    Object collect = izg0.this.collect(new AnonymousClass2(lsrVar, i2, i3), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            a aVar = new a(this.$onGroupChanged);
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

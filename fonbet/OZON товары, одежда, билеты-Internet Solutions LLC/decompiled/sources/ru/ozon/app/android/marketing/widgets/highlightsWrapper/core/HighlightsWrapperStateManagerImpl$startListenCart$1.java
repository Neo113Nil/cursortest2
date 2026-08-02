package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import nc.InterfaceC8487b;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1", f = "HighlightsWrapperStateManagerImpl.kt", l = {57, 70}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HighlightsWrapperStateManagerImpl$startListenCart$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $widgetAsyncData;
    int label;
    final /* synthetic */ HighlightsWrapperStateManagerImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActive", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1$2", f = "HighlightsWrapperStateManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        final /* synthetic */ String $widgetAsyncData;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ HighlightsWrapperStateManagerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl, String str, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = highlightsWrapperStateManagerImpl;
            this.$widgetAsyncData = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$widgetAsyncData, dVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            r2 = r1.this$0.disposable;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            w0 w0Var;
            InterfaceC8487b interfaceC8487b;
            InterfaceC8487b interfaceC8487b2;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (this.Z$0) {
                interfaceC8487b = this.this$0.disposable;
                if (interfaceC8487b == null || (interfaceC8487b2 != null && interfaceC8487b2.isDisposed())) {
                    this.this$0.observeCart(this.$widgetAsyncData);
                    return Unit.f71690a;
                }
            }
            HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl = this.this$0;
            w0Var = highlightsWrapperStateManagerImpl.widgetsState;
            highlightsWrapperStateManagerImpl.previousSubscribers = w0Var.getSubscriptionCount().getValue().intValue();
            this.this$0.clearScope();
            this.this$0.disposeCart();
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsWrapperStateManagerImpl$startListenCart$1(HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl, String str, d<? super HighlightsWrapperStateManagerImpl$startListenCart$1> dVar) {
        super(2, dVar);
        this.this$0 = highlightsWrapperStateManagerImpl;
        this.$widgetAsyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HighlightsWrapperStateManagerImpl$startListenCart$1(this.this$0, this.$widgetAsyncData, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (Ae.C2399j.g(r3, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (xe.l1.a(r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        w0Var = this.this$0.widgetsState;
        final M0<Integer> subscriptionCount = w0Var.getSubscriptionCount();
        C2408n0 c2408n0 = new C2408n0(C2399j.o(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1$invokeSuspend$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1$invokeSuspend$$inlined$map$1$2", f = "HighlightsWrapperStateManagerImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManagerImpl$startListenCart$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Boolean valueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(valueOf, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), new AnonymousClass2(this.this$0, this.$widgetAsyncData, null));
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HighlightsWrapperStateManagerImpl$startListenCart$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

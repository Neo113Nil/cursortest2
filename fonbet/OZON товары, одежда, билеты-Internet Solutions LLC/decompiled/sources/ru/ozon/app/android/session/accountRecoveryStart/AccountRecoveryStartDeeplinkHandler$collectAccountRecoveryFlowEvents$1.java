package ru.ozon.app.android.session.accountRecoveryStart;

import Ae.B0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import GZ.g;
import Ib0.a;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1", f = "AccountRecoveryStartDeeplinkHandler.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountRecoveryStartDeeplinkHandler this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIb0/a;", "it", "", "<anonymous>", "(LIb0/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1$1", f = "AccountRecoveryStartDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<a, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccountRecoveryStartDeeplinkHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AccountRecoveryStartDeeplinkHandler accountRecoveryStartDeeplinkHandler, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = accountRecoveryStartDeeplinkHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a aVar2 = (a) this.L$0;
            gVar = this.this$0.ozonRouter;
            g.a.a(gVar, aVar2.a(), null, null, 6);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1(AccountRecoveryStartDeeplinkHandler accountRecoveryStartDeeplinkHandler, d<? super AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = accountRecoveryStartDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ob0.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.ozonIdAppApi;
            final B0<Object> b11 = aVar.n().b();
            InterfaceC2395h<Object> interfaceC2395h = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1$invokeSuspend$$inlined$filterIsInstance$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "AccountRecoveryStartDeeplinkHandler.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (obj instanceof a) {
                                        anonymousClass1.label = 1;
                                        if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                            return aVar;
                                        }
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
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C2399j.h(interfaceC2395h, anonymousClass1, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

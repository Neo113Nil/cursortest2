package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsWidgetUiEffect;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$observeItems$2", f = "RateItemsV2WidgetHolder.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RateItemsV2WidgetHolder$observeItems$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RateItemsV2WidgetHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$observeItems$2$1", f = "RateItemsV2WidgetHolder.kt", l = {160}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$observeItems$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ RateItemsV2WidgetHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RateItemsV2WidgetHolder rateItemsV2WidgetHolder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = rateItemsV2WidgetHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            RateItemsV2ViewModel rateItemsV2ViewModel;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                rateItemsV2ViewModel = this.this$0.viewModel;
                InterfaceC2395h<RateItemsWidgetUiEffect> effects = rateItemsV2ViewModel.getEffects();
                final RateItemsV2WidgetHolder rateItemsV2WidgetHolder = this.this$0;
                InterfaceC2397i<? super RateItemsWidgetUiEffect> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder.observeItems.2.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((RateItemsWidgetUiEffect) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(RateItemsWidgetUiEffect rateItemsWidgetUiEffect, d<? super Unit> dVar) {
                        RateItemsV2View rateItemsV2View;
                        if (rateItemsWidgetUiEffect instanceof RateItemsWidgetUiEffect.ShowNotification) {
                            RateItemsWidgetUiEffect.ShowNotification showNotification = (RateItemsWidgetUiEffect.ShowNotification) rateItemsWidgetUiEffect;
                            RateItemsV2WidgetHolder.this.showNotificationWithVibration(showNotification.getNotification(), showNotification.getHapticToken());
                        } else if (rateItemsWidgetUiEffect instanceof RateItemsWidgetUiEffect.Vibrate) {
                            RateItemsV2WidgetHolder.this.runVibration(((RateItemsWidgetUiEffect.Vibrate) rateItemsWidgetUiEffect).getHapticToken());
                        } else {
                            if (!Intrinsics.d(rateItemsWidgetUiEffect, RateItemsWidgetUiEffect.AnimateIgnoreItem.INSTANCE)) {
                                throw new o();
                            }
                            rateItemsV2View = RateItemsV2WidgetHolder.this.rateItemsV2View;
                            if (rateItemsV2View != null) {
                                rateItemsV2View.animateIgnoreItem();
                            }
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (effects.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2WidgetHolder$observeItems$2(RateItemsV2WidgetHolder rateItemsV2WidgetHolder, d<? super RateItemsV2WidgetHolder$observeItems$2> dVar) {
        super(2, dVar);
        this.this$0 = rateItemsV2WidgetHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RateItemsV2WidgetHolder$observeItems$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            RateItemsV2WidgetHolder rateItemsV2WidgetHolder = this.this$0;
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(rateItemsV2WidgetHolder, null);
            this.label = 1;
            if (C5412d0.b(rateItemsV2WidgetHolder, bVar, anonymousClass1, this) == aVar) {
                return aVar;
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
        return ((RateItemsV2WidgetHolder$observeItems$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

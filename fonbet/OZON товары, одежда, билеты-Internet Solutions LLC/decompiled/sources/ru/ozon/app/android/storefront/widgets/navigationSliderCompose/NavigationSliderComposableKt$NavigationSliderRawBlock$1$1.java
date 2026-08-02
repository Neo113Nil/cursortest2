package ru.ozon.app.android.storefront.widgets.navigationSliderCompose;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposableKt$NavigationSliderRawBlock$1$1", f = "NavigationSliderComposable.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NavigationSliderComposableKt$NavigationSliderRawBlock$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ NavigationSliderV2VO.NavigationItemV2 $item;
    final /* synthetic */ InterfaceC3978p0<Boolean> $shouldBlur$delegate;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "isUserAnAdult", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposableKt$NavigationSliderRawBlock$1$1$1", f = "NavigationSliderComposable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposableKt$NavigationSliderRawBlock$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        final /* synthetic */ NavigationSliderV2VO.NavigationItemV2 $item;
        final /* synthetic */ InterfaceC3978p0<Boolean> $shouldBlur$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavigationSliderV2VO.NavigationItemV2 navigationItemV2, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$item = navigationItemV2;
            this.$shouldBlur$delegate = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.$shouldBlur$delegate, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(bool, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            NavigationSliderComposableKt.NavigationSliderRawBlock_cf5BqRc$lambda$7(this.$shouldBlur$delegate, !((Boolean) this.L$0).booleanValue() && this.$item.getIsAdult());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderComposableKt$NavigationSliderRawBlock$1$1(AdultHandler adultHandler, NavigationSliderV2VO.NavigationItemV2 navigationItemV2, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super NavigationSliderComposableKt$NavigationSliderRawBlock$1$1> dVar) {
        super(2, dVar);
        this.$adultHandler = adultHandler;
        this.$item = navigationItemV2;
        this.$shouldBlur$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NavigationSliderComposableKt$NavigationSliderRawBlock$1$1(this.$adultHandler, this.$item, this.$shouldBlur$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C2408n0 c2408n0 = new C2408n0(n.a(this.$adultHandler.observeUserAdultState()), new AnonymousClass1(this.$item, this.$shouldBlur$delegate, null));
            this.label = 1;
            if (C2399j.g(c2408n0, this) == aVar) {
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
        return ((NavigationSliderComposableKt$NavigationSliderRawBlock$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

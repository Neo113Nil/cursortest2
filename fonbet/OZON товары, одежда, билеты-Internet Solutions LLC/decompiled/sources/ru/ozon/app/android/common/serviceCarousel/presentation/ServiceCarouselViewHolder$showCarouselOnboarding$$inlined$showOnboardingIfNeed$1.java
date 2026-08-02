package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.serviceCarousel.databinding.WidgetServiceCarouselBinding;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "pageTag", "", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
public final class ServiceCarouselViewHolder$showCarouselOnboarding$$inlined$showOnboardingIfNeed$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ Integer $onboardingItemIndex$inlined;
    final /* synthetic */ ServiceCarouselViewHolder this$0;
    final /* synthetic */ ServiceCarouselViewHolder this$0$inline_fun;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showCarouselOnboarding$$inlined$showOnboardingIfNeed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Integer $onboardingItemIndex$inlined;
        final /* synthetic */ ServiceCarouselViewHolder this$0;
        final /* synthetic */ ServiceCarouselViewHolder this$0$inline_fun;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showCarouselOnboarding$$inlined$showOnboardingIfNeed$1$1$1", f = "ServiceCarouselViewHolder.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showCarouselOnboarding$$inlined$showOnboardingIfNeed$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C17551 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ Integer $onboardingItemIndex$inlined;
            int label;
            final /* synthetic */ ServiceCarouselViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17551(d dVar, Integer num, ServiceCarouselViewHolder serviceCarouselViewHolder) {
                super(2, dVar);
                this.$onboardingItemIndex$inlined = num;
                this.this$0 = serviceCarouselViewHolder;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C17551(dVar, this.$onboardingItemIndex$inlined, this.this$0);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                final int intValue;
                ServiceCarouselVO boundedData;
                final OnBoardingDTO onBoardingItemDTO;
                WidgetServiceCarouselBinding widgetServiceCarouselBinding;
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Integer num = this.$onboardingItemIndex$inlined;
                if (num != null && (intValue = num.intValue()) >= 0 && (boundedData = this.this$0.getBoundedData()) != null && (onBoardingItemDTO = boundedData.getOnBoardingItemDTO()) != null) {
                    widgetServiceCarouselBinding = this.this$0.binding;
                    RecyclerView rvItems = widgetServiceCarouselBinding.rvItems;
                    Intrinsics.checkNotNullExpressionValue(rvItems, "rvItems");
                    if (!rvItems.isLaidOut() || rvItems.isLayoutRequested()) {
                        final ServiceCarouselViewHolder serviceCarouselViewHolder = this.this$0;
                        rvItems.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showCarouselOnboarding$lambda$6$lambda$5$$inlined$doOnLayout$1
                            @Override // android.view.View.OnLayoutChangeListener
                            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                                view.removeOnLayoutChangeListener(this);
                                C10727i.c(ServiceCarouselViewHolder.this.showOnboardingScope, null, null, new ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1(ServiceCarouselViewHolder.this, onBoardingItemDTO, intValue, null), 3);
                            }
                        });
                    } else {
                        C10727i.c(this.this$0.showOnboardingScope, null, null, new ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1(this.this$0, onBoardingItemDTO, intValue, null), 3);
                    }
                }
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C17551) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ServiceCarouselViewHolder serviceCarouselViewHolder, Integer num, ServiceCarouselViewHolder serviceCarouselViewHolder2) {
            super(0);
            this.this$0$inline_fun = serviceCarouselViewHolder;
            this.$onboardingItemIndex$inlined = num;
            this.this$0 = serviceCarouselViewHolder2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C10727i.c(this.this$0$inline_fun.showOnboardingScope, null, null, new C17551(null, this.$onboardingItemIndex$inlined, this.this$0), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCarouselViewHolder$showCarouselOnboarding$$inlined$showOnboardingIfNeed$1(ServiceCarouselViewHolder serviceCarouselViewHolder, Integer num, ServiceCarouselViewHolder serviceCarouselViewHolder2) {
        super(1);
        this.this$0$inline_fun = serviceCarouselViewHolder;
        this.$onboardingItemIndex$inlined = num;
        this.this$0 = serviceCarouselViewHolder2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String pageTag) {
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        baseOnBoardingViewModel = this.this$0$inline_fun.onBoardingViewModel;
        baseOnBoardingViewModel.showIfNeed(pageTag, "service_carousel_item_onboarding_key", new AnonymousClass1(this.this$0$inline_fun, this.$onboardingItemIndex$inlined, this.this$0));
    }
}

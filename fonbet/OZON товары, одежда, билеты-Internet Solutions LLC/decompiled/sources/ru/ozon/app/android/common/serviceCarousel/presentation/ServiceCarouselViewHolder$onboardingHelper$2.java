package ru.ozon.app.android.common.serviceCarousel.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.OnboardingHelperDelegate;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/serviceCarousel/presentation/onboarding/OnboardingHelperDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ServiceCarouselViewHolder$onboardingHelper$2 extends AbstractC7737t implements Function0<OnboardingHelperDelegate> {
    final /* synthetic */ ServiceCarouselViewHolder this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$onboardingHelper$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Integer, Unit> {
        final /* synthetic */ ServiceCarouselViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ServiceCarouselViewHolder serviceCarouselViewHolder) {
            super(1);
            this.this$0 = serviceCarouselViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            this.this$0.showCarouselOnboarding(num);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewHolder$onboardingHelper$2(ServiceCarouselViewHolder serviceCarouselViewHolder) {
        super(0);
        this.this$0 = serviceCarouselViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OnboardingHelperDelegate invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.references;
        return new OnboardingHelperDelegate(composerReferences, this.this$0.showOnboardingScope, new AnonymousClass1(this.this$0));
    }
}

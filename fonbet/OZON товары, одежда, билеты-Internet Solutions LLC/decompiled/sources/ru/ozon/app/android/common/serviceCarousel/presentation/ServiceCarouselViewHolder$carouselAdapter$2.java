package ru.ozon.app.android.common.serviceCarousel.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.C7740w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.j;
import l20.d;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ServiceCarouselViewHolder$carouselAdapter$2 extends AbstractC7737t implements Function0<ServiceCarouselAdapter> {
    final /* synthetic */ boolean $isPreCreateWidgetsCategoryMainPageFresh;
    final /* synthetic */ ServiceCarouselViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$carouselAdapter$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<d> {
        AnonymousClass1(Object obj) {
            super(0, obj, j.class, "get", "get()Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return (d) ((j) this.receiver).get();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$carouselAdapter$2$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<Map<String, ? extends String>, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, ServiceCarouselViewHolder.class, "trackClick", "trackClick(Ljava/util/Map;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((ServiceCarouselViewHolder) this.receiver).trackClick(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewHolder$carouselAdapter$2(ServiceCarouselViewHolder serviceCarouselViewHolder, boolean z11) {
        super(0);
        this.this$0 = serviceCarouselViewHolder;
        this.$isPreCreateWidgetsCategoryMainPageFresh = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ServiceCarouselAdapter invoke() {
        Function1 actionHandler;
        ComposerReferences composerReferences;
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        SharedCarouselViewModel sharedCarouselViewModel;
        actionHandler = this.this$0.getActionHandler();
        composerReferences = this.this$0.references;
        baseOnBoardingViewModel = this.this$0.onBoardingViewModel;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(new C7740w(this.this$0) { // from class: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$carouselAdapter$2.2
            @Override // kotlin.reflect.n
            public Object get() {
                d dVar;
                dVar = ((ServiceCarouselViewHolder) this.receiver).widgetInfo;
                return dVar;
            }

            @Override // kotlin.reflect.j
            public void set(Object obj) {
                ((ServiceCarouselViewHolder) this.receiver).widgetInfo = (d) obj;
            }
        });
        ServiceCarouselDiffUtil serviceCarouselDiffUtil = new ServiceCarouselDiffUtil();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
        sharedCarouselViewModel = this.this$0.sharedViewModel;
        return new ServiceCarouselAdapter(actionHandler, anonymousClass3, anonymousClass1, composerReferences, baseOnBoardingViewModel, this.this$0, sharedCarouselViewModel.pageIdModifier(), serviceCarouselDiffUtil, this.$isPreCreateWidgetsCategoryMainPageFresh);
    }
}

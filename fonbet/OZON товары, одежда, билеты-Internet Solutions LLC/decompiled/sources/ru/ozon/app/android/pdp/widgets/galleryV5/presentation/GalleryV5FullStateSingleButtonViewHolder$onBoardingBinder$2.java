package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import WZ.l;
import a00.C4908c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5ButtonOnBoardingBinder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/binder/GalleryV5ButtonOnBoardingBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV5FullStateSingleButtonViewHolder$onBoardingBinder$2 extends AbstractC7737t implements Function0<GalleryV5ButtonOnBoardingBinder> {
    final /* synthetic */ GalleryV5FullStateSingleButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5FullStateSingleButtonViewHolder$onBoardingBinder$2(GalleryV5FullStateSingleButtonViewHolder galleryV5FullStateSingleButtonViewHolder) {
        super(0);
        this.this$0 = galleryV5FullStateSingleButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryV5ButtonOnBoardingBinder invoke() {
        l lVar;
        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel;
        ComposerReferences composerReferences;
        GalleryV5FullStateView galleryV5FullStateView;
        GalleryV5PreCreationConfig galleryV5PreCreationConfig;
        lVar = this.this$0.tokenizedAnalytics;
        galleryV5OnboardingViewModel = this.this$0.onboardingViewModel;
        composerReferences = this.this$0.refs;
        C4908c g10 = composerReferences.getContainer().g();
        galleryV5FullStateView = this.this$0.view;
        GalleryV5Resources preCreationGalleryResources = galleryV5FullStateView.getPreCreationGalleryResources();
        galleryV5PreCreationConfig = this.this$0.preCreationConfig;
        return new GalleryV5ButtonOnBoardingBinder(galleryV5OnboardingViewModel, lVar, g10, preCreationGalleryResources, galleryV5PreCreationConfig.getButtonsBg());
    }
}

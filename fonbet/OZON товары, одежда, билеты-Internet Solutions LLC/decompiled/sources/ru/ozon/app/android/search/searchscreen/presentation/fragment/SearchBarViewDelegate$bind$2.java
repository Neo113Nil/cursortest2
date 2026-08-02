package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Bi.k;
import Hi.g;
import WZ.t;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponentKt;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarViewDelegate$bind$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SearchBarViewDelegate this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$bind$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<g, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, SearchByImageViewModel.class, "handleGalleryResult", "handleGalleryResult(Lru/ozon/android/gallery/data/GalleryLaunchResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            invoke2(gVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(g p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((SearchByImageViewModel) this.receiver).handleGalleryResult(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewDelegate$bind$2(SearchBarViewDelegate searchBarViewDelegate) {
        super(0);
        this.this$0 = searchBarViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ActiveSearchBarVO correctedSearchBarVO;
        SearchByImageRouter searchByImageRouter;
        ComposerFragmentController composerFragmentController;
        ComposerFragmentController composerFragmentController2;
        ActiveSearchBarVO correctedSearchBarVO2;
        ComposerFragmentController composerFragmentController3;
        SearchByImageViewModel searchByImageViewModel;
        CommonControlSettings openOnboardingControl;
        AtomActionDTO action;
        t buttonTrackingInfo;
        ComposerFragmentController composerFragmentController4;
        correctedSearchBarVO = this.this$0.getCorrectedSearchBarVO();
        ActiveSearchBarVO.SearchByImageVO searchByImage = correctedSearchBarVO.getSearchByImage();
        String str = null;
        if (searchByImage != null && (buttonTrackingInfo = searchByImage.getButtonTrackingInfo()) != null) {
            composerFragmentController4 = this.this$0.composer;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(composerFragmentController4.getReferences().getTokenizedAnalytics(), buttonTrackingInfo, null, 2, null);
        }
        searchByImageRouter = this.this$0.searchByImageRouter;
        composerFragmentController = this.this$0.composer;
        ComponentCallbacksC5392m j11 = composerFragmentController.getReferences().getContainer().j();
        composerFragmentController2 = this.this$0.composer;
        ComposerNavigator navigator = composerFragmentController2.getReferences().getNavigator();
        correctedSearchBarVO2 = this.this$0.getCorrectedSearchBarVO();
        ActiveSearchBarVO.SearchByImageVO searchByImage2 = correctedSearchBarVO2.getSearchByImage();
        if (searchByImage2 != null && (openOnboardingControl = searchByImage2.getOpenOnboardingControl()) != null && (action = openOnboardingControl.getAction()) != null) {
            str = action.getLink();
        }
        composerFragmentController3 = this.this$0.composer;
        k galleryLauncher = GalleryLauncherComponentKt.getGalleryLauncher(composerFragmentController3.getReferences().getComposerWidgetComponentStorage());
        searchByImageViewModel = this.this$0.searchByImageViewModel;
        searchByImageRouter.startSearchByImage(j11, navigator, str, galleryLauncher, new AnonymousClass2(searchByImageViewModel));
    }
}

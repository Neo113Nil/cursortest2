package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

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
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponentKt;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchBarViewHolder$1$3 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ SearchBarViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$1$3$2, reason: invalid class name */
    /* loaded from: classes13.dex */
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
    SearchBarViewHolder$1$3(SearchBarViewHolder searchBarViewHolder) {
        super(0);
        this.this$0 = searchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SearchByImageRouter searchByImageRouter;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        SearchByImageViewModel searchByImageViewModel;
        SearchBarVO.SearchByImageVO searchByImage;
        CommonControlSettings openOnboardingControl;
        AtomActionDTO action;
        SearchBarVO.SearchByImageVO searchByImage2;
        t buttonTrackingInfo;
        ComposerReferences composerReferences4;
        SearchBarVO boundData = this.this$0.getBoundData();
        String str = null;
        if (boundData != null && (searchByImage2 = boundData.getSearchByImage()) != null && (buttonTrackingInfo = searchByImage2.getButtonTrackingInfo()) != null) {
            composerReferences4 = this.this$0.references;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(composerReferences4.getTokenizedAnalytics(), buttonTrackingInfo, null, 2, null);
        }
        searchByImageRouter = this.this$0.searchByImageRouter;
        composerReferences = this.this$0.references;
        ComponentCallbacksC5392m j11 = composerReferences.getContainer().j();
        composerReferences2 = this.this$0.references;
        ComposerNavigator navigator = composerReferences2.getNavigator();
        SearchBarVO boundData2 = this.this$0.getBoundData();
        if (boundData2 != null && (searchByImage = boundData2.getSearchByImage()) != null && (openOnboardingControl = searchByImage.getOpenOnboardingControl()) != null && (action = openOnboardingControl.getAction()) != null) {
            str = action.getLink();
        }
        composerReferences3 = this.this$0.references;
        k galleryLauncher = GalleryLauncherComponentKt.getGalleryLauncher(composerReferences3.getComposerWidgetComponentStorage());
        searchByImageViewModel = this.this$0.searchByImageViewModel;
        searchByImageRouter.startSearchByImage(j11, navigator, str, galleryLauncher, new AnonymousClass2(searchByImageViewModel));
    }
}

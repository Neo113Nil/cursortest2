package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import WZ.t;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "path", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/net/Uri;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarViewDelegate$observeViewModelAction$3 extends AbstractC7737t implements Function1<Uri, Unit> {
    final /* synthetic */ SearchBarViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewDelegate$observeViewModelAction$3(SearchBarViewDelegate searchBarViewDelegate) {
        super(1);
        this.this$0 = searchBarViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        invoke2(uri);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Uri uri) {
        ActiveSearchBarVO correctedSearchBarVO;
        SearchByImageRouter searchByImageRouter;
        ComposerFragmentController composerFragmentController;
        t loadPhotoTrackingInfo;
        ComposerFragmentController composerFragmentController2;
        correctedSearchBarVO = this.this$0.getCorrectedSearchBarVO();
        ActiveSearchBarVO.SearchByImageVO searchByImage = correctedSearchBarVO.getSearchByImage();
        if (searchByImage != null && (loadPhotoTrackingInfo = searchByImage.getLoadPhotoTrackingInfo()) != null) {
            composerFragmentController2 = this.this$0.composer;
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(composerFragmentController2.getReferences().getTokenizedAnalytics(), loadPhotoTrackingInfo, null, 2, null);
        }
        searchByImageRouter = this.this$0.searchByImageRouter;
        composerFragmentController = this.this$0.composer;
        ComposerNavigator navigator = composerFragmentController.getReferences().getNavigator();
        Intrinsics.f(uri);
        searchByImageRouter.openSearchByImageLoadFragment(navigator, uri);
    }
}

package ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.search.widgets.searchResult.header.data.SearchResultHeaderDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/searchResult/header/data/SearchResultHeaderDTO;Ll20/d;)Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultHeaderMapper implements Function2<SearchResultHeaderDTO, d, List<? extends SearchResultHeaderVO>> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<SearchResultHeaderVO> invoke(@NotNull SearchResultHeaderDTO state, @NotNull d widgetInfo) {
        Uri uri;
        SearchResultHeaderDTO.BreadCrumb breadCrumb;
        String deeplink;
        SearchResultHeaderDTO.BreadCrumb breadCrumb2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<SearchResultHeaderDTO.BreadCrumb> breadCrumbs = state.getBreadCrumbs();
        String text = (breadCrumbs == null || (breadCrumb2 = (SearchResultHeaderDTO.BreadCrumb) C7714v.M(breadCrumbs)) == null) ? null : breadCrumb2.getText();
        List<SearchResultHeaderDTO.BreadCrumb> breadCrumbs2 = state.getBreadCrumbs();
        if (breadCrumbs2 != null && (breadCrumb = (SearchResultHeaderDTO.BreadCrumb) C7714v.M(breadCrumbs2)) != null && (deeplink = breadCrumb.getDeeplink()) != null) {
            if (h.K(deeplink)) {
                deeplink = null;
            }
            if (deeplink != null) {
                uri = Uri.parse(deeplink);
                String header = state.getHeader();
                String totalFound = state.getTotalFound();
                String searchOriginalText = state.getSearchOriginalText();
                String deeplink2 = state.getDeeplink();
                SearchResultHeaderDTO.ShareData shareData = state.getShareData();
                String text2 = shareData == null ? shareData.getText() : null;
                SearchResultHeaderDTO.ShareData shareData2 = state.getShareData();
                String link = shareData2 == null ? shareData2.getLink() : null;
                FavoriteEntity favoriteEntityButton = state.getFavoriteEntityButton();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new SearchResultHeaderVO(hashCode, text, uri, header, totalFound, searchOriginalText, deeplink2, favoriteEntityButton, text2, link, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            }
        }
        uri = null;
        String header2 = state.getHeader();
        String totalFound2 = state.getTotalFound();
        String searchOriginalText2 = state.getSearchOriginalText();
        String deeplink22 = state.getDeeplink();
        SearchResultHeaderDTO.ShareData shareData3 = state.getShareData();
        if (shareData3 == null) {
        }
        SearchResultHeaderDTO.ShareData shareData22 = state.getShareData();
        if (shareData22 == null) {
        }
        FavoriteEntity favoriteEntityButton2 = state.getFavoriteEntityButton();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        return C7714v.a0(new SearchResultHeaderVO(hashCode, text, uri, header2, totalFound2, searchOriginalText2, deeplink22, favoriteEntityButton2, text2, link, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null));
    }
}

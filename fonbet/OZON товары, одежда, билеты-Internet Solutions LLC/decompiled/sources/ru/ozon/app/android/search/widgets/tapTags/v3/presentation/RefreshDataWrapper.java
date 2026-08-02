package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3VO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/RefreshDataWrapper;", "", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "suggestedPage", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "request", "<init>", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;)V", "", "toString", "()Ljava/lang/String;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "getSuggestedPage", "()Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO$SuggestedPage;", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "getRequest", "()Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RefreshDataWrapper {

    @NotNull
    private final TapTagsRequestDTO request;

    @NotNull
    private final TapTagsV3VO.SuggestedPage suggestedPage;

    public RefreshDataWrapper(@NotNull TapTagsV3VO.SuggestedPage suggestedPage, @NotNull TapTagsRequestDTO request) {
        Intrinsics.checkNotNullParameter(suggestedPage, "suggestedPage");
        Intrinsics.checkNotNullParameter(request, "request");
        this.suggestedPage = suggestedPage;
        this.request = request;
    }

    @NotNull
    public final TapTagsV3VO.SuggestedPage getSuggestedPage() {
        return this.suggestedPage;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("suggestedPage=" + this.suggestedPage + ",\n");
        sb2.append("request=" + this.request);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}

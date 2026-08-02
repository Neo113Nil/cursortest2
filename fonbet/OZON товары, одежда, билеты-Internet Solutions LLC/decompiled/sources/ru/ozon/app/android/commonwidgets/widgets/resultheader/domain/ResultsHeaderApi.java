package ru.ozon.app.android.commonwidgets.widgets.resultheader.domain;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.model.ShareListResponseDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ResultsHeaderApi;", "", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ShareListRequest;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ShareListResponseDTO;", "shareList", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/domain/ShareListRequest;)Lio/reactivex/y;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ResultsHeaderApi {
    @POST("composer-api.bx/_action/favoriteShareList")
    @NotNull
    y<ShareListResponseDTO> shareList(@Body @NotNull ShareListRequest request);
}

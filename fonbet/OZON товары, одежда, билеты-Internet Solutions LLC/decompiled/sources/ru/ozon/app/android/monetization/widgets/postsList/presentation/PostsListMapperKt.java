package ru.ozon.app.android.monetization.widgets.postsList.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.widgets.postsList.data.PostsListDTO;
import ru.ozon.app.android.monetization.widgets.postsList.presentation.models.PostAnalyticsVI;
import ru.ozon.app.android.monetization.widgets.postsList.presentation.models.PostItemVI;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00072\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/data/PostsListDTO$PostDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostAnalyticsVI;", "toAnalyticsVI", "(Lru/ozon/app/android/monetization/widgets/postsList/data/PostsListDTO$PostDTO;Ll20/d;)Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostAnalyticsVI;", "", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI;", "toPostItem", "(Ljava/lang/Object;Ll20/d;)Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI;", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PostsListMapperKt {
    @NotNull
    public static final PostAnalyticsVI toAnalyticsVI(@NotNull PostsListDTO.PostDTO postDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(postDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = postDTO.getItems().hashCode() + info.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = postDTO.getTrackingInfo();
        return new PostAnalyticsVI(hashCode, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    public static final PostItemVI toPostItem(@NotNull Object obj, @NotNull d info) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        int hashCode = info.d().hashCode();
        if (obj instanceof TextDTO) {
            return new PostItemVI(r3.hashCode() + hashCode, PostItemVI.Item.TextItem.m835boximpl(PostItemVI.Item.TextItem.m836constructorimpl((TextDTO) obj)));
        }
        if (!(obj instanceof CellDTO)) {
            return null;
        }
        return new PostItemVI(r3.hashCode() + hashCode, PostItemVI.Item.CellItem.m829boximpl(PostItemVI.Item.CellItem.m830constructorimpl((CellDTO) obj)));
    }
}

package ru.ozon.app.android.storefront.widgets.naviGrid3.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid3/data/ItemDTO;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "label", "Lru/ozon/app/android/storefront/widgets/naviGrid3/data/CornerLabelDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/naviGrid3/data/CornerLabelDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getLabel", "()Lru/ozon/app/android/storefront/widgets/naviGrid3/data/CornerLabelDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ItemDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final BadgeDTO adBadge;

    @NotNull
    private final String image;
    private final CornerLabelDTO label;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ItemDTO(@NotNull String image, @NotNull String title, CornerLabelDTO cornerLabelDTO, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.image = image;
        this.title = title;
        this.label = cornerLabelDTO;
        this.action = atomActionDTO;
        this.adBadge = badgeDTO;
        this.trackingInfo = map;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getAdBadge() {
        return this.adBadge;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final CornerLabelDTO getLabel() {
        return this.label;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }
}

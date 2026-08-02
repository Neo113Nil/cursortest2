package ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.data;

import D40.a;
import F3.G;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersFinalRatingV2/data/UsersFinalRatingV2DTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/text/TextDTO;", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "ratingSubtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getRatingSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UsersFinalRatingV2DTO {
    public static final int $stable = 8;
    private final AtomActionDTO clickAction;
    private final IconDTO icon;

    @NotNull
    private final RatingDTO rating;

    @NotNull
    private final TextDTO ratingSubtitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final TextDTO value;

    public UsersFinalRatingV2DTO(@NotNull TextDTO value, @NotNull RatingDTO rating, @NotNull TextDTO ratingSubtitle, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(ratingSubtitle, "ratingSubtitle");
        this.value = value;
        this.rating = rating;
        this.ratingSubtitle = ratingSubtitle;
        this.icon = iconDTO;
        this.clickAction = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ UsersFinalRatingV2DTO copy$default(UsersFinalRatingV2DTO usersFinalRatingV2DTO, TextDTO textDTO, RatingDTO ratingDTO, TextDTO textDTO2, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = usersFinalRatingV2DTO.value;
        }
        if ((i11 & 2) != 0) {
            ratingDTO = usersFinalRatingV2DTO.rating;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = usersFinalRatingV2DTO.ratingSubtitle;
        }
        if ((i11 & 8) != 0) {
            iconDTO = usersFinalRatingV2DTO.icon;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = usersFinalRatingV2DTO.clickAction;
        }
        if ((i11 & 32) != 0) {
            map = usersFinalRatingV2DTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return usersFinalRatingV2DTO.copy(textDTO, ratingDTO, textDTO2, iconDTO, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getRatingSubtitle() {
        return this.ratingSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final UsersFinalRatingV2DTO copy(@NotNull TextDTO value, @NotNull RatingDTO rating, @NotNull TextDTO ratingSubtitle, IconDTO icon, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(ratingSubtitle, "ratingSubtitle");
        return new UsersFinalRatingV2DTO(value, rating, ratingSubtitle, icon, clickAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsersFinalRatingV2DTO)) {
            return false;
        }
        UsersFinalRatingV2DTO usersFinalRatingV2DTO = (UsersFinalRatingV2DTO) other;
        return Intrinsics.d(this.value, usersFinalRatingV2DTO.value) && Intrinsics.d(this.rating, usersFinalRatingV2DTO.rating) && Intrinsics.d(this.ratingSubtitle, usersFinalRatingV2DTO.ratingSubtitle) && Intrinsics.d(this.icon, usersFinalRatingV2DTO.icon) && Intrinsics.d(this.clickAction, usersFinalRatingV2DTO.clickAction) && Intrinsics.d(this.trackingInfo, usersFinalRatingV2DTO.trackingInfo);
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    public final TextDTO getRatingSubtitle() {
        return this.ratingSubtitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextDTO getValue() {
        return this.value;
    }

    public int hashCode() {
        int a11 = b.a(this.ratingSubtitle, (this.rating.hashCode() + (this.value.hashCode() * 31)) * 31, 31);
        IconDTO iconDTO = this.icon;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.value;
        RatingDTO ratingDTO = this.rating;
        TextDTO textDTO2 = this.ratingSubtitle;
        IconDTO iconDTO = this.icon;
        AtomActionDTO atomActionDTO = this.clickAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("UsersFinalRatingV2DTO(value=");
        sb2.append(textDTO);
        sb2.append(", rating=");
        sb2.append(ratingDTO);
        sb2.append(", ratingSubtitle=");
        G.f(sb2, textDTO2, ", icon=", iconDTO, ", clickAction=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}

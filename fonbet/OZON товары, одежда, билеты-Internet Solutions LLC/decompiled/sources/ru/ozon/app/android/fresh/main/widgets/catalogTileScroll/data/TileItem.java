package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data;

import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/TileItem;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "badge", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge;", "backgroundColor", "animationType", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/FavoriteBadge;", "getBackgroundColor", "getAnimationType", "()Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TileItem {

    @NotNull
    private final AtomActionDTO action;
    private final AnimationType animationType;
    private final String backgroundColor;
    private final FavoriteBadge badge;

    @NotNull
    private final String image;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TileItem(@NotNull String image, TextDTO textDTO, @NotNull AtomActionDTO action, FavoriteBadge favoriteBadge, String str, AnimationType animationType, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        this.image = image;
        this.title = textDTO;
        this.action = action;
        this.badge = favoriteBadge;
        this.backgroundColor = str;
        this.animationType = animationType;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TileItem copy$default(TileItem tileItem, String str, TextDTO textDTO, AtomActionDTO atomActionDTO, FavoriteBadge favoriteBadge, String str2, AnimationType animationType, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tileItem.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = tileItem.title;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = tileItem.action;
        }
        if ((i11 & 8) != 0) {
            favoriteBadge = tileItem.badge;
        }
        if ((i11 & 16) != 0) {
            str2 = tileItem.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            animationType = tileItem.animationType;
        }
        if ((i11 & 64) != 0) {
            map = tileItem.trackingInfo;
        }
        AnimationType animationType2 = animationType;
        Map map2 = map;
        String str3 = str2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return tileItem.copy(str, textDTO, atomActionDTO2, favoriteBadge, str3, animationType2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final FavoriteBadge getBadge() {
        return this.badge;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final TileItem copy(@NotNull String image, TextDTO title, @NotNull AtomActionDTO action, FavoriteBadge badge, String backgroundColor, AnimationType animationType, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(action, "action");
        return new TileItem(image, title, action, badge, backgroundColor, animationType, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileItem)) {
            return false;
        }
        TileItem tileItem = (TileItem) other;
        return Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.title, tileItem.title) && Intrinsics.d(this.action, tileItem.action) && Intrinsics.d(this.badge, tileItem.badge) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && this.animationType == tileItem.animationType && Intrinsics.d(this.trackingInfo, tileItem.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FavoriteBadge getBadge() {
        return this.badge;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        TextDTO textDTO = this.title;
        int b11 = a.b(this.action, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        FavoriteBadge favoriteBadge = this.badge;
        int hashCode2 = (b11 + (favoriteBadge == null ? 0 : favoriteBadge.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AnimationType animationType = this.animationType;
        int hashCode4 = (hashCode3 + (animationType == null ? 0 : animationType.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        TextDTO textDTO = this.title;
        AtomActionDTO atomActionDTO = this.action;
        FavoriteBadge favoriteBadge = this.badge;
        String str2 = this.backgroundColor;
        AnimationType animationType = this.animationType;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = Co.a.b("TileItem(image=", textDTO, str, ", title=", ", action=");
        b11.append(atomActionDTO);
        b11.append(", badge=");
        b11.append(favoriteBadge);
        b11.append(", backgroundColor=");
        b11.append(str2);
        b11.append(", animationType=");
        b11.append(animationType);
        b11.append(", trackingInfo=");
        return P.f(b11, map, ")");
    }
}

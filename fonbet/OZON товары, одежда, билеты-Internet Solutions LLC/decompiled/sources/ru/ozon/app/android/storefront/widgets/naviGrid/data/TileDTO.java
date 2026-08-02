package ru.ozon.app.android.storefront.widgets.naviGrid.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO;", "", "hideTitle", "", "<init>", "(Z)V", "getHideTitle", "()Z", "setHideTitle", "AccentDTO", "PairDTO", "CoupleDTO", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$AccentDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$CoupleDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$PairDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TileDTO {
    public static final int $stable = 8;
    private boolean hideTitle;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$AccentDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO;", "accentItem", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "accentPosition", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "mainBgColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;Ljava/lang/String;Ljava/util/Map;)V", "getAccentItem", "()Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "getAccentPosition", "()Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "getMainBgColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccentDTO extends TileDTO {
        public static final int $stable = 8;

        @NotNull
        private final ItemDTO accentItem;

        @NotNull
        private final AccentPosition accentPosition;
        private final String mainBgColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccentDTO(@NotNull ItemDTO accentItem, @NotNull AccentPosition accentPosition, String str, Map<String, TokenizedTrackingInfo> map) {
            super(false, 1, null);
            Intrinsics.checkNotNullParameter(accentItem, "accentItem");
            Intrinsics.checkNotNullParameter(accentPosition, "accentPosition");
            this.accentItem = accentItem;
            this.accentPosition = accentPosition;
            this.mainBgColor = str;
            this.trackingInfo = map;
        }

        @NotNull
        public final ItemDTO getAccentItem() {
            return this.accentItem;
        }

        @NotNull
        public final AccentPosition getAccentPosition() {
            return this.accentPosition;
        }

        public final String getMainBgColor() {
            return this.mainBgColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$CoupleDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO;", "items", "", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "accentPosition", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "mainBgColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;Ljava/lang/String;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getAccentPosition", "()Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "getMainBgColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CoupleDTO extends TileDTO {
        public static final int $stable = 8;

        @NotNull
        private final AccentPosition accentPosition;

        @NotNull
        private final List<ItemDTO> items;
        private final String mainBgColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CoupleDTO(@NotNull List<ItemDTO> items, @NotNull AccentPosition accentPosition, String str, Map<String, TokenizedTrackingInfo> map) {
            super(false, 1, null);
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(accentPosition, "accentPosition");
            this.items = items;
            this.accentPosition = accentPosition;
            this.mainBgColor = str;
            this.trackingInfo = map;
        }

        @NotNull
        public final AccentPosition getAccentPosition() {
            return this.accentPosition;
        }

        @NotNull
        public final List<ItemDTO> getItems() {
            return this.items;
        }

        public final String getMainBgColor() {
            return this.mainBgColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO$PairDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/TileDTO;", "items", "", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "mainBgColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getMainBgColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PairDTO extends TileDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<ItemDTO> items;
        private final String mainBgColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairDTO(@NotNull List<ItemDTO> items, String str, Map<String, TokenizedTrackingInfo> map) {
            super(false, 1, null);
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.mainBgColor = str;
            this.trackingInfo = map;
        }

        @NotNull
        public final List<ItemDTO> getItems() {
            return this.items;
        }

        public final String getMainBgColor() {
            return this.mainBgColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }
    }

    public /* synthetic */ TileDTO(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    public final boolean getHideTitle() {
        return this.hideTitle;
    }

    public final void setHideTitle(boolean z11) {
        this.hideTitle = z11;
    }

    private TileDTO(boolean z11) {
        this.hideTitle = z11;
    }

    public /* synthetic */ TileDTO(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, null);
    }
}

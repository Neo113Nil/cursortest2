package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.data;

import B3.p;
import GR.b;
import Kk.C3532b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001:\u00039:;Bq\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0088\u0001\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0010HÖ\u0001J\t\u00108\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$Tab;", "isSticky", "", "moreTab", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "backgroundColor", "", "badgeCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "paddings", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;", "maxRows", "", "stickyRoundedCorners", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;Ljava/lang/Integer;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;Ljava/util/Map;)V", "getTabs", "()Ljava/util/List;", "()Z", "getMoreTab", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBadgeCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;", "getMaxRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStickyRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;ZLru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;Ljava/lang/Integer;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;Ljava/util/Map;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO;", "equals", "other", "hashCode", "toString", "Tab", "TabPaddings", "StickyRoundedCorners", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogTabsV2DTO {
    private final String backgroundColor;
    private final CornerRadius badgeCornerRadius;
    private final boolean isSticky;
    private final Integer maxRows;
    private final TagButtonDTO moreTab;
    private final TabPaddings paddings;
    private final StickyRoundedCorners stickyRoundedCorners;

    @NotNull
    private final List<Tab> tabs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$StickyRoundedCorners;", "", "top", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyRoundedCorners {
        private final CornerRadius bottom;
        private final CornerRadius top;

        public StickyRoundedCorners(CornerRadius cornerRadius, CornerRadius cornerRadius2) {
            this.top = cornerRadius;
            this.bottom = cornerRadius2;
        }

        public static /* synthetic */ StickyRoundedCorners copy$default(StickyRoundedCorners stickyRoundedCorners, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = stickyRoundedCorners.top;
            }
            if ((i11 & 2) != 0) {
                cornerRadius2 = stickyRoundedCorners.bottom;
            }
            return stickyRoundedCorners.copy(cornerRadius, cornerRadius2);
        }

        /* renamed from: component1, reason: from getter */
        public final CornerRadius getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final CornerRadius getBottom() {
            return this.bottom;
        }

        @NotNull
        public final StickyRoundedCorners copy(CornerRadius top, CornerRadius bottom) {
            return new StickyRoundedCorners(top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyRoundedCorners)) {
                return false;
            }
            StickyRoundedCorners stickyRoundedCorners = (StickyRoundedCorners) other;
            return this.top == stickyRoundedCorners.top && this.bottom == stickyRoundedCorners.bottom;
        }

        public final CornerRadius getBottom() {
            return this.bottom;
        }

        public final CornerRadius getTop() {
            return this.top;
        }

        public int hashCode() {
            CornerRadius cornerRadius = this.top;
            int hashCode = (cornerRadius == null ? 0 : cornerRadius.hashCode()) * 31;
            CornerRadius cornerRadius2 = this.bottom;
            return hashCode + (cornerRadius2 != null ? cornerRadius2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "StickyRoundedCorners(top=" + this.top + ", bottom=" + this.bottom + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$Tab;", "", "tagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "widgetScrollKey", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/lang/String;)V", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getWidgetScrollKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {

        @NotNull
        private final TagButtonDTO tagButton;
        private final String widgetScrollKey;

        public Tab(@NotNull TagButtonDTO tagButton, String str) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            this.tagButton = tagButton;
            this.widgetScrollKey = str;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, TagButtonDTO tagButtonDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tagButtonDTO = tab.tagButton;
            }
            if ((i11 & 2) != 0) {
                str = tab.widgetScrollKey;
            }
            return tab.copy(tagButtonDTO, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWidgetScrollKey() {
            return this.widgetScrollKey;
        }

        @NotNull
        public final Tab copy(@NotNull TagButtonDTO tagButton, String widgetScrollKey) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            return new Tab(tagButton, widgetScrollKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.tagButton, tab.tagButton) && Intrinsics.d(this.widgetScrollKey, tab.widgetScrollKey);
        }

        @NotNull
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        public final String getWidgetScrollKey() {
            return this.widgetScrollKey;
        }

        public int hashCode() {
            int hashCode = this.tagButton.hashCode() * 31;
            String str = this.widgetScrollKey;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Tab(tagButton=" + this.tagButton + ", widgetScrollKey=" + this.widgetScrollKey + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/data/CatalogTabsV2DTO$TabPaddings;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontal", "between", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontal", "getBetween", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabPaddings {
        private final Paddings between;
        private final Paddings bottom;
        private final Paddings horizontal;
        private final Paddings top;

        public TabPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.top = paddings;
            this.horizontal = paddings2;
            this.between = paddings3;
            this.bottom = paddings4;
        }

        public static /* synthetic */ TabPaddings copy$default(TabPaddings tabPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = tabPaddings.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = tabPaddings.horizontal;
            }
            if ((i11 & 4) != 0) {
                paddings3 = tabPaddings.between;
            }
            if ((i11 & 8) != 0) {
                paddings4 = tabPaddings.bottom;
            }
            return tabPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final TabPaddings copy(Paddings top, Paddings horizontal, Paddings between, Paddings bottom) {
            return new TabPaddings(top, horizontal, between, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabPaddings)) {
                return false;
            }
            TabPaddings tabPaddings = (TabPaddings) other;
            return this.top == tabPaddings.top && this.horizontal == tabPaddings.horizontal && this.between == tabPaddings.between && this.bottom == tabPaddings.bottom;
        }

        public final Paddings getBetween() {
            return this.between;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.horizontal;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.between;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.bottom;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.horizontal;
            return b.e(p.b("TabPaddings(top=", paddings, ", horizontal=", paddings2, ", between="), this.between, ", bottom=", this.bottom, ")");
        }
    }

    public CatalogTabsV2DTO(@NotNull List<Tab> tabs, boolean z11, TagButtonDTO tagButtonDTO, String str, CornerRadius cornerRadius, TabPaddings tabPaddings, Integer num, StickyRoundedCorners stickyRoundedCorners, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.isSticky = z11;
        this.moreTab = tagButtonDTO;
        this.backgroundColor = str;
        this.badgeCornerRadius = cornerRadius;
        this.paddings = tabPaddings;
        this.maxRows = num;
        this.stickyRoundedCorners = stickyRoundedCorners;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CatalogTabsV2DTO copy$default(CatalogTabsV2DTO catalogTabsV2DTO, List list, boolean z11, TagButtonDTO tagButtonDTO, String str, CornerRadius cornerRadius, TabPaddings tabPaddings, Integer num, StickyRoundedCorners stickyRoundedCorners, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = catalogTabsV2DTO.tabs;
        }
        if ((i11 & 2) != 0) {
            z11 = catalogTabsV2DTO.isSticky;
        }
        if ((i11 & 4) != 0) {
            tagButtonDTO = catalogTabsV2DTO.moreTab;
        }
        if ((i11 & 8) != 0) {
            str = catalogTabsV2DTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            cornerRadius = catalogTabsV2DTO.badgeCornerRadius;
        }
        if ((i11 & 32) != 0) {
            tabPaddings = catalogTabsV2DTO.paddings;
        }
        if ((i11 & 64) != 0) {
            num = catalogTabsV2DTO.maxRows;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            stickyRoundedCorners = catalogTabsV2DTO.stickyRoundedCorners;
        }
        if ((i11 & 256) != 0) {
            map = catalogTabsV2DTO.trackingInfo;
        }
        StickyRoundedCorners stickyRoundedCorners2 = stickyRoundedCorners;
        Map map2 = map;
        TabPaddings tabPaddings2 = tabPaddings;
        Integer num2 = num;
        CornerRadius cornerRadius2 = cornerRadius;
        TagButtonDTO tagButtonDTO2 = tagButtonDTO;
        return catalogTabsV2DTO.copy(list, z11, tagButtonDTO2, str, cornerRadius2, tabPaddings2, num2, stickyRoundedCorners2, map2);
    }

    @NotNull
    public final List<Tab> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component3, reason: from getter */
    public final TagButtonDTO getMoreTab() {
        return this.moreTab;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CornerRadius getBadgeCornerRadius() {
        return this.badgeCornerRadius;
    }

    /* renamed from: component6, reason: from getter */
    public final TabPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getMaxRows() {
        return this.maxRows;
    }

    /* renamed from: component8, reason: from getter */
    public final StickyRoundedCorners getStickyRoundedCorners() {
        return this.stickyRoundedCorners;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final CatalogTabsV2DTO copy(@NotNull List<Tab> tabs, boolean isSticky, TagButtonDTO moreTab, String backgroundColor, CornerRadius badgeCornerRadius, TabPaddings paddings, Integer maxRows, StickyRoundedCorners stickyRoundedCorners, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new CatalogTabsV2DTO(tabs, isSticky, moreTab, backgroundColor, badgeCornerRadius, paddings, maxRows, stickyRoundedCorners, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogTabsV2DTO)) {
            return false;
        }
        CatalogTabsV2DTO catalogTabsV2DTO = (CatalogTabsV2DTO) other;
        return Intrinsics.d(this.tabs, catalogTabsV2DTO.tabs) && this.isSticky == catalogTabsV2DTO.isSticky && Intrinsics.d(this.moreTab, catalogTabsV2DTO.moreTab) && Intrinsics.d(this.backgroundColor, catalogTabsV2DTO.backgroundColor) && this.badgeCornerRadius == catalogTabsV2DTO.badgeCornerRadius && Intrinsics.d(this.paddings, catalogTabsV2DTO.paddings) && Intrinsics.d(this.maxRows, catalogTabsV2DTO.maxRows) && Intrinsics.d(this.stickyRoundedCorners, catalogTabsV2DTO.stickyRoundedCorners) && Intrinsics.d(this.trackingInfo, catalogTabsV2DTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getBadgeCornerRadius() {
        return this.badgeCornerRadius;
    }

    public final Integer getMaxRows() {
        return this.maxRows;
    }

    public final TagButtonDTO getMoreTab() {
        return this.moreTab;
    }

    public final TabPaddings getPaddings() {
        return this.paddings;
    }

    public final StickyRoundedCorners getStickyRoundedCorners() {
        return this.stickyRoundedCorners;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.tabs.hashCode() * 31, 31, this.isSticky);
        TagButtonDTO tagButtonDTO = this.moreTab;
        int hashCode = (a11 + (tagButtonDTO == null ? 0 : tagButtonDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.badgeCornerRadius;
        int hashCode3 = (hashCode2 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        TabPaddings tabPaddings = this.paddings;
        int hashCode4 = (hashCode3 + (tabPaddings == null ? 0 : tabPaddings.hashCode())) * 31;
        Integer num = this.maxRows;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        StickyRoundedCorners stickyRoundedCorners = this.stickyRoundedCorners;
        int hashCode6 = (hashCode5 + (stickyRoundedCorners == null ? 0 : stickyRoundedCorners.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        List<Tab> list = this.tabs;
        boolean z11 = this.isSticky;
        TagButtonDTO tagButtonDTO = this.moreTab;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.badgeCornerRadius;
        TabPaddings tabPaddings = this.paddings;
        Integer num = this.maxRows;
        StickyRoundedCorners stickyRoundedCorners = this.stickyRoundedCorners;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CatalogTabsV2DTO(tabs=");
        sb2.append(list);
        sb2.append(", isSticky=");
        sb2.append(z11);
        sb2.append(", moreTab=");
        sb2.append(tagButtonDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", badgeCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", paddings=");
        sb2.append(tabPaddings);
        sb2.append(", maxRows=");
        sb2.append(num);
        sb2.append(", stickyRoundedCorners=");
        sb2.append(stickyRoundedCorners);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ CatalogTabsV2DTO(List list, boolean z11, TagButtonDTO tagButtonDTO, String str, CornerRadius cornerRadius, TabPaddings tabPaddings, Integer num, StickyRoundedCorners stickyRoundedCorners, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11, tagButtonDTO, str, cornerRadius, tabPaddings, num, stickyRoundedCorners, map);
    }
}

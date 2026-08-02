package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import I1.w;
import Pk0.h;
import Ql.c;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;", "", "TileGrid2BannerDTO", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileItemDTO {

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002;<B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fHÆ\u0003J£\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\fHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"¨\u0006="}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;", "image", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$Image;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "islandBackgroundColor", "", "badges", "", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$BadgeData;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "impressionTrackingInfo", "pixel", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$Image;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getImage", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$Image;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getIslandBackgroundColor", "()Ljava/lang/String;", "getBadges", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getImpressionTrackingInfo", "getPixel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Image", "BadgeData", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TileGrid2BannerDTO implements TileItemDTO {
        private final AtomActionDTO action;
        private final List<BadgeData> badges;
        private final ButtonV3DTO button;

        @NotNull
        private final Image image;
        private final Map<String, TokenizedTrackingInfo> impressionTrackingInfo;
        private final String islandBackgroundColor;
        private final List<PixelDTO> pixel;
        private final TextDTO text;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$BadgeData;", "", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgeData {
            private final AtomActionDTO action;
            private final TestInfo testInfo;

            @NotNull
            private final String text;

            public BadgeData(@NotNull String text, AtomActionDTO atomActionDTO, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.action = atomActionDTO;
                this.testInfo = testInfo;
            }

            public static /* synthetic */ BadgeData copy$default(BadgeData badgeData, String str, AtomActionDTO atomActionDTO, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = badgeData.text;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = badgeData.action;
                }
                if ((i11 & 4) != 0) {
                    testInfo = badgeData.testInfo;
                }
                return badgeData.copy(str, atomActionDTO, testInfo);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component3, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final BadgeData copy(@NotNull String text, AtomActionDTO action, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new BadgeData(text, action, testInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BadgeData)) {
                    return false;
                }
                BadgeData badgeData = (BadgeData) other;
                return Intrinsics.d(this.text, badgeData.text) && Intrinsics.d(this.action, badgeData.action) && Intrinsics.d(this.testInfo, badgeData.testInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.text;
                AtomActionDTO atomActionDTO = this.action;
                return h.c(c.c("BadgeData(text=", str, ", action=", atomActionDTO, ", testInfo="), this.testInfo, ")");
            }
        }

        public TileGrid2BannerDTO(@NotNull Image image, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, String str, List<BadgeData> list, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, List<PixelDTO> list2) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.title = textDTO;
            this.text = textDTO2;
            this.button = buttonV3DTO;
            this.islandBackgroundColor = str;
            this.badges = list;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.impressionTrackingInfo = map2;
            this.pixel = list2;
        }

        public static /* synthetic */ TileGrid2BannerDTO copy$default(TileGrid2BannerDTO tileGrid2BannerDTO, Image image, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, String str, List list, AtomActionDTO atomActionDTO, Map map, Map map2, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                image = tileGrid2BannerDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = tileGrid2BannerDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = tileGrid2BannerDTO.text;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = tileGrid2BannerDTO.button;
            }
            if ((i11 & 16) != 0) {
                str = tileGrid2BannerDTO.islandBackgroundColor;
            }
            if ((i11 & 32) != 0) {
                list = tileGrid2BannerDTO.badges;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = tileGrid2BannerDTO.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = tileGrid2BannerDTO.trackingInfo;
            }
            if ((i11 & 256) != 0) {
                map2 = tileGrid2BannerDTO.impressionTrackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                list2 = tileGrid2BannerDTO.pixel;
            }
            Map map3 = map2;
            List list3 = list2;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map4 = map;
            String str2 = str;
            List list4 = list;
            return tileGrid2BannerDTO.copy(image, textDTO, textDTO2, buttonV3DTO, str2, list4, atomActionDTO2, map4, map3, list3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        public final List<PixelDTO> component10() {
            return this.pixel;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIslandBackgroundColor() {
            return this.islandBackgroundColor;
        }

        public final List<BadgeData> component6() {
            return this.badges;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.impressionTrackingInfo;
        }

        @NotNull
        public final TileGrid2BannerDTO copy(@NotNull Image image, TextDTO title, TextDTO text, ButtonV3DTO button, String islandBackgroundColor, List<BadgeData> badges, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> impressionTrackingInfo, List<PixelDTO> pixel) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new TileGrid2BannerDTO(image, title, text, button, islandBackgroundColor, badges, action, trackingInfo, impressionTrackingInfo, pixel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileGrid2BannerDTO)) {
                return false;
            }
            TileGrid2BannerDTO tileGrid2BannerDTO = (TileGrid2BannerDTO) other;
            return Intrinsics.d(this.image, tileGrid2BannerDTO.image) && Intrinsics.d(this.title, tileGrid2BannerDTO.title) && Intrinsics.d(this.text, tileGrid2BannerDTO.text) && Intrinsics.d(this.button, tileGrid2BannerDTO.button) && Intrinsics.d(this.islandBackgroundColor, tileGrid2BannerDTO.islandBackgroundColor) && Intrinsics.d(this.badges, tileGrid2BannerDTO.badges) && Intrinsics.d(this.action, tileGrid2BannerDTO.action) && Intrinsics.d(this.trackingInfo, tileGrid2BannerDTO.trackingInfo) && Intrinsics.d(this.impressionTrackingInfo, tileGrid2BannerDTO.impressionTrackingInfo) && Intrinsics.d(this.pixel, tileGrid2BannerDTO.pixel);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final List<BadgeData> getBadges() {
            return this.badges;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final Image getImage() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getImpressionTrackingInfo() {
            return this.impressionTrackingInfo;
        }

        public final String getIslandBackgroundColor() {
            return this.islandBackgroundColor;
        }

        public final List<PixelDTO> getPixel() {
            return this.pixel;
        }

        public final TextDTO getText() {
            return this.text;
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
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.text;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            String str = this.islandBackgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            List<BadgeData> list = this.badges;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.impressionTrackingInfo;
            int hashCode9 = (hashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List<PixelDTO> list2 = this.pixel;
            return hashCode9 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Image image = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.text;
            ButtonV3DTO buttonV3DTO = this.button;
            String str = this.islandBackgroundColor;
            List<BadgeData> list = this.badges;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.impressionTrackingInfo;
            List<PixelDTO> list2 = this.pixel;
            StringBuilder sb2 = new StringBuilder("TileGrid2BannerDTO(image=");
            sb2.append(image);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", text=");
            sb2.append(textDTO2);
            sb2.append(", button=");
            sb2.append(buttonV3DTO);
            sb2.append(", islandBackgroundColor=");
            w.d(str, ", badges=", ", action=", sb2, list);
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", impressionTrackingInfo=");
            sb2.append(map2);
            sb2.append(", pixel=");
            sb2.append(list2);
            sb2.append(")");
            return sb2.toString();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO$TileGrid2BannerDTO$Image;", "", "link", "", "imageRatio", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "contentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;)V", "getLink", "()Ljava/lang/String;", "getImageRatio", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "getContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image {
            private final ContentMode contentMode;
            private final ImageRatio imageRatio;

            @NotNull
            private final String link;

            public Image(@NotNull String link, ImageRatio imageRatio, ContentMode contentMode) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                this.imageRatio = imageRatio;
                this.contentMode = contentMode;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, ImageRatio imageRatio, ContentMode contentMode, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.link;
                }
                if ((i11 & 2) != 0) {
                    imageRatio = image.imageRatio;
                }
                if ((i11 & 4) != 0) {
                    contentMode = image.contentMode;
                }
                return image.copy(str, imageRatio, contentMode);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component2, reason: from getter */
            public final ImageRatio getImageRatio() {
                return this.imageRatio;
            }

            /* renamed from: component3, reason: from getter */
            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            @NotNull
            public final Image copy(@NotNull String link, ImageRatio imageRatio, ContentMode contentMode) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new Image(link, imageRatio, contentMode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.link, image.link) && this.imageRatio == image.imageRatio && this.contentMode == image.contentMode;
            }

            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            public final ImageRatio getImageRatio() {
                return this.imageRatio;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                int hashCode = this.link.hashCode() * 31;
                ImageRatio imageRatio = this.imageRatio;
                int hashCode2 = (hashCode + (imageRatio == null ? 0 : imageRatio.hashCode())) * 31;
                ContentMode contentMode = this.contentMode;
                return hashCode2 + (contentMode != null ? contentMode.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Image(link=" + this.link + ", imageRatio=" + this.imageRatio + ", contentMode=" + this.contentMode + ")";
            }

            public /* synthetic */ Image(String str, ImageRatio imageRatio, ContentMode contentMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? ImageRatio.IMAGE_RATIO_3_4 : imageRatio, (i11 & 4) != 0 ? ContentMode.SCALE_ASPECT_FIT : contentMode);
            }
        }
    }
}

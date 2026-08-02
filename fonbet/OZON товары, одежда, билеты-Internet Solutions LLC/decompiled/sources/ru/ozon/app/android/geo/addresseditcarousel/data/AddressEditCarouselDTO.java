package ru.ozon.app.android.geo.addresseditcarousel.data;

import Fj.c;
import G.g;
import I1.w;
import N3.C3660k;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO;", "", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "options", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$Option;", "moreButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/util/Map;)V", "getElements", "()Ljava/util/List;", "getOptions", "getMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Option", "CellDTO", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditCarouselDTO {

    @NotNull
    private final List<AtomDTO> elements;
    private final ButtonV3Atom.LargeBorderlessButton moreButton;

    @NotNull
    private final List<Option> options;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00060"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "image", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "numberPVZ", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO$NumberPVZ;", "imageTintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO$NumberPVZ;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage", "getBadges", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getNumberPVZ", "()Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO$NumberPVZ;", "getImageTintColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "NumberPVZ", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CellDTO {
        private final AtomActionDTO action;
        private final List<BadgeDTO> badges;
        private final String image;
        private final String imageTintColor;
        private final NumberPVZ numberPVZ;
        private final String subtitle;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO$NumberPVZ;", "", "number", "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NumberPVZ {
            private final CommonControlSettings common;

            @NotNull
            private final TextDTO number;

            public NumberPVZ(@NotNull TextDTO number, CommonControlSettings commonControlSettings) {
                Intrinsics.checkNotNullParameter(number, "number");
                this.number = number;
                this.common = commonControlSettings;
            }

            public static /* synthetic */ NumberPVZ copy$default(NumberPVZ numberPVZ, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = numberPVZ.number;
                }
                if ((i11 & 2) != 0) {
                    commonControlSettings = numberPVZ.common;
                }
                return numberPVZ.copy(textDTO, commonControlSettings);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getNumber() {
                return this.number;
            }

            /* renamed from: component2, reason: from getter */
            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final NumberPVZ copy(@NotNull TextDTO number, CommonControlSettings common) {
                Intrinsics.checkNotNullParameter(number, "number");
                return new NumberPVZ(number, common);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NumberPVZ)) {
                    return false;
                }
                NumberPVZ numberPVZ = (NumberPVZ) other;
                return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.common, numberPVZ.common);
            }

            public final CommonControlSettings getCommon() {
                return this.common;
            }

            @NotNull
            public final TextDTO getNumber() {
                return this.number;
            }

            public int hashCode() {
                int hashCode = this.number.hashCode() * 31;
                CommonControlSettings commonControlSettings = this.common;
                return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
            }

            @NotNull
            public String toString() {
                return "NumberPVZ(number=" + this.number + ", common=" + this.common + ")";
            }
        }

        public CellDTO(String str, String str2, String str3, List<BadgeDTO> list, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, NumberPVZ numberPVZ, String str4) {
            this.title = str;
            this.subtitle = str2;
            this.image = str3;
            this.badges = list;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.numberPVZ = numberPVZ;
            this.imageTintColor = str4;
        }

        public static /* synthetic */ CellDTO copy$default(CellDTO cellDTO, String str, String str2, String str3, List list, AtomActionDTO atomActionDTO, Map map, NumberPVZ numberPVZ, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cellDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = cellDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = cellDTO.image;
            }
            if ((i11 & 8) != 0) {
                list = cellDTO.badges;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = cellDTO.action;
            }
            if ((i11 & 32) != 0) {
                map = cellDTO.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                numberPVZ = cellDTO.numberPVZ;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = cellDTO.imageTintColor;
            }
            NumberPVZ numberPVZ2 = numberPVZ;
            String str5 = str4;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return cellDTO.copy(str, str2, str3, list, atomActionDTO2, map2, numberPVZ2, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        public final List<BadgeDTO> component4() {
            return this.badges;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final NumberPVZ getNumberPVZ() {
            return this.numberPVZ;
        }

        /* renamed from: component8, reason: from getter */
        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        @NotNull
        public final CellDTO copy(String title, String subtitle, String image, List<BadgeDTO> badges, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, NumberPVZ numberPVZ, String imageTintColor) {
            return new CellDTO(title, subtitle, image, badges, action, trackingInfo, numberPVZ, imageTintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellDTO)) {
                return false;
            }
            CellDTO cellDTO = (CellDTO) other;
            return Intrinsics.d(this.title, cellDTO.title) && Intrinsics.d(this.subtitle, cellDTO.subtitle) && Intrinsics.d(this.image, cellDTO.image) && Intrinsics.d(this.badges, cellDTO.badges) && Intrinsics.d(this.action, cellDTO.action) && Intrinsics.d(this.trackingInfo, cellDTO.trackingInfo) && Intrinsics.d(this.numberPVZ, cellDTO.numberPVZ) && Intrinsics.d(this.imageTintColor, cellDTO.imageTintColor);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final NumberPVZ getNumberPVZ() {
            return this.numberPVZ;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.image;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            NumberPVZ numberPVZ = this.numberPVZ;
            int hashCode7 = (hashCode6 + (numberPVZ == null ? 0 : numberPVZ.hashCode())) * 31;
            String str4 = this.imageTintColor;
            return hashCode7 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.image;
            List<BadgeDTO> list = this.badges;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            NumberPVZ numberPVZ = this.numberPVZ;
            String str4 = this.imageTintColor;
            StringBuilder d11 = C3660k.d("CellDTO(title=", str, ", subtitle=", str2, ", image=");
            w.d(str3, ", badges=", ", action=", d11, list);
            b.f(d11, atomActionDTO, ", trackingInfo=", map, ", numberPVZ=");
            d11.append(numberPVZ);
            d11.append(", imageTintColor=");
            d11.append(str4);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$Option;", "", "cell", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO;", "marketingInfo", "", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "<init>", "(Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO;Ljava/util/List;)V", "getCell", "()Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO;", "getMarketingInfo", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Option {

        @NotNull
        private final CellDTO cell;
        private final List<Label> marketingInfo;

        public Option(@NotNull CellDTO cell, List<Label> list) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.marketingInfo = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Option copy$default(Option option, CellDTO cellDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = option.cell;
            }
            if ((i11 & 2) != 0) {
                list = option.marketingInfo;
            }
            return option.copy(cellDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        public final List<Label> component2() {
            return this.marketingInfo;
        }

        @NotNull
        public final Option copy(@NotNull CellDTO cell, List<Label> marketingInfo) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new Option(cell, marketingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.d(this.cell, option.cell) && Intrinsics.d(this.marketingInfo, option.marketingInfo);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final List<Label> getMarketingInfo() {
            return this.marketingInfo;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            List<Label> list = this.marketingInfo;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Option(cell=" + this.cell + ", marketingInfo=" + this.marketingInfo + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditCarouselDTO(@NotNull List<? extends AtomDTO> elements, @NotNull List<Option> options, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(options, "options");
        this.elements = elements;
        this.options = options;
        this.moreButton = largeBorderlessButton;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditCarouselDTO copy$default(AddressEditCarouselDTO addressEditCarouselDTO, List list, List list2, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addressEditCarouselDTO.elements;
        }
        if ((i11 & 2) != 0) {
            list2 = addressEditCarouselDTO.options;
        }
        if ((i11 & 4) != 0) {
            largeBorderlessButton = addressEditCarouselDTO.moreButton;
        }
        if ((i11 & 8) != 0) {
            map = addressEditCarouselDTO.trackingInfo;
        }
        return addressEditCarouselDTO.copy(list, list2, largeBorderlessButton, map);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.elements;
    }

    @NotNull
    public final List<Option> component2() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getMoreButton() {
        return this.moreButton;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressEditCarouselDTO copy(@NotNull List<? extends AtomDTO> elements, @NotNull List<Option> options, ButtonV3Atom.LargeBorderlessButton moreButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(options, "options");
        return new AddressEditCarouselDTO(elements, options, moreButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditCarouselDTO)) {
            return false;
        }
        AddressEditCarouselDTO addressEditCarouselDTO = (AddressEditCarouselDTO) other;
        return Intrinsics.d(this.elements, addressEditCarouselDTO.elements) && Intrinsics.d(this.options, addressEditCarouselDTO.options) && Intrinsics.d(this.moreButton, addressEditCarouselDTO.moreButton) && Intrinsics.d(this.trackingInfo, addressEditCarouselDTO.trackingInfo);
    }

    @NotNull
    public final List<AtomDTO> getElements() {
        return this.elements;
    }

    public final ButtonV3Atom.LargeBorderlessButton getMoreButton() {
        return this.moreButton;
    }

    @NotNull
    public final List<Option> getOptions() {
        return this.options;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.elements.hashCode() * 31, 31, this.options);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreButton;
        int hashCode = (b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<AtomDTO> list = this.elements;
        List<Option> list2 = this.options;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = c.d("AddressEditCarouselDTO(elements=", list, ", options=", ", moreButton=", list2);
        d11.append(largeBorderlessButton);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}

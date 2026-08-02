package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.data;

import B90.C2616s;
import D40.a;
import G.g;
import HY.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO;", "", "objectScrollNew", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;)V", "getObjectScrollNew", "()Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ObjectScrollNew", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UniversalObjectScrollDTO {
    private final ObjectScrollNew objectScrollNew;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jr\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0004\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;", "", "uwHeader", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "isTopRounded", "", "isBottomRounded", "backgroundColor", "", "isAdditionalInsetsNeeded", "items", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew$ObjectScrollNewItemDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V", "getUwHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew;", "equals", "other", "hashCode", "", "toString", "ObjectScrollNewItemDTO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ObjectScrollNew {
        private final String backgroundColor;
        private final Boolean isAdditionalInsetsNeeded;
        private final Boolean isBottomRounded;
        private final Boolean isTopRounded;

        @NotNull
        private final List<ObjectScrollNewItemDTO> items;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final HeaderDTO uwHeader;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0007\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew$ObjectScrollNewItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "blurPlaceholderImage", "", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlurPlaceholderImage", "()Ljava/lang/String;", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/data/UniversalObjectScrollDTO$ObjectScrollNew$ObjectScrollNewItemDTO;", "equals", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ObjectScrollNewItemDTO {
            private final AtomActionDTO action;
            private final BadgeDTO adBadge;
            private final String blurPlaceholderImage;

            @NotNull
            private final ImageDTO image;
            private final Boolean isAdult;
            private final TextDTO subtitle;
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ObjectScrollNewItemDTO(@NotNull ImageDTO image, TextDTO textDTO, TextDTO textDTO2, Boolean bool, String str, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.title = textDTO;
                this.subtitle = textDTO2;
                this.isAdult = bool;
                this.blurPlaceholderImage = str;
                this.adBadge = badgeDTO;
                this.action = atomActionDTO;
                this.trackingInfo = map;
            }

            public static /* synthetic */ ObjectScrollNewItemDTO copy$default(ObjectScrollNewItemDTO objectScrollNewItemDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, Boolean bool, String str, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    imageDTO = objectScrollNewItemDTO.image;
                }
                if ((i11 & 2) != 0) {
                    textDTO = objectScrollNewItemDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = objectScrollNewItemDTO.subtitle;
                }
                if ((i11 & 8) != 0) {
                    bool = objectScrollNewItemDTO.isAdult;
                }
                if ((i11 & 16) != 0) {
                    str = objectScrollNewItemDTO.blurPlaceholderImage;
                }
                if ((i11 & 32) != 0) {
                    badgeDTO = objectScrollNewItemDTO.adBadge;
                }
                if ((i11 & 64) != 0) {
                    atomActionDTO = objectScrollNewItemDTO.action;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    map = objectScrollNewItemDTO.trackingInfo;
                }
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                Map map2 = map;
                String str2 = str;
                BadgeDTO badgeDTO2 = badgeDTO;
                return objectScrollNewItemDTO.copy(imageDTO, textDTO, textDTO2, bool, str2, badgeDTO2, atomActionDTO2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ImageDTO getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsAdult() {
                return this.isAdult;
            }

            /* renamed from: component5, reason: from getter */
            public final String getBlurPlaceholderImage() {
                return this.blurPlaceholderImage;
            }

            /* renamed from: component6, reason: from getter */
            public final BadgeDTO getAdBadge() {
                return this.adBadge;
            }

            /* renamed from: component7, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component8() {
                return this.trackingInfo;
            }

            @NotNull
            public final ObjectScrollNewItemDTO copy(@NotNull ImageDTO image, TextDTO title, TextDTO subtitle, Boolean isAdult, String blurPlaceholderImage, BadgeDTO adBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new ObjectScrollNewItemDTO(image, title, subtitle, isAdult, blurPlaceholderImage, adBadge, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ObjectScrollNewItemDTO)) {
                    return false;
                }
                ObjectScrollNewItemDTO objectScrollNewItemDTO = (ObjectScrollNewItemDTO) other;
                return Intrinsics.d(this.image, objectScrollNewItemDTO.image) && Intrinsics.d(this.title, objectScrollNewItemDTO.title) && Intrinsics.d(this.subtitle, objectScrollNewItemDTO.subtitle) && Intrinsics.d(this.isAdult, objectScrollNewItemDTO.isAdult) && Intrinsics.d(this.blurPlaceholderImage, objectScrollNewItemDTO.blurPlaceholderImage) && Intrinsics.d(this.adBadge, objectScrollNewItemDTO.adBadge) && Intrinsics.d(this.action, objectScrollNewItemDTO.action) && Intrinsics.d(this.trackingInfo, objectScrollNewItemDTO.trackingInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final BadgeDTO getAdBadge() {
                return this.adBadge;
            }

            public final String getBlurPlaceholderImage() {
                return this.blurPlaceholderImage;
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
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
                TextDTO textDTO2 = this.subtitle;
                int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
                Boolean bool = this.isAdult;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.blurPlaceholderImage;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                BadgeDTO badgeDTO = this.adBadge;
                int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode7 + (map != null ? map.hashCode() : 0);
            }

            public final Boolean isAdult() {
                return this.isAdult;
            }

            @NotNull
            public String toString() {
                ImageDTO imageDTO = this.image;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                Boolean bool = this.isAdult;
                String str = this.blurPlaceholderImage;
                BadgeDTO badgeDTO = this.adBadge;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C2616s.d("ObjectScrollNewItemDTO(image=", imageDTO, ", title=", textDTO, ", subtitle=");
                d11.append(textDTO2);
                d11.append(", isAdult=");
                d11.append(bool);
                d11.append(", blurPlaceholderImage=");
                d11.append(str);
                d11.append(", adBadge=");
                d11.append(badgeDTO);
                d11.append(", action=");
                return a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
            }
        }

        public ObjectScrollNew(HeaderDTO headerDTO, Boolean bool, Boolean bool2, String str, Boolean bool3, @NotNull List<ObjectScrollNewItemDTO> items, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.uwHeader = headerDTO;
            this.isTopRounded = bool;
            this.isBottomRounded = bool2;
            this.backgroundColor = str;
            this.isAdditionalInsetsNeeded = bool3;
            this.items = items;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ObjectScrollNew copy$default(ObjectScrollNew objectScrollNew, HeaderDTO headerDTO, Boolean bool, Boolean bool2, String str, Boolean bool3, List list, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                headerDTO = objectScrollNew.uwHeader;
            }
            if ((i11 & 2) != 0) {
                bool = objectScrollNew.isTopRounded;
            }
            if ((i11 & 4) != 0) {
                bool2 = objectScrollNew.isBottomRounded;
            }
            if ((i11 & 8) != 0) {
                str = objectScrollNew.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                bool3 = objectScrollNew.isAdditionalInsetsNeeded;
            }
            if ((i11 & 32) != 0) {
                list = objectScrollNew.items;
            }
            if ((i11 & 64) != 0) {
                map = objectScrollNew.trackingInfo;
            }
            List list2 = list;
            Map map2 = map;
            Boolean bool4 = bool3;
            Boolean bool5 = bool2;
            return objectScrollNew.copy(headerDTO, bool, bool5, str, bool4, list2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final HeaderDTO getUwHeader() {
            return this.uwHeader;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsTopRounded() {
            return this.isTopRounded;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsBottomRounded() {
            return this.isBottomRounded;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsAdditionalInsetsNeeded() {
            return this.isAdditionalInsetsNeeded;
        }

        @NotNull
        public final List<ObjectScrollNewItemDTO> component6() {
            return this.items;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final ObjectScrollNew copy(HeaderDTO uwHeader, Boolean isTopRounded, Boolean isBottomRounded, String backgroundColor, Boolean isAdditionalInsetsNeeded, @NotNull List<ObjectScrollNewItemDTO> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new ObjectScrollNew(uwHeader, isTopRounded, isBottomRounded, backgroundColor, isAdditionalInsetsNeeded, items, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObjectScrollNew)) {
                return false;
            }
            ObjectScrollNew objectScrollNew = (ObjectScrollNew) other;
            return Intrinsics.d(this.uwHeader, objectScrollNew.uwHeader) && Intrinsics.d(this.isTopRounded, objectScrollNew.isTopRounded) && Intrinsics.d(this.isBottomRounded, objectScrollNew.isBottomRounded) && Intrinsics.d(this.backgroundColor, objectScrollNew.backgroundColor) && Intrinsics.d(this.isAdditionalInsetsNeeded, objectScrollNew.isAdditionalInsetsNeeded) && Intrinsics.d(this.items, objectScrollNew.items) && Intrinsics.d(this.trackingInfo, objectScrollNew.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<ObjectScrollNewItemDTO> getItems() {
            return this.items;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final HeaderDTO getUwHeader() {
            return this.uwHeader;
        }

        public int hashCode() {
            HeaderDTO headerDTO = this.uwHeader;
            int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
            Boolean bool = this.isTopRounded;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isBottomRounded;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool3 = this.isAdditionalInsetsNeeded;
            int b11 = g.b((hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31, this.items);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isAdditionalInsetsNeeded() {
            return this.isAdditionalInsetsNeeded;
        }

        public final Boolean isBottomRounded() {
            return this.isBottomRounded;
        }

        public final Boolean isTopRounded() {
            return this.isTopRounded;
        }

        @NotNull
        public String toString() {
            HeaderDTO headerDTO = this.uwHeader;
            Boolean bool = this.isTopRounded;
            Boolean bool2 = this.isBottomRounded;
            String str = this.backgroundColor;
            Boolean bool3 = this.isAdditionalInsetsNeeded;
            List<ObjectScrollNewItemDTO> list = this.items;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ObjectScrollNew(uwHeader=");
            sb2.append(headerDTO);
            sb2.append(", isTopRounded=");
            sb2.append(bool);
            sb2.append(", isBottomRounded=");
            b.c(bool2, ", backgroundColor=", str, ", isAdditionalInsetsNeeded=", sb2);
            sb2.append(bool3);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public UniversalObjectScrollDTO(@i(name = "object") ObjectScrollNew objectScrollNew) {
        this.objectScrollNew = objectScrollNew;
    }

    public static /* synthetic */ UniversalObjectScrollDTO copy$default(UniversalObjectScrollDTO universalObjectScrollDTO, ObjectScrollNew objectScrollNew, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            objectScrollNew = universalObjectScrollDTO.objectScrollNew;
        }
        return universalObjectScrollDTO.copy(objectScrollNew);
    }

    /* renamed from: component1, reason: from getter */
    public final ObjectScrollNew getObjectScrollNew() {
        return this.objectScrollNew;
    }

    @NotNull
    public final UniversalObjectScrollDTO copy(@i(name = "object") ObjectScrollNew objectScrollNew) {
        return new UniversalObjectScrollDTO(objectScrollNew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UniversalObjectScrollDTO) && Intrinsics.d(this.objectScrollNew, ((UniversalObjectScrollDTO) other).objectScrollNew);
    }

    public final ObjectScrollNew getObjectScrollNew() {
        return this.objectScrollNew;
    }

    public int hashCode() {
        ObjectScrollNew objectScrollNew = this.objectScrollNew;
        if (objectScrollNew == null) {
            return 0;
        }
        return objectScrollNew.hashCode();
    }

    @NotNull
    public String toString() {
        return "UniversalObjectScrollDTO(objectScrollNew=" + this.objectScrollNew + ")";
    }
}

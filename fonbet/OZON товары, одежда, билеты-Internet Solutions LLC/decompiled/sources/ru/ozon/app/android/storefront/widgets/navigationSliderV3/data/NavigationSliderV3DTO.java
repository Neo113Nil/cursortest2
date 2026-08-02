package ru.ozon.app.android.storefront.widgets.navigationSliderV3.data;

import Nh.a;
import Sh.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO;", "", "items", "", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO$NavigationItemV3DTO;", "backgroundColor", "", "isCompactStyle", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "NavigationItemV3DTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigationSliderV3DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final boolean isCompactStyle;

    @NotNull
    private final List<NavigationItemV3DTO> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO$NavigationItemV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboardingCommon", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getOnboardingCommon", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationItemV3DTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final ImageDTO image;
        private final OnBoardingDTO onboardingCommon;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public NavigationItemV3DTO(@NotNull TextDTO title, @NotNull ImageDTO image, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.image = image;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.onboardingCommon = onBoardingDTO;
        }

        public static /* synthetic */ NavigationItemV3DTO copy$default(NavigationItemV3DTO navigationItemV3DTO, TextDTO textDTO, ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map map, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = navigationItemV3DTO.title;
            }
            if ((i11 & 2) != 0) {
                imageDTO = navigationItemV3DTO.image;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = navigationItemV3DTO.action;
            }
            if ((i11 & 8) != 0) {
                map = navigationItemV3DTO.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                onBoardingDTO = navigationItemV3DTO.onboardingCommon;
            }
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return navigationItemV3DTO.copy(textDTO, imageDTO, atomActionDTO2, map, onBoardingDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final OnBoardingDTO getOnboardingCommon() {
            return this.onboardingCommon;
        }

        @NotNull
        public final NavigationItemV3DTO copy(@NotNull TextDTO title, @NotNull ImageDTO image, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboardingCommon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            return new NavigationItemV3DTO(title, image, action, trackingInfo, onboardingCommon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationItemV3DTO)) {
                return false;
            }
            NavigationItemV3DTO navigationItemV3DTO = (NavigationItemV3DTO) other;
            return Intrinsics.d(this.title, navigationItemV3DTO.title) && Intrinsics.d(this.image, navigationItemV3DTO.image) && Intrinsics.d(this.action, navigationItemV3DTO.action) && Intrinsics.d(this.trackingInfo, navigationItemV3DTO.trackingInfo) && Intrinsics.d(this.onboardingCommon, navigationItemV3DTO.onboardingCommon);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final OnBoardingDTO getOnboardingCommon() {
            return this.onboardingCommon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.image, this.title.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboardingCommon;
            return hashCode2 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            ImageDTO imageDTO = this.image;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            OnBoardingDTO onBoardingDTO = this.onboardingCommon;
            StringBuilder sb2 = new StringBuilder("NavigationItemV3DTO(title=");
            sb2.append(textDTO);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", onboardingCommon=");
            sb2.append(onBoardingDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public NavigationSliderV3DTO(@NotNull List<NavigationItemV3DTO> items, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.backgroundColor = str;
        this.isCompactStyle = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationSliderV3DTO copy$default(NavigationSliderV3DTO navigationSliderV3DTO, List list, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = navigationSliderV3DTO.items;
        }
        if ((i11 & 2) != 0) {
            str = navigationSliderV3DTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            z11 = navigationSliderV3DTO.isCompactStyle;
        }
        return navigationSliderV3DTO.copy(list, str, z11);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    @NotNull
    public final List<NavigationItemV3DTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCompactStyle() {
        return this.isCompactStyle;
    }

    @NotNull
    public final NavigationSliderV3DTO copy(@NotNull List<NavigationItemV3DTO> items, String backgroundColor, boolean isCompactStyle) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new NavigationSliderV3DTO(items, backgroundColor, isCompactStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderV3DTO)) {
            return false;
        }
        NavigationSliderV3DTO navigationSliderV3DTO = (NavigationSliderV3DTO) other;
        return Intrinsics.d(this.items, navigationSliderV3DTO.items) && Intrinsics.d(this.backgroundColor, navigationSliderV3DTO.backgroundColor) && this.isCompactStyle == navigationSliderV3DTO.isCompactStyle;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<NavigationItemV3DTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.backgroundColor;
        return Boolean.hashCode(this.isCompactStyle) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isCompactStyle() {
        return this.isCompactStyle;
    }

    @NotNull
    public String toString() {
        List<NavigationItemV3DTO> list = this.items;
        String str = this.backgroundColor;
        return Pk0.a.a(")", C4055a.a("NavigationSliderV3DTO(items=", ", backgroundColor=", str, ", isCompactStyle=", list), this.isCompactStyle);
    }
}

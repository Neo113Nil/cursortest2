package ru.ozon.app.android.storefront.widgets.navigationSliderV2.data;

import B90.C2618u;
import Bk.C2638a;
import Ds.C2880a;
import G.g;
import Ih.a;
import Kk.C3532b;
import Ql.c;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isTwoLinesTitle", "", "items", "", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO$NavigationItemV2DTO;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getTitle", "()Ljava/lang/String;", "()Z", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "NavigationItemV2DTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NavigationSliderV2DTO {
    public static final int $stable = 8;
    private final boolean isTwoLinesTitle;

    @NotNull
    private final List<NavigationItemV2DTO> items;
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO$NavigationItemV2DTO;", "", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "backgroundImage", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboardingCommon", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "()Z", "getBackgroundImage", "getTrackingInfo", "()Ljava/util/Map;", "getOnboardingCommon", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationItemV2DTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundImage;

        @NotNull
        private final String image;
        private final boolean isAdult;
        private final OnBoardingDTO onboardingCommon;

        @NotNull
        private String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public NavigationItemV2DTO(@NotNull String image, @NotNull AtomActionDTO action, @NotNull String title, boolean z11, String str, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.action = action;
            this.title = title;
            this.isAdult = z11;
            this.backgroundImage = str;
            this.trackingInfo = map;
            this.onboardingCommon = onBoardingDTO;
        }

        public static /* synthetic */ NavigationItemV2DTO copy$default(NavigationItemV2DTO navigationItemV2DTO, String str, AtomActionDTO atomActionDTO, String str2, boolean z11, String str3, Map map, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = navigationItemV2DTO.image;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = navigationItemV2DTO.action;
            }
            if ((i11 & 4) != 0) {
                str2 = navigationItemV2DTO.title;
            }
            if ((i11 & 8) != 0) {
                z11 = navigationItemV2DTO.isAdult;
            }
            if ((i11 & 16) != 0) {
                str3 = navigationItemV2DTO.backgroundImage;
            }
            if ((i11 & 32) != 0) {
                map = navigationItemV2DTO.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                onBoardingDTO = navigationItemV2DTO.onboardingCommon;
            }
            Map map2 = map;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            String str4 = str3;
            String str5 = str2;
            return navigationItemV2DTO.copy(str, atomActionDTO, str5, z11, str4, map2, onBoardingDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final OnBoardingDTO getOnboardingCommon() {
            return this.onboardingCommon;
        }

        @NotNull
        public final NavigationItemV2DTO copy(@NotNull String image, @NotNull AtomActionDTO action, @NotNull String title, boolean isAdult, String backgroundImage, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboardingCommon) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            return new NavigationItemV2DTO(image, action, title, isAdult, backgroundImage, trackingInfo, onboardingCommon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationItemV2DTO)) {
                return false;
            }
            NavigationItemV2DTO navigationItemV2DTO = (NavigationItemV2DTO) other;
            return Intrinsics.d(this.image, navigationItemV2DTO.image) && Intrinsics.d(this.action, navigationItemV2DTO.action) && Intrinsics.d(this.title, navigationItemV2DTO.title) && this.isAdult == navigationItemV2DTO.isAdult && Intrinsics.d(this.backgroundImage, navigationItemV2DTO.backgroundImage) && Intrinsics.d(this.trackingInfo, navigationItemV2DTO.trackingInfo) && Intrinsics.d(this.onboardingCommon, navigationItemV2DTO.onboardingCommon);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final OnBoardingDTO getOnboardingCommon() {
            return this.onboardingCommon;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(a.b(this.action, this.image.hashCode() * 31, 31), 31, this.title), 31, this.isAdult);
            String str = this.backgroundImage;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboardingCommon;
            return hashCode2 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
        }

        public final boolean isAdult() {
            return this.isAdult;
        }

        public final void setTitle(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.title = str;
        }

        @NotNull
        public String toString() {
            String str = this.image;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.title;
            boolean z11 = this.isAdult;
            String str3 = this.backgroundImage;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            OnBoardingDTO onBoardingDTO = this.onboardingCommon;
            StringBuilder c11 = c.c("NavigationItemV2DTO(image=", str, ", action=", atomActionDTO, ", title=");
            C2880a.c(str2, ", isAdult=", ", backgroundImage=", c11, z11);
            C2638a.e(c11, str3, ", trackingInfo=", map, ", onboardingCommon=");
            c11.append(onBoardingDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    public NavigationSliderV2DTO(String str, boolean z11, @NotNull List<NavigationItemV2DTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = str;
        this.isTwoLinesTitle = z11;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationSliderV2DTO copy$default(NavigationSliderV2DTO navigationSliderV2DTO, String str, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationSliderV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            z11 = navigationSliderV2DTO.isTwoLinesTitle;
        }
        if ((i11 & 4) != 0) {
            list = navigationSliderV2DTO.items;
        }
        return navigationSliderV2DTO.copy(str, z11, list);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTwoLinesTitle() {
        return this.isTwoLinesTitle;
    }

    @NotNull
    public final List<NavigationItemV2DTO> component3() {
        return this.items;
    }

    @NotNull
    public final NavigationSliderV2DTO copy(String title, boolean isTwoLinesTitle, @NotNull List<NavigationItemV2DTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new NavigationSliderV2DTO(title, isTwoLinesTitle, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderV2DTO)) {
            return false;
        }
        NavigationSliderV2DTO navigationSliderV2DTO = (NavigationSliderV2DTO) other;
        return Intrinsics.d(this.title, navigationSliderV2DTO.title) && this.isTwoLinesTitle == navigationSliderV2DTO.isTwoLinesTitle && Intrinsics.d(this.items, navigationSliderV2DTO.items);
    }

    @NotNull
    public final List<NavigationItemV2DTO> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.items.hashCode() + C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isTwoLinesTitle);
    }

    public final boolean isTwoLinesTitle() {
        return this.isTwoLinesTitle;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        boolean z11 = this.isTwoLinesTitle;
        return C2618u.h(C4636t5.b("NavigationSliderV2DTO(title=", str, ", isTwoLinesTitle=", ", items=", z11), this.items, ")");
    }
}

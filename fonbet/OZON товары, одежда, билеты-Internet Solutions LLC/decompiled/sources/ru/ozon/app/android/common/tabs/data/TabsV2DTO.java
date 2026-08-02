package ru.ozon.app.android.common.tabs.data;

import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001f BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0006\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/tabs/data/TabsV2DTO;", "", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/Tabs;", "dsTabs", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "isSticky", "", "onboarding", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO$OnBoarding;", "commonOnboarding", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO$CommonOnBoarding;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/tabs/Tabs;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Ljava/lang/Boolean;Lru/ozon/app/android/common/tabs/data/TabsV2DTO$OnBoarding;Lru/ozon/app/android/common/tabs/data/TabsV2DTO$CommonOnBoarding;Ljava/lang/String;)V", "getTabs$annotations", "()V", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "getDsTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnboarding$annotations", "getOnboarding", "()Lru/ozon/app/android/common/tabs/data/TabsV2DTO$OnBoarding;", "getCommonOnboarding", "()Lru/ozon/app/android/common/tabs/data/TabsV2DTO$CommonOnBoarding;", "getBackgroundColor", "()Ljava/lang/String;", "OnBoarding", "CommonOnBoarding", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsV2DTO {
    private final String backgroundColor;
    private final CommonOnBoarding commonOnboarding;
    private final TabsDTO dsTabs;
    private final Boolean isSticky;
    private final OnBoarding onboarding;
    private final Tabs tabs;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/common/tabs/data/TabsV2DTO$CommonOnBoarding;", "", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "tabPosition", "", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;I)V", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getTabPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonOnBoarding {

        @NotNull
        private final OnBoardingDTO onboarding;
        private final int tabPosition;

        public CommonOnBoarding(@NotNull OnBoardingDTO onboarding, int i11) {
            Intrinsics.checkNotNullParameter(onboarding, "onboarding");
            this.onboarding = onboarding;
            this.tabPosition = i11;
        }

        public static /* synthetic */ CommonOnBoarding copy$default(CommonOnBoarding commonOnBoarding, OnBoardingDTO onBoardingDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                onBoardingDTO = commonOnBoarding.onboarding;
            }
            if ((i12 & 2) != 0) {
                i11 = commonOnBoarding.tabPosition;
            }
            return commonOnBoarding.copy(onBoardingDTO, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTabPosition() {
            return this.tabPosition;
        }

        @NotNull
        public final CommonOnBoarding copy(@NotNull OnBoardingDTO onboarding, int tabPosition) {
            Intrinsics.checkNotNullParameter(onboarding, "onboarding");
            return new CommonOnBoarding(onboarding, tabPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonOnBoarding)) {
                return false;
            }
            CommonOnBoarding commonOnBoarding = (CommonOnBoarding) other;
            return Intrinsics.d(this.onboarding, commonOnBoarding.onboarding) && this.tabPosition == commonOnBoarding.tabPosition;
        }

        @NotNull
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final int getTabPosition() {
            return this.tabPosition;
        }

        public int hashCode() {
            return Integer.hashCode(this.tabPosition) + (this.onboarding.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CommonOnBoarding(onboarding=" + this.onboarding + ", tabPosition=" + this.tabPosition + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/tabs/data/TabsV2DTO$OnBoarding;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "image", "tabPosition", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage", "getTabPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoarding {

        @NotNull
        private final String image;

        @NotNull
        private final String subtitle;
        private final int tabPosition;

        @NotNull
        private final String title;

        public OnBoarding(@NotNull String title, @NotNull String subtitle, @NotNull String image, int i11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.subtitle = subtitle;
            this.image = image;
            this.tabPosition = i11;
        }

        public static /* synthetic */ OnBoarding copy$default(OnBoarding onBoarding, String str, String str2, String str3, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = onBoarding.title;
            }
            if ((i12 & 2) != 0) {
                str2 = onBoarding.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = onBoarding.image;
            }
            if ((i12 & 8) != 0) {
                i11 = onBoarding.tabPosition;
            }
            return onBoarding.copy(str, str2, str3, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTabPosition() {
            return this.tabPosition;
        }

        @NotNull
        public final OnBoarding copy(@NotNull String title, @NotNull String subtitle, @NotNull String image, int tabPosition) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(image, "image");
            return new OnBoarding(title, subtitle, image, tabPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBoarding)) {
                return false;
            }
            OnBoarding onBoarding = (OnBoarding) other;
            return Intrinsics.d(this.title, onBoarding.title) && Intrinsics.d(this.subtitle, onBoarding.subtitle) && Intrinsics.d(this.image, onBoarding.image) && this.tabPosition == onBoarding.tabPosition;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getTabPosition() {
            return this.tabPosition;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.tabPosition) + g.a(g.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.image);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.image;
            int i11 = this.tabPosition;
            StringBuilder d11 = C3660k.d("OnBoarding(title=", str, ", subtitle=", str2, ", image=");
            d11.append(str3);
            d11.append(", tabPosition=");
            d11.append(i11);
            d11.append(")");
            return d11.toString();
        }
    }

    public TabsV2DTO(Tabs tabs, TabsDTO tabsDTO, Boolean bool, OnBoarding onBoarding, CommonOnBoarding commonOnBoarding, String str) {
        this.tabs = tabs;
        this.dsTabs = tabsDTO;
        this.isSticky = bool;
        this.onboarding = onBoarding;
        this.commonOnboarding = commonOnBoarding;
        this.backgroundColor = str;
    }

    @InterfaceC3999a
    public static /* synthetic */ void getOnboarding$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getTabs$annotations() {
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonOnBoarding getCommonOnboarding() {
        return this.commonOnboarding;
    }

    public final TabsDTO getDsTabs() {
        return this.dsTabs;
    }

    public final OnBoarding getOnboarding() {
        return this.onboarding;
    }

    public final Tabs getTabs() {
        return this.tabs;
    }

    /* renamed from: isSticky, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }
}

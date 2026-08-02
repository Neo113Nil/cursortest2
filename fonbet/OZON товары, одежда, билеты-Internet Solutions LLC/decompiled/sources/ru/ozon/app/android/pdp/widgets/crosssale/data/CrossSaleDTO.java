package ru.ozon.app.android.pdp.widgets.crosssale.data;

import An.C2439a;
import B0.A0;
import H3.c;
import I1.w;
import N3.C3660k;
import Sc.InterfaceC3999a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO;", "", "items", "", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CrossSaleItem", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CrossSaleDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CrossSaleItem> items;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000234Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jy\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "deeplink", "images", "", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Image;", "subitems", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;", "onboarding", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "commonOnboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getImages", "()Ljava/util/List;", "getSubitems", "()Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;", "getOnboarding$annotations", "()V", "getOnboarding", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "getCommonOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Image", "Subitems", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CrossSaleItem {
        public static final int $stable = 8;
        private final OnBoardingDTO commonOnboarding;
        private final String deeplink;
        private final List<Image> images;
        private final PDPOnBoardingDTO onboarding;
        private final Subitems subitems;
        private final String subtitle;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Image;", "", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image {
            public static final int $stable = 0;

            @NotNull
            private final String url;

            public Image(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.url;
                }
                return image.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final Image copy(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Image(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Image) && Intrinsics.d(this.url, ((Image) other).url);
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Image(url=", this.url, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem$Subitems;", "", "crossSaleTitle", "", "items", "", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCrossSaleTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Subitems {
            public static final int $stable = 8;

            @NotNull
            private final String crossSaleTitle;

            @NotNull
            private final List<CrossSaleItem> items;

            public Subitems(@NotNull String crossSaleTitle, @NotNull List<CrossSaleItem> items) {
                Intrinsics.checkNotNullParameter(crossSaleTitle, "crossSaleTitle");
                Intrinsics.checkNotNullParameter(items, "items");
                this.crossSaleTitle = crossSaleTitle;
                this.items = items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Subitems copy$default(Subitems subitems, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = subitems.crossSaleTitle;
                }
                if ((i11 & 2) != 0) {
                    list = subitems.items;
                }
                return subitems.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getCrossSaleTitle() {
                return this.crossSaleTitle;
            }

            @NotNull
            public final List<CrossSaleItem> component2() {
                return this.items;
            }

            @NotNull
            public final Subitems copy(@NotNull String crossSaleTitle, @NotNull List<CrossSaleItem> items) {
                Intrinsics.checkNotNullParameter(crossSaleTitle, "crossSaleTitle");
                Intrinsics.checkNotNullParameter(items, "items");
                return new Subitems(crossSaleTitle, items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Subitems)) {
                    return false;
                }
                Subitems subitems = (Subitems) other;
                return Intrinsics.d(this.crossSaleTitle, subitems.crossSaleTitle) && Intrinsics.d(this.items, subitems.items);
            }

            @NotNull
            public final String getCrossSaleTitle() {
                return this.crossSaleTitle;
            }

            @NotNull
            public final List<CrossSaleItem> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.items.hashCode() + (this.crossSaleTitle.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("Subitems(crossSaleTitle=", this.crossSaleTitle, ", items=", ")", this.items);
            }
        }

        public CrossSaleItem(@NotNull String title, String str, String str2, List<Image> list, Subitems subitems, PDPOnBoardingDTO pDPOnBoardingDTO, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.deeplink = str2;
            this.images = list;
            this.subitems = subitems;
            this.onboarding = pDPOnBoardingDTO;
            this.commonOnboarding = onBoardingDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CrossSaleItem copy$default(CrossSaleItem crossSaleItem, String str, String str2, String str3, List list, Subitems subitems, PDPOnBoardingDTO pDPOnBoardingDTO, OnBoardingDTO onBoardingDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = crossSaleItem.title;
            }
            if ((i11 & 2) != 0) {
                str2 = crossSaleItem.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = crossSaleItem.deeplink;
            }
            if ((i11 & 8) != 0) {
                list = crossSaleItem.images;
            }
            if ((i11 & 16) != 0) {
                subitems = crossSaleItem.subitems;
            }
            if ((i11 & 32) != 0) {
                pDPOnBoardingDTO = crossSaleItem.onboarding;
            }
            if ((i11 & 64) != 0) {
                onBoardingDTO = crossSaleItem.commonOnboarding;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = crossSaleItem.trackingInfo;
            }
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            Map map2 = map;
            Subitems subitems2 = subitems;
            PDPOnBoardingDTO pDPOnBoardingDTO2 = pDPOnBoardingDTO;
            return crossSaleItem.copy(str, str2, str3, list, subitems2, pDPOnBoardingDTO2, onBoardingDTO2, map2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getOnboarding$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final List<Image> component4() {
            return this.images;
        }

        /* renamed from: component5, reason: from getter */
        public final Subitems getSubitems() {
            return this.subitems;
        }

        /* renamed from: component6, reason: from getter */
        public final PDPOnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        /* renamed from: component7, reason: from getter */
        public final OnBoardingDTO getCommonOnboarding() {
            return this.commonOnboarding;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final CrossSaleItem copy(@NotNull String title, String subtitle, String deeplink, List<Image> images, Subitems subitems, PDPOnBoardingDTO onboarding, OnBoardingDTO commonOnboarding, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CrossSaleItem(title, subtitle, deeplink, images, subitems, onboarding, commonOnboarding, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrossSaleItem)) {
                return false;
            }
            CrossSaleItem crossSaleItem = (CrossSaleItem) other;
            return Intrinsics.d(this.title, crossSaleItem.title) && Intrinsics.d(this.subtitle, crossSaleItem.subtitle) && Intrinsics.d(this.deeplink, crossSaleItem.deeplink) && Intrinsics.d(this.images, crossSaleItem.images) && Intrinsics.d(this.subitems, crossSaleItem.subitems) && Intrinsics.d(this.onboarding, crossSaleItem.onboarding) && Intrinsics.d(this.commonOnboarding, crossSaleItem.commonOnboarding) && Intrinsics.d(this.trackingInfo, crossSaleItem.trackingInfo);
        }

        public final OnBoardingDTO getCommonOnboarding() {
            return this.commonOnboarding;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final List<Image> getImages() {
            return this.images;
        }

        public final PDPOnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        public final Subitems getSubitems() {
            return this.subitems;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deeplink;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Image> list = this.images;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Subitems subitems = this.subitems;
            int hashCode5 = (hashCode4 + (subitems == null ? 0 : subitems.hashCode())) * 31;
            PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
            int hashCode6 = (hashCode5 + (pDPOnBoardingDTO == null ? 0 : pDPOnBoardingDTO.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.commonOnboarding;
            int hashCode7 = (hashCode6 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.deeplink;
            List<Image> list = this.images;
            Subitems subitems = this.subitems;
            PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
            OnBoardingDTO onBoardingDTO = this.commonOnboarding;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("CrossSaleItem(title=", str, ", subtitle=", str2, ", deeplink=");
            w.d(str3, ", images=", ", subitems=", d11, list);
            d11.append(subitems);
            d11.append(", onboarding=");
            d11.append(pDPOnBoardingDTO);
            d11.append(", commonOnboarding=");
            d11.append(onBoardingDTO);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }
    }

    public CrossSaleDTO(@NotNull List<CrossSaleItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CrossSaleDTO copy$default(CrossSaleDTO crossSaleDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = crossSaleDTO.items;
        }
        return crossSaleDTO.copy(list);
    }

    @NotNull
    public final List<CrossSaleItem> component1() {
        return this.items;
    }

    @NotNull
    public final CrossSaleDTO copy(@NotNull List<CrossSaleItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CrossSaleDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CrossSaleDTO) && Intrinsics.d(this.items, ((CrossSaleDTO) other).items);
    }

    @NotNull
    public final List<CrossSaleItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("CrossSaleDTO(items=", ")", this.items);
    }
}

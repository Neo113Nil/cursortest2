package ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.data;

import B0.A0;
import B90.C2619v;
import D40.a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import T7.P;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bannerList", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBannerList", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Banner", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoBannerB2BDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Banner> bannerList;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner;", "", "backgroundColor", "", "darkBackgroundColor", "bgImage", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner$BgImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "isRounded", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner$BgImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getDarkBackgroundColor", "getBgImage", "()Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner$BgImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "BgImageDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Banner {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundColor;
        private final BgImageDTO bgImage;
        private final String darkBackgroundColor;

        @NotNull
        private final TextAtom description;
        private final boolean isRounded;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner$BgImageDTO;", "", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BgImageDTO {
            public static final int $stable = 0;

            @NotNull
            private final String url;

            public BgImageDTO(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public static /* synthetic */ BgImageDTO copy$default(BgImageDTO bgImageDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bgImageDTO.url;
                }
                return bgImageDTO.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final BgImageDTO copy(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new BgImageDTO(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BgImageDTO) && Intrinsics.d(this.url, ((BgImageDTO) other).url);
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
                return A0.b("BgImageDTO(url=", this.url, ")");
            }
        }

        public Banner(@NotNull String backgroundColor, String str, BgImageDTO bgImageDTO, @NotNull TextAtom title, @NotNull TextAtom description, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.backgroundColor = backgroundColor;
            this.darkBackgroundColor = str;
            this.bgImage = bgImageDTO;
            this.title = title;
            this.description = description;
            this.isRounded = z11;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, String str, String str2, BgImageDTO bgImageDTO, TextAtom textAtom, TextAtom textAtom2, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = banner.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = banner.darkBackgroundColor;
            }
            if ((i11 & 4) != 0) {
                bgImageDTO = banner.bgImage;
            }
            if ((i11 & 8) != 0) {
                textAtom = banner.title;
            }
            if ((i11 & 16) != 0) {
                textAtom2 = banner.description;
            }
            if ((i11 & 32) != 0) {
                z11 = banner.isRounded;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = banner.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = banner.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            TextAtom textAtom3 = textAtom2;
            boolean z12 = z11;
            return banner.copy(str, str2, bgImageDTO, textAtom, textAtom3, z12, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final BgImageDTO getBgImage() {
            return this.bgImage;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsRounded() {
            return this.isRounded;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final Banner copy(@NotNull String backgroundColor, String darkBackgroundColor, BgImageDTO bgImage, @NotNull TextAtom title, @NotNull TextAtom description, boolean isRounded, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Banner(backgroundColor, darkBackgroundColor, bgImage, title, description, isRounded, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.backgroundColor, banner.backgroundColor) && Intrinsics.d(this.darkBackgroundColor, banner.darkBackgroundColor) && Intrinsics.d(this.bgImage, banner.bgImage) && Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.description, banner.description) && this.isRounded == banner.isRounded && Intrinsics.d(this.action, banner.action) && Intrinsics.d(this.trackingInfo, banner.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BgImageDTO getBgImage() {
            return this.bgImage;
        }

        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.backgroundColor.hashCode() * 31;
            String str = this.darkBackgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            BgImageDTO bgImageDTO = this.bgImage;
            int a11 = C3532b.a(C2619v.b(C2619v.b((hashCode2 + (bgImageDTO == null ? 0 : bgImageDTO.hashCode())) * 31, 31, this.title), 31, this.description), 31, this.isRounded);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isRounded() {
            return this.isRounded;
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.darkBackgroundColor;
            BgImageDTO bgImageDTO = this.bgImage;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.description;
            boolean z11 = this.isRounded;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("Banner(backgroundColor=", str, ", darkBackgroundColor=", str2, ", bgImage=");
            d11.append(bgImageDTO);
            d11.append(", title=");
            d11.append(textAtom);
            d11.append(", description=");
            d11.append(textAtom2);
            d11.append(", isRounded=");
            d11.append(z11);
            d11.append(", action=");
            return a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public PromoBannerB2BDTO(TextAtom textAtom, @NotNull List<Banner> bannerList, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(bannerList, "bannerList");
        this.title = textAtom;
        this.bannerList = bannerList;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoBannerB2BDTO copy$default(PromoBannerB2BDTO promoBannerB2BDTO, TextAtom textAtom, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = promoBannerB2BDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = promoBannerB2BDTO.bannerList;
        }
        if ((i11 & 4) != 0) {
            map = promoBannerB2BDTO.trackingInfo;
        }
        return promoBannerB2BDTO.copy(textAtom, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Banner> component2() {
        return this.bannerList;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final PromoBannerB2BDTO copy(TextAtom title, @NotNull List<Banner> bannerList, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(bannerList, "bannerList");
        return new PromoBannerB2BDTO(title, bannerList, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBannerB2BDTO)) {
            return false;
        }
        PromoBannerB2BDTO promoBannerB2BDTO = (PromoBannerB2BDTO) other;
        return Intrinsics.d(this.title, promoBannerB2BDTO.title) && Intrinsics.d(this.bannerList, promoBannerB2BDTO.bannerList) && Intrinsics.d(this.trackingInfo, promoBannerB2BDTO.trackingInfo);
    }

    @NotNull
    public final List<Banner> getBannerList() {
        return this.bannerList;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int b11 = g.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.bannerList);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        List<Banner> list = this.bannerList;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PromoBannerB2BDTO(title=");
        sb2.append(textAtom);
        sb2.append(", bannerList=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}

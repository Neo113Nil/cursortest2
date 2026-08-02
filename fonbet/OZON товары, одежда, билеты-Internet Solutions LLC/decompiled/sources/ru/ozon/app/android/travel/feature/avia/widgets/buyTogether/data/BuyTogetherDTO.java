package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data;

import B90.C2618u;
import B90.C2619v;
import G.g;
import J0.C3349u1;
import Ul.C4070a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "allServicesButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", ResultDTO.CONTENT_TYPE_SERVICES, "", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ServiceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAllServicesButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getServices", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ServiceDTO", "ImageDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BuyTogetherDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.SmallBorderlessButton allServicesButton;

    @NotNull
    private final List<ServiceDTO> services;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ImageDTO;", "", "imageURL", "", "imageBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageURL", "()Ljava/lang/String;", "getImageBackgroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageDTO {
        public static final int $stable = 0;
        private final String imageBackgroundColor;

        @NotNull
        private final String imageURL;

        public ImageDTO(@NotNull String imageURL, String str) {
            Intrinsics.checkNotNullParameter(imageURL, "imageURL");
            this.imageURL = imageURL;
            this.imageBackgroundColor = str;
        }

        public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageDTO.imageURL;
            }
            if ((i11 & 2) != 0) {
                str2 = imageDTO.imageBackgroundColor;
            }
            return imageDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImageURL() {
            return this.imageURL;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageBackgroundColor() {
            return this.imageBackgroundColor;
        }

        @NotNull
        public final ImageDTO copy(@NotNull String imageURL, String imageBackgroundColor) {
            Intrinsics.checkNotNullParameter(imageURL, "imageURL");
            return new ImageDTO(imageURL, imageBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageDTO)) {
                return false;
            }
            ImageDTO imageDTO = (ImageDTO) other;
            return Intrinsics.d(this.imageURL, imageDTO.imageURL) && Intrinsics.d(this.imageBackgroundColor, imageDTO.imageBackgroundColor);
        }

        public final String getImageBackgroundColor() {
            return this.imageBackgroundColor;
        }

        @NotNull
        public final String getImageURL() {
            return this.imageURL;
        }

        public int hashCode() {
            int hashCode = this.imageURL.hashCode() * 31;
            String str = this.imageBackgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ImageDTO(imageURL=", this.imageURL, ", imageBackgroundColor=", this.imageBackgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ServiceDTO;", "", "image", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ImageDTO;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "addServiceButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "borderColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/String;Ljava/util/Map;)V", "getImage", "()Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ImageDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getAddServiceButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBorderColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServiceDTO {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3Atom.SmallIconButton addServiceButton;

        @NotNull
        private final String borderColor;
        private final TextAtom description;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextAtom price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ServiceDTO(@NotNull ImageDTO image, @NotNull TextAtom price, TextAtom textAtom, @NotNull ButtonV3Atom.SmallIconButton addServiceButton, @NotNull String borderColor, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(addServiceButton, "addServiceButton");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            this.image = image;
            this.price = price;
            this.description = textAtom;
            this.addServiceButton = addServiceButton;
            this.borderColor = borderColor;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ServiceDTO copy$default(ServiceDTO serviceDTO, ImageDTO imageDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = serviceDTO.image;
            }
            if ((i11 & 2) != 0) {
                textAtom = serviceDTO.price;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = serviceDTO.description;
            }
            if ((i11 & 8) != 0) {
                smallIconButton = serviceDTO.addServiceButton;
            }
            if ((i11 & 16) != 0) {
                str = serviceDTO.borderColor;
            }
            if ((i11 & 32) != 0) {
                map = serviceDTO.trackingInfo;
            }
            String str2 = str;
            Map map2 = map;
            return serviceDTO.copy(imageDTO, textAtom, textAtom2, smallIconButton, str2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getAddServiceButton() {
            return this.addServiceButton;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final ServiceDTO copy(@NotNull ImageDTO image, @NotNull TextAtom price, TextAtom description, @NotNull ButtonV3Atom.SmallIconButton addServiceButton, @NotNull String borderColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(addServiceButton, "addServiceButton");
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            return new ServiceDTO(image, price, description, addServiceButton, borderColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceDTO)) {
                return false;
            }
            ServiceDTO serviceDTO = (ServiceDTO) other;
            return Intrinsics.d(this.image, serviceDTO.image) && Intrinsics.d(this.price, serviceDTO.price) && Intrinsics.d(this.description, serviceDTO.description) && Intrinsics.d(this.addServiceButton, serviceDTO.addServiceButton) && Intrinsics.d(this.borderColor, serviceDTO.borderColor) && Intrinsics.d(this.trackingInfo, serviceDTO.trackingInfo);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getAddServiceButton() {
            return this.addServiceButton;
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.image.hashCode() * 31, 31, this.price);
            TextAtom textAtom = this.description;
            int a11 = g.a(C3349u1.d(this.addServiceButton, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.borderColor);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextAtom textAtom = this.price;
            TextAtom textAtom2 = this.description;
            ButtonV3Atom.SmallIconButton smallIconButton = this.addServiceButton;
            String str = this.borderColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ServiceDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", price=");
            sb2.append(textAtom);
            sb2.append(", description=");
            sb2.append(textAtom2);
            sb2.append(", addServiceButton=");
            sb2.append(smallIconButton);
            sb2.append(", borderColor=");
            return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
        }
    }

    public BuyTogetherDTO(@NotNull TextAtom title, @NotNull ButtonV3Atom.SmallBorderlessButton allServicesButton, @NotNull List<ServiceDTO> services) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allServicesButton, "allServicesButton");
        Intrinsics.checkNotNullParameter(services, "services");
        this.title = title;
        this.allServicesButton = allServicesButton;
        this.services = services;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuyTogetherDTO copy$default(BuyTogetherDTO buyTogetherDTO, TextAtom textAtom, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = buyTogetherDTO.title;
        }
        if ((i11 & 2) != 0) {
            smallBorderlessButton = buyTogetherDTO.allServicesButton;
        }
        if ((i11 & 4) != 0) {
            list = buyTogetherDTO.services;
        }
        return buyTogetherDTO.copy(textAtom, smallBorderlessButton, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getAllServicesButton() {
        return this.allServicesButton;
    }

    @NotNull
    public final List<ServiceDTO> component3() {
        return this.services;
    }

    @NotNull
    public final BuyTogetherDTO copy(@NotNull TextAtom title, @NotNull ButtonV3Atom.SmallBorderlessButton allServicesButton, @NotNull List<ServiceDTO> services) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(allServicesButton, "allServicesButton");
        Intrinsics.checkNotNullParameter(services, "services");
        return new BuyTogetherDTO(title, allServicesButton, services);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyTogetherDTO)) {
            return false;
        }
        BuyTogetherDTO buyTogetherDTO = (BuyTogetherDTO) other;
        return Intrinsics.d(this.title, buyTogetherDTO.title) && Intrinsics.d(this.allServicesButton, buyTogetherDTO.allServicesButton) && Intrinsics.d(this.services, buyTogetherDTO.services);
    }

    @NotNull
    public final ButtonV3Atom.SmallBorderlessButton getAllServicesButton() {
        return this.allServicesButton;
    }

    @NotNull
    public final List<ServiceDTO> getServices() {
        return this.services;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.services.hashCode() + ((this.allServicesButton.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.allServicesButton;
        List<ServiceDTO> list = this.services;
        StringBuilder sb2 = new StringBuilder("BuyTogetherDTO(title=");
        sb2.append(textAtom);
        sb2.append(", allServicesButton=");
        sb2.append(smallBorderlessButton);
        sb2.append(", services=");
        return C2618u.h(sb2, list, ")");
    }

    public BuyTogetherDTO(TextAtom textAtom, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, smallBorderlessButton, (i11 & 4) != 0 ? K.f71697a : list);
    }
}

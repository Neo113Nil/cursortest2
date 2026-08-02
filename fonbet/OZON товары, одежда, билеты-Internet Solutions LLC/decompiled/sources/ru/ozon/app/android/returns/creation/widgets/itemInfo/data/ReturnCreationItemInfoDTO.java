package ru.ozon.app.android.returns.creation.widgets.itemInfo.data;

import D40.d;
import Fm.C3051a;
import G.g;
import Ns.b;
import Pk0.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ReturnCreationItemInfoDTO;", "", "image", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "backgroundColor", "", "validationText", "isSticky", "", "<init>", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "getImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getBackgroundColor", "()Ljava/lang/String;", "getValidationText", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationItemInfoDTO {
    public static final int $stable = PriceDTO.$stable | ImageDTO.$stable;

    @NotNull
    private final String backgroundColor;
    private final TextDTO description;

    @NotNull
    private final ImageDTO image;
    private final boolean isSticky;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;
    private final TextDTO validationText;

    public ReturnCreationItemInfoDTO(@NotNull ImageDTO image, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, @NotNull String backgroundColor, TextDTO textDTO2, boolean z11) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.image = image;
        this.price = price;
        this.name = name;
        this.description = textDTO;
        this.backgroundColor = backgroundColor;
        this.validationText = textDTO2;
        this.isSticky = z11;
    }

    public static /* synthetic */ ReturnCreationItemInfoDTO copy$default(ReturnCreationItemInfoDTO returnCreationItemInfoDTO, ImageDTO imageDTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, String str, TextDTO textDTO3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = returnCreationItemInfoDTO.image;
        }
        if ((i11 & 2) != 0) {
            priceDTO = returnCreationItemInfoDTO.price;
        }
        if ((i11 & 4) != 0) {
            textDTO = returnCreationItemInfoDTO.name;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = returnCreationItemInfoDTO.description;
        }
        if ((i11 & 16) != 0) {
            str = returnCreationItemInfoDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            textDTO3 = returnCreationItemInfoDTO.validationText;
        }
        if ((i11 & 64) != 0) {
            z11 = returnCreationItemInfoDTO.isSticky;
        }
        TextDTO textDTO4 = textDTO3;
        boolean z12 = z11;
        String str2 = str;
        TextDTO textDTO5 = textDTO;
        return returnCreationItemInfoDTO.copy(imageDTO, priceDTO, textDTO5, textDTO2, str2, textDTO4, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getValidationText() {
        return this.validationText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public final ReturnCreationItemInfoDTO copy(@NotNull ImageDTO image, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO description, @NotNull String backgroundColor, TextDTO validationText, boolean isSticky) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new ReturnCreationItemInfoDTO(image, price, name, description, backgroundColor, validationText, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationItemInfoDTO)) {
            return false;
        }
        ReturnCreationItemInfoDTO returnCreationItemInfoDTO = (ReturnCreationItemInfoDTO) other;
        return Intrinsics.d(this.image, returnCreationItemInfoDTO.image) && Intrinsics.d(this.price, returnCreationItemInfoDTO.price) && Intrinsics.d(this.name, returnCreationItemInfoDTO.name) && Intrinsics.d(this.description, returnCreationItemInfoDTO.description) && Intrinsics.d(this.backgroundColor, returnCreationItemInfoDTO.backgroundColor) && Intrinsics.d(this.validationText, returnCreationItemInfoDTO.validationText) && this.isSticky == returnCreationItemInfoDTO.isSticky;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    public int hashCode() {
        int a11 = b.a(this.name, C3051a.b(this.price, this.image.hashCode() * 31, 31), 31);
        TextDTO textDTO = this.description;
        int a12 = g.a((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.backgroundColor);
        TextDTO textDTO2 = this.validationText;
        return Boolean.hashCode(this.isSticky) + ((a12 + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.description;
        String str = this.backgroundColor;
        TextDTO textDTO3 = this.validationText;
        boolean z11 = this.isSticky;
        StringBuilder sb2 = new StringBuilder("ReturnCreationItemInfoDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", name=");
        d.e(", description=", ", backgroundColor=", sb2, textDTO, textDTO2);
        sb2.append(str);
        sb2.append(", validationText=");
        sb2.append(textDTO3);
        sb2.append(", isSticky=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ ReturnCreationItemInfoDTO(ImageDTO imageDTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, String str, TextDTO textDTO3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, priceDTO, textDTO, textDTO2, str, textDTO3, (i11 & 64) != 0 ? true : z11);
    }
}

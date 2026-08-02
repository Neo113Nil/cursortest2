package ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation;

import D3.g;
import Fm.C3051a;
import Ns.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b3\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b:\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010\u001b¨\u0006C"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "image", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "csmaImage", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "quantitySelector", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "validationText", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "deleteButton", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "getCsmaImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getValidationText", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Ljava/lang/String;", "getBackgroundColor", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ItemVI implements c {
    private final DisclaimerAtom annotation;
    private final String backgroundColor;
    private final CommonControlSettings common;
    private final ImageVO csmaImage;
    private final IconButtonV3DTO deleteButton;
    private final TextDTO description;
    private final long id;
    private final IconDTO image;

    @NotNull
    private final TextDTO name;

    @NotNull
    private final PriceDTO price;
    private final RmsQuantitySelector quantitySelector;
    private final TextDTO validationText;

    public ItemVI(long j11, IconDTO iconDTO, ImageVO imageVO, @NotNull PriceDTO price, @NotNull TextDTO name, TextDTO textDTO, RmsQuantitySelector rmsQuantitySelector, CommonControlSettings commonControlSettings, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, DisclaimerAtom disclaimerAtom, String str) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j11;
        this.image = iconDTO;
        this.csmaImage = imageVO;
        this.price = price;
        this.name = name;
        this.description = textDTO;
        this.quantitySelector = rmsQuantitySelector;
        this.common = commonControlSettings;
        this.validationText = textDTO2;
        this.deleteButton = iconButtonV3DTO;
        this.annotation = disclaimerAtom;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemVI)) {
            return false;
        }
        ItemVI itemVI = (ItemVI) other;
        return this.id == itemVI.id && Intrinsics.d(this.image, itemVI.image) && Intrinsics.d(this.csmaImage, itemVI.csmaImage) && Intrinsics.d(this.price, itemVI.price) && Intrinsics.d(this.name, itemVI.name) && Intrinsics.d(this.description, itemVI.description) && Intrinsics.d(this.quantitySelector, itemVI.quantitySelector) && Intrinsics.d(this.common, itemVI.common) && Intrinsics.d(this.validationText, itemVI.validationText) && Intrinsics.d(this.deleteButton, itemVI.deleteButton) && Intrinsics.d(this.annotation, itemVI.annotation) && Intrinsics.d(this.backgroundColor, itemVI.backgroundColor);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ImageVO getCsmaImage() {
        return this.csmaImage;
    }

    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconDTO getImage() {
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

    public final RmsQuantitySelector getQuantitySelector() {
        return this.quantitySelector;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        IconDTO iconDTO = this.image;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ImageVO imageVO = this.csmaImage;
        int a11 = b.a(this.name, C3051a.b(this.price, (hashCode2 + (imageVO == null ? 0 : imageVO.hashCode())) * 31, 31), 31);
        TextDTO textDTO = this.description;
        int hashCode3 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
        int hashCode4 = (hashCode3 + (rmsQuantitySelector == null ? 0 : rmsQuantitySelector.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        TextDTO textDTO2 = this.validationText;
        int hashCode6 = (hashCode5 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        int hashCode7 = (hashCode6 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode8 = (hashCode7 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.image;
        ImageVO imageVO = this.csmaImage;
        PriceDTO priceDTO = this.price;
        TextDTO textDTO = this.name;
        TextDTO textDTO2 = this.description;
        RmsQuantitySelector rmsQuantitySelector = this.quantitySelector;
        CommonControlSettings commonControlSettings = this.common;
        TextDTO textDTO3 = this.validationText;
        IconButtonV3DTO iconButtonV3DTO = this.deleteButton;
        DisclaimerAtom disclaimerAtom = this.annotation;
        String str = this.backgroundColor;
        StringBuilder b11 = D40.c.b("ItemVI(id=", j11, ", image=", iconDTO);
        b11.append(", csmaImage=");
        b11.append(imageVO);
        b11.append(", price=");
        b11.append(priceDTO);
        g.i(", name=", ", description=", b11, textDTO, textDTO2);
        b11.append(", quantitySelector=");
        b11.append(rmsQuantitySelector);
        b11.append(", common=");
        b11.append(commonControlSettings);
        b11.append(", validationText=");
        b11.append(textDTO3);
        b11.append(", deleteButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", annotation=");
        b11.append(disclaimerAtom);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}

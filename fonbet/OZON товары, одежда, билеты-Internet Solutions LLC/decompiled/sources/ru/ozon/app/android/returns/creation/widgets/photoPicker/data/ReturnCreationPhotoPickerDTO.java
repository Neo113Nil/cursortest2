package ru.ozon.app.android.returns.creation.widgets.photoPicker.data;

import B0.C2454a;
import De.C2859b;
import Nh.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0085\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u000fHÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(¨\u0006="}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ReturnCreationPhotoPickerDTO;", "", "item", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "emptyStateImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "existingImages", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "minimalLimit", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "maxCount", "", "uploadImageAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "continueButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addPhotoButton", "addMorePhotoButton", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;ILru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getItem", "()Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getEmptyStateImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getExistingImages", "()Ljava/util/List;", "getMinimalLimit", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "getMaxCount", "()I", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddPhotoButton", "getAddMorePhotoButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationPhotoPickerDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO addMorePhotoButton;

    @NotNull
    private final ButtonV3DTO addPhotoButton;

    @NotNull
    private final ButtonV3DTO continueButton;

    @NotNull
    private final ImageDTO emptyStateImage;
    private final List<SignedLinkDTO> existingImages;
    private final ItemDTO item;
    private final int maxCount;
    private final MinimalLimit minimalLimit;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    public ReturnCreationPhotoPickerDTO(ItemDTO itemDTO, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ImageDTO emptyStateImage, List<SignedLinkDTO> list, MinimalLimit minimalLimit, int i11, @NotNull AtomActionDTO uploadImageAction, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(emptyStateImage, "emptyStateImage");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        this.item = itemDTO;
        this.title = title;
        this.subtitle = subtitle;
        this.emptyStateImage = emptyStateImage;
        this.existingImages = list;
        this.minimalLimit = minimalLimit;
        this.maxCount = i11;
        this.uploadImageAction = uploadImageAction;
        this.continueButton = continueButton;
        this.addPhotoButton = addPhotoButton;
        this.addMorePhotoButton = buttonV3DTO;
    }

    public static /* synthetic */ ReturnCreationPhotoPickerDTO copy$default(ReturnCreationPhotoPickerDTO returnCreationPhotoPickerDTO, ItemDTO itemDTO, TextDTO textDTO, TextDTO textDTO2, ImageDTO imageDTO, List list, MinimalLimit minimalLimit, int i11, AtomActionDTO atomActionDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            itemDTO = returnCreationPhotoPickerDTO.item;
        }
        if ((i12 & 2) != 0) {
            textDTO = returnCreationPhotoPickerDTO.title;
        }
        if ((i12 & 4) != 0) {
            textDTO2 = returnCreationPhotoPickerDTO.subtitle;
        }
        if ((i12 & 8) != 0) {
            imageDTO = returnCreationPhotoPickerDTO.emptyStateImage;
        }
        if ((i12 & 16) != 0) {
            list = returnCreationPhotoPickerDTO.existingImages;
        }
        if ((i12 & 32) != 0) {
            minimalLimit = returnCreationPhotoPickerDTO.minimalLimit;
        }
        if ((i12 & 64) != 0) {
            i11 = returnCreationPhotoPickerDTO.maxCount;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            atomActionDTO = returnCreationPhotoPickerDTO.uploadImageAction;
        }
        if ((i12 & 256) != 0) {
            buttonV3DTO = returnCreationPhotoPickerDTO.continueButton;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            buttonV3DTO2 = returnCreationPhotoPickerDTO.addPhotoButton;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            buttonV3DTO3 = returnCreationPhotoPickerDTO.addMorePhotoButton;
        }
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
        ButtonV3DTO buttonV3DTO5 = buttonV3DTO3;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        ButtonV3DTO buttonV3DTO6 = buttonV3DTO;
        MinimalLimit minimalLimit2 = minimalLimit;
        int i13 = i11;
        List list2 = list;
        TextDTO textDTO3 = textDTO2;
        return returnCreationPhotoPickerDTO.copy(itemDTO, textDTO, textDTO3, imageDTO, list2, minimalLimit2, i13, atomActionDTO2, buttonV3DTO6, buttonV3DTO4, buttonV3DTO5);
    }

    /* renamed from: component1, reason: from getter */
    public final ItemDTO getItem() {
        return this.item;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ButtonV3DTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    /* renamed from: component11, reason: from getter */
    public final ButtonV3DTO getAddMorePhotoButton() {
        return this.addMorePhotoButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ImageDTO getEmptyStateImage() {
        return this.emptyStateImage;
    }

    public final List<SignedLinkDTO> component5() {
        return this.existingImages;
    }

    /* renamed from: component6, reason: from getter */
    public final MinimalLimit getMinimalLimit() {
        return this.minimalLimit;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    public final ReturnCreationPhotoPickerDTO copy(ItemDTO item, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ImageDTO emptyStateImage, List<SignedLinkDTO> existingImages, MinimalLimit minimalLimit, int maxCount, @NotNull AtomActionDTO uploadImageAction, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO addMorePhotoButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(emptyStateImage, "emptyStateImage");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        return new ReturnCreationPhotoPickerDTO(item, title, subtitle, emptyStateImage, existingImages, minimalLimit, maxCount, uploadImageAction, continueButton, addPhotoButton, addMorePhotoButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationPhotoPickerDTO)) {
            return false;
        }
        ReturnCreationPhotoPickerDTO returnCreationPhotoPickerDTO = (ReturnCreationPhotoPickerDTO) other;
        return Intrinsics.d(this.item, returnCreationPhotoPickerDTO.item) && Intrinsics.d(this.title, returnCreationPhotoPickerDTO.title) && Intrinsics.d(this.subtitle, returnCreationPhotoPickerDTO.subtitle) && Intrinsics.d(this.emptyStateImage, returnCreationPhotoPickerDTO.emptyStateImage) && Intrinsics.d(this.existingImages, returnCreationPhotoPickerDTO.existingImages) && Intrinsics.d(this.minimalLimit, returnCreationPhotoPickerDTO.minimalLimit) && this.maxCount == returnCreationPhotoPickerDTO.maxCount && Intrinsics.d(this.uploadImageAction, returnCreationPhotoPickerDTO.uploadImageAction) && Intrinsics.d(this.continueButton, returnCreationPhotoPickerDTO.continueButton) && Intrinsics.d(this.addPhotoButton, returnCreationPhotoPickerDTO.addPhotoButton) && Intrinsics.d(this.addMorePhotoButton, returnCreationPhotoPickerDTO.addMorePhotoButton);
    }

    public final ButtonV3DTO getAddMorePhotoButton() {
        return this.addMorePhotoButton;
    }

    @NotNull
    public final ButtonV3DTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    public final ImageDTO getEmptyStateImage() {
        return this.emptyStateImage;
    }

    public final List<SignedLinkDTO> getExistingImages() {
        return this.existingImages;
    }

    public final ItemDTO getItem() {
        return this.item;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final MinimalLimit getMinimalLimit() {
        return this.minimalLimit;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    public int hashCode() {
        ItemDTO itemDTO = this.item;
        int b11 = a.b(this.emptyStateImage, b.a(this.subtitle, b.a(this.title, (itemDTO == null ? 0 : itemDTO.hashCode()) * 31, 31), 31), 31);
        List<SignedLinkDTO> list = this.existingImages;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        MinimalLimit minimalLimit = this.minimalLimit;
        int c11 = C2859b.c(this.addPhotoButton, C2859b.c(this.continueButton, Ih.a.b(this.uploadImageAction, C2454a.a(this.maxCount, (hashCode + (minimalLimit == null ? 0 : minimalLimit.hashCode())) * 31, 31), 31), 31), 31);
        ButtonV3DTO buttonV3DTO = this.addMorePhotoButton;
        return c11 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReturnCreationPhotoPickerDTO(item=" + this.item + ", title=" + this.title + ", subtitle=" + this.subtitle + ", emptyStateImage=" + this.emptyStateImage + ", existingImages=" + this.existingImages + ", minimalLimit=" + this.minimalLimit + ", maxCount=" + this.maxCount + ", uploadImageAction=" + this.uploadImageAction + ", continueButton=" + this.continueButton + ", addPhotoButton=" + this.addPhotoButton + ", addMorePhotoButton=" + this.addMorePhotoButton + ")";
    }
}

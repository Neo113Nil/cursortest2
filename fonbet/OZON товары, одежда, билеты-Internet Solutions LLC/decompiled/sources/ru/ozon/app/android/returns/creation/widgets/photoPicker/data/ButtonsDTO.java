package ru.ozon.app.android.returns.creation.widgets.photoPicker.data;

import De.C2859b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = false)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/ButtonsDTO;", "", "uploadImageAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "continueButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addPhotoButton", "addMorePhotoButton", "minimalLimit", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "maxCount", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;I)V", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddPhotoButton", "getAddMorePhotoButton", "getMinimalLimit", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "getMaxCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonsDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO addMorePhotoButton;

    @NotNull
    private final ButtonV3DTO addPhotoButton;

    @NotNull
    private final ButtonV3DTO continueButton;
    private final int maxCount;
    private final MinimalLimit minimalLimit;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    public ButtonsDTO(@NotNull AtomActionDTO uploadImageAction, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO buttonV3DTO, MinimalLimit minimalLimit, int i11) {
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        this.uploadImageAction = uploadImageAction;
        this.continueButton = continueButton;
        this.addPhotoButton = addPhotoButton;
        this.addMorePhotoButton = buttonV3DTO;
        this.minimalLimit = minimalLimit;
        this.maxCount = i11;
    }

    public static /* synthetic */ ButtonsDTO copy$default(ButtonsDTO buttonsDTO, AtomActionDTO atomActionDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, MinimalLimit minimalLimit, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            atomActionDTO = buttonsDTO.uploadImageAction;
        }
        if ((i12 & 2) != 0) {
            buttonV3DTO = buttonsDTO.continueButton;
        }
        if ((i12 & 4) != 0) {
            buttonV3DTO2 = buttonsDTO.addPhotoButton;
        }
        if ((i12 & 8) != 0) {
            buttonV3DTO3 = buttonsDTO.addMorePhotoButton;
        }
        if ((i12 & 16) != 0) {
            minimalLimit = buttonsDTO.minimalLimit;
        }
        if ((i12 & 32) != 0) {
            i11 = buttonsDTO.maxCount;
        }
        MinimalLimit minimalLimit2 = minimalLimit;
        int i13 = i11;
        return buttonsDTO.copy(atomActionDTO, buttonV3DTO, buttonV3DTO2, buttonV3DTO3, minimalLimit2, i13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getAddMorePhotoButton() {
        return this.addMorePhotoButton;
    }

    /* renamed from: component5, reason: from getter */
    public final MinimalLimit getMinimalLimit() {
        return this.minimalLimit;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    @NotNull
    public final ButtonsDTO copy(@NotNull AtomActionDTO uploadImageAction, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO addMorePhotoButton, MinimalLimit minimalLimit, int maxCount) {
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        return new ButtonsDTO(uploadImageAction, continueButton, addPhotoButton, addMorePhotoButton, minimalLimit, maxCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsDTO)) {
            return false;
        }
        ButtonsDTO buttonsDTO = (ButtonsDTO) other;
        return Intrinsics.d(this.uploadImageAction, buttonsDTO.uploadImageAction) && Intrinsics.d(this.continueButton, buttonsDTO.continueButton) && Intrinsics.d(this.addPhotoButton, buttonsDTO.addPhotoButton) && Intrinsics.d(this.addMorePhotoButton, buttonsDTO.addMorePhotoButton) && Intrinsics.d(this.minimalLimit, buttonsDTO.minimalLimit) && this.maxCount == buttonsDTO.maxCount;
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

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final MinimalLimit getMinimalLimit() {
        return this.minimalLimit;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.addPhotoButton, C2859b.c(this.continueButton, this.uploadImageAction.hashCode() * 31, 31), 31);
        ButtonV3DTO buttonV3DTO = this.addMorePhotoButton;
        int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        MinimalLimit minimalLimit = this.minimalLimit;
        return Integer.hashCode(this.maxCount) + ((hashCode + (minimalLimit != null ? minimalLimit.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ButtonsDTO(uploadImageAction=" + this.uploadImageAction + ", continueButton=" + this.continueButton + ", addPhotoButton=" + this.addPhotoButton + ", addMorePhotoButton=" + this.addMorePhotoButton + ", minimalLimit=" + this.minimalLimit + ", maxCount=" + this.maxCount + ")";
    }
}

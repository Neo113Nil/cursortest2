package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewObject;

import B0.C2454a;
import D3.h;
import De.C2859b;
import Ih.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewObject/ButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "uploadImageAction", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "continueButton", "addPhotoButton", "addMorePhotoButton", "", "minCount", "maxCount", "<init>", "(JLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddPhotoButton", "getAddMorePhotoButton", "I", "getMinCount", "getMaxCount", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonsVO implements c {
    private final ButtonV3DTO addMorePhotoButton;

    @NotNull
    private final ButtonV3DTO addPhotoButton;

    @NotNull
    private final ButtonV3DTO continueButton;
    private final long id;
    private final int maxCount;
    private final int minCount;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    public ButtonsVO(long j11, @NotNull AtomActionDTO uploadImageAction, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO buttonV3DTO, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        this.id = j11;
        this.uploadImageAction = uploadImageAction;
        this.continueButton = continueButton;
        this.addPhotoButton = addPhotoButton;
        this.addMorePhotoButton = buttonV3DTO;
        this.minCount = i11;
        this.maxCount = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsVO)) {
            return false;
        }
        ButtonsVO buttonsVO = (ButtonsVO) other;
        return this.id == buttonsVO.id && Intrinsics.d(this.uploadImageAction, buttonsVO.uploadImageAction) && Intrinsics.d(this.continueButton, buttonsVO.continueButton) && Intrinsics.d(this.addPhotoButton, buttonsVO.addPhotoButton) && Intrinsics.d(this.addMorePhotoButton, buttonsVO.addMorePhotoButton) && this.minCount == buttonsVO.minCount && this.maxCount == buttonsVO.maxCount;
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMinCount() {
        return this.minCount;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.addPhotoButton, C2859b.c(this.continueButton, a.b(this.uploadImageAction, Long.hashCode(this.id) * 31, 31), 31), 31);
        ButtonV3DTO buttonV3DTO = this.addMorePhotoButton;
        return Integer.hashCode(this.maxCount) + C2454a.a(this.minCount, (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomActionDTO atomActionDTO = this.uploadImageAction;
        ButtonV3DTO buttonV3DTO = this.continueButton;
        ButtonV3DTO buttonV3DTO2 = this.addPhotoButton;
        ButtonV3DTO buttonV3DTO3 = this.addMorePhotoButton;
        int i11 = this.minCount;
        int i12 = this.maxCount;
        StringBuilder sb2 = new StringBuilder("ButtonsVO(id=");
        sb2.append(j11);
        sb2.append(", uploadImageAction=");
        sb2.append(atomActionDTO);
        sb2.append(", continueButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", addPhotoButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(", addMorePhotoButton=");
        sb2.append(buttonV3DTO3);
        sb2.append(", minCount=");
        sb2.append(i11);
        return h.b(sb2, ", maxCount=", i12, ")");
    }
}

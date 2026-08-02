package ru.ozon.app.android.returns.edit.data.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.reason.PickedImagesDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "photoState", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPhotoState", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PickedImagesWithText", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnImageEditBlockDto {
    public static final int $stable = 8;

    @NotNull
    private final Object photoState;

    @NotNull
    private final TextDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto$PickedImagesWithText;", "", "validationText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "pickedImages", "Lru/ozon/app/android/returns/ui/molecules/reason/PickedImagesDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/reason/PickedImagesDTO;)V", "getValidationText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPickedImages", "()Lru/ozon/app/android/returns/ui/molecules/reason/PickedImagesDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickedImagesWithText {
        public static final int $stable = 8;

        @NotNull
        private final PickedImagesDTO pickedImages;
        private final TextDTO validationText;

        public PickedImagesWithText(TextDTO textDTO, @NotNull PickedImagesDTO pickedImages) {
            Intrinsics.checkNotNullParameter(pickedImages, "pickedImages");
            this.validationText = textDTO;
            this.pickedImages = pickedImages;
        }

        public static /* synthetic */ PickedImagesWithText copy$default(PickedImagesWithText pickedImagesWithText, TextDTO textDTO, PickedImagesDTO pickedImagesDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = pickedImagesWithText.validationText;
            }
            if ((i11 & 2) != 0) {
                pickedImagesDTO = pickedImagesWithText.pickedImages;
            }
            return pickedImagesWithText.copy(textDTO, pickedImagesDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getValidationText() {
            return this.validationText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PickedImagesDTO getPickedImages() {
            return this.pickedImages;
        }

        @NotNull
        public final PickedImagesWithText copy(TextDTO validationText, @NotNull PickedImagesDTO pickedImages) {
            Intrinsics.checkNotNullParameter(pickedImages, "pickedImages");
            return new PickedImagesWithText(validationText, pickedImages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickedImagesWithText)) {
                return false;
            }
            PickedImagesWithText pickedImagesWithText = (PickedImagesWithText) other;
            return Intrinsics.d(this.validationText, pickedImagesWithText.validationText) && Intrinsics.d(this.pickedImages, pickedImagesWithText.pickedImages);
        }

        @NotNull
        public final PickedImagesDTO getPickedImages() {
            return this.pickedImages;
        }

        public final TextDTO getValidationText() {
            return this.validationText;
        }

        public int hashCode() {
            TextDTO textDTO = this.validationText;
            return this.pickedImages.hashCode() + ((textDTO == null ? 0 : textDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "PickedImagesWithText(validationText=" + this.validationText + ", pickedImages=" + this.pickedImages + ")";
        }
    }

    public ReturnImageEditBlockDto(@NotNull TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "pickedImagesWithText", type = PickedImagesWithText.class)}) @NotNull @ProtoOneOf(label = "type") Object photoState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(photoState, "photoState");
        this.title = title;
        this.photoState = photoState;
    }

    public static /* synthetic */ ReturnImageEditBlockDto copy$default(ReturnImageEditBlockDto returnImageEditBlockDto, TextDTO textDTO, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            textDTO = returnImageEditBlockDto.title;
        }
        if ((i11 & 2) != 0) {
            obj = returnImageEditBlockDto.photoState;
        }
        return returnImageEditBlockDto.copy(textDTO, obj);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Object getPhotoState() {
        return this.photoState;
    }

    @NotNull
    public final ReturnImageEditBlockDto copy(@NotNull TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "pickedImagesWithText", type = PickedImagesWithText.class)}) @NotNull @ProtoOneOf(label = "type") Object photoState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(photoState, "photoState");
        return new ReturnImageEditBlockDto(title, photoState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnImageEditBlockDto)) {
            return false;
        }
        ReturnImageEditBlockDto returnImageEditBlockDto = (ReturnImageEditBlockDto) other;
        return Intrinsics.d(this.title, returnImageEditBlockDto.title) && Intrinsics.d(this.photoState, returnImageEditBlockDto.photoState);
    }

    @NotNull
    public final Object getPhotoState() {
        return this.photoState;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.photoState.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnImageEditBlockDto(title=" + this.title + ", photoState=" + this.photoState + ")";
    }
}

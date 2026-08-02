package ru.ozon.app.android.atoms.data.cell;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.atoms.data.DsAtomsType;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.image.ImageDTO;
import ru.ozon.app.android.atoms.data.image.ImageFixedDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import wh.c;
import wh.d;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00015BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB9\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000fJB\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010 \u001a\u00020!H\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010(\u001a\u00020!J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020!HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R&\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO;", "Lru/ozon/app/android/atoms/data/cell/CellDTO;", "common", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "preset", "Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO$ImageTitleSubtitleCellPreset;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "subtitle", "imageFixed", "Lru/ozon/app/android/atoms/data/image/ImageFixedDTO;", "image", "Lru/ozon/app/android/atoms/data/image/ImageDTO;", "<init>", "(Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO$ImageTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/image/ImageFixedDTO;Lru/ozon/app/android/atoms/data/image/ImageDTO;)V", "(Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO$ImageTitleSubtitleCellPreset;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;Lru/ozon/app/android/atoms/data/image/ImageFixedDTO;)V", "getCommon", "()Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "getPreset", "()Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO$ImageTitleSubtitleCellPreset;", "getTitle", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "getSubtitle", "getImageFixed$annotations", "()V", "getImageFixed", "()Lru/ozon/app/android/atoms/data/image/ImageFixedDTO;", "setImageFixed", "(Lru/ozon/app/android/atoms/data/image/ImageFixedDTO;)V", "getImage", "()Lru/ozon/app/android/atoms/data/image/ImageDTO;", "copy", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ImageTitleSubtitleCellPreset", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ImageTitleSubtitleCellDTO extends CellDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ImageTitleSubtitleCellDTO> CREATOR = new Creator();
    private final CommonCellSettings common;
    private final ImageDTO image;
    private ImageFixedDTO imageFixed;

    @EnumNullFallback
    private final ImageTitleSubtitleCellPreset preset;
    private final CommonAtomLabelDTO subtitle;

    @NotNull
    private final CommonAtomLabelDTO title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageTitleSubtitleCellDTO> {
        @Override // android.os.Parcelable.Creator
        public final ImageTitleSubtitleCellDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CommonCellSettings createFromParcel = parcel.readInt() == 0 ? null : CommonCellSettings.CREATOR.createFromParcel(parcel);
            ImageTitleSubtitleCellPreset valueOf = parcel.readInt() == 0 ? null : ImageTitleSubtitleCellPreset.valueOf(parcel.readString());
            Parcelable.Creator<CommonAtomLabelDTO> creator = CommonAtomLabelDTO.CREATOR;
            return new ImageTitleSubtitleCellDTO(createFromParcel, valueOf, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageFixedDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageTitleSubtitleCellDTO[] newArray(int i11) {
            return new ImageTitleSubtitleCellDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO$ImageTitleSubtitleCellPreset;", "", "Lwh/c;", "preset", "<init>", "(Ljava/lang/String;ILwh/c;)V", "Lwh/c;", "getPreset", "()Lwh/c;", "CENTER_END_500_CONTENT_CONTROL_500", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ImageTitleSubtitleCellPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ImageTitleSubtitleCellPreset[] $VALUES;

        @i(name = "CENTER_END_500_CONTROL_500")
        public static final ImageTitleSubtitleCellPreset CENTER_END_500_CONTENT_CONTROL_500 = new ImageTitleSubtitleCellPreset("CENTER_END_500_CONTENT_CONTROL_500", 0, d.a());

        @NotNull
        private final c preset;

        private static final /* synthetic */ ImageTitleSubtitleCellPreset[] $values() {
            return new ImageTitleSubtitleCellPreset[]{CENTER_END_500_CONTENT_CONTROL_500};
        }

        static {
            ImageTitleSubtitleCellPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ImageTitleSubtitleCellPreset(String str, int i11, c cVar) {
            this.preset = cVar;
        }

        @NotNull
        public static a<ImageTitleSubtitleCellPreset> getEntries() {
            return $ENTRIES;
        }

        public static ImageTitleSubtitleCellPreset valueOf(String str) {
            return (ImageTitleSubtitleCellPreset) Enum.valueOf(ImageTitleSubtitleCellPreset.class, str);
        }

        public static ImageTitleSubtitleCellPreset[] values() {
            return (ImageTitleSubtitleCellPreset[]) $VALUES.clone();
        }

        @NotNull
        public final c getPreset() {
            return this.preset;
        }
    }

    public /* synthetic */ ImageTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, ImageFixedDTO imageFixedDTO, ImageDTO imageDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonCellSettings, imageTitleSubtitleCellPreset, commonAtomLabelDTO, commonAtomLabelDTO2, imageFixedDTO, (i11 & 32) != 0 ? imageFixedDTO != null ? ImageDTO.INSTANCE.toImage(imageFixedDTO) : null : imageDTO);
    }

    public static /* synthetic */ ImageTitleSubtitleCellDTO copy$default(ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, CommonCellSettings commonCellSettings, ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, ImageFixedDTO imageFixedDTO, ImageDTO imageDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonCellSettings = imageTitleSubtitleCellDTO.common;
        }
        if ((i11 & 2) != 0) {
            imageTitleSubtitleCellPreset = imageTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = imageTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = imageTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            imageFixedDTO = imageTitleSubtitleCellDTO.imageFixed;
        }
        if ((i11 & 32) != 0) {
            imageDTO = imageTitleSubtitleCellDTO.image;
        }
        ImageFixedDTO imageFixedDTO2 = imageFixedDTO;
        ImageDTO imageDTO2 = imageDTO;
        return imageTitleSubtitleCellDTO.copy(commonCellSettings, imageTitleSubtitleCellPreset, commonAtomLabelDTO, commonAtomLabelDTO2, imageFixedDTO2, imageDTO2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getImageFixed$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final CommonCellSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageTitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ImageFixedDTO getImageFixed() {
        return this.imageFixed;
    }

    /* renamed from: component6, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final ImageTitleSubtitleCellDTO copy(CommonCellSettings common, ImageTitleSubtitleCellPreset preset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, ImageFixedDTO imageFixed, ImageDTO image) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ImageTitleSubtitleCellDTO(common, preset, title, subtitle, imageFixed, image);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageTitleSubtitleCellDTO)) {
            return false;
        }
        ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO = (ImageTitleSubtitleCellDTO) other;
        return Intrinsics.d(this.common, imageTitleSubtitleCellDTO.common) && this.preset == imageTitleSubtitleCellDTO.preset && Intrinsics.d(this.title, imageTitleSubtitleCellDTO.title) && Intrinsics.d(this.subtitle, imageTitleSubtitleCellDTO.subtitle) && Intrinsics.d(this.imageFixed, imageTitleSubtitleCellDTO.imageFixed) && Intrinsics.d(this.image, imageTitleSubtitleCellDTO.image);
    }

    @Override // ru.ozon.app.android.atoms.data.cell.CellDTO
    public CommonCellSettings getCommon() {
        return this.common;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final ImageFixedDTO getImageFixed() {
        return this.imageFixed;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R.id.imageTitleSubtitleCell;
    }

    public final ImageTitleSubtitleCellPreset getPreset() {
        return this.preset;
    }

    public final CommonAtomLabelDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CommonAtomLabelDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        CommonCellSettings commonCellSettings = this.common;
        int hashCode = (commonCellSettings == null ? 0 : commonCellSettings.hashCode()) * 31;
        ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset = this.preset;
        int c11 = Tl.a.c(this.title, (hashCode + (imageTitleSubtitleCellPreset == null ? 0 : imageTitleSubtitleCellPreset.hashCode())) * 31, 31);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        int hashCode2 = (c11 + (commonAtomLabelDTO == null ? 0 : commonAtomLabelDTO.hashCode())) * 31;
        ImageFixedDTO imageFixedDTO = this.imageFixed;
        int hashCode3 = (hashCode2 + (imageFixedDTO == null ? 0 : imageFixedDTO.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        return hashCode3 + (imageDTO != null ? imageDTO.hashCode() : 0);
    }

    public final void setImageFixed(ImageFixedDTO imageFixedDTO) {
        this.imageFixed = imageFixedDTO;
    }

    @NotNull
    public String toString() {
        CommonCellSettings commonCellSettings = this.common;
        ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset = this.preset;
        CommonAtomLabelDTO commonAtomLabelDTO = this.title;
        CommonAtomLabelDTO commonAtomLabelDTO2 = this.subtitle;
        ImageFixedDTO imageFixedDTO = this.imageFixed;
        ImageDTO imageDTO = this.image;
        StringBuilder sb2 = new StringBuilder("ImageTitleSubtitleCellDTO(common=");
        sb2.append(commonCellSettings);
        sb2.append(", preset=");
        sb2.append(imageTitleSubtitleCellPreset);
        sb2.append(", title=");
        Tl.b.h(sb2, commonAtomLabelDTO, ", subtitle=", commonAtomLabelDTO2, ", imageFixed=");
        sb2.append(imageFixedDTO);
        sb2.append(", image=");
        sb2.append(imageDTO);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CommonCellSettings commonCellSettings = this.common;
        if (commonCellSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonCellSettings.writeToParcel(dest, flags);
        }
        ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset = this.preset;
        if (imageTitleSubtitleCellPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(imageTitleSubtitleCellPreset.name());
        }
        this.title.writeToParcel(dest, flags);
        CommonAtomLabelDTO commonAtomLabelDTO = this.subtitle;
        if (commonAtomLabelDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomLabelDTO.writeToParcel(dest, flags);
        }
        ImageFixedDTO imageFixedDTO = this.imageFixed;
        if (imageFixedDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageFixedDTO.writeToParcel(dest, flags);
        }
        ImageDTO imageDTO = this.image;
        if (imageDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageDTO.writeToParcel(dest, flags);
        }
    }

    public static /* synthetic */ ImageTitleSubtitleCellDTO copy$default(ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, CommonCellSettings commonCellSettings, ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset, CommonAtomLabelDTO commonAtomLabelDTO, CommonAtomLabelDTO commonAtomLabelDTO2, ImageFixedDTO imageFixedDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonCellSettings = imageTitleSubtitleCellDTO.getCommon();
        }
        if ((i11 & 2) != 0) {
            imageTitleSubtitleCellPreset = imageTitleSubtitleCellDTO.preset;
        }
        if ((i11 & 4) != 0) {
            commonAtomLabelDTO = imageTitleSubtitleCellDTO.title;
        }
        if ((i11 & 8) != 0) {
            commonAtomLabelDTO2 = imageTitleSubtitleCellDTO.subtitle;
        }
        if ((i11 & 16) != 0) {
            imageFixedDTO = imageTitleSubtitleCellDTO.imageFixed;
        }
        ImageFixedDTO imageFixedDTO2 = imageFixedDTO;
        CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO;
        return imageTitleSubtitleCellDTO.copy(commonCellSettings, imageTitleSubtitleCellPreset, commonAtomLabelDTO3, commonAtomLabelDTO2, imageFixedDTO2);
    }

    @InterfaceC3999a
    @NotNull
    public final ImageTitleSubtitleCellDTO copy(CommonCellSettings common, ImageTitleSubtitleCellPreset preset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO subtitle, ImageFixedDTO imageFixed) {
        Intrinsics.checkNotNullParameter(title, "title");
        return copy(common, preset, title, subtitle, imageFixed, this.image);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, ImageFixedDTO imageFixedDTO, ImageDTO imageDTO) {
        super(DsAtomsType.IMAGE_TITLE_SUBTITLE_CELL, commonCellSettings, null, 4, null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.common = commonCellSettings;
        this.preset = imageTitleSubtitleCellPreset;
        this.title = title;
        this.subtitle = commonAtomLabelDTO;
        this.imageFixed = imageFixedDTO;
        this.image = imageDTO;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageTitleSubtitleCellDTO(CommonCellSettings commonCellSettings, ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset, @NotNull CommonAtomLabelDTO title, CommonAtomLabelDTO commonAtomLabelDTO, ImageFixedDTO imageFixedDTO) {
        this(commonCellSettings, imageTitleSubtitleCellPreset, title, commonAtomLabelDTO, imageFixedDTO, imageFixedDTO != null ? ImageDTO.INSTANCE.toImage(imageFixedDTO) : null);
        Intrinsics.checkNotNullParameter(title, "title");
    }
}

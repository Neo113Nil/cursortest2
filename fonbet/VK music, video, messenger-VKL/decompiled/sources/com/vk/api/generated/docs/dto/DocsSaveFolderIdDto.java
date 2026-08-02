package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocsSaveFolderIdDto.kt */
/* loaded from: classes14.dex */
public final class DocsSaveFolderIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsSaveFolderIdDto[] $VALUES;

    @pmi0("3")
    public static final DocsSaveFolderIdDto BOOK;
    public static final Parcelable.Creator<DocsSaveFolderIdDto> CREATOR;

    @pmi0("0")
    public static final DocsSaveFolderIdDto DEFAULT;

    @pmi0("2")
    public static final DocsSaveFolderIdDto EDU;

    @pmi0("4")
    public static final DocsSaveFolderIdDto OTHER;
    private final int value;

    /* compiled from: DocsSaveFolderIdDto.kt */
    public static final class a implements Parcelable.Creator<DocsSaveFolderIdDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsSaveFolderIdDto createFromParcel(Parcel parcel) {
            return DocsSaveFolderIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsSaveFolderIdDto[] newArray(int i) {
            return new DocsSaveFolderIdDto[i];
        }
    }

    static {
        DocsSaveFolderIdDto docsSaveFolderIdDto = new DocsSaveFolderIdDto("DEFAULT", 0, 0);
        DEFAULT = docsSaveFolderIdDto;
        DocsSaveFolderIdDto docsSaveFolderIdDto2 = new DocsSaveFolderIdDto("EDU", 1, 2);
        EDU = docsSaveFolderIdDto2;
        DocsSaveFolderIdDto docsSaveFolderIdDto3 = new DocsSaveFolderIdDto("BOOK", 2, 3);
        BOOK = docsSaveFolderIdDto3;
        DocsSaveFolderIdDto docsSaveFolderIdDto4 = new DocsSaveFolderIdDto(NativeAdContent.ViewTag.OTHER, 3, 4);
        OTHER = docsSaveFolderIdDto4;
        DocsSaveFolderIdDto[] docsSaveFolderIdDtoArr = {docsSaveFolderIdDto, docsSaveFolderIdDto2, docsSaveFolderIdDto3, docsSaveFolderIdDto4};
        $VALUES = docsSaveFolderIdDtoArr;
        $ENTRIES = new asp(docsSaveFolderIdDtoArr);
        CREATOR = new a();
    }

    private DocsSaveFolderIdDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static DocsSaveFolderIdDto valueOf(String str) {
        return (DocsSaveFolderIdDto) Enum.valueOf(DocsSaveFolderIdDto.class, str);
    }

    public static DocsSaveFolderIdDto[] values() {
        return (DocsSaveFolderIdDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

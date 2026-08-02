package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocsDocAttachmentTypeDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocAttachmentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsDocAttachmentTypeDto[] $VALUES;

    @pmi0("audio_message")
    public static final DocsDocAttachmentTypeDto AUDIO_MESSAGE;
    public static final Parcelable.Creator<DocsDocAttachmentTypeDto> CREATOR;

    @pmi0("doc")
    public static final DocsDocAttachmentTypeDto DOC;

    @pmi0("graffiti")
    public static final DocsDocAttachmentTypeDto GRAFFITI;
    private final String value;

    /* compiled from: DocsDocAttachmentTypeDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocAttachmentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocAttachmentTypeDto createFromParcel(Parcel parcel) {
            return DocsDocAttachmentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocAttachmentTypeDto[] newArray(int i) {
            return new DocsDocAttachmentTypeDto[i];
        }
    }

    static {
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto = new DocsDocAttachmentTypeDto("DOC", 0, "doc");
        DOC = docsDocAttachmentTypeDto;
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto2 = new DocsDocAttachmentTypeDto("GRAFFITI", 1, "graffiti");
        GRAFFITI = docsDocAttachmentTypeDto2;
        DocsDocAttachmentTypeDto docsDocAttachmentTypeDto3 = new DocsDocAttachmentTypeDto("AUDIO_MESSAGE", 2, "audio_message");
        AUDIO_MESSAGE = docsDocAttachmentTypeDto3;
        DocsDocAttachmentTypeDto[] docsDocAttachmentTypeDtoArr = {docsDocAttachmentTypeDto, docsDocAttachmentTypeDto2, docsDocAttachmentTypeDto3};
        $VALUES = docsDocAttachmentTypeDtoArr;
        $ENTRIES = new asp(docsDocAttachmentTypeDtoArr);
        CREATOR = new a();
    }

    private DocsDocAttachmentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DocsDocAttachmentTypeDto valueOf(String str) {
        return (DocsDocAttachmentTypeDto) Enum.valueOf(DocsDocAttachmentTypeDto.class, str);
    }

    public static DocsDocAttachmentTypeDto[] values() {
        return (DocsDocAttachmentTypeDto[]) $VALUES.clone();
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

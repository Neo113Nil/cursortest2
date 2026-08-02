package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocsSearchSearchTypeDto.kt */
/* loaded from: classes14.dex */
public final class DocsSearchSearchTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DocsSearchSearchTypeDto[] $VALUES;

    @pmi0("2")
    public static final DocsSearchSearchTypeDto ALL;
    public static final Parcelable.Creator<DocsSearchSearchTypeDto> CREATOR;

    @pmi0("0")
    public static final DocsSearchSearchTypeDto GLOBAL;

    @pmi0("1")
    public static final DocsSearchSearchTypeDto OWN;
    private final int value;

    /* compiled from: DocsSearchSearchTypeDto.kt */
    public static final class a implements Parcelable.Creator<DocsSearchSearchTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsSearchSearchTypeDto createFromParcel(Parcel parcel) {
            return DocsSearchSearchTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsSearchSearchTypeDto[] newArray(int i) {
            return new DocsSearchSearchTypeDto[i];
        }
    }

    static {
        DocsSearchSearchTypeDto docsSearchSearchTypeDto = new DocsSearchSearchTypeDto("GLOBAL", 0, 0);
        GLOBAL = docsSearchSearchTypeDto;
        DocsSearchSearchTypeDto docsSearchSearchTypeDto2 = new DocsSearchSearchTypeDto("OWN", 1, 1);
        OWN = docsSearchSearchTypeDto2;
        DocsSearchSearchTypeDto docsSearchSearchTypeDto3 = new DocsSearchSearchTypeDto("ALL", 2, 2);
        ALL = docsSearchSearchTypeDto3;
        DocsSearchSearchTypeDto[] docsSearchSearchTypeDtoArr = {docsSearchSearchTypeDto, docsSearchSearchTypeDto2, docsSearchSearchTypeDto3};
        $VALUES = docsSearchSearchTypeDtoArr;
        $ENTRIES = new asp(docsSearchSearchTypeDtoArr);
        CREATOR = new a();
    }

    private DocsSearchSearchTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static DocsSearchSearchTypeDto valueOf(String str) {
        return (DocsSearchSearchTypeDto) Enum.valueOf(DocsSearchSearchTypeDto.class, str);
    }

    public static DocsSearchSearchTypeDto[] values() {
        return (DocsSearchSearchTypeDto[]) $VALUES.clone();
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

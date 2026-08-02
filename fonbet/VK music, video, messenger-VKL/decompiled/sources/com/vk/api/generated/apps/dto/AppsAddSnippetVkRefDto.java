package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAddSnippetVkRefDto.kt */
/* loaded from: classes14.dex */
public final class AppsAddSnippetVkRefDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAddSnippetVkRefDto[] $VALUES;
    public static final Parcelable.Creator<AppsAddSnippetVkRefDto> CREATOR;

    @pmi0("snippet_im")
    public static final AppsAddSnippetVkRefDto SNIPPET_IM;

    @pmi0("snippet_post")
    public static final AppsAddSnippetVkRefDto SNIPPET_POST;
    private final String value;

    /* compiled from: AppsAddSnippetVkRefDto.kt */
    public static final class a implements Parcelable.Creator<AppsAddSnippetVkRefDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAddSnippetVkRefDto createFromParcel(Parcel parcel) {
            return AppsAddSnippetVkRefDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAddSnippetVkRefDto[] newArray(int i) {
            return new AppsAddSnippetVkRefDto[i];
        }
    }

    static {
        AppsAddSnippetVkRefDto appsAddSnippetVkRefDto = new AppsAddSnippetVkRefDto("SNIPPET_IM", 0, "snippet_im");
        SNIPPET_IM = appsAddSnippetVkRefDto;
        AppsAddSnippetVkRefDto appsAddSnippetVkRefDto2 = new AppsAddSnippetVkRefDto("SNIPPET_POST", 1, "snippet_post");
        SNIPPET_POST = appsAddSnippetVkRefDto2;
        AppsAddSnippetVkRefDto[] appsAddSnippetVkRefDtoArr = {appsAddSnippetVkRefDto, appsAddSnippetVkRefDto2};
        $VALUES = appsAddSnippetVkRefDtoArr;
        $ENTRIES = new asp(appsAddSnippetVkRefDtoArr);
        CREATOR = new a();
    }

    private AppsAddSnippetVkRefDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsAddSnippetVkRefDto valueOf(String str) {
        return (AppsAddSnippetVkRefDto) Enum.valueOf(AppsAddSnippetVkRefDto.class, str);
    }

    public static AppsAddSnippetVkRefDto[] values() {
        return (AppsAddSnippetVkRefDto[]) $VALUES.clone();
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

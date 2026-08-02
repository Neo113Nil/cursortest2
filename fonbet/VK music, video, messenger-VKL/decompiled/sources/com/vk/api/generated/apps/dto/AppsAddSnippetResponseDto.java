package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: AppsAddSnippetResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsAddSnippetResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsAddSnippetResponseDto> CREATOR = new a();

    @pmi0("snippet_id")
    private final int snippetId;

    /* compiled from: AppsAddSnippetResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsAddSnippetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAddSnippetResponseDto createFromParcel(Parcel parcel) {
            return new AppsAddSnippetResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAddSnippetResponseDto[] newArray(int i) {
            return new AppsAddSnippetResponseDto[i];
        }
    }

    public AppsAddSnippetResponseDto(int i) {
        this.snippetId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppsAddSnippetResponseDto) && this.snippetId == ((AppsAddSnippetResponseDto) obj).snippetId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.snippetId);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("AppsAddSnippetResponseDto(snippetId="), this.snippetId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.snippetId);
    }
}

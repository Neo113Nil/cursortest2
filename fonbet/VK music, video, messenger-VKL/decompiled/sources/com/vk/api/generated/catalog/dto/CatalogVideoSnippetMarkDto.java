package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CatalogVideoSnippetMarkDto.kt */
/* loaded from: classes14.dex */
public final class CatalogVideoSnippetMarkDto implements Parcelable {
    public static final Parcelable.Creator<CatalogVideoSnippetMarkDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    /* compiled from: CatalogVideoSnippetMarkDto.kt */
    public static final class a implements Parcelable.Creator<CatalogVideoSnippetMarkDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogVideoSnippetMarkDto createFromParcel(Parcel parcel) {
            return new CatalogVideoSnippetMarkDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogVideoSnippetMarkDto[] newArray(int i) {
            return new CatalogVideoSnippetMarkDto[i];
        }
    }

    public CatalogVideoSnippetMarkDto(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogVideoSnippetMarkDto) && epx.f(this.title, ((CatalogVideoSnippetMarkDto) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CatalogVideoSnippetMarkDto(title="), this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }
}

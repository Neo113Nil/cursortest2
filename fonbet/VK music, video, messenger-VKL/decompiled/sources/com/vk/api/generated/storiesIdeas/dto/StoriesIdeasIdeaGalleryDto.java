package com.vk.api.generated.storiesIdeas.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoriesIdeasIdeaGalleryDto.kt */
/* loaded from: classes15.dex */
public final class StoriesIdeasIdeaGalleryDto implements Parcelable {
    public static final Parcelable.Creator<StoriesIdeasIdeaGalleryDto> CREATOR = new a();

    @pmi0("themes")
    private final List<String> themes;

    /* compiled from: StoriesIdeasIdeaGalleryDto.kt */
    public static final class a implements Parcelable.Creator<StoriesIdeasIdeaGalleryDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaGalleryDto createFromParcel(Parcel parcel) {
            return new StoriesIdeasIdeaGalleryDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesIdeasIdeaGalleryDto[] newArray(int i) {
            return new StoriesIdeasIdeaGalleryDto[i];
        }
    }

    public StoriesIdeasIdeaGalleryDto(List<String> list) {
        this.themes = list;
    }

    public final List<String> d() {
        return this.themes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoriesIdeasIdeaGalleryDto) && epx.f(this.themes, ((StoriesIdeasIdeaGalleryDto) obj).themes);
    }

    public final int hashCode() {
        return this.themes.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StoriesIdeasIdeaGalleryDto(themes="), this.themes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.themes);
    }
}

package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoriesStoryLinkDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStoryLinkDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStoryLinkDto> CREATOR = new a();

    @pmi0("link_url_target")
    private final String linkUrlTarget;

    @pmi0("text")
    private final String text;

    @pmi0("url")
    private final String url;

    /* compiled from: StoriesStoryLinkDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStoryLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStoryLinkDto createFromParcel(Parcel parcel) {
            return new StoriesStoryLinkDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStoryLinkDto[] newArray(int i) {
            return new StoriesStoryLinkDto[i];
        }
    }

    public StoriesStoryLinkDto(String str, String str2, String str3) {
        this.text = str;
        this.url = str2;
        this.linkUrlTarget = str3;
    }

    public final String d() {
        return this.linkUrlTarget;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryLinkDto)) {
            return false;
        }
        StoriesStoryLinkDto storiesStoryLinkDto = (StoriesStoryLinkDto) obj;
        return epx.f(this.text, storiesStoryLinkDto.text) && epx.f(this.url, storiesStoryLinkDto.url) && epx.f(this.linkUrlTarget, storiesStoryLinkDto.linkUrlTarget);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.text.hashCode() * 31, 31, this.url);
        String str = this.linkUrlTarget;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesStoryLinkDto(text=");
        sb.append(this.text);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", linkUrlTarget=");
        return ho8.a(sb, this.linkUrlTarget, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.url);
        parcel.writeString(this.linkUrlTarget);
    }

    public /* synthetic */ StoriesStoryLinkDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}

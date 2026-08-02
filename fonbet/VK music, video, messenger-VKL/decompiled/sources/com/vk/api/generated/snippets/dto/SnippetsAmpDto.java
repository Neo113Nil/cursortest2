package com.vk.api.generated.snippets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: SnippetsAmpDto.kt */
/* loaded from: classes15.dex */
public final class SnippetsAmpDto implements Parcelable {
    public static final Parcelable.Creator<SnippetsAmpDto> CREATOR = new a();

    @pmi0("caption")
    private final String caption;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("views")
    private final Integer views;

    /* compiled from: SnippetsAmpDto.kt */
    public static final class a implements Parcelable.Creator<SnippetsAmpDto> {
        @Override // android.os.Parcelable.Creator
        public final SnippetsAmpDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SnippetsAmpDto(readString, valueOf, bool, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SnippetsAmpDto[] newArray(int i) {
            return new SnippetsAmpDto[i];
        }
    }

    public SnippetsAmpDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Integer d() {
        return this.views;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isFavorite;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetsAmpDto)) {
            return false;
        }
        SnippetsAmpDto snippetsAmpDto = (SnippetsAmpDto) obj;
        return epx.f(this.url, snippetsAmpDto.url) && epx.f(this.views, snippetsAmpDto.views) && epx.f(this.isFavorite, snippetsAmpDto.isFavorite) && epx.f(this.title, snippetsAmpDto.title) && epx.f(this.caption, snippetsAmpDto.caption);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.views;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.caption;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetsAmpDto(url=");
        sb.append(this.url);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", caption=");
        return ho8.a(sb, this.caption, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Integer num = this.views;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.caption);
    }

    public SnippetsAmpDto(String str, Integer num, Boolean bool, String str2, String str3) {
        this.url = str;
        this.views = num;
        this.isFavorite = bool;
        this.title = str2;
        this.caption = str3;
    }

    public /* synthetic */ SnippetsAmpDto(String str, Integer num, Boolean bool, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}

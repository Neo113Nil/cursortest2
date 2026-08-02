package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderIconDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderIconDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderIconDto> CREATOR = new a();

    @pmi0("accessibility_text")
    private final String accessibilityText;

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("color")
    private final NewsfeedNewsfeedItemColorDto color;

    @pmi0("name")
    private final String name;

    /* compiled from: NewsfeedNewsfeedItemHeaderIconDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderIconDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderIconDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderIconDto(parcel.readString(), (NewsfeedNewsfeedItemHeaderActionDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderIconDto.class.getClassLoader()), (NewsfeedNewsfeedItemColorDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderIconDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderIconDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderIconDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderIconDto(String str, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, String str2) {
        this.name = str;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
        this.color = newsfeedNewsfeedItemColorDto;
        this.accessibilityText = str2;
    }

    public final String d() {
        return this.accessibilityText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderActionDto e() {
        return this.action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderIconDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderIconDto newsfeedNewsfeedItemHeaderIconDto = (NewsfeedNewsfeedItemHeaderIconDto) obj;
        return epx.f(this.name, newsfeedNewsfeedItemHeaderIconDto.name) && epx.f(this.action, newsfeedNewsfeedItemHeaderIconDto.action) && epx.f(this.color, newsfeedNewsfeedItemHeaderIconDto.color) && epx.f(this.accessibilityText, newsfeedNewsfeedItemHeaderIconDto.accessibilityText);
    }

    public final NewsfeedNewsfeedItemColorDto f() {
        return this.color;
    }

    public final String g() {
        return this.name;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderActionDto == null ? 0 : newsfeedNewsfeedItemHeaderActionDto.hashCode())) * 31;
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemColorDto == null ? 0 : newsfeedNewsfeedItemColorDto.hashCode())) * 31;
        String str = this.accessibilityText;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedNewsfeedItemHeaderIconDto(name=");
        sb.append(this.name);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", accessibilityText=");
        return ho8.a(sb, this.accessibilityText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.color, i);
        parcel.writeString(this.accessibilityText);
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderIconDto(String str, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderActionDto, (i & 4) != 0 ? null : newsfeedNewsfeedItemColorDto, (i & 8) != 0 ? null : str2);
    }
}

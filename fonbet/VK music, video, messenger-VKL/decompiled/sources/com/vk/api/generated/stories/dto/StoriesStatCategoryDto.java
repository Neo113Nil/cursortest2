package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: StoriesStatCategoryDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStatCategoryDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStatCategoryDto> CREATOR = new a();

    @pmi0("header")
    private final String header;

    @pmi0("lines")
    private final List<StoriesStatLineDto> lines;

    @pmi0("type")
    private final String type;

    /* compiled from: StoriesStatCategoryDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStatCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStatCategoryDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoriesStatLineDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoriesStatCategoryDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStatCategoryDto[] newArray(int i) {
            return new StoriesStatCategoryDto[i];
        }
    }

    public StoriesStatCategoryDto(String str, String str2, List<StoriesStatLineDto> list) {
        this.header = str;
        this.type = str2;
        this.lines = list;
    }

    public final String d() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StoriesStatLineDto> e() {
        return this.lines;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStatCategoryDto)) {
            return false;
        }
        StoriesStatCategoryDto storiesStatCategoryDto = (StoriesStatCategoryDto) obj;
        return epx.f(this.header, storiesStatCategoryDto.header) && epx.f(this.type, storiesStatCategoryDto.type) && epx.f(this.lines, storiesStatCategoryDto.lines);
    }

    public final int hashCode() {
        return this.lines.hashCode() + urd0.a(this.header.hashCode() * 31, 31, this.type);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesStatCategoryDto(header=");
        sb.append(this.header);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", lines=");
        return ms9.a(')', sb, this.lines);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.header);
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.lines);
        while (a2.hasNext()) {
            ((StoriesStatLineDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

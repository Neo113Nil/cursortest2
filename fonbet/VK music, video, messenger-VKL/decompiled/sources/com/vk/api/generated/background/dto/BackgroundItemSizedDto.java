package com.vk.api.generated.background.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.docs.dto.DocsDocDto;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BackgroundItemSizedDto.kt */
/* loaded from: classes14.dex */
public final class BackgroundItemSizedDto implements Parcelable {
    public static final Parcelable.Creator<BackgroundItemSizedDto> CREATOR = new a();

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("height")
    private final Integer height;

    @pmi0("name")
    private final String name;

    @pmi0("width")
    private final Integer width;

    /* compiled from: BackgroundItemSizedDto.kt */
    public static final class a implements Parcelable.Creator<BackgroundItemSizedDto> {
        @Override // android.os.Parcelable.Creator
        public final BackgroundItemSizedDto createFromParcel(Parcel parcel) {
            return new BackgroundItemSizedDto((DocsDocDto) parcel.readParcelable(BackgroundItemSizedDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BackgroundItemSizedDto[] newArray(int i) {
            return new BackgroundItemSizedDto[i];
        }
    }

    public BackgroundItemSizedDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundItemSizedDto)) {
            return false;
        }
        BackgroundItemSizedDto backgroundItemSizedDto = (BackgroundItemSizedDto) obj;
        return epx.f(this.doc, backgroundItemSizedDto.doc) && epx.f(this.height, backgroundItemSizedDto.height) && epx.f(this.name, backgroundItemSizedDto.name) && epx.f(this.width, backgroundItemSizedDto.width);
    }

    public final int hashCode() {
        DocsDocDto docsDocDto = this.doc;
        int hashCode = (docsDocDto == null ? 0 : docsDocDto.hashCode()) * 31;
        Integer num = this.height;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.width;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundItemSizedDto(doc=");
        sb.append(this.doc);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", width=");
        return uqi.b(sb, this.width, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.doc, i);
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public BackgroundItemSizedDto(DocsDocDto docsDocDto, Integer num, String str, Integer num2) {
        this.doc = docsDocDto;
        this.height = num;
        this.name = str;
        this.width = num2;
    }

    public /* synthetic */ BackgroundItemSizedDto(DocsDocDto docsDocDto, Integer num, String str, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : docsDocDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2);
    }
}

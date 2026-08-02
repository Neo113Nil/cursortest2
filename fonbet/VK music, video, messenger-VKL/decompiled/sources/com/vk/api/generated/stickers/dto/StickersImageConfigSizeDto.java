package com.vk.api.generated.stickers.dto;

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
import xsna.shy;
import xsna.urd0;

/* compiled from: StickersImageConfigSizeDto.kt */
/* loaded from: classes15.dex */
public final class StickersImageConfigSizeDto implements Parcelable {
    public static final Parcelable.Creator<StickersImageConfigSizeDto> CREATOR = new a();

    @pmi0("format_modifiers")
    private final List<StickersImageConfigModifierDto> formatModifiers;

    @pmi0("height")
    private final int height;

    @pmi0("modifier")
    private final String modifier;

    @pmi0("width")
    private final int width;

    /* compiled from: StickersImageConfigSizeDto.kt */
    public static final class a implements Parcelable.Creator<StickersImageConfigSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigSizeDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(StickersImageConfigModifierDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersImageConfigSizeDto(readInt, readInt2, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigSizeDto[] newArray(int i) {
            return new StickersImageConfigSizeDto[i];
        }
    }

    public StickersImageConfigSizeDto(int i, int i2, String str, List<StickersImageConfigModifierDto> list) {
        this.width = i;
        this.height = i2;
        this.modifier = str;
        this.formatModifiers = list;
    }

    public final List<StickersImageConfigModifierDto> d() {
        return this.formatModifiers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.modifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersImageConfigSizeDto)) {
            return false;
        }
        StickersImageConfigSizeDto stickersImageConfigSizeDto = (StickersImageConfigSizeDto) obj;
        return this.width == stickersImageConfigSizeDto.width && this.height == stickersImageConfigSizeDto.height && epx.f(this.modifier, stickersImageConfigSizeDto.modifier) && epx.f(this.formatModifiers, stickersImageConfigSizeDto.formatModifiers);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return this.formatModifiers.hashCode() + urd0.a(shy.a(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.modifier);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersImageConfigSizeDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", modifier=");
        sb.append(this.modifier);
        sb.append(", formatModifiers=");
        return ms9.a(')', sb, this.formatModifiers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.modifier);
        Iterator a2 = ao.a(parcel, this.formatModifiers);
        while (a2.hasNext()) {
            ((StickersImageConfigModifierDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

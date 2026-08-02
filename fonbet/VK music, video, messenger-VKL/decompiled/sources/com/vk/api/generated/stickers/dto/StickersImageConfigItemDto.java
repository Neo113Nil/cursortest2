package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StickersImageConfigItemDto.kt */
/* loaded from: classes15.dex */
public final class StickersImageConfigItemDto implements Parcelable {
    public static final Parcelable.Creator<StickersImageConfigItemDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("pattern")
    private final String pattern;

    @pmi0("sizes")
    private final List<StickersImageConfigSizeDto> sizes;

    @pmi0("theme_modifiers")
    private final List<StickersImageConfigModifierDto> themeModifiers;

    /* compiled from: StickersImageConfigItemDto.kt */
    public static final class a implements Parcelable.Creator<StickersImageConfigItemDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigItemDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(StickersImageConfigSizeDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = en.a(StickersImageConfigModifierDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new StickersImageConfigItemDto(readInt, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigItemDto[] newArray(int i) {
            return new StickersImageConfigItemDto[i];
        }
    }

    public StickersImageConfigItemDto(int i, List<StickersImageConfigSizeDto> list, List<StickersImageConfigModifierDto> list2, String str) {
        this.id = i;
        this.sizes = list;
        this.themeModifiers = list2;
        this.pattern = str;
    }

    public final String d() {
        return this.pattern;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersImageConfigSizeDto> e() {
        return this.sizes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersImageConfigItemDto)) {
            return false;
        }
        StickersImageConfigItemDto stickersImageConfigItemDto = (StickersImageConfigItemDto) obj;
        return this.id == stickersImageConfigItemDto.id && epx.f(this.sizes, stickersImageConfigItemDto.sizes) && epx.f(this.themeModifiers, stickersImageConfigItemDto.themeModifiers) && epx.f(this.pattern, stickersImageConfigItemDto.pattern);
    }

    public final List<StickersImageConfigModifierDto> f() {
        return this.themeModifiers;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.pattern.hashCode() + fw3.a(fw3.a(Integer.hashCode(this.id) * 31, 31, this.sizes), 31, this.themeModifiers);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersImageConfigItemDto(id=");
        sb.append(this.id);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", themeModifiers=");
        sb.append(this.themeModifiers);
        sb.append(", pattern=");
        return ho8.a(sb, this.pattern, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        Iterator a2 = ao.a(parcel, this.sizes);
        while (a2.hasNext()) {
            ((StickersImageConfigSizeDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.themeModifiers);
        while (a3.hasNext()) {
            ((StickersImageConfigModifierDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.pattern);
    }
}

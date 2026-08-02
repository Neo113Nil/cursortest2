package com.vk.api.generated.recomSettings.dto;

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

/* compiled from: RecomSettingsRecomThemeDto.kt */
/* loaded from: classes15.dex */
public final class RecomSettingsRecomThemeDto implements Parcelable {
    public static final Parcelable.Creator<RecomSettingsRecomThemeDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("sub_items")
    private final List<RecomSettingsSubRecomThemeDto> subItems;

    /* compiled from: RecomSettingsRecomThemeDto.kt */
    public static final class a implements Parcelable.Creator<RecomSettingsRecomThemeDto> {
        @Override // android.os.Parcelable.Creator
        public final RecomSettingsRecomThemeDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(RecomSettingsSubRecomThemeDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new RecomSettingsRecomThemeDto(readInt, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RecomSettingsRecomThemeDto[] newArray(int i) {
            return new RecomSettingsRecomThemeDto[i];
        }
    }

    public RecomSettingsRecomThemeDto(int i, String str, String str2, List<RecomSettingsSubRecomThemeDto> list) {
        this.id = i;
        this.name = str;
        this.icon = str2;
        this.subItems = list;
    }

    public final String d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecomSettingsRecomThemeDto)) {
            return false;
        }
        RecomSettingsRecomThemeDto recomSettingsRecomThemeDto = (RecomSettingsRecomThemeDto) obj;
        return this.id == recomSettingsRecomThemeDto.id && epx.f(this.name, recomSettingsRecomThemeDto.name) && epx.f(this.icon, recomSettingsRecomThemeDto.icon) && epx.f(this.subItems, recomSettingsRecomThemeDto.subItems);
    }

    public final List<RecomSettingsSubRecomThemeDto> f() {
        return this.subItems;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.subItems.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.icon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecomSettingsRecomThemeDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", subItems=");
        return ms9.a(')', sb, this.subItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        Iterator a2 = ao.a(parcel, this.subItems);
        while (a2.hasNext()) {
            ((RecomSettingsSubRecomThemeDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

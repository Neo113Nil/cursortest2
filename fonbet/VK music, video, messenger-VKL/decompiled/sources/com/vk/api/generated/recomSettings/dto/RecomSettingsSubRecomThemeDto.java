package com.vk.api.generated.recomSettings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: RecomSettingsSubRecomThemeDto.kt */
/* loaded from: classes15.dex */
public final class RecomSettingsSubRecomThemeDto implements Parcelable {
    public static final Parcelable.Creator<RecomSettingsSubRecomThemeDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("ids")
    private final List<Integer> ids;

    @pmi0("name")
    private final String name;

    /* compiled from: RecomSettingsSubRecomThemeDto.kt */
    public static final class a implements Parcelable.Creator<RecomSettingsSubRecomThemeDto> {
        @Override // android.os.Parcelable.Creator
        public final RecomSettingsSubRecomThemeDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new RecomSettingsSubRecomThemeDto(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecomSettingsSubRecomThemeDto[] newArray(int i) {
            return new RecomSettingsSubRecomThemeDto[i];
        }
    }

    public RecomSettingsSubRecomThemeDto(List<Integer> list, String str, String str2) {
        this.ids = list;
        this.name = str;
        this.icon = str2;
    }

    public final String d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.ids;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecomSettingsSubRecomThemeDto)) {
            return false;
        }
        RecomSettingsSubRecomThemeDto recomSettingsSubRecomThemeDto = (RecomSettingsSubRecomThemeDto) obj;
        return epx.f(this.ids, recomSettingsSubRecomThemeDto.ids) && epx.f(this.name, recomSettingsSubRecomThemeDto.name) && epx.f(this.icon, recomSettingsSubRecomThemeDto.icon);
    }

    public final String f() {
        return this.name;
    }

    public final int hashCode() {
        return this.icon.hashCode() + urd0.a(this.ids.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecomSettingsSubRecomThemeDto(ids=");
        sb.append(this.ids);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        return ho8.a(sb, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.ids);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
    }
}

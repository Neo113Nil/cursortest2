package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: DonutPostingSettingsDto.kt */
/* loaded from: classes14.dex */
public final class DonutPostingSettingsDto implements Parcelable {
    public static final Parcelable.Creator<DonutPostingSettingsDto> CREATOR = new a();

    @pmi0("can_all_dons")
    private final Boolean canAllDons;

    @pmi0("custom_teaser_text")
    private final String customTeaserText;

    @pmi0("durations")
    private final List<DonutPaidDurationDto> durations;

    @pmi0("goals")
    private final List<DonutGoalDto> goals;

    @pmi0("is_regular_support_enabled")
    private final Boolean isRegularSupportEnabled;

    @pmi0("levels")
    private final List<DonutLevelDto> levels;

    @pmi0("levels_for_privacy")
    private final List<DonutLevelDto> levelsForPrivacy;

    /* compiled from: DonutPostingSettingsDto.kt */
    public static final class a implements Parcelable.Creator<DonutPostingSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutPostingSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(DonutPaidDurationDto.CREATOR, parcel, arrayList4, i, 1);
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(DonutPostingSettingsDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(DonutLevelDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(DonutLevelDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DonutPostingSettingsDto(arrayList4, arrayList, arrayList2, arrayList3, valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutPostingSettingsDto[] newArray(int i) {
            return new DonutPostingSettingsDto[i];
        }
    }

    public DonutPostingSettingsDto(List<DonutPaidDurationDto> list, List<DonutGoalDto> list2, List<DonutLevelDto> list3, List<DonutLevelDto> list4, Boolean bool, Boolean bool2, String str) {
        this.durations = list;
        this.goals = list2;
        this.levels = list3;
        this.levelsForPrivacy = list4;
        this.isRegularSupportEnabled = bool;
        this.canAllDons = bool2;
        this.customTeaserText = str;
    }

    public final Boolean d() {
        return this.canAllDons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.customTeaserText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutPostingSettingsDto)) {
            return false;
        }
        DonutPostingSettingsDto donutPostingSettingsDto = (DonutPostingSettingsDto) obj;
        return epx.f(this.durations, donutPostingSettingsDto.durations) && epx.f(this.goals, donutPostingSettingsDto.goals) && epx.f(this.levels, donutPostingSettingsDto.levels) && epx.f(this.levelsForPrivacy, donutPostingSettingsDto.levelsForPrivacy) && epx.f(this.isRegularSupportEnabled, donutPostingSettingsDto.isRegularSupportEnabled) && epx.f(this.canAllDons, donutPostingSettingsDto.canAllDons) && epx.f(this.customTeaserText, donutPostingSettingsDto.customTeaserText);
    }

    public final List<DonutLevelDto> f() {
        return this.levelsForPrivacy;
    }

    public final Boolean g() {
        return this.isRegularSupportEnabled;
    }

    public final int hashCode() {
        int hashCode = this.durations.hashCode() * 31;
        List<DonutGoalDto> list = this.goals;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<DonutLevelDto> list2 = this.levels;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<DonutLevelDto> list3 = this.levelsForPrivacy;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.isRegularSupportEnabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canAllDons;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.customTeaserText;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutPostingSettingsDto(durations=");
        sb.append(this.durations);
        sb.append(", goals=");
        sb.append(this.goals);
        sb.append(", levels=");
        sb.append(this.levels);
        sb.append(", levelsForPrivacy=");
        sb.append(this.levelsForPrivacy);
        sb.append(", isRegularSupportEnabled=");
        sb.append(this.isRegularSupportEnabled);
        sb.append(", canAllDons=");
        sb.append(this.canAllDons);
        sb.append(", customTeaserText=");
        return ho8.a(sb, this.customTeaserText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.durations);
        while (a2.hasNext()) {
            ((DonutPaidDurationDto) a2.next()).writeToParcel(parcel, i);
        }
        List<DonutGoalDto> list = this.goals;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<DonutLevelDto> list2 = this.levels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((DonutLevelDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<DonutLevelDto> list3 = this.levelsForPrivacy;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((DonutLevelDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isRegularSupportEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canAllDons;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.customTeaserText);
    }

    public /* synthetic */ DonutPostingSettingsDto(List list, List list2, List list3, List list4, Boolean bool, Boolean bool2, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str);
    }
}

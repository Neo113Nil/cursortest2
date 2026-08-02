package com.vk.api.generated.recomSettings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: RecomSettingsGetRecomThemesResponseDto.kt */
/* loaded from: classes15.dex */
public final class RecomSettingsGetRecomThemesResponseDto implements Parcelable {
    public static final Parcelable.Creator<RecomSettingsGetRecomThemesResponseDto> CREATOR = new a();

    @pmi0("is_need_update")
    private final Boolean isNeedUpdate;

    @pmi0("recom_themes_ids")
    private final List<Integer> recomThemesIds;

    /* compiled from: RecomSettingsGetRecomThemesResponseDto.kt */
    public static final class a implements Parcelable.Creator<RecomSettingsGetRecomThemesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final RecomSettingsGetRecomThemesResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new RecomSettingsGetRecomThemesResponseDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RecomSettingsGetRecomThemesResponseDto[] newArray(int i) {
            return new RecomSettingsGetRecomThemesResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecomSettingsGetRecomThemesResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<Integer> d() {
        return this.recomThemesIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isNeedUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecomSettingsGetRecomThemesResponseDto)) {
            return false;
        }
        RecomSettingsGetRecomThemesResponseDto recomSettingsGetRecomThemesResponseDto = (RecomSettingsGetRecomThemesResponseDto) obj;
        return epx.f(this.isNeedUpdate, recomSettingsGetRecomThemesResponseDto.isNeedUpdate) && epx.f(this.recomThemesIds, recomSettingsGetRecomThemesResponseDto.recomThemesIds);
    }

    public final int hashCode() {
        Boolean bool = this.isNeedUpdate;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<Integer> list = this.recomThemesIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecomSettingsGetRecomThemesResponseDto(isNeedUpdate=");
        sb.append(this.isNeedUpdate);
        sb.append(", recomThemesIds=");
        return ms9.a(')', sb, this.recomThemesIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isNeedUpdate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<Integer> list = this.recomThemesIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public RecomSettingsGetRecomThemesResponseDto(Boolean bool, List<Integer> list) {
        this.isNeedUpdate = bool;
        this.recomThemesIds = list;
    }

    public /* synthetic */ RecomSettingsGetRecomThemesResponseDto(Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list);
    }
}

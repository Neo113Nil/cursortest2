package com.vk.api.generated.specials.dto;

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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpecialsEasterEggPositionDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsEasterEggPositionDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsEasterEggPositionDto> CREATOR = new a();

    @pmi0("appearance")
    private final SpecialsEasterEggAppearanceDto appearance;

    @pmi0("constraints")
    private final List<SpecialsEasterEggConstraintDto> constraints;

    @pmi0("nav_screen")
    private final String navScreen;

    @pmi0("position_id")
    private final Integer positionId;

    @pmi0("url_regexp")
    private final String urlRegexp;

    /* compiled from: SpecialsEasterEggPositionDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsEasterEggPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggPositionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            SpecialsEasterEggAppearanceDto createFromParcel = SpecialsEasterEggAppearanceDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SpecialsEasterEggConstraintDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SpecialsEasterEggPositionDto(readString, createFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggPositionDto[] newArray(int i) {
            return new SpecialsEasterEggPositionDto[i];
        }
    }

    public SpecialsEasterEggPositionDto(String str, SpecialsEasterEggAppearanceDto specialsEasterEggAppearanceDto, List<SpecialsEasterEggConstraintDto> list, Integer num, String str2) {
        this.navScreen = str;
        this.appearance = specialsEasterEggAppearanceDto;
        this.constraints = list;
        this.positionId = num;
        this.urlRegexp = str2;
    }

    public final SpecialsEasterEggAppearanceDto d() {
        return this.appearance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<SpecialsEasterEggConstraintDto> e() {
        return this.constraints;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsEasterEggPositionDto)) {
            return false;
        }
        SpecialsEasterEggPositionDto specialsEasterEggPositionDto = (SpecialsEasterEggPositionDto) obj;
        return epx.f(this.navScreen, specialsEasterEggPositionDto.navScreen) && epx.f(this.appearance, specialsEasterEggPositionDto.appearance) && epx.f(this.constraints, specialsEasterEggPositionDto.constraints) && epx.f(this.positionId, specialsEasterEggPositionDto.positionId) && epx.f(this.urlRegexp, specialsEasterEggPositionDto.urlRegexp);
    }

    public final String f() {
        return this.navScreen;
    }

    public final Integer g() {
        return this.positionId;
    }

    public final int hashCode() {
        int a2 = fw3.a((this.appearance.hashCode() + (this.navScreen.hashCode() * 31)) * 31, 31, this.constraints);
        Integer num = this.positionId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.urlRegexp;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsEasterEggPositionDto(navScreen=");
        sb.append(this.navScreen);
        sb.append(", appearance=");
        sb.append(this.appearance);
        sb.append(", constraints=");
        sb.append(this.constraints);
        sb.append(", positionId=");
        sb.append(this.positionId);
        sb.append(", urlRegexp=");
        return ho8.a(sb, this.urlRegexp, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.navScreen);
        this.appearance.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.constraints);
        while (a2.hasNext()) {
            ((SpecialsEasterEggConstraintDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.positionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.urlRegexp);
    }

    public /* synthetic */ SpecialsEasterEggPositionDto(String str, SpecialsEasterEggAppearanceDto specialsEasterEggAppearanceDto, List list, Integer num, String str2, int i, zcl zclVar) {
        this(str, specialsEasterEggAppearanceDto, list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2);
    }
}

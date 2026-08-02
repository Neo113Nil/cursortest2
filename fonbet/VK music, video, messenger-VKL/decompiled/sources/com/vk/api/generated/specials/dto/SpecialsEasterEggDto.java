package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: SpecialsEasterEggDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsEasterEggDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsEasterEggDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("animation")
    private final SpecialsAnimationDto animation;

    @pmi0("app_id")
    private final int appId;

    @pmi0("click_animation")
    private final SpecialsAnimationDto clickAnimation;

    @pmi0("event_id")
    private final int eventId;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("max_height")
    private final int maxHeight;

    @pmi0("max_width")
    private final int maxWidth;

    @pmi0("positions")
    private final List<SpecialsEasterEggPositionDto> positions;

    /* compiled from: SpecialsEasterEggDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsEasterEggDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt6) {
                i2 = en.a(SpecialsEasterEggPositionDto.CREATOR, parcel, arrayList, i2, 1);
            }
            BaseLinkButtonActionDto baseLinkButtonActionDto = (BaseLinkButtonActionDto) parcel.readParcelable(SpecialsEasterEggDto.class.getClassLoader());
            ArrayList arrayList2 = null;
            SpecialsAnimationDto createFromParcel = parcel.readInt() == 0 ? null : SpecialsAnimationDto.CREATOR.createFromParcel(parcel);
            SpecialsAnimationDto createFromParcel2 = parcel.readInt() == 0 ? null : SpecialsAnimationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt7);
                while (i != readInt7) {
                    i = bo.b(SpecialsEasterEggDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new SpecialsEasterEggDto(readInt, readInt2, readInt3, readInt4, readInt5, arrayList, baseLinkButtonActionDto, createFromParcel, createFromParcel2, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsEasterEggDto[] newArray(int i) {
            return new SpecialsEasterEggDto[i];
        }
    }

    public SpecialsEasterEggDto(int i, int i2, int i3, int i4, int i5, List<SpecialsEasterEggPositionDto> list, BaseLinkButtonActionDto baseLinkButtonActionDto, SpecialsAnimationDto specialsAnimationDto, SpecialsAnimationDto specialsAnimationDto2, List<BaseImageDto> list2) {
        this.id = i;
        this.eventId = i2;
        this.appId = i3;
        this.maxWidth = i4;
        this.maxHeight = i5;
        this.positions = list;
        this.action = baseLinkButtonActionDto;
        this.animation = specialsAnimationDto;
        this.clickAnimation = specialsAnimationDto2;
        this.images = list2;
    }

    public final int L0() {
        return this.maxHeight;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SpecialsAnimationDto e() {
        return this.animation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsEasterEggDto)) {
            return false;
        }
        SpecialsEasterEggDto specialsEasterEggDto = (SpecialsEasterEggDto) obj;
        return this.id == specialsEasterEggDto.id && this.eventId == specialsEasterEggDto.eventId && this.appId == specialsEasterEggDto.appId && this.maxWidth == specialsEasterEggDto.maxWidth && this.maxHeight == specialsEasterEggDto.maxHeight && epx.f(this.positions, specialsEasterEggDto.positions) && epx.f(this.action, specialsEasterEggDto.action) && epx.f(this.animation, specialsEasterEggDto.animation) && epx.f(this.clickAnimation, specialsEasterEggDto.clickAnimation) && epx.f(this.images, specialsEasterEggDto.images);
    }

    public final int f() {
        return this.appId;
    }

    public final SpecialsAnimationDto g() {
        return this.clickAnimation;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.maxHeight, shy.a(this.maxWidth, shy.a(this.appId, shy.a(this.eventId, Integer.hashCode(this.id) * 31, 31), 31), 31), 31), 31, this.positions);
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (a2 + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        SpecialsAnimationDto specialsAnimationDto = this.animation;
        int hashCode2 = (hashCode + (specialsAnimationDto == null ? 0 : specialsAnimationDto.hashCode())) * 31;
        SpecialsAnimationDto specialsAnimationDto2 = this.clickAnimation;
        int hashCode3 = (hashCode2 + (specialsAnimationDto2 == null ? 0 : specialsAnimationDto2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final int i() {
        return this.eventId;
    }

    public final List<BaseImageDto> j() {
        return this.images;
    }

    public final List<SpecialsEasterEggPositionDto> k() {
        return this.positions;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialsEasterEggDto(id=");
        sb.append(this.id);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(", maxHeight=");
        sb.append(this.maxHeight);
        sb.append(", positions=");
        sb.append(this.positions);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", animation=");
        sb.append(this.animation);
        sb.append(", clickAnimation=");
        sb.append(this.clickAnimation);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.eventId);
        parcel.writeInt(this.appId);
        parcel.writeInt(this.maxWidth);
        parcel.writeInt(this.maxHeight);
        Iterator a2 = ao.a(parcel, this.positions);
        while (a2.hasNext()) {
            ((SpecialsEasterEggPositionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.action, i);
        SpecialsAnimationDto specialsAnimationDto = this.animation;
        if (specialsAnimationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsAnimationDto.writeToParcel(parcel, i);
        }
        SpecialsAnimationDto specialsAnimationDto2 = this.clickAnimation;
        if (specialsAnimationDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsAnimationDto2.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ SpecialsEasterEggDto(int i, int i2, int i3, int i4, int i5, List list, BaseLinkButtonActionDto baseLinkButtonActionDto, SpecialsAnimationDto specialsAnimationDto, SpecialsAnimationDto specialsAnimationDto2, List list2, int i6, zcl zclVar) {
        this(i, i2, i3, i4, i5, list, (i6 & 64) != 0 ? null : baseLinkButtonActionDto, (i6 & 128) != 0 ? null : specialsAnimationDto, (i6 & 256) != 0 ? null : specialsAnimationDto2, (i6 & 512) != 0 ? null : list2);
    }
}

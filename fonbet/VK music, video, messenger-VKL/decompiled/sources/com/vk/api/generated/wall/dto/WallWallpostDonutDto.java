package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.donut.dto.DonutPaidDurationDto;
import com.vk.api.generated.donut.dto.DonutPaywallDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallpostDonutDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostDonutDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostDonutDto> CREATOR = new a();

    @pmi0("can_publish_free_copy")
    private final Boolean canPublishFreeCopy;

    @pmi0("donut_level_id")
    private final Integer donutLevelId;

    @pmi0("durations")
    private final List<DonutPaidDurationDto> durations;

    @pmi0("edit_mode")
    private final EditModeDto editMode;

    @pmi0("is_donut")
    private final boolean isDonut;

    @pmi0("is_level_supported")
    private final Boolean isLevelSupported;

    @pmi0("paid_duration")
    private final Integer paidDuration;

    @pmi0("paywall")
    private final DonutPaywallDto paywall;

    @pmi0("photo_avg_color")
    private final String photoAvgColor;

    @pmi0("placeholder")
    private final WallWallpostDonutPlaceholderDto placeholder;

    @pmi0("price")
    private final String price;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostDonutDto.kt */
    public static final class EditModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EditModeDto[] $VALUES;

        @pmi0("all")
        public static final EditModeDto ALL;
        public static final Parcelable.Creator<EditModeDto> CREATOR;

        @pmi0("duration")
        public static final EditModeDto DURATION;
        private final String value;

        /* compiled from: WallWallpostDonutDto.kt */
        public static final class a implements Parcelable.Creator<EditModeDto> {
            @Override // android.os.Parcelable.Creator
            public final EditModeDto createFromParcel(Parcel parcel) {
                return EditModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditModeDto[] newArray(int i) {
                return new EditModeDto[i];
            }
        }

        static {
            EditModeDto editModeDto = new EditModeDto("ALL", 0, "all");
            ALL = editModeDto;
            EditModeDto editModeDto2 = new EditModeDto("DURATION", 1, "duration");
            DURATION = editModeDto2;
            EditModeDto[] editModeDtoArr = {editModeDto, editModeDto2};
            $VALUES = editModeDtoArr;
            $ENTRIES = new asp(editModeDtoArr);
            CREATOR = new a();
        }

        private EditModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static EditModeDto valueOf(String str) {
            return (EditModeDto) Enum.valueOf(EditModeDto.class, str);
        }

        public static EditModeDto[] values() {
            return (EditModeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WallWallpostDonutDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostDonutDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostDonutDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WallWallpostDonutPlaceholderDto createFromParcel = parcel.readInt() == 0 ? null : WallWallpostDonutPlaceholderDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DonutPaywallDto createFromParcel2 = parcel.readInt() == 0 ? null : DonutPaywallDto.CREATOR.createFromParcel(parcel);
            EditModeDto createFromParcel3 = parcel.readInt() == 0 ? null : EditModeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(DonutPaidDurationDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallWallpostDonutDto(z, valueOf2, valueOf3, createFromParcel, valueOf, createFromParcel2, createFromParcel3, arrayList, readString, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostDonutDto[] newArray(int i) {
            return new WallWallpostDonutDto[i];
        }
    }

    public WallWallpostDonutDto(boolean z, Integer num, Integer num2, WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto, Boolean bool, DonutPaywallDto donutPaywallDto, EditModeDto editModeDto, List<DonutPaidDurationDto> list, String str, Boolean bool2, String str2) {
        this.isDonut = z;
        this.donutLevelId = num;
        this.paidDuration = num2;
        this.placeholder = wallWallpostDonutPlaceholderDto;
        this.canPublishFreeCopy = bool;
        this.paywall = donutPaywallDto;
        this.editMode = editModeDto;
        this.durations = list;
        this.price = str;
        this.isLevelSupported = bool2;
        this.photoAvgColor = str2;
    }

    public final Boolean d() {
        return this.canPublishFreeCopy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.donutLevelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostDonutDto)) {
            return false;
        }
        WallWallpostDonutDto wallWallpostDonutDto = (WallWallpostDonutDto) obj;
        return this.isDonut == wallWallpostDonutDto.isDonut && epx.f(this.donutLevelId, wallWallpostDonutDto.donutLevelId) && epx.f(this.paidDuration, wallWallpostDonutDto.paidDuration) && epx.f(this.placeholder, wallWallpostDonutDto.placeholder) && epx.f(this.canPublishFreeCopy, wallWallpostDonutDto.canPublishFreeCopy) && epx.f(this.paywall, wallWallpostDonutDto.paywall) && this.editMode == wallWallpostDonutDto.editMode && epx.f(this.durations, wallWallpostDonutDto.durations) && epx.f(this.price, wallWallpostDonutDto.price) && epx.f(this.isLevelSupported, wallWallpostDonutDto.isLevelSupported) && epx.f(this.photoAvgColor, wallWallpostDonutDto.photoAvgColor);
    }

    public final List<DonutPaidDurationDto> f() {
        return this.durations;
    }

    public final EditModeDto g() {
        return this.editMode;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isDonut) * 31;
        Integer num = this.donutLevelId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.paidDuration;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto = this.placeholder;
        int hashCode4 = (hashCode3 + (wallWallpostDonutPlaceholderDto == null ? 0 : wallWallpostDonutPlaceholderDto.hashCode())) * 31;
        Boolean bool = this.canPublishFreeCopy;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        DonutPaywallDto donutPaywallDto = this.paywall;
        int hashCode6 = (hashCode5 + (donutPaywallDto == null ? 0 : donutPaywallDto.hashCode())) * 31;
        EditModeDto editModeDto = this.editMode;
        int hashCode7 = (hashCode6 + (editModeDto == null ? 0 : editModeDto.hashCode())) * 31;
        List<DonutPaidDurationDto> list = this.durations;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.price;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isLevelSupported;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.photoAvgColor;
        return hashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Integer i() {
        return this.paidDuration;
    }

    public final DonutPaywallDto j() {
        return this.paywall;
    }

    public final String k() {
        return this.photoAvgColor;
    }

    public final WallWallpostDonutPlaceholderDto l() {
        return this.placeholder;
    }

    public final String n() {
        return this.price;
    }

    public final boolean o() {
        return this.isDonut;
    }

    public final Boolean p() {
        return this.isLevelSupported;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostDonutDto(isDonut=");
        sb.append(this.isDonut);
        sb.append(", donutLevelId=");
        sb.append(this.donutLevelId);
        sb.append(", paidDuration=");
        sb.append(this.paidDuration);
        sb.append(", placeholder=");
        sb.append(this.placeholder);
        sb.append(", canPublishFreeCopy=");
        sb.append(this.canPublishFreeCopy);
        sb.append(", paywall=");
        sb.append(this.paywall);
        sb.append(", editMode=");
        sb.append(this.editMode);
        sb.append(", durations=");
        sb.append(this.durations);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", isLevelSupported=");
        sb.append(this.isLevelSupported);
        sb.append(", photoAvgColor=");
        return ho8.a(sb, this.photoAvgColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDonut ? 1 : 0);
        Integer num = this.donutLevelId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.paidDuration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto = this.placeholder;
        if (wallWallpostDonutPlaceholderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostDonutPlaceholderDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canPublishFreeCopy;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        DonutPaywallDto donutPaywallDto = this.paywall;
        if (donutPaywallDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutPaywallDto.writeToParcel(parcel, i);
        }
        EditModeDto editModeDto = this.editMode;
        if (editModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editModeDto.writeToParcel(parcel, i);
        }
        List<DonutPaidDurationDto> list = this.durations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((DonutPaidDurationDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.price);
        Boolean bool2 = this.isLevelSupported;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.photoAvgColor);
    }

    public /* synthetic */ WallWallpostDonutDto(boolean z, Integer num, Integer num2, WallWallpostDonutPlaceholderDto wallWallpostDonutPlaceholderDto, Boolean bool, DonutPaywallDto donutPaywallDto, EditModeDto editModeDto, List list, String str, Boolean bool2, String str2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : wallWallpostDonutPlaceholderDto, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : donutPaywallDto, (i & 64) != 0 ? null : editModeDto, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str2);
    }
}

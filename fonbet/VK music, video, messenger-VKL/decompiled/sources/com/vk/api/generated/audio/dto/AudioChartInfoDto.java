package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioChartInfoDto.kt */
/* loaded from: classes14.dex */
public final class AudioChartInfoDto implements Parcelable {
    public static final Parcelable.Creator<AudioChartInfoDto> CREATOR = new a();

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("state")
    private final StateDto state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioChartInfoDto.kt */
    public static final class StateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;
        public static final Parcelable.Creator<StateDto> CREATOR;

        @pmi0("3")
        public static final StateDto MOVED_DOWN;

        @pmi0("2")
        public static final StateDto MOVED_UP;

        @pmi0("0")
        public static final StateDto NEW_RELEASE;

        @pmi0("1")
        public static final StateDto NO_CHANGES;
        private final int value;

        /* compiled from: AudioChartInfoDto.kt */
        public static final class a implements Parcelable.Creator<StateDto> {
            @Override // android.os.Parcelable.Creator
            public final StateDto createFromParcel(Parcel parcel) {
                return StateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StateDto[] newArray(int i) {
                return new StateDto[i];
            }
        }

        static {
            StateDto stateDto = new StateDto("NEW_RELEASE", 0, 0);
            NEW_RELEASE = stateDto;
            StateDto stateDto2 = new StateDto("NO_CHANGES", 1, 1);
            NO_CHANGES = stateDto2;
            StateDto stateDto3 = new StateDto("MOVED_UP", 2, 2);
            MOVED_UP = stateDto3;
            StateDto stateDto4 = new StateDto("MOVED_DOWN", 3, 3);
            MOVED_DOWN = stateDto4;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3, stateDto4};
            $VALUES = stateDtoArr;
            $ENTRIES = new asp(stateDtoArr);
            CREATOR = new a();
        }

        private StateDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AudioChartInfoDto.kt */
    public static final class a implements Parcelable.Creator<AudioChartInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioChartInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            StateDto createFromParcel = parcel.readInt() == 0 ? null : StateDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AudioChartInfoDto(valueOf, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioChartInfoDto[] newArray(int i) {
            return new AudioChartInfoDto[i];
        }
    }

    public AudioChartInfoDto() {
        this(null, null, null, 7, null);
    }

    public final List<BaseImageDto> d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioChartInfoDto)) {
            return false;
        }
        AudioChartInfoDto audioChartInfoDto = (AudioChartInfoDto) obj;
        return epx.f(this.position, audioChartInfoDto.position) && this.state == audioChartInfoDto.state && epx.f(this.icon, audioChartInfoDto.icon);
    }

    public final StateDto f() {
        return this.state;
    }

    public final int hashCode() {
        Integer num = this.position;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        StateDto stateDto = this.state;
        int hashCode2 = (hashCode + (stateDto == null ? 0 : stateDto.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioChartInfoDto(position=");
        sb.append(this.position);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", icon=");
        return ms9.a(')', sb, this.icon);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        StateDto stateDto = this.state;
        if (stateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stateDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AudioChartInfoDto(Integer num, StateDto stateDto, List<BaseImageDto> list) {
        this.position = num;
        this.state = stateDto;
        this.icon = list;
    }

    public /* synthetic */ AudioChartInfoDto(Integer num, StateDto stateDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : stateDto, (i & 4) != 0 ? null : list);
    }
}

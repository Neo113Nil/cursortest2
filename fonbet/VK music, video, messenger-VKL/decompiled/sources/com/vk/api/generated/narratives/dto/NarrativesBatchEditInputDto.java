package com.vk.api.generated.narratives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NarrativesBatchEditInputDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesBatchEditInputDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesBatchEditInputDto> CREATOR = new a();

    @pmi0("after")
    private final Integer after;

    @pmi0("before")
    private final Integer before;

    @pmi0("narrative_id")
    private final Integer narrativeId;

    @pmi0("op")
    private final OpDto op;

    @pmi0("story_id")
    private final Integer storyId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NarrativesBatchEditInputDto.kt */
    public static final class OpDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpDto[] $VALUES;

        @pmi0("add")
        public static final OpDto ADD;
        public static final Parcelable.Creator<OpDto> CREATOR;

        @pmi0("delete")
        public static final OpDto DELETE;

        @pmi0("delete_narrative")
        public static final OpDto DELETE_NARRATIVE;

        @pmi0("reorder")
        public static final OpDto REORDER;
        private final String value;

        /* compiled from: NarrativesBatchEditInputDto.kt */
        public static final class a implements Parcelable.Creator<OpDto> {
            @Override // android.os.Parcelable.Creator
            public final OpDto createFromParcel(Parcel parcel) {
                return OpDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpDto[] newArray(int i) {
                return new OpDto[i];
            }
        }

        static {
            OpDto opDto = new OpDto("ADD", 0, "add");
            ADD = opDto;
            OpDto opDto2 = new OpDto("DELETE", 1, "delete");
            DELETE = opDto2;
            OpDto opDto3 = new OpDto("DELETE_NARRATIVE", 2, "delete_narrative");
            DELETE_NARRATIVE = opDto3;
            OpDto opDto4 = new OpDto("REORDER", 3, "reorder");
            REORDER = opDto4;
            OpDto[] opDtoArr = {opDto, opDto2, opDto3, opDto4};
            $VALUES = opDtoArr;
            $ENTRIES = new asp(opDtoArr);
            CREATOR = new a();
        }

        private OpDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OpDto valueOf(String str) {
            return (OpDto) Enum.valueOf(OpDto.class, str);
        }

        public static OpDto[] values() {
            return (OpDto[]) $VALUES.clone();
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

    /* compiled from: NarrativesBatchEditInputDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesBatchEditInputDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesBatchEditInputDto createFromParcel(Parcel parcel) {
            return new NarrativesBatchEditInputDto(parcel.readInt() == 0 ? null : OpDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesBatchEditInputDto[] newArray(int i) {
            return new NarrativesBatchEditInputDto[i];
        }
    }

    public NarrativesBatchEditInputDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NarrativesBatchEditInputDto)) {
            return false;
        }
        NarrativesBatchEditInputDto narrativesBatchEditInputDto = (NarrativesBatchEditInputDto) obj;
        return this.op == narrativesBatchEditInputDto.op && epx.f(this.storyId, narrativesBatchEditInputDto.storyId) && epx.f(this.narrativeId, narrativesBatchEditInputDto.narrativeId) && epx.f(this.after, narrativesBatchEditInputDto.after) && epx.f(this.before, narrativesBatchEditInputDto.before);
    }

    public final int hashCode() {
        OpDto opDto = this.op;
        int hashCode = (opDto == null ? 0 : opDto.hashCode()) * 31;
        Integer num = this.storyId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.narrativeId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.after;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.before;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NarrativesBatchEditInputDto(op=");
        sb.append(this.op);
        sb.append(", storyId=");
        sb.append(this.storyId);
        sb.append(", narrativeId=");
        sb.append(this.narrativeId);
        sb.append(", after=");
        sb.append(this.after);
        sb.append(", before=");
        return uqi.b(sb, this.before, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OpDto opDto = this.op;
        if (opDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            opDto.writeToParcel(parcel, i);
        }
        Integer num = this.storyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.narrativeId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.after;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.before;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public NarrativesBatchEditInputDto(OpDto opDto, Integer num, Integer num2, Integer num3, Integer num4) {
        this.op = opDto;
        this.storyId = num;
        this.narrativeId = num2;
        this.after = num3;
        this.before = num4;
    }

    public /* synthetic */ NarrativesBatchEditInputDto(OpDto opDto, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : opDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }
}

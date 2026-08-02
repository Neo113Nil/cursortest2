package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiHeaderPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiHeaderPropsDto> CREATOR = new a();

    @pmi0("actions")
    private final List<AtumVkuiAnyActionDto> actions;

    @pmi0(TtmlNode.LEFT)
    private final AtumVkuiImageViewDto left;

    @pmi0("middle")
    private final AtumVkuiHeaderMiddleDto middle;

    @pmi0(X3.a.t)
    private final ModeDto mode;

    @pmi0(TtmlNode.RIGHT)
    private final AtumVkuiHeaderRightDto right;

    @pmi0("separator")
    private final AtumVkuiSeparatorDto separator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiHeaderPropsDto.kt */
    public static final class ModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModeDto[] $VALUES;
        public static final Parcelable.Creator<ModeDto> CREATOR;

        @pmi0("primary")
        public static final ModeDto PRIMARY;

        @pmi0(X3.i.Y)
        public static final ModeDto SECONDARY;
        private final String value;

        /* compiled from: AtumVkuiHeaderPropsDto.kt */
        public static final class a implements Parcelable.Creator<ModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ModeDto createFromParcel(Parcel parcel) {
                return ModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModeDto[] newArray(int i) {
                return new ModeDto[i];
            }
        }

        static {
            ModeDto modeDto = new ModeDto("PRIMARY", 0, "primary");
            PRIMARY = modeDto;
            ModeDto modeDto2 = new ModeDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = modeDto2;
            ModeDto[] modeDtoArr = {modeDto, modeDto2};
            $VALUES = modeDtoArr;
            $ENTRIES = new asp(modeDtoArr);
            CREATOR = new a();
        }

        private ModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ModeDto valueOf(String str) {
            return (ModeDto) Enum.valueOf(ModeDto.class, str);
        }

        public static ModeDto[] values() {
            return (ModeDto[]) $VALUES.clone();
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

    /* compiled from: AtumVkuiHeaderPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderPropsDto createFromParcel(Parcel parcel) {
            ModeDto createFromParcel = ModeDto.CREATOR.createFromParcel(parcel);
            AtumVkuiHeaderMiddleDto createFromParcel2 = AtumVkuiHeaderMiddleDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            AtumVkuiSeparatorDto createFromParcel3 = parcel.readInt() == 0 ? null : AtumVkuiSeparatorDto.CREATOR.createFromParcel(parcel);
            AtumVkuiImageViewDto createFromParcel4 = parcel.readInt() == 0 ? null : AtumVkuiImageViewDto.CREATOR.createFromParcel(parcel);
            AtumVkuiHeaderRightDto createFromParcel5 = parcel.readInt() == 0 ? null : AtumVkuiHeaderRightDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AtumVkuiAnyActionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AtumVkuiHeaderPropsDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderPropsDto[] newArray(int i) {
            return new AtumVkuiHeaderPropsDto[i];
        }
    }

    public AtumVkuiHeaderPropsDto(ModeDto modeDto, AtumVkuiHeaderMiddleDto atumVkuiHeaderMiddleDto, AtumVkuiSeparatorDto atumVkuiSeparatorDto, AtumVkuiImageViewDto atumVkuiImageViewDto, AtumVkuiHeaderRightDto atumVkuiHeaderRightDto, List<AtumVkuiAnyActionDto> list) {
        this.mode = modeDto;
        this.middle = atumVkuiHeaderMiddleDto;
        this.separator = atumVkuiSeparatorDto;
        this.left = atumVkuiImageViewDto;
        this.right = atumVkuiHeaderRightDto;
        this.actions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiHeaderPropsDto)) {
            return false;
        }
        AtumVkuiHeaderPropsDto atumVkuiHeaderPropsDto = (AtumVkuiHeaderPropsDto) obj;
        return this.mode == atumVkuiHeaderPropsDto.mode && epx.f(this.middle, atumVkuiHeaderPropsDto.middle) && epx.f(this.separator, atumVkuiHeaderPropsDto.separator) && epx.f(this.left, atumVkuiHeaderPropsDto.left) && epx.f(this.right, atumVkuiHeaderPropsDto.right) && epx.f(this.actions, atumVkuiHeaderPropsDto.actions);
    }

    public final int hashCode() {
        int hashCode = (this.middle.hashCode() + (this.mode.hashCode() * 31)) * 31;
        AtumVkuiSeparatorDto atumVkuiSeparatorDto = this.separator;
        int hashCode2 = (hashCode + (atumVkuiSeparatorDto == null ? 0 : atumVkuiSeparatorDto.hashCode())) * 31;
        AtumVkuiImageViewDto atumVkuiImageViewDto = this.left;
        int hashCode3 = (hashCode2 + (atumVkuiImageViewDto == null ? 0 : atumVkuiImageViewDto.hashCode())) * 31;
        AtumVkuiHeaderRightDto atumVkuiHeaderRightDto = this.right;
        int hashCode4 = (hashCode3 + (atumVkuiHeaderRightDto == null ? 0 : atumVkuiHeaderRightDto.hashCode())) * 31;
        List<AtumVkuiAnyActionDto> list = this.actions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiHeaderPropsDto(mode=");
        sb.append(this.mode);
        sb.append(", middle=");
        sb.append(this.middle);
        sb.append(", separator=");
        sb.append(this.separator);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.mode.writeToParcel(parcel, i);
        this.middle.writeToParcel(parcel, i);
        AtumVkuiSeparatorDto atumVkuiSeparatorDto = this.separator;
        if (atumVkuiSeparatorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiSeparatorDto.writeToParcel(parcel, i);
        }
        AtumVkuiImageViewDto atumVkuiImageViewDto = this.left;
        if (atumVkuiImageViewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiImageViewDto.writeToParcel(parcel, i);
        }
        AtumVkuiHeaderRightDto atumVkuiHeaderRightDto = this.right;
        if (atumVkuiHeaderRightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiHeaderRightDto.writeToParcel(parcel, i);
        }
        List<AtumVkuiAnyActionDto> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AtumVkuiAnyActionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiHeaderPropsDto(ModeDto modeDto, AtumVkuiHeaderMiddleDto atumVkuiHeaderMiddleDto, AtumVkuiSeparatorDto atumVkuiSeparatorDto, AtumVkuiImageViewDto atumVkuiImageViewDto, AtumVkuiHeaderRightDto atumVkuiHeaderRightDto, List list, int i, zcl zclVar) {
        this(modeDto, atumVkuiHeaderMiddleDto, (i & 4) != 0 ? null : atumVkuiSeparatorDto, (i & 8) != 0 ? null : atumVkuiImageViewDto, (i & 16) != 0 ? null : atumVkuiHeaderRightDto, (i & 32) != 0 ? null : list);
    }
}

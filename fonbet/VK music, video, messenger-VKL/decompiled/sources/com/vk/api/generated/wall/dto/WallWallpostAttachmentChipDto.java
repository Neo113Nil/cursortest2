package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: WallWallpostAttachmentChipDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentChipDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentChipDto> CREATOR = new a();

    @pmi0("icon")
    private final WallWallpostAttachmentChipIconDto icon;

    @pmi0("is_cuttable")
    private final Boolean isCuttable;

    @pmi0(TtmlNode.TAG_STYLE)
    private final WallWallpostAttachmentChipStyleDto style;

    @pmi0("title")
    private final List<NewsfeedNewsfeedItemHeaderTextDto> title;

    /* compiled from: WallWallpostAttachmentChipDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentChipDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentChipDto createFromParcel(Parcel parcel) {
            WallWallpostAttachmentChipStyleDto createFromParcel = WallWallpostAttachmentChipStyleDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NewsfeedNewsfeedItemHeaderTextDto.CREATOR, parcel, arrayList, i, 1);
            }
            Boolean bool = null;
            WallWallpostAttachmentChipIconDto createFromParcel2 = parcel.readInt() == 0 ? null : WallWallpostAttachmentChipIconDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WallWallpostAttachmentChipDto(createFromParcel, arrayList, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentChipDto[] newArray(int i) {
            return new WallWallpostAttachmentChipDto[i];
        }
    }

    public WallWallpostAttachmentChipDto(WallWallpostAttachmentChipStyleDto wallWallpostAttachmentChipStyleDto, List<NewsfeedNewsfeedItemHeaderTextDto> list, WallWallpostAttachmentChipIconDto wallWallpostAttachmentChipIconDto, Boolean bool) {
        this.style = wallWallpostAttachmentChipStyleDto;
        this.title = list;
        this.icon = wallWallpostAttachmentChipIconDto;
        this.isCuttable = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentChipDto)) {
            return false;
        }
        WallWallpostAttachmentChipDto wallWallpostAttachmentChipDto = (WallWallpostAttachmentChipDto) obj;
        return this.style == wallWallpostAttachmentChipDto.style && epx.f(this.title, wallWallpostAttachmentChipDto.title) && epx.f(this.icon, wallWallpostAttachmentChipDto.icon) && epx.f(this.isCuttable, wallWallpostAttachmentChipDto.isCuttable);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.style.hashCode() * 31, 31, this.title);
        WallWallpostAttachmentChipIconDto wallWallpostAttachmentChipIconDto = this.icon;
        int hashCode = (a2 + (wallWallpostAttachmentChipIconDto == null ? 0 : wallWallpostAttachmentChipIconDto.hashCode())) * 31;
        Boolean bool = this.isCuttable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostAttachmentChipDto(style=");
        sb.append(this.style);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", isCuttable=");
        return tn.a(sb, this.isCuttable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.style.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.title);
        while (a2.hasNext()) {
            ((NewsfeedNewsfeedItemHeaderTextDto) a2.next()).writeToParcel(parcel, i);
        }
        WallWallpostAttachmentChipIconDto wallWallpostAttachmentChipIconDto = this.icon;
        if (wallWallpostAttachmentChipIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentChipIconDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isCuttable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ WallWallpostAttachmentChipDto(WallWallpostAttachmentChipStyleDto wallWallpostAttachmentChipStyleDto, List list, WallWallpostAttachmentChipIconDto wallWallpostAttachmentChipIconDto, Boolean bool, int i, zcl zclVar) {
        this(wallWallpostAttachmentChipStyleDto, list, (i & 4) != 0 ? null : wallWallpostAttachmentChipIconDto, (i & 8) != 0 ? null : bool);
    }
}

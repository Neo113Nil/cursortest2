package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreStyles.dto.ExploreStylesStyleBaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseImageContainerDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseImageContainerDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseImageContainerDto> CREATOR = new a();

    @pmi0("action")
    private final ExploreWidgetsBaseActionDto action;

    @pmi0("items")
    private final List<BaseImageDto> items;

    @pmi0("object_id")
    private final Integer objectId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final ExploreStylesStyleBaseImageDto style;

    @pmi0("type")
    private final ExploreWidgetsBaseImageTypeDto type;

    /* compiled from: ExploreWidgetsBaseImageContainerDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseImageContainerDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseImageContainerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ExploreWidgetsBaseImageTypeDto createFromParcel = ExploreWidgetsBaseImageTypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ExploreWidgetsBaseActionDto createFromParcel2 = parcel.readInt() == 0 ? null : ExploreWidgetsBaseActionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new ExploreWidgetsBaseImageContainerDto(createFromParcel, valueOf, createFromParcel2, arrayList, parcel.readInt() != 0 ? ExploreStylesStyleBaseImageDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseImageContainerDto[] newArray(int i) {
            return new ExploreWidgetsBaseImageContainerDto[i];
        }
    }

    public ExploreWidgetsBaseImageContainerDto(ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto, Integer num, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, List<BaseImageDto> list, ExploreStylesStyleBaseImageDto exploreStylesStyleBaseImageDto) {
        this.type = exploreWidgetsBaseImageTypeDto;
        this.objectId = num;
        this.action = exploreWidgetsBaseActionDto;
        this.items = list;
        this.style = exploreStylesStyleBaseImageDto;
    }

    public final List<BaseImageDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.objectId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseImageContainerDto)) {
            return false;
        }
        ExploreWidgetsBaseImageContainerDto exploreWidgetsBaseImageContainerDto = (ExploreWidgetsBaseImageContainerDto) obj;
        return this.type == exploreWidgetsBaseImageContainerDto.type && epx.f(this.objectId, exploreWidgetsBaseImageContainerDto.objectId) && epx.f(this.action, exploreWidgetsBaseImageContainerDto.action) && epx.f(this.items, exploreWidgetsBaseImageContainerDto.items) && epx.f(this.style, exploreWidgetsBaseImageContainerDto.style);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.objectId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = this.action;
        int hashCode3 = (hashCode2 + (exploreWidgetsBaseActionDto == null ? 0 : exploreWidgetsBaseActionDto.hashCode())) * 31;
        List<BaseImageDto> list = this.items;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ExploreStylesStyleBaseImageDto exploreStylesStyleBaseImageDto = this.style;
        return hashCode4 + (exploreStylesStyleBaseImageDto != null ? exploreStylesStyleBaseImageDto.hashCode() : 0);
    }

    public final String toString() {
        return "ExploreWidgetsBaseImageContainerDto(type=" + this.type + ", objectId=" + this.objectId + ", action=" + this.action + ", items=" + this.items + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Integer num = this.objectId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = this.action;
        if (exploreWidgetsBaseActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseActionDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        ExploreStylesStyleBaseImageDto exploreStylesStyleBaseImageDto = this.style;
        if (exploreStylesStyleBaseImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseImageDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreWidgetsBaseImageContainerDto(ExploreWidgetsBaseImageTypeDto exploreWidgetsBaseImageTypeDto, Integer num, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, List list, ExploreStylesStyleBaseImageDto exploreStylesStyleBaseImageDto, int i, zcl zclVar) {
        this(exploreWidgetsBaseImageTypeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : exploreWidgetsBaseActionDto, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : exploreStylesStyleBaseImageDto);
    }
}

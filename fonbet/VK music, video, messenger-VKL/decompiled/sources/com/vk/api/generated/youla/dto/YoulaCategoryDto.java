package com.vk.api.generated.youla.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: YoulaCategoryDto.kt */
/* loaded from: classes15.dex */
public final class YoulaCategoryDto implements Parcelable {
    public static final Parcelable.Creator<YoulaCategoryDto> CREATOR = new a();

    @pmi0("enabled")
    private final Boolean enabled;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("id")
    private final int id;

    @pmi0("node_type")
    private final NodeTypeDto nodeType;

    @pmi0(C4504q2.u)
    private final Integer order;

    @pmi0("parent_id")
    private final Integer parentId;

    @pmi0("subcategories")
    private final List<YoulaCategoryDto> subcategories;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final Integer type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YoulaCategoryDto.kt */
    public static final class NodeTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NodeTypeDto[] $VALUES;

        @pmi0("category")
        public static final NodeTypeDto CATEGORY;
        public static final Parcelable.Creator<NodeTypeDto> CREATOR;

        @pmi0("root_category")
        public static final NodeTypeDto ROOT_CATEGORY;

        @pmi0("subcategory")
        public static final NodeTypeDto SUBCATEGORY;
        private final String value;

        /* compiled from: YoulaCategoryDto.kt */
        public static final class a implements Parcelable.Creator<NodeTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final NodeTypeDto createFromParcel(Parcel parcel) {
                return NodeTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NodeTypeDto[] newArray(int i) {
                return new NodeTypeDto[i];
            }
        }

        static {
            NodeTypeDto nodeTypeDto = new NodeTypeDto("ROOT_CATEGORY", 0, "root_category");
            ROOT_CATEGORY = nodeTypeDto;
            NodeTypeDto nodeTypeDto2 = new NodeTypeDto("CATEGORY", 1, "category");
            CATEGORY = nodeTypeDto2;
            NodeTypeDto nodeTypeDto3 = new NodeTypeDto("SUBCATEGORY", 2, "subcategory");
            SUBCATEGORY = nodeTypeDto3;
            NodeTypeDto[] nodeTypeDtoArr = {nodeTypeDto, nodeTypeDto2, nodeTypeDto3};
            $VALUES = nodeTypeDtoArr;
            $ENTRIES = new asp(nodeTypeDtoArr);
            CREATOR = new a();
        }

        private NodeTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static NodeTypeDto valueOf(String str) {
            return (NodeTypeDto) Enum.valueOf(NodeTypeDto.class, str);
        }

        public static NodeTypeDto[] values() {
            return (NodeTypeDto[]) $VALUES.clone();
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

    /* compiled from: YoulaCategoryDto.kt */
    public static final class a implements Parcelable.Creator<YoulaCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final YoulaCategoryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(YoulaCategoryDto.CREATOR, parcel, arrayList3, i2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            NodeTypeDto createFromParcel = parcel.readInt() == 0 ? null : NodeTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(YoulaCategoryDto.class, parcel, arrayList4, i, 1);
                }
                arrayList2 = arrayList4;
            }
            return new YoulaCategoryDto(readInt, readString, valueOf2, arrayList, valueOf, valueOf3, valueOf4, createFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final YoulaCategoryDto[] newArray(int i) {
            return new YoulaCategoryDto[i];
        }
    }

    public YoulaCategoryDto(int i, String str, Integer num, List<YoulaCategoryDto> list, Boolean bool, Integer num2, Integer num3, NodeTypeDto nodeTypeDto, List<BaseImageDto> list2) {
        this.id = i;
        this.title = str;
        this.parentId = num;
        this.subcategories = list;
        this.enabled = bool;
        this.type = num2;
        this.order = num3;
        this.nodeType = nodeTypeDto;
        this.icons = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YoulaCategoryDto)) {
            return false;
        }
        YoulaCategoryDto youlaCategoryDto = (YoulaCategoryDto) obj;
        return this.id == youlaCategoryDto.id && epx.f(this.title, youlaCategoryDto.title) && epx.f(this.parentId, youlaCategoryDto.parentId) && epx.f(this.subcategories, youlaCategoryDto.subcategories) && epx.f(this.enabled, youlaCategoryDto.enabled) && epx.f(this.type, youlaCategoryDto.type) && epx.f(this.order, youlaCategoryDto.order) && this.nodeType == youlaCategoryDto.nodeType && epx.f(this.icons, youlaCategoryDto.icons);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        Integer num = this.parentId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<YoulaCategoryDto> list = this.subcategories;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.type;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.order;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        NodeTypeDto nodeTypeDto = this.nodeType;
        int hashCode6 = (hashCode5 + (nodeTypeDto == null ? 0 : nodeTypeDto.hashCode())) * 31;
        List<BaseImageDto> list2 = this.icons;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YoulaCategoryDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", parentId=");
        sb.append(this.parentId);
        sb.append(", subcategories=");
        sb.append(this.subcategories);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(", nodeType=");
        sb.append(this.nodeType);
        sb.append(", icons=");
        return ms9.a(')', sb, this.icons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        Integer num = this.parentId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<YoulaCategoryDto> list = this.subcategories;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((YoulaCategoryDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.order;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        NodeTypeDto nodeTypeDto = this.nodeType;
        if (nodeTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nodeTypeDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list2 = this.icons;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ YoulaCategoryDto(int i, String str, Integer num, List list, Boolean bool, Integer num2, Integer num3, NodeTypeDto nodeTypeDto, List list2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : nodeTypeDto, (i2 & 256) != 0 ? null : list2);
    }
}

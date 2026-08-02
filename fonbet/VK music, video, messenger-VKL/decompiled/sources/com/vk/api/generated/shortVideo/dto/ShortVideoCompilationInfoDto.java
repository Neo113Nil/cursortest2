package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ShortVideoCompilationInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoCompilationInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoCompilationInfoDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("hidden")
    private final Boolean hidden;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final Integer id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("name")
    private final String name;

    @pmi0("videos_count")
    private final Integer videosCount;

    /* compiled from: ShortVideoCompilationInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoCompilationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoCompilationInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoCompilationInfoDto(valueOf, readString, readString2, valueOf2, readString3, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoCompilationInfoDto[] newArray(int i) {
            return new ShortVideoCompilationInfoDto[i];
        }
    }

    public ShortVideoCompilationInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoCompilationInfoDto)) {
            return false;
        }
        ShortVideoCompilationInfoDto shortVideoCompilationInfoDto = (ShortVideoCompilationInfoDto) obj;
        return epx.f(this.id, shortVideoCompilationInfoDto.id) && epx.f(this.name, shortVideoCompilationInfoDto.name) && epx.f(this.icon, shortVideoCompilationInfoDto.icon) && epx.f(this.videosCount, shortVideoCompilationInfoDto.videosCount) && epx.f(this.description, shortVideoCompilationInfoDto.description) && epx.f(this.image, shortVideoCompilationInfoDto.image) && epx.f(this.hidden, shortVideoCompilationInfoDto.hidden);
    }

    public final List<BaseImageDto> f() {
        return this.image;
    }

    public final String g() {
        return this.name;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.videosCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseImageDto> list = this.image;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hidden;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Integer i() {
        return this.videosCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoCompilationInfoDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", videosCount=");
        sb.append(this.videosCount);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", hidden=");
        return tn.a(sb, this.hidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        Integer num2 = this.videosCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.description);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public ShortVideoCompilationInfoDto(Integer num, String str, String str2, Integer num2, String str3, List<BaseImageDto> list, Boolean bool) {
        this.id = num;
        this.name = str;
        this.icon = str2;
        this.videosCount = num2;
        this.description = str3;
        this.image = list;
        this.hidden = bool;
    }

    public /* synthetic */ ShortVideoCompilationInfoDto(Integer num, String str, String str2, Integer num2, String str3, List list, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool);
    }
}

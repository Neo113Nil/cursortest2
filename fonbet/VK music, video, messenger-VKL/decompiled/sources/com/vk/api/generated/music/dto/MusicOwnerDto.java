package com.vk.api.generated.music.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MusicOwnerDto.kt */
/* loaded from: classes15.dex */
public final class MusicOwnerDto implements Parcelable {
    public static final Parcelable.Creator<MusicOwnerDto> CREATOR = new a();

    @pmi0("curator_id")
    private final Integer curatorId;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MusicOwnerDto.kt */
    public static final class a implements Parcelable.Creator<MusicOwnerDto> {
        @Override // android.os.Parcelable.Creator
        public final MusicOwnerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MusicOwnerDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MusicOwnerDto(readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MusicOwnerDto[] newArray(int i) {
            return new MusicOwnerDto[i];
        }
    }

    public MusicOwnerDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Integer d() {
        return this.curatorId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicOwnerDto)) {
            return false;
        }
        MusicOwnerDto musicOwnerDto = (MusicOwnerDto) obj;
        return epx.f(this.id, musicOwnerDto.id) && epx.f(this.image, musicOwnerDto.image) && epx.f(this.subtitle, musicOwnerDto.subtitle) && epx.f(this.title, musicOwnerDto.title) && epx.f(this.url, musicOwnerDto.url) && epx.f(this.curatorId, musicOwnerDto.curatorId);
    }

    public final String f() {
        return this.subtitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.image;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.curatorId;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicOwnerDto(id=");
        sb.append(this.id);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", curatorId=");
        return uqi.b(sb, this.curatorId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        Integer num = this.curatorId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MusicOwnerDto(String str, List<BaseImageDto> list, String str2, String str3, String str4, Integer num) {
        this.id = str;
        this.image = list;
        this.subtitle = str2;
        this.title = str3;
        this.url = str4;
        this.curatorId = num;
    }

    public /* synthetic */ MusicOwnerDto(String str, List list, String str2, String str3, String str4, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num);
    }
}

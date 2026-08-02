package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AudioCuratorDto.kt */
/* loaded from: classes14.dex */
public final class AudioCuratorDto implements Parcelable {
    public static final Parcelable.Creator<AudioCuratorDto> CREATOR = new a();

    @pmi0("can_follow")
    private final Boolean canFollow;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_followed")
    private final Boolean isFollowed;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("url")
    private final String url;

    /* compiled from: AudioCuratorDto.kt */
    public static final class a implements Parcelable.Creator<AudioCuratorDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioCuratorDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AudioCuratorDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AudioCuratorDto(valueOf2, readString, readString2, readString3, arrayList, valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioCuratorDto[] newArray(int i) {
            return new AudioCuratorDto[i];
        }
    }

    public AudioCuratorDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Boolean d() {
        return this.canFollow;
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
        if (!(obj instanceof AudioCuratorDto)) {
            return false;
        }
        AudioCuratorDto audioCuratorDto = (AudioCuratorDto) obj;
        return epx.f(this.id, audioCuratorDto.id) && epx.f(this.name, audioCuratorDto.name) && epx.f(this.description, audioCuratorDto.description) && epx.f(this.url, audioCuratorDto.url) && epx.f(this.photo, audioCuratorDto.photo) && epx.f(this.isFollowed, audioCuratorDto.isFollowed) && epx.f(this.canFollow, audioCuratorDto.canFollow) && epx.f(this.trackCode, audioCuratorDto.trackCode);
    }

    public final String f() {
        return this.name;
    }

    public final List<BaseImageDto> g() {
        return this.photo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseImageDto> list = this.photo;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isFollowed;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canFollow;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.trackCode;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isFollowed;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioCuratorDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", isFollowed=");
        sb.append(this.isFollowed);
        sb.append(", canFollow=");
        sb.append(this.canFollow);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
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
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        List<BaseImageDto> list = this.photo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.isFollowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canFollow;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.trackCode);
    }

    public AudioCuratorDto(Integer num, String str, String str2, String str3, List<BaseImageDto> list, Boolean bool, Boolean bool2, String str4) {
        this.id = num;
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.photo = list;
        this.isFollowed = bool;
        this.canFollow = bool2;
        this.trackCode = str4;
    }

    public /* synthetic */ AudioCuratorDto(Integer num, String str, String str2, String str3, List list, Boolean bool, Boolean bool2, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : str4);
    }
}

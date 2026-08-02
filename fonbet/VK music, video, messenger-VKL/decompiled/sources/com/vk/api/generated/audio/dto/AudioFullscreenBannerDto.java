package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AudioFullscreenBannerDto.kt */
/* loaded from: classes14.dex */
public final class AudioFullscreenBannerDto implements Parcelable {
    public static final Parcelable.Creator<AudioFullscreenBannerDto> CREATOR = new a();

    @pmi0(L2.g)
    private final List<BaseImageDto> background;

    @pmi0("blocks")
    private final List<AudioBannerBlockDto> blocks;

    @pmi0("buttons")
    private final List<BaseLinkButtonDto> buttons;

    @pmi0("close_button")
    private final Boolean closeButton;

    @pmi0("id")
    private final Integer id;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AudioFullscreenBannerDto.kt */
    public static final class a implements Parcelable.Creator<AudioFullscreenBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioFullscreenBannerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            ArrayList arrayList2;
            ArrayList arrayList3 = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(AudioFullscreenBannerDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(AudioFullscreenBannerDto.class, parcel, arrayList2, i3, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(AudioBannerBlockDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new AudioFullscreenBannerDto(valueOf2, arrayList, valueOf, arrayList2, readString, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFullscreenBannerDto[] newArray(int i) {
            return new AudioFullscreenBannerDto[i];
        }
    }

    public AudioFullscreenBannerDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFullscreenBannerDto)) {
            return false;
        }
        AudioFullscreenBannerDto audioFullscreenBannerDto = (AudioFullscreenBannerDto) obj;
        return epx.f(this.id, audioFullscreenBannerDto.id) && epx.f(this.buttons, audioFullscreenBannerDto.buttons) && epx.f(this.closeButton, audioFullscreenBannerDto.closeButton) && epx.f(this.background, audioFullscreenBannerDto.background) && epx.f(this.trackCode, audioFullscreenBannerDto.trackCode) && epx.f(this.blocks, audioFullscreenBannerDto.blocks);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<BaseLinkButtonDto> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.closeButton;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BaseImageDto> list2 = this.background;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<AudioBannerBlockDto> list3 = this.blocks;
        return hashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFullscreenBannerDto(id=");
        sb.append(this.id);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", closeButton=");
        sb.append(this.closeButton);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", blocks=");
        return ms9.a(')', sb, this.blocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseLinkButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.closeButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<BaseImageDto> list2 = this.background;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.trackCode);
        List<AudioBannerBlockDto> list3 = this.blocks;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((AudioBannerBlockDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public AudioFullscreenBannerDto(Integer num, List<BaseLinkButtonDto> list, Boolean bool, List<BaseImageDto> list2, String str, List<AudioBannerBlockDto> list3) {
        this.id = num;
        this.buttons = list;
        this.closeButton = bool;
        this.background = list2;
        this.trackCode = str;
        this.blocks = list3;
    }

    public /* synthetic */ AudioFullscreenBannerDto(Integer num, List list, Boolean bool, List list2, String str, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list3);
    }
}

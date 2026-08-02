package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoChannelsSaveLinksResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsSaveLinksResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsSaveLinksResponseDto> CREATOR = new a();

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<VideoChannelsErrorBagItemDto> errors;

    @pmi0("new_ids")
    private final List<Integer> newIds;

    @pmi0(ApiUris.SCHEME_OK)
    private final boolean ok;

    /* compiled from: VideoChannelsSaveLinksResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsSaveLinksResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsSaveLinksResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(VideoChannelsErrorBagItemDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new VideoChannelsSaveLinksResponseDto(z, arrayList, valueOf, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsSaveLinksResponseDto[] newArray(int i) {
            return new VideoChannelsSaveLinksResponseDto[i];
        }
    }

    public VideoChannelsSaveLinksResponseDto(boolean z, List<Integer> list, Integer num, List<VideoChannelsErrorBagItemDto> list2) {
        this.ok = z;
        this.newIds = list;
        this.errorCode = num;
        this.errors = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsSaveLinksResponseDto)) {
            return false;
        }
        VideoChannelsSaveLinksResponseDto videoChannelsSaveLinksResponseDto = (VideoChannelsSaveLinksResponseDto) obj;
        return this.ok == videoChannelsSaveLinksResponseDto.ok && epx.f(this.newIds, videoChannelsSaveLinksResponseDto.newIds) && epx.f(this.errorCode, videoChannelsSaveLinksResponseDto.errorCode) && epx.f(this.errors, videoChannelsSaveLinksResponseDto.errors);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.ok) * 31;
        List<Integer> list = this.newIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.errorCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<VideoChannelsErrorBagItemDto> list2 = this.errors;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsSaveLinksResponseDto(ok=");
        sb.append(this.ok);
        sb.append(", newIds=");
        sb.append(this.newIds);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ok ? 1 : 0);
        List<Integer> list = this.newIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<VideoChannelsErrorBagItemDto> list2 = this.errors;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((VideoChannelsErrorBagItemDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoChannelsSaveLinksResponseDto(boolean z, List list, Integer num, List list2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list2);
    }
}

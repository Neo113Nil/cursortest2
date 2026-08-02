package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.cjl0;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoVideoBookmakerBetLineDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoBookmakerBetLineDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoBookmakerBetLineDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final Map<String, String> options;

    @pmi0("value")
    private final String value;

    /* compiled from: VideoVideoBookmakerBetLineDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoBookmakerBetLineDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerBetLineDto createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new VideoVideoBookmakerBetLineDto(readString, readString2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerBetLineDto[] newArray(int i) {
            return new VideoVideoBookmakerBetLineDto[i];
        }
    }

    public VideoVideoBookmakerBetLineDto(String str, String str2, Map<String, String> map) {
        this.name = str;
        this.value = str2;
        this.options = map;
    }

    public final Map<String, String> d() {
        return this.options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoBookmakerBetLineDto)) {
            return false;
        }
        VideoVideoBookmakerBetLineDto videoVideoBookmakerBetLineDto = (VideoVideoBookmakerBetLineDto) obj;
        return epx.f(this.name, videoVideoBookmakerBetLineDto.name) && epx.f(this.value, videoVideoBookmakerBetLineDto.value) && epx.f(this.options, videoVideoBookmakerBetLineDto.options);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.options;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoBookmakerBetLineDto(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", options=");
        return cjl0.a(sb, this.options, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        Map<String, String> map = this.options;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public /* synthetic */ VideoVideoBookmakerBetLineDto(String str, String str2, Map map, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map);
    }
}

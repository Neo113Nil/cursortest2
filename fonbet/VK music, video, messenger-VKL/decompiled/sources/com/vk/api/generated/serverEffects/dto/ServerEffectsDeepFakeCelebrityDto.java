package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ServerEffectsDeepFakeCelebrityDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsDeepFakeCelebrityDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsDeepFakeCelebrityDto> CREATOR = new a();

    @pmi0("first_frame")
    private final List<VideoVideoImageDto> firstFrame;

    @pmi0("model")
    private final String model;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("video_file")
    private final String videoFile;

    /* compiled from: ServerEffectsDeepFakeCelebrityDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsDeepFakeCelebrityDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsDeepFakeCelebrityDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ServerEffectsDeepFakeCelebrityDto.class, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i2 != readInt2) {
                i2 = bo.b(ServerEffectsDeepFakeCelebrityDto.class, parcel, arrayList2, i2, 1);
            }
            return new ServerEffectsDeepFakeCelebrityDto(readString, readString2, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsDeepFakeCelebrityDto[] newArray(int i) {
            return new ServerEffectsDeepFakeCelebrityDto[i];
        }
    }

    public ServerEffectsDeepFakeCelebrityDto(String str, String str2, List<BaseImageDto> list, List<VideoVideoImageDto> list2, String str3) {
        this.name = str;
        this.model = str2;
        this.photo = list;
        this.firstFrame = list2;
        this.videoFile = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsDeepFakeCelebrityDto)) {
            return false;
        }
        ServerEffectsDeepFakeCelebrityDto serverEffectsDeepFakeCelebrityDto = (ServerEffectsDeepFakeCelebrityDto) obj;
        return epx.f(this.name, serverEffectsDeepFakeCelebrityDto.name) && epx.f(this.model, serverEffectsDeepFakeCelebrityDto.model) && epx.f(this.photo, serverEffectsDeepFakeCelebrityDto.photo) && epx.f(this.firstFrame, serverEffectsDeepFakeCelebrityDto.firstFrame) && epx.f(this.videoFile, serverEffectsDeepFakeCelebrityDto.videoFile);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(urd0.a(this.name.hashCode() * 31, 31, this.model), 31, this.photo), 31, this.firstFrame);
        String str = this.videoFile;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsDeepFakeCelebrityDto(name=");
        sb.append(this.name);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", firstFrame=");
        sb.append(this.firstFrame);
        sb.append(", videoFile=");
        return ho8.a(sb, this.videoFile, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.model);
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.firstFrame);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeString(this.videoFile);
    }

    public /* synthetic */ ServerEffectsDeepFakeCelebrityDto(String str, String str2, List list, List list2, String str3, int i, zcl zclVar) {
        this(str, str2, list, list2, (i & 16) != 0 ? null : str3);
    }
}

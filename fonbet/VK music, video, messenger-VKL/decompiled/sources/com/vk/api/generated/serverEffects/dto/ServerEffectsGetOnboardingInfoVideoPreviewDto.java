package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: ServerEffectsGetOnboardingInfoVideoPreviewDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetOnboardingInfoVideoPreviewDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGetOnboardingInfoVideoPreviewDto> CREATOR = new a();

    @pmi0("first_frame")
    private final List<VideoVideoImageDto> firstFrame;

    @pmi0("video_file")
    private final String videoFile;

    /* compiled from: ServerEffectsGetOnboardingInfoVideoPreviewDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetOnboardingInfoVideoPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetOnboardingInfoVideoPreviewDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ServerEffectsGetOnboardingInfoVideoPreviewDto.class, parcel, arrayList, i, 1);
            }
            return new ServerEffectsGetOnboardingInfoVideoPreviewDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetOnboardingInfoVideoPreviewDto[] newArray(int i) {
            return new ServerEffectsGetOnboardingInfoVideoPreviewDto[i];
        }
    }

    public ServerEffectsGetOnboardingInfoVideoPreviewDto(String str, List<VideoVideoImageDto> list) {
        this.videoFile = str;
        this.firstFrame = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGetOnboardingInfoVideoPreviewDto)) {
            return false;
        }
        ServerEffectsGetOnboardingInfoVideoPreviewDto serverEffectsGetOnboardingInfoVideoPreviewDto = (ServerEffectsGetOnboardingInfoVideoPreviewDto) obj;
        return epx.f(this.videoFile, serverEffectsGetOnboardingInfoVideoPreviewDto.videoFile) && epx.f(this.firstFrame, serverEffectsGetOnboardingInfoVideoPreviewDto.firstFrame);
    }

    public final int hashCode() {
        return this.firstFrame.hashCode() + (this.videoFile.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGetOnboardingInfoVideoPreviewDto(videoFile=");
        sb.append(this.videoFile);
        sb.append(", firstFrame=");
        return ms9.a(')', sb, this.firstFrame);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoFile);
        Iterator a2 = ao.a(parcel, this.firstFrame);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}

package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ServerEffectsGetOnboardingInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetOnboardingInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGetOnboardingInfoResponseDto> CREATOR = new a();

    @pmi0("photo_preview")
    private final List<BaseImageDto> photoPreview;

    @pmi0("video_preview")
    private final ServerEffectsGetOnboardingInfoVideoPreviewDto videoPreview;

    /* compiled from: ServerEffectsGetOnboardingInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetOnboardingInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetOnboardingInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            ServerEffectsGetOnboardingInfoVideoPreviewDto createFromParcel = parcel.readInt() == 0 ? null : ServerEffectsGetOnboardingInfoVideoPreviewDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ServerEffectsGetOnboardingInfoResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ServerEffectsGetOnboardingInfoResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetOnboardingInfoResponseDto[] newArray(int i) {
            return new ServerEffectsGetOnboardingInfoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServerEffectsGetOnboardingInfoResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGetOnboardingInfoResponseDto)) {
            return false;
        }
        ServerEffectsGetOnboardingInfoResponseDto serverEffectsGetOnboardingInfoResponseDto = (ServerEffectsGetOnboardingInfoResponseDto) obj;
        return epx.f(this.videoPreview, serverEffectsGetOnboardingInfoResponseDto.videoPreview) && epx.f(this.photoPreview, serverEffectsGetOnboardingInfoResponseDto.photoPreview);
    }

    public final int hashCode() {
        ServerEffectsGetOnboardingInfoVideoPreviewDto serverEffectsGetOnboardingInfoVideoPreviewDto = this.videoPreview;
        int hashCode = (serverEffectsGetOnboardingInfoVideoPreviewDto == null ? 0 : serverEffectsGetOnboardingInfoVideoPreviewDto.hashCode()) * 31;
        List<BaseImageDto> list = this.photoPreview;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGetOnboardingInfoResponseDto(videoPreview=");
        sb.append(this.videoPreview);
        sb.append(", photoPreview=");
        return ms9.a(')', sb, this.photoPreview);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ServerEffectsGetOnboardingInfoVideoPreviewDto serverEffectsGetOnboardingInfoVideoPreviewDto = this.videoPreview;
        if (serverEffectsGetOnboardingInfoVideoPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serverEffectsGetOnboardingInfoVideoPreviewDto.writeToParcel(parcel, i);
        }
        List<BaseImageDto> list = this.photoPreview;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public ServerEffectsGetOnboardingInfoResponseDto(ServerEffectsGetOnboardingInfoVideoPreviewDto serverEffectsGetOnboardingInfoVideoPreviewDto, List<BaseImageDto> list) {
        this.videoPreview = serverEffectsGetOnboardingInfoVideoPreviewDto;
        this.photoPreview = list;
    }

    public /* synthetic */ ServerEffectsGetOnboardingInfoResponseDto(ServerEffectsGetOnboardingInfoVideoPreviewDto serverEffectsGetOnboardingInfoVideoPreviewDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : serverEffectsGetOnboardingInfoVideoPreviewDto, (i & 2) != 0 ? null : list);
    }
}

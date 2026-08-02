package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ServerEffectsGetGeneratedVideoInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGetGeneratedVideoInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGetGeneratedVideoInfoResponseDto> CREATOR = new a();

    @pmi0("all_thumbs")
    private final List<ServerEffectsVideoThumbDto> allThumbs;

    @pmi0("generated_video")
    private final ServerEffectsGeneratedVideoInfoDto generatedVideo;

    @pmi0("thumb")
    private final String thumb;

    /* compiled from: ServerEffectsGetGeneratedVideoInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGetGeneratedVideoInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetGeneratedVideoInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ServerEffectsGeneratedVideoInfoDto createFromParcel = ServerEffectsGeneratedVideoInfoDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ServerEffectsVideoThumbDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ServerEffectsGetGeneratedVideoInfoResponseDto(createFromParcel, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGetGeneratedVideoInfoResponseDto[] newArray(int i) {
            return new ServerEffectsGetGeneratedVideoInfoResponseDto[i];
        }
    }

    public ServerEffectsGetGeneratedVideoInfoResponseDto(ServerEffectsGeneratedVideoInfoDto serverEffectsGeneratedVideoInfoDto, String str, List<ServerEffectsVideoThumbDto> list) {
        this.generatedVideo = serverEffectsGeneratedVideoInfoDto;
        this.thumb = str;
        this.allThumbs = list;
    }

    public final ServerEffectsGeneratedVideoInfoDto d() {
        return this.generatedVideo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerEffectsGetGeneratedVideoInfoResponseDto)) {
            return false;
        }
        ServerEffectsGetGeneratedVideoInfoResponseDto serverEffectsGetGeneratedVideoInfoResponseDto = (ServerEffectsGetGeneratedVideoInfoResponseDto) obj;
        return epx.f(this.generatedVideo, serverEffectsGetGeneratedVideoInfoResponseDto.generatedVideo) && epx.f(this.thumb, serverEffectsGetGeneratedVideoInfoResponseDto.thumb) && epx.f(this.allThumbs, serverEffectsGetGeneratedVideoInfoResponseDto.allThumbs);
    }

    public final int hashCode() {
        int hashCode = this.generatedVideo.hashCode() * 31;
        String str = this.thumb;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ServerEffectsVideoThumbDto> list = this.allThumbs;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGetGeneratedVideoInfoResponseDto(generatedVideo=");
        sb.append(this.generatedVideo);
        sb.append(", thumb=");
        sb.append(this.thumb);
        sb.append(", allThumbs=");
        return ms9.a(')', sb, this.allThumbs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.generatedVideo.writeToParcel(parcel, i);
        parcel.writeString(this.thumb);
        List<ServerEffectsVideoThumbDto> list = this.allThumbs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ServerEffectsVideoThumbDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ServerEffectsGetGeneratedVideoInfoResponseDto(ServerEffectsGeneratedVideoInfoDto serverEffectsGeneratedVideoInfoDto, String str, List list, int i, zcl zclVar) {
        this(serverEffectsGeneratedVideoInfoDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}

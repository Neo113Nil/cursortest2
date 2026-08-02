package com.vk.api.generated.video.dto;

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

/* compiled from: VideoSocialDemoAdsLinkDto.kt */
/* loaded from: classes15.dex */
public final class VideoSocialDemoAdsLinkDto implements Parcelable {
    public static final Parcelable.Creator<VideoSocialDemoAdsLinkDto> CREATOR = new a();

    @pmi0("social_demo_keys")
    private final List<VideoSocialDemoKeyDto> socialDemoKeys;

    @pmi0("token")
    private final String token;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoSocialDemoAdsLinkDto.kt */
    public static final class a implements Parcelable.Creator<VideoSocialDemoAdsLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSocialDemoAdsLinkDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(VideoSocialDemoKeyDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new VideoSocialDemoAdsLinkDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSocialDemoAdsLinkDto[] newArray(int i) {
            return new VideoSocialDemoAdsLinkDto[i];
        }
    }

    public VideoSocialDemoAdsLinkDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSocialDemoAdsLinkDto)) {
            return false;
        }
        VideoSocialDemoAdsLinkDto videoSocialDemoAdsLinkDto = (VideoSocialDemoAdsLinkDto) obj;
        return epx.f(this.url, videoSocialDemoAdsLinkDto.url) && epx.f(this.token, videoSocialDemoAdsLinkDto.token) && epx.f(this.socialDemoKeys, videoSocialDemoAdsLinkDto.socialDemoKeys);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<VideoSocialDemoKeyDto> list = this.socialDemoKeys;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSocialDemoAdsLinkDto(url=");
        sb.append(this.url);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", socialDemoKeys=");
        return ms9.a(')', sb, this.socialDemoKeys);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.token);
        List<VideoSocialDemoKeyDto> list = this.socialDemoKeys;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoSocialDemoKeyDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public VideoSocialDemoAdsLinkDto(String str, String str2, List<VideoSocialDemoKeyDto> list) {
        this.url = str;
        this.token = str2;
        this.socialDemoKeys = list;
    }

    public /* synthetic */ VideoSocialDemoAdsLinkDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}

package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.podcast.dto.PodcastCoverObjectDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PodcastsGetGroupInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsGetGroupInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsGetGroupInfoResponseDto> CREATOR = new a();

    @pmi0("can_subscribe")
    private final Integer canSubscribe;

    @pmi0("can_subscribe_podcasts")
    private final Integer canSubscribePodcasts;

    @pmi0("category")
    private final String category;

    @pmi0("friends")
    private final List<UsersUserFullDto> friends;

    @pmi0("friends_text")
    private final String friendsText;

    @pmi0("is_podcast_notifications_enabled")
    private final Integer isPodcastNotificationsEnabled;

    @pmi0("is_subscribed_podcasts")
    private final Integer isSubscribedPodcasts;

    @pmi0("legal_notice")
    private final PodcastsLegalNoticeDto legalNotice;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final String ownerId;

    @pmi0("podcast_cover")
    private final PodcastCoverObjectDto podcastCover;

    @pmi0("podcast_description")
    private final String podcastDescription;

    @pmi0("podcast_id")
    private final Integer podcastId;

    @pmi0("podcast_title")
    private final String podcastTitle;

    @pmi0("trailer")
    private final AudioAudioDto trailer;

    @pmi0("url")
    private final String url;

    /* compiled from: PodcastsGetGroupInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsGetGroupInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsGetGroupInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            AudioAudioDto audioAudioDto = (AudioAudioDto) parcel.readParcelable(PodcastsGetGroupInfoResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(PodcastsGetGroupInfoResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            return new PodcastsGetGroupInfoResponseDto(valueOf, valueOf2, readString, audioAudioDto, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PodcastCoverObjectDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? PodcastsLegalNoticeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsGetGroupInfoResponseDto[] newArray(int i) {
            return new PodcastsGetGroupInfoResponseDto[i];
        }
    }

    public PodcastsGetGroupInfoResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM, null);
    }

    public static PodcastsGetGroupInfoResponseDto a(PodcastsGetGroupInfoResponseDto podcastsGetGroupInfoResponseDto, Integer num, Integer num2, Integer num3, PodcastCoverObjectDto podcastCoverObjectDto, int i) {
        Integer num4 = (i & 1) != 0 ? podcastsGetGroupInfoResponseDto.canSubscribe : num;
        Integer num5 = (i & 2) != 0 ? podcastsGetGroupInfoResponseDto.canSubscribePodcasts : num2;
        String str = podcastsGetGroupInfoResponseDto.category;
        AudioAudioDto audioAudioDto = podcastsGetGroupInfoResponseDto.trailer;
        List<UsersUserFullDto> list = podcastsGetGroupInfoResponseDto.friends;
        String str2 = podcastsGetGroupInfoResponseDto.friendsText;
        Integer num6 = (i & 64) != 0 ? podcastsGetGroupInfoResponseDto.isSubscribedPodcasts : num3;
        String str3 = podcastsGetGroupInfoResponseDto.name;
        String str4 = podcastsGetGroupInfoResponseDto.ownerId;
        Integer num7 = podcastsGetGroupInfoResponseDto.podcastId;
        String str5 = podcastsGetGroupInfoResponseDto.podcastDescription;
        String str6 = podcastsGetGroupInfoResponseDto.podcastTitle;
        PodcastCoverObjectDto podcastCoverObjectDto2 = (i & 4096) != 0 ? podcastsGetGroupInfoResponseDto.podcastCover : podcastCoverObjectDto;
        Integer num8 = podcastsGetGroupInfoResponseDto.isPodcastNotificationsEnabled;
        String str7 = podcastsGetGroupInfoResponseDto.url;
        PodcastsLegalNoticeDto podcastsLegalNoticeDto = podcastsGetGroupInfoResponseDto.legalNotice;
        podcastsGetGroupInfoResponseDto.getClass();
        return new PodcastsGetGroupInfoResponseDto(num4, num5, str, audioAudioDto, list, str2, num6, str3, str4, num7, str5, str6, podcastCoverObjectDto2, num8, str7, podcastsLegalNoticeDto);
    }

    public final Integer B() {
        return this.isSubscribedPodcasts;
    }

    public final Integer d() {
        return this.canSubscribe;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.canSubscribePodcasts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsGetGroupInfoResponseDto)) {
            return false;
        }
        PodcastsGetGroupInfoResponseDto podcastsGetGroupInfoResponseDto = (PodcastsGetGroupInfoResponseDto) obj;
        return epx.f(this.canSubscribe, podcastsGetGroupInfoResponseDto.canSubscribe) && epx.f(this.canSubscribePodcasts, podcastsGetGroupInfoResponseDto.canSubscribePodcasts) && epx.f(this.category, podcastsGetGroupInfoResponseDto.category) && epx.f(this.trailer, podcastsGetGroupInfoResponseDto.trailer) && epx.f(this.friends, podcastsGetGroupInfoResponseDto.friends) && epx.f(this.friendsText, podcastsGetGroupInfoResponseDto.friendsText) && epx.f(this.isSubscribedPodcasts, podcastsGetGroupInfoResponseDto.isSubscribedPodcasts) && epx.f(this.name, podcastsGetGroupInfoResponseDto.name) && epx.f(this.ownerId, podcastsGetGroupInfoResponseDto.ownerId) && epx.f(this.podcastId, podcastsGetGroupInfoResponseDto.podcastId) && epx.f(this.podcastDescription, podcastsGetGroupInfoResponseDto.podcastDescription) && epx.f(this.podcastTitle, podcastsGetGroupInfoResponseDto.podcastTitle) && epx.f(this.podcastCover, podcastsGetGroupInfoResponseDto.podcastCover) && epx.f(this.isPodcastNotificationsEnabled, podcastsGetGroupInfoResponseDto.isPodcastNotificationsEnabled) && epx.f(this.url, podcastsGetGroupInfoResponseDto.url) && epx.f(this.legalNotice, podcastsGetGroupInfoResponseDto.legalNotice);
    }

    public final String f() {
        return this.category;
    }

    public final List<UsersUserFullDto> g() {
        return this.friends;
    }

    public final int hashCode() {
        Integer num = this.canSubscribe;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.canSubscribePodcasts;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.category;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.trailer;
        int hashCode4 = (hashCode3 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.friends;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.friendsText;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.isSubscribedPodcasts;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.name;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ownerId;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.podcastId;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.podcastDescription;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.podcastTitle;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PodcastCoverObjectDto podcastCoverObjectDto = this.podcastCover;
        int hashCode13 = (hashCode12 + (podcastCoverObjectDto == null ? 0 : podcastCoverObjectDto.hashCode())) * 31;
        Integer num5 = this.isPodcastNotificationsEnabled;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str7 = this.url;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PodcastsLegalNoticeDto podcastsLegalNoticeDto = this.legalNotice;
        return hashCode15 + (podcastsLegalNoticeDto != null ? podcastsLegalNoticeDto.hashCode() : 0);
    }

    public final String i() {
        return this.friendsText;
    }

    public final PodcastsLegalNoticeDto j() {
        return this.legalNotice;
    }

    public final String k() {
        return this.name;
    }

    public final PodcastCoverObjectDto l() {
        return this.podcastCover;
    }

    public final String n() {
        return this.podcastDescription;
    }

    public final Integer o() {
        return this.podcastId;
    }

    public final AudioAudioDto p() {
        return this.trailer;
    }

    public final String toString() {
        return "PodcastsGetGroupInfoResponseDto(canSubscribe=" + this.canSubscribe + ", canSubscribePodcasts=" + this.canSubscribePodcasts + ", category=" + this.category + ", trailer=" + this.trailer + ", friends=" + this.friends + ", friendsText=" + this.friendsText + ", isSubscribedPodcasts=" + this.isSubscribedPodcasts + ", name=" + this.name + ", ownerId=" + this.ownerId + ", podcastId=" + this.podcastId + ", podcastDescription=" + this.podcastDescription + ", podcastTitle=" + this.podcastTitle + ", podcastCover=" + this.podcastCover + ", isPodcastNotificationsEnabled=" + this.isPodcastNotificationsEnabled + ", url=" + this.url + ", legalNotice=" + this.legalNotice + ')';
    }

    public final Integer u() {
        return this.isPodcastNotificationsEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.canSubscribe;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.canSubscribePodcasts;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.category);
        parcel.writeParcelable(this.trailer, i);
        List<UsersUserFullDto> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.friendsText);
        Integer num3 = this.isSubscribedPodcasts;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.ownerId);
        Integer num4 = this.podcastId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.podcastDescription);
        parcel.writeString(this.podcastTitle);
        PodcastCoverObjectDto podcastCoverObjectDto = this.podcastCover;
        if (podcastCoverObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastCoverObjectDto.writeToParcel(parcel, i);
        }
        Integer num5 = this.isPodcastNotificationsEnabled;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        parcel.writeString(this.url);
        PodcastsLegalNoticeDto podcastsLegalNoticeDto = this.legalNotice;
        if (podcastsLegalNoticeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastsLegalNoticeDto.writeToParcel(parcel, i);
        }
    }

    public PodcastsGetGroupInfoResponseDto(Integer num, Integer num2, String str, AudioAudioDto audioAudioDto, List<UsersUserFullDto> list, String str2, Integer num3, String str3, String str4, Integer num4, String str5, String str6, PodcastCoverObjectDto podcastCoverObjectDto, Integer num5, String str7, PodcastsLegalNoticeDto podcastsLegalNoticeDto) {
        this.canSubscribe = num;
        this.canSubscribePodcasts = num2;
        this.category = str;
        this.trailer = audioAudioDto;
        this.friends = list;
        this.friendsText = str2;
        this.isSubscribedPodcasts = num3;
        this.name = str3;
        this.ownerId = str4;
        this.podcastId = num4;
        this.podcastDescription = str5;
        this.podcastTitle = str6;
        this.podcastCover = podcastCoverObjectDto;
        this.isPodcastNotificationsEnabled = num5;
        this.url = str7;
        this.legalNotice = podcastsLegalNoticeDto;
    }

    public /* synthetic */ PodcastsGetGroupInfoResponseDto(Integer num, Integer num2, String str, AudioAudioDto audioAudioDto, List list, String str2, Integer num3, String str3, String str4, Integer num4, String str5, String str6, PodcastCoverObjectDto podcastCoverObjectDto, Integer num5, String str7, PodcastsLegalNoticeDto podcastsLegalNoticeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : audioAudioDto, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : podcastCoverObjectDto, (i & 8192) != 0 ? null : num5, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : podcastsLegalNoticeDto);
    }
}

package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistPermissionsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PodcastPodcastDto.kt */
/* loaded from: classes15.dex */
public final class PodcastPodcastDto implements Parcelable {
    public static final Parcelable.Creator<PodcastPodcastDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("can_subscribe")
    private final boolean canSubscribe;

    @pmi0("flags_context")
    private final Integer flagsContext;

    @pmi0("group_category")
    private final String groupCategory;

    @pmi0("id")
    private final int id;

    @pmi0("is_explicit")
    private final Boolean isExplicit;

    @pmi0("is_subscribed")
    private final boolean isSubscribed;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final AudioPlaylistPermissionsDto permissions;

    @pmi0("photo")
    private final AudioPhotoDto photo;

    @pmi0("play_button")
    private final Boolean playButton;

    @pmi0("playlist_id")
    private final Integer playlistId;

    @pmi0("podcast_title")
    private final String podcastTitle;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("subtitle_badge")
    private final Boolean subtitleBadge;

    @pmi0("thumbs")
    private final List<AudioPhotoDto> thumbs;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: PodcastPodcastDto.kt */
    public static final class a implements Parcelable.Creator<PodcastPodcastDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastPodcastDto createFromParcel(Parcel parcel) {
            UserId userId;
            boolean z;
            UserId userId2;
            boolean z2;
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            int i;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            UserId userId3 = (UserId) parcel.readParcelable(PodcastPodcastDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                userId = userId3;
                z = true;
            } else {
                userId = userId3;
                z = false;
            }
            if (parcel.readInt() != 0) {
                userId2 = userId;
                z2 = true;
            } else {
                userId2 = userId;
                z2 = false;
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = (AudioPlaylistPermissionsDto) parcel.readParcelable(PodcastPodcastDto.class.getClassLoader());
            AudioPhotoDto audioPhotoDto = (AudioPhotoDto) parcel.readParcelable(PodcastPodcastDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                i = readInt;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                i = readInt;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(PodcastPodcastDto.class, parcel, arrayList, i2, 1);
                }
            }
            Integer num = valueOf4;
            String readString3 = parcel.readString();
            UserId userId4 = userId2;
            ArrayList arrayList2 = arrayList;
            Boolean bool = valueOf;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PodcastPodcastDto(i, userId4, readString, z, z2, num, readString2, audioPlaylistPermissionsDto, audioPhotoDto, bool, valueOf2, arrayList2, readString3, readString4, valueOf3, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastPodcastDto[] newArray(int i) {
            return new PodcastPodcastDto[i];
        }
    }

    public PodcastPodcastDto(int i, UserId userId, String str, boolean z, boolean z2, Integer num, String str2, AudioPlaylistPermissionsDto audioPlaylistPermissionsDto, AudioPhotoDto audioPhotoDto, Boolean bool, Boolean bool2, List<AudioPhotoDto> list, String str3, String str4, Boolean bool3, String str5, Integer num2) {
        this.id = i;
        this.ownerId = userId;
        this.podcastTitle = str;
        this.canSubscribe = z;
        this.isSubscribed = z2;
        this.playlistId = num;
        this.groupCategory = str2;
        this.permissions = audioPlaylistPermissionsDto;
        this.photo = audioPhotoDto;
        this.subtitleBadge = bool;
        this.playButton = bool2;
        this.thumbs = list;
        this.accessKey = str3;
        this.subtitle = str4;
        this.isExplicit = bool3;
        this.trackCode = str5;
        this.flagsContext = num2;
    }

    public final boolean U() {
        return this.isSubscribed;
    }

    public final String d() {
        return this.groupCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AudioPlaylistPermissionsDto e() {
        return this.permissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastPodcastDto)) {
            return false;
        }
        PodcastPodcastDto podcastPodcastDto = (PodcastPodcastDto) obj;
        return this.id == podcastPodcastDto.id && epx.f(this.ownerId, podcastPodcastDto.ownerId) && epx.f(this.podcastTitle, podcastPodcastDto.podcastTitle) && this.canSubscribe == podcastPodcastDto.canSubscribe && this.isSubscribed == podcastPodcastDto.isSubscribed && epx.f(this.playlistId, podcastPodcastDto.playlistId) && epx.f(this.groupCategory, podcastPodcastDto.groupCategory) && epx.f(this.permissions, podcastPodcastDto.permissions) && epx.f(this.photo, podcastPodcastDto.photo) && epx.f(this.subtitleBadge, podcastPodcastDto.subtitleBadge) && epx.f(this.playButton, podcastPodcastDto.playButton) && epx.f(this.thumbs, podcastPodcastDto.thumbs) && epx.f(this.accessKey, podcastPodcastDto.accessKey) && epx.f(this.subtitle, podcastPodcastDto.subtitle) && epx.f(this.isExplicit, podcastPodcastDto.isExplicit) && epx.f(this.trackCode, podcastPodcastDto.trackCode) && epx.f(this.flagsContext, podcastPodcastDto.flagsContext);
    }

    public final Integer f() {
        return this.playlistId;
    }

    public final String g() {
        return this.podcastTitle;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean h1() {
        return this.canSubscribe;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.podcastTitle), 31, this.canSubscribe), 31, this.isSubscribed);
        Integer num = this.playlistId;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.groupCategory;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AudioPlaylistPermissionsDto audioPlaylistPermissionsDto = this.permissions;
        int hashCode3 = (hashCode2 + (audioPlaylistPermissionsDto == null ? 0 : audioPlaylistPermissionsDto.hashCode())) * 31;
        AudioPhotoDto audioPhotoDto = this.photo;
        int hashCode4 = (hashCode3 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        Boolean bool = this.subtitleBadge;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.playButton;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<AudioPhotoDto> list = this.thumbs;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.accessKey;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.isExplicit;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.flagsContext;
        return hashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String i() {
        return this.subtitle;
    }

    public final Boolean j() {
        return this.subtitleBadge;
    }

    public final List<AudioPhotoDto> k() {
        return this.thumbs;
    }

    public final Boolean l() {
        return this.isExplicit;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastPodcastDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", podcastTitle=");
        sb.append(this.podcastTitle);
        sb.append(", canSubscribe=");
        sb.append(this.canSubscribe);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", playlistId=");
        sb.append(this.playlistId);
        sb.append(", groupCategory=");
        sb.append(this.groupCategory);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", subtitleBadge=");
        sb.append(this.subtitleBadge);
        sb.append(", playButton=");
        sb.append(this.playButton);
        sb.append(", thumbs=");
        sb.append(this.thumbs);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", flagsContext=");
        return uqi.b(sb, this.flagsContext, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.podcastTitle);
        parcel.writeInt(this.canSubscribe ? 1 : 0);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        Integer num = this.playlistId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.groupCategory);
        parcel.writeParcelable(this.permissions, i);
        parcel.writeParcelable(this.photo, i);
        Boolean bool = this.subtitleBadge;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.playButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<AudioPhotoDto> list = this.thumbs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.accessKey);
        parcel.writeString(this.subtitle);
        Boolean bool3 = this.isExplicit;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.trackCode);
        Integer num2 = this.flagsContext;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ PodcastPodcastDto(int i, UserId userId, String str, boolean z, boolean z2, Integer num, String str2, AudioPlaylistPermissionsDto audioPlaylistPermissionsDto, AudioPhotoDto audioPhotoDto, Boolean bool, Boolean bool2, List list, String str3, String str4, Boolean bool3, String str5, Integer num2, int i2, zcl zclVar) {
        this(i, userId, str, z, z2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : audioPlaylistPermissionsDto, (i2 & 256) != 0 ? null : audioPhotoDto, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : list, (i2 & 4096) != 0 ? null : str3, (i2 & 8192) != 0 ? null : str4, (i2 & 16384) != 0 ? null : bool3, (32768 & i2) != 0 ? null : str5, (i2 & 65536) != 0 ? null : num2);
    }
}

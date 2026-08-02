package com.vk.api.generated.podcast.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.soloader.MinElf;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: PodcastInfoDto.kt */
/* loaded from: classes15.dex */
public final class PodcastInfoDto implements Parcelable {
    public static final Parcelable.Creator<PodcastInfoDto> CREATOR = new a();

    @pmi0("cover")
    private final PodcastCoverDto cover;

    @pmi0("description")
    private final String description;

    @pmi0("friends_liked")
    private final List<Integer> friendsLiked;

    @pmi0("is_donut")
    private final Boolean isDonut;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_listened")
    private final Boolean isListened;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("is_random")
    private final Boolean isRandom;

    @pmi0("plays")
    private final Integer plays;

    @pmi0("podcast_id")
    private final Integer podcastId;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("post")
    private final String post;

    @pmi0("restriction_button")
    private final BaseLinkButtonDto restrictionButton;

    @pmi0("restriction_description")
    private final String restrictionDescription;

    @pmi0("restriction_text")
    private final String restrictionText;

    @pmi0("rss_guid")
    private final String rssGuid;

    /* compiled from: PodcastInfoDto.kt */
    public static final class a implements Parcelable.Creator<PodcastInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean bool = null;
            PodcastCoverDto createFromParcel = parcel.readInt() == 0 ? null : PodcastCoverDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            BaseLinkButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PodcastInfoDto(createFromParcel, readString, valueOf, valueOf5, valueOf6, readString2, readString3, readString4, createFromParcel2, arrayList, valueOf2, readString5, valueOf3, valueOf7, valueOf4, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastInfoDto[] newArray(int i) {
            return new PodcastInfoDto[i];
        }
    }

    public PodcastInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM, null);
    }

    public final PodcastCoverDto d() {
        return this.cover;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.plays;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastInfoDto)) {
            return false;
        }
        PodcastInfoDto podcastInfoDto = (PodcastInfoDto) obj;
        return epx.f(this.cover, podcastInfoDto.cover) && epx.f(this.description, podcastInfoDto.description) && epx.f(this.isFavorite, podcastInfoDto.isFavorite) && epx.f(this.plays, podcastInfoDto.plays) && epx.f(this.position, podcastInfoDto.position) && epx.f(this.rssGuid, podcastInfoDto.rssGuid) && epx.f(this.restrictionDescription, podcastInfoDto.restrictionDescription) && epx.f(this.restrictionText, podcastInfoDto.restrictionText) && epx.f(this.restrictionButton, podcastInfoDto.restrictionButton) && epx.f(this.friendsLiked, podcastInfoDto.friendsLiked) && epx.f(this.isRandom, podcastInfoDto.isRandom) && epx.f(this.post, podcastInfoDto.post) && epx.f(this.isDonut, podcastInfoDto.isDonut) && epx.f(this.podcastId, podcastInfoDto.podcastId) && epx.f(this.isNew, podcastInfoDto.isNew) && epx.f(this.isListened, podcastInfoDto.isListened);
    }

    public final Integer f() {
        return this.position;
    }

    public final String g() {
        return this.post;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        PodcastCoverDto podcastCoverDto = this.cover;
        int hashCode = (podcastCoverDto == null ? 0 : podcastCoverDto.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.plays;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.position;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.rssGuid;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.restrictionDescription;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.restrictionText;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.restrictionButton;
        int hashCode9 = (hashCode8 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        List<Integer> list = this.friendsLiked;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isRandom;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.post;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.isDonut;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.podcastId;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.isNew;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isListened;
        return hashCode15 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final BaseLinkButtonDto i() {
        return this.restrictionButton;
    }

    public final String j() {
        return this.restrictionDescription;
    }

    public final String k() {
        return this.restrictionText;
    }

    public final Boolean l() {
        return this.isDonut;
    }

    public final Boolean n() {
        return this.isFavorite;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastInfoDto(cover=");
        sb.append(this.cover);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", plays=");
        sb.append(this.plays);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", rssGuid=");
        sb.append(this.rssGuid);
        sb.append(", restrictionDescription=");
        sb.append(this.restrictionDescription);
        sb.append(", restrictionText=");
        sb.append(this.restrictionText);
        sb.append(", restrictionButton=");
        sb.append(this.restrictionButton);
        sb.append(", friendsLiked=");
        sb.append(this.friendsLiked);
        sb.append(", isRandom=");
        sb.append(this.isRandom);
        sb.append(", post=");
        sb.append(this.post);
        sb.append(", isDonut=");
        sb.append(this.isDonut);
        sb.append(", podcastId=");
        sb.append(this.podcastId);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", isListened=");
        return tn.a(sb, this.isListened, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PodcastCoverDto podcastCoverDto = this.cover;
        if (podcastCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastCoverDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.description);
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.plays;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.position;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.rssGuid);
        parcel.writeString(this.restrictionDescription);
        parcel.writeString(this.restrictionText);
        BaseLinkButtonDto baseLinkButtonDto = this.restrictionButton;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.friendsLiked;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        Boolean bool2 = this.isRandom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.post);
        Boolean bool3 = this.isDonut;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num3 = this.podcastId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool4 = this.isNew;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isListened;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public PodcastInfoDto(PodcastCoverDto podcastCoverDto, String str, Boolean bool, Integer num, Integer num2, String str2, String str3, String str4, BaseLinkButtonDto baseLinkButtonDto, List<Integer> list, Boolean bool2, String str5, Boolean bool3, Integer num3, Boolean bool4, Boolean bool5) {
        this.cover = podcastCoverDto;
        this.description = str;
        this.isFavorite = bool;
        this.plays = num;
        this.position = num2;
        this.rssGuid = str2;
        this.restrictionDescription = str3;
        this.restrictionText = str4;
        this.restrictionButton = baseLinkButtonDto;
        this.friendsLiked = list;
        this.isRandom = bool2;
        this.post = str5;
        this.isDonut = bool3;
        this.podcastId = num3;
        this.isNew = bool4;
        this.isListened = bool5;
    }

    public /* synthetic */ PodcastInfoDto(PodcastCoverDto podcastCoverDto, String str, Boolean bool, Integer num, Integer num2, String str2, String str3, String str4, BaseLinkButtonDto baseLinkButtonDto, List list, Boolean bool2, String str5, Boolean bool3, Integer num3, Boolean bool4, Boolean bool5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : podcastCoverDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : baseLinkButtonDto, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : bool4, (i & 32768) != 0 ? null : bool5);
    }
}

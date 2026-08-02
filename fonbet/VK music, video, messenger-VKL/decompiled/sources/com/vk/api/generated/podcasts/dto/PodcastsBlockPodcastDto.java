package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PodcastsBlockPodcastDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsBlockPodcastDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsBlockPodcastDto> CREATOR = new a();

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("can_subscribe")
    private final boolean canSubscribe;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<PodcastsBlockCategoryDto> categories;

    @pmi0("episodes_count")
    private final int episodesCount;

    @pmi0("friends")
    private final List<PodcastsBlockFriendDto> friends;

    @pmi0("friends_text")
    private final String friendsText;

    @pmi0("id")
    private final String id;

    @pmi0("is_subscribed")
    private final boolean isSubscribed;

    @pmi0("legal_notice")
    private final PodcastsLegalNoticeDto legalNotice;

    @pmi0("page_url")
    private final String pageUrl;

    @pmi0("podcast_cover")
    private final PodcastsItemCoverDto podcastCover;

    @pmi0("podcast_description")
    private final String podcastDescription;

    @pmi0("subscription_date")
    private final int subscriptionDate;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("updated_at")
    private final int updatedAt;

    /* compiled from: PodcastsBlockPodcastDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsBlockPodcastDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockPodcastDto createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            boolean z;
            boolean z2;
            String readString = parcel.readString();
            boolean z3 = false;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                i = 0;
                z3 = true;
            } else {
                i = 0;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int i2 = i;
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i3 = i2;
            while (i3 != readInt2) {
                i3 = en.a(PodcastsBlockCategoryDto.CREATOR, parcel, arrayList2, i3, 1);
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            PodcastsItemCoverDto createFromParcel = PodcastsItemCoverDto.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            String readString5 = parcel.readString();
            int readInt4 = parcel.readInt();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                z = z4;
                z2 = true;
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList = new ArrayList(readInt5);
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(PodcastsBlockFriendDto.CREATOR, parcel, arrayList, i4, 1);
                    readString = readString;
                    z4 = z4;
                }
                z = z4;
                z2 = true;
            }
            String str = readString;
            String readString6 = parcel.readString();
            PodcastsLegalNoticeDto createFromParcel2 = parcel.readInt() == 0 ? null : PodcastsLegalNoticeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            return new PodcastsBlockPodcastDto(str, z, z3, readInt, arrayList2, readString2, readString3, readString4, createFromParcel, readInt3, readString5, readInt4, arrayList, readString6, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockPodcastDto[] newArray(int i) {
            return new PodcastsBlockPodcastDto[i];
        }
    }

    public PodcastsBlockPodcastDto(String str, boolean z, boolean z2, int i, List<PodcastsBlockCategoryDto> list, String str2, String str3, String str4, PodcastsItemCoverDto podcastsItemCoverDto, int i2, String str5, int i3, List<PodcastsBlockFriendDto> list2, String str6, PodcastsLegalNoticeDto podcastsLegalNoticeDto, Boolean bool) {
        this.id = str;
        this.canSubscribe = z;
        this.isSubscribed = z2;
        this.subscriptionDate = i;
        this.categories = list;
        this.title = str2;
        this.subtitle = str3;
        this.podcastDescription = str4;
        this.podcastCover = podcastsItemCoverDto;
        this.updatedAt = i2;
        this.pageUrl = str5;
        this.episodesCount = i3;
        this.friends = list2;
        this.friendsText = str6;
        this.legalNotice = podcastsLegalNoticeDto;
        this.canEdit = bool;
    }

    public final boolean U() {
        return this.isSubscribed;
    }

    public final String d() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsBlockPodcastDto)) {
            return false;
        }
        PodcastsBlockPodcastDto podcastsBlockPodcastDto = (PodcastsBlockPodcastDto) obj;
        return epx.f(this.id, podcastsBlockPodcastDto.id) && this.canSubscribe == podcastsBlockPodcastDto.canSubscribe && this.isSubscribed == podcastsBlockPodcastDto.isSubscribed && this.subscriptionDate == podcastsBlockPodcastDto.subscriptionDate && epx.f(this.categories, podcastsBlockPodcastDto.categories) && epx.f(this.title, podcastsBlockPodcastDto.title) && epx.f(this.subtitle, podcastsBlockPodcastDto.subtitle) && epx.f(this.podcastDescription, podcastsBlockPodcastDto.podcastDescription) && epx.f(this.podcastCover, podcastsBlockPodcastDto.podcastCover) && this.updatedAt == podcastsBlockPodcastDto.updatedAt && epx.f(this.pageUrl, podcastsBlockPodcastDto.pageUrl) && this.episodesCount == podcastsBlockPodcastDto.episodesCount && epx.f(this.friends, podcastsBlockPodcastDto.friends) && epx.f(this.friendsText, podcastsBlockPodcastDto.friendsText) && epx.f(this.legalNotice, podcastsBlockPodcastDto.legalNotice) && epx.f(this.canEdit, podcastsBlockPodcastDto.canEdit);
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean h1() {
        return this.canSubscribe;
    }

    public final int hashCode() {
        int a2 = shy.a(this.episodesCount, urd0.a(shy.a(this.updatedAt, (this.podcastCover.hashCode() + urd0.a(urd0.a(urd0.a(fw3.a(shy.a(this.subscriptionDate, qoy.b(qoy.b(this.id.hashCode() * 31, 31, this.canSubscribe), 31, this.isSubscribed), 31), 31, this.categories), 31, this.title), 31, this.subtitle), 31, this.podcastDescription)) * 31, 31), 31, this.pageUrl), 31);
        List<PodcastsBlockFriendDto> list = this.friends;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.friendsText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PodcastsLegalNoticeDto podcastsLegalNoticeDto = this.legalNotice;
        int hashCode3 = (hashCode2 + (podcastsLegalNoticeDto == null ? 0 : podcastsLegalNoticeDto.hashCode())) * 31;
        Boolean bool = this.canEdit;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastsBlockPodcastDto(id=");
        sb.append(this.id);
        sb.append(", canSubscribe=");
        sb.append(this.canSubscribe);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", subscriptionDate=");
        sb.append(this.subscriptionDate);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", podcastDescription=");
        sb.append(this.podcastDescription);
        sb.append(", podcastCover=");
        sb.append(this.podcastCover);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", pageUrl=");
        sb.append(this.pageUrl);
        sb.append(", episodesCount=");
        sb.append(this.episodesCount);
        sb.append(", friends=");
        sb.append(this.friends);
        sb.append(", friendsText=");
        sb.append(this.friendsText);
        sb.append(", legalNotice=");
        sb.append(this.legalNotice);
        sb.append(", canEdit=");
        return tn.a(sb, this.canEdit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.canSubscribe ? 1 : 0);
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        parcel.writeInt(this.subscriptionDate);
        Iterator a2 = ao.a(parcel, this.categories);
        while (a2.hasNext()) {
            ((PodcastsBlockCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.podcastDescription);
        this.podcastCover.writeToParcel(parcel, i);
        parcel.writeInt(this.updatedAt);
        parcel.writeString(this.pageUrl);
        parcel.writeInt(this.episodesCount);
        List<PodcastsBlockFriendDto> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PodcastsBlockFriendDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.friendsText);
        PodcastsLegalNoticeDto podcastsLegalNoticeDto = this.legalNotice;
        if (podcastsLegalNoticeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastsLegalNoticeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canEdit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ PodcastsBlockPodcastDto(String str, boolean z, boolean z2, int i, List list, String str2, String str3, String str4, PodcastsItemCoverDto podcastsItemCoverDto, int i2, String str5, int i3, List list2, String str6, PodcastsLegalNoticeDto podcastsLegalNoticeDto, Boolean bool, int i4, zcl zclVar) {
        this(str, z, z2, i, list, str2, str3, str4, podcastsItemCoverDto, i2, str5, i3, (i4 & 4096) != 0 ? null : list2, (i4 & 8192) != 0 ? null : str6, (i4 & 16384) != 0 ? null : podcastsLegalNoticeDto, (i4 & 32768) != 0 ? null : bool);
    }
}

package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import com.vk.api.generated.wall.dto.WallWallpostDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: NotificationsNotificationListRedesignResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationListRedesignResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationListRedesignResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("last_viewed")
    private final int lastViewed;

    @pmi0("market_items")
    private final List<MarketMarketItemDto> marketItems;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0(C4504q2.x)
    private final List<NotificationsNotificationRedesignDto> notifications;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("podcast_episodes")
    private final List<AudioAudioDto> podcastEpisodes;

    @pmi0("polls")
    private final List<PollsPollDto> polls;

    @pmi0("posts")
    private final List<WallWallpostDto> posts;

    @pmi0("stories")
    private final List<StoriesStoryDto> stories;

    @pmi0("users")
    private final List<UsersUserDto> users;

    @pmi0("videos")
    private final List<VideoVideoDto> videos;

    /* compiled from: NotificationsNotificationListRedesignResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationListRedesignResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationListRedesignResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            String str;
            ArrayList arrayList10;
            ArrayList arrayList11;
            int readInt = parcel.readInt();
            ArrayList arrayList12 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NotificationsNotificationRedesignDto.CREATOR, parcel, arrayList12, i, 1);
            }
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList13, i2, 1);
                }
                arrayList = arrayList13;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(WallWallpostDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(readInt6);
                int i5 = 0;
                while (i5 != readInt6) {
                    i5 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList14, i5, 1);
                }
                arrayList4 = arrayList14;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                int i6 = 0;
                while (i6 != readInt7) {
                    i6 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList5, i6, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList6 = new ArrayList(readInt8);
                int i7 = 0;
                while (i7 != readInt8) {
                    i7 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList6, i7, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt9 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(readInt9);
                int i8 = 0;
                while (i8 != readInt9) {
                    i8 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList15, i8, 1);
                }
                arrayList7 = arrayList15;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList8 = new ArrayList(readInt10);
                int i9 = 0;
                while (i9 != readInt10) {
                    i9 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList8, i9, 1);
                }
            }
            if (parcel.readInt() == 0) {
                str = readString;
                arrayList9 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList9 = new ArrayList(readInt11);
                str = readString;
                int i10 = 0;
                while (i10 != readInt11) {
                    i10 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList9, i10, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList11 = arrayList12;
                arrayList10 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList10 = new ArrayList(readInt12);
                arrayList11 = arrayList12;
                int i11 = 0;
                while (i11 != readInt12) {
                    i11 = bo.b(NotificationsNotificationListRedesignResponseDto.class, parcel, arrayList10, i11, 1);
                }
            }
            return new NotificationsNotificationListRedesignResponseDto(arrayList11, readInt2, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationListRedesignResponseDto[] newArray(int i) {
            return new NotificationsNotificationListRedesignResponseDto[i];
        }
    }

    public NotificationsNotificationListRedesignResponseDto(List<NotificationsNotificationRedesignDto> list, int i, String str, List<UsersUserDto> list2, List<GroupsGroupDto> list3, List<WallWallpostDto> list4, List<PhotosPhotoDto> list5, List<VideoVideoDto> list6, List<StoriesStoryDto> list7, List<AppsAppDto> list8, List<PollsPollDto> list9, List<MarketMarketItemDto> list10, List<AudioAudioDto> list11) {
        this.notifications = list;
        this.lastViewed = i;
        this.nextFrom = str;
        this.users = list2;
        this.groups = list3;
        this.posts = list4;
        this.photos = list5;
        this.videos = list6;
        this.stories = list7;
        this.apps = list8;
        this.polls = list9;
        this.marketItems = list10;
        this.podcastEpisodes = list11;
    }

    public final List<VideoVideoDto> B() {
        return this.videos;
    }

    public final List<AppsAppDto> d() {
        return this.apps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationListRedesignResponseDto)) {
            return false;
        }
        NotificationsNotificationListRedesignResponseDto notificationsNotificationListRedesignResponseDto = (NotificationsNotificationListRedesignResponseDto) obj;
        return epx.f(this.notifications, notificationsNotificationListRedesignResponseDto.notifications) && this.lastViewed == notificationsNotificationListRedesignResponseDto.lastViewed && epx.f(this.nextFrom, notificationsNotificationListRedesignResponseDto.nextFrom) && epx.f(this.users, notificationsNotificationListRedesignResponseDto.users) && epx.f(this.groups, notificationsNotificationListRedesignResponseDto.groups) && epx.f(this.posts, notificationsNotificationListRedesignResponseDto.posts) && epx.f(this.photos, notificationsNotificationListRedesignResponseDto.photos) && epx.f(this.videos, notificationsNotificationListRedesignResponseDto.videos) && epx.f(this.stories, notificationsNotificationListRedesignResponseDto.stories) && epx.f(this.apps, notificationsNotificationListRedesignResponseDto.apps) && epx.f(this.polls, notificationsNotificationListRedesignResponseDto.polls) && epx.f(this.marketItems, notificationsNotificationListRedesignResponseDto.marketItems) && epx.f(this.podcastEpisodes, notificationsNotificationListRedesignResponseDto.podcastEpisodes);
    }

    public final int f() {
        return this.lastViewed;
    }

    public final List<MarketMarketItemDto> g() {
        return this.marketItems;
    }

    public final int hashCode() {
        int a2 = shy.a(this.lastViewed, this.notifications.hashCode() * 31, 31);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserDto> list = this.users;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WallWallpostDto> list3 = this.posts;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PhotosPhotoDto> list4 = this.photos;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<VideoVideoDto> list5 = this.videos;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<StoriesStoryDto> list6 = this.stories;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<AppsAppDto> list7 = this.apps;
        int hashCode8 = (hashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<PollsPollDto> list8 = this.polls;
        int hashCode9 = (hashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<MarketMarketItemDto> list9 = this.marketItems;
        int hashCode10 = (hashCode9 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<AudioAudioDto> list10 = this.podcastEpisodes;
        return hashCode10 + (list10 != null ? list10.hashCode() : 0);
    }

    public final String i() {
        return this.nextFrom;
    }

    public final List<NotificationsNotificationRedesignDto> j() {
        return this.notifications;
    }

    public final List<PhotosPhotoDto> k() {
        return this.photos;
    }

    public final List<AudioAudioDto> l() {
        return this.podcastEpisodes;
    }

    public final List<PollsPollDto> n() {
        return this.polls;
    }

    public final List<WallWallpostDto> o() {
        return this.posts;
    }

    public final List<StoriesStoryDto> p() {
        return this.stories;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationListRedesignResponseDto(notifications=");
        sb.append(this.notifications);
        sb.append(", lastViewed=");
        sb.append(this.lastViewed);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", posts=");
        sb.append(this.posts);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", stories=");
        sb.append(this.stories);
        sb.append(", apps=");
        sb.append(this.apps);
        sb.append(", polls=");
        sb.append(this.polls);
        sb.append(", marketItems=");
        sb.append(this.marketItems);
        sb.append(", podcastEpisodes=");
        return ms9.a(')', sb, this.podcastEpisodes);
    }

    public final List<UsersUserDto> u() {
        return this.users;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.notifications);
        while (a2.hasNext()) {
            ((NotificationsNotificationRedesignDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.lastViewed);
        parcel.writeString(this.nextFrom);
        List<UsersUserDto> list = this.users;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<WallWallpostDto> list3 = this.posts;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((WallWallpostDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<PhotosPhotoDto> list4 = this.photos;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<VideoVideoDto> list5 = this.videos;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<StoriesStoryDto> list6 = this.stories;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        List<AppsAppDto> list7 = this.apps;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        List<PollsPollDto> list8 = this.polls;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        List<MarketMarketItemDto> list9 = this.marketItems;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        List<AudioAudioDto> list10 = this.podcastEpisodes;
        if (list10 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f10 = dn.f(parcel, list10, 1);
        while (f10.hasNext()) {
            parcel.writeParcelable((Parcelable) f10.next(), i);
        }
    }

    public /* synthetic */ NotificationsNotificationListRedesignResponseDto(List list, int i, String str, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5, (i2 & 128) != 0 ? null : list6, (i2 & 256) != 0 ? null : list7, (i2 & 512) != 0 ? null : list8, (i2 & 1024) != 0 ? null : list9, (i2 & 2048) != 0 ? null : list10, (i2 & 4096) != 0 ? null : list11);
    }
}

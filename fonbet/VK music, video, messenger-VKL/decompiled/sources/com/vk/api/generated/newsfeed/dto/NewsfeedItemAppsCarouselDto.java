package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselObjectsTypeDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fq;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedItemAppsCarouselDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemAppsCarouselDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemAppsCarouselDto> CREATOR = new a();

    @pmi0("activity")
    private final WallPostActivityDto activity;

    @pmi0("button")
    private final DiscoverCarouselButtonDto button;

    @pmi0("can_ignore")
    private final Boolean canIgnore;

    @pmi0("caption")
    private final NewsfeedNewsfeedItemCaptionDto caption;

    @pmi0("date")
    private final int date;

    @pmi0("debug_info")
    private final NewsfeedItemDebugInfoDto debugInfo;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("is_async")
    private final Boolean isAsync;

    @pmi0("items")
    private final List<DiscoverCarouselItemDto> items;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

    @pmi0("objects")
    private final List<AppsAppDto> objects;

    @pmi0("objects_type")
    private final DiscoverCarouselObjectsTypeDto objectsType;

    @pmi0("push_subscription")
    private final NewsfeedPushSubscriptionDto pushSubscription;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final NewsfeedNewsfeedItemTypeDto type;

    /* compiled from: NewsfeedItemAppsCarouselDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemAppsCarouselDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemAppsCarouselDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Float f;
            Boolean valueOf4;
            DiscoverCarouselButtonDto createFromParcel = DiscoverCarouselButtonDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(DiscoverCarouselItemDto.CREATOR, parcel, arrayList2, i, 1);
            }
            String readString = parcel.readString();
            NewsfeedNewsfeedItemTypeDto createFromParcel2 = NewsfeedNewsfeedItemTypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(NewsfeedItemAppsCarouselDto.class, parcel, arrayList, i2, 1);
                }
            }
            DiscoverCarouselObjectsTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : DiscoverCarouselObjectsTypeDto.CREATOR.createFromParcel(parcel);
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
            NewsfeedNewsfeedItemCaptionDto createFromParcel4 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemCaptionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
                f = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                f = null;
            }
            Boolean bool = valueOf;
            String readString2 = parcel.readString();
            WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
            Float valueOf5 = parcel.readInt() == 0 ? f : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) (parcel.readInt() == 0 ? f : NewsfeedPushSubscriptionDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                valueOf4 = f;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedItemAppsCarouselDto(createFromParcel, arrayList2, readString, createFromParcel2, userId, readInt2, arrayList, createFromParcel3, bool, valueOf2, createFromParcel4, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) (parcel.readInt() == 0 ? f : NewsfeedItemWallpostFeedbackDto.CREATOR.createFromParcel(parcel)), (NewsfeedItemDebugInfoDto) (parcel.readInt() == 0 ? f : NewsfeedItemDebugInfoDto.CREATOR.createFromParcel(parcel)));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemAppsCarouselDto[] newArray(int i) {
            return new NewsfeedItemAppsCarouselDto[i];
        }
    }

    public NewsfeedItemAppsCarouselDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, List<DiscoverCarouselItemDto> list, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List<AppsAppDto> list2, DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.button = discoverCarouselButtonDto;
        this.items = list;
        this.title = str;
        this.type = newsfeedNewsfeedItemTypeDto;
        this.sourceId = userId;
        this.date = i;
        this.objects = list2;
        this.objectsType = discoverCarouselObjectsTypeDto;
        this.isAsync = bool;
        this.canIgnore = bool2;
        this.caption = newsfeedNewsfeedItemCaptionDto;
        this.keepOffline = bool3;
        this.trackCode = str2;
        this.activity = wallPostActivityDto;
        this.shortTextRate = f;
        this.pushSubscription = newsfeedPushSubscriptionDto;
        this.suggestSubscribe = bool4;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.debugInfo = newsfeedItemDebugInfoDto;
    }

    public final DiscoverCarouselButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<DiscoverCarouselItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemAppsCarouselDto)) {
            return false;
        }
        NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto = (NewsfeedItemAppsCarouselDto) obj;
        return epx.f(this.button, newsfeedItemAppsCarouselDto.button) && epx.f(this.items, newsfeedItemAppsCarouselDto.items) && epx.f(this.title, newsfeedItemAppsCarouselDto.title) && this.type == newsfeedItemAppsCarouselDto.type && epx.f(this.sourceId, newsfeedItemAppsCarouselDto.sourceId) && this.date == newsfeedItemAppsCarouselDto.date && epx.f(this.objects, newsfeedItemAppsCarouselDto.objects) && this.objectsType == newsfeedItemAppsCarouselDto.objectsType && epx.f(this.isAsync, newsfeedItemAppsCarouselDto.isAsync) && epx.f(this.canIgnore, newsfeedItemAppsCarouselDto.canIgnore) && epx.f(this.caption, newsfeedItemAppsCarouselDto.caption) && epx.f(this.keepOffline, newsfeedItemAppsCarouselDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAppsCarouselDto.trackCode) && epx.f(this.activity, newsfeedItemAppsCarouselDto.activity) && epx.f(this.shortTextRate, newsfeedItemAppsCarouselDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAppsCarouselDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAppsCarouselDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAppsCarouselDto.feedback) && epx.f(this.debugInfo, newsfeedItemAppsCarouselDto.debugInfo);
    }

    public final List<AppsAppDto> f() {
        return this.objects;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(fw3.a(this.button.hashCode() * 31, 31, this.items), 31, this.title)) * 31, 31, this.sourceId.b), 31);
        List<AppsAppDto> list = this.objects;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = this.objectsType;
        int hashCode2 = (hashCode + (discoverCarouselObjectsTypeDto == null ? 0 : discoverCarouselObjectsTypeDto.hashCode())) * 31;
        Boolean bool = this.isAsync;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canIgnore;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool3 = this.keepOffline;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        WallPostActivityDto wallPostActivityDto = this.activity;
        int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
        Boolean bool4 = this.suggestSubscribe;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemAppsCarouselDto(button=");
        sb.append(this.button);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", objects=");
        sb.append(this.objects);
        sb.append(", objectsType=");
        sb.append(this.objectsType);
        sb.append(", isAsync=");
        sb.append(this.isAsync);
        sb.append(", canIgnore=");
        sb.append(this.canIgnore);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", keepOffline=");
        sb.append(this.keepOffline);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", activity=");
        sb.append(this.activity);
        sb.append(", shortTextRate=");
        sb.append(this.shortTextRate);
        sb.append(", pushSubscription=");
        sb.append(this.pushSubscription);
        sb.append(", suggestSubscribe=");
        sb.append(this.suggestSubscribe);
        sb.append(", feedback=");
        sb.append(this.feedback);
        sb.append(", debugInfo=");
        return fq.d(sb, this.debugInfo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.button.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((DiscoverCarouselItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        List<AppsAppDto> list = this.objects;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = this.objectsType;
        if (discoverCarouselObjectsTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discoverCarouselObjectsTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isAsync;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canIgnore;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        if (newsfeedNewsfeedItemCaptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemCaptionDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.keepOffline;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.activity, i);
        Float f2 = this.shortTextRate;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        if (newsfeedPushSubscriptionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedPushSubscriptionDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.suggestSubscribe;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        if (newsfeedItemWallpostFeedbackDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemWallpostFeedbackDto.writeToParcel(parcel, i);
        }
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        if (newsfeedItemDebugInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemDebugInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedItemAppsCarouselDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, List list, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List list2, DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(discoverCarouselButtonDto, list, str, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : discoverCarouselObjectsTypeDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 2048) != 0 ? null : bool3, (i2 & 4096) != 0 ? null : str2, (i2 & 8192) != 0 ? null : wallPostActivityDto, (i2 & 16384) != 0 ? null : f, (32768 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i2) != 0 ? null : bool4, (131072 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

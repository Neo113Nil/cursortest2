package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fq;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedItemRecommendedAppBlockDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemRecommendedAppBlockDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemRecommendedAppBlockDto> CREATOR = new a();

    @pmi0("activity")
    private final WallPostActivityDto activity;

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f78app;

    @pmi0("app_cover")
    private final List<BaseImageDto> appCover;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("can_ignore")
    private final Boolean canIgnore;

    @pmi0("caption")
    private final NewsfeedNewsfeedItemCaptionDto caption;

    @pmi0("date")
    private final int date;

    @pmi0("debug_info")
    private final NewsfeedItemDebugInfoDto debugInfo;

    @pmi0("description")
    private final String description;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("friends_avatars")
    private final List<List<BaseImageDto>> friendsAvatars;

    @pmi0("friends_playing_text")
    private final String friendsPlayingText;

    @pmi0("is_async")
    private final Boolean isAsync;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

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

    /* compiled from: NewsfeedItemRecommendedAppBlockDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedAppBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemRecommendedAppBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            WallPostActivityDto wallPostActivityDto;
            NewsfeedItemWallpostFeedbackDto createFromParcel;
            AppsAppDto appsAppDto = (AppsAppDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            NewsfeedNewsfeedItemTypeDto createFromParcel2 = NewsfeedNewsfeedItemTypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader());
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    int i2 = 0;
                    while (i2 != readInt3) {
                        i2 = bo.b(NewsfeedItemRecommendedAppBlockDto.class, parcel, arrayList4, i2, 1);
                    }
                    arrayList3.add(arrayList4);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(NewsfeedItemRecommendedAppBlockDto.class, parcel, arrayList2, i3, 1);
                }
            }
            String readString4 = parcel.readString();
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            NewsfeedNewsfeedItemCaptionDto createFromParcel3 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemCaptionDto.CREATOR.createFromParcel(parcel);
            Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String readString5 = parcel.readString();
            WallPostActivityDto wallPostActivityDto2 = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader());
            Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto createFromParcel4 = parcel.readInt() == 0 ? null : NewsfeedPushSubscriptionDto.CREATOR.createFromParcel(parcel);
            Boolean valueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                wallPostActivityDto = wallPostActivityDto2;
                createFromParcel = null;
            } else {
                wallPostActivityDto = wallPostActivityDto2;
                createFromParcel = NewsfeedItemWallpostFeedbackDto.CREATOR.createFromParcel(parcel);
            }
            return new NewsfeedItemRecommendedAppBlockDto(appsAppDto, readString, readString2, createFromParcel2, userId, readInt, readString3, arrayList, arrayList2, readString4, valueOf, valueOf2, createFromParcel3, valueOf3, readString5, wallPostActivityDto, valueOf4, createFromParcel4, valueOf5, createFromParcel, parcel.readInt() == 0 ? null : NewsfeedItemDebugInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemRecommendedAppBlockDto[] newArray(int i) {
            return new NewsfeedItemRecommendedAppBlockDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemRecommendedAppBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List<? extends List<BaseImageDto>> list, List<BaseImageDto> list2, String str4, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.f78app = appsAppDto;
        this.title = str;
        this.buttonText = str2;
        this.type = newsfeedNewsfeedItemTypeDto;
        this.sourceId = userId;
        this.date = i;
        this.friendsPlayingText = str3;
        this.friendsAvatars = list;
        this.appCover = list2;
        this.description = str4;
        this.isAsync = bool;
        this.canIgnore = bool2;
        this.caption = newsfeedNewsfeedItemCaptionDto;
        this.keepOffline = bool3;
        this.trackCode = str5;
        this.activity = wallPostActivityDto;
        this.shortTextRate = f;
        this.pushSubscription = newsfeedPushSubscriptionDto;
        this.suggestSubscribe = bool4;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.debugInfo = newsfeedItemDebugInfoDto;
    }

    public final AppsAppDto d() {
        return this.f78app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.appCover;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemRecommendedAppBlockDto)) {
            return false;
        }
        NewsfeedItemRecommendedAppBlockDto newsfeedItemRecommendedAppBlockDto = (NewsfeedItemRecommendedAppBlockDto) obj;
        return epx.f(this.f78app, newsfeedItemRecommendedAppBlockDto.f78app) && epx.f(this.title, newsfeedItemRecommendedAppBlockDto.title) && epx.f(this.buttonText, newsfeedItemRecommendedAppBlockDto.buttonText) && this.type == newsfeedItemRecommendedAppBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedAppBlockDto.sourceId) && this.date == newsfeedItemRecommendedAppBlockDto.date && epx.f(this.friendsPlayingText, newsfeedItemRecommendedAppBlockDto.friendsPlayingText) && epx.f(this.friendsAvatars, newsfeedItemRecommendedAppBlockDto.friendsAvatars) && epx.f(this.appCover, newsfeedItemRecommendedAppBlockDto.appCover) && epx.f(this.description, newsfeedItemRecommendedAppBlockDto.description) && epx.f(this.isAsync, newsfeedItemRecommendedAppBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedAppBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedAppBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedAppBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecommendedAppBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecommendedAppBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedAppBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedAppBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedAppBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedAppBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedAppBlockDto.debugInfo);
    }

    public final String f() {
        return this.buttonText;
    }

    public final NewsfeedNewsfeedItemCaptionDto g() {
        return this.caption;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(urd0.a(this.f78app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31, this.sourceId.b), 31);
        String str = this.friendsPlayingText;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.friendsAvatars;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.appCover;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.description;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAsync;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canIgnore;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode7 = (hashCode6 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool3 = this.keepOffline;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.trackCode;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WallPostActivityDto wallPostActivityDto = this.activity;
        int hashCode10 = (hashCode9 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        int hashCode12 = (hashCode11 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
        Boolean bool4 = this.suggestSubscribe;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode14 = (hashCode13 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        return hashCode14 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
    }

    public final List<List<BaseImageDto>> i() {
        return this.friendsAvatars;
    }

    public final String j() {
        return this.friendsPlayingText;
    }

    public final NewsfeedNewsfeedItemTypeDto k() {
        return this.type;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedAppBlockDto(app=");
        sb.append(this.f78app);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", friendsPlayingText=");
        sb.append(this.friendsPlayingText);
        sb.append(", friendsAvatars=");
        sb.append(this.friendsAvatars);
        sb.append(", appCover=");
        sb.append(this.appCover);
        sb.append(", description=");
        sb.append(this.description);
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
        parcel.writeParcelable(this.f78app, i);
        parcel.writeString(this.title);
        parcel.writeString(this.buttonText);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        parcel.writeString(this.friendsPlayingText);
        List<List<BaseImageDto>> list = this.friendsAvatars;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f.next());
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
            }
        }
        List<BaseImageDto> list2 = this.appCover;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.description);
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
        Float f3 = this.shortTextRate;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
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

    public /* synthetic */ NewsfeedItemRecommendedAppBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List list, List list2, String str4, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(appsAppDto, str, str2, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 8192) != 0 ? null : bool3, (i2 & 16384) != 0 ? null : str5, (32768 & i2) != 0 ? null : wallPostActivityDto, (65536 & i2) != 0 ? null : f, (131072 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (262144 & i2) != 0 ? null : bool4, (524288 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

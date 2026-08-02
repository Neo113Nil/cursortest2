package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosTagsSuggestionItemDto;
import com.vk.api.generated.photos.dto.PhotosTagsSuggestionItemEndCardDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fq;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: NewsfeedItemRecognizeBlockDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemRecognizeBlockDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemRecognizeBlockDto> CREATOR = new a();

    @pmi0("activity")
    private final WallPostActivityDto activity;

    @pmi0("can_ignore")
    private final Boolean canIgnore;

    @pmi0("caption")
    private final NewsfeedNewsfeedItemCaptionDto caption;

    @pmi0("date")
    private final int date;

    @pmi0("debug_info")
    private final NewsfeedItemDebugInfoDto debugInfo;

    @pmi0("end_card")
    private final PhotosTagsSuggestionItemEndCardDto endCard;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("is_async")
    private final Boolean isAsync;

    @pmi0("items")
    private final List<PhotosTagsSuggestionItemDto> items;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

    @pmi0("push_subscription")
    private final NewsfeedPushSubscriptionDto pushSubscription;

    @pmi0("recognition_article_link")
    private final String recognitionArticleLink;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final NewsfeedNewsfeedItemTypeDto type;

    /* compiled from: NewsfeedItemRecognizeBlockDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemRecognizeBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemRecognizeBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
            UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
            int readInt = parcel.readInt();
            PhotosTagsSuggestionItemEndCardDto createFromParcel = parcel.readInt() == 0 ? null : PhotosTagsSuggestionItemEndCardDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(PhotosTagsSuggestionItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
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
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedItemRecognizeBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, readString, arrayList, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemRecognizeBlockDto[] newArray(int i) {
            return new NewsfeedItemRecognizeBlockDto[i];
        }
    }

    public NewsfeedItemRecognizeBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto, String str, List<PhotosTagsSuggestionItemDto> list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.type = newsfeedNewsfeedItemTypeDto;
        this.sourceId = userId;
        this.date = i;
        this.endCard = photosTagsSuggestionItemEndCardDto;
        this.recognitionArticleLink = str;
        this.items = list;
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemRecognizeBlockDto)) {
            return false;
        }
        NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto = (NewsfeedItemRecognizeBlockDto) obj;
        return this.type == newsfeedItemRecognizeBlockDto.type && epx.f(this.sourceId, newsfeedItemRecognizeBlockDto.sourceId) && this.date == newsfeedItemRecognizeBlockDto.date && epx.f(this.endCard, newsfeedItemRecognizeBlockDto.endCard) && epx.f(this.recognitionArticleLink, newsfeedItemRecognizeBlockDto.recognitionArticleLink) && epx.f(this.items, newsfeedItemRecognizeBlockDto.items) && epx.f(this.isAsync, newsfeedItemRecognizeBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecognizeBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecognizeBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecognizeBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecognizeBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecognizeBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecognizeBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecognizeBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecognizeBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecognizeBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecognizeBlockDto.debugInfo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
        PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = this.endCard;
        int hashCode = (a2 + (photosTagsSuggestionItemEndCardDto == null ? 0 : photosTagsSuggestionItemEndCardDto.hashCode())) * 31;
        String str = this.recognitionArticleLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PhotosTagsSuggestionItemDto> list = this.items;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isAsync;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canIgnore;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool3 = this.keepOffline;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallPostActivityDto wallPostActivityDto = this.activity;
        int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
        Boolean bool4 = this.suggestSubscribe;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        return hashCode13 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemRecognizeBlockDto(type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", endCard=");
        sb.append(this.endCard);
        sb.append(", recognitionArticleLink=");
        sb.append(this.recognitionArticleLink);
        sb.append(", items=");
        sb.append(this.items);
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
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = this.endCard;
        if (photosTagsSuggestionItemEndCardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosTagsSuggestionItemEndCardDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.recognitionArticleLink);
        List<PhotosTagsSuggestionItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((PhotosTagsSuggestionItemDto) f.next()).writeToParcel(parcel, i);
            }
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
        parcel.writeParcelable(this.caption, i);
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
        parcel.writeParcelable(this.pushSubscription, i);
        Boolean bool4 = this.suggestSubscribe;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.feedback, i);
        parcel.writeParcelable(this.debugInfo, i);
    }

    public /* synthetic */ NewsfeedItemRecognizeBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto, String str, List list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : photosTagsSuggestionItemEndCardDto, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

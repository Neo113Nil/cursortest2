package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fq;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedDzenStoryNewsBlockDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenStoryNewsBlockDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenStoryNewsBlockDto> CREATOR = new a();

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

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("header")
    private final NewsfeedItemDigestHeaderDto header;

    @pmi0("is_async")
    private final Boolean isAsync;

    @pmi0("items")
    private final List<NewsfeedDzenStoryNewsBlockItemDto> items;

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

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedDzenStoryNewsBlockDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("dzen_story_news")
        public static final TypeDto DZEN_STORY_NEWS;
        private final String value;

        /* compiled from: NewsfeedDzenStoryNewsBlockDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("DZEN_STORY_NEWS", 0, "dzen_story_news");
            DZEN_STORY_NEWS = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: NewsfeedDzenStoryNewsBlockDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenStoryNewsBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenStoryNewsBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
            int readInt = parcel.readInt();
            NewsfeedItemDigestHeaderDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedItemDigestHeaderDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(NewsfeedDzenStoryNewsBlockItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
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
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = true;
            Boolean bool = valueOf;
            String readString = parcel.readString();
            WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf4 = Boolean.valueOf(z);
            }
            return new NewsfeedDzenStoryNewsBlockDto(createFromParcel, userId, readInt, createFromParcel2, arrayList, bool, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenStoryNewsBlockDto[] newArray(int i) {
            return new NewsfeedDzenStoryNewsBlockDto[i];
        }
    }

    public NewsfeedDzenStoryNewsBlockDto(TypeDto typeDto, UserId userId, int i, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, List<NewsfeedDzenStoryNewsBlockItemDto> list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.type = typeDto;
        this.sourceId = userId;
        this.date = i;
        this.header = newsfeedItemDigestHeaderDto;
        this.items = list;
        this.isAsync = bool;
        this.canIgnore = bool2;
        this.caption = newsfeedNewsfeedItemCaptionDto;
        this.keepOffline = bool3;
        this.trackCode = str;
        this.activity = wallPostActivityDto;
        this.shortTextRate = f;
        this.pushSubscription = newsfeedPushSubscriptionDto;
        this.suggestSubscribe = bool4;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.debugInfo = newsfeedItemDebugInfoDto;
    }

    public final NewsfeedItemDigestHeaderDto d() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<NewsfeedDzenStoryNewsBlockItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenStoryNewsBlockDto)) {
            return false;
        }
        NewsfeedDzenStoryNewsBlockDto newsfeedDzenStoryNewsBlockDto = (NewsfeedDzenStoryNewsBlockDto) obj;
        return this.type == newsfeedDzenStoryNewsBlockDto.type && epx.f(this.sourceId, newsfeedDzenStoryNewsBlockDto.sourceId) && this.date == newsfeedDzenStoryNewsBlockDto.date && epx.f(this.header, newsfeedDzenStoryNewsBlockDto.header) && epx.f(this.items, newsfeedDzenStoryNewsBlockDto.items) && epx.f(this.isAsync, newsfeedDzenStoryNewsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedDzenStoryNewsBlockDto.canIgnore) && epx.f(this.caption, newsfeedDzenStoryNewsBlockDto.caption) && epx.f(this.keepOffline, newsfeedDzenStoryNewsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedDzenStoryNewsBlockDto.trackCode) && epx.f(this.activity, newsfeedDzenStoryNewsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedDzenStoryNewsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedDzenStoryNewsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedDzenStoryNewsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedDzenStoryNewsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedDzenStoryNewsBlockDto.debugInfo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
        NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
        int hashCode = (a2 + (newsfeedItemDigestHeaderDto == null ? 0 : newsfeedItemDigestHeaderDto.hashCode())) * 31;
        List<NewsfeedDzenStoryNewsBlockItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
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

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedDzenStoryNewsBlockDto(type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", header=");
        sb.append(this.header);
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
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
        if (newsfeedItemDigestHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemDigestHeaderDto.writeToParcel(parcel, i);
        }
        List<NewsfeedDzenStoryNewsBlockItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NewsfeedDzenStoryNewsBlockItemDto) f.next()).writeToParcel(parcel, i);
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

    public /* synthetic */ NewsfeedDzenStoryNewsBlockDto(TypeDto typeDto, UserId userId, int i, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, List list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(typeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemDigestHeaderDto, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : wallPostActivityDto, (i2 & 2048) != 0 ? null : f, (i2 & 4096) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 8192) != 0 ? null : bool4, (i2 & 16384) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 32768) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

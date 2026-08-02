package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fq;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemRecommendedNarrativesBlockDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemRecommendedNarrativesBlockDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemRecommendedNarrativesBlockDto> CREATOR = new a();

    @pmi0("activity")
    private final WallPostActivityDto activity;

    @pmi0("can_ignore")
    private final Boolean canIgnore;

    @pmi0("caption")
    private final NewsfeedNewsfeedItemCaptionDto caption;

    @pmi0("create_block_position")
    private final Integer createBlockPosition;

    @pmi0("date")
    private final int date;

    @pmi0("debug_info")
    private final NewsfeedItemDebugInfoDto debugInfo;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("is_async")
    private final Boolean isAsync;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

    @pmi0("narratives")
    private final List<NarrativesNarrativeDto> narratives;

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
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemRecommendedNarrativesBlockDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("recommended_narratives")
        public static final TypeDto RECOMMENDED_NARRATIVES;
        private final String value;

        /* compiled from: NewsfeedItemRecommendedNarrativesBlockDto.kt */
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
            TypeDto typeDto = new TypeDto("RECOMMENDED_NARRATIVES", 0, "recommended_narratives");
            RECOMMENDED_NARRATIVES = typeDto;
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

    /* compiled from: NewsfeedItemRecommendedNarrativesBlockDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedNarrativesBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemRecommendedNarrativesBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
            int readInt = parcel.readInt();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(NewsfeedItemRecommendedNarrativesBlockDto.class, parcel, arrayList, i, 1);
                }
            }
            String readString2 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedItemRecommendedNarrativesBlockDto(readString, createFromParcel, userId, readInt, arrayList, readString2, valueOf4, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemRecommendedNarrativesBlockDto[] newArray(int i) {
            return new NewsfeedItemRecommendedNarrativesBlockDto[i];
        }
    }

    public NewsfeedItemRecommendedNarrativesBlockDto(String str, TypeDto typeDto, UserId userId, int i, List<NarrativesNarrativeDto> list, String str2, Integer num, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.title = str;
        this.type = typeDto;
        this.sourceId = userId;
        this.date = i;
        this.narratives = list;
        this.trackCode = str2;
        this.createBlockPosition = num;
        this.isAsync = bool;
        this.canIgnore = bool2;
        this.caption = newsfeedNewsfeedItemCaptionDto;
        this.keepOffline = bool3;
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
        if (!(obj instanceof NewsfeedItemRecommendedNarrativesBlockDto)) {
            return false;
        }
        NewsfeedItemRecommendedNarrativesBlockDto newsfeedItemRecommendedNarrativesBlockDto = (NewsfeedItemRecommendedNarrativesBlockDto) obj;
        return epx.f(this.title, newsfeedItemRecommendedNarrativesBlockDto.title) && this.type == newsfeedItemRecommendedNarrativesBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedNarrativesBlockDto.sourceId) && this.date == newsfeedItemRecommendedNarrativesBlockDto.date && epx.f(this.narratives, newsfeedItemRecommendedNarrativesBlockDto.narratives) && epx.f(this.trackCode, newsfeedItemRecommendedNarrativesBlockDto.trackCode) && epx.f(this.createBlockPosition, newsfeedItemRecommendedNarrativesBlockDto.createBlockPosition) && epx.f(this.isAsync, newsfeedItemRecommendedNarrativesBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedNarrativesBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedNarrativesBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedNarrativesBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemRecommendedNarrativesBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedNarrativesBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedNarrativesBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedNarrativesBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedNarrativesBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedNarrativesBlockDto.debugInfo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.sourceId.b), 31);
        List<NarrativesNarrativeDto> list = this.narratives;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.createBlockPosition;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isAsync;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canIgnore;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool3 = this.keepOffline;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
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
        StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedNarrativesBlockDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", narratives=");
        sb.append(this.narratives);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", createBlockPosition=");
        sb.append(this.createBlockPosition);
        sb.append(", isAsync=");
        sb.append(this.isAsync);
        sb.append(", canIgnore=");
        sb.append(this.canIgnore);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", keepOffline=");
        sb.append(this.keepOffline);
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
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        List<NarrativesNarrativeDto> list = this.narratives;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.trackCode);
        Integer num = this.createBlockPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
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

    public /* synthetic */ NewsfeedItemRecommendedNarrativesBlockDto(String str, TypeDto typeDto, UserId userId, int i, List list, String str2, Integer num, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(str, typeDto, userId, i, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

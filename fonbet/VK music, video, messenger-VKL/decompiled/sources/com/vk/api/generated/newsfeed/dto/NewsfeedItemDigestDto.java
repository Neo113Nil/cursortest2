package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Ad;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
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

/* compiled from: NewsfeedItemDigestDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemDigestDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemDigestDto> CREATOR = new a();

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

    @pmi0("feed_id")
    private final String feedId;

    @pmi0("feedback")
    private final NewsfeedItemWallpostFeedbackDto feedback;

    @pmi0("footer")
    private final NewsfeedItemDigestFooterDto footer;

    @pmi0("header")
    private final NewsfeedItemDigestHeaderDto header;

    @pmi0("is_async")
    private final Boolean isAsync;

    @pmi0("items")
    private final List<NewsfeedItemDigestItemDto> items;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

    @pmi0("main_post_ids")
    private final List<String> mainPostIds;

    @pmi0("push_subscription")
    private final NewsfeedPushSubscriptionDto pushSubscription;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    @pmi0("template")
    private final TemplateDto template;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final NewsfeedNewsfeedItemTypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestDto.kt */
    public static final class TemplateDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TemplateDto[] $VALUES;
        public static final Parcelable.Creator<TemplateDto> CREATOR;

        @pmi0("grid")
        public static final TemplateDto GRID;

        @pmi0("list")
        public static final TemplateDto LIST;

        @pmi0(Ad.d)
        public static final TemplateDto SINGLE;
        private final String value;

        /* compiled from: NewsfeedItemDigestDto.kt */
        public static final class a implements Parcelable.Creator<TemplateDto> {
            @Override // android.os.Parcelable.Creator
            public final TemplateDto createFromParcel(Parcel parcel) {
                return TemplateDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TemplateDto[] newArray(int i) {
                return new TemplateDto[i];
            }
        }

        static {
            TemplateDto templateDto = new TemplateDto("LIST", 0, "list");
            LIST = templateDto;
            TemplateDto templateDto2 = new TemplateDto(SignalingProtocol.KEY_GRID, 1, "grid");
            GRID = templateDto2;
            TemplateDto templateDto3 = new TemplateDto("SINGLE", 2, Ad.d);
            SINGLE = templateDto3;
            TemplateDto[] templateDtoArr = {templateDto, templateDto2, templateDto3};
            $VALUES = templateDtoArr;
            $ENTRIES = new asp(templateDtoArr);
            CREATOR = new a();
        }

        private TemplateDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TemplateDto valueOf(String str) {
            return (TemplateDto) Enum.valueOf(TemplateDto.class, str);
        }

        public static TemplateDto[] values() {
            return (TemplateDto[]) $VALUES.clone();
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

    /* compiled from: NewsfeedItemDigestDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemDigestDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean valueOf;
            Boolean valueOf2;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
            UserId userId = (UserId) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(NewsfeedItemDigestItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                bool = null;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            TemplateDto templateDto = (TemplateDto) (parcel.readInt() == 0 ? bool : TemplateDto.CREATOR.createFromParcel(parcel));
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = (NewsfeedItemDigestHeaderDto) (parcel.readInt() == 0 ? bool : NewsfeedItemDigestHeaderDto.CREATOR.createFromParcel(parcel));
            NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = (NewsfeedItemDigestFooterDto) (parcel.readInt() == 0 ? bool : NewsfeedItemDigestFooterDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                bool2 = bool;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool3 = bool;
            } else {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedItemDigestDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, arrayList, createStringArrayList, templateDto, newsfeedItemDigestHeaderDto, newsfeedItemDigestFooterDto, bool2, bool3, newsfeedNewsfeedItemCaptionDto, valueOf, readString2, wallPostActivityDto, valueOf3, newsfeedPushSubscriptionDto, valueOf2, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestDto[] newArray(int i) {
            return new NewsfeedItemDigestDto[i];
        }
    }

    public NewsfeedItemDigestDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<NewsfeedItemDigestItemDto> list, List<String> list2, TemplateDto templateDto, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.type = newsfeedNewsfeedItemTypeDto;
        this.sourceId = userId;
        this.date = i;
        this.feedId = str;
        this.items = list;
        this.mainPostIds = list2;
        this.template = templateDto;
        this.header = newsfeedItemDigestHeaderDto;
        this.footer = newsfeedItemDigestFooterDto;
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
        if (!(obj instanceof NewsfeedItemDigestDto)) {
            return false;
        }
        NewsfeedItemDigestDto newsfeedItemDigestDto = (NewsfeedItemDigestDto) obj;
        return this.type == newsfeedItemDigestDto.type && epx.f(this.sourceId, newsfeedItemDigestDto.sourceId) && this.date == newsfeedItemDigestDto.date && epx.f(this.feedId, newsfeedItemDigestDto.feedId) && epx.f(this.items, newsfeedItemDigestDto.items) && epx.f(this.mainPostIds, newsfeedItemDigestDto.mainPostIds) && this.template == newsfeedItemDigestDto.template && epx.f(this.header, newsfeedItemDigestDto.header) && epx.f(this.footer, newsfeedItemDigestDto.footer) && epx.f(this.isAsync, newsfeedItemDigestDto.isAsync) && epx.f(this.canIgnore, newsfeedItemDigestDto.canIgnore) && epx.f(this.caption, newsfeedItemDigestDto.caption) && epx.f(this.keepOffline, newsfeedItemDigestDto.keepOffline) && epx.f(this.trackCode, newsfeedItemDigestDto.trackCode) && epx.f(this.activity, newsfeedItemDigestDto.activity) && epx.f(this.shortTextRate, newsfeedItemDigestDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemDigestDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemDigestDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemDigestDto.feedback) && epx.f(this.debugInfo, newsfeedItemDigestDto.debugInfo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
        String str = this.feedId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<NewsfeedItemDigestItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.mainPostIds;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TemplateDto templateDto = this.template;
        int hashCode4 = (hashCode3 + (templateDto == null ? 0 : templateDto.hashCode())) * 31;
        NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
        int hashCode5 = (hashCode4 + (newsfeedItemDigestHeaderDto == null ? 0 : newsfeedItemDigestHeaderDto.hashCode())) * 31;
        NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = this.footer;
        int hashCode6 = (hashCode5 + (newsfeedItemDigestFooterDto == null ? 0 : newsfeedItemDigestFooterDto.hashCode())) * 31;
        Boolean bool = this.isAsync;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canIgnore;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode9 = (hashCode8 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool3 = this.keepOffline;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallPostActivityDto wallPostActivityDto = this.activity;
        int hashCode12 = (hashCode11 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        int hashCode14 = (hashCode13 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
        Boolean bool4 = this.suggestSubscribe;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode16 = (hashCode15 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        return hashCode16 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemDigestDto(type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", feedId=");
        sb.append(this.feedId);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", mainPostIds=");
        sb.append(this.mainPostIds);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", footer=");
        sb.append(this.footer);
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
        parcel.writeString(this.feedId);
        List<NewsfeedItemDigestItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NewsfeedItemDigestItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.mainPostIds);
        TemplateDto templateDto = this.template;
        if (templateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateDto.writeToParcel(parcel, i);
        }
        NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
        if (newsfeedItemDigestHeaderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemDigestHeaderDto.writeToParcel(parcel, i);
        }
        NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = this.footer;
        if (newsfeedItemDigestFooterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemDigestFooterDto.writeToParcel(parcel, i);
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

    public /* synthetic */ NewsfeedItemDigestDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, List list2, TemplateDto templateDto, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : templateDto, (i2 & 128) != 0 ? null : newsfeedItemDigestHeaderDto, (i2 & 256) != 0 ? null : newsfeedItemDigestFooterDto, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : str2, (i2 & 16384) != 0 ? null : wallPostActivityDto, (32768 & i2) != 0 ? null : f, (65536 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (131072 & i2) != 0 ? null : bool4, (262144 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 524288) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

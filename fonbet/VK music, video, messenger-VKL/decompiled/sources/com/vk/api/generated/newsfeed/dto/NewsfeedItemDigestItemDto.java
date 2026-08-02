package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.sdk.SharedKt;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.fq;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedItemDigestItemDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemDigestItemDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemDigestItemDto> CREATOR = new a();

    @pmi0("activity")
    private final WallPostActivityDto activity;

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final WallWallpostAttachmentDto attachment;

    @pmi0("attachment_index")
    private final Integer attachmentIndex;

    @pmi0("badge_text")
    private final String badgeText;

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

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("keep_offline")
    private final Boolean keepOffline;

    @pmi0("post")
    private final NewsfeedItemWallpostDto post;

    @pmi0("push_subscription")
    private final NewsfeedPushSubscriptionDto pushSubscription;

    @pmi0("short_text_rate")
    private final Float shortTextRate;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("source_name")
    private final String sourceName;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("suggest_subscribe")
    private final Boolean suggestSubscribe;

    @pmi0("text")
    private final String text;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final NewsfeedNewsfeedItemTypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestItemDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("newsfeed_item_digest_full_item")
        public static final InnerTypeDto NEWSFEED_ITEM_DIGEST_FULL_ITEM;
        private final String value;

        /* compiled from: NewsfeedItemDigestItemDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("NEWSFEED_ITEM_DIGEST_FULL_ITEM", 0, "newsfeed_item_digest_full_item");
            NEWSFEED_ITEM_DIGEST_FULL_ITEM = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedItemDigestItemDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final StyleDto DEFAULT;

        @pmi0("inversed")
        public static final StyleDto INVERSED;

        @pmi0("spotlight")
        public static final StyleDto SPOTLIGHT;
        private final String value;

        /* compiled from: NewsfeedItemDigestItemDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = styleDto;
            StyleDto styleDto2 = new StyleDto("INVERSED", 1, "inversed");
            INVERSED = styleDto2;
            StyleDto styleDto3 = new StyleDto("SPOTLIGHT", 2, "spotlight");
            SPOTLIGHT = styleDto3;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: NewsfeedItemDigestItemDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemDigestItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            NewsfeedItemWallpostDto createFromParcel2 = NewsfeedItemWallpostDto.CREATOR.createFromParcel(parcel);
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader());
            UserId userId = (UserId) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WallWallpostAttachmentDto wallWallpostAttachmentDto = (WallWallpostAttachmentDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader());
            StyleDto createFromParcel3 = parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = valueOf;
            String readString4 = parcel.readString();
            WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedItemDigestItemDto(createFromParcel, createFromParcel2, newsfeedNewsfeedItemTypeDto, userId, readInt, readString, readString2, valueOf4, wallWallpostAttachmentDto, createFromParcel3, readString3, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString4, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemDigestItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDigestItemDto[] newArray(int i) {
            return new NewsfeedItemDigestItemDto[i];
        }
    }

    public NewsfeedItemDigestItemDto(InnerTypeDto innerTypeDto, NewsfeedItemWallpostDto newsfeedItemWallpostDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, Integer num, WallWallpostAttachmentDto wallWallpostAttachmentDto, StyleDto styleDto, String str3, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str4, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        this.innerType = innerTypeDto;
        this.post = newsfeedItemWallpostDto;
        this.type = newsfeedNewsfeedItemTypeDto;
        this.sourceId = userId;
        this.date = i;
        this.text = str;
        this.sourceName = str2;
        this.attachmentIndex = num;
        this.attachment = wallWallpostAttachmentDto;
        this.style = styleDto;
        this.badgeText = str3;
        this.canIgnore = bool;
        this.caption = newsfeedNewsfeedItemCaptionDto;
        this.keepOffline = bool2;
        this.trackCode = str4;
        this.activity = wallPostActivityDto;
        this.shortTextRate = f;
        this.pushSubscription = newsfeedPushSubscriptionDto;
        this.suggestSubscribe = bool3;
        this.feedback = newsfeedItemWallpostFeedbackDto;
        this.debugInfo = newsfeedItemDebugInfoDto;
    }

    public final WallWallpostAttachmentDto d() {
        return this.attachment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.attachmentIndex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestItemDto)) {
            return false;
        }
        NewsfeedItemDigestItemDto newsfeedItemDigestItemDto = (NewsfeedItemDigestItemDto) obj;
        return this.innerType == newsfeedItemDigestItemDto.innerType && epx.f(this.post, newsfeedItemDigestItemDto.post) && this.type == newsfeedItemDigestItemDto.type && epx.f(this.sourceId, newsfeedItemDigestItemDto.sourceId) && this.date == newsfeedItemDigestItemDto.date && epx.f(this.text, newsfeedItemDigestItemDto.text) && epx.f(this.sourceName, newsfeedItemDigestItemDto.sourceName) && epx.f(this.attachmentIndex, newsfeedItemDigestItemDto.attachmentIndex) && epx.f(this.attachment, newsfeedItemDigestItemDto.attachment) && this.style == newsfeedItemDigestItemDto.style && epx.f(this.badgeText, newsfeedItemDigestItemDto.badgeText) && epx.f(this.canIgnore, newsfeedItemDigestItemDto.canIgnore) && epx.f(this.caption, newsfeedItemDigestItemDto.caption) && epx.f(this.keepOffline, newsfeedItemDigestItemDto.keepOffline) && epx.f(this.trackCode, newsfeedItemDigestItemDto.trackCode) && epx.f(this.activity, newsfeedItemDigestItemDto.activity) && epx.f(this.shortTextRate, newsfeedItemDigestItemDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemDigestItemDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemDigestItemDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemDigestItemDto.feedback) && epx.f(this.debugInfo, newsfeedItemDigestItemDto.debugInfo);
    }

    public final String f() {
        return this.badgeText;
    }

    public final NewsfeedItemWallpostDto g() {
        return this.post;
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + ((this.post.hashCode() + (this.innerType.hashCode() * 31)) * 31)) * 31, 31, this.sourceId.b), 31);
        String str = this.text;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.attachmentIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        WallWallpostAttachmentDto wallWallpostAttachmentDto = this.attachment;
        int hashCode4 = (hashCode3 + (wallWallpostAttachmentDto == null ? 0 : wallWallpostAttachmentDto.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode5 = (hashCode4 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        String str3 = this.badgeText;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canIgnore;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
        int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
        Boolean bool2 = this.keepOffline;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WallPostActivityDto wallPostActivityDto = this.activity;
        int hashCode11 = (hashCode10 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
        Float f = this.shortTextRate;
        int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
        NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
        int hashCode13 = (hashCode12 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
        Boolean bool3 = this.suggestSubscribe;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
        int hashCode15 = (hashCode14 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
        return hashCode15 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
    }

    public final String i() {
        return this.sourceName;
    }

    public final StyleDto j() {
        return this.style;
    }

    public final String k() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemDigestItemDto(innerType=");
        sb.append(this.innerType);
        sb.append(", post=");
        sb.append(this.post);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", sourceName=");
        sb.append(this.sourceName);
        sb.append(", attachmentIndex=");
        sb.append(this.attachmentIndex);
        sb.append(", attachment=");
        sb.append(this.attachment);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", badgeText=");
        sb.append(this.badgeText);
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
        this.innerType.writeToParcel(parcel, i);
        this.post.writeToParcel(parcel, i);
        parcel.writeParcelable(this.type, i);
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
        parcel.writeString(this.text);
        parcel.writeString(this.sourceName);
        Integer num = this.attachmentIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.attachment, i);
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.badgeText);
        Boolean bool = this.canIgnore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.caption, i);
        Boolean bool2 = this.keepOffline;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.activity, i);
        Float f = this.shortTextRate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        parcel.writeParcelable(this.pushSubscription, i);
        Boolean bool3 = this.suggestSubscribe;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.feedback, i);
        parcel.writeParcelable(this.debugInfo, i);
    }

    public /* synthetic */ NewsfeedItemDigestItemDto(InnerTypeDto innerTypeDto, NewsfeedItemWallpostDto newsfeedItemWallpostDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, Integer num, WallWallpostAttachmentDto wallWallpostAttachmentDto, StyleDto styleDto, String str3, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str4, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
        this(innerTypeDto, newsfeedItemWallpostDto, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : wallWallpostAttachmentDto, (i2 & 512) != 0 ? null : styleDto, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 8192) != 0 ? null : bool2, (i2 & 16384) != 0 ? null : str4, (32768 & i2) != 0 ? null : wallPostActivityDto, (65536 & i2) != 0 ? null : f, (131072 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (262144 & i2) != 0 ? null : bool3, (524288 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : newsfeedItemDebugInfoDto);
    }
}

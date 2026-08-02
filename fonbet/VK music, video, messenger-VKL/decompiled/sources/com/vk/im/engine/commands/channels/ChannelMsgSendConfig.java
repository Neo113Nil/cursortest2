package com.vk.im.engine.commands.channels;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import java.util.Date;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.bpn0;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.o6;
import xsna.pmi0;
import xsna.qnv;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelMsgSendConfig.kt */
/* loaded from: classes2.dex */
public final class ChannelMsgSendConfig implements Parcelable, qnv {
    public static final Parcelable.Creator<ChannelMsgSendConfig> CREATOR = new b();
    public static final bpn0 b = new bpn0(new o6(5));
    public static final ChannelMsgSendConfig c = new ChannelMsgSendConfig(null, false, false, false, false, null, null, null, false, null, false, false, false, false, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);

    @pmi0("author_sign")
    private final boolean authorSign;

    @pmi0("can_comment")
    private final boolean canComment;

    @pmi0("comments_enabled")
    private final boolean commentsEnabled;

    @pmi0("entrypoint")
    private final String entrypoint;

    @pmi0("is_add_advertising_ord")
    private final Boolean isAddAdvertisingOrd;

    @pmi0("is_donut_highlight")
    private final boolean isDonutHighlight;

    @pmi0("is_donut_photos")
    private final boolean isDonutPhotos;

    @pmi0("is_publish_to_story")
    private final boolean isPublishToStory;

    @pmi0("is_publish_to_story_highlight")
    private final boolean isPublishToStoryHighlight;

    @pmi0("only_visible_to_dons_duration")
    private final Integer onlyVisibleToDonsDuration;

    @pmi0("ord_erid")
    private final String ordErid;

    @pmi0("ord_external_id")
    private final String ordExternalId;

    @pmi0("publish_date")
    private final Date publishDate;

    @pmi0("send_notifications")
    private final boolean sendNotifications;

    @pmi0("try_postpone")
    private final boolean tryPostpone;

    /* compiled from: ChannelMsgSendConfig.kt */
    public static final class a {
        public static ChannelMsgSendConfig a(String str) {
            return str == null ? ChannelMsgSendConfig.c : (ChannelMsgSendConfig) ((Gson) ChannelMsgSendConfig.b.getValue()).fromJson(str, ChannelMsgSendConfig.class);
        }

        public static ChannelMsgSendConfig b() {
            return ChannelMsgSendConfig.c;
        }
    }

    /* compiled from: ChannelMsgSendConfig.kt */
    public static final class b implements Parcelable.Creator<ChannelMsgSendConfig> {
        @Override // android.os.Parcelable.Creator
        public final ChannelMsgSendConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Boolean bool;
            boolean z4;
            boolean z5;
            boolean z6;
            Boolean bool2;
            boolean z7;
            boolean z8;
            Date date = (Date) parcel.readSerializable();
            boolean z9 = false;
            boolean z10 = true;
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z9 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z10 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z12 = z3;
            String readString = parcel.readString();
            boolean z13 = z2;
            Integer num = valueOf;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = null;
                z4 = z13;
            } else {
                bool = null;
                z4 = z12;
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0 ? z13 : z12);
            }
            if (parcel.readInt() != 0) {
                z5 = z13;
            } else {
                z5 = z13;
                z13 = z12;
            }
            if (parcel.readInt() != 0) {
                z6 = z12;
                bool2 = bool;
                z7 = z5;
            } else {
                z6 = z12;
                bool2 = bool;
                z7 = z6;
            }
            if (parcel.readInt() != 0) {
                z8 = z5;
            } else {
                z8 = z5;
                z5 = z6;
            }
            if (parcel.readInt() != 0) {
                z6 = z8;
            }
            return new ChannelMsgSendConfig(date, z11, z9, z10, z, num, readString, readString2, z4, bool2, z13, z7, z5, z6, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelMsgSendConfig[] newArray(int i) {
            return new ChannelMsgSendConfig[i];
        }
    }

    public ChannelMsgSendConfig() {
        this(null, false, false, false, false, null, null, null, false, null, false, false, false, false, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
    }

    public static ChannelMsgSendConfig a(ChannelMsgSendConfig channelMsgSendConfig, Date date, boolean z, boolean z2, boolean z3, boolean z4, Integer num, String str, String str2, Boolean bool, boolean z5, boolean z6, boolean z7, boolean z8, String str3, int i) {
        Date date2 = (i & 1) != 0 ? channelMsgSendConfig.publishDate : date;
        boolean z9 = (i & 2) != 0 ? channelMsgSendConfig.commentsEnabled : z;
        boolean z10 = (i & 4) != 0 ? channelMsgSendConfig.canComment : z2;
        boolean z11 = (i & 8) != 0 ? channelMsgSendConfig.authorSign : z3;
        boolean z12 = (i & 16) != 0 ? channelMsgSendConfig.sendNotifications : z4;
        Integer num2 = (i & 32) != 0 ? channelMsgSendConfig.onlyVisibleToDonsDuration : num;
        String str4 = (i & 64) != 0 ? channelMsgSendConfig.ordErid : str;
        String str5 = (i & 128) != 0 ? channelMsgSendConfig.ordExternalId : str2;
        boolean z13 = (i & 256) != 0 ? channelMsgSendConfig.tryPostpone : true;
        Boolean bool2 = (i & 512) != 0 ? channelMsgSendConfig.isAddAdvertisingOrd : bool;
        boolean z14 = (i & 1024) != 0 ? channelMsgSendConfig.isDonutHighlight : z5;
        boolean z15 = (i & 2048) != 0 ? channelMsgSendConfig.isPublishToStory : z6;
        boolean z16 = (i & 4096) != 0 ? channelMsgSendConfig.isPublishToStoryHighlight : z7;
        boolean z17 = (i & 8192) != 0 ? channelMsgSendConfig.isDonutPhotos : z8;
        String str6 = (i & 16384) != 0 ? channelMsgSendConfig.entrypoint : str3;
        channelMsgSendConfig.getClass();
        return new ChannelMsgSendConfig(date2, z9, z10, z11, z12, num2, str4, str5, z13, bool2, z14, z15, z16, z17, str6);
    }

    public final boolean B() {
        return this.isDonutPhotos;
    }

    public final boolean C() {
        return this.isPublishToStory;
    }

    public final boolean D() {
        return this.isPublishToStoryHighlight;
    }

    public final String F() {
        return ((Gson) b.getValue()).toJson(this);
    }

    public final boolean c0() {
        return this.canComment;
    }

    public final boolean d() {
        return this.authorSign;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isPublishToStory && this.onlyVisibleToDonsDuration == null && !epx.f(this.isAddAdvertisingOrd, Boolean.TRUE) && this.publishDate == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelMsgSendConfig)) {
            return false;
        }
        ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) obj;
        return epx.f(this.publishDate, channelMsgSendConfig.publishDate) && this.commentsEnabled == channelMsgSendConfig.commentsEnabled && this.canComment == channelMsgSendConfig.canComment && this.authorSign == channelMsgSendConfig.authorSign && this.sendNotifications == channelMsgSendConfig.sendNotifications && epx.f(this.onlyVisibleToDonsDuration, channelMsgSendConfig.onlyVisibleToDonsDuration) && epx.f(this.ordErid, channelMsgSendConfig.ordErid) && epx.f(this.ordExternalId, channelMsgSendConfig.ordExternalId) && this.tryPostpone == channelMsgSendConfig.tryPostpone && epx.f(this.isAddAdvertisingOrd, channelMsgSendConfig.isAddAdvertisingOrd) && this.isDonutHighlight == channelMsgSendConfig.isDonutHighlight && this.isPublishToStory == channelMsgSendConfig.isPublishToStory && this.isPublishToStoryHighlight == channelMsgSendConfig.isPublishToStoryHighlight && this.isDonutPhotos == channelMsgSendConfig.isDonutPhotos && epx.f(this.entrypoint, channelMsgSendConfig.entrypoint);
    }

    public final boolean f() {
        return this.commentsEnabled;
    }

    public final String g() {
        return this.entrypoint;
    }

    public final int hashCode() {
        Date date = this.publishDate;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b((date == null ? 0 : date.hashCode()) * 31, 31, this.commentsEnabled), 31, this.canComment), 31, this.authorSign), 31, this.sendNotifications);
        Integer num = this.onlyVisibleToDonsDuration;
        int hashCode = (b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.ordErid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ordExternalId;
        int b3 = qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.tryPostpone);
        Boolean bool = this.isAddAdvertisingOrd;
        int b4 = qoy.b(qoy.b(qoy.b(qoy.b((b3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isDonutHighlight), 31, this.isPublishToStory), 31, this.isPublishToStoryHighlight), 31, this.isDonutPhotos);
        String str3 = this.entrypoint;
        return b4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Integer i() {
        return this.onlyVisibleToDonsDuration;
    }

    public final String j() {
        return this.ordErid;
    }

    public final String k() {
        return this.ordExternalId;
    }

    public final Date l() {
        return this.publishDate;
    }

    public final boolean n() {
        return this.sendNotifications;
    }

    public final boolean o() {
        return this.tryPostpone;
    }

    public final Boolean p() {
        return this.isAddAdvertisingOrd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgSendConfig(publishDate=");
        sb.append(this.publishDate);
        sb.append(", commentsEnabled=");
        sb.append(this.commentsEnabled);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", authorSign=");
        sb.append(this.authorSign);
        sb.append(", sendNotifications=");
        sb.append(this.sendNotifications);
        sb.append(", onlyVisibleToDonsDuration=");
        sb.append(this.onlyVisibleToDonsDuration);
        sb.append(", ordErid=");
        sb.append(this.ordErid);
        sb.append(", ordExternalId=");
        sb.append(this.ordExternalId);
        sb.append(", tryPostpone=");
        sb.append(this.tryPostpone);
        sb.append(", isAddAdvertisingOrd=");
        sb.append(this.isAddAdvertisingOrd);
        sb.append(", isDonutHighlight=");
        sb.append(this.isDonutHighlight);
        sb.append(", isPublishToStory=");
        sb.append(this.isPublishToStory);
        sb.append(", isPublishToStoryHighlight=");
        sb.append(this.isPublishToStoryHighlight);
        sb.append(", isDonutPhotos=");
        sb.append(this.isDonutPhotos);
        sb.append(", entrypoint=");
        return ho8.a(sb, this.entrypoint, ')');
    }

    public final boolean u() {
        return this.isDonutHighlight;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.publishDate);
        parcel.writeInt(this.commentsEnabled ? 1 : 0);
        parcel.writeInt(this.canComment ? 1 : 0);
        parcel.writeInt(this.authorSign ? 1 : 0);
        parcel.writeInt(this.sendNotifications ? 1 : 0);
        Integer num = this.onlyVisibleToDonsDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.ordErid);
        parcel.writeString(this.ordExternalId);
        parcel.writeInt(this.tryPostpone ? 1 : 0);
        Boolean bool = this.isAddAdvertisingOrd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeInt(this.isDonutHighlight ? 1 : 0);
        parcel.writeInt(this.isPublishToStory ? 1 : 0);
        parcel.writeInt(this.isPublishToStoryHighlight ? 1 : 0);
        parcel.writeInt(this.isDonutPhotos ? 1 : 0);
        parcel.writeString(this.entrypoint);
    }

    public ChannelMsgSendConfig(Date date, boolean z, boolean z2, boolean z3, boolean z4, Integer num, String str, String str2, boolean z5, Boolean bool, boolean z6, boolean z7, boolean z8, boolean z9, String str3) {
        this.publishDate = date;
        this.commentsEnabled = z;
        this.canComment = z2;
        this.authorSign = z3;
        this.sendNotifications = z4;
        this.onlyVisibleToDonsDuration = num;
        this.ordErid = str;
        this.ordExternalId = str2;
        this.tryPostpone = z5;
        this.isAddAdvertisingOrd = bool;
        this.isDonutHighlight = z6;
        this.isPublishToStory = z7;
        this.isPublishToStoryHighlight = z8;
        this.isDonutPhotos = z9;
        this.entrypoint = str3;
    }

    public /* synthetic */ ChannelMsgSendConfig(Date date, boolean z, boolean z2, boolean z3, boolean z4, Integer num, String str, String str2, boolean z5, Boolean bool, boolean z6, boolean z7, boolean z8, boolean z9, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? false : z6, (i & 2048) == 0 ? z7 : true, (i & 4096) != 0 ? false : z8, (i & 8192) == 0 ? z9 : false, (i & 16384) != 0 ? null : str3);
    }
}

package com.sofascore.model.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.dmi;
import defpackage.me4;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\n\u00108\u001a\u00020\u0003H\u0096\u0080\u0004J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u001bHÆ\u0003Jñ\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0006\u0010O\u001a\u00020\u0007J\u0014\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0083\u0004J\n\u0010T\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006Z"}, d2 = {"Lcom/sofascore/model/notifications/NotificationData;", "Landroid/os/Parcelable;", "title", "", PglCryptUtils.KEY_MESSAGE, "channel", "groupKey", "", "open", "Lcom/sofascore/model/notifications/NotificationOpen;", "id", "playerId", "uniqueId", "categoryId", "teamOfThePeriodId", "url", "icon", "sound", "teams", "", "forTeam", "updateableNotificationId", CampaignEx.JSON_KEY_STAR, "campaignId", "footer", "imageUrl", "endTimestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/sofascore/model/notifications/NotificationOpen;IIIIILjava/lang/String;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getChannel", "getGroupKey", "()I", "getOpen", "()Lcom/sofascore/model/notifications/NotificationOpen;", "getId", "getPlayerId", "getUniqueId", "getCategoryId", "getTeamOfThePeriodId", "getUrl", "getIcon", "getSound", "getTeams", "()Ljava/util/List;", "getForTeam", "getUpdateableNotificationId", "getRating", "getCampaignId", "getFooter", "getImageUrl", "getEndTimestamp", "()J", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "describeContents", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NotificationData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationData> CREATOR = new Creator();
    private final int campaignId;
    private final int categoryId;

    @NotNull
    private final String channel;
    private final long endTimestamp;

    @Nullable
    private final String footer;
    private final int forTeam;
    private final int groupKey;
    private final int icon;
    private final int id;

    @Nullable
    private final String imageUrl;

    @NotNull
    private final String message;

    @Nullable
    private final NotificationOpen open;
    private final int playerId;

    @Nullable
    private final String rating;

    @Nullable
    private final String sound;
    private final int teamOfThePeriodId;

    @Nullable
    private final List<Integer> teams;

    @NotNull
    private final String title;
    private final int uniqueId;

    @Nullable
    private final String updateableNotificationId;

    @Nullable
    private final String url;

    public /* synthetic */ NotificationData(String str, String str2, String str3, int i, NotificationOpen notificationOpen, int i2, int i3, int i4, int i5, int i6, String str4, int i7, String str5, List list, int i8, String str6, String str7, int i9, String str8, String str9, long j, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? 0 : i, (i10 & 16) != 0 ? null : notificationOpen, (i10 & 32) != 0 ? 0 : i2, (i10 & 64) != 0 ? 0 : i3, (i10 & 128) != 0 ? 0 : i4, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0 : i5, (i10 & 512) != 0 ? 0 : i6, (i10 & 1024) != 0 ? null : str4, (i10 & a.o) != 0 ? 0 : i7, (i10 & 4096) != 0 ? null : str5, (i10 & 8192) != 0 ? null : list, (i10 & 16384) != 0 ? 0 : i8, (32768 & i10) != 0 ? null : str6, (65536 & i10) != 0 ? null : str7, (131072 & i10) != 0 ? 0 : i9, (262144 & i10) != 0 ? null : str8, (524288 & i10) != 0 ? null : str9, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0L : j);
    }

    public static /* synthetic */ NotificationData copy$default(NotificationData notificationData, String str, String str2, String str3, int i, NotificationOpen notificationOpen, int i2, int i3, int i4, int i5, int i6, String str4, int i7, String str5, List list, int i8, String str6, String str7, int i9, String str8, String str9, long j, int i10, Object obj) {
        long j2;
        String str10;
        int i11;
        String str11 = (i10 & 1) != 0 ? notificationData.title : str;
        String str12 = (i10 & 2) != 0 ? notificationData.message : str2;
        String str13 = (i10 & 4) != 0 ? notificationData.channel : str3;
        int i12 = (i10 & 8) != 0 ? notificationData.groupKey : i;
        NotificationOpen notificationOpen2 = (i10 & 16) != 0 ? notificationData.open : notificationOpen;
        int i13 = (i10 & 32) != 0 ? notificationData.id : i2;
        int i14 = (i10 & 64) != 0 ? notificationData.playerId : i3;
        int i15 = (i10 & 128) != 0 ? notificationData.uniqueId : i4;
        int i16 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? notificationData.categoryId : i5;
        int i17 = (i10 & 512) != 0 ? notificationData.teamOfThePeriodId : i6;
        String str14 = (i10 & 1024) != 0 ? notificationData.url : str4;
        int i18 = (i10 & a.o) != 0 ? notificationData.icon : i7;
        String str15 = (i10 & 4096) != 0 ? notificationData.sound : str5;
        List list2 = (i10 & 8192) != 0 ? notificationData.teams : list;
        String str16 = str11;
        int i19 = (i10 & 16384) != 0 ? notificationData.forTeam : i8;
        String str17 = (i10 & 32768) != 0 ? notificationData.updateableNotificationId : str6;
        String str18 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? notificationData.rating : str7;
        int i20 = (i10 & 131072) != 0 ? notificationData.campaignId : i9;
        String str19 = (i10 & 262144) != 0 ? notificationData.footer : str8;
        String str20 = (i10 & 524288) != 0 ? notificationData.imageUrl : str9;
        if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            i11 = i19;
            str10 = str20;
            j2 = notificationData.endTimestamp;
        } else {
            j2 = j;
            str10 = str20;
            i11 = i19;
        }
        return notificationData.copy(str16, str12, str13, i12, notificationOpen2, i13, i14, i15, i16, i17, str14, i18, str15, list2, i11, str17, str18, i20, str19, str10, j2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTeamOfThePeriodId() {
        return this.teamOfThePeriodId;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component12, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    public final List<Integer> component14() {
        return this.teams;
    }

    /* renamed from: component15, reason: from getter */
    public final int getForTeam() {
        return this.forTeam;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getUpdateableNotificationId() {
        return this.updateableNotificationId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    /* renamed from: component18, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component21, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: component4, reason: from getter */
    public final int getGroupKey() {
        return this.groupKey;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final NotificationOpen getOpen() {
        return this.open;
    }

    /* renamed from: component6, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final NotificationData copy(@NotNull String title, @NotNull String message, @NotNull String channel, int groupKey, @Nullable NotificationOpen open, int id, int playerId, int uniqueId, int categoryId, int teamOfThePeriodId, @Nullable String url, int icon, @Nullable String sound, @Nullable List<Integer> teams, int forTeam, @Nullable String updateableNotificationId, @Nullable String rating, int campaignId, @Nullable String footer, @Nullable String imageUrl, long endTimestamp) {
        title.getClass();
        message.getClass();
        channel.getClass();
        return new NotificationData(title, message, channel, groupKey, open, id, playerId, uniqueId, categoryId, teamOfThePeriodId, url, icon, sound, teams, forTeam, updateableNotificationId, rating, campaignId, footer, imageUrl, endTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) other;
        return Intrinsics.c(this.title, notificationData.title) && Intrinsics.c(this.message, notificationData.message) && Intrinsics.c(this.channel, notificationData.channel) && this.groupKey == notificationData.groupKey && this.open == notificationData.open && this.id == notificationData.id && this.playerId == notificationData.playerId && this.uniqueId == notificationData.uniqueId && this.categoryId == notificationData.categoryId && this.teamOfThePeriodId == notificationData.teamOfThePeriodId && Intrinsics.c(this.url, notificationData.url) && this.icon == notificationData.icon && Intrinsics.c(this.sound, notificationData.sound) && Intrinsics.c(this.teams, notificationData.teams) && this.forTeam == notificationData.forTeam && Intrinsics.c(this.updateableNotificationId, notificationData.updateableNotificationId) && Intrinsics.c(this.rating, notificationData.rating) && this.campaignId == notificationData.campaignId && Intrinsics.c(this.footer, notificationData.footer) && Intrinsics.c(this.imageUrl, notificationData.imageUrl) && this.endTimestamp == notificationData.endTimestamp;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final String getFooter() {
        return this.footer;
    }

    public final int getForTeam() {
        return this.forTeam;
    }

    public final int getGroupKey() {
        return this.groupKey;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final NotificationOpen getOpen() {
        return this.open;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    @Nullable
    public final String getRating() {
        return this.rating;
    }

    @Nullable
    public final String getSound() {
        return this.sound;
    }

    public final int getTeamOfThePeriodId() {
        return this.teamOfThePeriodId;
    }

    @Nullable
    public final List<Integer> getTeams() {
        return this.teams;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    @Nullable
    public final String getUpdateableNotificationId() {
        return this.updateableNotificationId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int a = wv8.a(this.groupKey, dmi.c(dmi.c(this.title.hashCode() * 31, 31, this.message), 31, this.channel), 31);
        NotificationOpen notificationOpen = this.open;
        int a2 = wv8.a(this.teamOfThePeriodId, wv8.a(this.categoryId, wv8.a(this.uniqueId, wv8.a(this.playerId, wv8.a(this.id, (a + (notificationOpen == null ? 0 : notificationOpen.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str = this.url;
        int a3 = wv8.a(this.icon, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.sound;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.teams;
        int a4 = wv8.a(this.forTeam, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str3 = this.updateableNotificationId;
        int hashCode2 = (a4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rating;
        int a5 = wv8.a(this.campaignId, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.footer;
        int hashCode3 = (a5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageUrl;
        return Long.hashCode(this.endTimestamp) + ((hashCode3 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.groupKey;
        String str = this.title;
        String str2 = this.message;
        NotificationOpen notificationOpen = this.open;
        int i2 = this.id;
        String str3 = this.channel;
        StringBuilder t = dmi.t(i, "NotificationData(groupKey=", ", title=", str, "', message=");
        t.append(str2);
        t.append("', open=");
        t.append(notificationOpen);
        t.append(", id=");
        t.append(i2);
        t.append(", channel=");
        t.append(str3);
        t.append(")");
        return t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeString(this.channel);
        dest.writeInt(this.groupKey);
        NotificationOpen notificationOpen = this.open;
        if (notificationOpen == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(notificationOpen.name());
        }
        dest.writeInt(this.id);
        dest.writeInt(this.playerId);
        dest.writeInt(this.uniqueId);
        dest.writeInt(this.categoryId);
        dest.writeInt(this.teamOfThePeriodId);
        dest.writeString(this.url);
        dest.writeInt(this.icon);
        dest.writeString(this.sound);
        List<Integer> list = this.teams;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                dest.writeInt(it.next().intValue());
            }
        }
        dest.writeInt(this.forTeam);
        dest.writeString(this.updateableNotificationId);
        dest.writeString(this.rating);
        dest.writeInt(this.campaignId);
        dest.writeString(this.footer);
        dest.writeString(this.imageUrl);
        dest.writeLong(this.endTimestamp);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            NotificationOpen valueOf = parcel.readInt() == 0 ? null : NotificationOpen.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            String readString4 = parcel.readString();
            int readInt7 = parcel.readInt();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList = new ArrayList(readInt8);
                int i = 0;
                while (i != readInt8) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    i++;
                    valueOf = valueOf;
                }
            }
            return new NotificationData(readString, readString2, readString3, readInt, valueOf, readInt2, readInt3, readInt4, readInt5, readInt6, readString4, readInt7, readString5, arrayList, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationData[] newArray(int i) {
            return new NotificationData[i];
        }
    }

    public NotificationData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @Nullable NotificationOpen notificationOpen, int i2, int i3, int i4, int i5, int i6, @Nullable String str4, int i7, @Nullable String str5, @Nullable List<Integer> list, int i8, @Nullable String str6, @Nullable String str7, int i9, @Nullable String str8, @Nullable String str9, long j) {
        me4.p(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.channel = str3;
        this.groupKey = i;
        this.open = notificationOpen;
        this.id = i2;
        this.playerId = i3;
        this.uniqueId = i4;
        this.categoryId = i5;
        this.teamOfThePeriodId = i6;
        this.url = str4;
        this.icon = i7;
        this.sound = str5;
        this.teams = list;
        this.forTeam = i8;
        this.updateableNotificationId = str6;
        this.rating = str7;
        this.campaignId = i9;
        this.footer = str8;
        this.imageUrl = str9;
        this.endTimestamp = j;
    }
}

package com.vk.superapp.vkclient.js.bridge.api.events;

import com.google.gson.JsonParseException;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.a9y;
import xsna.ad6;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.ho8;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowWallPostBox.kt */
/* loaded from: classes6.dex */
public final class ShowWallPostBox$Parameters implements ad6 {

    @pmi0("attachments")
    private final String attachments;

    @pmi0("close_comments")
    private final Boolean closeComments;

    @pmi0("copyright")
    private final String copyright;

    @pmi0("donut_paid_duration")
    private final DonutPaidDuration donutPaidDuration;

    @pmi0("friends_only")
    private final Boolean friendsOnly;

    @pmi0("from_group")
    private final Boolean fromGroup;

    @pmi0("guid")
    private final String guid;

    @pmi0(O6.s)
    private final Float lat;

    @pmi0("link_button")
    private final String linkButton;

    @pmi0("link_image")
    private final String linkImage;

    @pmi0("link_title")
    private final String linkTitle;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final Float f45long;

    @pmi0("mark_as_ads")
    private final Boolean markAsAds;

    @pmi0("message")
    private final String message;

    @pmi0("mute_notifications")
    private final Boolean muteNotifications;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("place_id")
    private final Integer placeId;

    @pmi0("post_id")
    private final Integer postId;

    @pmi0("publish_date")
    private final Float publishDate;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("services")
    private final String services;

    @pmi0("signed")
    private final Boolean signed;

    @pmi0("upload_attachments")
    private final List<UploadAttachments> uploadAttachments;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowWallPostBox.kt */
    public static final class DonutPaidDuration {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DonutPaidDuration[] $VALUES;
        public static final DonutPaidDuration FIVEDAYS;
        public static final DonutPaidDuration FOURDAYS;
        public static final DonutPaidDuration ONEDAY;
        public static final DonutPaidDuration SEVENDAYS;
        public static final DonutPaidDuration SIXDAYS;
        public static final DonutPaidDuration THREEDAYS;
        public static final DonutPaidDuration TWODAYS;
        public static final DonutPaidDuration UNLIMITED;
        private final int value;

        /* compiled from: ShowWallPostBox.kt */
        public static final class Serializer implements uay<DonutPaidDuration>, a9y<DonutPaidDuration> {
            @Override // xsna.a9y
            public final Object a(b9y b9yVar, z8y z8yVar) {
                DonutPaidDuration donutPaidDuration;
                DonutPaidDuration[] values = DonutPaidDuration.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        donutPaidDuration = null;
                        break;
                    }
                    donutPaidDuration = values[i];
                    if (epx.f(String.valueOf(donutPaidDuration.value), b9yVar.i().k())) {
                        break;
                    }
                    i++;
                }
                if (donutPaidDuration != null) {
                    return donutPaidDuration;
                }
                throw new JsonParseException(String.valueOf(b9yVar));
            }

            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((DonutPaidDuration) obj).value));
            }
        }

        static {
            DonutPaidDuration donutPaidDuration = new DonutPaidDuration("UNLIMITED", 0, -1);
            UNLIMITED = donutPaidDuration;
            DonutPaidDuration donutPaidDuration2 = new DonutPaidDuration("ONEDAY", 1, 86400);
            ONEDAY = donutPaidDuration2;
            DonutPaidDuration donutPaidDuration3 = new DonutPaidDuration("TWODAYS", 2, 172800);
            TWODAYS = donutPaidDuration3;
            DonutPaidDuration donutPaidDuration4 = new DonutPaidDuration("THREEDAYS", 3, 259200);
            THREEDAYS = donutPaidDuration4;
            DonutPaidDuration donutPaidDuration5 = new DonutPaidDuration("FOURDAYS", 4, 345600);
            FOURDAYS = donutPaidDuration5;
            DonutPaidDuration donutPaidDuration6 = new DonutPaidDuration("FIVEDAYS", 5, 432000);
            FIVEDAYS = donutPaidDuration6;
            DonutPaidDuration donutPaidDuration7 = new DonutPaidDuration("SIXDAYS", 6, 518400);
            SIXDAYS = donutPaidDuration7;
            DonutPaidDuration donutPaidDuration8 = new DonutPaidDuration("SEVENDAYS", 7, 604800);
            SEVENDAYS = donutPaidDuration8;
            DonutPaidDuration[] donutPaidDurationArr = {donutPaidDuration, donutPaidDuration2, donutPaidDuration3, donutPaidDuration4, donutPaidDuration5, donutPaidDuration6, donutPaidDuration7, donutPaidDuration8};
            $VALUES = donutPaidDurationArr;
            $ENTRIES = new asp(donutPaidDurationArr);
        }

        public DonutPaidDuration(String str, int i, int i2) {
            this.value = i2;
        }

        public static DonutPaidDuration valueOf(String str) {
            return (DonutPaidDuration) Enum.valueOf(DonutPaidDuration.class, str);
        }

        public static DonutPaidDuration[] values() {
            return (DonutPaidDuration[]) $VALUES.clone();
        }
    }

    /* compiled from: ShowWallPostBox.kt */
    public static final class UploadAttachments {

        @pmi0("link")
        private final String link;

        @pmi0("type")
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShowWallPostBox.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @pmi0("photo")
            public static final Type PHOTO;

            static {
                Type type = new Type("PHOTO", 0);
                PHOTO = type;
                Type[] typeArr = {type};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            private Type(String str, int i) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public UploadAttachments(Type type, String str) {
            this.type = type;
            this.link = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadAttachments)) {
                return false;
            }
            UploadAttachments uploadAttachments = (UploadAttachments) obj;
            return this.type == uploadAttachments.type && epx.f(this.link, uploadAttachments.link);
        }

        public final int hashCode() {
            return this.link.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UploadAttachments(type=");
            sb.append(this.type);
            sb.append(", link=");
            return ho8.a(sb, this.link, ')');
        }
    }

    public ShowWallPostBox$Parameters(String str, Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Float f, String str3, String str4, List<UploadAttachments> list, Boolean bool6, Float f2, Float f3, Integer num, String str5, String str6, String str7, String str8, String str9, Integer num2, DonutPaidDuration donutPaidDuration) {
        this.requestId = str;
        this.ownerId = l;
        this.friendsOnly = bool;
        this.fromGroup = bool2;
        this.closeComments = bool3;
        this.muteNotifications = bool4;
        this.markAsAds = bool5;
        this.message = str2;
        this.publishDate = f;
        this.copyright = str3;
        this.attachments = str4;
        this.uploadAttachments = list;
        this.signed = bool6;
        this.lat = f2;
        this.f45long = f3;
        this.placeId = num;
        this.guid = str5;
        this.linkTitle = str6;
        this.linkImage = str7;
        this.linkButton = str8;
        this.services = str9;
        this.postId = num2;
        this.donutPaidDuration = donutPaidDuration;
    }

    public static final ShowWallPostBox$Parameters a(ShowWallPostBox$Parameters showWallPostBox$Parameters) {
        return showWallPostBox$Parameters.requestId == null ? new ShowWallPostBox$Parameters("default_request_id", showWallPostBox$Parameters.ownerId, showWallPostBox$Parameters.friendsOnly, showWallPostBox$Parameters.fromGroup, showWallPostBox$Parameters.closeComments, showWallPostBox$Parameters.muteNotifications, showWallPostBox$Parameters.markAsAds, showWallPostBox$Parameters.message, showWallPostBox$Parameters.publishDate, showWallPostBox$Parameters.copyright, showWallPostBox$Parameters.attachments, showWallPostBox$Parameters.uploadAttachments, showWallPostBox$Parameters.signed, showWallPostBox$Parameters.lat, showWallPostBox$Parameters.f45long, showWallPostBox$Parameters.placeId, showWallPostBox$Parameters.guid, showWallPostBox$Parameters.linkTitle, showWallPostBox$Parameters.linkImage, showWallPostBox$Parameters.linkButton, showWallPostBox$Parameters.services, showWallPostBox$Parameters.postId, showWallPostBox$Parameters.donutPaidDuration) : showWallPostBox$Parameters;
    }

    public static final void b(ShowWallPostBox$Parameters showWallPostBox$Parameters) {
        Integer num = showWallPostBox$Parameters.placeId;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Value placeId cannot be less than 0");
        }
    }

    public static final void c(ShowWallPostBox$Parameters showWallPostBox$Parameters) {
        if (showWallPostBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String d() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowWallPostBox$Parameters)) {
            return false;
        }
        ShowWallPostBox$Parameters showWallPostBox$Parameters = (ShowWallPostBox$Parameters) obj;
        return epx.f(this.requestId, showWallPostBox$Parameters.requestId) && epx.f(this.ownerId, showWallPostBox$Parameters.ownerId) && epx.f(this.friendsOnly, showWallPostBox$Parameters.friendsOnly) && epx.f(this.fromGroup, showWallPostBox$Parameters.fromGroup) && epx.f(this.closeComments, showWallPostBox$Parameters.closeComments) && epx.f(this.muteNotifications, showWallPostBox$Parameters.muteNotifications) && epx.f(this.markAsAds, showWallPostBox$Parameters.markAsAds) && epx.f(this.message, showWallPostBox$Parameters.message) && epx.f(this.publishDate, showWallPostBox$Parameters.publishDate) && epx.f(this.copyright, showWallPostBox$Parameters.copyright) && epx.f(this.attachments, showWallPostBox$Parameters.attachments) && epx.f(this.uploadAttachments, showWallPostBox$Parameters.uploadAttachments) && epx.f(this.signed, showWallPostBox$Parameters.signed) && epx.f(this.lat, showWallPostBox$Parameters.lat) && epx.f(this.f45long, showWallPostBox$Parameters.f45long) && epx.f(this.placeId, showWallPostBox$Parameters.placeId) && epx.f(this.guid, showWallPostBox$Parameters.guid) && epx.f(this.linkTitle, showWallPostBox$Parameters.linkTitle) && epx.f(this.linkImage, showWallPostBox$Parameters.linkImage) && epx.f(this.linkButton, showWallPostBox$Parameters.linkButton) && epx.f(this.services, showWallPostBox$Parameters.services) && epx.f(this.postId, showWallPostBox$Parameters.postId) && this.donutPaidDuration == showWallPostBox$Parameters.donutPaidDuration;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.friendsOnly;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.fromGroup;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.closeComments;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.muteNotifications;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.markAsAds;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.message;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.publishDate;
        int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.copyright;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.attachments;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<UploadAttachments> list = this.uploadAttachments;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool6 = this.signed;
        int hashCode13 = (hashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Float f2 = this.lat;
        int hashCode14 = (hashCode13 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f45long;
        int hashCode15 = (hashCode14 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num = this.placeId;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.guid;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkTitle;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.linkImage;
        int hashCode19 = (hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.linkButton;
        int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.services;
        int hashCode21 = (hashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.postId;
        int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DonutPaidDuration donutPaidDuration = this.donutPaidDuration;
        return hashCode22 + (donutPaidDuration != null ? donutPaidDuration.hashCode() : 0);
    }

    public final String toString() {
        return "Parameters(requestId=" + this.requestId + ", ownerId=" + this.ownerId + ", friendsOnly=" + this.friendsOnly + ", fromGroup=" + this.fromGroup + ", closeComments=" + this.closeComments + ", muteNotifications=" + this.muteNotifications + ", markAsAds=" + this.markAsAds + ", message=" + this.message + ", publishDate=" + this.publishDate + ", copyright=" + this.copyright + ", attachments=" + this.attachments + ", uploadAttachments=" + this.uploadAttachments + ", signed=" + this.signed + ", lat=" + this.lat + ", long=" + this.f45long + ", placeId=" + this.placeId + ", guid=" + this.guid + ", linkTitle=" + this.linkTitle + ", linkImage=" + this.linkImage + ", linkButton=" + this.linkButton + ", services=" + this.services + ", postId=" + this.postId + ", donutPaidDuration=" + this.donutPaidDuration + ')';
    }

    public /* synthetic */ ShowWallPostBox$Parameters(String str, Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, Float f, String str3, String str4, List list, Boolean bool6, Float f2, Float f3, Integer num, String str5, String str6, String str7, String str8, String str9, Integer num2, DonutPaidDuration donutPaidDuration, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : bool6, (i & 8192) != 0 ? null : f2, (i & 16384) != 0 ? null : f3, (i & 32768) != 0 ? null : num, (i & 65536) != 0 ? null : str5, (i & 131072) != 0 ? null : str6, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str7, (i & 524288) != 0 ? null : str8, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str9, (i & 2097152) != 0 ? null : num2, (i & 4194304) != 0 ? null : donutPaidDuration);
    }
}

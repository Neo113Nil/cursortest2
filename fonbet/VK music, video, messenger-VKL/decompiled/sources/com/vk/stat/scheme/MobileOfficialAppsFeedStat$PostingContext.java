package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingContext {
    public final transient String a;

    @pmi0("creation_entry_point")
    private final CreationEntryPoint creationEntryPoint;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("is_editing")
    private final Boolean isEditing;

    @pmi0("post_type")
    private final PostType postType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class CreationEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CreationEntryPoint[] $VALUES;

        @pmi0("channel_write_bar_button")
        public static final CreationEntryPoint CHANNEL_WRITE_BAR_BUTTON;

        @pmi0("feed_plus_button")
        public static final CreationEntryPoint FEED_PLUS_BUTTON;

        @pmi0("group_wall_button")
        public static final CreationEntryPoint GROUP_WALL_BUTTON;

        @pmi0("other")
        public static final CreationEntryPoint OTHER;

        @pmi0("post_three_dot_menu_edit_item")
        public static final CreationEntryPoint POST_THREE_DOT_MENU_EDIT_ITEM;

        @pmi0("profile_plus_button")
        public static final CreationEntryPoint PROFILE_PLUS_BUTTON;

        @pmi0("profile_wall_button")
        public static final CreationEntryPoint PROFILE_WALL_BUTTON;

        @pmi0("text_live_button")
        public static final CreationEntryPoint TEXT_LIVE_BUTTON;

        static {
            CreationEntryPoint creationEntryPoint = new CreationEntryPoint("FEED_PLUS_BUTTON", 0);
            FEED_PLUS_BUTTON = creationEntryPoint;
            CreationEntryPoint creationEntryPoint2 = new CreationEntryPoint("GROUP_WALL_BUTTON", 1);
            GROUP_WALL_BUTTON = creationEntryPoint2;
            CreationEntryPoint creationEntryPoint3 = new CreationEntryPoint("PROFILE_PLUS_BUTTON", 2);
            PROFILE_PLUS_BUTTON = creationEntryPoint3;
            CreationEntryPoint creationEntryPoint4 = new CreationEntryPoint("PROFILE_WALL_BUTTON", 3);
            PROFILE_WALL_BUTTON = creationEntryPoint4;
            CreationEntryPoint creationEntryPoint5 = new CreationEntryPoint("CHANNEL_WRITE_BAR_BUTTON", 4);
            CHANNEL_WRITE_BAR_BUTTON = creationEntryPoint5;
            CreationEntryPoint creationEntryPoint6 = new CreationEntryPoint("POST_THREE_DOT_MENU_EDIT_ITEM", 5);
            POST_THREE_DOT_MENU_EDIT_ITEM = creationEntryPoint6;
            CreationEntryPoint creationEntryPoint7 = new CreationEntryPoint("TEXT_LIVE_BUTTON", 6);
            TEXT_LIVE_BUTTON = creationEntryPoint7;
            CreationEntryPoint creationEntryPoint8 = new CreationEntryPoint(NativeAdContent.ViewTag.OTHER, 7);
            OTHER = creationEntryPoint8;
            CreationEntryPoint[] creationEntryPointArr = {creationEntryPoint, creationEntryPoint2, creationEntryPoint3, creationEntryPoint4, creationEntryPoint5, creationEntryPoint6, creationEntryPoint7, creationEntryPoint8};
            $VALUES = creationEntryPointArr;
            $ENTRIES = new asp(creationEntryPointArr);
        }

        private CreationEntryPoint(String str, int i) {
        }

        public static CreationEntryPoint valueOf(String str) {
            return (CreationEntryPoint) Enum.valueOf(CreationEntryPoint.class, str);
        }

        public static CreationEntryPoint[] values() {
            return (CreationEntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$PostingContext>, a9y<MobileOfficialAppsFeedStat$PostingContext> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            PostType postType = (PostType) dq.f(x9yVar, "post_type", tru.a(), PostType.class);
            Boolean y = fai.y(x9yVar, "is_editing");
            Gson a = tru.a();
            b9y q = x9yVar.q("creation_entry_point");
            return new MobileOfficialAppsFeedStat$PostingContext(postType, y, (CreationEntryPoint) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CreationEntryPoint.class)), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$PostingContext mobileOfficialAppsFeedStat$PostingContext = (MobileOfficialAppsFeedStat$PostingContext) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("post_type", tru.a().toJson(mobileOfficialAppsFeedStat$PostingContext.b()));
            x9yVar.m(mobileOfficialAppsFeedStat$PostingContext.c(), "is_editing");
            x9yVar.o("creation_entry_point", tru.a().toJson(mobileOfficialAppsFeedStat$PostingContext.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$PostingContext.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PostType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PostType[] $VALUES;

        @pmi0("comment")
        public static final PostType COMMENT;

        @pmi0("comment_board")
        public static final PostType COMMENT_BOARD;

        @pmi0("comment_market")
        public static final PostType COMMENT_MARKET;

        @pmi0("edit")
        public static final PostType EDIT;

        @pmi0("postponed")
        public static final PostType POSTPONED;

        @pmi0("post_donut")
        public static final PostType POST_DONUT;

        @pmi0("post_text_live")
        public static final PostType POST_TEXT_LIVE;

        @pmi0("regular")
        public static final PostType REGULAR;

        @pmi0("suggested")
        public static final PostType SUGGESTED;

        static {
            PostType postType = new PostType("REGULAR", 0);
            REGULAR = postType;
            PostType postType2 = new PostType("POSTPONED", 1);
            POSTPONED = postType2;
            PostType postType3 = new PostType("SUGGESTED", 2);
            SUGGESTED = postType3;
            PostType postType4 = new PostType("POST_TEXT_LIVE", 3);
            POST_TEXT_LIVE = postType4;
            PostType postType5 = new PostType("POST_DONUT", 4);
            POST_DONUT = postType5;
            PostType postType6 = new PostType("EDIT", 5);
            EDIT = postType6;
            PostType postType7 = new PostType("COMMENT", 6);
            COMMENT = postType7;
            PostType postType8 = new PostType("COMMENT_BOARD", 7);
            COMMENT_BOARD = postType8;
            PostType postType9 = new PostType("COMMENT_MARKET", 8);
            COMMENT_MARKET = postType9;
            PostType[] postTypeArr = {postType, postType2, postType3, postType4, postType5, postType6, postType7, postType8, postType9};
            $VALUES = postTypeArr;
            $ENTRIES = new asp(postTypeArr);
        }

        private PostType(String str, int i) {
        }

        public static PostType valueOf(String str) {
            return (PostType) Enum.valueOf(PostType.class, str);
        }

        public static PostType[] values() {
            return (PostType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$PostingContext(PostType postType, Boolean bool, CreationEntryPoint creationEntryPoint, String str) {
        this.postType = postType;
        this.isEditing = bool;
        this.creationEntryPoint = creationEntryPoint;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final CreationEntryPoint a() {
        return this.creationEntryPoint;
    }

    public final PostType b() {
        return this.postType;
    }

    public final Boolean c() {
        return this.isEditing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingContext)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingContext mobileOfficialAppsFeedStat$PostingContext = (MobileOfficialAppsFeedStat$PostingContext) obj;
        return this.postType == mobileOfficialAppsFeedStat$PostingContext.postType && epx.f(this.isEditing, mobileOfficialAppsFeedStat$PostingContext.isEditing) && this.creationEntryPoint == mobileOfficialAppsFeedStat$PostingContext.creationEntryPoint && epx.f(this.a, mobileOfficialAppsFeedStat$PostingContext.a);
    }

    public final int hashCode() {
        int hashCode = this.postType.hashCode() * 31;
        Boolean bool = this.isEditing;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CreationEntryPoint creationEntryPoint = this.creationEntryPoint;
        int hashCode3 = (hashCode2 + (creationEntryPoint == null ? 0 : creationEntryPoint.hashCode())) * 31;
        String str = this.a;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingContext(postType=");
        sb.append(this.postType);
        sb.append(", isEditing=");
        sb.append(this.isEditing);
        sb.append(", creationEntryPoint=");
        sb.append(this.creationEntryPoint);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingContext(PostType postType, Boolean bool, CreationEntryPoint creationEntryPoint, String str, int i, zcl zclVar) {
        this(postType, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : creationEntryPoint, (i & 8) != 0 ? null : str);
    }
}

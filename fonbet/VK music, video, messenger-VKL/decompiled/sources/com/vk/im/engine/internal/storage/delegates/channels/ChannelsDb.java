package com.vk.im.engine.internal.storage.delegates.channels;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.channels.api.ChannelFilter;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import io.requery.android.database.sqlite.SQLiteStatement;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.aeb;
import xsna.asp;
import xsna.bdb;
import xsna.bo;
import xsna.fl3;
import xsna.gkx0;
import xsna.qgl0;
import xsna.rdi;
import xsna.sgl0;
import xsna.sr;
import xsna.tgl0;
import xsna.vcb;
import xsna.zrp;

/* compiled from: ChannelsDb.kt */
/* loaded from: classes2.dex */
public final class ChannelsDb {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column ACTION_IN_PROGRESS;
        public static final Column ADMIN_LEVEL;
        public static final Column AVATAR;
        public static final Column BAN_COMMENT;
        public static final Column BAN_END_DATE;
        public static final Column BAN_REASON;
        public static final Column CAN_COMMENT;
        public static final Column CAN_POST;
        public static final Column CAN_POST_DONUT;
        public static final Column COUNT_POSTPONED;
        public static final Column COUNT_UNREAD;
        public static final Column COUNT_UNREAD_LOCAL;
        public static final Column ID;
        public static final Column IS_ADULT;
        public static final Column IS_ARCHIVED;
        public static final Column IS_HIDDEN_IN_ALL_FOLDER;
        public static final Column IS_MEMBER;
        public static final Column IS_OWNER;
        public static final Column IS_SUGGESTED;
        public static final Column LAST_HISTORY_EXPIRED_TIME;
        public static final Column LAST_MSG_CNV_ID;
        public static final Column MEMBERS_COUNT;
        public static final Column NOTIFICATIONS_DISABLED_UNTIL;
        public static final Column NOTIFICATIONS_DISABLED_UNTIL_LOCAL;
        public static final Column NOTIFICATIONS_IS_ENABLED;
        public static final Column NOTIFICATIONS_IS_ENABLED_LOCAL;
        public static final Column PAID_REACTIONS_ENABLED;
        public static final Column PAID_REACTION_COST;
        public static final Column PARENT_ID;
        public static final Column PHASE;
        public static final Column PINNED_MSGS_PHASE;
        public static final Column READ_TILL_IN_MSG_CNV_ID;
        public static final Column READ_TILL_IN_MSG_CNV_ID_LOCAL;
        public static final Column SORT_ID_LOCAL;
        public static final Column SORT_ID_SERVER;
        public static final Column TITLE;
        public static final Column TYPE;
        public static final Column WEIGHT;
        private final String key;

        static {
            Column column = new Column("ID", 0, "id");
            ID = column;
            Column column2 = new Column("AVATAR", 1, "avatar");
            AVATAR = column2;
            Column column3 = new Column(NativeAdContent.ViewTag.AD_TITLE, 2, "title");
            TITLE = column3;
            Column column4 = new Column("LAST_MSG_CNV_ID", 3, "last_msg_cnv_id");
            LAST_MSG_CNV_ID = column4;
            Column column5 = new Column("READ_TILL_IN_MSG_CNV_ID", 4, "read_till_in_msg_cnv_id");
            READ_TILL_IN_MSG_CNV_ID = column5;
            Column column6 = new Column("READ_TILL_IN_MSG_CNV_ID_LOCAL", 5, "read_till_in_msg_cnv_id_local");
            READ_TILL_IN_MSG_CNV_ID_LOCAL = column6;
            Column column7 = new Column("COUNT_UNREAD", 6, "count_unread");
            COUNT_UNREAD = column7;
            Column column8 = new Column("COUNT_UNREAD_LOCAL", 7, "count_unread_local");
            COUNT_UNREAD_LOCAL = column8;
            Column column9 = new Column("COUNT_POSTPONED", 8, "count_postponed");
            COUNT_POSTPONED = column9;
            Column column10 = new Column("SORT_ID_SERVER", 9, "sort_id_server");
            SORT_ID_SERVER = column10;
            Column column11 = new Column("SORT_ID_LOCAL", 10, "sort_id_local");
            SORT_ID_LOCAL = column11;
            Column column12 = new Column("WEIGHT", 11, "weight");
            WEIGHT = column12;
            Column column13 = new Column("IS_ARCHIVED", 12, "is_archived");
            IS_ARCHIVED = column13;
            Column column14 = new Column("IS_MEMBER", 13, "is_member");
            IS_MEMBER = column14;
            Column column15 = new Column("IS_OWNER", 14, "is_owner");
            IS_OWNER = column15;
            Column column16 = new Column("NOTIFICATIONS_IS_ENABLED", 15, "notif_is_enabled");
            NOTIFICATIONS_IS_ENABLED = column16;
            Column column17 = new Column("NOTIFICATIONS_IS_ENABLED_LOCAL", 16, "notif_is_enabled_local");
            NOTIFICATIONS_IS_ENABLED_LOCAL = column17;
            Column column18 = new Column("NOTIFICATIONS_DISABLED_UNTIL", 17, "notif_disabled_until");
            NOTIFICATIONS_DISABLED_UNTIL = column18;
            Column column19 = new Column("NOTIFICATIONS_DISABLED_UNTIL_LOCAL", 18, "notif_disabled_until_local");
            NOTIFICATIONS_DISABLED_UNTIL_LOCAL = column19;
            Column column20 = new Column("PHASE", 19, "phase");
            PHASE = column20;
            Column column21 = new Column("PINNED_MSGS_PHASE", 20, "pinned_msgs_phase");
            PINNED_MSGS_PHASE = column21;
            Column column22 = new Column("ACTION_IN_PROGRESS", 21, "action_in_progress");
            ACTION_IN_PROGRESS = column22;
            Column column23 = new Column("LAST_HISTORY_EXPIRED_TIME", 22, "last_history_expired_time");
            LAST_HISTORY_EXPIRED_TIME = column23;
            Column column24 = new Column(CredentialProviderBaseController.TYPE_TAG, 23, "type");
            TYPE = column24;
            Column column25 = new Column("PARENT_ID", 24, "parent_id");
            PARENT_ID = column25;
            Column column26 = new Column("BAN_COMMENT", 25, "ban_comment");
            BAN_COMMENT = column26;
            Column column27 = new Column("BAN_END_DATE", 26, "ban_end_date");
            BAN_END_DATE = column27;
            Column column28 = new Column("BAN_REASON", 27, "ban_reason");
            BAN_REASON = column28;
            Column column29 = new Column("IS_SUGGESTED", 28, "is_suggested");
            IS_SUGGESTED = column29;
            Column column30 = new Column("MEMBERS_COUNT", 29, "members_count");
            MEMBERS_COUNT = column30;
            Column column31 = new Column("CAN_COMMENT", 30, "can_comment");
            CAN_COMMENT = column31;
            Column column32 = new Column("CAN_POST", 31, "can_post");
            CAN_POST = column32;
            Column column33 = new Column("ADMIN_LEVEL", 32, "admin_level");
            ADMIN_LEVEL = column33;
            Column column34 = new Column("IS_ADULT", 33, "is_adult");
            IS_ADULT = column34;
            Column column35 = new Column("IS_HIDDEN_IN_ALL_FOLDER", 34, "is_hidden_in_all_folder");
            IS_HIDDEN_IN_ALL_FOLDER = column35;
            Column column36 = new Column("CAN_POST_DONUT", 35, "can_post_donut");
            CAN_POST_DONUT = column36;
            Column column37 = new Column("PAID_REACTIONS_ENABLED", 36, "paid_reactions_enabled");
            PAID_REACTIONS_ENABLED = column37;
            Column column38 = new Column("PAID_REACTION_COST", 37, "paid_reaction_cost");
            PAID_REACTION_COST = column38;
            Column[] columnArr = {column, column2, column3, column4, column5, column6, column7, column8, column9, column10, column11, column12, column13, column14, column15, column16, column17, column18, column19, column20, column21, column22, column23, column24, column25, column26, column27, column28, column29, column30, column31, column32, column33, column34, column35, column36, column37, column38};
            $VALUES = columnArr;
            $ENTRIES = new asp(columnArr);
        }

        public Column(String str, int i, String str2) {
            this.key = str2;
        }

        public static Column valueOf(String str) {
            return (Column) Enum.valueOf(Column.class, str);
        }

        public static Column[] values() {
            return (Column[]) $VALUES.clone();
        }

        @Override // xsna.qgl0
        public final String getKey() {
            return this.key;
        }

        public final int h() {
            return ordinal() + 1;
        }
    }

    /* compiled from: ChannelsDb.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelFilter.values().length];
            try {
                iArr[ChannelFilter.SUGGESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelFilter.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelFilter.ARCHIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChannelsDb() {
        throw null;
    }

    public ChannelsDb(tgl0 tgl0Var) {
        this.a = new sgl0(RTCStatsConstants.KEY_CHANNELS, Column.class);
        this.b = tgl0Var;
    }

    public static void a(SQLiteStatement sQLiteStatement, bdb bdbVar) {
        ChannelBanInfo.Reason reason;
        int h = Column.ID.h();
        long j = bdbVar.b;
        ChannelBanInfo channelBanInfo = bdbVar.x;
        sQLiteStatement.bindLong(h, j);
        sQLiteStatement.bindString(Column.TITLE.h(), bdbVar.B);
        sQLiteStatement.bindString(Column.AVATAR.h(), bdbVar.C);
        sQLiteStatement.bindLong(Column.LAST_MSG_CNV_ID.h(), bdbVar.c);
        sQLiteStatement.bindLong(Column.READ_TILL_IN_MSG_CNV_ID.h(), bdbVar.d);
        sQLiteStatement.bindLong(Column.READ_TILL_IN_MSG_CNV_ID_LOCAL.h(), bdbVar.e);
        sQLiteStatement.bindLong(Column.COUNT_UNREAD.h(), bdbVar.f);
        sQLiteStatement.bindLong(Column.COUNT_UNREAD_LOCAL.h(), bdbVar.g);
        sQLiteStatement.bindLong(Column.COUNT_POSTPONED.h(), bdbVar.h);
        sQLiteStatement.bindLong(Column.SORT_ID_SERVER.h(), bdbVar.i.b.a());
        sQLiteStatement.bindLong(Column.WEIGHT.h(), bdbVar.k.b.b);
        rdi.i(sQLiteStatement, Column.IS_ARCHIVED.h(), bdbVar.l);
        rdi.i(sQLiteStatement, Column.IS_HIDDEN_IN_ALL_FOLDER.h(), bdbVar.G);
        rdi.i(sQLiteStatement, Column.IS_MEMBER.h(), bdbVar.m);
        rdi.i(sQLiteStatement, Column.IS_SUGGESTED.h(), bdbVar.n);
        rdi.i(sQLiteStatement, Column.IS_OWNER.h(), bdbVar.o);
        int h2 = Column.NOTIFICATIONS_IS_ENABLED.h();
        ChannelNotificationsSettings channelNotificationsSettings = bdbVar.p;
        rdi.i(sQLiteStatement, h2, channelNotificationsSettings.b);
        int h3 = Column.NOTIFICATIONS_IS_ENABLED_LOCAL.h();
        ChannelNotificationsSettings channelNotificationsSettings2 = bdbVar.q;
        rdi.j(sQLiteStatement, h3, channelNotificationsSettings2 != null ? Boolean.valueOf(channelNotificationsSettings2.b) : null);
        sQLiteStatement.bindLong(Column.NOTIFICATIONS_DISABLED_UNTIL.h(), channelNotificationsSettings.c);
        rdi.l(sQLiteStatement, Column.NOTIFICATIONS_DISABLED_UNTIL_LOCAL.h(), channelNotificationsSettings2 != null ? Long.valueOf(channelNotificationsSettings2.c) : null);
        sQLiteStatement.bindLong(Column.PHASE.h(), bdbVar.r);
        sQLiteStatement.bindLong(Column.PINNED_MSGS_PHASE.h(), bdbVar.s);
        sQLiteStatement.bindLong(Column.ACTION_IN_PROGRESS.h(), bdbVar.t.i());
        rdi.l(sQLiteStatement, Column.LAST_HISTORY_EXPIRED_TIME.h(), bdbVar.u);
        int h4 = Column.TYPE.h();
        ChannelType channelType = bdbVar.v;
        rdi.m(sQLiteStatement, h4, channelType != null ? channelType.i() : null);
        rdi.l(sQLiteStatement, Column.PARENT_ID.h(), bdbVar.w);
        rdi.m(sQLiteStatement, Column.BAN_COMMENT.h(), channelBanInfo != null ? channelBanInfo.b : null);
        rdi.k(sQLiteStatement, Column.BAN_END_DATE.h(), channelBanInfo != null ? Integer.valueOf(channelBanInfo.c) : null);
        rdi.k(sQLiteStatement, Column.BAN_REASON.h(), (channelBanInfo == null || (reason = channelBanInfo.d) == null) ? null : Integer.valueOf(reason.i()));
        rdi.k(sQLiteStatement, Column.MEMBERS_COUNT.h(), bdbVar.y);
        rdi.j(sQLiteStatement, Column.CAN_COMMENT.h(), bdbVar.z);
        rdi.j(sQLiteStatement, Column.CAN_POST.h(), bdbVar.D);
        int h5 = Column.ADMIN_LEVEL.h();
        AdminLevel adminLevel = bdbVar.E;
        rdi.k(sQLiteStatement, h5, adminLevel != null ? Integer.valueOf(adminLevel.h()) : null);
        rdi.i(sQLiteStatement, Column.IS_ADULT.h(), bdbVar.F);
        rdi.i(sQLiteStatement, Column.CAN_POST_DONUT.h(), bdbVar.H);
        rdi.i(sQLiteStatement, Column.PAID_REACTIONS_ENABLED.h(), bdbVar.I);
        sQLiteStatement.bindLong(Column.PAID_REACTION_COST.h(), bdbVar.J);
    }

    public static bdb c(Cursor cursor) {
        ChannelNotificationsSettings channelNotificationsSettings;
        ChannelNotificationsSettings channelNotificationsSettings2;
        ChannelNotificationsSettings channelNotificationsSettings3;
        ChannelBanInfo channelBanInfo;
        AdminLevel adminLevel;
        long C = fl3.C(cursor, Column.ID.getKey());
        String E = fl3.E(cursor, Column.TITLE.getKey());
        String E2 = fl3.E(cursor, Column.AVATAR.getKey());
        int A = fl3.A(cursor, Column.LAST_MSG_CNV_ID.getKey());
        int A2 = fl3.A(cursor, Column.READ_TILL_IN_MSG_CNV_ID.getKey());
        int A3 = fl3.A(cursor, Column.READ_TILL_IN_MSG_CNV_ID_LOCAL.getKey());
        int A4 = fl3.A(cursor, Column.COUNT_UNREAD.getKey());
        int A5 = fl3.A(cursor, Column.COUNT_UNREAD_LOCAL.getKey());
        int A6 = fl3.A(cursor, Column.COUNT_POSTPONED.getKey());
        vcb vcbVar = new vcb(fl3.C(cursor, Column.SORT_ID_SERVER.getKey()), C);
        Long D = fl3.D(cursor, Column.SORT_ID_LOCAL.getKey());
        vcb vcbVar2 = D != null ? new vcb(D.longValue(), C) : null;
        aeb aebVar = new aeb(new gkx0(fl3.C(cursor, Column.WEIGHT.getKey())), C);
        boolean x = fl3.x(cursor, Column.IS_ARCHIVED.getKey());
        boolean x2 = fl3.x(cursor, Column.IS_MEMBER.getKey());
        boolean x3 = fl3.x(cursor, Column.IS_SUGGESTED.getKey());
        boolean x4 = fl3.x(cursor, Column.IS_OWNER.getKey());
        ChannelNotificationsSettings channelNotificationsSettings4 = new ChannelNotificationsSettings(fl3.x(cursor, Column.NOTIFICATIONS_IS_ENABLED.getKey()), fl3.C(cursor, Column.NOTIFICATIONS_DISABLED_UNTIL.getKey()));
        Column column = Column.NOTIFICATIONS_IS_ENABLED_LOCAL;
        Column column2 = Column.NOTIFICATIONS_DISABLED_UNTIL_LOCAL;
        if (fl3.H(cursor, column.getKey()) || fl3.H(cursor, column2.getKey())) {
            channelNotificationsSettings = channelNotificationsSettings4;
            channelNotificationsSettings2 = null;
        } else {
            channelNotificationsSettings = channelNotificationsSettings4;
            channelNotificationsSettings2 = new ChannelNotificationsSettings(fl3.x(cursor, column.getKey()), fl3.C(cursor, column2.getKey()));
        }
        int A7 = fl3.A(cursor, Column.PHASE.getKey());
        int A8 = fl3.A(cursor, Column.PINNED_MSGS_PHASE.getKey());
        ChannelActionInProgress.a aVar = ChannelActionInProgress.Companion;
        int A9 = fl3.A(cursor, Column.ACTION_IN_PROGRESS.getKey());
        aVar.getClass();
        ChannelActionInProgress a2 = ChannelActionInProgress.a.a(A9);
        Long D2 = fl3.D(cursor, Column.LAST_HISTORY_EXPIRED_TIME.getKey());
        ChannelType.a aVar2 = ChannelType.Companion;
        String F = fl3.F(cursor, Column.TYPE.getKey());
        aVar2.getClass();
        ChannelType a3 = ChannelType.a.a(F);
        Long D3 = fl3.D(cursor, Column.PARENT_ID.getKey());
        String F2 = fl3.F(cursor, Column.BAN_COMMENT.getKey());
        Integer B = fl3.B(cursor, Column.BAN_END_DATE.getKey());
        int intValue = B != null ? B.intValue() : 0;
        Integer B2 = fl3.B(cursor, Column.BAN_REASON.getKey());
        if (B2 != null) {
            int intValue2 = B2.intValue();
            ChannelBanInfo.Reason.a aVar3 = ChannelBanInfo.Reason.Companion;
            Integer valueOf = Integer.valueOf(intValue2);
            aVar3.getClass();
            channelNotificationsSettings3 = channelNotificationsSettings2;
            channelBanInfo = new ChannelBanInfo(F2, intValue, ChannelBanInfo.Reason.a.a(valueOf));
        } else {
            channelNotificationsSettings3 = channelNotificationsSettings2;
            channelBanInfo = null;
        }
        Integer B3 = fl3.B(cursor, Column.MEMBERS_COUNT.getKey());
        Boolean y = fl3.y(cursor, Column.CAN_COMMENT.getKey());
        Boolean y2 = fl3.y(cursor, Column.CAN_POST.getKey());
        Integer B4 = fl3.B(cursor, Column.ADMIN_LEVEL.getKey());
        if (B4 != null) {
            int intValue3 = B4.intValue();
            AdminLevel.a aVar4 = AdminLevel.Companion;
            Integer valueOf2 = Integer.valueOf(intValue3);
            aVar4.getClass();
            adminLevel = AdminLevel.a.a(valueOf2);
        } else {
            adminLevel = null;
        }
        boolean x5 = fl3.x(cursor, Column.IS_ADULT.getKey());
        boolean x6 = fl3.x(cursor, Column.IS_HIDDEN_IN_ALL_FOLDER.getKey());
        boolean x7 = fl3.x(cursor, Column.CAN_POST_DONUT.getKey());
        Boolean y3 = fl3.y(cursor, Column.PAID_REACTIONS_ENABLED.getKey());
        boolean booleanValue = y3 != null ? y3.booleanValue() : false;
        Integer B5 = fl3.B(cursor, Column.PAID_REACTION_COST.getKey());
        return new bdb(C, A, A2, A3, A4, A5, A6, vcbVar, vcbVar2, aebVar, x, x2, x3, x4, channelNotificationsSettings, channelNotificationsSettings3, A7, A8, a2, D2, a3, D3, channelBanInfo, B3, y, null, E, E2, y2, adminLevel, x5, x6, x7, booleanValue, B5 != null ? B5.intValue() : 0);
    }

    public final void b(int i, int i2, long j) {
        StringBuilder sb = new StringBuilder("\n            UPDATE ");
        sb.append(this.a.a);
        sb.append("\n            SET ");
        sr.c(Column.READ_TILL_IN_MSG_CNV_ID_LOCAL, sb, " = ?, ");
        sr.c(Column.COUNT_UNREAD_LOCAL, sb, " = ? \n            WHERE ");
        this.b.b().execSQL(bo.d(Column.ID, sb, " = ?\n            "), new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)});
    }

    public final void d(long j, vcb vcbVar) {
        StringBuilder sb = new StringBuilder("\n            UPDATE ");
        sb.append(this.a.a);
        sb.append(" \n            SET ");
        sr.c(Column.SORT_ID_LOCAL, sb, " = ? \n            WHERE ");
        this.b.b().execSQL(bo.d(Column.ID, sb, " = ?\n            "), new Long[]{Long.valueOf(vcbVar.b.a()), Long.valueOf(j)});
    }

    public final void e(long j, vcb vcbVar) {
        StringBuilder sb = new StringBuilder("\n            UPDATE ");
        sb.append(this.a.a);
        sb.append(" \n            SET ");
        sr.c(Column.SORT_ID_SERVER, sb, " = ? \n            WHERE ");
        this.b.b().execSQL(bo.d(Column.ID, sb, " = ?\n            "), new Long[]{Long.valueOf(vcbVar.b.a()), Long.valueOf(j)});
    }
}

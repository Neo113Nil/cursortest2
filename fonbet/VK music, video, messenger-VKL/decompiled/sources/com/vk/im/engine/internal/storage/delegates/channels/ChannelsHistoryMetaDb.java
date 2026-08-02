package com.vk.im.engine.internal.storage.delegates.channels;

import android.database.Cursor;
import com.vk.channels.api.ChannelFilter;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.asp;
import xsna.fl3;
import xsna.qgl0;
import xsna.rdi;
import xsna.sgl0;
import xsna.tgl0;
import xsna.vcb;
import xsna.wfb;
import xsna.zrp;

/* compiled from: ChannelsHistoryMetaDb.kt */
/* loaded from: classes2.dex */
public final class ChannelsHistoryMetaDb {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsHistoryMetaDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column FILTER_ID;
        public static final Column FULLY_FETCHED;
        public static final Column OLDEST_SORT_CHANNEL_ID;
        public static final Column OLDEST_SORT_ID;
        public static final Column PHASE_ID;
        private final String key;

        static {
            Column column = new Column("FILTER_ID", 0, "filter_id");
            FILTER_ID = column;
            Column column2 = new Column("OLDEST_SORT_ID", 1, "oldest_sort_id");
            OLDEST_SORT_ID = column2;
            Column column3 = new Column("OLDEST_SORT_CHANNEL_ID", 2, "oldest_sort_channel_id");
            OLDEST_SORT_CHANNEL_ID = column3;
            Column column4 = new Column("FULLY_FETCHED", 3, "fully_fetched");
            FULLY_FETCHED = column4;
            Column column5 = new Column("PHASE_ID", 4, "phase_id");
            PHASE_ID = column5;
            Column[] columnArr = {column, column2, column3, column4, column5};
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
    }

    public ChannelsHistoryMetaDb() {
        throw null;
    }

    public ChannelsHistoryMetaDb(tgl0 tgl0Var) {
        this.a = new sgl0("channels_history_meta", Column.class);
        this.b = tgl0Var;
    }

    public static void a(SQLiteStatement sQLiteStatement, wfb wfbVar) {
        sQLiteStatement.bindLong(Column.FILTER_ID.ordinal() + 1, wfbVar.a.i());
        int ordinal = Column.OLDEST_SORT_ID.ordinal() + 1;
        vcb vcbVar = wfbVar.b;
        sQLiteStatement.bindLong(ordinal, vcbVar.b.a());
        sQLiteStatement.bindLong(Column.OLDEST_SORT_CHANNEL_ID.ordinal() + 1, vcbVar.c);
        rdi.i(sQLiteStatement, Column.FULLY_FETCHED.ordinal() + 1, wfbVar.c);
        sQLiteStatement.bindLong(Column.PHASE_ID.ordinal() + 1, wfbVar.d);
    }

    public static wfb b(Cursor cursor) {
        ChannelFilter.a aVar = ChannelFilter.Companion;
        int A = fl3.A(cursor, Column.FILTER_ID.getKey());
        aVar.getClass();
        return new wfb(ChannelFilter.a.a(A), new vcb(fl3.C(cursor, Column.OLDEST_SORT_ID.getKey()), fl3.C(cursor, Column.OLDEST_SORT_CHANNEL_ID.getKey())), fl3.x(cursor, Column.FULLY_FETCHED.getKey()), fl3.A(cursor, Column.PHASE_ID.getKey()));
    }
}

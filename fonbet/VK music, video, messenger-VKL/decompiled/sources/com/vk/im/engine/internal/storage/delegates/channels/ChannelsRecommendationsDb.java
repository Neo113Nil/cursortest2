package com.vk.im.engine.internal.storage.delegates.channels;

import android.database.Cursor;
import com.vk.im.engine.internal.storage.structure.Table;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.asp;
import xsna.fl3;
import xsna.gbb;
import xsna.qgl0;
import xsna.rdi;
import xsna.sgl0;
import xsna.tgl0;
import xsna.zrp;

/* compiled from: ChannelsRecommendationsDb.kt */
/* loaded from: classes2.dex */
public final class ChannelsRecommendationsDb {
    public final /* synthetic */ sgl0 a = new sgl0(Table.CHANNELS_RECOMMENDATIONS.i(), Column.class);
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsRecommendationsDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column AVATAR;
        public static final Column ID;
        public static final Column LAST_UPDATED_MILLIS;
        public static final Column NAME;
        public static final Column PARENT_ID;
        public static final Column TRACK_CODE;
        private final String key;

        static {
            Column column = new Column("ID", 0, "id");
            ID = column;
            Column column2 = new Column("LAST_UPDATED_MILLIS", 1, "last_updated_millis");
            LAST_UPDATED_MILLIS = column2;
            Column column3 = new Column("PARENT_ID", 2, "parent_id");
            PARENT_ID = column3;
            Column column4 = new Column("TRACK_CODE", 3, "track_code");
            TRACK_CODE = column4;
            Column column5 = new Column("AVATAR", 4, "avatar");
            AVATAR = column5;
            Column column6 = new Column("NAME", 5, "name");
            NAME = column6;
            Column[] columnArr = {column, column2, column3, column4, column5, column6};
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

    public ChannelsRecommendationsDb(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    public static void a(SQLiteStatement sQLiteStatement, gbb gbbVar) {
        sQLiteStatement.bindLong(Column.ID.h(), gbbVar.b);
        sQLiteStatement.bindLong(Column.LAST_UPDATED_MILLIS.h(), gbbVar.c);
        rdi.l(sQLiteStatement, Column.PARENT_ID.h(), gbbVar.d);
        rdi.m(sQLiteStatement, Column.TRACK_CODE.h(), gbbVar.e);
        sQLiteStatement.bindString(Column.AVATAR.h(), gbbVar.f);
        sQLiteStatement.bindString(Column.NAME.h(), gbbVar.g);
    }

    public static gbb b(Cursor cursor) {
        long C = fl3.C(cursor, Column.ID.getKey());
        long C2 = fl3.C(cursor, Column.LAST_UPDATED_MILLIS.getKey());
        Long D = fl3.D(cursor, Column.PARENT_ID.getKey());
        String F = fl3.F(cursor, Column.TRACK_CODE.getKey());
        String F2 = fl3.F(cursor, Column.AVATAR.getKey());
        if (F2 == null) {
            F2 = "";
        }
        String F3 = fl3.F(cursor, Column.NAME.getKey());
        return new gbb(C, C2, D, F, F2, F3 != null ? F3 : "");
    }
}

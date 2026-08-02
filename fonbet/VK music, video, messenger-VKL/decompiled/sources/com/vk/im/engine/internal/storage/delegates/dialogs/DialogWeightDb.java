package com.vk.im.engine.internal.storage.delegates.dialogs;

import com.vk.movika.sdk.base.observable.u;
import xsna.asp;
import xsna.j5g;
import xsna.p60;
import xsna.qgl0;
import xsna.sgl0;
import xsna.tgl0;
import xsna.zrp;

/* compiled from: DialogWeightDb.kt */
/* loaded from: classes2.dex */
public final class DialogWeightDb {
    public final /* synthetic */ sgl0 a = new sgl0("dialog_weight", Column.class);
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogWeightDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column DIALOG_ID;
        public static final Column FOLDER_ID;
        public static final Column SORT_ID_LOCAL;
        public static final Column SORT_ID_SERVER;
        public static final Column WEIGHT;
        private final String key;

        static {
            Column column = new Column("DIALOG_ID", 0, "x_dialog_id");
            DIALOG_ID = column;
            Column column2 = new Column("FOLDER_ID", 1, "x_folder_id");
            FOLDER_ID = column2;
            Column column3 = new Column("SORT_ID_SERVER", 2, "x_sort_id_server");
            SORT_ID_SERVER = column3;
            Column column4 = new Column("SORT_ID_LOCAL", 3, "x_sort_id_local");
            SORT_ID_LOCAL = column4;
            Column column5 = new Column("WEIGHT", 4, "x_weight");
            WEIGHT = column5;
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

    public DialogWeightDb(tgl0 tgl0Var) {
        this.b = tgl0Var;
        Column column = Column.WEIGHT;
        a(column, true);
        a(column, false);
        Column column2 = Column.SORT_ID_SERVER;
        a(column2, true);
        a(column2, false);
        Column column3 = Column.SORT_ID_LOCAL;
        a(column3, true);
        a(column3, false);
    }

    public final void a(Column column, boolean z) {
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(this.a.a);
        sb.append(" SET ");
        column.getKey();
        Column.DIALOG_ID.getKey();
        if (z) {
            Column.FOLDER_ID.getKey();
        }
    }

    public final void b(Iterable<Integer> iterable) {
        String g0 = j5g.g0(iterable, null, "(", ")", 0, new u(21), 25);
        this.b.b().execSQL("DELETE FROM " + this.a.a + " WHERE " + Column.FOLDER_ID.getKey() + " IN " + g0);
    }

    public final void c(Iterable iterable, int i) {
        String g0 = j5g.g0(iterable, null, "(", ")", 0, new p60(21), 25);
        this.b.b().execSQL("DELETE FROM " + this.a.a + " WHERE " + Column.FOLDER_ID.getKey() + " = " + i + " AND " + Column.DIALOG_ID.getKey() + " IN " + g0);
    }
}

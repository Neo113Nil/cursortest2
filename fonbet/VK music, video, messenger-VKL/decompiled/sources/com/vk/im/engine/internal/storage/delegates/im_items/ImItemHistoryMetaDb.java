package com.vk.im.engine.internal.storage.delegates.im_items;

import com.vk.im.engine.internal.storage.structure.Table;
import xsna.asp;
import xsna.qgl0;
import xsna.sgl0;
import xsna.tgl0;
import xsna.zrp;

/* compiled from: ImItemHistoryMetaDb.kt */
/* loaded from: classes2.dex */
public final class ImItemHistoryMetaDb {
    public final /* synthetic */ sgl0 a = new sgl0(Table.IM_ITEM_HISTORY_META.i(), Column.class);
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImItemHistoryMetaDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column CHANNELS_PHASE;
        public static final Column DIALOGS_PHASE;
        public static final Column FOLDER_ID;
        public static final Column HAS_CHANNELS_ERROR;
        public static final Column HAS_DIALOGS_ERROR;
        public static final Column HISTORY_FULL;
        public static final Column MIN_CHANNELS_WEIGHT;
        public static final Column MIN_DIALOGS_WEIGHT;
        private final String key;

        static {
            Column column = new Column("FOLDER_ID", 0, "folder_id");
            FOLDER_ID = column;
            Column column2 = new Column("MIN_DIALOGS_WEIGHT", 1, "min_dialogs_weight");
            MIN_DIALOGS_WEIGHT = column2;
            Column column3 = new Column("MIN_CHANNELS_WEIGHT", 2, "min_channels_weight");
            MIN_CHANNELS_WEIGHT = column3;
            Column column4 = new Column("DIALOGS_PHASE", 3, "dialogs_phase");
            DIALOGS_PHASE = column4;
            Column column5 = new Column("CHANNELS_PHASE", 4, "channels_phase");
            CHANNELS_PHASE = column5;
            Column column6 = new Column("HISTORY_FULL", 5, "history_full");
            HISTORY_FULL = column6;
            Column column7 = new Column("HAS_DIALOGS_ERROR", 6, "has_dialogs_error");
            HAS_DIALOGS_ERROR = column7;
            Column column8 = new Column("HAS_CHANNELS_ERROR", 7, "has_channels_error");
            HAS_CHANNELS_ERROR = column8;
            Column[] columnArr = {column, column2, column3, column4, column5, column6, column7, column8};
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

    public ImItemHistoryMetaDb(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }
}

package com.vk.im.engine.internal.storage.delegates.dialogs;

import xsna.asp;
import xsna.qgl0;
import xsna.sgl0;
import xsna.tgl0;
import xsna.zrp;

/* compiled from: DialogTagsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class DialogTagsStorageManagerImpl {
    public final /* synthetic */ sgl0 a = new sgl0("dialogs_tags", Column.class);
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DialogTagsStorageManagerImpl.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column COLOR;
        public static final Column ID;
        public static final Column NAME;
        private final String key;

        static {
            Column column = new Column("ID", 0, "id");
            ID = column;
            Column column2 = new Column("NAME", 1, "name");
            NAME = column2;
            Column column3 = new Column("COLOR", 2, "color");
            COLOR = column3;
            Column[] columnArr = {column, column2, column3};
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

    public DialogTagsStorageManagerImpl(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }
}

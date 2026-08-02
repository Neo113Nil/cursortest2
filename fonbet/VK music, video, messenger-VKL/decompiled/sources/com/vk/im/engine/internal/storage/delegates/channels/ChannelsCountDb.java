package com.vk.im.engine.internal.storage.delegates.channels;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import xsna.asp;
import xsna.qgl0;
import xsna.sgl0;
import xsna.tgl0;
import xsna.zrp;

/* compiled from: ChannelsCountDb.kt */
/* loaded from: classes2.dex */
public final class ChannelsCountDb {
    public final /* synthetic */ sgl0 a;
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelsCountDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column COUNT;
        public static final Column PHASE_ID;
        public static final Column TYPE;
        private final String key;

        static {
            Column column = new Column(CredentialProviderBaseController.TYPE_TAG, 0, "type");
            TYPE = column;
            Column column2 = new Column("COUNT", 1, "count");
            COUNT = column2;
            Column column3 = new Column("PHASE_ID", 2, "phase_id");
            PHASE_ID = column3;
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

    public ChannelsCountDb() {
        throw null;
    }

    public ChannelsCountDb(tgl0 tgl0Var) {
        this.a = new sgl0("channels_history_count", Column.class);
        this.b = tgl0Var;
    }
}

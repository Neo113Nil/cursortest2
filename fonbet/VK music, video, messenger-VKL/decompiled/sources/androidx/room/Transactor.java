package androidx.room;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asp;
import xsna.nvb0;
import xsna.wzs;
import xsna.zrp;

/* compiled from: Transactor.kt */
/* loaded from: classes.dex */
public interface Transactor extends nvb0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Transactor.kt */
    public static final class SQLiteTransactionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SQLiteTransactionType[] $VALUES;
        public static final SQLiteTransactionType DEFERRED;
        public static final SQLiteTransactionType EXCLUSIVE;
        public static final SQLiteTransactionType IMMEDIATE;

        static {
            SQLiteTransactionType sQLiteTransactionType = new SQLiteTransactionType("DEFERRED", 0);
            DEFERRED = sQLiteTransactionType;
            SQLiteTransactionType sQLiteTransactionType2 = new SQLiteTransactionType("IMMEDIATE", 1);
            IMMEDIATE = sQLiteTransactionType2;
            SQLiteTransactionType sQLiteTransactionType3 = new SQLiteTransactionType("EXCLUSIVE", 2);
            EXCLUSIVE = sQLiteTransactionType3;
            SQLiteTransactionType[] sQLiteTransactionTypeArr = {sQLiteTransactionType, sQLiteTransactionType2, sQLiteTransactionType3};
            $VALUES = sQLiteTransactionTypeArr;
            $ENTRIES = new asp(sQLiteTransactionTypeArr);
        }

        public SQLiteTransactionType() {
            throw null;
        }

        public static SQLiteTransactionType valueOf(String str) {
            return (SQLiteTransactionType) Enum.valueOf(SQLiteTransactionType.class, str);
        }

        public static SQLiteTransactionType[] values() {
            return (SQLiteTransactionType[]) $VALUES.clone();
        }
    }

    Object c(SuspendLambda suspendLambda);

    Object d(SQLiteTransactionType sQLiteTransactionType, wzs wzsVar, SuspendLambda suspendLambda);
}

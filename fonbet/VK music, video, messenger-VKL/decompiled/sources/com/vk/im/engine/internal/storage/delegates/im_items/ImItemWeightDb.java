package com.vk.im.engine.internal.storage.delegates.im_items;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.internal.storage.structure.Table;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.DraftMsg;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Triple;
import xsna.asp;
import xsna.b5w;
import xsna.fl3;
import xsna.qgl0;
import xsna.sgl0;
import xsna.tgl0;
import xsna.v7w;
import xsna.x7w;
import xsna.zrp;

/* compiled from: ImItemWeightDb.kt */
/* loaded from: classes2.dex */
public final class ImItemWeightDb {
    public final /* synthetic */ sgl0 a = new sgl0(Table.IM_ITEM_WEIGHT.i(), Column.class);
    public final tgl0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImItemWeightDb.kt */
    public static final class Column implements qgl0 {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Column[] $VALUES;
        public static final Column ID;
        public static final Column TYPE;
        public static final Column WEIGHT;
        private final String key;

        static {
            Column column = new Column("ID", 0, "id");
            ID = column;
            Column column2 = new Column(CredentialProviderBaseController.TYPE_TAG, 1, "type");
            TYPE = column2;
            Column column3 = new Column("WEIGHT", 2, "weight");
            WEIGHT = column3;
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

    /* compiled from: ImItemWeightDb.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImItemType.values().length];
            try {
                iArr[ImItemType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImItemType.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImItemWeightDb(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    public static b5w a(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow(Column.ID.getKey()));
        ImItemType.a aVar = ImItemType.Companion;
        int i = cursor.getInt(cursor.getColumnIndexOrThrow(Column.TYPE.getKey()));
        aVar.getClass();
        return new b5w(j, ImItemType.a.a(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v7w b(Cursor cursor) {
        Object failure;
        Triple triple;
        byte[] blob;
        boolean z;
        int i = cursor.getInt(1);
        ImItemType.Companion.getClass();
        ImItemType a2 = ImItemType.a.a(i);
        int i2 = a.$EnumSwitchMapping$0[a2.ordinal()];
        if (i2 == 1) {
            int i3 = cursor.getInt(3);
            boolean w = fl3.w(cursor, 4);
            try {
                blob = cursor.isNull(5) ? null : cursor.getBlob(5);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (blob != null) {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                DraftMsg draftMsg = (DraftMsg) Serializer.b.a(blob, DraftMsg.class.getClassLoader());
                if (draftMsg != null) {
                    z = draftMsg.d();
                    failure = Boolean.valueOf(z);
                    Object obj = Boolean.FALSE;
                    if (failure instanceof Result.Failure) {
                        failure = obj;
                    }
                    triple = new Triple(Integer.valueOf(i3), Boolean.valueOf(w), (Boolean) failure);
                }
            }
            z = false;
            failure = Boolean.valueOf(z);
            Object obj2 = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
            }
            triple = new Triple(Integer.valueOf(i3), Boolean.valueOf(w), (Boolean) failure);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            triple = new Triple(Integer.valueOf(cursor.getInt(6)), Boolean.valueOf(fl3.w(cursor, 7)), Boolean.FALSE);
        }
        int intValue = ((Number) triple.d()).intValue();
        boolean booleanValue = ((Boolean) triple.g()).booleanValue();
        boolean booleanValue2 = ((Boolean) triple.h()).booleanValue();
        b5w b5wVar = new b5w(cursor.getLong(0), a2);
        x7w x7wVar = x7w.f;
        return new v7w(b5wVar, x7w.a.a(cursor.getBlob(2)), booleanValue, booleanValue2, intValue);
    }
}

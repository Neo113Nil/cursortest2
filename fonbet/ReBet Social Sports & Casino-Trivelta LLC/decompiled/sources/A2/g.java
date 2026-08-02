package A2;

import A2.f;
import android.database.Cursor;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {
    public static final Map a(E2.g gVar, String str) {
        Cursor p12 = gVar.p1("PRAGMA table_info(`" + str + "`)");
        try {
            if (p12.getColumnCount() <= 0) {
                Map emptyMap = MapsKt.emptyMap();
                CloseableKt.closeFinally(p12, null);
                return emptyMap;
            }
            int columnIndex = p12.getColumnIndex("name");
            int columnIndex2 = p12.getColumnIndex("type");
            int columnIndex3 = p12.getColumnIndex("notnull");
            int columnIndex4 = p12.getColumnIndex("pk");
            int columnIndex5 = p12.getColumnIndex("dflt_value");
            Map createMapBuilder = MapsKt.createMapBuilder();
            while (p12.moveToNext()) {
                String name = p12.getString(columnIndex);
                String type = p12.getString(columnIndex2);
                boolean z10 = p12.getInt(columnIndex3) != 0;
                int i10 = p12.getInt(columnIndex4);
                String string = p12.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                createMapBuilder.put(name, new f.a(name, type, z10, i10, string, 2));
            }
            Map build = MapsKt.build(createMapBuilder);
            CloseableKt.closeFinally(p12, null);
            return build;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(p12, th2);
                throw th3;
            }
        }
    }

    public static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(StackTraceHelper.ID_KEY);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List createListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new f.d(i10, i11, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(createListBuilder));
    }

    public static final Set c(E2.g gVar, String str) {
        Cursor p12 = gVar.p1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = p12.getColumnIndex(StackTraceHelper.ID_KEY);
            int columnIndex2 = p12.getColumnIndex("seq");
            int columnIndex3 = p12.getColumnIndex("table");
            int columnIndex4 = p12.getColumnIndex("on_delete");
            int columnIndex5 = p12.getColumnIndex("on_update");
            List b10 = b(p12);
            p12.moveToPosition(-1);
            Set createSetBuilder = SetsKt.createSetBuilder();
            while (p12.moveToNext()) {
                if (p12.getInt(columnIndex2) == 0) {
                    int i10 = p12.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<f.d> arrayList3 = new ArrayList();
                    for (Object obj : b10) {
                        if (((f.d) obj).c() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (f.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = p12.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = p12.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = p12.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    createSetBuilder.add(new f.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set build = SetsKt.build(createSetBuilder);
            CloseableKt.closeFinally(p12, null);
            return build;
        } finally {
        }
    }

    public static final f.e d(E2.g gVar, String str, boolean z10) {
        Cursor p12 = gVar.p1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = p12.getColumnIndex("seqno");
            int columnIndex2 = p12.getColumnIndex("cid");
            int columnIndex3 = p12.getColumnIndex("name");
            int columnIndex4 = p12.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (p12.moveToNext()) {
                    if (p12.getInt(columnIndex2) >= 0) {
                        int i10 = p12.getInt(columnIndex);
                        String columnName = p12.getString(columnIndex3);
                        String str2 = p12.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i10);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List list = CollectionsKt.toList(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                f.e eVar = new f.e(str, z10, list, CollectionsKt.toList(values2));
                CloseableKt.closeFinally(p12, null);
                return eVar;
            }
            CloseableKt.closeFinally(p12, null);
            return null;
        } finally {
        }
    }

    public static final Set e(E2.g gVar, String str) {
        Cursor p12 = gVar.p1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = p12.getColumnIndex("name");
            int columnIndex2 = p12.getColumnIndex("origin");
            int columnIndex3 = p12.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                while (p12.moveToNext()) {
                    if (Intrinsics.areEqual("c", p12.getString(columnIndex2))) {
                        String name = p12.getString(columnIndex);
                        boolean z10 = true;
                        if (p12.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        f.e d10 = d(gVar, name, z10);
                        if (d10 == null) {
                            CloseableKt.closeFinally(p12, null);
                            return null;
                        }
                        createSetBuilder.add(d10);
                    }
                }
                Set build = SetsKt.build(createSetBuilder);
                CloseableKt.closeFinally(p12, null);
                return build;
            }
            CloseableKt.closeFinally(p12, null);
            return null;
        } finally {
        }
    }

    public static final f f(E2.g database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new f(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}

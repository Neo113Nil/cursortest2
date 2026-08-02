package com.bytedance.sdk.openadsdk.gbb.pcc.pcc;

import android.content.ContentValues;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private static volatile sf pcc;
    private final WeakReference<ConcurrentHashMap<String, of>> sf = new WeakReference<>(new ConcurrentHashMap());

    private sf() {
    }

    private void gm(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList arrayList = new ArrayList();
            if (pccVar.moveToFirst()) {
                do {
                    arrayList.add(pccVar.getString(0));
                } while (pccVar.moveToNext());
            }
            pccVar.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int sf = sf(str) - 1;
                if (sf > 0) {
                    pcc(str, sf);
                } else {
                    gm(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int qf() {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar;
        try {
            pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", new String[]{"COUNT(*)"}, null, null, null, null, null));
            try {
                if (pccVar.moveToFirst()) {
                    int i = pccVar.getInt(0);
                    pccVar.close();
                    return i;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            pccVar = null;
        }
        pccVar.close();
        return 0;
    }

    public static String vj() {
        return "CREATE TABLE IF NOT EXISTS iab_history (_id INTEGER PRIMARY KEY AUTOINCREMENT,url TEXT,main_title TEXT,material_key TEXT,time TEXT,item_index INTEGER,sdk_version TEXT)";
    }

    public static String wh() {
        return "CREATE TABLE IF NOT EXISTS iab_history_material (material_key TEXT PRIMARY KEY,material TEXT,sdk_version TEXT,count INTEGER DEFAULT 0)";
    }

    public void oo() {
        try {
            ArrayList arrayList = new ArrayList();
            int qf = qf();
            if (qf > 1000) {
                arrayList.addAll(pcc(qf - 1000));
            }
            for (String str : pcc(System.currentTimeMillis() - 2592000000L)) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.wh()) {
                gm(arrayList);
            } else {
                sf(arrayList);
            }
            pcc(arrayList);
        } catch (Throwable unused) {
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
        Throwable th;
        int i;
        boolean z;
        if (pccVar == null || TextUtils.isEmpty(pccVar.qf())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", pccVar.vj());
            contentValues.put("main_title", pccVar.oo());
            contentValues.put("material_key", pccVar.qf());
            contentValues.put("time", pccVar.wh());
            contentValues.put("item_index", Integer.valueOf(pccVar.sf()));
            contentValues.put("sdk_version", pccVar.pcc());
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", contentValues);
            String gm = pccVar.gm();
            if (TextUtils.isEmpty(gm)) {
                return;
            }
            com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar3 = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{pccVar.qf()}, null, null, null));
                try {
                    if (pccVar3.moveToFirst()) {
                        int columnIndex = pccVar3.getColumnIndex("count");
                        if (columnIndex != -1) {
                            i = pccVar3.getInt(columnIndex);
                            z = true;
                        } else {
                            z = true;
                            i = 0;
                        }
                    } else {
                        i = 0;
                        z = false;
                    }
                    pccVar3.close();
                    if (z) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("count", Integer.valueOf(i + 1));
                        com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", contentValues2, "material_key=?", new String[]{pccVar.qf()});
                    } else {
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("material_key", pccVar.qf());
                        contentValues3.put("material", gm);
                        contentValues3.put("sdk_version", pccVar.pcc());
                        contentValues3.put("count", (Integer) 0);
                        com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", contentValues3);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pccVar2 = pccVar3;
                    if (pccVar2 == null) {
                        throw th;
                    }
                    pccVar2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable unused) {
        }
    }

    public void sf(com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar) {
        Throwable th;
        int columnIndex;
        if (pccVar == null || TextUtils.isEmpty(pccVar.qf())) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", pccVar.vj());
            contentValues.put("main_title", pccVar.oo());
            contentValues.put("material_key", pccVar.qf());
            contentValues.put("time", pccVar.wh());
            contentValues.put("item_index", Integer.valueOf(pccVar.sf()));
            contentValues.put("sdk_version", pccVar.pcc());
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", contentValues);
            String gm = pccVar.gm();
            if (TextUtils.isEmpty(gm)) {
                return;
            }
            com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar2 = null;
            try {
                com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar3 = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{pccVar.qf()}, null, null, null));
                try {
                    int i = (!pccVar3.moveToFirst() || (columnIndex = pccVar3.getColumnIndex("count")) == -1) ? 0 : pccVar3.getInt(columnIndex);
                    pccVar3.close();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("material_key", pccVar.qf());
                    contentValues2.put("material", gm);
                    contentValues2.put("sdk_version", pccVar.pcc());
                    contentValues2.put("count", Integer.valueOf(i + 1));
                    com.bytedance.sdk.openadsdk.core.qf.sf.sf(lu.pcc(), "iab_history_material", contentValues2);
                } catch (Throwable th2) {
                    th = th2;
                    pccVar2 = pccVar3;
                    if (pccVar2 == null) {
                        throw th;
                    }
                    pccVar2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable unused) {
        }
    }

    public void gm() {
        try {
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", null, null);
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", null, null);
            ConcurrentHashMap<String, of> concurrentHashMap = this.sf.get();
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } catch (Throwable unused) {
        }
    }

    private void gm(String str) {
        try {
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", "material_key=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public List<com.bytedance.sdk.openadsdk.gbb.pcc.pcc> sf() {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar;
        ArrayList arrayList = new ArrayList();
        try {
            pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", null, null, null, null, null, "time DESC"));
        } catch (Throwable unused) {
            pccVar = null;
        }
        try {
            if (pccVar.moveToFirst()) {
                do {
                    int columnIndex = pccVar.getColumnIndex("_id");
                    int columnIndex2 = pccVar.getColumnIndex("url");
                    int columnIndex3 = pccVar.getColumnIndex("main_title");
                    int columnIndex4 = pccVar.getColumnIndex("material_key");
                    int columnIndex5 = pccVar.getColumnIndex("time");
                    int columnIndex6 = pccVar.getColumnIndex("item_index");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1 && columnIndex5 != -1) {
                        pccVar.getString(columnIndex);
                        com.bytedance.sdk.openadsdk.gbb.pcc.pcc pccVar2 = new com.bytedance.sdk.openadsdk.gbb.pcc.pcc();
                        pccVar2.sf(pccVar.getInt(columnIndex6));
                        pccVar2.pcc(columnIndex);
                        pccVar2.sf(pccVar.getString(columnIndex4));
                        pccVar2.vj(pccVar.getString(columnIndex2));
                        pccVar2.oo(pccVar.getString(columnIndex3));
                        pccVar2.gm(pccVar.getString(columnIndex5));
                        arrayList.add(pccVar2);
                    }
                } while (pccVar.moveToNext());
            }
            pccVar.close();
            return arrayList;
        } catch (Throwable unused2) {
            if (pccVar != null) {
                pccVar.close();
            }
            return arrayList;
        }
    }

    private void sf(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", new String[]{"material_key"}, "_id IN (" + TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]), null, null, null));
            ArrayList arrayList = new ArrayList();
            if (pccVar.moveToFirst()) {
                do {
                    arrayList.add(pccVar.getString(0));
                } while (pccVar.moveToNext());
            }
            pccVar.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int sf = sf(str);
                if (sf > 0) {
                    pcc(str, sf - 1);
                }
                if (sf <= 0) {
                    gm(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int sf(String str) {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar;
        try {
            pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", new String[]{"count"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (pccVar.moveToFirst()) {
                    int i = pccVar.getInt(0);
                    pccVar.close();
                    return i;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            pccVar = null;
        }
        pccVar.close();
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String pcc(String str) {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar;
        int columnIndex;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", new String[]{"material"}, "material_key=?", new String[]{str}, null, null, null));
            try {
                if (pccVar.moveToFirst() && (columnIndex = pccVar.getColumnIndex("material")) != -1) {
                    String string = pccVar.getString(columnIndex);
                    pccVar.close();
                    return string;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            pccVar = null;
        }
        pccVar.close();
        return null;
    }

    public static sf pcc() {
        if (pcc == null) {
            synchronized (sf.class) {
                try {
                    if (pcc == null) {
                        pcc = new sf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    private List<String> pcc(long j) {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar;
        ArrayList arrayList = new ArrayList();
        try {
            pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", new String[]{"_id"}, "time < ?", new String[]{String.valueOf(j)}, null, null, "time ASC"));
        } catch (Throwable unused) {
            pccVar = null;
        }
        try {
            if (pccVar.moveToFirst()) {
                do {
                    arrayList.add(pccVar.getString(0));
                } while (pccVar.moveToNext());
            }
            pccVar.close();
            return arrayList;
        } catch (Throwable unused2) {
            if (pccVar != null) {
                pccVar.close();
            }
            return arrayList;
        }
    }

    private List<String> pcc(int i) {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar;
        ArrayList arrayList = new ArrayList();
        try {
            pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", new String[]{"_id"}, null, null, null, null, "time ASC"));
        } catch (Throwable unused) {
            pccVar = null;
        }
        try {
            if (pccVar.moveToFirst()) {
                int i2 = 0;
                while (i2 < i) {
                    arrayList.add(pccVar.getString(0));
                    i2++;
                    if (!pccVar.moveToNext()) {
                        break;
                    }
                }
            }
            pccVar.close();
            return arrayList;
        } catch (Throwable unused2) {
            if (pccVar != null) {
                pccVar.close();
            }
            return arrayList;
        }
    }

    private void pcc(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history", "_id IN (" + TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
        } catch (Throwable unused) {
        }
    }

    private void pcc(String str, int i) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("count", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.qf.sf.pcc(lu.pcc(), "iab_history_material", contentValues, "material_key=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }
}

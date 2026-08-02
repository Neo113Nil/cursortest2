package com.bytedance.sdk.openadsdk.core.hc.pcc;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.lu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    public static int pcc = 20;
    private static volatile gm sf;
    private final Object gm = new Object();
    private final LruCache<String, pcc> oo = new LruCache<String, pcc>(pcc) { // from class: com.bytedance.sdk.openadsdk.core.hc.pcc.gm.1
        @Override // android.util.LruCache
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, pcc pccVar) {
            return 1;
        }
    };

    private gm() {
    }

    public static String gm() {
        return "CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)";
    }

    public static String oo() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public pcc pcc(String str, String str2) {
        pcc pccVar;
        pcc pcc2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.gm) {
            pccVar = this.oo.get(str);
        }
        if (pccVar != null) {
            if (TextUtils.equals(str2, pccVar.sf())) {
                return pccVar;
            }
            sf(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar2 = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (pccVar2.moveToFirst()) {
                do {
                    int columnIndex = pccVar2.getColumnIndex("id");
                    int columnIndex2 = pccVar2.getColumnIndex("md5");
                    int columnIndex3 = pccVar2.getColumnIndex("url");
                    int columnIndex4 = pccVar2.getColumnIndex("data");
                    int columnIndex5 = pccVar2.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = pccVar2.getColumnIndex("rit");
                        String string = pccVar2.getString(columnIndex);
                        String string2 = pccVar2.getString(columnIndex2);
                        String string3 = pccVar2.getString(columnIndex3);
                        String string4 = pccVar2.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        pcc2 = new pcc().pcc(string).sf(string2).oo(string4).gm(string3).vj(columnIndex6 != -1 ? pccVar2.getString(columnIndex6) : null).pcc(Long.valueOf(pccVar2.getLong(columnIndex5)));
                        synchronized (this.gm) {
                            this.oo.put(string, pcc2);
                        }
                    }
                    return null;
                } while (pccVar2.moveToNext());
                return pcc2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    public List<pcc> sf() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", null, null, null, null, null, null));
        try {
            if (pccVar.moveToFirst()) {
                do {
                    int columnIndex = pccVar.getColumnIndex("id");
                    int columnIndex2 = pccVar.getColumnIndex("md5");
                    int columnIndex3 = pccVar.getColumnIndex("url");
                    int columnIndex4 = pccVar.getColumnIndex("data");
                    int columnIndex5 = pccVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = pccVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? pccVar.getString(columnIndex6) : null;
                        String string2 = pccVar.getString(columnIndex);
                        String string3 = pccVar.getString(columnIndex2);
                        String string4 = pccVar.getString(columnIndex3);
                        pcc pcc2 = new pcc().pcc(string2).sf(string3).gm(string4).oo(pccVar.getString(columnIndex4)).vj(string).pcc(Long.valueOf(pccVar.getLong(columnIndex5)));
                        arrayList.add(pcc2);
                        synchronized (this.gm) {
                            this.oo.put(string2, pcc2);
                        }
                    }
                } while (pccVar.moveToNext());
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                lo.pcc("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                pccVar.close();
            }
        }
    }

    private void sf(String str) {
        if (!TextUtils.isEmpty(str) && this.oo.size() > 0) {
            synchronized (this.gm) {
                this.oo.remove(str);
            }
        }
    }

    public static gm pcc() {
        if (sf == null) {
            synchronized (gm.class) {
                try {
                    if (sf == null) {
                        sf = new gm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    public void pcc(pcc pccVar) {
        if (pccVar == null || TextUtils.isEmpty(pccVar.pcc())) {
            return;
        }
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar2 = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", null, "id=?", new String[]{pccVar.pcc()}, null, null, null));
        boolean z = pccVar2.getCount() > 0;
        try {
            pccVar2.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", pccVar.pcc());
            contentValues.put("md5", pccVar.sf());
            contentValues.put("url", pccVar.gm());
            contentValues.put("data", pccVar.vj());
            contentValues.put("rit", pccVar.wh());
            contentValues.put("update_time", pccVar.oo());
            if (z) {
                com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", contentValues, "id=?", new String[]{pccVar.pcc()});
            } else {
                com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", contentValues);
            }
            synchronized (this.gm) {
                this.oo.put(pccVar.pcc(), pccVar);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<pcc> pcc(String str) {
        pcc pccVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc pccVar2 = new com.bytedance.sdk.openadsdk.gpj.pcc.pcc(com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (pccVar2.moveToFirst()) {
                do {
                    int columnIndex = pccVar2.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = pccVar2.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.gm) {
                                pccVar = this.oo.get(string);
                            }
                            if (pccVar != null) {
                                hashSet.add(pccVar);
                            } else {
                                pcc pccVar3 = new pcc();
                                int columnIndex2 = pccVar2.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = pccVar2.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        pccVar3.oo(string2);
                                        pccVar3.pcc(string);
                                        pccVar3.vj(str);
                                        int columnIndex3 = pccVar2.getColumnIndex("md5");
                                        int columnIndex4 = pccVar2.getColumnIndex("url");
                                        int columnIndex5 = pccVar2.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            pccVar3.sf(pccVar2.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            pccVar3.gm(pccVar2.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            pccVar3.pcc(Long.valueOf(pccVar2.getLong(columnIndex5)));
                                        }
                                        hashSet.add(pccVar3);
                                        synchronized (this.gm) {
                                            this.oo.put(string, pccVar3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (pccVar2.moveToNext());
            }
            return hashSet;
        } catch (Throwable th) {
            try {
                lo.pcc("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                pccVar2.close();
            }
        }
    }

    public void pcc(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                sf(str);
                com.bytedance.sdk.openadsdk.gpj.sf.pcc.pcc(lu.pcc(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}

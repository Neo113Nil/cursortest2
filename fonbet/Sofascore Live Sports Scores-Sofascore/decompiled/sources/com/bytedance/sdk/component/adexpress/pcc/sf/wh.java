package com.bytedance.sdk.component.adexpress.pcc.sf;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    public static int pcc = 20;
    private static volatile wh sf;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.pcc.gm.gm> vj;
    private final Object oo = new Object();
    private AtomicBoolean wh = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.pcc.gm.sf> qf = new LruCache<String, com.bytedance.sdk.component.adexpress.pcc.gm.sf>(pcc) { // from class: com.bytedance.sdk.component.adexpress.pcc.sf.wh.1
        @Override // android.util.LruCache
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.pcc.gm.sf sfVar) {
            return 1;
        }
    };
    private Set<String> gm = Collections.synchronizedSet(new HashSet());

    private wh() {
    }

    private void oo(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.pcc.gm.sf> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.qf) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.oo) {
            this.qf.remove(str);
        }
    }

    public void gm(String str) {
        com.bytedance.sdk.component.adexpress.pcc.gm.gm gmVar;
        try {
            if (this.vj != null && !this.vj.isEmpty() && (gmVar = this.vj.get(str)) != null) {
                if (!TextUtils.isEmpty(gmVar.pcc()) && com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().wh() != null) {
                    com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().wh();
                }
                this.vj.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void pcc(com.bytedance.sdk.component.adexpress.pcc.gm.sf sfVar, boolean z) {
        if (sfVar == null || com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf() == null || TextUtils.isEmpty(sfVar.sf())) {
            return;
        }
        Cursor pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", null, "id=?", new String[]{sfVar.sf()}, null, null, null);
        boolean z2 = pcc2 != null && pcc2.getCount() > 0;
        if (pcc2 != null) {
            try {
                r2 = pcc2.moveToFirst() ? pcc2.getString(pcc2.getColumnIndex("rit")) : null;
                pcc2.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", sfVar.pcc());
        contentValues.put("id", sfVar.sf());
        contentValues.put("md5", sfVar.gm());
        contentValues.put("url", sfVar.oo());
        contentValues.put("data", sfVar.vj());
        contentValues.put("version", sfVar.wh());
        contentValues.put("update_time", sfVar.qf());
        if (z2) {
            com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", contentValues, "id=?", new String[]{sfVar.sf()});
        } else {
            com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", contentValues);
        }
        synchronized (this.oo) {
            this.qf.put(sfVar.sf(), sfVar);
        }
        this.gm.add(sfVar.sf());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().wh() == null) {
                return;
            }
            if (this.vj == null) {
                this.vj = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.pcc.gm.gm gmVar = new com.bytedance.sdk.component.adexpress.pcc.gm.gm(sfVar.pcc(), sfVar.sf(), sfVar.gm());
            this.vj.put(sfVar.sf(), gmVar);
            if (r2 != null) {
                com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().wh();
                gmVar.sf();
            }
            com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().wh();
            sfVar.pcc();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.pcc.gm.sf> sf() {
        if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf() == null) {
            return null;
        }
        boolean z = this.wh.get();
        this.wh.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", null, null, null, null, null, null);
        if (pcc2 != null) {
            while (pcc2.moveToNext()) {
                try {
                    String string = pcc2.getString(pcc2.getColumnIndex("rit"));
                    String string2 = pcc2.getString(pcc2.getColumnIndex("id"));
                    String string3 = pcc2.getString(pcc2.getColumnIndex("md5"));
                    String string4 = pcc2.getString(pcc2.getColumnIndex("url"));
                    String string5 = pcc2.getString(pcc2.getColumnIndex("data"));
                    String string6 = pcc2.getString(pcc2.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.pcc.gm.sf().pcc(string).sf(string2).gm(string3).oo(string4).vj(string5).wh(string6).pcc(Long.valueOf(pcc2.getLong(pcc2.getColumnIndex("update_time")))));
                    synchronized (this.oo) {
                        this.qf.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.gm.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().wh() != null) {
                        if (this.vj == null) {
                            this.vj = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.vj.contains(string2)) {
                            this.vj.put(string2, new com.bytedance.sdk.component.adexpress.pcc.gm.gm(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    pcc2.close();
                }
            }
            pcc2.close();
            return arrayList;
        }
        return arrayList;
    }

    public static String gm() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public Set<String> sf(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf() != null) {
            HashSet hashSet = new HashSet();
            Cursor pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (pcc2 != null) {
                try {
                    if (pcc2.moveToFirst()) {
                        do {
                            hashSet.add(pcc2.getString(pcc2.getColumnIndex("id")));
                        } while (pcc2.moveToNext());
                        pcc2.close();
                        return hashSet;
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    pcc2.close();
                    throw th;
                }
                pcc2.close();
            }
        }
        return null;
    }

    public static wh pcc() {
        if (sf == null) {
            synchronized (wh.class) {
                try {
                    if (sf == null) {
                        sf = new wh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sf;
    }

    public com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc(String str) {
        com.bytedance.sdk.component.adexpress.pcc.gm.sf sfVar;
        com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf() == null) {
            return null;
        }
        synchronized (this.oo) {
            sfVar = this.qf.get(String.valueOf(str));
        }
        if (sfVar != null) {
            return sfVar;
        }
        Cursor pcc3 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (pcc3 != null) {
            try {
                if (pcc3.moveToFirst()) {
                    do {
                        String string = pcc3.getString(pcc3.getColumnIndex("rit"));
                        String string2 = pcc3.getString(pcc3.getColumnIndex("id"));
                        String string3 = pcc3.getString(pcc3.getColumnIndex("md5"));
                        String string4 = pcc3.getString(pcc3.getColumnIndex("url"));
                        String string5 = pcc3.getString(pcc3.getColumnIndex("data"));
                        String string6 = pcc3.getString(pcc3.getColumnIndex("version"));
                        pcc2 = new com.bytedance.sdk.component.adexpress.pcc.gm.sf().pcc(string).sf(string2).gm(string3).oo(string4).vj(string5).wh(string6).pcc(Long.valueOf(pcc3.getLong(pcc3.getColumnIndex("update_time"))));
                        synchronized (this.oo) {
                            this.qf.put(string2, pcc2);
                        }
                        this.gm.add(string2);
                    } while (pcc3.moveToNext());
                    pcc3.close();
                    return pcc2;
                }
            } catch (Throwable unused) {
            }
            pcc3.close();
        }
        return null;
    }

    public static void pcc(int i) {
        pcc = i;
    }

    public void pcc(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                oo(strArr[i]);
                com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().sf().pcc("template_diff_new", "id=?", new String[]{strArr[i]});
                gm(strArr[i]);
            }
        }
    }
}

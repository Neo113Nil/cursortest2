package com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.lnb;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends gm {
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm;
    protected List<String> pcc;

    public qf(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context);
        this.pcc = new ArrayList();
        this.gm = pccVar;
        if (pccVar == null) {
            this.gm = com.bytedance.sdk.component.wh.pcc.oo.sf.pcc.gm();
        }
    }

    public static String gm(String str) {
        return lnb.o("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r9 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r9 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r9.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int oo() {
        Cursor cursor;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    cursor.moveToFirst();
                    i = cursor.getInt(0);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        return i;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, String str) {
        long pcc = com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc(i, vj());
        if (pcc <= 0) {
            pcc = 1;
        } else if (pcc > 100) {
            pcc = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.pcc.clear();
        Cursor pcc2 = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"id", U3.i.X, "encrypt"}, null, null, null, null, str + " DESC limit " + pcc);
        if (pcc2 != null) {
            while (pcc2.moveToNext()) {
                try {
                    try {
                        String string = pcc2.getString(pcc2.getColumnIndex("id"));
                        String string2 = pcc2.getString(pcc2.getColumnIndex(U3.i.X));
                        if (pcc2.getInt(pcc2.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.wh.pcc.qf.wh().jr().pcc(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.pcc.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc pccVar = new com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc(string, new JSONObject(string2));
                            pccVar.gm(gm());
                            pccVar.sf(pcc());
                            arrayList.add(pccVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            try {
                pcc2.close();
                if (!this.pcc.isEmpty()) {
                    pcc(this.pcc);
                    this.pcc.clear();
                }
            } catch (Exception unused2) {
            }
        }
        return arrayList;
    }

    public void sf(List<com.bytedance.sdk.component.wh.pcc.oo.pcc> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar : list) {
            linkedList.add(pccVar.gm());
            com.bytedance.sdk.component.wh.pcc.gm.pcc.ork(pccVar);
        }
        sf();
        linkedList.size();
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), "DELETE FROM " + sf() + " WHERE " + pcc("id", linkedList, 1000, true));
        gm(linkedList);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public long wh() {
        return com.bytedance.sdk.component.wh.pcc.qf.pcc.sf();
    }

    public byte gm() {
        return (byte) 2;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> sf(String str) {
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar = this.gm;
        if (pccVar == null) {
            return new ArrayList();
        }
        return pcc(pccVar.sf(), str);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.pcc.pcc.pcc.gm
    public String sf() {
        return com.bytedance.sdk.component.wh.pcc.qf.wh().gm().oo();
    }

    private void sf(int i, long j) {
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    public byte pcc() {
        return (byte) 1;
    }

    public void pcc(List<String> list) {
        sf();
        list.size();
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), "DELETE FROM " + sf() + " WHERE " + pcc("id", list, 1000, true));
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(com.bytedance.sdk.component.wh.pcc.sf.oo.oo.hoh(), list.size());
        gm(list);
    }

    public void pcc(int i, long j) {
        sf(i, j);
    }

    public boolean pcc(int i) {
        return this.gm != null && oo() >= this.gm.pcc();
    }

    private static String pcc(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String pcc = pcc(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            bf3.v(sb, str, str2, "('", pcc);
            sb.append("')");
        }
        return pcc(sb.toString(), wv8.i(str, str2, "('')"));
    }

    private static String pcc(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}

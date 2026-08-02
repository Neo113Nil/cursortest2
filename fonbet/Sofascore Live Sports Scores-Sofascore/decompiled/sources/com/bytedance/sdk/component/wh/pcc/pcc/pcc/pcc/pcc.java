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
public class pcc extends gm {
    private final Context gm;
    private com.bytedance.sdk.component.wh.pcc.oo.sf.pcc oo;
    protected List<String> pcc;

    public pcc(Context context, com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar) {
        super(context);
        this.pcc = new ArrayList();
        this.gm = context;
        this.oo = pccVar;
        if (pccVar == null) {
            this.oo = com.bytedance.sdk.component.wh.pcc.oo.sf.pcc.gm();
        }
    }

    public byte gm() {
        return (byte) 2;
    }

    public byte oo() {
        return (byte) 0;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b;
        Cursor pcc;
        long pcc2 = com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc(i, vj());
        sf();
        if (pcc2 <= 0) {
            pcc2 = 1;
        } else if (pcc2 > 100) {
            pcc2 = 100;
        }
        String str4 = str + " DESC limit " + pcc2;
        ArrayList arrayList = new ArrayList();
        this.pcc.clear();
        long dax = com.bytedance.sdk.component.wh.pcc.qf.wh().dax();
        if (dax > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - dax)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo() && oo() == 3) {
            str3 = "id";
            b = 3;
            pcc = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"id", U3.i.X, "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b = 3;
            pcc = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{str3, U3.i.X, "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = pcc;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.wh.pcc.vj jr = com.bytedance.sdk.component.wh.pcc.qf.wh().jr();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(U3.i.X));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo() && oo() == b) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = jr.pcc(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.pcc.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc pccVar = new com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc(string, jSONObject);
                            pccVar.sf(oo());
                            pccVar.gm(gm());
                            if (com.bytedance.sdk.component.wh.pcc.gm.pcc.oo() && oo() == b) {
                                pccVar.pcc(i3);
                            }
                            com.bytedance.sdk.component.wh.pcc.gm.pcc.pcc(jSONObject, pccVar);
                            arrayList.add(pccVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.pcc.isEmpty()) {
                        pcc(this.pcc);
                        this.pcc.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        sf();
        arrayList.size();
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
    public String sf() {
        com.bytedance.sdk.component.wh.pcc.pcc.vj gm = com.bytedance.sdk.component.wh.pcc.qf.wh().gm();
        if (gm != null) {
            return gm.sf();
        }
        return null;
    }

    private void sf(int i, long j) {
        if (j > 0 || i > 0) {
            com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            sf();
        }
    }

    public static String sf(String str) {
        return lnb.o("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int pcc() {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(vj(), sf(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursor != null) {
                cursor.moveToFirst();
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                    throw th;
                } catch (Exception unused2) {
                    throw th;
                }
            }
            throw th;
        }
        return i;
    }

    public List<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc(String str) {
        com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pccVar = this.oo;
        if (pccVar == null) {
            return new ArrayList();
        }
        return pcc(pccVar.sf(), str);
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
        if (this.oo == null) {
            return false;
        }
        int pcc = pcc();
        int pcc2 = this.oo.pcc();
        sf();
        return (com.bytedance.sdk.component.wh.pcc.gm.pcc.gm() && (i == 1 || i == 2)) ? pcc > 0 : pcc >= pcc2;
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

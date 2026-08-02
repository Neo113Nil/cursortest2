package com.bytedance.sdk.component.wh.pcc.wh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh implements vj {
    private Context pcc;

    public wh(Context context) {
        this.pcc = context;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.vj
    public void gm(oo ooVar) {
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(this.pcc, "trackurl", "id=?", new String[]{ooVar.pcc()});
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.vj
    public oo pcc(String str) {
        Cursor pcc = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(this.pcc, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (pcc != null && pcc.moveToFirst()) {
            try {
                String string = pcc.getString(pcc.getColumnIndex("id"));
                String string2 = pcc.getString(pcc.getColumnIndex("url"));
                boolean z = pcc.getInt(pcc.getColumnIndex("replaceholder")) > 0;
                int i = pcc.getInt(pcc.getColumnIndex("retry"));
                int i2 = pcc.getInt(pcc.getColumnIndex("url_type"));
                String string3 = pcc.getString(pcc.getColumnIndex("ad_id"));
                String string4 = pcc.getString(pcc.getColumnIndex("error_code"));
                String string5 = pcc.getString(pcc.getColumnIndex("error_msg"));
                oo ooVar = new oo(string, string2, z, i2, string3);
                ooVar.pcc(i);
                if (!TextUtils.isEmpty(string4)) {
                    ooVar.pcc(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    ooVar.sf(string5);
                }
                return ooVar;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    pcc.close();
                    pcc = null;
                } finally {
                    pcc.close();
                }
            }
        }
        if (pcc != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.vj
    public void sf(oo ooVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", ooVar.pcc());
        contentValues.put("url", ooVar.sf());
        contentValues.put("replaceholder", Integer.valueOf(ooVar.gm() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(ooVar.oo()));
        contentValues.put("error_code", ooVar.qf());
        contentValues.put("error_msg", ooVar.vy());
        contentValues.put("url_type", Integer.valueOf(ooVar.vj()));
        contentValues.put("ad_id", ooVar.wh());
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(this.pcc, "trackurl", contentValues, "id=?", new String[]{ooVar.pcc()});
    }

    public static String sf() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.vj
    public List<oo> pcc() {
        LinkedList linkedList = new LinkedList();
        Cursor pcc = com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(this.pcc, "trackurl", null, null, null, null, null, null);
        if (pcc != null) {
            while (pcc.moveToNext()) {
                try {
                    try {
                        String string = pcc.getString(pcc.getColumnIndex("id"));
                        String string2 = pcc.getString(pcc.getColumnIndex("url"));
                        boolean z = pcc.getInt(pcc.getColumnIndex("replaceholder")) > 0;
                        int i = pcc.getInt(pcc.getColumnIndex("retry"));
                        int i2 = pcc.getInt(pcc.getColumnIndex("url_type"));
                        String string3 = pcc.getString(pcc.getColumnIndex("ad_id"));
                        String string4 = pcc.getString(pcc.getColumnIndex("error_code"));
                        String string5 = pcc.getString(pcc.getColumnIndex("error_msg"));
                        oo ooVar = new oo(string, string2, z, i2, string3);
                        ooVar.pcc(i);
                        if (!TextUtils.isEmpty(string4)) {
                            ooVar.pcc(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            ooVar.sf(string5);
                        }
                        linkedList.add(ooVar);
                    } catch (Throwable unused) {
                    }
                } finally {
                    pcc.close();
                }
            }
            return linkedList;
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.wh.vj
    public void pcc(oo ooVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", ooVar.pcc());
        contentValues.put("url", ooVar.sf());
        contentValues.put("replaceholder", Integer.valueOf(ooVar.gm() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(ooVar.oo()));
        contentValues.put("url_type", Integer.valueOf(ooVar.vj()));
        contentValues.put("ad_id", ooVar.wh());
        contentValues.put("error_code", ooVar.qf());
        contentValues.put("error_msg", ooVar.vy());
        com.bytedance.sdk.component.wh.pcc.pcc.pcc.gm.pcc(this.pcc, "trackurl", contentValues);
    }
}

package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import com.ironsource.V5;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FileOperate.java */
/* loaded from: classes13.dex */
public class a {
    final String a = "FileOperate";

    public void a(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Object> d = com.mbridge.msdk.config.component.database.a.a().d(str.startsWith("DELETE") ? str.replaceFirst("DELETE", "SELECT") : str.startsWith("delete") ? str.replaceFirst("delete", "SELECT") : "");
        if (d == null || d.isEmpty() || !(d.get("data") instanceof List) || (arrayList = (ArrayList) d.get("data")) == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                if (((String) entry.getKey()).equals(V5.c.c)) {
                    arrayList2.add(String.valueOf(entry.getValue()));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a(new File((String) it2.next()));
        }
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}

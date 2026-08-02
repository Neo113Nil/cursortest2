package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONArray;

/* compiled from: DomainReport.java */
/* loaded from: classes13.dex */
public class b {
    private static String a = "DomainReport";

    public static boolean a(com.mbridge.msdk.setting.g gVar, String str) {
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int M = gVar.M();
                    JSONArray K = gVar.K();
                    JSONArray J = gVar.J();
                    if (J != null) {
                        for (int i = 0; i < J.length(); i++) {
                            if (str.contains(J.getString(i))) {
                                return false;
                            }
                        }
                    }
                    if (M == 2) {
                        if (K != null) {
                            for (int i2 = 0; i2 < K.length(); i2++) {
                                if (str.contains(K.getString(i2))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e) {
                q0.b(a, e.getMessage());
            }
        }
        return true;
    }
}

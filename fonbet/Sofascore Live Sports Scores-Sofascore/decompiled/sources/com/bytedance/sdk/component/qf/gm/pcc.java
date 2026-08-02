package com.bytedance.sdk.component.qf.gm;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean pcc(Map<String, String> map) {
        String str;
        if (map == null) {
            return false;
        }
        String str2 = "content-type";
        if (TextUtils.isEmpty(map.get("content-type"))) {
            str2 = "Content-Type";
            if (TextUtils.isEmpty(map.get("Content-Type"))) {
                str = "";
                return !str.contains("application/octet-stream");
            }
        }
        str = map.get(str2);
        if (!str.contains("application/octet-stream")) {
        }
    }
}

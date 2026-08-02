package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.core.gpj;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private final String pcc = "UGenV3OpenLinks";
    private final String sf = "landingStyle";
    private final String gm = "url";
    private final String oo = "fallbackUrl";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #1 {all -> 0x004e, blocks: (B:5:0x0008, B:10:0x0029, B:12:0x0031, B:13:0x0035, B:18:0x003c), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x004e, TryCatch #1 {all -> 0x004e, blocks: (B:5:0x0008, B:10:0x0029, B:12:0x0031, B:13:0x0035, B:18:0x003c), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:5:0x0008, B:10:0x0029, B:12:0x0031, B:13:0x0035, B:18:0x003c), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(Context context, boolean z, of ofVar, String str, Map<String, Object> map, com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        int parseInt;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            Object obj = map.get("landingStyle");
            Object obj2 = map.get("url");
            Object obj3 = map.get("fallbackUrl");
            if (obj != null) {
                try {
                    parseInt = Integer.parseInt(String.valueOf(obj));
                } catch (Throwable unused) {
                }
                if (pcc(parseInt, obj2 == null ? String.valueOf(obj2) : null, obj3 != null ? String.valueOf(obj3) : null)) {
                    return;
                }
                gpj.pcc(context, z, pcc(map), ofVar, str, kun.pcc(str), null, vjVar);
                return;
            }
            parseInt = -1;
            if (pcc(parseInt, obj2 == null ? String.valueOf(obj2) : null, obj3 != null ? String.valueOf(obj3) : null)) {
            }
        } catch (Throwable th) {
            lo.gm("UGenV3OpenLinks", th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r3 != 3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean pcc(int i, String str, String str2) {
        if (i != 1) {
            if (i == 2) {
                if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !lu.pcc(str2)) {
                    return false;
                }
            }
        }
        return lu.pcc(str);
    }

    private JSONObject pcc(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        jSONObject.put(entry.getKey(), String.valueOf(value));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}

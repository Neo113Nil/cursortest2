package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3408f3 {
    public static final ContentValues a(Z2 z2) {
        String str;
        z2.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(z2.a));
        contentValues.put("url", z2.b);
        contentValues.put("pending_attempts", Integer.valueOf(z2.f));
        contentValues.put("ts", Long.valueOf(z2.g));
        contentValues.put("created_ts", Long.valueOf(z2.h));
        contentValues.put("follow_redirect", Boolean.valueOf(z2.d));
        contentValues.put("ping_in_webview", Boolean.valueOf(z2.e));
        Map map = z2.c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = z2.c;
                map2.getClass();
                str = new JSONObject(map2).toString();
            } catch (Exception unused) {
                str = "";
            }
            str.getClass();
            contentValues.put("track_extras", str);
        }
        return contentValues;
    }
}

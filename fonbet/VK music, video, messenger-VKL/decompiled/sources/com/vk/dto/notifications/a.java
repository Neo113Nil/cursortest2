package com.vk.dto.notifications;

import com.vk.core.serialize.Serializer;
import com.vk.dto.notifications.NotificationItem;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.zj70;

/* compiled from: NotificationsGetGroupedResponse.kt */
/* loaded from: classes18.dex */
public final class a {
    public final int a;
    public final ArrayList<NotificationItem> b;
    public final String c;
    public final int d;

    public a(JSONObject jSONObject, int i) {
        ArrayList<NotificationItem> arrayList;
        this.a = i;
        zj70 zj70Var = new zj70(jSONObject);
        this.c = jSONObject.optString("next_from");
        if (i == -1) {
            this.a = jSONObject.optInt("last_viewed", -1);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            arrayList = new ArrayList<>(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    int i3 = this.a;
                    if (i3 >= 0 && i3 < optJSONObject.optInt("date", -1)) {
                        this.d++;
                    }
                    Serializer.c<NotificationItem> cVar = NotificationItem.CREATOR;
                    arrayList.add(NotificationItem.a.a(optJSONObject, zj70Var));
                }
            }
        } else {
            arrayList = null;
        }
        this.b = arrayList;
        HashMap hashMap = zj70Var.a;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap hashMap2 = zj70Var.b;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        HashMap hashMap3 = zj70Var.c;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        HashMap hashMap4 = zj70Var.d;
        if (hashMap4 != null) {
            hashMap4.clear();
        }
        HashMap hashMap5 = zj70Var.e;
        if (hashMap5 != null) {
            hashMap5.clear();
        }
    }
}

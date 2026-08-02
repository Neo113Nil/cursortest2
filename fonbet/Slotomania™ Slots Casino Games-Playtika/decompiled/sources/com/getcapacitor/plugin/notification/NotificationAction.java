package com.getcapacitor.plugin.notification;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class NotificationAction {
    private String id;
    private Boolean input;
    private String title;

    public NotificationAction() {
    }

    public NotificationAction(String str, String str2, Boolean bool) {
        this.id = str;
        this.title = str2;
        this.input = bool;
    }

    public static Map<String, NotificationAction[]> buildTypes(JSArray jSArray) {
        HashMap hashMap = new HashMap();
        try {
            Iterator it = jSArray.toList().iterator();
            while (it.hasNext()) {
                JSObject fromJSONObject = JSObject.fromJSONObject((JSONObject) it.next());
                String string = fromJSONObject.getString("id");
                if (string == null) {
                    return null;
                }
                JSONArray jSONArray = fromJSONObject.getJSONArray("actions");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    NotificationAction[] notificationActionArr = new NotificationAction[length];
                    for (int i = 0; i < length; i++) {
                        NotificationAction notificationAction = new NotificationAction();
                        JSObject fromJSONObject2 = JSObject.fromJSONObject(jSONArray.getJSONObject(i));
                        notificationAction.setId(fromJSONObject2.getString("id"));
                        notificationAction.setTitle(fromJSONObject2.getString("title"));
                        notificationAction.setInput(fromJSONObject2.getBool("input"));
                        notificationActionArr[i] = notificationAction;
                    }
                    hashMap.put(string, notificationActionArr);
                }
            }
        } catch (Exception e) {
            Logger.error(Logger.tags("LN"), "Error when building action types", e);
        }
        return hashMap;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean isInput() {
        return Boolean.TRUE.equals(this.input);
    }

    public void setInput(Boolean bool) {
        this.input = bool;
    }
}

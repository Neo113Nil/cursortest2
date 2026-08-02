package de.appplant.cordova.plugin.notification.action;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ActionGroup {
    private static final Map<String, ActionGroup> groups = new HashMap();
    private final Action[] actions;
    private final String id;

    public static ActionGroup lookup(String str) {
        return groups.get(str);
    }

    public static void register(ActionGroup actionGroup) {
        groups.put(actionGroup.getId(), actionGroup);
    }

    public static void unregister(String str) {
        groups.remove(str);
    }

    public static boolean isRegistered(String str) {
        return groups.containsKey(str);
    }

    public static ActionGroup parse(Context context, JSONArray jSONArray) {
        return parse(context, null, jSONArray);
    }

    public static ActionGroup parse(Context context, String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("type", "button");
            optString.equals("input");
            if (!optString.equals("button") && !optString.equals("input")) {
                Log.w("Action", "Unknown type: " + optString);
            } else {
                arrayList.add(new Action(context, optJSONObject));
            }
        }
        return new ActionGroup(str, (Action[]) arrayList.toArray(new Action[arrayList.size()]));
    }

    private ActionGroup(String str, Action[] actionArr) {
        this.id = str;
        this.actions = actionArr;
    }

    public String getId() {
        return this.id;
    }

    public Action[] getActions() {
        return this.actions;
    }
}

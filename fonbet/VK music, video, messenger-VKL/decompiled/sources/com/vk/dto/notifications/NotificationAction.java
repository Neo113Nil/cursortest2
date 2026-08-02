package com.vk.dto.notifications;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.notifications.NotificationButton;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.zj70;

/* compiled from: NotificationAction.kt */
/* loaded from: classes18.dex */
public final class NotificationAction extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationAction> CREATOR = new b();
    public final String b;
    public final String c;
    public final JSONObject d;
    public final NotificationConfirm e;
    public Group f;
    public ArrayList g;

    /* compiled from: NotificationAction.kt */
    public static final class a {
        public static NotificationAction a(JSONObject jSONObject, zj70 zj70Var) {
            JSONArray optJSONArray;
            Group group;
            String str;
            HashMap hashMap = zj70Var.b;
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("url");
            JSONObject optJSONObject = jSONObject.optJSONObject("context");
            Serializer.c<NotificationConfirm> cVar = NotificationConfirm.CREATOR;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("confirm");
            r5 = null;
            ArrayList arrayList = null;
            String optString3 = optJSONObject2 != null ? optJSONObject2.optString("title") : null;
            String optString4 = optJSONObject2 != null ? optJSONObject2.optString("text") : null;
            String optString5 = optJSONObject2 != null ? optJSONObject2.optString("ok_label") : null;
            String optString6 = optJSONObject2 != null ? optJSONObject2.optString("cancel_label") : null;
            NotificationAction notificationAction = new NotificationAction(optString, optString2, optJSONObject, (((optString3 == null || optString3.length() == 0) && (optString4 == null || optString4.length() == 0)) || optString5 == null || optString5.length() == 0 || optString6 == null || optString6.length() == 0) ? null : new NotificationConfirm(optString3, optString4, optString5, optString6));
            String str2 = notificationAction.b;
            boolean equals = "invite_group_accept".equals(str2);
            JSONObject jSONObject2 = notificationAction.d;
            if (equals || "invite_group_decline".equals(str2)) {
                notificationAction.f = hashMap != null ? (Group) hashMap.get(jSONObject2 != null ? new UserId(jSONObject2.optLong("group_id")) : null) : null;
                return notificationAction;
            }
            if ("group_notify_enable".equals(str2)) {
                UserId userId = jSONObject2 != null ? new UserId(jSONObject2.optLong("group_id", 0L)) : null;
                if (userId != null && userId.b > 0 && hashMap != null && (group = (Group) hashMap.get(userId)) != null && (str = group.d) != null) {
                    jSONObject2.put("header", str);
                    return notificationAction;
                }
            } else if ("action_sheet".equals(str2)) {
                if (jSONObject2 != null && (optJSONArray = jSONObject2.optJSONArray("buttons")) != null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                        if (optJSONObject3 != null) {
                            Serializer.c<NotificationButton> cVar2 = NotificationButton.CREATOR;
                            arrayList.add(NotificationButton.a.a(optJSONObject3, zj70Var));
                        }
                    }
                }
                notificationAction.g = arrayList;
            }
            return notificationAction;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NotificationAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationAction a(Serializer serializer) {
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            return new NotificationAction(H, H2, H3 != null ? new JSONObject(H3) : null, (NotificationConfirm) serializer.G(NotificationConfirm.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationAction[i];
        }
    }

    public NotificationAction(String str, String str2, JSONObject jSONObject, NotificationConfirm notificationConfirm) {
        this.b = str;
        this.c = str2;
        this.d = jSONObject;
        this.e = notificationConfirm;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        JSONObject jSONObject = this.d;
        serializer.j0(jSONObject != null ? jSONObject.toString() : null);
        serializer.i0(this.e);
    }
}

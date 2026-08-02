package com.vk.dto.notifications;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.notifications.NotificationAction;
import org.json.JSONObject;
import xsna.zj70;

/* compiled from: NotificationButton.kt */
/* loaded from: classes18.dex */
public final class NotificationButton extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NotificationButton> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final NotificationAction f;

    /* compiled from: NotificationButton.kt */
    public static final class a {
        public static NotificationButton a(JSONObject jSONObject, zj70 zj70Var) {
            NotificationAction notificationAction;
            String optString = jSONObject.optString("label");
            String optString2 = jSONObject.optString(TtmlNode.TAG_STYLE);
            String optString3 = jSONObject.optString("icon");
            String optString4 = jSONObject.optString("color");
            JSONObject optJSONObject = jSONObject.optJSONObject("action");
            if (optJSONObject != null) {
                Serializer.c<NotificationAction> cVar = NotificationAction.CREATOR;
                notificationAction = NotificationAction.a.a(optJSONObject, zj70Var);
            } else {
                notificationAction = null;
            }
            return new NotificationButton(optString, optString2, optString3, optString4, notificationAction);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NotificationButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NotificationButton a(Serializer serializer) {
            return new NotificationButton(serializer.H(), serializer.H(), serializer.H(), serializer.H(), (NotificationAction) serializer.G(NotificationAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotificationButton[i];
        }
    }

    public NotificationButton(String str, String str2, String str3, String str4, NotificationAction notificationAction) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = notificationAction;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
    }
}

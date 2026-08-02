package com.vk.toggle.data;

import com.vk.log.L;
import com.vk.toggle.data.GroupType;
import org.json.JSONObject;

/* compiled from: VideoNotificationRedesignConfig.kt */
/* loaded from: classes11.dex */
public final class c {
    public static final a b = new a();
    public final GroupType a;

    /* compiled from: VideoNotificationRedesignConfig.kt */
    public static final class a {
        public static c a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                GroupType.a aVar = GroupType.Companion;
                String string = jSONObject.getString("groupType");
                aVar.getClass();
                return new c(GroupType.a.a(string));
            } catch (Exception e) {
                L.i(e);
                return new c(GroupType.DEFAULT);
            }
        }
    }

    public c(GroupType groupType) {
        this.a = groupType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoNotificationRedesignConfig(groupType=" + this.a + ')';
    }

    public c() {
        this(GroupType.DEFAULT);
    }
}

package com.vk.dto.common.actions;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bh10;
import xsna.drm0;
import xsna.epx;
import xsna.yq;
import xsna.zcl;

/* compiled from: ActionOpenVkApp.kt */
/* loaded from: classes18.dex */
public final class ActionOpenVkApp extends Action {
    public static final Serializer.c<ActionOpenVkApp> CREATOR = new b();
    public final String c;
    public final long d;
    public final String e;
    public final ButtonContext f;

    /* compiled from: ActionOpenVkApp.kt */
    public static final class a {
        public static ActionOpenVkApp a(JSONObject jSONObject) {
            long optLong;
            JSONObject optJSONObject = jSONObject.optJSONObject("app_launch_params");
            if (optJSONObject != null) {
                optLong = optJSONObject.getLong("app_id");
            } else {
                JSONObject optJSONObject2 = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                optLong = optJSONObject2 != null ? optJSONObject2.optLong("id") : 0L;
            }
            long j = optLong;
            String optString = optJSONObject != null ? optJSONObject.optString("webview_url") : null;
            if (optString == null || drm0.N(optString)) {
                optString = jSONObject.optString("url");
            }
            String str = optString;
            String optString2 = jSONObject.optString("target");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("context");
            return new ActionOpenVkApp(optString2, j, str, optJSONObject3 != null ? new ButtonContext(optJSONObject3.optLong("object_id"), optJSONObject3.optString("original_url"), optJSONObject3.optString("view_url")) : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ActionOpenVkApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenVkApp a(Serializer serializer) {
            return new ActionOpenVkApp(serializer.H(), serializer.w(), serializer.H(), (ButtonContext) serializer.G(ButtonContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenVkApp[i];
        }
    }

    public /* synthetic */ ActionOpenVkApp(String str, long j, String str2, ButtonContext buttonContext, int i, zcl zclVar) {
        this(str, j, str2, (i & 8) != 0 ? null : buttonContext);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.Y(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "open_vkapp");
        d.put("target", this.c);
        d.put("url", this.e);
        ButtonContext buttonContext = this.f;
        d.put("context", buttonContext != null ? buttonContext.e5() : null);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionOpenVkApp)) {
            return false;
        }
        ActionOpenVkApp actionOpenVkApp = (ActionOpenVkApp) obj;
        return epx.f(this.c, actionOpenVkApp.c) && this.d == actionOpenVkApp.d && epx.f(this.e, actionOpenVkApp.e) && epx.f(this.f, actionOpenVkApp.f);
    }

    public final int hashCode() {
        String str = this.c;
        int a2 = bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        String str2 = this.e;
        int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonContext buttonContext = this.f;
        return hashCode + (buttonContext != null ? buttonContext.hashCode() : 0);
    }

    public final String toString() {
        return "ActionOpenVkApp(target=" + this.c + ", appId=" + this.d + ", url=" + this.e + ", context=" + this.f + ')';
    }

    public ActionOpenVkApp(String str, long j, String str2, ButtonContext buttonContext) {
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = buttonContext;
    }
}

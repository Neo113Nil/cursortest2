package com.vk.superapp.api.dto.widgets.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import org.json.JSONObject;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.juu;

/* compiled from: WebActionOpenVkApp.kt */
/* loaded from: classes6.dex */
public final class WebActionOpenVkApp extends WebAction implements juu {
    public static final a CREATOR = new a();
    public final String c;
    public final long d;
    public final String e;
    public final WebButtonContext f;
    public final String g;
    public final WebAction h;
    public final String i;
    public final String j;
    public final boolean k;

    /* compiled from: WebActionOpenVkApp.kt */
    public static final class a implements Parcelable.Creator<WebActionOpenVkApp> {
        public static WebActionOpenVkApp a(JSONObject jSONObject) {
            WebButtonContext webButtonContext;
            JSONObject optJSONObject = jSONObject.optJSONObject("app_launch_params");
            long j = optJSONObject != null ? optJSONObject.getLong("app_id") : 0L;
            String optString = optJSONObject != null ? optJSONObject.optString("webview_url") : null;
            if (optString == null || optString.length() == 0) {
                optString = jSONObject.optString("url");
            }
            String str = optString;
            String string = jSONObject.getString("type");
            String optString2 = jSONObject.optString("target");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("context");
            if (optJSONObject2 != null) {
                WebButtonContext.CREATOR.getClass();
                webButtonContext = new WebButtonContext(optJSONObject2.optLong("object_id"), optJSONObject2.optString("original_url"), optJSONObject2.optString("view_url"));
            } else {
                webButtonContext = null;
            }
            String optString3 = jSONObject.optString("track_code");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("fallback_action");
            return new WebActionOpenVkApp(optString2, j, str, webButtonContext, optString3, optJSONObject3 != null ? WebAction.a.a(optJSONObject3, null) : null, jSONObject.optString("accessibility_label"), string);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionOpenVkApp createFromParcel(Parcel parcel) {
            return new WebActionOpenVkApp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WebActionOpenVkApp[] newArray(int i) {
            return new WebActionOpenVkApp[i];
        }
    }

    public WebActionOpenVkApp(String str, long j, String str2, WebButtonContext webButtonContext, String str3, WebAction webAction, String str4, String str5) {
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = webButtonContext;
        this.g = str3;
        this.h = webAction;
        this.i = str4;
        this.j = str5;
        this.k = true;
    }

    @Override // xsna.juu
    public final boolean d() {
        return this.k;
    }

    @Override // xsna.juu
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionOpenVkApp)) {
            return false;
        }
        WebActionOpenVkApp webActionOpenVkApp = (WebActionOpenVkApp) obj;
        return epx.f(this.c, webActionOpenVkApp.c) && this.d == webActionOpenVkApp.d && epx.f(this.e, webActionOpenVkApp.e) && epx.f(this.f, webActionOpenVkApp.f) && epx.f(this.g, webActionOpenVkApp.g) && epx.f(this.h, webActionOpenVkApp.h) && epx.f(this.i, webActionOpenVkApp.i) && epx.f(this.j, webActionOpenVkApp.j);
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final String f() {
        return this.i;
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction
    public final WebAction g() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.c;
        int a2 = bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        String str2 = this.e;
        int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WebButtonContext webButtonContext = this.f;
        int hashCode2 = (hashCode + (webButtonContext == null ? 0 : webButtonContext.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WebAction webAction = this.h;
        int hashCode4 = (hashCode3 + (webAction == null ? 0 : webAction.hashCode())) * 31;
        String str4 = this.i;
        return this.j.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionOpenVkApp(target=");
        sb.append(this.c);
        sb.append(", appId=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", context=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", fallbackAction=");
        sb.append(this.h);
        sb.append(", accessibilityLabel=");
        sb.append(this.i);
        sb.append(", type=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // com.vk.superapp.api.dto.widgets.actions.WebAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }

    public WebActionOpenVkApp(Parcel parcel) {
        this(parcel.readString(), parcel.readLong(), parcel.readString(), (WebButtonContext) parcel.readParcelable(WebButtonContext.class.getClassLoader()), parcel.readString(), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()), parcel.readString(), parcel.readString());
    }
}

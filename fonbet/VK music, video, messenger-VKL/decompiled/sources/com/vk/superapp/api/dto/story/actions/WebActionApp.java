package com.vk.superapp.api.dto.story.actions;

import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionApp.kt */
/* loaded from: classes6.dex */
public final class WebActionApp extends StickerAction {
    public static final Serializer.c<WebActionApp> CREATOR = new a();
    public final int b;
    public final String c;
    public final WebStickerType d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebActionApp> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionApp a(Serializer serializer) {
            return new WebActionApp(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionApp[i];
        }
    }

    public WebActionApp(int i, String str) {
        this.b = i;
        this.c = str;
        this.d = WebStickerType.APP;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", this.b);
        jSONObject.put(X3.i.L0, this.c);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebActionApp)) {
            return false;
        }
        WebActionApp webActionApp = (WebActionApp) obj;
        return this.b == webActionApp.b && epx.f(this.c, webActionApp.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebActionApp(appId=");
        sb.append(this.b);
        sb.append(", appContext=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.d;
    }

    public WebActionApp(Serializer serializer) {
        this(serializer.u(), serializer.H());
    }
}

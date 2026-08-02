package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.actions.StickerAction;
import defpackage.q0;
import org.json.JSONObject;
import xsna.epx;
import xsna.qoy;

/* compiled from: WebNativeSticker.kt */
/* loaded from: classes6.dex */
public final class WebNativeSticker extends WebSticker {
    public static final Serializer.c<WebNativeSticker> CREATOR = new a();
    public final String d;
    public final StickerAction e;
    public final WebTransform f;
    public final boolean g;
    public final boolean h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebNativeSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebNativeSticker a(Serializer serializer) {
            return new WebNativeSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebNativeSticker[i];
        }
    }

    public WebNativeSticker(String str, StickerAction stickerAction, WebTransform webTransform, boolean z, boolean z2) {
        super(webTransform, z, z2);
        this.d = str;
        this.e = stickerAction;
        this.f = webTransform;
        this.g = z;
        this.h = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action_type", this.d);
        jSONObject.put("action", this.e.Ab());
        jSONObject.put("transform", this.f.e5());
        jSONObject.put("can_delete", this.g);
        jSONObject.put("is_static", this.h);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebNativeSticker)) {
            return false;
        }
        WebNativeSticker webNativeSticker = (WebNativeSticker) obj;
        return epx.f(this.d, webNativeSticker.d) && epx.f(this.e, webNativeSticker.e) && epx.f(this.f, webNativeSticker.f) && this.g == webNativeSticker.g && this.h == webNativeSticker.h;
    }

    @Override // com.vk.superapp.api.dto.story.WebSticker
    public final boolean g1() {
        return this.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebNativeSticker(actionType=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", transform=");
        sb.append(this.f);
        sb.append(", canDelete=");
        sb.append(this.g);
        sb.append(", isStatic=");
        return q0.a(sb, this.h, ')');
    }

    @Override // com.vk.superapp.api.dto.story.WebSticker
    public final WebTransform zb() {
        return this.f;
    }

    public WebNativeSticker(Serializer serializer) {
        this(serializer.H(), (StickerAction) serializer.G(StickerAction.class.getClassLoader()), (WebTransform) serializer.G(WebTransform.class.getClassLoader()), serializer.m(), serializer.m());
    }
}

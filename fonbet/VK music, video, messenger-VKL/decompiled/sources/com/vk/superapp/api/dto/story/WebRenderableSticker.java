package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.qoy;

/* compiled from: WebRenderableSticker.kt */
/* loaded from: classes6.dex */
public final class WebRenderableSticker extends WebSticker {
    public static final Serializer.c<WebRenderableSticker> CREATOR = new a();
    public final String d;
    public final String e;
    public final String f;
    public final WebTransform g;
    public final List<WebClickableZone> h;
    public final Integer i;
    public final Integer j;
    public final boolean k;
    public final boolean l;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebRenderableSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebRenderableSticker a(Serializer serializer) {
            return new WebRenderableSticker(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebRenderableSticker[i];
        }
    }

    public WebRenderableSticker(String str, String str2, String str3, WebTransform webTransform, List<WebClickableZone> list, Integer num, Integer num2, boolean z, boolean z2) {
        super(webTransform, z, z2);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = webTransform;
        this.h = list;
        this.i = num;
        this.j = num2;
        this.k = z;
        this.l = z2;
    }

    public static WebRenderableSticker Ab(WebRenderableSticker webRenderableSticker, String str, String str2, Integer num, Integer num2, int i) {
        String str3 = webRenderableSticker.d;
        if ((i & 2) != 0) {
            str = webRenderableSticker.e;
        }
        String str4 = str;
        WebTransform webTransform = webRenderableSticker.g;
        List<WebClickableZone> list = webRenderableSticker.h;
        if ((i & 32) != 0) {
            num = webRenderableSticker.i;
        }
        Integer num3 = num;
        if ((i & 64) != 0) {
            num2 = webRenderableSticker.j;
        }
        boolean z = webRenderableSticker.k;
        boolean z2 = webRenderableSticker.l;
        webRenderableSticker.getClass();
        return new WebRenderableSticker(str3, str4, str2, webTransform, list, num3, num2, z, z2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.W(this.h);
        serializer.V(this.i);
        serializer.V(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        Collection collection;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content_type", this.d);
        jSONObject.put("url", this.e);
        jSONObject.put("blob", this.f);
        jSONObject.put("transform", this.g.e5());
        List<WebClickableZone> list = this.h;
        if (list != null) {
            List<WebClickableZone> list2 = list;
            collection = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                collection.add(((WebClickableZone) it.next()).e5());
            }
        } else {
            collection = EmptyList.b;
        }
        jSONObject.put("clickable_zones", new JSONArray(collection));
        jSONObject.put("original_width", this.i);
        jSONObject.put("original_height", this.j);
        jSONObject.put("can_delete", this.k);
        jSONObject.put("locked", this.l);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRenderableSticker)) {
            return false;
        }
        WebRenderableSticker webRenderableSticker = (WebRenderableSticker) obj;
        return epx.f(this.d, webRenderableSticker.d) && epx.f(this.e, webRenderableSticker.e) && epx.f(this.f, webRenderableSticker.f) && epx.f(this.g, webRenderableSticker.g) && epx.f(this.h, webRenderableSticker.h) && epx.f(this.i, webRenderableSticker.i) && epx.f(this.j, webRenderableSticker.j) && this.k == webRenderableSticker.k && this.l == webRenderableSticker.l;
    }

    @Override // com.vk.superapp.api.dto.story.WebSticker
    public final boolean g1() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List<WebClickableZone> list = this.h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.i;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        return Boolean.hashCode(this.l) + qoy.b((hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebRenderableSticker(contentType=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", blob=");
        sb.append(this.f);
        sb.append(", transform=");
        sb.append(this.g);
        sb.append(", clickableZones=");
        sb.append(this.h);
        sb.append(", originalWidth=");
        sb.append(this.i);
        sb.append(", originalHeight=");
        sb.append(this.j);
        sb.append(", canDelete=");
        sb.append(this.k);
        sb.append(", isStatic=");
        return q0.a(sb, this.l, ')');
    }

    @Override // com.vk.superapp.api.dto.story.WebSticker
    public final WebTransform zb() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebRenderableSticker(Serializer serializer) {
        this(r1, r2, r3, r4, r5, serializer.v(), serializer.v(), serializer.m(), serializer.m());
        String H = serializer.H();
        String H2 = serializer.H();
        String H3 = serializer.H();
        WebTransform webTransform = (WebTransform) serializer.G(WebTransform.class.getClassLoader());
        ArrayList k = serializer.k(WebClickableZone.class);
        ArrayList arrayList = null;
        if (k != null) {
            arrayList = k.isEmpty() ? null : k;
        }
    }
}

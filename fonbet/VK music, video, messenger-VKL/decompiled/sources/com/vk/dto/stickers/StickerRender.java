package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.fw3;
import xsna.m900;
import xsna.qoy;

/* compiled from: StickerRender.kt */
/* loaded from: classes18.dex */
public final class StickerRender extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerRender> CREATOR = new b();
    public final String b;
    public final ImageList c;
    public final ImageList d;
    public final boolean e;
    public final boolean f;

    /* compiled from: StickerRender.kt */
    public static final class a {
        public static StickerRender a(JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            ArrayList arrayList3 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList3.add(jSONArray.getJSONObject(i));
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                m900<String, Image> m900Var = Image.g;
                Image b = Image.a.b(jSONObject2);
                if (epx.f(jSONObject2.optString("theme", "light"), "dark")) {
                    arrayList2.add(b);
                } else {
                    arrayList.add(b);
                }
            }
            return new StickerRender(jSONObject.getString("id"), new ImageList(arrayList), new ImageList(arrayList2), jSONObject.getBoolean("is_stub"), jSONObject.getBoolean("is_rendering"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StickerRender> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerRender a(Serializer serializer) {
            return new StickerRender(serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerRender[i];
        }
    }

    public StickerRender(String str, ImageList imageList, ImageList imageList2, boolean z, boolean z2) {
        this.b = str;
        this.c = imageList;
        this.d = imageList2;
        this.e = z;
        this.f = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerRender)) {
            return false;
        }
        StickerRender stickerRender = (StickerRender) obj;
        return epx.f(this.b, stickerRender.b) && epx.f(this.c, stickerRender.c) && epx.f(this.d, stickerRender.d) && this.e == stickerRender.e && this.f == stickerRender.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d.b), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerRender(id=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", imageDark=");
        sb.append(this.d);
        sb.append(", isStub=");
        sb.append(this.e);
        sb.append(", isRendering=");
        return q0.a(sb, this.f, ')');
    }
}

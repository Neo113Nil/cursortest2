package com.vk.superapp.api.dto.story;

import com.vk.core.serialize.Serializer;
import java.util.Collection;
import java.util.List;
import xsna.epx;
import xsna.qoy;

/* compiled from: WebStoryBox.kt */
/* loaded from: classes6.dex */
public final class WebStoryBox extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebStoryBox> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final WebStoryAttachment g;
    public final List<WebSticker> h;
    public final WebServiceInfo i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<WebStoryBox> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebStoryBox a(Serializer serializer) {
            return new WebStoryBox(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebStoryBox[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebStoryBox(String str, String str2, String str3, String str4, boolean z, WebStoryAttachment webStoryAttachment, List<? extends WebSticker> list, WebServiceInfo webServiceInfo) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = webStoryAttachment;
        this.h = list;
        this.i = webServiceInfo;
    }

    public static WebStoryBox zb(WebStoryBox webStoryBox, String str, String str2, List list, int i) {
        String str3 = webStoryBox.b;
        String str4 = webStoryBox.c;
        if ((i & 4) != 0) {
            str = webStoryBox.d;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = webStoryBox.e;
        }
        String str6 = str2;
        boolean z = webStoryBox.f;
        WebStoryAttachment webStoryAttachment = webStoryBox.g;
        if ((i & 64) != 0) {
            list = webStoryBox.h;
        }
        WebServiceInfo webServiceInfo = webStoryBox.i;
        webStoryBox.getClass();
        return new WebStoryBox(str3, str4, str5, str6, z, webStoryAttachment, list, webServiceInfo);
    }

    public final WebServiceInfo Ab() {
        return this.i;
    }

    public final boolean Bb() {
        return !epx.f(this.b, "none");
    }

    public final boolean Cb() {
        return "front".equals(this.c);
    }

    public final boolean Db() {
        List<WebSticker> list = this.h;
        if (list == null) {
            return false;
        }
        List<WebSticker> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (WebSticker webSticker : list2) {
            if ((webSticker instanceof WebNativeSticker) && epx.f(((WebNativeSticker) webSticker).d, WebStickerType.SITUATIONAL_TEMPLATE.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.i0(this.g);
        serializer.W(this.h);
        serializer.i0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebStoryBox)) {
            return false;
        }
        WebStoryBox webStoryBox = (WebStoryBox) obj;
        return epx.f(this.b, webStoryBox.b) && epx.f(this.c, webStoryBox.c) && epx.f(this.d, webStoryBox.d) && epx.f(this.e, webStoryBox.e) && this.f == webStoryBox.f && epx.f(this.g, webStoryBox.g) && epx.f(this.h, webStoryBox.h) && epx.f(this.i, webStoryBox.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int b = qoy.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        WebStoryAttachment webStoryAttachment = this.g;
        int hashCode4 = (b + (webStoryAttachment == null ? 0 : webStoryAttachment.hashCode())) * 31;
        List<WebSticker> list = this.h;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        WebServiceInfo webServiceInfo = this.i;
        return hashCode5 + (webServiceInfo != null ? webServiceInfo.hashCode() : 0);
    }

    public final String toString() {
        return "WebStoryBox(backgroundType=" + this.b + ", cameraType=" + this.c + ", url=" + this.d + ", blob=" + this.e + ", locked=" + this.f + ", webStoryAttachment=" + this.g + ", stickers=" + this.h + ", serviceInfo=" + this.i + ')';
    }

    public WebStoryBox(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), (WebStoryAttachment) serializer.G(WebStoryAttachment.class.getClassLoader()), serializer.k(WebSticker.class), (WebServiceInfo) serializer.G(WebServiceInfo.class.getClassLoader()));
    }
}

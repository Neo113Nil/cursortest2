package com.vk.dto.user;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.status.StatusImagePopup;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.fq;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ImageStatus.kt */
/* loaded from: classes18.dex */
public final class ImageStatus extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ImageStatus> CREATOR = new b();
    public final int b;
    public final String c;
    public final Image d;
    public final List<String> e;
    public final int f;
    public final String g;
    public final StatusImagePopup h;

    /* compiled from: ImageStatus.kt */
    public static final class a {
        public static ImageStatus a(JSONObject jSONObject) {
            return jSONObject.has("emoji_id") ? com.vk.dto.user.a.a(jSONObject) : com.vk.dto.user.a.c(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ImageStatus> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageStatus a(Serializer serializer) {
            return new ImageStatus(serializer.u(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), com.vk.core.serialize.a.a(serializer), serializer.u(), serializer.H(), (StatusImagePopup) serializer.G(StatusImagePopup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageStatus[i];
        }
    }

    public ImageStatus(int i, String str, Image image, List<String> list) {
        this(i, str, image, list, 0, null, null, 112, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.l0(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        int i = this.f;
        String str = this.c;
        Image image = this.d;
        if (i == -1) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.b);
            jSONObject.put("name", str);
            jSONObject.put("images", image.Gb());
            jSONObject.put("tags", new JSONArray((Collection) this.e));
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("image", image.Gb());
        jSONObject2.put("emoji_id", i);
        jSONObject2.put("event_name", this.g);
        jSONObject2.put("title", str);
        StatusImagePopup statusImagePopup = this.h;
        if (statusImagePopup == null) {
            return jSONObject2;
        }
        jSONObject2.put("text", statusImagePopup.f);
        List<LinkButton> list = statusImagePopup.h;
        LinkButton linkButton = (list == null || list.isEmpty()) ? null : list.get(0);
        if (linkButton == null) {
            return jSONObject2;
        }
        jSONObject2.put("button", linkButton.e5());
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageStatus)) {
            return false;
        }
        ImageStatus imageStatus = (ImageStatus) obj;
        return this.b == imageStatus.b && epx.f(this.c, imageStatus.c) && epx.f(this.d, imageStatus.d) && epx.f(this.e, imageStatus.e) && this.f == imageStatus.f && epx.f(this.g, imageStatus.g) && epx.f(this.h, imageStatus.h);
    }

    public final int hashCode() {
        int b2 = fq.b(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31);
        List<String> list = this.e;
        int a2 = urd0.a(shy.a(this.f, (b2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.g);
        StatusImagePopup statusImagePopup = this.h;
        return a2 + (statusImagePopup != null ? statusImagePopup.hashCode() : 0);
    }

    public final String toString() {
        return "ImageStatus(id=" + this.b + ", title=" + this.c + ", image=" + this.d + ", tags=" + this.e + ", emojiId=" + this.f + ", eventName=" + this.g + ", localPopup=" + this.h + ')';
    }

    public /* synthetic */ ImageStatus(int i, String str, Image image, List list, int i2, String str2, StatusImagePopup statusImagePopup, int i3, zcl zclVar) {
        this(i, str, image, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? null : statusImagePopup);
    }

    public ImageStatus(int i, String str, Image image, List<String> list, int i2, String str2, StatusImagePopup statusImagePopup) {
        this.b = i;
        this.c = str;
        this.d = image;
        this.e = list;
        this.f = i2;
        this.g = str2;
        this.h = statusImagePopup;
    }
}

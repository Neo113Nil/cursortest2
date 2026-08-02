package com.vk.dto.common;

import android.text.TextUtils;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSizeKey;
import com.vk.log.L;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.fxj0;
import xsna.m900;
import xsna.rl3;
import xsna.zcl;

/* compiled from: ImageSize.kt */
/* loaded from: classes18.dex */
public final class ImageSize extends Serializer.StreamParcelableAdapter implements Comparable<ImageSize>, bxx, fxj0 {
    public static final Serializer.c<ImageSize> CREATOR;
    public static final m900<String, ImageSize> e = new m900<>(100);
    public static final ImageSize f;
    public static final char[] g;
    public static final char[] h;
    public static final char[] i;
    public static final Set<Character> j;
    public final char b;
    public final boolean c;
    public final com.vk.dto.common.im.Image d;

    /* compiled from: ImageSize.kt */
    public static final class a extends Serializer.c<ImageSize> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageSize a(Serializer serializer) {
            return new ImageSize(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageSize[i];
        }
    }

    /* compiled from: ImageSize.kt */
    public static final class b {
        public static ImageSize a(String str) {
            return new ImageSize(str, 480, 480, Boolean.TRUE, (char) 0, false, 48, null);
        }

        public static ImageSize b(String str) {
            if (str == null) {
                return null;
            }
            ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_M_0130;
            return new ImageSize(str, imageSizeKey.getWidth(), imageSizeKey.getWidth(), Boolean.FALSE, imageSizeKey.i(), false, 32, null);
        }

        public static char c(int i, int i2) {
            Object obj;
            int max = Math.max(i, i2);
            if (max == 0) {
                return ImageSizeKey.SIZE_KEY_UNDEFINED;
            }
            Iterator<E> it = ImageSizeKey.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (max <= ((ImageSizeKey) obj).getWidth()) {
                    break;
                }
            }
            ImageSizeKey imageSizeKey = (ImageSizeKey) obj;
            return imageSizeKey != null ? imageSizeKey.i() : ImageSizeKey.SIZE_W_2560.i();
        }

        public static char d(int i, int i2, boolean z) {
            return z ? ImageSizeKey.SIZE_KEY_BASE : c(i, i2);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        ImageSizeKey imageSizeKey = ImageSizeKey.SIZE_M_0130;
        f = new ImageSize("", 1, 1, bool, imageSizeKey.i(), false, 32, null);
        ImageSizeKey imageSizeKey2 = ImageSizeKey.SIZE_R_0510;
        char i2 = imageSizeKey2.i();
        ImageSizeKey imageSizeKey3 = ImageSizeKey.SIZE_Q_0320;
        char i3 = imageSizeKey3.i();
        ImageSizeKey imageSizeKey4 = ImageSizeKey.SIZE_P_0200;
        char i4 = imageSizeKey4.i();
        char i5 = imageSizeKey.i();
        ImageSizeKey imageSizeKey5 = ImageSizeKey.SIZE_O_0130;
        char i6 = imageSizeKey5.i();
        ImageSizeKey imageSizeKey6 = ImageSizeKey.SIZE_S_0075;
        g = new char[]{i2, i3, i4, i5, i6, imageSizeKey6.i()};
        ImageSizeKey imageSizeKey7 = ImageSizeKey.SIZE_X_0604;
        h = new char[]{imageSizeKey7.i(), imageSizeKey2.i(), imageSizeKey3.i(), imageSizeKey4.i(), imageSizeKey.i(), imageSizeKey5.i(), imageSizeKey6.i()};
        ImageSizeKey imageSizeKey8 = ImageSizeKey.SIZE_Z_1080;
        char i7 = imageSizeKey8.i();
        ImageSizeKey imageSizeKey9 = ImageSizeKey.SIZE_Y_0807;
        char i8 = imageSizeKey9.i();
        char i9 = imageSizeKey7.i();
        ImageSizeKey imageSizeKey10 = ImageSizeKey.SIZE_W_2560;
        i = new char[]{i7, i8, i9, imageSizeKey10.i(), imageSizeKey2.i(), imageSizeKey3.i(), imageSizeKey4.i(), imageSizeKey.i(), imageSizeKey5.i(), imageSizeKey6.i()};
        j = rl3.y0(new Character[]{Character.valueOf(imageSizeKey6.i()), Character.valueOf(imageSizeKey.i()), Character.valueOf(imageSizeKey7.i()), Character.valueOf(imageSizeKey9.i()), Character.valueOf(imageSizeKey8.i()), Character.valueOf(imageSizeKey10.i())});
        CREATOR = new a();
    }

    public ImageSize(String str, int i2, int i3) {
        this(str, i2, i3, null, (char) 0, false, 56, null);
    }

    public final boolean Ab() {
        return this.c;
    }

    public final com.vk.dto.common.im.Image Bb() {
        return this.d;
    }

    public final float E0() {
        com.vk.dto.common.im.Image image = this.d;
        return (image.b * 1.0f) / image.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.d);
        serializer.N(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.fxj0
    public final boolean c7() {
        return this.b == '*';
    }

    @Override // java.lang.Comparable
    public final int compareTo(ImageSize imageSize) {
        int e6;
        int e62;
        ImageSize imageSize2 = imageSize;
        if (imageSize2 != null && (e6 = e6()) <= (e62 = imageSize2.e6())) {
            return e6 < e62 ? -1 : 0;
        }
        return 1;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        com.vk.dto.common.im.Image image = this.d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", image.d);
            jSONObject.put("width", image.b);
            jSONObject.put("height", image.c);
            jSONObject.put("type", String.valueOf(this.b));
            jSONObject.put("with_padding", this.c);
            return jSONObject;
        } catch (JSONException e2) {
            L.i(e2);
            return jSONObject;
        }
    }

    @Override // xsna.fxj0
    public final int e6() {
        com.vk.dto.common.im.Image image = this.d;
        return image.b * image.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ImageSize) {
            return epx.f(this.d.d, ((ImageSize) obj).d.d);
        }
        return false;
    }

    @Override // xsna.fxj0
    public final int getHeight() {
        return this.d.c;
    }

    @Override // xsna.fxj0
    public final String getUrl() {
        return this.d.d;
    }

    @Override // xsna.fxj0
    public final int getWidth() {
        return this.d.b;
    }

    public final int hashCode() {
        return Objects.hash(this.d, Character.valueOf(this.b), Boolean.valueOf(this.c));
    }

    @Override // xsna.fxj0
    public final fxj0 kb(int i2, int i3, String str) {
        m900<String, ImageSize> m900Var = e;
        ImageSize imageSize = m900Var.get(str);
        if (imageSize != null) {
            com.vk.dto.common.im.Image image = imageSize.d;
            if (image.b == i2 && image.c == i3) {
                return imageSize;
            }
        }
        ImageSize imageSize2 = new ImageSize(str, i2, i3, null, (char) 0, false, 56, null);
        m900Var.put(str, imageSize2);
        return imageSize2;
    }

    public final String toString() {
        return "ImageSize{image='" + this.d + ", type=" + this.b + ", withPadding=" + this.c + ", isBase=" + c7() + '}';
    }

    public final ImageSize zb() {
        return new ImageSize(this.d, this.b, this.c);
    }

    public ImageSize(String str, int i2, int i3, Boolean bool, char c) {
        this(str, i2, i3, bool, c, false, 32, null);
    }

    public ImageSize(com.vk.dto.common.im.Image image, char c, boolean z, int i2, zcl zclVar) {
        this(image, (i2 & 2) != 0 ? b.c(image.b, image.c) : c, (i2 & 4) != 0 ? false : z);
    }

    public /* synthetic */ ImageSize(JSONObject jSONObject, String str, int i2, zcl zclVar) {
        this(jSONObject, (i2 & 2) != 0 ? null : str);
    }

    public ImageSize(JSONObject jSONObject, String str) {
        char d;
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(str) ? "" : str);
        sb.append(jSONObject.getString(jSONObject.has("url") ? "url" : "src"));
        String sb2 = sb.toString();
        int optInt = jSONObject.optInt("width", 135);
        int optInt2 = jSONObject.optInt("height", 100);
        boolean optBoolean = jSONObject.optBoolean("is_base", false);
        char c = ImageSizeKey.SIZE_KEY_BASE;
        if (optBoolean) {
            d = '*';
        } else {
            ImageSizeKey.a aVar = ImageSizeKey.Companion;
            char i2 = ImageSizeKey.SIZE_M_0130.i();
            aVar.getClass();
            d = ImageSizeKey.a.d(jSONObject, i2);
        }
        this.d = new com.vk.dto.common.im.Image(optInt > 0 ? optInt : 135, optInt2 > 0 ? optInt2 : 100, sb2, d == '*');
        this.c = jSONObject.optInt("with_padding") == 1;
        if (!optBoolean) {
            ImageSizeKey.a aVar2 = ImageSizeKey.Companion;
            char c2 = b.c(optInt, optInt2);
            aVar2.getClass();
            c = ImageSizeKey.a.d(jSONObject, c2);
        }
        this.b = c;
    }

    public /* synthetic */ ImageSize(String str, int i2, char c, boolean z, int i3, zcl zclVar) {
        this(str, i2, (i3 & 4) != 0 ? b.c(i2, i2) : c, (i3 & 8) != 0 ? false : z);
    }

    public ImageSize(String str, int i2, char c, boolean z) {
        this(str, i2, i2, Boolean.valueOf(c == '*'), c, z);
    }

    public /* synthetic */ ImageSize(String str, int i2, int i3, Boolean bool, char c, boolean z, int i4, zcl zclVar) {
        this(str, i2, i3, (i4 & 8) != 0 ? Boolean.FALSE : bool, (i4 & 16) != 0 ? b.c(i2, i3) : c, (i4 & 32) != 0 ? false : z);
    }

    public ImageSize(String str, int i2, int i3, Boolean bool, char c, boolean z) {
        this.b = epx.f(bool, Boolean.TRUE) ? '*' : c;
        this.c = z;
        this.d = new com.vk.dto.common.im.Image(i2, i3, str == null ? "" : str, c == '*');
    }

    public ImageSize(com.vk.dto.common.im.Image image, char c, boolean z) {
        this.b = c;
        this.c = z;
        this.d = image;
    }

    public ImageSize(Serializer serializer) {
        this((com.vk.dto.common.im.Image) serializer.G(com.vk.dto.common.im.Image.class.getClassLoader()), serializer.q(), serializer.m());
    }
}

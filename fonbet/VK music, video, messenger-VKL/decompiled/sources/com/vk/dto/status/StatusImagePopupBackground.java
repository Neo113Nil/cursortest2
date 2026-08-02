package com.vk.dto.status;

import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.er;

/* compiled from: StatusImagePopupBackground.kt */
/* loaded from: classes18.dex */
public final class StatusImagePopupBackground extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StatusImagePopupBackground> CREATOR = new a();
    public final Theme b;
    public final Theme c;

    /* compiled from: StatusImagePopupBackground.kt */
    public static final class Theme extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Theme> CREATOR = new b();
        public final int b;
        public final Image c;

        /* compiled from: StatusImagePopupBackground.kt */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static Theme a(JSONObject jSONObject) {
                int i;
                Image image;
                try {
                    i = Color.parseColor("#" + jSONObject.optString("color"));
                } catch (IllegalArgumentException unused) {
                    i = 0;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("images");
                if (optJSONArray != null) {
                    image = new Image(optJSONArray, null, 2, 0 == true ? 1 : 0);
                } else {
                    image = Image.d;
                }
                return new Theme(i, image);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<Theme> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Theme a(Serializer serializer) {
                return new Theme(serializer.u(), (Image) serializer.G(Image.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Theme[i];
            }
        }

        public Theme(int i, Image image) {
            this.b = i;
            this.c = image;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.i0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) obj;
            return this.b == theme.b && epx.f(this.c, theme.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Theme(color=");
            sb.append(this.b);
            sb.append(", image=");
            return er.d(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StatusImagePopupBackground> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StatusImagePopupBackground a(Serializer serializer) {
            return new StatusImagePopupBackground((Theme) serializer.G(Theme.class.getClassLoader()), (Theme) serializer.G(Theme.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusImagePopupBackground[i];
        }
    }

    public StatusImagePopupBackground(Theme theme, Theme theme2) {
        this.b = theme;
        this.c = theme2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusImagePopupBackground)) {
            return false;
        }
        StatusImagePopupBackground statusImagePopupBackground = (StatusImagePopupBackground) obj;
        return epx.f(this.b, statusImagePopupBackground.b) && epx.f(this.c, statusImagePopupBackground.c);
    }

    public final int hashCode() {
        Theme theme = this.b;
        int hashCode = (theme == null ? 0 : theme.hashCode()) * 31;
        Theme theme2 = this.c;
        return hashCode + (theme2 != null ? theme2.hashCode() : 0);
    }

    public final String toString() {
        return "StatusImagePopupBackground(light=" + this.b + ", dark=" + this.c + ')';
    }
}

package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.n701;
import xsna.nby;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new n701();
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    @Nullable
    public String j;
    public int k;
    public int l;

    @Nullable
    public String m;

    @Nullable
    public JSONObject n;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public static final int j(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String k(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.n;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.n;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || nby.a(jSONObject, jSONObject2)) && this.b == textTrackStyle.b && this.c == textTrackStyle.c && this.d == textTrackStyle.d && this.e == textTrackStyle.e && this.f == textTrackStyle.f && this.g == textTrackStyle.g && this.h == textTrackStyle.h && this.i == textTrackStyle.i && o0a.c(this.j, textTrackStyle.j) && this.k == textTrackStyle.k && this.l == textTrackStyle.l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, Integer.valueOf(this.k), Integer.valueOf(this.l), String.valueOf(this.n)});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.b);
            int i = this.c;
            if (i != 0) {
                jSONObject.put("foregroundColor", k(i));
            }
            int i2 = this.d;
            if (i2 != 0) {
                jSONObject.put(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, k(i2));
            }
            int i3 = this.e;
            if (i3 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i3 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i3 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i3 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i3 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i4 = this.f;
            if (i4 != 0) {
                jSONObject.put("edgeColor", k(i4));
            }
            int i5 = this.g;
            if (i5 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i5 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i5 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i6 = this.h;
            if (i6 != 0) {
                jSONObject.put("windowColor", k(i6));
            }
            if (this.g == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.i);
            }
            String str = this.j;
            if (str != null) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_FAMILY, str);
            }
            switch (this.k) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i7 = this.l;
            if (i7 == 0) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "NORMAL");
            } else if (i7 == 1) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "BOLD");
            } else if (i7 == 2) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "ITALIC");
            } else if (i7 == 3) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.n;
        this.m = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        float f = this.b;
        ozg0.v(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.c;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.e;
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.f;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.g;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.h;
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.i;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(i8);
        ozg0.q(parcel, 10, this.j, false);
        int i9 = this.k;
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.l;
        ozg0.v(parcel, 12, 4);
        parcel.writeInt(i10);
        ozg0.q(parcel, 13, this.m, false);
        ozg0.x(w, parcel);
    }

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable String str, int i8, int i9, @Nullable String str2) {
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = str;
        this.k = i8;
        this.l = i9;
        this.m = str2;
        if (str2 == null) {
            this.n = null;
            return;
        }
        try {
            this.n = new JSONObject(this.m);
        } catch (JSONException unused) {
            this.n = null;
            this.m = null;
        }
    }
}

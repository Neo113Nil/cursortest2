package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new zzdf();
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    public String l;
    public JSONObject m;

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = str;
        this.j = i8;
        this.k = i9;
        this.l = str2;
        if (str2 == null) {
            this.m = null;
            return;
        }
        try {
            this.m = new JSONObject(this.l);
        } catch (JSONException unused) {
            this.m = null;
            this.l = null;
        }
    }

    public static final int Z0(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String a1(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public final JSONObject Y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.a);
            int i = this.b;
            if (i != 0) {
                jSONObject.put("foregroundColor", a1(i));
            }
            int i2 = this.c;
            if (i2 != 0) {
                jSONObject.put(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, a1(i2));
            }
            int i3 = this.d;
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
            int i4 = this.e;
            if (i4 != 0) {
                jSONObject.put("edgeColor", a1(i4));
            }
            int i5 = this.f;
            if (i5 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i5 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i5 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i6 = this.g;
            if (i6 != 0) {
                jSONObject.put("windowColor", a1(i6));
            }
            if (this.f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.h);
            }
            String str = this.i;
            if (str != null) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_FAMILY, str);
            }
            switch (this.j) {
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
            int i7 = this.k;
            if (i7 == 0) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "NORMAL");
            } else if (i7 == 1) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "BOLD");
            } else if (i7 == 2) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "ITALIC");
            } else if (i7 == 3) {
                jSONObject.put(TtmlNode.ATTR_TTS_FONT_STYLE, "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.m;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.m;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.m;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.a(jSONObject, jSONObject2)) && this.a == textTrackStyle.a && this.b == textTrackStyle.b && this.c == textTrackStyle.c && this.d == textTrackStyle.d && this.e == textTrackStyle.e && this.f == textTrackStyle.f && this.g == textTrackStyle.g && this.h == textTrackStyle.h && CastUtils.c(this.i, textTrackStyle.i) && this.j == textTrackStyle.j && this.k == textTrackStyle.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int s = SafeParcelWriter.s(parcel, 20293);
        float f = this.a;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.b;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.c;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.d;
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.e;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.f;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.g;
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.h;
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(i8);
        SafeParcelWriter.m(parcel, 10, this.i, false);
        int i9 = this.j;
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.k;
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(i10);
        SafeParcelWriter.m(parcel, 13, this.l, false);
        SafeParcelWriter.t(parcel, s);
    }

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }
}

package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ThemedColor;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import org.json.JSONObject;
import xsna.bxx;
import xsna.cqm0;
import xsna.epx;
import xsna.zcl;

/* compiled from: Text.kt */
/* loaded from: classes18.dex */
public final class Text implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<Text> CREATOR = new b();
    public String b;
    public final ThemedColor c;

    /* compiled from: Text.kt */
    public static final class a {
        public static Text a(JSONObject jSONObject) {
            String optString = jSONObject.optString("text");
            JSONObject optJSONObject = jSONObject.optJSONObject("color");
            ThemedColor themedColor = null;
            if (optJSONObject != null) {
                String a = cqm0.a(optJSONObject.optString("light"));
                Integer a2 = a != null ? n.a("#", a) : null;
                String a3 = cqm0.a(optJSONObject.optString("dark"));
                themedColor = new ThemedColor(a2, a3 != null ? n.a("#", a3) : null);
            }
            return new Text(optString, themedColor);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Text> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Text a(Serializer serializer) {
            return new Text(serializer.H(), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Text[i];
        }
    }

    public Text(String str, ThemedColor themedColor) {
        this.b = str;
        this.c = themedColor;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", this.b);
        ThemedColor themedColor = this.c;
        jSONObject.put("color", themedColor != null ? themedColor.e5() : null);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return epx.f(this.b, text.b) && epx.f(this.c, text.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ThemedColor themedColor = this.c;
        return hashCode + (themedColor != null ? themedColor.hashCode() : 0);
    }

    public final String toString() {
        return "Text(text=" + this.b + ", color=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ Text(String str, ThemedColor themedColor, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : themedColor);
    }
}

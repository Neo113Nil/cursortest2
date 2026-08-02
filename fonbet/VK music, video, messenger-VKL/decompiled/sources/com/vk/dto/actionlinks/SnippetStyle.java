package com.vk.dto.actionlinks;

import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;

/* compiled from: SnippetStyle.kt */
/* loaded from: classes18.dex */
public final class SnippetStyle extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SnippetStyle> CREATOR = new b();
    public final Integer b;
    public final Integer c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<SnippetStyle> {
        @Override // xsna.aay
        public final SnippetStyle a(JSONObject jSONObject) {
            return new SnippetStyle(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SnippetStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SnippetStyle a(Serializer serializer) {
            return new SnippetStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SnippetStyle[i];
        }
    }

    static {
        new a();
    }

    public SnippetStyle(Integer num, Integer num2) {
        this.b = num;
        this.c = num2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnippetStyle)) {
            return false;
        }
        SnippetStyle snippetStyle = (SnippetStyle) obj;
        return epx.f(this.b, snippetStyle.b) && epx.f(this.c, snippetStyle.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.c;
        return intValue + (num2 != null ? num2.intValue() : 0);
    }

    public SnippetStyle(JSONObject jSONObject) {
        try {
            this.b = Integer.valueOf(Color.parseColor(jSONObject.optString("background_color")));
        } catch (Exception unused) {
        }
        try {
            this.c = Integer.valueOf(Color.parseColor(jSONObject.optString("text_color")));
        } catch (Exception unused2) {
        }
    }

    public SnippetStyle(Serializer serializer) {
        this.b = serializer.v();
        this.c = serializer.v();
    }
}

package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.uqi;

/* compiled from: ThemedColor.kt */
/* loaded from: classes18.dex */
public final class ThemedColor implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ThemedColor> CREATOR = new a();
    public final Integer b;
    public final Integer c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ThemedColor> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ThemedColor a(Serializer serializer) {
            return new ThemedColor(serializer.v(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThemedColor[i];
        }
    }

    public ThemedColor(Integer num, Integer num2) {
        this.b = num;
        this.c = num2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
    }

    public final Integer a(boolean z) {
        return z ? this.c : this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        Integer num = this.b;
        if (num != null) {
            jSONObject.put("light", String.format("%06X", Integer.valueOf(num.intValue() & 16777215)));
        }
        Integer num2 = this.c;
        if (num2 != null) {
            jSONObject.put("dark", String.format("%06X", Integer.valueOf(16777215 & num2.intValue())));
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemedColor)) {
            return false;
        }
        ThemedColor themedColor = (ThemedColor) obj;
        return epx.f(this.b, themedColor.b) && epx.f(this.c, themedColor.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemedColor(light=");
        sb.append(this.b);
        sb.append(", dark=");
        return uqi.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

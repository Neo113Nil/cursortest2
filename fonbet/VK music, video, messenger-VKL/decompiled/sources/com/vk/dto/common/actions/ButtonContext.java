package com.vk.dto.common.actions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: ButtonContext.kt */
/* loaded from: classes18.dex */
public final class ButtonContext implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ButtonContext> CREATOR = new a();
    public final long b;
    public final String c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ButtonContext> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ButtonContext a(Serializer serializer) {
            return new ButtonContext(serializer.w(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ButtonContext[i];
        }
    }

    public ButtonContext(long j, String str, String str2) {
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object_id", this.b);
        jSONObject.put("original_url", this.c);
        jSONObject.put("view_url", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonContext)) {
            return false;
        }
        ButtonContext buttonContext = (ButtonContext) obj;
        return this.b == buttonContext.b && epx.f(this.c, buttonContext.c) && epx.f(this.d, buttonContext.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonContext(objectId=");
        sb.append(this.b);
        sb.append(", originalUrl=");
        sb.append(this.c);
        sb.append(", viewUrl=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

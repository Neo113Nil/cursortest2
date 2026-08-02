package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: CallProducerButton.kt */
/* loaded from: classes18.dex */
public final class InaccessibilityMessage implements Serializer.StreamParcelable, bxx {
    public final String b;
    public final String c;
    public static final a d = new a();
    public static final Serializer.c<InaccessibilityMessage> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<InaccessibilityMessage> {
        @Override // xsna.aay
        public final InaccessibilityMessage a(JSONObject jSONObject) {
            return new InaccessibilityMessage(jSONObject.optString("title"), jSONObject.optString("sub_title"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<InaccessibilityMessage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InaccessibilityMessage a(Serializer serializer) {
            return new InaccessibilityMessage(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InaccessibilityMessage[i];
        }
    }

    public InaccessibilityMessage(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", this.b);
        jSONObject.put("sub_title", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InaccessibilityMessage)) {
            return false;
        }
        InaccessibilityMessage inaccessibilityMessage = (InaccessibilityMessage) obj;
        return epx.f(this.b, inaccessibilityMessage.b) && epx.f(this.c, inaccessibilityMessage.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InaccessibilityMessage(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

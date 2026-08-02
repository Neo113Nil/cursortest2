package com.vk.feed.core.models.header;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.bxx;

/* compiled from: HeaderTooltip.kt */
/* loaded from: classes18.dex */
public final class HeaderTooltip implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<HeaderTooltip> CREATOR = new a();
    public final String b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HeaderTooltip> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HeaderTooltip a(Serializer serializer) {
            return new HeaderTooltip(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderTooltip[i];
        }
    }

    public HeaderTooltip(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", this.b);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

package com.vk.dto.market.order;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: CancellationInfo.kt */
/* loaded from: classes18.dex */
public final class CancellationInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<CancellationInfo> CREATOR;
    public static final b d;
    public final String b;
    public final String c;

    /* compiled from: CancellationInfo.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<CancellationInfo> {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.aay
        public final CancellationInfo a(JSONObject jSONObject) {
            this.a.getClass();
            return new CancellationInfo(jSONObject.getString("url"), jSONObject.getString("title"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<CancellationInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CancellationInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String H2 = serializer.H();
            if (H2 != null) {
                return new CancellationInfo(H, H2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationInfo[i];
        }
    }

    static {
        a aVar = new a();
        CREATOR = new c();
        d = new b(aVar);
    }

    public CancellationInfo(String str, String str2) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellationInfo)) {
            return false;
        }
        CancellationInfo cancellationInfo = (CancellationInfo) obj;
        return epx.f(this.b, cancellationInfo.b) && epx.f(this.c, cancellationInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellationInfo(url=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

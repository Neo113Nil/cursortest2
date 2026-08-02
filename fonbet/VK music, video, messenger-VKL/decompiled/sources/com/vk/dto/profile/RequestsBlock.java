package com.vk.dto.profile;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.TrackableOwner;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: RequestsBlock.kt */
/* loaded from: classes18.dex */
public final class RequestsBlock implements Serializer.StreamParcelable {
    public static final Serializer.c<RequestsBlock> CREATOR = new b();
    public final ArrayList<TrackableOwner> b;
    public final int c;
    public final int d;

    /* compiled from: RequestsBlock.kt */
    public static final class a {
        public static RequestsBlock a(JSONObject jSONObject) {
            int optInt = jSONObject.optInt(SignalingProtocol.KEY_OFFSET);
            JSONObject optJSONObject = jSONObject.optJSONObject("requests");
            int optInt2 = optJSONObject != null ? optJSONObject.optInt("count") : 0;
            ArrayList arrayList = null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("items") : null;
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        Serializer.c<TrackableOwner> cVar = TrackableOwner.CREATOR;
                        arrayList.add(TrackableOwner.a.a(optJSONObject2));
                    }
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            return new RequestsBlock(arrayList, optInt2, optInt);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<RequestsBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RequestsBlock a(Serializer serializer) {
            ArrayList j = serializer.j(TrackableOwner.CREATOR);
            if (j == null) {
                j = new ArrayList();
            }
            return new RequestsBlock(j, serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RequestsBlock[i];
        }
    }

    public RequestsBlock(ArrayList<TrackableOwner> arrayList, int i, int i2) {
        this.b = arrayList;
        this.c = i;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestsBlock)) {
            return false;
        }
        RequestsBlock requestsBlock = (RequestsBlock) obj;
        return epx.f(this.b, requestsBlock.b) && this.c == requestsBlock.c && this.d == requestsBlock.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestsBlock(requests=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", offset=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

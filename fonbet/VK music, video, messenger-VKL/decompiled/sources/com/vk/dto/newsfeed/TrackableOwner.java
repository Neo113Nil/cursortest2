package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import org.json.JSONObject;

/* compiled from: TrackableOwner.kt */
/* loaded from: classes18.dex */
public final class TrackableOwner implements Serializer.StreamParcelable {
    public static final Serializer.c<TrackableOwner> CREATOR = new b();
    public final Owner b;
    public final String c;

    /* compiled from: TrackableOwner.kt */
    public static final class a {
        public static TrackableOwner a(JSONObject jSONObject) {
            Serializer.c<Owner> cVar = Owner.CREATOR;
            return new TrackableOwner(Owner.a.f(jSONObject), jSONObject.optString("track_code"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<TrackableOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TrackableOwner a(Serializer serializer) {
            return new TrackableOwner((Owner) serializer.G(Owner.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrackableOwner[i];
        }
    }

    public TrackableOwner(Owner owner, String str) {
        this.b = owner;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

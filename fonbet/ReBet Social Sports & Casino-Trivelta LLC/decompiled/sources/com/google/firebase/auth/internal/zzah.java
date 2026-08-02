package com.google.firebase.auth.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import lb.C5428g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzah implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzah> CREATOR = new C5428g();

    /* renamed from: a, reason: collision with root package name */
    public long f37686a;

    /* renamed from: b, reason: collision with root package name */
    public long f37687b;

    public zzah(long j10, long j11) {
        this.f37686a = j10;
        this.f37687b = j11;
    }

    public static zzah a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzah(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f37686a);
            jSONObject.put("creationTimestamp", this.f37687b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long q() {
        return this.f37687b;
    }

    @Override // com.google.firebase.auth.FirebaseUserMetadata
    public final long s() {
        return this.f37686a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.y(parcel, 1, s());
        b.y(parcel, 2, q());
        b.b(parcel, a10);
    }
}

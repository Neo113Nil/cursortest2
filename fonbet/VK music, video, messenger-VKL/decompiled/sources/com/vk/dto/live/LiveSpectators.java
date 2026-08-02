package com.vk.dto.live;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.h330;
import xsna.t230;
import xsna.uq;
import xsna.xus;

/* loaded from: classes18.dex */
public class LiveSpectators extends t230 implements Parcelable {
    public static final Parcelable.Creator<LiveSpectators> CREATOR = new a();
    public int c;
    public int d;
    public int e;
    public final ArrayList f;
    public final ArrayList g;

    public class a implements Parcelable.Creator<LiveSpectators> {
        @Override // android.os.Parcelable.Creator
        public final LiveSpectators createFromParcel(Parcel parcel) {
            return new LiveSpectators(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveSpectators[] newArray(int i) {
            return new LiveSpectators[i];
        }
    }

    public LiveSpectators() {
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("spectatorsCount ");
        sb.append(this.d);
        sb.append(" liveStatus ");
        sb.append(this.c);
        sb.append(" balance ");
        sb.append(this.e);
        sb.append(" userProfiles ");
        return uq.b(this.f, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
        h330.c(parcel, this.f);
    }

    public LiveSpectators(JSONObject jSONObject) throws JSONException, NullPointerException {
        this.f = new ArrayList();
        this.g = new ArrayList();
        Integer v = xus.v(jSONObject.optString("live_status"));
        if (v != null) {
            this.c = v.intValue();
        }
        this.e = jSONObject.optInt("balance");
        if (jSONObject.has("spectators")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("spectators");
            if (jSONObject2.has("count")) {
                this.d = jSONObject2.getInt("count");
            }
            if (jSONObject2.has("items")) {
                JSONArray jSONArray = jSONObject2.getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.g.add(new UserId(jSONArray.getLong(i)));
                }
            }
        }
        if (jSONObject.has("profiles")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("profiles");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                this.f.add(new UserProfile(jSONArray2.getJSONObject(i2)));
            }
        }
    }

    public LiveSpectators(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = new ArrayList();
        this.e = parcel.readInt();
        this.d = parcel.readInt();
        this.c = parcel.readInt();
        h330.a(parcel, arrayList, UserProfile.class);
    }
}

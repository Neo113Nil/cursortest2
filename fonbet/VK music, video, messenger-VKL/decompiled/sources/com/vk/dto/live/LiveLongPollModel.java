package com.vk.dto.live;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.h330;
import xsna.t230;

/* loaded from: classes18.dex */
public class LiveLongPollModel extends t230 implements Parcelable {
    public static final Parcelable.Creator<LiveLongPollModel> CREATOR = new a();
    public final int c;
    public final boolean d;
    public final int e;
    public final UserId f;
    public final ArrayList g;

    public class a implements Parcelable.Creator<LiveLongPollModel> {
        @Override // android.os.Parcelable.Creator
        public final LiveLongPollModel createFromParcel(Parcel parcel) {
            return new LiveLongPollModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveLongPollModel[] newArray(int i) {
            return new LiveLongPollModel[i];
        }
    }

    public LiveLongPollModel(JSONObject jSONObject, int i, UserId userId) throws JSONException, NullPointerException {
        this.f = UserId.d;
        this.g = new ArrayList();
        this.e = i;
        this.f = userId;
        this.d = jSONObject.has("failed");
        if (jSONObject.has("ts")) {
            this.c = Integer.parseInt(jSONObject.getString("ts"));
        }
        if (jSONObject.has("events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                int i3 = i;
                this.g.add(new LiveEventModel(new JSONObject(jSONArray.getString(i2).replace("<!>\\d+$", "")), i3, userId, System.currentTimeMillis(), null, null));
                i2++;
                i = i3;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, 0);
        h330.c(parcel, this.g);
    }

    public LiveLongPollModel(Parcel parcel) {
        this.f = UserId.d;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.c = parcel.readInt();
        this.d = parcel.readInt() == 1;
        this.e = parcel.readInt();
        this.f = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
        h330.a(parcel, arrayList, LiveEventModel.class);
    }
}

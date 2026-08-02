package com.vk.api.sdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.auth.UtilityToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.wq;

/* compiled from: UtilityToken.kt */
/* loaded from: classes.dex */
public final class UtilityTokens implements Parcelable {
    public static final a CREATOR = new a();
    public static final UtilityTokens c = new UtilityTokens(EmptyList.b);
    public final List<UtilityToken> b;

    /* compiled from: UtilityToken.kt */
    public static final class a implements Parcelable.Creator<UtilityTokens> {
        public static UtilityTokens a(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("user_session");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    UtilityToken.CREATOR.getClass();
                    arrayList.add(UtilityToken.a.a(optJSONObject));
                }
            }
            return new UtilityTokens(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UtilityTokens createFromParcel(Parcel parcel) {
            return new UtilityTokens(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UtilityTokens[] newArray(int i) {
            return new UtilityTokens[i];
        }
    }

    public UtilityTokens(List<UtilityToken> list) {
        this.b = list;
    }

    public final JSONObject d() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((UtilityToken) it.next()).f());
        }
        return new JSONObject().put("user_session", jSONArray);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UtilityTokens) && epx.f(this.b, ((UtilityTokens) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wq.c("UtilityTokens(list=", ")", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UtilityTokens(Parcel parcel) {
        this(r0);
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, UtilityToken.CREATOR);
    }
}

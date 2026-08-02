package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.kvf;
import xsna.ms9;
import xsna.zcl;

/* compiled from: MutualInfo.kt */
/* loaded from: classes18.dex */
public final class MutualInfo implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<MutualInfo> CREATOR = new a();
    public final Integer b;
    public final List<Long> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MutualInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MutualInfo a(Serializer serializer) {
            return new MutualInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MutualInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutualInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.a0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", this.b);
        List<Long> list = this.c;
        jSONObject.put("users", list != null ? kvf.a(list) : null);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualInfo)) {
            return false;
        }
        MutualInfo mutualInfo = (MutualInfo) obj;
        return epx.f(this.b, mutualInfo.b) && epx.f(this.c, mutualInfo.c);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Long> list = this.c;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutualInfo(count=");
        sb.append(this.b);
        sb.append(", users=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        Serializer.b.h(this, parcel);
    }

    public MutualInfo(Integer num, List<Long> list) {
        this.b = num;
        this.c = list;
    }

    public /* synthetic */ MutualInfo(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MutualInfo(JSONObject jSONObject) {
        this(r0, r3 != null ? f370.L(r3) : null);
        Integer valueOf = Integer.valueOf(jSONObject.optInt("count"));
        JSONArray optJSONArray = jSONObject.optJSONArray("users");
    }

    public MutualInfo(Serializer serializer) {
        this(serializer.v(), serializer.f());
    }
}

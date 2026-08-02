package com.vk.catalog2.common.dto.api.block;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.jgp;
import xsna.p4g;

/* compiled from: CatalogBlockStatInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogBlockStatInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogBlockStatInfo> CREATOR = new a();
    public final Map<String, CatalogItemStatInfo> b;

    /* compiled from: CatalogBlockStatInfo.kt */
    public static final class CatalogItemStatInfo implements Parcelable {
        public static final Parcelable.Creator<CatalogItemStatInfo> CREATOR = new a();
        public final String b;

        /* compiled from: CatalogBlockStatInfo.kt */
        public static final class a implements Parcelable.Creator<CatalogItemStatInfo> {
            @Override // android.os.Parcelable.Creator
            public final CatalogItemStatInfo createFromParcel(Parcel parcel) {
                return new CatalogItemStatInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CatalogItemStatInfo[] newArray(int i) {
                return new CatalogItemStatInfo[i];
            }
        }

        public CatalogItemStatInfo(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CatalogItemStatInfo) && epx.f(this.b, ((CatalogItemStatInfo) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CatalogItemStatInfo(trackCode="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogBlockStatInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBlockStatInfo a(Serializer serializer) {
            Map map;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        CatalogItemStatInfo catalogItemStatInfo = (CatalogItemStatInfo) serializer.A(CatalogItemStatInfo.class.getClassLoader());
                        if (H != null && catalogItemStatInfo != null) {
                            map.put(H, catalogItemStatInfo);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new CatalogBlockStatInfo((Map<String, CatalogItemStatInfo>) map);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBlockStatInfo[i];
        }
    }

    public CatalogBlockStatInfo(Map<String, CatalogItemStatInfo> map) {
        this.b = map;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Map<String, CatalogItemStatInfo> map = this.b;
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c = n.c(serializer, map);
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            serializer.j0((String) entry.getKey());
            serializer.e0((CatalogItemStatInfo) entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogBlockStatInfo(JSONArray jSONArray) {
        this((Map<String, CatalogItemStatInfo>) Collections.unmodifiableMap(r0));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            if (jSONObject != null) {
                try {
                    Pair pair = new Pair(jSONObject.getString("item_id"), new CatalogItemStatInfo(f370.A("track_code", jSONObject)));
                    linkedHashMap.put(pair.d(), pair.g());
                } catch (Throwable unused) {
                }
            }
        }
        p4g.a aVar = p4g.a;
    }
}

package com.vk.articles.api.preload;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: QueryParameters.kt */
/* loaded from: classes15.dex */
public final class QueryParameters implements Serializer.StreamParcelable {
    public static final Serializer.c<QueryParameters> CREATOR = new a();
    public final LinkedHashMap b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QueryParameters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QueryParameters a(Serializer serializer) {
            return new QueryParameters(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QueryParameters[i];
        }
    }

    public QueryParameters() {
        this.b = new LinkedHashMap();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        LinkedHashMap linkedHashMap = this.b;
        serializer.S(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            serializer.j0((String) entry.getKey());
            serializer.j0((String) entry.getValue());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public QueryParameters(Serializer serializer) {
        this();
        QueryParameters queryParameters = new QueryParameters();
        int u = serializer.u();
        for (int i = 0; i < u; i++) {
            queryParameters.b.put(serializer.H(), serializer.H());
        }
    }
}

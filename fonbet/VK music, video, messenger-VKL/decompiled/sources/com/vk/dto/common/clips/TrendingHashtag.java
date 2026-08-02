package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.rdi;
import xsna.wq;

/* compiled from: TrendingHashtag.kt */
/* loaded from: classes18.dex */
public final class TrendingHashtag extends Serializer.StreamParcelableAdapter {

    @Deprecated
    public static final Serializer.c<TrendingHashtag> CREATOR = new a();
    public final String b;
    public final List<String> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TrendingHashtag> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TrendingHashtag a(Serializer serializer) {
            return new TrendingHashtag(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrendingHashtag[i];
        }
    }

    public TrendingHashtag(String str, List<String> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.l0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingHashtag)) {
            return false;
        }
        TrendingHashtag trendingHashtag = (TrendingHashtag) obj;
        return epx.f(this.b, trendingHashtag.b) && epx.f(this.c, trendingHashtag.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<String> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrendingHashtag(hashtag=");
        sb.append(this.b);
        sb.append(", background=");
        return ms9.a(')', sb, this.c);
    }

    public final String zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrendingHashtag(Serializer serializer) {
        this(r0, r2 != null ? rdi.x(j5g.V(r2)) : null);
        String H = serializer.H();
        ArrayList<String> h = serializer.h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrendingHashtag(JSONObject jSONObject) {
        this(r0, r2);
        ?? r2;
        String string = jSONObject.getString("hashtag");
        JSONArray optJSONArray = jSONObject.optJSONArray(L2.g);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            r2 = new ArrayList(length);
            for (int i = 0; i < length; i = wq.b(optJSONArray, i, r2, i, 1)) {
            }
        } else {
            r2 = EmptyList.b;
        }
    }
}

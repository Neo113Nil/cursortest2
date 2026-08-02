package com.vk.dto.common.account;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.account.DownloadPattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.ms9;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ProfilerConfig.kt */
/* loaded from: classes.dex */
public final class ProfilerConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ProfilerConfig> CREATOR = new a();
    public final boolean b;
    public final List<DownloadPattern> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProfilerConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProfilerConfig a(Serializer serializer) {
            return new ProfilerConfig(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProfilerConfig[i];
        }
    }

    public ProfilerConfig() {
        this(false, null, 3, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.o0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api_requests", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            jSONArray.put(((DownloadPattern) it.next()).e5());
        }
        s3q0 s3q0Var = s3q0.a;
        jSONObject.put("download_patterns", jSONArray);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilerConfig)) {
            return false;
        }
        ProfilerConfig profilerConfig = (ProfilerConfig) obj;
        return this.b == profilerConfig.b && epx.f(this.c, profilerConfig.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilerConfig(apiRequests=");
        sb.append(this.b);
        sb.append(", downloadPatterns=");
        return ms9.a(')', sb, this.c);
    }

    public ProfilerConfig(boolean z, List<DownloadPattern> list) {
        this.b = z;
        this.c = list;
    }

    public ProfilerConfig(Serializer serializer, zcl zclVar) {
        this(serializer.m(), serializer.j(DownloadPattern.CREATOR));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ProfilerConfig(JSONObject jSONObject, zcl zclVar) {
        this(r7, (List<DownloadPattern>) r1);
        ?? r1;
        boolean p = f370.p(jSONObject, "api_requests", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("download_patterns");
        if (optJSONArray != null) {
            r1 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Serializer.c<DownloadPattern> cVar = DownloadPattern.CREATOR;
                r1.add(DownloadPattern.a.a(jSONObject2));
            }
        } else {
            r1 = EmptyList.b;
        }
    }

    public ProfilerConfig(boolean z, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (List<DownloadPattern>) ((i & 2) != 0 ? EmptyList.b : list));
    }
}

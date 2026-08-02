package com.vk.dto.common.account;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: DownloadPattern.kt */
/* loaded from: classes18.dex */
public final class DownloadPattern extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<DownloadPattern> CREATOR = new b();
    public final String b;
    public final String c;
    public final float d;
    public final float e;

    /* compiled from: DownloadPattern.kt */
    public static final class a {
        public static DownloadPattern a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new DownloadPattern(jSONObject, (zcl) null);
            }
            return new DownloadPattern(null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 15, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DownloadPattern> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DownloadPattern a(Serializer serializer) {
            return new DownloadPattern(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DownloadPattern[i];
        }
    }

    public DownloadPattern() {
        this(null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 15, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.P(this.d);
        serializer.P(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.b);
        jSONObject.put("pattern", this.c);
        jSONObject.put("probability", Float.valueOf(this.d));
        jSONObject.put("error_probability", Float.valueOf(this.e));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadPattern)) {
            return false;
        }
        DownloadPattern downloadPattern = (DownloadPattern) obj;
        return epx.f(this.b, downloadPattern.b) && epx.f(this.c, downloadPattern.c) && Float.compare(this.d, downloadPattern.d) == 0 && Float.compare(this.e, downloadPattern.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadPattern(type=");
        sb.append(this.b);
        sb.append(", pattern=");
        sb.append(this.c);
        sb.append(", probability=");
        sb.append(this.d);
        sb.append(", errorProbability=");
        return xq.c(')', this.e, sb);
    }

    public /* synthetic */ DownloadPattern(String str, String str2, float f, float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2);
    }

    public DownloadPattern(String str, String str2, float f, float f2) {
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = f2;
    }

    public DownloadPattern(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.s(), serializer.s());
    }

    public DownloadPattern(JSONObject jSONObject, zcl zclVar) {
        this(f370.C("type", "", jSONObject), f370.C("pattern", "", jSONObject), (float) jSONObject.optDouble("probability", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), (float) jSONObject.optDouble("error_probability", ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
    }
}

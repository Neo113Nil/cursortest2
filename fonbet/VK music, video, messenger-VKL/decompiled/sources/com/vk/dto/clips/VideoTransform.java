package com.vk.dto.clips;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bxx;
import xsna.epx;
import xsna.so;

/* compiled from: VideoTransform.kt */
/* loaded from: classes18.dex */
public final class VideoTransform extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<VideoTransform> CREATOR = new b();
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final Float f;
    public final Float g;

    /* compiled from: VideoTransform.kt */
    public static final class a {
        public static VideoTransform a(JSONObject jSONObject) {
            int optInt = jSONObject.optInt("rotation");
            float optDouble = (float) jSONObject.optDouble("translation_x", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            float optDouble2 = (float) jSONObject.optDouble("translation_y", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            float optDouble3 = (float) jSONObject.optDouble("aspect_ratio", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            float optDouble4 = (float) jSONObject.optDouble("relation_width", -1.0d);
            Float valueOf = Float.valueOf(optDouble4);
            if (optDouble4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                valueOf = null;
            }
            float optDouble5 = (float) jSONObject.optDouble("original_relation_width", -1.0d);
            return new VideoTransform(optInt, optDouble, optDouble2, optDouble3, valueOf, optDouble5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf(optDouble5) : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VideoTransform> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoTransform a(Serializer serializer) {
            return new VideoTransform(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoTransform[i];
        }
    }

    static {
        new VideoTransform(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 63, null);
    }

    public VideoTransform() {
        this(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 63, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.P(this.c);
        serializer.P(this.d);
        serializer.P(this.e);
        serializer.R(this.f);
        serializer.R(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rotation", this.b);
        jSONObject.put("translation_x", this.c);
        jSONObject.put("translation_y", this.d);
        jSONObject.put("aspect_ratio", this.e);
        jSONObject.put("relation_width", this.f != null ? Double.valueOf(r2.floatValue()) : null);
        jSONObject.put("original_relation_width", this.g != null ? Double.valueOf(r2.floatValue()) : null);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTransform)) {
            return false;
        }
        VideoTransform videoTransform = (VideoTransform) obj;
        return this.b == videoTransform.b && Float.compare(this.c, videoTransform.c) == 0 && Float.compare(this.d, videoTransform.d) == 0 && Float.compare(this.e, videoTransform.e) == 0 && epx.f(this.f, videoTransform.f) && epx.f(this.g, videoTransform.g);
    }

    public final int hashCode() {
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31);
        Float f = this.f;
        int hashCode = (a2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.g;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTransform(rotation=");
        sb.append(this.b);
        sb.append(", translationX=");
        sb.append(this.c);
        sb.append(", translationY=");
        sb.append(this.d);
        sb.append(", aspectRatio=");
        sb.append(this.e);
        sb.append(", relationWidth=");
        sb.append(this.f);
        sb.append(", originalRelationWidth=");
        return so.b(sb, this.g, ')');
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ VideoTransform(int r2, float r3, float r4, float r5, java.lang.Float r6, java.lang.Float r7, int r8, xsna.zcl r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.clips.VideoTransform.<init>(int, float, float, float, java.lang.Float, java.lang.Float, int, xsna.zcl):void");
    }

    public VideoTransform(int i, float f, float f2, float f3, Float f4, Float f5) {
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public VideoTransform(Serializer serializer) {
        this(serializer.u(), serializer.s(), serializer.s(), serializer.s(), serializer.t(), serializer.t());
    }
}

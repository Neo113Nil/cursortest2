package com.vk.dto.polls;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.an10;
import xsna.bxx;
import xsna.epx;
import xsna.n23;
import xsna.shy;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: PollOption.kt */
/* loaded from: classes18.dex */
public final class PollOption extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PollOption> CREATOR = new b();
    public final long b;
    public final String c;
    public final int d;
    public final float e;

    /* compiled from: PollOption.kt */
    public static final class a {
        public static String a(float f) {
            return String.format("%.0f\u2009%%", Arrays.copyOf(new Object[]{Float.valueOf(an10.b(f))}, 1));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PollOption> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollOption a(Serializer serializer) {
            return new PollOption(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollOption[i];
        }
    }

    public PollOption(long j, String str, int i, float f) {
        this.b = j;
        this.c = str;
        this.d = i;
        this.e = f;
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 100.0f) {
            throw new IllegalStateException(n23.a(f, "Incorrect rate value ").toString());
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.P(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b).put("text", this.c).put("votes", this.d).put("rate", this.e);
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOption)) {
            return false;
        }
        PollOption pollOption = (PollOption) obj;
        return this.b == pollOption.b && epx.f(this.c, pollOption.c) && this.d == pollOption.d && Float.compare(this.e, pollOption.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + shy.a(this.d, urd0.a(Long.hashCode(this.b) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollOption(id=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", votes=");
        sb.append(this.d);
        sb.append(", rate=");
        return xq.c(')', this.e, sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PollOption(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r5);
        long w = serializer.w();
        String H = serializer.H();
        int u = serializer.u();
        float s = serializer.s();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
    }
}

package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.subjects.b;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DeviceMotionChanged.kt */
/* loaded from: classes6.dex */
public final class DeviceMotionChanged$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: DeviceMotionChanged.kt */
    public static final class Data {

        @pmi0("alpha")
        private final float alpha;

        @pmi0("beta")
        private final float beta;

        @pmi0("gamma")
        private final float gamma;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(float f, float f2, float f3, String str) {
            this.alpha = f;
            this.beta = f2;
            this.gamma = f3;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Float.compare(this.alpha, data.alpha) == 0 && Float.compare(this.beta, data.beta) == 0 && Float.compare(this.gamma, data.gamma) == 0 && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = b.a(this.gamma, b.a(this.beta, Float.hashCode(this.alpha) * 31, 31), 31);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(alpha=");
            sb.append(this.alpha);
            sb.append(", beta=");
            sb.append(this.beta);
            sb.append(", gamma=");
            sb.append(this.gamma);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public DeviceMotionChanged$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new DeviceMotionChanged$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceMotionChanged$Response)) {
            return false;
        }
        DeviceMotionChanged$Response deviceMotionChanged$Response = (DeviceMotionChanged$Response) obj;
        return epx.f(this.type, deviceMotionChanged$Response.type) && epx.f(this.data, deviceMotionChanged$Response.data) && epx.f(this.requestId, deviceMotionChanged$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    public /* synthetic */ DeviceMotionChanged$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppDeviceMotionChanged" : str, data, str2);
    }
}

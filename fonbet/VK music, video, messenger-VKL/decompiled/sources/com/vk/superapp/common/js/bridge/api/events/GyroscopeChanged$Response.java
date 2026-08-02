package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.subjects.b;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GyroscopeChanged.kt */
/* loaded from: classes6.dex */
public final class GyroscopeChanged$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: GyroscopeChanged.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("x")
        private final float x;

        @pmi0("y")
        private final float y;

        @pmi0("z")
        private final float z;

        public Data(float f, float f2, float f3, String str) {
            this.x = f;
            this.z = f2;
            this.y = f3;
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
            return Float.compare(this.x, data.x) == 0 && Float.compare(this.z, data.z) == 0 && Float.compare(this.y, data.y) == 0 && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = b.a(this.y, b.a(this.z, Float.hashCode(this.x) * 31, 31), 31);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(x=");
            sb.append(this.x);
            sb.append(", z=");
            sb.append(this.z);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public GyroscopeChanged$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GyroscopeChanged$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GyroscopeChanged$Response)) {
            return false;
        }
        GyroscopeChanged$Response gyroscopeChanged$Response = (GyroscopeChanged$Response) obj;
        return epx.f(this.type, gyroscopeChanged$Response.type) && epx.f(this.data, gyroscopeChanged$Response.data) && epx.f(this.requestId, gyroscopeChanged$Response.requestId);
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

    public /* synthetic */ GyroscopeChanged$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGyroscopeChanged" : str, data, str2);
    }
}

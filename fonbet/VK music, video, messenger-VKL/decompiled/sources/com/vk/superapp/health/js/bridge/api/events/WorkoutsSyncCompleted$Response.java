package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WorkoutsSyncCompleted.kt */
/* loaded from: classes6.dex */
public final class WorkoutsSyncCompleted$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: WorkoutsSyncCompleted.kt */
    public static final class Data {

        @pmi0("count")
        private final int count;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(int i, String str) {
            this.count = i;
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
            return this.count == data.count && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.count) * 31;
            String str = this.requestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(count=");
            sb.append(this.count);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public WorkoutsSyncCompleted$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new WorkoutsSyncCompleted$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkoutsSyncCompleted$Response)) {
            return false;
        }
        WorkoutsSyncCompleted$Response workoutsSyncCompleted$Response = (WorkoutsSyncCompleted$Response) obj;
        return epx.f(this.type, workoutsSyncCompleted$Response.type) && epx.f(this.data, workoutsSyncCompleted$Response.data) && epx.f(this.requestId, workoutsSyncCompleted$Response.requestId);
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

    public /* synthetic */ WorkoutsSyncCompleted$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppWorkoutsSyncCompleted" : str, data, str2);
    }
}

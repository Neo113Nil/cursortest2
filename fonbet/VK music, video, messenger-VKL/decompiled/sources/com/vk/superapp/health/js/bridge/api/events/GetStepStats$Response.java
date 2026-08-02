package com.vk.superapp.health.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;

/* compiled from: GetStepStats.kt */
/* loaded from: classes6.dex */
public final class GetStepStats$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public GetStepStats$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new GetStepStats$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetStepStats$Response)) {
            return false;
        }
        GetStepStats$Response getStepStats$Response = (GetStepStats$Response) obj;
        return epx.f(this.type, getStepStats$Response.type) && epx.f(this.data, getStepStats$Response.data) && epx.f(this.requestId, getStepStats$Response.requestId);
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

    /* compiled from: GetStepStats.kt */
    public static final class Data {

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("steps_list")
        private final List<StepsList> stepsList;

        /* compiled from: GetStepStats.kt */
        public static final class StepsList {

            @pmi0("date")
            private final String date;

            @pmi0("details")
            private final List<Details> details;

            @pmi0("distance")
            private final Float distance;

            @pmi0("manual_distance")
            private final Float manualDistance;

            @pmi0("manual_steps")
            private final Integer manualSteps;

            @pmi0("steps")
            private final Integer steps;

            /* compiled from: GetStepStats.kt */
            public static final class Details {

                @pmi0("distance")
                private final Integer distance;

                @pmi0("is_manual")
                private final Boolean isManual;

                @pmi0("source_id")
                private final String sourceId;

                @pmi0("steps")
                private final Integer steps;

                public Details() {
                    this(null, null, null, null, 15, null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Details)) {
                        return false;
                    }
                    Details details = (Details) obj;
                    return epx.f(this.steps, details.steps) && epx.f(this.distance, details.distance) && epx.f(this.sourceId, details.sourceId) && epx.f(this.isManual, details.isManual);
                }

                public final int hashCode() {
                    Integer num = this.steps;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    Integer num2 = this.distance;
                    int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    String str = this.sourceId;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.isManual;
                    return hashCode3 + (bool != null ? bool.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Details(steps=");
                    sb.append(this.steps);
                    sb.append(", distance=");
                    sb.append(this.distance);
                    sb.append(", sourceId=");
                    sb.append(this.sourceId);
                    sb.append(", isManual=");
                    return tn.a(sb, this.isManual, ')');
                }

                public Details(Integer num, Integer num2, String str, Boolean bool) {
                    this.steps = num;
                    this.distance = num2;
                    this.sourceId = str;
                    this.isManual = bool;
                }

                public /* synthetic */ Details(Integer num, Integer num2, String str, Boolean bool, int i, zcl zclVar) {
                    this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
                }
            }

            public StepsList() {
                this(null, null, null, null, null, null, 63, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StepsList)) {
                    return false;
                }
                StepsList stepsList = (StepsList) obj;
                return epx.f(this.steps, stepsList.steps) && epx.f(this.distance, stepsList.distance) && epx.f(this.date, stepsList.date) && epx.f(this.manualSteps, stepsList.manualSteps) && epx.f(this.manualDistance, stepsList.manualDistance) && epx.f(this.details, stepsList.details);
            }

            public final int hashCode() {
                Integer num = this.steps;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Float f = this.distance;
                int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
                String str = this.date;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Integer num2 = this.manualSteps;
                int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Float f2 = this.manualDistance;
                int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
                List<Details> list = this.details;
                return hashCode5 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StepsList(steps=");
                sb.append(this.steps);
                sb.append(", distance=");
                sb.append(this.distance);
                sb.append(", date=");
                sb.append(this.date);
                sb.append(", manualSteps=");
                sb.append(this.manualSteps);
                sb.append(", manualDistance=");
                sb.append(this.manualDistance);
                sb.append(", details=");
                return ms9.a(')', sb, this.details);
            }

            public StepsList(Integer num, Float f, String str, Integer num2, Float f2, List<Details> list) {
                this.steps = num;
                this.distance = f;
                this.date = str;
                this.manualSteps = num2;
                this.manualDistance = f2;
                this.details = list;
            }

            public /* synthetic */ StepsList(Integer num, Float f, String str, Integer num2, Float f2, List list, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? null : list);
            }
        }

        public Data(List<StepsList> list, String str) {
            this.stepsList = list;
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
            return epx.f(this.stepsList, data.stepsList) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            List<StepsList> list = this.stepsList;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.requestId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(stepsList=");
            sb.append(this.stepsList);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(List list, String str, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : list, str);
        }
    }

    public /* synthetic */ GetStepStats$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppGetStepStatsResult" : str, data, str2);
    }
}

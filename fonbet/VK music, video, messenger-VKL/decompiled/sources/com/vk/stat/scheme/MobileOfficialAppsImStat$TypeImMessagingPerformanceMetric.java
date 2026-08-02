package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("actor")
    private final String actor;

    @pmi0("category")
    private final String category;

    @pmi0("custom_fields_int")
    private final List<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt> customFieldsInt;

    @pmi0("custom_fields_str")
    private final List<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr> customFieldsStr;

    @pmi0("duration")
    private final long duration;

    @pmi0("name")
    private final String name;

    @pmi0("parent_span_id")
    private final Long parentSpanId;

    @pmi0("prev_span_id")
    private final Long prevSpanId;

    @pmi0("root_span_name")
    private final String rootSpanName;

    @pmi0("span_id")
    private final long spanId;

    @pmi0("start_time_parent")
    private final long startTimeParent;

    @pmi0("start_time_root")
    private final long startTimeRoot;

    @pmi0("trace_id")
    private final String traceId;

    public MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric(String str, long j, String str2, String str3, long j2, long j3, long j4, String str4, Long l, Long l2, String str5, List<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt> list, List<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr> list2) {
        this.traceId = str;
        this.spanId = j;
        this.name = str2;
        this.category = str3;
        this.duration = j2;
        this.startTimeRoot = j3;
        this.startTimeParent = j4;
        this.rootSpanName = str4;
        this.parentSpanId = l;
        this.prevSpanId = l2;
        this.actor = str5;
        this.customFieldsInt = list;
        this.customFieldsStr = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric = (MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric) obj;
        return epx.f(this.traceId, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.traceId) && this.spanId == mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.spanId && epx.f(this.name, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.name) && epx.f(this.category, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.category) && this.duration == mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.duration && this.startTimeRoot == mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.startTimeRoot && this.startTimeParent == mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.startTimeParent && epx.f(this.rootSpanName, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.rootSpanName) && epx.f(this.parentSpanId, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.parentSpanId) && epx.f(this.prevSpanId, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.prevSpanId) && epx.f(this.actor, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.actor) && epx.f(this.customFieldsInt, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.customFieldsInt) && epx.f(this.customFieldsStr, mobileOfficialAppsImStat$TypeImMessagingPerformanceMetric.customFieldsStr);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(bh10.a(bh10.a(urd0.a(urd0.a(bh10.a(this.traceId.hashCode() * 31, 31, this.spanId), 31, this.name), 31, this.category), 31, this.duration), 31, this.startTimeRoot), 31, this.startTimeParent), 31, this.rootSpanName);
        Long l = this.parentSpanId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.prevSpanId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.actor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldInt> list = this.customFieldsInt;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr> list2 = this.customFieldsStr;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImMessagingPerformanceMetric(traceId=");
        sb.append(this.traceId);
        sb.append(", spanId=");
        sb.append(this.spanId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", startTimeRoot=");
        sb.append(this.startTimeRoot);
        sb.append(", startTimeParent=");
        sb.append(this.startTimeParent);
        sb.append(", rootSpanName=");
        sb.append(this.rootSpanName);
        sb.append(", parentSpanId=");
        sb.append(this.parentSpanId);
        sb.append(", prevSpanId=");
        sb.append(this.prevSpanId);
        sb.append(", actor=");
        sb.append(this.actor);
        sb.append(", customFieldsInt=");
        sb.append(this.customFieldsInt);
        sb.append(", customFieldsStr=");
        return ms9.a(')', sb, this.customFieldsStr);
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImMessagingPerformanceMetric(String str, long j, String str2, String str3, long j2, long j3, long j4, String str4, Long l, Long l2, String str5, List list, List list2, int i, zcl zclVar) {
        this(str, j, str2, str3, j2, j3, j4, str4, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : list2);
    }
}

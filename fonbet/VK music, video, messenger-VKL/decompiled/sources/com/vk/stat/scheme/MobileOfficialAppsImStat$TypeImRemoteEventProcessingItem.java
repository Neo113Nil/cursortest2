package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import java.util.List;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.iq;
import xsna.lhg;
import xsna.nu20;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem implements SchemeStat$EventBenchmarkMain.b {
    public final transient String a;

    @pmi0("event_processing_finished_time")
    private final Long eventProcessingFinishedTime;

    @pmi0("event_received_time")
    private final Long eventReceivedTime;

    @pmi0("event_id")
    private final FilteredString filteredEventId;

    @pmi0("steps")
    private final List<MobileOfficialAppsImStat$ImRemoteEventStepItem> steps;

    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem>, a9y<MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("steps");
            return new MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem((List) ((q == null || (q instanceof u9y)) ? null : a.fromJson(x9yVar.q("steps").k(), new nu20().getType())), fai.C(x9yVar, "event_id"), fai.B(x9yVar, "event_received_time"), fai.B(x9yVar, "event_processing_finished_time"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem = (MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("steps", tru.a().toJson(mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.c()));
            x9yVar.o("event_id", mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.a);
            x9yVar.n("event_received_time", mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.b());
            x9yVar.n("event_processing_finished_time", mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.a());
            return x9yVar;
        }
    }

    public MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem() {
        this(null, null, null, null, 15, null);
    }

    public final Long a() {
        return this.eventProcessingFinishedTime;
    }

    public final Long b() {
        return this.eventReceivedTime;
    }

    public final List<MobileOfficialAppsImStat$ImRemoteEventStepItem> c() {
        return this.steps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem = (MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem) obj;
        return epx.f(this.steps, mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.steps) && epx.f(this.a, mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.a) && epx.f(this.eventReceivedTime, mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.eventReceivedTime) && epx.f(this.eventProcessingFinishedTime, mobileOfficialAppsImStat$TypeImRemoteEventProcessingItem.eventProcessingFinishedTime);
    }

    public final int hashCode() {
        List<MobileOfficialAppsImStat$ImRemoteEventStepItem> list = this.steps;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.eventReceivedTime;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.eventProcessingFinishedTime;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImRemoteEventProcessingItem(steps=");
        sb.append(this.steps);
        sb.append(", eventId=");
        sb.append(this.a);
        sb.append(", eventReceivedTime=");
        sb.append(this.eventReceivedTime);
        sb.append(", eventProcessingFinishedTime=");
        return iq.b(sb, this.eventProcessingFinishedTime, ')');
    }

    public MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem(List<MobileOfficialAppsImStat$ImRemoteEventStepItem> list, String str, Long l, Long l2) {
        this.steps = list;
        this.a = str;
        this.eventReceivedTime = l;
        this.eventProcessingFinishedTime = l2;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredEventId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImRemoteEventProcessingItem(List list, String str, Long l, Long l2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }
}

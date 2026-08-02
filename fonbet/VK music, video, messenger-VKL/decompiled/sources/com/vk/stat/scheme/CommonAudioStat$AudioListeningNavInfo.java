package com.vk.stat.scheme;

import com.google.gson.Gson;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.List;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.mhg;
import xsna.ms9;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$AudioListeningNavInfo {
    public final transient String a;

    @pmi0("section_id")
    private final FilteredString filteredSectionId;

    @pmi0("launch_origin")
    private final List<CommonAudioStat$LaunchOriginItem> launchOrigin;

    @pmi0(AdRevenueConstants.ORIGINAL_SOURCE_KEY)
    private final CommonStat$TypeTrackCodeItem originalSource;

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$AudioListeningNavInfo>, a9y<CommonAudioStat$AudioListeningNavInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String C = fai.C(x9yVar, "section_id");
            Gson a = tru.a();
            b9y q = x9yVar.q(AdRevenueConstants.ORIGINAL_SOURCE_KEY);
            Object obj = null;
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = (CommonStat$TypeTrackCodeItem) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonStat$TypeTrackCodeItem.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("launch_origin");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(x9yVar.q("launch_origin").k(), new mhg().getType());
            }
            return new CommonAudioStat$AudioListeningNavInfo(C, commonStat$TypeTrackCodeItem, (List) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = (CommonAudioStat$AudioListeningNavInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("section_id", commonAudioStat$AudioListeningNavInfo.a);
            x9yVar.o(AdRevenueConstants.ORIGINAL_SOURCE_KEY, tru.a().toJson(commonAudioStat$AudioListeningNavInfo.b()));
            x9yVar.o("launch_origin", tru.a().toJson(commonAudioStat$AudioListeningNavInfo.a()));
            return x9yVar;
        }
    }

    public CommonAudioStat$AudioListeningNavInfo() {
        this(null, null, null, 7, null);
    }

    public final List<CommonAudioStat$LaunchOriginItem> a() {
        return this.launchOrigin;
    }

    public final CommonStat$TypeTrackCodeItem b() {
        return this.originalSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$AudioListeningNavInfo)) {
            return false;
        }
        CommonAudioStat$AudioListeningNavInfo commonAudioStat$AudioListeningNavInfo = (CommonAudioStat$AudioListeningNavInfo) obj;
        return epx.f(this.a, commonAudioStat$AudioListeningNavInfo.a) && epx.f(this.originalSource, commonAudioStat$AudioListeningNavInfo.originalSource) && epx.f(this.launchOrigin, commonAudioStat$AudioListeningNavInfo.launchOrigin);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.originalSource;
        int hashCode2 = (hashCode + (commonStat$TypeTrackCodeItem == null ? 0 : commonStat$TypeTrackCodeItem.a.hashCode())) * 31;
        List<CommonAudioStat$LaunchOriginItem> list = this.launchOrigin;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioListeningNavInfo(sectionId=");
        sb.append(this.a);
        sb.append(", originalSource=");
        sb.append(this.originalSource);
        sb.append(", launchOrigin=");
        return ms9.a(')', sb, this.launchOrigin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonAudioStat$AudioListeningNavInfo(String str, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, List<? extends CommonAudioStat$LaunchOriginItem> list) {
        this.a = str;
        this.originalSource = commonStat$TypeTrackCodeItem;
        this.launchOrigin = list;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredSectionId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonAudioStat$AudioListeningNavInfo(String str, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : commonStat$TypeTrackCodeItem, (i & 4) != 0 ? null : list);
    }
}

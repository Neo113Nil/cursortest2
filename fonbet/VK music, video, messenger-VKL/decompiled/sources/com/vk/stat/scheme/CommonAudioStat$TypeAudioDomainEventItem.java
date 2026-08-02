package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.nhg;
import xsna.ohg;
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
public final class CommonAudioStat$TypeAudioDomainEventItem implements SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b {
    public final transient String a;
    public final transient String b;

    @pmi0("client_server_time")
    private final long clientServerTime;

    @pmi0("entities")
    private final List<CommonAudioStat$AudioDomainEventEntity> entities;

    @pmi0("hint_id")
    private final FilteredString filteredHintId;

    @pmi0("player_init_id")
    private final FilteredString filteredPlayerInitId;

    @pmi0("force_source")
    private final CommonAudioStat$TypeAudioSourceEnum forceSource;

    @pmi0("nav_info")
    private final CommonStat$TypeCommonEventItem navInfo;

    @pmi0("pos_ids")
    private final List<Integer> posIds;

    @pmi0("source_info")
    private final CommonStat$TypeCommonEventItem sourceInfo;

    @pmi0("track_code_item")
    private final CommonStat$TypeTrackCodeItem trackCodeItem;

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioDomainEventItem>, a9y<CommonAudioStat$TypeAudioDomainEventItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            long q = fai.q(x9yVar, "client_server_time");
            Gson a = tru.a();
            b9y q2 = x9yVar.q("nav_info");
            Object obj = null;
            CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = (CommonStat$TypeCommonEventItem) ((q2 == null || (q2 instanceof u9y)) ? null : a.fromJson(q2.k(), CommonStat$TypeCommonEventItem.class));
            Gson a2 = tru.a();
            b9y q3 = x9yVar.q("source_info");
            CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem2 = (CommonStat$TypeCommonEventItem) ((q3 == null || (q3 instanceof u9y)) ? null : a2.fromJson(q3.k(), CommonStat$TypeCommonEventItem.class));
            Gson a3 = tru.a();
            b9y q4 = x9yVar.q("track_code_item");
            CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = (CommonStat$TypeTrackCodeItem) ((q4 == null || (q4 instanceof u9y)) ? null : a3.fromJson(q4.k(), CommonStat$TypeTrackCodeItem.class));
            String C = fai.C(x9yVar, "player_init_id");
            String C2 = fai.C(x9yVar, "hint_id");
            Gson a4 = tru.a();
            b9y q5 = x9yVar.q("pos_ids");
            List list = (List) ((q5 == null || (q5 instanceof u9y)) ? null : a4.fromJson(x9yVar.q("pos_ids").k(), new nhg().getType()));
            Gson a5 = tru.a();
            b9y q6 = x9yVar.q("entities");
            List list2 = (List) ((q6 == null || (q6 instanceof u9y)) ? null : a5.fromJson(x9yVar.q("entities").k(), new ohg().getType()));
            Gson a6 = tru.a();
            b9y q7 = x9yVar.q("force_source");
            if (q7 != null && !(q7 instanceof u9y)) {
                obj = a6.fromJson(q7.k(), (Class<Object>) CommonAudioStat$TypeAudioSourceEnum.class);
            }
            return new CommonAudioStat$TypeAudioDomainEventItem(q, commonStat$TypeCommonEventItem, commonStat$TypeCommonEventItem2, commonStat$TypeTrackCodeItem, C, C2, list, list2, (CommonAudioStat$TypeAudioSourceEnum) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem = (CommonAudioStat$TypeAudioDomainEventItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("client_server_time", Long.valueOf(commonAudioStat$TypeAudioDomainEventItem.a()));
            x9yVar.o("nav_info", tru.a().toJson(commonAudioStat$TypeAudioDomainEventItem.d()));
            x9yVar.o("source_info", tru.a().toJson(commonAudioStat$TypeAudioDomainEventItem.f()));
            x9yVar.o("track_code_item", tru.a().toJson(commonAudioStat$TypeAudioDomainEventItem.g()));
            x9yVar.o("player_init_id", commonAudioStat$TypeAudioDomainEventItem.a);
            x9yVar.o("hint_id", commonAudioStat$TypeAudioDomainEventItem.b);
            x9yVar.o("pos_ids", tru.a().toJson(commonAudioStat$TypeAudioDomainEventItem.e()));
            x9yVar.o("entities", tru.a().toJson(commonAudioStat$TypeAudioDomainEventItem.b()));
            x9yVar.o("force_source", tru.a().toJson(commonAudioStat$TypeAudioDomainEventItem.c()));
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioDomainEventItem(long j, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem2, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, String str, String str2, List<Integer> list, List<CommonAudioStat$AudioDomainEventEntity> list2, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        this.clientServerTime = j;
        this.navInfo = commonStat$TypeCommonEventItem;
        this.sourceInfo = commonStat$TypeCommonEventItem2;
        this.trackCodeItem = commonStat$TypeTrackCodeItem;
        this.a = str;
        this.b = str2;
        this.posIds = list;
        this.entities = list2;
        this.forceSource = commonAudioStat$TypeAudioSourceEnum;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredPlayerInitId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredHintId = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final long a() {
        return this.clientServerTime;
    }

    public final List<CommonAudioStat$AudioDomainEventEntity> b() {
        return this.entities;
    }

    public final CommonAudioStat$TypeAudioSourceEnum c() {
        return this.forceSource;
    }

    public final CommonStat$TypeCommonEventItem d() {
        return this.navInfo;
    }

    public final List<Integer> e() {
        return this.posIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioDomainEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem = (CommonAudioStat$TypeAudioDomainEventItem) obj;
        return this.clientServerTime == commonAudioStat$TypeAudioDomainEventItem.clientServerTime && epx.f(this.navInfo, commonAudioStat$TypeAudioDomainEventItem.navInfo) && epx.f(this.sourceInfo, commonAudioStat$TypeAudioDomainEventItem.sourceInfo) && epx.f(this.trackCodeItem, commonAudioStat$TypeAudioDomainEventItem.trackCodeItem) && epx.f(this.a, commonAudioStat$TypeAudioDomainEventItem.a) && epx.f(this.b, commonAudioStat$TypeAudioDomainEventItem.b) && epx.f(this.posIds, commonAudioStat$TypeAudioDomainEventItem.posIds) && epx.f(this.entities, commonAudioStat$TypeAudioDomainEventItem.entities) && this.forceSource == commonAudioStat$TypeAudioDomainEventItem.forceSource;
    }

    public final CommonStat$TypeCommonEventItem f() {
        return this.sourceInfo;
    }

    public final CommonStat$TypeTrackCodeItem g() {
        return this.trackCodeItem;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.clientServerTime) * 31;
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = this.navInfo;
        int hashCode2 = (hashCode + (commonStat$TypeCommonEventItem == null ? 0 : commonStat$TypeCommonEventItem.hashCode())) * 31;
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem2 = this.sourceInfo;
        int hashCode3 = (hashCode2 + (commonStat$TypeCommonEventItem2 == null ? 0 : commonStat$TypeCommonEventItem2.hashCode())) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.trackCodeItem;
        int hashCode4 = (hashCode3 + (commonStat$TypeTrackCodeItem == null ? 0 : commonStat$TypeTrackCodeItem.a.hashCode())) * 31;
        String str = this.a;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.posIds;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<CommonAudioStat$AudioDomainEventEntity> list2 = this.entities;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum = this.forceSource;
        return hashCode8 + (commonAudioStat$TypeAudioSourceEnum != null ? commonAudioStat$TypeAudioSourceEnum.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAudioDomainEventItem(clientServerTime=" + this.clientServerTime + ", navInfo=" + this.navInfo + ", sourceInfo=" + this.sourceInfo + ", trackCodeItem=" + this.trackCodeItem + ", playerInitId=" + this.a + ", hintId=" + this.b + ", posIds=" + this.posIds + ", entities=" + this.entities + ", forceSource=" + this.forceSource + ')';
    }

    public /* synthetic */ CommonAudioStat$TypeAudioDomainEventItem(long j, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem, CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem2, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, String str, String str2, List list, List list2, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : commonStat$TypeCommonEventItem, (i & 4) != 0 ? null : commonStat$TypeCommonEventItem2, (i & 8) != 0 ? null : commonStat$TypeTrackCodeItem, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : commonAudioStat$TypeAudioSourceEnum);
    }
}

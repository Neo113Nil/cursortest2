package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: CommonStat.kt */
/* loaded from: classes11.dex */
public final class CommonStat$TypeCommonEventItem {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("id")
    private final Long id;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("url")
    private final String url;

    /* compiled from: CommonStat.kt */
    public static final class PersistenceSerializer implements uay<CommonStat$TypeCommonEventItem>, a9y<CommonStat$TypeCommonEventItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonStat$TypeCommonEventItem(fai.B(x9yVar, "id"), fai.B(x9yVar, "owner_id"), fai.C(x9yVar, "url"), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = (CommonStat$TypeCommonEventItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("id", commonStat$TypeCommonEventItem.a());
            x9yVar.n("owner_id", commonStat$TypeCommonEventItem.b());
            x9yVar.o("url", commonStat$TypeCommonEventItem.c());
            x9yVar.o("track_code", commonStat$TypeCommonEventItem.a);
            return x9yVar;
        }
    }

    public CommonStat$TypeCommonEventItem() {
        this(null, null, null, null, 15, null);
    }

    public final Long a() {
        return this.id;
    }

    public final Long b() {
        return this.ownerId;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonStat$TypeCommonEventItem)) {
            return false;
        }
        CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = (CommonStat$TypeCommonEventItem) obj;
        return epx.f(this.id, commonStat$TypeCommonEventItem.id) && epx.f(this.ownerId, commonStat$TypeCommonEventItem.ownerId) && epx.f(this.url, commonStat$TypeCommonEventItem.url) && epx.f(this.a, commonStat$TypeCommonEventItem.a);
    }

    public final int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.ownerId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.a;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeCommonEventItem(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public CommonStat$TypeCommonEventItem(Long l, Long l2, String str, String str2) {
        this.id = l;
        this.ownerId = l2;
        this.url = str;
        this.a = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str2);
    }

    public /* synthetic */ CommonStat$TypeCommonEventItem(Long l, Long l2, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}

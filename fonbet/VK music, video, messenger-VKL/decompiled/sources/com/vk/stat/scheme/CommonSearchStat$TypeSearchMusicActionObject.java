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

/* compiled from: CommonSearchStat.kt */
/* loaded from: classes11.dex */
public final class CommonSearchStat$TypeSearchMusicActionObject {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("id")
    private final Long id;

    @pmi0("owner_id")
    private final Long ownerId;

    /* compiled from: CommonSearchStat.kt */
    public static final class PersistenceSerializer implements uay<CommonSearchStat$TypeSearchMusicActionObject>, a9y<CommonSearchStat$TypeSearchMusicActionObject> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonSearchStat$TypeSearchMusicActionObject(fai.B(x9yVar, "id"), fai.B(x9yVar, "owner_id"), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonSearchStat$TypeSearchMusicActionObject commonSearchStat$TypeSearchMusicActionObject = (CommonSearchStat$TypeSearchMusicActionObject) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("id", commonSearchStat$TypeSearchMusicActionObject.a());
            x9yVar.n("owner_id", commonSearchStat$TypeSearchMusicActionObject.b());
            x9yVar.o("track_code", commonSearchStat$TypeSearchMusicActionObject.a);
            return x9yVar;
        }
    }

    public CommonSearchStat$TypeSearchMusicActionObject() {
        this(null, null, null, 7, null);
    }

    public final Long a() {
        return this.id;
    }

    public final Long b() {
        return this.ownerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSearchStat$TypeSearchMusicActionObject)) {
            return false;
        }
        CommonSearchStat$TypeSearchMusicActionObject commonSearchStat$TypeSearchMusicActionObject = (CommonSearchStat$TypeSearchMusicActionObject) obj;
        return epx.f(this.id, commonSearchStat$TypeSearchMusicActionObject.id) && epx.f(this.ownerId, commonSearchStat$TypeSearchMusicActionObject.ownerId) && epx.f(this.a, commonSearchStat$TypeSearchMusicActionObject.a);
    }

    public final int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.ownerId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.a;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSearchMusicActionObject(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public CommonSearchStat$TypeSearchMusicActionObject(Long l, Long l2, String str) {
        this.id = l;
        this.ownerId = l2;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonSearchStat$TypeSearchMusicActionObject(Long l, Long l2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str);
    }
}

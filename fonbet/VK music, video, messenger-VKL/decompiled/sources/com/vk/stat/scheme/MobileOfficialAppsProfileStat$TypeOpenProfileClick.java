package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
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

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsProfileStat$TypeOpenProfileClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("profile_track_code")
    private final FilteredString filteredProfileTrackCode;

    @pmi0("profile_id")
    private final long profileId;

    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsProfileStat$TypeOpenProfileClick>, a9y<MobileOfficialAppsProfileStat$TypeOpenProfileClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsProfileStat$TypeOpenProfileClick(fai.q(x9yVar, "profile_id"), fai.C(x9yVar, "profile_track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsProfileStat$TypeOpenProfileClick mobileOfficialAppsProfileStat$TypeOpenProfileClick = (MobileOfficialAppsProfileStat$TypeOpenProfileClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("profile_id", Long.valueOf(mobileOfficialAppsProfileStat$TypeOpenProfileClick.a()));
            x9yVar.o("profile_track_code", mobileOfficialAppsProfileStat$TypeOpenProfileClick.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsProfileStat$TypeOpenProfileClick(long j, String str) {
        this.profileId = j;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredProfileTrackCode = filteredString;
        filteredString.a(str);
    }

    public final long a() {
        return this.profileId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$TypeOpenProfileClick)) {
            return false;
        }
        MobileOfficialAppsProfileStat$TypeOpenProfileClick mobileOfficialAppsProfileStat$TypeOpenProfileClick = (MobileOfficialAppsProfileStat$TypeOpenProfileClick) obj;
        return this.profileId == mobileOfficialAppsProfileStat$TypeOpenProfileClick.profileId && epx.f(this.a, mobileOfficialAppsProfileStat$TypeOpenProfileClick.a);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.profileId) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOpenProfileClick(profileId=");
        sb.append(this.profileId);
        sb.append(", profileTrackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$TypeOpenProfileClick(long j, String str, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : str);
    }
}

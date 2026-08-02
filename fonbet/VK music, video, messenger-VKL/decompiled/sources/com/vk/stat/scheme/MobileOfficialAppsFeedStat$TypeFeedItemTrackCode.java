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

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedItemTrackCode {
    public final transient String a;
    public final transient String b;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("type")
    private final FilteredString filteredType;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedItemTrackCode>, a9y<MobileOfficialAppsFeedStat$TypeFeedItemTrackCode> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(fai.C(x9yVar, "track_code"), fai.C(x9yVar, "type"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode = (MobileOfficialAppsFeedStat$TypeFeedItemTrackCode) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedItemTrackCode.a);
            x9yVar.o("type", mobileOfficialAppsFeedStat$TypeFeedItemTrackCode.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedItemTrackCode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedItemTrackCode)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode = (MobileOfficialAppsFeedStat$TypeFeedItemTrackCode) obj;
        return epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedItemTrackCode.a) && epx.f(this.b, mobileOfficialAppsFeedStat$TypeFeedItemTrackCode.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedItemTrackCode(trackCode=");
        sb.append(this.a);
        sb.append(", type=");
        return ho8.a(sb, this.b, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(String str, String str2) {
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(64));
        this.filteredType = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedItemTrackCode(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

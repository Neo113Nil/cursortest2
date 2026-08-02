package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
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

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;

    @pmi0("item_type")
    private final FilteredString filteredItemType;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError>, a9y<MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError(fai.s(x9yVar, "item_type"), fai.s(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError = (MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("item_type", mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError.a);
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError.b);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError(String str, String str2) {
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredItemType = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError = (MobileOfficialAppsFeedStat$TypeFeedAsyncBlockError) obj;
        return epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError.a) && epx.f(this.b, mobileOfficialAppsFeedStat$TypeFeedAsyncBlockError.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedAsyncBlockError(itemType=");
        sb.append(this.a);
        sb.append(", trackCode=");
        return ho8.a(sb, this.b, ')');
    }
}

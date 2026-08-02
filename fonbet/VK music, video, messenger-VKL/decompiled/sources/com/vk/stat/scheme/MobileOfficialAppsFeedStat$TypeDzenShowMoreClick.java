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

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeDzenShowMoreClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("count")
    private final int count;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeDzenShowMoreClick>, a9y<MobileOfficialAppsFeedStat$TypeDzenShowMoreClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeDzenShowMoreClick(fai.p(x9yVar, "count"), fai.s(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick = (MobileOfficialAppsFeedStat$TypeDzenShowMoreClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("count", Integer.valueOf(mobileOfficialAppsFeedStat$TypeDzenShowMoreClick.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeDzenShowMoreClick.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeDzenShowMoreClick(int i, String str) {
        this.count = i;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final int a() {
        return this.count;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeDzenShowMoreClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeDzenShowMoreClick mobileOfficialAppsFeedStat$TypeDzenShowMoreClick = (MobileOfficialAppsFeedStat$TypeDzenShowMoreClick) obj;
        return this.count == mobileOfficialAppsFeedStat$TypeDzenShowMoreClick.count && epx.f(this.a, mobileOfficialAppsFeedStat$TypeDzenShowMoreClick.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeDzenShowMoreClick(count=");
        sb.append(this.count);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }
}

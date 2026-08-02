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
public final class MobileOfficialAppsFeedStat$TypeDzenStoryItemClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeDzenStoryItemClick>, a9y<MobileOfficialAppsFeedStat$TypeDzenStoryItemClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new MobileOfficialAppsFeedStat$TypeDzenStoryItemClick(fai.s((x9y) b9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", ((MobileOfficialAppsFeedStat$TypeDzenStoryItemClick) obj).a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeDzenStoryItemClick(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeDzenStoryItemClick) && epx.f(this.a, ((MobileOfficialAppsFeedStat$TypeDzenStoryItemClick) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeDzenStoryItemClick(trackCode="), this.a, ')');
    }
}

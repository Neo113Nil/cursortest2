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

/* compiled from: CommonStat.kt */
/* loaded from: classes11.dex */
public final class CommonStat$TypeTrackCodeItem {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* compiled from: CommonStat.kt */
    public static final class PersistenceSerializer implements uay<CommonStat$TypeTrackCodeItem>, a9y<CommonStat$TypeTrackCodeItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new CommonStat$TypeTrackCodeItem(fai.s((x9y) b9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", ((CommonStat$TypeTrackCodeItem) obj).a);
            return x9yVar;
        }
    }

    public CommonStat$TypeTrackCodeItem(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonStat$TypeTrackCodeItem) && epx.f(this.a, ((CommonStat$TypeTrackCodeItem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeTrackCodeItem(trackCode="), this.a, ')');
    }
}

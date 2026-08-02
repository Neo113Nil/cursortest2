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
public final class CommonSearchStat$TypeSearchContextItem {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* compiled from: CommonSearchStat.kt */
    public static final class PersistenceSerializer implements uay<CommonSearchStat$TypeSearchContextItem>, a9y<CommonSearchStat$TypeSearchContextItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new CommonSearchStat$TypeSearchContextItem(fai.C((x9y) b9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", ((CommonSearchStat$TypeSearchContextItem) obj).a);
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonSearchStat$TypeSearchContextItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonSearchStat$TypeSearchContextItem) && epx.f(this.a, ((CommonSearchStat$TypeSearchContextItem) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeSearchContextItem(trackCode="), this.a, ')');
    }

    public CommonSearchStat$TypeSearchContextItem(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonSearchStat$TypeSearchContextItem(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}

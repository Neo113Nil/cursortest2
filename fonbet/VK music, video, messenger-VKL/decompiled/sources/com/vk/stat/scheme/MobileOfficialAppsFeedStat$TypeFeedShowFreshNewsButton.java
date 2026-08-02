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
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;

    @pmi0("new_next_from")
    private final FilteredString filteredNewNextFrom;

    @pmi0("prev_next_from")
    private final FilteredString filteredPrevNextFrom;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton>, a9y<MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton(fai.C(x9yVar, "prev_next_from"), fai.C(x9yVar, "new_next_from"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton = (MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("prev_next_from", mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton.a);
            x9yVar.o("new_next_from", mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton = (MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton) obj;
        return epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton.a) && epx.f(this.b, mobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedShowFreshNewsButton(prevNextFrom=");
        sb.append(this.a);
        sb.append(", newNextFrom=");
        return ho8.a(sb, this.b, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton(String str, String str2) {
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredPrevNextFrom = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredNewNextFrom = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedShowFreshNewsButton(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

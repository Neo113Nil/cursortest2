package defpackage;

import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ymj implements fnj {
    public final TopStatsCategory a;
    public final boolean b;

    public ymj(TopStatsCategory topStatsCategory, boolean z) {
        topStatsCategory.getClass();
        this.a = topStatsCategory;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymj)) {
            return false;
        }
        ymj ymjVar = (ymj) obj;
        return Intrinsics.c(this.a, ymjVar.a) && this.b == ymjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DismissInformationalText(leadersCategory=" + this.a + ", isModal=" + this.b + ")";
    }
}

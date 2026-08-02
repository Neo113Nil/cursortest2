package defpackage;

import com.sofascore.model.newNetwork.StandingsResponse;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ibi {
    public final StandingsResponse a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    public ibi(StandingsResponse standingsResponse, String str, Integer num, Integer num2, Integer num3, boolean z) {
        standingsResponse.getClass();
        str.getClass();
        this.a = standingsResponse;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibi)) {
            return false;
        }
        ibi ibiVar = (ibi) obj;
        return Intrinsics.c(this.a, ibiVar.a) && Intrinsics.c(this.b, ibiVar.b) && Intrinsics.c(this.c, ibiVar.c) && Intrinsics.c(this.d, ibiVar.d) && Intrinsics.c(this.e, ibiVar.e) && this.f == ibiVar.f;
    }

    public final int hashCode() {
        int c = dmi.c(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastMappedResponse(response=");
        sb.append(this.a);
        sb.append(", sportSlug=");
        sb.append(this.b);
        sb.append(", firstTeamId=");
        vxd.r(this.c, this.d, ", secondTeamId=", ", year=", sb);
        sb.append(this.e);
        sb.append(", hasPerformanceGraphData=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}

package defpackage;

import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ey4 {
    public final SuggestStatus a;
    public final CrowdsourcingIncidentType b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final TeamSide h;
    public final Boolean i;

    public ey4(SuggestStatus suggestStatus, CrowdsourcingIncidentType crowdsourcingIncidentType, String str, Integer num, Integer num2, String str2, String str3, TeamSide teamSide, Boolean bool) {
        crowdsourcingIncidentType.getClass();
        this.a = suggestStatus;
        this.b = crowdsourcingIncidentType;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = str3;
        this.h = teamSide;
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey4)) {
            return false;
        }
        ey4 ey4Var = (ey4) obj;
        return this.a == ey4Var.a && Intrinsics.c(this.b, ey4Var.b) && Intrinsics.c(this.c, ey4Var.c) && Intrinsics.c(this.d, ey4Var.d) && Intrinsics.c(this.e, ey4Var.e) && Intrinsics.c(this.f, ey4Var.f) && Intrinsics.c(this.g, ey4Var.g) && this.h == ey4Var.h && Intrinsics.c(this.i, ey4Var.i);
    }

    public final int hashCode() {
        SuggestStatus suggestStatus = this.a;
        int hashCode = (this.b.hashCode() + ((suggestStatus == null ? 0 : suggestStatus.hashCode()) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TeamSide teamSide = this.h;
        int hashCode7 = (hashCode6 + (teamSide == null ? 0 : teamSide.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailPreviewUiModel(status=");
        sb.append(this.a);
        sb.append(", incidentType=");
        sb.append(this.b);
        sb.append(", minute=");
        me4.o(this.d, this.c, ", homeScore=", ", awayScore=", sb);
        vxd.s(this.e, ", playerName=", this.f, ", assistName=", sb);
        sb.append(this.g);
        sb.append(", teamSide=");
        sb.append(this.h);
        sb.append(", applied=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}

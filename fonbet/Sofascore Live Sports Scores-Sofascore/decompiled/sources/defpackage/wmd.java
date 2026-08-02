package defpackage;

import com.sofascore.model.mvvm.model.ServerType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wmd {
    public final int a;
    public final ServerType b;
    public final m9k c;
    public final Long d;
    public final String e;
    public final String f;
    public final Integer g;
    public final wmd h;

    public wmd(int i, ServerType serverType, m9k m9kVar, Long l, String str, String str2, Integer num, wmd wmdVar) {
        str.getClass();
        this.a = i;
        this.b = serverType;
        this.c = m9kVar;
        this.d = l;
        this.e = str;
        this.f = str2;
        this.g = num;
        this.h = wmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmd)) {
            return false;
        }
        wmd wmdVar = (wmd) obj;
        return this.a == wmdVar.a && this.b == wmdVar.b && this.c.equals(wmdVar.c) && Intrinsics.c(this.d, wmdVar.d) && Intrinsics.c(this.e, wmdVar.e) && Intrinsics.c(this.f, wmdVar.f) && Intrinsics.c(this.g, wmdVar.g) && Intrinsics.c(this.h, wmdVar.h);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        ServerType serverType = this.b;
        int c = dmi.c((hashCode + (serverType == null ? 0 : serverType.hashCode())) * 31, 31, this.c.a);
        Long l = this.d;
        int c2 = dmi.c((c + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int hashCode2 = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        wmd wmdVar = this.h;
        return hashCode3 + (wmdVar != null ? wmdVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OddsStageUIModel(analyticsId=");
        sb.append(this.a);
        sb.append(", stageType=");
        sb.append(this.b);
        sb.append(", stageTitle=");
        sb.append(this.c);
        sb.append(", stageStartTimestamp=");
        sb.append(this.d);
        sb.append(", stageStatus=");
        bf3.v(sb, this.e, ", countryAlpha2=", this.f, ", categoryId=");
        sb.append(this.g);
        sb.append(", raceSubStage=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}

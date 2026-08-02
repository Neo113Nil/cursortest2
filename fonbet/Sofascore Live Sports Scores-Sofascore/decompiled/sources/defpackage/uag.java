package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uag {
    public final String a;
    public final Double b;
    public final String c;
    public final tag d;
    public final sag e;
    public final Map f;

    public uag(String str, Double d, String str2, tag tagVar, sag sagVar, Map map) {
        this.a = str;
        this.b = d;
        this.c = str2;
        this.d = tagVar;
        this.e = sagVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uag)) {
            return false;
        }
        uag uagVar = (uag) obj;
        return Intrinsics.c(this.a, uagVar.a) && Intrinsics.c(this.b, uagVar.b) && Intrinsics.c(this.c, uagVar.c) && Intrinsics.c(this.d, uagVar.d) && Intrinsics.c(this.e, uagVar.e) && this.f.equals(uagVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        tag tagVar = this.d;
        int hashCode4 = (hashCode3 + (tagVar == null ? 0 : tagVar.hashCode())) * 31;
        sag sagVar = this.e;
        return this.f.hashCode() + ((hashCode4 + (sagVar != null ? sagVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SASAdInfo(insertionId=" + this.a + ", aspectRatio=" + this.b + ", mediationSdkName=" + this.c + ", programmaticInfo=" + this.d + ", digitalServiceAct=" + this.e + ", extraParameters=" + this.f + ")";
    }
}

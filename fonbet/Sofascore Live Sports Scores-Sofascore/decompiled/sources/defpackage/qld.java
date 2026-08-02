package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qld {
    public final String a;
    public final Map b;
    public final Map c;

    public qld(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = str;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qld)) {
            return false;
        }
        qld qldVar = (qld) obj;
        return Intrinsics.c(this.a, qldVar.a) && Intrinsics.c(this.b, qldVar.b) && Intrinsics.c(this.c, qldVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.c;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "OddsGroupWrapper(name=" + this.a + ", oddsList=" + this.b + ", liveOddsList=" + this.c + ")";
    }
}

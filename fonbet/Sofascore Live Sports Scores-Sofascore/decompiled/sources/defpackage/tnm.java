package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tnm {
    public final Map a;
    public final String b;
    public final mr9 c;

    public tnm(Map map, String str, mr9 mr9Var) {
        map.getClass();
        this.a = map;
        this.b = str;
        this.c = mr9Var;
    }

    public static tnm copy$default(tnm tnmVar, Map map, String str, mr9 mr9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tnmVar.a;
        }
        if ((i & 2) != 0) {
            str = tnmVar.b;
        }
        if ((i & 4) != 0) {
            mr9Var = tnmVar.c;
        }
        tnmVar.getClass();
        map.getClass();
        return new tnm(map, str, mr9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnm)) {
            return false;
        }
        tnm tnmVar = (tnm) obj;
        return Intrinsics.c(this.a, tnmVar.a) && Intrinsics.c(this.b, tnmVar.b) && Intrinsics.c(this.c, tnmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        mr9 mr9Var = this.c;
        return hashCode2 + (mr9Var != null ? mr9Var.hashCode() : 0);
    }

    public final String toString() {
        return "DelegateResults(appExtraParams=" + this.a + ", overrideAdTagUrl=" + this.b + ", customIMASettings=" + this.c + ')';
    }
}

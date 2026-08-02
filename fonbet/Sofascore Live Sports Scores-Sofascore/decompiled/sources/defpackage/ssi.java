package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ssi {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public ssi(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public static final ssi a(rr8 rr8Var, String str) {
        return o6a.I(new cni(rr8Var), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssi)) {
            return false;
        }
        ssi ssiVar = (ssi) obj;
        if (!this.a.equals(ssiVar.a) || !this.b.equals(ssiVar.b) || !Intrinsics.c(this.c, ssiVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = ssiVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(s6a.v(CollectionsKt.H0(this.b.values(), new q6i(4))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(s6a.v(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set == null || (collection = CollectionsKt.H0(set, new q6i(5))) == null) {
            collection = km5.a;
        }
        sb.append(s6a.v(collection));
        sb.append("\n            |}\n        ");
        return dii.d(sb.toString());
    }
}

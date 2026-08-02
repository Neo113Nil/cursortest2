package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes3.dex */
public final class s7h {

    @NotNull
    public static final r7h Companion = new r7h();
    public static final joa[] d = {null, null, ypa.a(ysa.b, new b7h(10))};
    public final x7h a;
    public final ygj b;
    public final Map c;

    public /* synthetic */ s7h(int i, x7h x7hVar, ygj ygjVar, Map map) {
        if (1 != (i & 1)) {
            oea.z(i, 1, q7h.a.getDescriptor());
            throw null;
        }
        this.a = x7hVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ygjVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static s7h a(s7h s7hVar, x7h x7hVar, ygj ygjVar, Map map, int i) {
        if ((i & 1) != 0) {
            x7hVar = s7hVar.a;
        }
        if ((i & 2) != 0) {
            ygjVar = s7hVar.b;
        }
        if ((i & 4) != 0) {
            map = s7hVar.c;
        }
        s7hVar.getClass();
        x7hVar.getClass();
        return new s7h(x7hVar, ygjVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7h)) {
            return false;
        }
        s7h s7hVar = (s7h) obj;
        return Intrinsics.c(this.a, s7hVar.a) && Intrinsics.c(this.b, s7hVar.b) && Intrinsics.c(this.c, s7hVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ygj ygjVar = this.b;
        int hashCode2 = (hashCode + (ygjVar == null ? 0 : Long.hashCode(ygjVar.a))) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionData(sessionDetails=");
        sb.append(this.a);
        sb.append(", backgroundTime=");
        sb.append(this.b);
        sb.append(", processDataMap=");
        return dmi.s(sb, this.c, ')');
    }

    public s7h(x7h x7hVar, ygj ygjVar, Map map) {
        x7hVar.getClass();
        this.a = x7hVar;
        this.b = ygjVar;
        this.c = map;
    }
}

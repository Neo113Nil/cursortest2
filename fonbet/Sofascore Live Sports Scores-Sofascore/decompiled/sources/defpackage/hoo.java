package defpackage;

import com.ironsource.U3;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hoo implements yf {
    public final xf a;
    public final hf b;
    public final Map c;
    public final v9f d;
    public final wje e;
    public final b2p f;

    public hoo(xf xfVar, hf hfVar, Map map, v9f v9fVar, wje wjeVar, tkn tknVar) {
        this.a = xfVar;
        this.b = hfVar;
        this.c = map;
        this.d = v9fVar;
        this.e = wjeVar;
        this.f = b2p.l(tknVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoo)) {
            return false;
        }
        hoo hooVar = (hoo) obj;
        return this.a == hooVar.a && Objects.equals(this.b, hooVar.b) && Objects.equals(this.c, hooVar.c) && this.d == hooVar.d && this.e == hooVar.e && Objects.equals(this.f, hooVar.f);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String format = String.format("AdEvent[type=%s, ad=%s, adProgressInfo=%s, customUi=%s", this.a, this.b, this.d, this.f.i());
        String str = U3.j.e;
        Map map = this.c;
        if (map != null) {
            StringBuilder sb = new StringBuilder("{");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            str = lnb.o(", adData=", sb.toString(), U3.j.e);
        }
        return format.concat(str);
    }
}

package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.BridgeConfiguration;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u3o extends j7o {
    public final BridgeConfiguration a;
    public final mqn b;
    public final sen c;
    public final ExecutorService d;

    public u3o(BridgeConfiguration bridgeConfiguration, mqn mqnVar, sen senVar, ExecutorService executorService) {
        this.a = bridgeConfiguration;
        this.b = mqnVar;
        if (senVar == null) {
            yhk.s("Null latencyEventsBuilder");
            throw null;
        }
        this.c = senVar;
        if (executorService != null) {
            this.d = executorService;
        } else {
            yhk.s("Null executorService");
            throw null;
        }
    }

    @Override // defpackage.j7o
    public final BridgeConfiguration a() {
        return this.a;
    }

    @Override // defpackage.j7o
    public final mqn b() {
        return this.b;
    }

    @Override // defpackage.j7o
    public final sen c() {
        return this.c;
    }

    @Override // defpackage.j7o
    public final ExecutorService d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j7o)) {
            return false;
        }
        j7o j7oVar = (j7o) obj;
        return this.a.equals(j7oVar.a()) && this.b.equals(j7oVar.b()) && this.c.equals(j7oVar.c()) && this.d.equals(j7oVar.d());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        int length2 = obj2.length();
        String obj3 = this.c.toString();
        int length3 = obj3.length();
        String obj4 = this.d.toString();
        StringBuilder sb = new StringBuilder(fn0.b(length, 50, length2, 23, length3, 18, obj4.length()) + 1);
        bf3.v(sb, "JsComponent{bridgeConfiguration=", obj, ", jsMessageRouter=", obj2);
        bf3.v(sb, ", latencyEventsBuilder=", obj3, ", executorService=", obj4);
        sb.append("}");
        return sb.toString();
    }
}

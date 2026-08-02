package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pkn {
    public final b2p a;
    public final b2p b;
    public final q3p c;
    public final b2p d;

    public pkn(b2p b2pVar, b2p b2pVar2, q3p q3pVar, b2p b2pVar3) {
        this.a = b2pVar;
        this.b = b2pVar2;
        if (q3pVar == null) {
            yhk.s("Null secureSignals");
            throw null;
        }
        this.c = q3pVar;
        this.d = b2pVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pkn) {
            pkn pknVar = (pkn) obj;
            if (this.a.equals(pknVar.a) && this.b.equals(pknVar.b) && this.c.equals(pknVar.c) && this.d.equals(pknVar.d)) {
                return true;
            }
        }
        return false;
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
        StringBuilder sb = new StringBuilder(fn0.b(length, 56, length2, 16, length3, 26, obj4.length()) + 1);
        bf3.v(sb, "RequestSignals{identifierInfoOptional=", obj, ", spamMsParameter=", obj2);
        bf3.v(sb, ", secureSignals=", obj3, ", platformSignalsOptional=", obj4);
        sb.append("}");
        return sb.toString();
    }
}

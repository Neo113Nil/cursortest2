package defpackage;

import com.google.firebase.inappmessaging.model.MessageType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gtc extends lw9 {
    public final n7j c;
    public final n7j d;
    public final sr9 e;
    public final wa f;
    public final String g;

    public gtc(yih yihVar, n7j n7jVar, n7j n7jVar2, sr9 sr9Var, wa waVar, String str) {
        super(yihVar, MessageType.MODAL);
        this.c = n7jVar;
        this.d = n7jVar2;
        this.e = sr9Var;
        this.f = waVar;
        this.g = str;
    }

    @Override // defpackage.lw9
    public final sr9 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gtc)) {
            return false;
        }
        gtc gtcVar = (gtc) obj;
        sr9 sr9Var = gtcVar.e;
        wa waVar = gtcVar.f;
        n7j n7jVar = gtcVar.d;
        if (hashCode() != gtcVar.hashCode()) {
            return false;
        }
        n7j n7jVar2 = this.d;
        if ((n7jVar2 == null && n7jVar != null) || (n7jVar2 != null && !n7jVar2.equals(n7jVar))) {
            return false;
        }
        wa waVar2 = this.f;
        if ((waVar2 == null && waVar != null) || (waVar2 != null && !waVar2.equals(waVar))) {
            return false;
        }
        sr9 sr9Var2 = this.e;
        return (sr9Var2 != null || sr9Var == null) && (sr9Var2 == null || sr9Var2.equals(sr9Var)) && this.c.equals(gtcVar.c) && this.g.equals(gtcVar.g);
    }

    public final int hashCode() {
        n7j n7jVar = this.d;
        int hashCode = n7jVar != null ? n7jVar.hashCode() : 0;
        wa waVar = this.f;
        int hashCode2 = waVar != null ? waVar.hashCode() : 0;
        sr9 sr9Var = this.e;
        return this.g.hashCode() + this.c.hashCode() + hashCode + hashCode2 + (sr9Var != null ? sr9Var.a.hashCode() : 0);
    }
}

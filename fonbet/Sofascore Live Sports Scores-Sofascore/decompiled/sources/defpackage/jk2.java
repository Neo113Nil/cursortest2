package defpackage;

import com.google.firebase.inappmessaging.model.MessageType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jk2 extends lw9 {
    public final n7j c;
    public final n7j d;
    public final String e;
    public final wa f;
    public final wa g;
    public final sr9 h;
    public final sr9 i;

    public jk2(yih yihVar, n7j n7jVar, n7j n7jVar2, sr9 sr9Var, sr9 sr9Var2, String str, wa waVar, wa waVar2) {
        super(yihVar, MessageType.CARD);
        this.c = n7jVar;
        this.d = n7jVar2;
        this.h = sr9Var;
        this.i = sr9Var2;
        this.e = str;
        this.f = waVar;
        this.g = waVar2;
    }

    @Override // defpackage.lw9
    public final sr9 a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jk2)) {
            return false;
        }
        jk2 jk2Var = (jk2) obj;
        sr9 sr9Var = jk2Var.i;
        sr9 sr9Var2 = jk2Var.h;
        wa waVar = jk2Var.g;
        n7j n7jVar = jk2Var.d;
        if (hashCode() != jk2Var.hashCode()) {
            return false;
        }
        n7j n7jVar2 = this.d;
        if ((n7jVar2 == null && n7jVar != null) || (n7jVar2 != null && !n7jVar2.equals(n7jVar))) {
            return false;
        }
        wa waVar2 = this.g;
        if ((waVar2 == null && waVar != null) || (waVar2 != null && !waVar2.equals(waVar))) {
            return false;
        }
        sr9 sr9Var3 = this.h;
        if ((sr9Var3 == null && sr9Var2 != null) || (sr9Var3 != null && !sr9Var3.equals(sr9Var2))) {
            return false;
        }
        sr9 sr9Var4 = this.i;
        return (sr9Var4 != null || sr9Var == null) && (sr9Var4 == null || sr9Var4.equals(sr9Var)) && this.c.equals(jk2Var.c) && this.f.equals(jk2Var.f) && this.e.equals(jk2Var.e);
    }

    public final int hashCode() {
        n7j n7jVar = this.d;
        int hashCode = n7jVar != null ? n7jVar.hashCode() : 0;
        wa waVar = this.g;
        int hashCode2 = waVar != null ? waVar.hashCode() : 0;
        sr9 sr9Var = this.h;
        int hashCode3 = sr9Var != null ? sr9Var.a.hashCode() : 0;
        sr9 sr9Var2 = this.i;
        return this.f.hashCode() + this.e.hashCode() + this.c.hashCode() + hashCode + hashCode2 + hashCode3 + (sr9Var2 != null ? sr9Var2.a.hashCode() : 0);
    }
}

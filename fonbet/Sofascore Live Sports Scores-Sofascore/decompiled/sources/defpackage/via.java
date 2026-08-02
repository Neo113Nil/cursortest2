package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvia;", "Lbuc;", "Lxia;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class via extends buc {
    public final Function1 a;
    public final Function1 b;

    public via(Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    @Override // defpackage.buc
    public final wtc c() {
        xia xiaVar = new xia();
        xiaVar.o = this.a;
        xiaVar.p = this.b;
        return xiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof via)) {
            return false;
        }
        via viaVar = (via) obj;
        return this.a == viaVar.a && this.b == viaVar.b;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        xia xiaVar = (xia) wtcVar;
        xiaVar.o = this.a;
        xiaVar.p = this.b;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.b;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }
}

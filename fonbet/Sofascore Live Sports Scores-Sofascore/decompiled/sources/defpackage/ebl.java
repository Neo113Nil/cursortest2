package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lebl;", "Lbuc;", "Lzfh;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ebl extends buc {
    public final jo a;

    public ebl(jo joVar) {
        this.a = joVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        zfh zfhVar = new zfh();
        zfhVar.o = this.a;
        return zfhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ebl eblVar = obj instanceof ebl ? (ebl) obj : null;
        if (eblVar == null) {
            return false;
        }
        return Intrinsics.c(this.a, eblVar.a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((zfh) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

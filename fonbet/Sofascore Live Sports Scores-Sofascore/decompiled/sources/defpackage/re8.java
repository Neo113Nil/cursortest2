package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lre8;", "Lbuc;", "Lse8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class re8 extends buc {
    public final wzc a;

    public re8(wzc wzcVar) {
        this.a = wzcVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new se8(this.a, (x9j) null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof re8) {
            return Intrinsics.c(this.a, ((re8) obj).a);
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((se8) wtcVar).o1(this.a);
    }

    public final int hashCode() {
        wzc wzcVar = this.a;
        if (wzcVar != null) {
            return wzcVar.hashCode();
        }
        return 0;
    }
}

package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li8j;", "Lbuc;", "Lk8j;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class i8j extends buc {
    public final Function2 a;

    public i8j(Function2 function2) {
        this.a = function2;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new k8j(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i8j) {
            return this.a == ((i8j) obj).a;
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((k8j) wtcVar).q = this.a;
    }

    public final int hashCode() {
        Function2 function2 = this.a;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }
}

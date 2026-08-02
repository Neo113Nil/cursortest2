package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhma;", "Lbuc;", "Lima;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class hma extends buc {
    public final String a;

    public hma(String str) {
        this.a = str;
    }

    @Override // defpackage.buc
    public final wtc c() {
        ima imaVar = new ima();
        imaVar.o = this.a;
        return imaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hma) && this.a.equals(((hma) obj).a);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((ima) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.a) + ')';
    }
}

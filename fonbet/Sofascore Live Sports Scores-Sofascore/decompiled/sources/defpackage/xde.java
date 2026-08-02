package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xde extends hcl {
    @Override // defpackage.hcl
    public final icl b() {
        if (this.a && this.c.j.d) {
            a70.p("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        lcl lclVar = this.c;
        if (!lclVar.q) {
            return new yde(this.b, lclVar, this.d);
        }
        a70.p("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // defpackage.hcl
    public final hcl c() {
        return this;
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mwf extends waa {
    public final waa d;
    public final int e;

    public mwf(waa waaVar, int i) {
        this.d = waaVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mwf)) {
            return false;
        }
        mwf mwfVar = (mwf) obj;
        return mwfVar.d.equals(this.d) && mwfVar.e == this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.e * 31);
    }
}

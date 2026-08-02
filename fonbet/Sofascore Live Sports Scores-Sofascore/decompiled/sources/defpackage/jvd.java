package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jvd {
    public final Object a;

    public jvd(Object obj) {
        if (obj != null) {
            this.a = obj;
        } else {
            yhk.s("value for optional is empty.");
            throw null;
        }
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        ogj.m("No value present");
        return null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public jvd() {
        this.a = null;
    }
}

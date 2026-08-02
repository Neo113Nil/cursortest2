package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class uf6 implements tmi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uf6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tmi
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (yq4) obj;
            case 1:
                return (qcc) obj;
            case 2:
                return (zr4) obj;
            default:
                return Boolean.valueOf(((hh6) obj).x);
        }
    }
}

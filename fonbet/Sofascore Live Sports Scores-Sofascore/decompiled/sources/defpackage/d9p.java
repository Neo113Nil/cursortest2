package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d9p extends map {
    public final /* synthetic */ int a;

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        switch (this.a) {
            case 0:
                if (e7nVar.Q0() != 9) {
                    return Double.valueOf(e7nVar.n0());
                }
                e7nVar.j0();
                return null;
            case 1:
                if (e7nVar.Q0() != 9) {
                    return Float.valueOf((float) e7nVar.n0());
                }
                e7nVar.j0();
                return null;
            default:
                e7nVar.E0();
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    h9p.a(doubleValue);
                    f7nVar.Z(doubleValue);
                    break;
                } else {
                    f7nVar.f0();
                    break;
                }
            case 1:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    h9p.a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    f7nVar.e0(number2);
                    break;
                } else {
                    f7nVar.f0();
                    break;
                }
            default:
                f7nVar.f0();
                break;
        }
    }
}

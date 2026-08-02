package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wc5 extends wj9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc5(Object obj, int i) {
        super(13);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.wj9
    public final Object A(kmb kmbVar) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Float f = (Float) ((wj9) obj).A(kmbVar);
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
            default:
                return ((oo) obj).invoke(kmbVar);
        }
    }
}

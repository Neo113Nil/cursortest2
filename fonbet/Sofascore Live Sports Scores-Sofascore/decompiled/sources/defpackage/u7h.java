package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u7h implements wff {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u7h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static u7h a(Object obj) {
        if (obj != null) {
            return new u7h(obj, 2);
        }
        yhk.s("instance cannot be null");
        return null;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new t7h((c8h) ((wff) obj).get());
            case 1:
                return new y8h((seh) ((wff) obj).get());
            default:
                return obj;
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uhh implements xff {
    public static final Object c = new Object();
    public volatile xff a;
    public volatile Object b;

    public static xff a(xff xffVar) {
        if (xffVar instanceof uhh) {
            return xffVar;
        }
        if (xffVar instanceof y65) {
            return xffVar;
        }
        uhh uhhVar = new uhh();
        uhhVar.b = c;
        uhhVar.a = xffVar;
        return uhhVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        xff xffVar = this.a;
        if (xffVar == null) {
            return this.b;
        }
        Object obj2 = xffVar.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}

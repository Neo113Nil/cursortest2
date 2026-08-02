package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lsm implements tlm {
    public final k6g a;
    public final hnm b;
    public final uom c;
    public final aqm d;

    public lsm(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new hnm(k6gVar);
        this.c = new uom(k6gVar);
        this.d = new aqm(k6gVar);
    }

    public final int a(String str, String str2) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        uom uomVar = this.c;
        mni a = uomVar.a();
        if (str2 == null) {
            a.s(1);
        } else {
            a.m0(1, str2);
        }
        if (str == null) {
            a.s(2);
        } else {
            a.m0(2, str);
        }
        k6gVar.beginTransaction();
        try {
            int F = a.F();
            k6gVar.setTransactionSuccessful();
            return F;
        } finally {
            k6gVar.endTransaction();
            uomVar.m(a);
        }
    }
}

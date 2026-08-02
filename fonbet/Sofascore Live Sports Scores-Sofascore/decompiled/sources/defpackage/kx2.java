package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class kx2 extends IllegalStateException {
    public final /* synthetic */ int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kx2(aq4 aq4Var, String str) {
        super(lnb.q(r0, str, '\"'));
        this.a = 6;
        aq4Var.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder("Bad response: ");
        sb.append(aq4Var);
        sb.append(". Text: \"");
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.a) {
            case 0:
                return null;
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx2(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx2(String str, int i) {
        super(str);
        this.a = i;
    }

    public /* synthetic */ kx2(int i) {
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx2(String str, Throwable th) {
        super("Concurrent " + str + " attempts", th);
        this.a = 1;
        str.getClass();
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ux2 extends kx2 {
    public final /* synthetic */ int b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux2(aq4 aq4Var, String str, int i) {
        super(aq4Var, str);
        this.b = i;
        aq4Var.getClass();
        str.getClass();
        switch (i) {
            case 1:
                super(aq4Var, str);
                this.c = "Unhandled redirect: " + aq4Var.b().c().getMethod().a + ' ' + aq4Var.b().c().getUrl() + ". Status: " + aq4Var.d() + ". Text: \"" + str + '\"';
                break;
            case 2:
                super(aq4Var, str);
                this.c = "Server error(" + aq4Var.b().c().getMethod().a + ' ' + aq4Var.b().c().getUrl() + ": " + aq4Var.d() + ". Text: \"" + str + '\"';
                break;
            default:
                this.c = "Client request(" + aq4Var.b().c().getMethod().a + ' ' + aq4Var.b().c().getUrl() + ") invalid: " + aq4Var.d() + ". Text: \"" + str + '\"';
                break;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.b) {
        }
        return this.c;
    }
}

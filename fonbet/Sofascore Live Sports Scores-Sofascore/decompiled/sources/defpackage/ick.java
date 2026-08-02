package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ick extends s9e {
    public final hv9 c;

    public ick(String str, vvf vvfVar) {
        super(str, null, false, 1);
        this.c = hv9.v(vvfVar);
    }

    @Override // defpackage.s9e, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        hv9 hv9Var = this.c;
        if (hv9Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + hv9Var;
    }
}

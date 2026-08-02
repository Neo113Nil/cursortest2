package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class m27 implements q4a {
    public final /* synthetic */ int a;

    public /* synthetic */ m27(int i) {
        this.a = i;
    }

    @Override // defpackage.q4a
    public final void j(l9j l9jVar) {
        switch (this.a) {
            case 0:
                mo2 mo2Var = l9jVar.c;
                StringBuilder sb = new StringBuilder();
                int length = mo2Var.length();
                for (int i = 0; i < length; i++) {
                    char charAt = mo2Var.charAt(i);
                    if (Character.isLetterOrDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                l9jVar.c(0, mo2Var.length(), sb);
                break;
            default:
                mo2 mo2Var2 = l9jVar.c;
                StringBuilder sb2 = new StringBuilder();
                int length2 = mo2Var2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    char charAt2 = mo2Var2.charAt(i2);
                    if (Character.isLetterOrDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                }
                l9jVar.c(0, mo2Var2.length(), sb2);
                break;
        }
    }
}

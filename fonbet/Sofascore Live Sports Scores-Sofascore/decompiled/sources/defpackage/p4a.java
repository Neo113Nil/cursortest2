package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p4a implements q4a {
    public static final /* synthetic */ p4a b = new p4a(0);
    public final /* synthetic */ int a;

    public /* synthetic */ p4a(int i) {
        this.a = i;
    }

    @Override // defpackage.q4a
    public final void j(l9j l9jVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                mo2 mo2Var = l9jVar.c;
                if (!TextUtils.isDigitsOnly(mo2Var)) {
                    int length = mo2Var.length();
                    m9j m9jVar = l9jVar.a;
                    l9jVar.c(0, length, m9jVar.c.toString());
                    l9jVar.f(m9jVar.d);
                    l9jVar.a().q();
                }
                if (mo2Var.length() > 1 && iii.E(mo2Var) == '0') {
                    l9jVar.c(0, 1, "");
                }
                if (mo2Var.length() == 0) {
                    l9jVar.c(0, 0, "0");
                    break;
                }
                break;
        }
    }

    private final void a(l9j l9jVar) {
    }
}

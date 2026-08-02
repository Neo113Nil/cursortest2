package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l10 {
    public static volatile l10 b;
    public boolean a;

    public static l10 c() {
        if (b == null) {
            synchronized (l10.class) {
                if (b == null) {
                    l10 l10Var = new l10();
                    l10Var.a = false;
                    synchronized (wib.class) {
                        if (wib.b == null) {
                            wib.b = new wib(0);
                        }
                    }
                    b = l10Var;
                }
            }
        }
        return b;
    }

    public final void a(String str, Object... objArr) {
        if (this.a) {
            String.format(Locale.ENGLISH, str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.a) {
            String.format(Locale.ENGLISH, str, objArr);
        }
    }

    public final void d(String str, Object... objArr) {
        if (this.a) {
            String.format(Locale.ENGLISH, str, objArr);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.a) {
            String.format(Locale.ENGLISH, str, objArr);
        }
    }
}

package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class okn {
    public int a = 1;
    public eg9 b;
    public final String c;

    public okn(String str, eg9 eg9Var) {
        this.c = str;
        this.b = eg9Var;
    }

    public final boolean a(int i) {
        int i2 = this.a;
        if (i2 == i || i2 == 4) {
            return false;
        }
        String str = this.c;
        if (i == 2) {
            this.b.onShown(bf3.f("targetPackage", str));
        } else if (i == 3) {
            this.b.onDismissed(bf3.f("targetPackage", str));
        } else if (i != 4) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            bundle.putBoolean("dldpRedirect", true);
            this.b.onDismissed(bundle);
        } else if (i2 == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", str);
            bundle2.putString("errorMessage", "HSDP overlay destroyed");
            this.b.onDismissed(bundle2);
        }
        this.a = i;
        return true;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("HsdpOverlay{'");
        w1l.q(i, this.c, "': ", ", ", sb);
        return mz1.o(sb, valueOf, "}");
    }
}

package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class icc {
    public lcc a;

    public icc(String str, int i, int i2) {
        if (str == null) {
            yhk.s("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            a70.p("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new lcc(str, i, i2);
            return;
        }
        kcc kccVar = new kcc(str, i, i2);
        jcc.a(i, i2, str);
        this.a = kccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof icc) {
            return this.a.equals(((icc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

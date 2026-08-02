package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class px8 extends ix8 {
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public px8(String str) {
        super(r1, r2, true, r4, 2000);
        str.getClass();
        Bundle J = ao2.J(str);
        Bundle J2 = ao2.J(str);
        rm5 rm5Var = rm5.a;
        rm5Var.getClass();
        this.d = str;
        if (str.length() > 0) {
            return;
        }
        a70.p("serverClientId should not be empty");
        throw null;
    }
}

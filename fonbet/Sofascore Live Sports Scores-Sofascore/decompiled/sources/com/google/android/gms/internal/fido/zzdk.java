package com.google.android.gms.internal.fido;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.fc6;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzdk {
    public final String a;
    public final Class b;
    public final boolean c;

    public zzdk(String str, Class cls, boolean z, int i) {
        if (str.isEmpty()) {
            a70.p("identifier must not be empty");
            throw null;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            a70.p("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char charAt2 = str.charAt(i2);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                a70.p("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        System.identityHashCode(this);
        for (int i3 = 0; i3 < 5; i3++) {
        }
    }

    public final String toString() {
        String name = getClass().getName();
        return fc6.o(mz1.r(name, "/"), this.a, U3.j.d, this.b.getName(), U3.j.e);
    }
}

package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.bf3;
import defpackage.mz1;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzyl {
    public final String a;
    public final Class b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public zzyl(String str, Class cls, boolean z, boolean z2) {
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            a70.p("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '_'))) {
                a70.p("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.a = str;
        this.b = cls;
        this.c = z;
        this.d = z2;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.e = j;
    }

    public void a(Iterator it, zzzc zzzcVar) {
        while (it.hasNext()) {
            b(it.next(), zzzcVar);
        }
    }

    public void b(Object obj, zzzc zzzcVar) {
        zzzcVar.a(obj, this.a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        bf3.v(sb, name, "/", str, U3.j.d);
        return mz1.o(sb, name2, U3.j.e);
    }
}

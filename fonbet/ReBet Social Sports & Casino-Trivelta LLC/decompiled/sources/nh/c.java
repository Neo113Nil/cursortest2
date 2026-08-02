package nh;

import kh.k;
import kh.l;
import kh.n;
import kh.p;
import kh.s;
import kotlin.jvm.internal.Intrinsics;
import nh.AbstractC5737b;

/* loaded from: classes3.dex */
public abstract class c {
    public static final C5736a a(AbstractC5737b.C0860b c0860b) {
        Intrinsics.checkNotNullParameter(c0860b, "<this>");
        if (c0860b.a().length < 2) {
            return null;
        }
        k kVar = new k(null, 1, null);
        try {
            s.b(kVar, c0860b.a(), 0, 0, 6, null);
            l h22 = kVar.h2();
            return new C5736a(p.a(h22), n.p2(h22, 0, 0, 3, null));
        } catch (Throwable th2) {
            kVar.b2();
            throw th2;
        }
    }
}

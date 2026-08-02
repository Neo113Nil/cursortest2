package com.google.crypto.tink.mac;

import com.google.crypto.tink.v;
import com.google.crypto.tink.w;
import com.google.crypto.tink.x;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class h implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final h f37134a = new h();

    public static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final v f37135a;

        public b(v vVar) {
            this.f37135a = vVar;
        }
    }

    public static void d() {
        x.n(f37134a);
    }

    @Override // com.google.crypto.tink.w
    public Class b() {
        return g.class;
    }

    @Override // com.google.crypto.tink.w
    public Class c() {
        return g.class;
    }

    @Override // com.google.crypto.tink.w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g a(v vVar) {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new b(vVar);
    }
}

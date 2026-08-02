package io.seon.androidsdk.service;

import android.util.Base64;
import b.AbstractC2298a;
import b3.AbstractC2387f;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53183a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f53184b = new ArrayList();

    public W(b.F0 f02) {
        try {
            AbstractC2298a abstractC2298a = (AbstractC2298a) f02.j(0);
            for (int i10 = 0; i10 < abstractC2298a.m(); i10++) {
                b.F0 f03 = (b.F0) abstractC2298a.j(i10);
                b.k0 j10 = b.k0.j(f03.j(0));
                this.f53183a.add(AbstractC2387f.b(j10.k()));
            }
        } catch (Exception unused) {
        }
        try {
            AbstractC2298a abstractC2298a2 = (AbstractC2298a) f02.j(1);
            for (int i11 = 0; i11 < abstractC2298a2.m(); i11++) {
                this.f53184b.add(Base64.encodeToString(b.k0.j(abstractC2298a2.j(i11)).k(), 0).trim());
            }
        } catch (Exception unused2) {
        }
    }

    public final ArrayList a() {
        return this.f53184b;
    }

    public final ArrayList b() {
        return this.f53183a;
    }
}

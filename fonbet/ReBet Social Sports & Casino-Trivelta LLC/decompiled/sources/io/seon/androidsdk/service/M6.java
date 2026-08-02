package io.seon.androidsdk.service;

import b.C2290S;
import b.C2317n;
import b.C2329z;
import b3.AbstractC2387f;
import g3.C4319a;
import h3.AbstractC4437f;
import h3.AbstractC4444m;
import h3.C4442k;
import h3.C4452u;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class M6 {

    /* renamed from: a, reason: collision with root package name */
    public final AttestationGenerator$RootCertIssuer f53061a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f53062b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f53063c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f53064d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f53065e;

    /* renamed from: f, reason: collision with root package name */
    public final String f53066f;

    /* renamed from: g, reason: collision with root package name */
    public final W0 f53067g;

    /* renamed from: h, reason: collision with root package name */
    public final W0 f53068h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f53069i;

    /* renamed from: j, reason: collision with root package name */
    public String f53070j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f53071k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f53072l;

    /* renamed from: m, reason: collision with root package name */
    public final C4946i3 f53073m;

    public M6(b.F0 f02, AttestationGenerator$RootCertIssuer attestationGenerator$RootCertIssuer, C2317n c2317n) {
        this.f53070j = null;
        this.f53071k = new ArrayList();
        this.f53073m = new C4946i3();
        this.f53061a = attestationGenerator$RootCertIssuer;
        for (int i10 = 0; i10 < f02.m(); i10++) {
            if (i10 == 0) {
                this.f53062b = Integer.valueOf(((C2290S) f02.j(0)).l().intValue());
            } else if (i10 == 1) {
                this.f53063c = Integer.valueOf(((C2329z) f02.j(1)).j().intValue());
            } else if (i10 == 2) {
                this.f53064d = Integer.valueOf(((C2290S) f02.j(2)).l().intValue());
            } else if (i10 == 3) {
                this.f53065e = Integer.valueOf(((C2329z) f02.j(3)).j().intValue());
            } else if (i10 == 4) {
                this.f53066f = AbstractC2387f.b(b.k0.j(f02.j(4)).k());
            } else if (i10 == 6) {
                this.f53067g = new W0((b.F0) f02.j(6));
            } else if (i10 == 7) {
                try {
                    this.f53068h = this.f53063c.intValue() == 0 ? null : new W0((b.F0) f02.j(7));
                } catch (Exception unused) {
                }
            }
        }
        if (c2317n != null) {
            try {
                C4442k c4442k = (C4442k) C4319a.c(c2317n.k()).get(0);
                for (AbstractC4437f abstractC4437f : c4442k.i()) {
                    try {
                        int intValue = ((AbstractC4444m) abstractC4437f).f().intValue();
                        if (intValue == 1) {
                            this.f53073m.f53356a = Integer.valueOf(((AbstractC4444m) c4442k.h(abstractC4437f)).f().intValue());
                        } else if (intValue == 3) {
                            this.f53073m.f53357b = ((C4452u) c4442k.h(abstractC4437f)).h();
                        } else if (intValue != 4) {
                            this.f53073m.f53359d.put(String.valueOf(intValue), String.valueOf(c4442k.h(abstractC4437f)));
                        } else {
                            this.f53073m.f53358c = ((C4452u) c4442k.h(abstractC4437f)).h();
                        }
                    } catch (Exception e10) {
                        V.j("prov-l", e10);
                    }
                }
            } catch (Throwable th2) {
                V.j("prov", th2);
            }
        }
        this.f53072l = Boolean.FALSE;
    }

    public M6(String str) {
        this.f53070j = null;
        ArrayList arrayList = new ArrayList();
        this.f53071k = arrayList;
        this.f53073m = new C4946i3();
        arrayList.add(str);
        this.f53072l = Boolean.TRUE;
    }
}

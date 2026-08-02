package io.seon.androidsdk.service;

import b.AbstractC2312i;
import b.C2290S;
import b.InterfaceC2323t;
import java.math.BigInteger;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53185a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final C4947i4 f53186b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f53187c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f53188d;

    /* renamed from: e, reason: collision with root package name */
    public final BigInteger f53189e;

    /* renamed from: f, reason: collision with root package name */
    public final BigInteger f53190f;

    /* renamed from: g, reason: collision with root package name */
    public final BigInteger f53191g;

    public W0(b.F0 f02) {
        for (int i10 = 0; i10 < f02.m(); i10++) {
            try {
                InterfaceC2323t j10 = f02.j(i10);
                if (j10 instanceof AbstractC2312i) {
                    AbstractC2312i abstractC2312i = (AbstractC2312i) j10;
                    b.w0 k10 = abstractC2312i.k();
                    int l10 = abstractC2312i.l();
                    this.f53185a.add(Integer.valueOf(l10));
                    if (l10 == 701) {
                        this.f53189e = ((C2290S) k10).l();
                    } else if (l10 != 709) {
                        switch (l10) {
                            case 704:
                                this.f53186b = new C4947i4((b.F0) k10);
                                break;
                            case 705:
                                this.f53190f = ((C2290S) k10).l();
                                break;
                            case 706:
                                this.f53191g = ((C2290S) k10).l();
                                break;
                        }
                    } else {
                        W w10 = new W(b.F0.k(b.k0.j(k10).k()));
                        this.f53187c = w10.b();
                        this.f53188d = w10.a();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}

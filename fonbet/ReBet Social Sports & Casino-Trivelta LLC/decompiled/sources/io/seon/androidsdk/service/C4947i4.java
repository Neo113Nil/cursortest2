package io.seon.androidsdk.service;

import android.util.Base64;
import b.C2319p;
import b.C2329z;
import java.math.BigInteger;

/* renamed from: io.seon.androidsdk.service.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4947i4 {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f53360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53361b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f53362c;

    /* renamed from: d, reason: collision with root package name */
    public final String f53363d;

    public C4947i4(b.F0 f02) {
        for (int i10 = 0; i10 < f02.m(); i10++) {
            if (i10 == 0) {
                this.f53361b = Base64.encodeToString(((b.k0) f02.j(0)).k(), 0).trim();
            } else if (i10 == 1) {
                this.f53362c = Boolean.valueOf(((C2319p) f02.j(1)).j());
            } else if (i10 == 2) {
                this.f53360a = ((C2329z) f02.j(2)).j();
            } else if (i10 == 3) {
                try {
                    this.f53363d = Base64.encodeToString(((b.k0) f02.j(3)).k(), 0).trim();
                } catch (Exception unused) {
                }
            }
        }
    }
}

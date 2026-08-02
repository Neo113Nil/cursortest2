package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.proto.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC3476h;
import db.C4049a;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f37078a;

    /* renamed from: b, reason: collision with root package name */
    public final C4049a f37079b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3476h f37080c;

    /* renamed from: d, reason: collision with root package name */
    public final y.c f37081d;

    /* renamed from: e, reason: collision with root package name */
    public final I f37082e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f37083f;

    public o(String str, AbstractC3476h abstractC3476h, y.c cVar, I i10, Integer num) {
        this.f37078a = str;
        this.f37079b = t.e(str);
        this.f37080c = abstractC3476h;
        this.f37081d = cVar;
        this.f37082e = i10;
        this.f37083f = num;
    }

    public static o b(String str, AbstractC3476h abstractC3476h, y.c cVar, I i10, Integer num) {
        if (i10 == I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC3476h, cVar, i10, num);
    }

    @Override // com.google.crypto.tink.internal.q
    public C4049a a() {
        return this.f37079b;
    }

    public Integer c() {
        return this.f37083f;
    }

    public y.c d() {
        return this.f37081d;
    }

    public I e() {
        return this.f37082e;
    }

    public String f() {
        return this.f37078a;
    }

    public AbstractC3476h g() {
        return this.f37080c;
    }
}

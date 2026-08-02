package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import f8.E;
import f8.O;
import j8.C7306a;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class F implements J {

    /* renamed from: a, reason: collision with root package name */
    private final String f59228a;

    /* renamed from: b, reason: collision with root package name */
    private final C7306a f59229b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5903i f59230c;

    /* renamed from: d, reason: collision with root package name */
    private final E.c f59231d;

    /* renamed from: e, reason: collision with root package name */
    private final O f59232e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f59233f;

    private F(String str, C7306a c7306a, AbstractC5903i abstractC5903i, E.c cVar, O o11, Integer num) {
        this.f59228a = str;
        this.f59229b = c7306a;
        this.f59230c = abstractC5903i;
        this.f59231d = cVar;
        this.f59232e = o11;
        this.f59233f = num;
    }

    public static F a(String str, AbstractC5903i abstractC5903i, E.c cVar, O o11, Integer num) throws GeneralSecurityException {
        if (o11 == O.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new F(str, M.a(str), abstractC5903i, cVar, o11, num);
    }

    public final Integer b() {
        return this.f59233f;
    }

    public final E.c c() {
        return this.f59231d;
    }

    public final C7306a d() {
        return this.f59229b;
    }

    public final O e() {
        return this.f59232e;
    }

    public final String f() {
        return this.f59228a;
    }

    public final AbstractC5903i g() {
        return this.f59230c;
    }
}

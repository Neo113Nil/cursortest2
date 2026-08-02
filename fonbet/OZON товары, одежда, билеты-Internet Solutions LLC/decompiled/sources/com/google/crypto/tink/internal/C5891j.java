package com.google.crypto.tink.internal;

import I0.C3173b;
import f8.E;
import f8.O;
import j8.C7306a;
import java.security.GeneralSecurityException;
import spay.sdk.domain.model.FraudMonInfo;

/* renamed from: com.google.crypto.tink.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5891j extends He.g {

    /* renamed from: a, reason: collision with root package name */
    private final F f59272a;

    /* renamed from: com.google.crypto.tink.internal.j$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59273a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f59274b;

        static {
            int[] iArr = new int[E.c.values().length];
            f59274b = iArr;
            try {
                iArr[E.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59274b[E.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[O.values().length];
            f59273a = iArr2;
            try {
                iArr2[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59273a[O.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59273a[O.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59273a[O.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.internal.j$b */
    /* loaded from: classes9.dex */
    private static class b extends S7.q {

        /* renamed from: a, reason: collision with root package name */
        private final String f59275a;

        /* renamed from: b, reason: collision with root package name */
        private final O f59276b;

        b(String str, O o11) {
            this.f59275a = str;
            this.f59276b = o11;
        }

        @Override // S7.q
        public final boolean a() {
            return this.f59276b != O.RAW;
        }

        public final String toString() {
            int i11 = a.f59273a[this.f59276b.ordinal()];
            return C3173b.c(new StringBuilder("(typeUrl="), this.f59275a, ", outputPrefixType=", i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? FraudMonInfo.UNKNOWN : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
        }
    }

    public C5891j(F f7, S7.r rVar) throws GeneralSecurityException {
        int i11 = a.f59274b[f7.c().ordinal()];
        this.f59272a = f7;
    }

    @Override // He.g
    public final Integer c() {
        return this.f59272a.b();
    }

    @Override // He.g
    public final S7.q d() {
        F f7 = this.f59272a;
        return new b(f7.f(), f7.e());
    }

    public final C7306a e() throws GeneralSecurityException {
        F f7 = this.f59272a;
        if (f7.e().equals(O.RAW)) {
            return C7306a.b(new byte[0]);
        }
        if (f7.e().equals(O.TINK)) {
            return v.b(f7.b().intValue());
        }
        if (f7.e().equals(O.LEGACY) || f7.e().equals(O.CRUNCHY)) {
            return v.a(f7.b().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public final F f(S7.r rVar) throws GeneralSecurityException {
        int[] iArr = a.f59274b;
        F f7 = this.f59272a;
        int i11 = iArr[f7.c().ordinal()];
        return f7;
    }
}

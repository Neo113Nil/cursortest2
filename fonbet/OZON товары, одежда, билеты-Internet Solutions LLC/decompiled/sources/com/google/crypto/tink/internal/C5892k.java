package com.google.crypto.tink.internal;

import f8.O;
import java.util.Objects;
import spay.sdk.domain.model.FraudMonInfo;

/* renamed from: com.google.crypto.tink.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5892k extends S7.q {

    /* renamed from: a, reason: collision with root package name */
    private final G f59277a;

    /* renamed from: com.google.crypto.tink.internal.k$a */
    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59278a;

        static {
            int[] iArr = new int[O.values().length];
            f59278a = iArr;
            try {
                iArr[O.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59278a[O.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59278a[O.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59278a[O.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C5892k(G g10) {
        this.f59277a = g10;
    }

    @Override // S7.q
    public final boolean a() {
        return this.f59277a.c().I() != O.RAW;
    }

    public final G b() {
        return this.f59277a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5892k)) {
            return false;
        }
        G g10 = ((C5892k) obj).f59277a;
        G g11 = this.f59277a;
        return g11.c().I().equals(g10.c().I()) && g11.c().J().equals(g10.c().J()) && g11.c().K().equals(g10.c().K());
    }

    public final int hashCode() {
        G g10 = this.f59277a;
        return Objects.hash(g10.c(), g10.d());
    }

    public final String toString() {
        G g10 = this.f59277a;
        String J11 = g10.c().J();
        int i11 = a.f59278a[g10.c().I().ordinal()];
        return V.e.a("(typeUrl=", J11, ", outputPrefixType=", i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? FraudMonInfo.UNKNOWN : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}

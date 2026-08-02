package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes9.dex */
final class r extends AbstractC5911q<AbstractC5917x.d> {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59460a;

        static {
            int[] iArr = new int[r0.values().length];
            f59460a = iArr;
            try {
                iArr[r0.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59460a[r0.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59460a[r0.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59460a[r0.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59460a[r0.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59460a[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59460a[r0.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59460a[r0.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59460a[r0.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f59460a[r0.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f59460a[r0.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f59460a[r0.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f59460a[r0.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f59460a[r0.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f59460a[r0.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f59460a[r0.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f59460a[r0.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f59460a[r0.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final void a(Map.Entry entry) {
        ((AbstractC5917x.d) entry.getKey()).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final AbstractC5917x.e b(C5910p c5910p, S s11, int i11) {
        return c5910p.a(s11, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final C5913t<AbstractC5917x.d> c(Object obj) {
        return ((AbstractC5917x.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final C5913t<AbstractC5917x.d> d(Object obj) {
        return ((AbstractC5917x.c) obj).D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final boolean e(S s11) {
        return s11 instanceof AbstractC5917x.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final void f(Object obj) {
        ((AbstractC5917x.c) obj).extensions.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final Object g(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5911q
    final void j(Map.Entry entry) throws IOException {
        ((AbstractC5917x.d) entry.getKey()).getClass();
        int[] iArr = a.f59460a;
        throw null;
    }
}

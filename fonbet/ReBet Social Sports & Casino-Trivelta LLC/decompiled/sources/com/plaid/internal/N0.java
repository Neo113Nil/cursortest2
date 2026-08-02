package com.plaid.internal;

import Zh.InterfaceC1901b;
import com.plaid.internal.M0;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final M0 f39383a;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39384a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39385b;

        static {
            a aVar = new a();
            f39384a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.models.EmbeddedSessionLinkTokenConfiguration", aVar, 1);
            j02.n("link_token_configuration", false);
            f39385b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{M0.a.f39367a};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            M0 m02;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39385b;
            ci.c c10 = decoder.c(j02);
            int i10 = 1;
            M0 m03 = null;
            if (c10.q()) {
                m02 = (M0) c10.i(j02, 0, M0.a.f39367a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new Zh.B(e10);
                        }
                        m03 = (M0) c10.i(j02, 0, M0.a.f39367a, m03);
                        i11 = 1;
                    }
                }
                m02 = m03;
                i10 = i11;
            }
            c10.b(j02);
            return new N0(i10, m02);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39385b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            N0 value = (N0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39385b;
            ci.d c10 = encoder.c(j02);
            c10.B(j02, 0, M0.a.f39367a, value.f39383a);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b {
        @NotNull
        public static void a() {
            a aVar = a.f39384a;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public N0(int i10, M0 m02) {
        if (1 != (i10 & 1)) {
            di.F0.a(i10, 1, a.f39385b);
        }
        this.f39383a = m02;
    }

    @NotNull
    public final M0 a() {
        return this.f39383a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N0) && Intrinsics.areEqual(this.f39383a, ((N0) obj).f39383a);
    }

    public final int hashCode() {
        return this.f39383a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "EmbeddedSessionLinkTokenConfiguration(embeddedSessionInfo=" + this.f39383a + ")";
    }
}

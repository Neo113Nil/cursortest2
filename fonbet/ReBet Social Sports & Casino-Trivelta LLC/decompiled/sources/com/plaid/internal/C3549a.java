package com.plaid.internal;

import Zh.InterfaceC1901b;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* renamed from: com.plaid.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3549a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39813a;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    /* renamed from: com.plaid.internal.a$a, reason: collision with other inner class name */
    public static final class C0549a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0549a f39814a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39815b;

        static {
            C0549a c0549a = new C0549a();
            f39814a = c0549a;
            di.J0 j02 = new di.J0("com.plaid.core.webview.ActionMessage", c0549a, 1);
            j02.n("action", false);
            f39815b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{di.Z0.f45341a};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39815b;
            ci.c c10 = decoder.c(j02);
            int i10 = 1;
            if (c10.q()) {
                str = c10.s(j02, 0);
            } else {
                str = null;
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
                        str = c10.s(j02, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            c10.b(j02);
            return new C3549a(i10, str);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39815b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            C3549a value = (C3549a) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39815b;
            ci.d c10 = encoder.c(j02);
            c10.G(j02, 0, value.f39813a);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: com.plaid.internal.a$b */
    public static final class b {
        @NotNull
        public static void a() {
            C0549a c0549a = C0549a.f39814a;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public C3549a(int i10, String str) {
        if (1 != (i10 & 1)) {
            di.F0.a(i10, 1, C0549a.f39815b);
        }
        this.f39813a = str;
    }

    @NotNull
    public final String a() {
        return this.f39813a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3549a) && Intrinsics.areEqual(this.f39813a, ((C3549a) obj).f39813a);
    }

    public final int hashCode() {
        return this.f39813a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ActionMessage(action=" + this.f39813a + ")";
    }
}

package com.plaid.internal;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class U3 {

    /* renamed from: a, reason: collision with root package name */
    @Gb.c("available")
    @Nullable
    private final String f39662a;

    /* renamed from: b, reason: collision with root package name */
    @Gb.c("current")
    @Nullable
    private final String f39663b;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39664a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39665b;

        static {
            a aVar = new a();
            f39664a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.url.LocalizedLinkAccountResponseBalance", aVar, 2);
            j02.n("available", true);
            j02.n("current", true);
            f39665b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            di.Z0 z02 = di.Z0.f45341a;
            return new InterfaceC1901b[]{AbstractC2028a.t(z02), AbstractC2028a.t(z02)};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            int i10;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39665b;
            ci.c c10 = decoder.c(j02);
            String str3 = null;
            if (c10.q()) {
                di.Z0 z02 = di.Z0.f45341a;
                str = (String) c10.C(j02, 0, z02, null);
                str2 = (String) c10.C(j02, 1, z02, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str4 = null;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        str3 = (String) c10.C(j02, 0, di.Z0.f45341a, str3);
                        i11 |= 1;
                    } else {
                        if (e10 != 1) {
                            throw new Zh.B(e10);
                        }
                        str4 = (String) c10.C(j02, 1, di.Z0.f45341a, str4);
                        i11 |= 2;
                    }
                }
                i10 = i11;
                str = str3;
                str2 = str4;
            }
            c10.b(j02);
            return new U3(i10, str, str2);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39665b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            U3 value = (U3) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39665b;
            ci.d c10 = encoder.c(j02);
            U3.a(value, c10, j02);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public U3() {
        this.f39662a = null;
        this.f39663b = null;
    }

    @JvmStatic
    public static final /* synthetic */ void a(U3 u32, ci.d dVar, di.J0 j02) {
        if (dVar.m(j02, 0) || u32.f39662a != null) {
            dVar.C(j02, 0, di.Z0.f45341a, u32.f39662a);
        }
        if (!dVar.m(j02, 1) && u32.f39663b == null) {
            return;
        }
        dVar.C(j02, 1, di.Z0.f45341a, u32.f39663b);
    }

    @Nullable
    public final String b() {
        return this.f39663b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U3)) {
            return false;
        }
        U3 u32 = (U3) obj;
        return Intrinsics.areEqual(this.f39662a, u32.f39662a) && Intrinsics.areEqual(this.f39663b, u32.f39663b);
    }

    public final int hashCode() {
        String str = this.f39662a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39663b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "LocalizedLinkAccountResponseBalance(available=" + this.f39662a + ", current=" + this.f39663b + ")";
    }

    @Nullable
    public final String a() {
        return this.f39662a;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public U3(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f39662a = null;
        } else {
            this.f39662a = str;
        }
        if ((i10 & 2) == 0) {
            this.f39663b = null;
        } else {
            this.f39663b = str2;
        }
    }
}

package com.plaid.internal;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.plaid.internal.U3;
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
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    @Gb.c("available")
    @Nullable
    private final Double f39221a;

    /* renamed from: b, reason: collision with root package name */
    @Gb.c("current")
    @Nullable
    private final Double f39222b;

    /* renamed from: c, reason: collision with root package name */
    @Gb.c("currency")
    @Nullable
    private final String f39223c;

    /* renamed from: d, reason: collision with root package name */
    @Gb.c("localized")
    @Nullable
    private final U3 f39224d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39225a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39226b;

        static {
            a aVar = new a();
            f39225a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.url.LinkAccountResponseBalance", aVar, 4);
            j02.n("available", true);
            j02.n("current", true);
            j02.n("currency", true);
            j02.n("localized", true);
            f39226b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            di.C c10 = di.C.f45283a;
            return new InterfaceC1901b[]{AbstractC2028a.t(c10), AbstractC2028a.t(c10), AbstractC2028a.t(di.Z0.f45341a), AbstractC2028a.t(U3.a.f39664a)};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            int i10;
            Double d10;
            Double d11;
            String str;
            U3 u32;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39226b;
            ci.c c10 = decoder.c(j02);
            Double d12 = null;
            if (c10.q()) {
                di.C c11 = di.C.f45283a;
                Double d13 = (Double) c10.C(j02, 0, c11, null);
                Double d14 = (Double) c10.C(j02, 1, c11, null);
                String str2 = (String) c10.C(j02, 2, di.Z0.f45341a, null);
                d11 = d14;
                u32 = (U3) c10.C(j02, 3, U3.a.f39664a, null);
                str = str2;
                i10 = 15;
                d10 = d13;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d15 = null;
                String str3 = null;
                U3 u33 = null;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        d12 = (Double) c10.C(j02, 0, di.C.f45283a, d12);
                        i11 |= 1;
                    } else if (e10 == 1) {
                        d15 = (Double) c10.C(j02, 1, di.C.f45283a, d15);
                        i11 |= 2;
                    } else if (e10 == 2) {
                        str3 = (String) c10.C(j02, 2, di.Z0.f45341a, str3);
                        i11 |= 4;
                    } else {
                        if (e10 != 3) {
                            throw new Zh.B(e10);
                        }
                        u33 = (U3) c10.C(j02, 3, U3.a.f39664a, u33);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                d10 = d12;
                d11 = d15;
                str = str3;
                u32 = u33;
            }
            c10.b(j02);
            return new E1(i10, d10, d11, str, u32);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39226b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            E1 value = (E1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39226b;
            ci.d c10 = encoder.c(j02);
            E1.a(value, c10, j02);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public E1() {
        this.f39221a = null;
        this.f39222b = null;
        this.f39223c = null;
        this.f39224d = null;
    }

    @JvmStatic
    public static final /* synthetic */ void a(E1 e12, ci.d dVar, di.J0 j02) {
        if (dVar.m(j02, 0) || e12.f39221a != null) {
            dVar.C(j02, 0, di.C.f45283a, e12.f39221a);
        }
        if (dVar.m(j02, 1) || e12.f39222b != null) {
            dVar.C(j02, 1, di.C.f45283a, e12.f39222b);
        }
        if (dVar.m(j02, 2) || e12.f39223c != null) {
            dVar.C(j02, 2, di.Z0.f45341a, e12.f39223c);
        }
        if (!dVar.m(j02, 3) && e12.f39224d == null) {
            return;
        }
        dVar.C(j02, 3, U3.a.f39664a, e12.f39224d);
    }

    @Nullable
    public final String b() {
        return this.f39223c;
    }

    @Nullable
    public final Double c() {
        return this.f39222b;
    }

    @Nullable
    public final U3 d() {
        return this.f39224d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e12 = (E1) obj;
        return Intrinsics.areEqual((Object) this.f39221a, (Object) e12.f39221a) && Intrinsics.areEqual((Object) this.f39222b, (Object) e12.f39222b) && Intrinsics.areEqual(this.f39223c, e12.f39223c) && Intrinsics.areEqual(this.f39224d, e12.f39224d);
    }

    public final int hashCode() {
        Double d10 = this.f39221a;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f39222b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.f39223c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        U3 u32 = this.f39224d;
        return hashCode3 + (u32 != null ? u32.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "LinkAccountResponseBalance(available=" + this.f39221a + ", current=" + this.f39222b + ", currency=" + this.f39223c + ", localized=" + this.f39224d + ")";
    }

    @Nullable
    public final Double a() {
        return this.f39221a;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public E1(int i10, Double d10, Double d11, String str, U3 u32) {
        if ((i10 & 1) == 0) {
            this.f39221a = null;
        } else {
            this.f39221a = d10;
        }
        if ((i10 & 2) == 0) {
            this.f39222b = null;
        } else {
            this.f39222b = d11;
        }
        if ((i10 & 4) == 0) {
            this.f39223c = null;
        } else {
            this.f39223c = str;
        }
        if ((i10 & 8) == 0) {
            this.f39224d = null;
        } else {
            this.f39224d = u32;
        }
    }
}

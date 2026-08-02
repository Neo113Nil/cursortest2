package com.plaid.internal;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import com.plaid.internal.E1;
import com.plaid.internal.F1;
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
public final class D1 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final b f39195g = new b();

    /* renamed from: a, reason: collision with root package name */
    @Gb.c("_id")
    @NotNull
    private final String f39196a;

    /* renamed from: b, reason: collision with root package name */
    @Gb.c("meta")
    @Nullable
    private final F1 f39197b;

    /* renamed from: c, reason: collision with root package name */
    @Gb.c("type")
    @Nullable
    private final String f39198c;

    /* renamed from: d, reason: collision with root package name */
    @Gb.c("subtype")
    @Nullable
    private final String f39199d;

    /* renamed from: e, reason: collision with root package name */
    @Gb.c("verification_status")
    @Nullable
    private final String f39200e;

    /* renamed from: f, reason: collision with root package name */
    @Gb.c("balance")
    @Nullable
    private final E1 f39201f;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39202a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39203b;

        static {
            a aVar = new a();
            f39202a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.url.LinkAccountResponseAccount", aVar, 6);
            j02.n("_id", true);
            j02.n("meta", true);
            j02.n("type", true);
            j02.n("subtype", true);
            j02.n("verification_status", true);
            j02.n("balance", true);
            f39203b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            di.Z0 z02 = di.Z0.f45341a;
            return new InterfaceC1901b[]{z02, AbstractC2028a.t(F1.a.f39241a), AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(z02), AbstractC2028a.t(E1.a.f39225a)};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            int i10;
            String str;
            F1 f12;
            String str2;
            String str3;
            String str4;
            E1 e12;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39203b;
            ci.c c10 = decoder.c(j02);
            String str5 = null;
            if (c10.q()) {
                String s10 = c10.s(j02, 0);
                F1 f13 = (F1) c10.C(j02, 1, F1.a.f39241a, null);
                di.Z0 z02 = di.Z0.f45341a;
                String str6 = (String) c10.C(j02, 2, z02, null);
                String str7 = (String) c10.C(j02, 3, z02, null);
                String str8 = (String) c10.C(j02, 4, z02, null);
                str = s10;
                e12 = (E1) c10.C(j02, 5, E1.a.f39225a, null);
                str3 = str7;
                str4 = str8;
                str2 = str6;
                f12 = f13;
                i10 = 63;
            } else {
                boolean z10 = true;
                int i11 = 0;
                F1 f14 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                E1 e13 = null;
                while (z10) {
                    int e10 = c10.e(j02);
                    switch (e10) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            str5 = c10.s(j02, 0);
                            i11 |= 1;
                            continue;
                        case 1:
                            f14 = (F1) c10.C(j02, 1, F1.a.f39241a, f14);
                            i11 |= 2;
                            break;
                        case 2:
                            str9 = (String) c10.C(j02, 2, di.Z0.f45341a, str9);
                            i11 |= 4;
                            break;
                        case 3:
                            str10 = (String) c10.C(j02, 3, di.Z0.f45341a, str10);
                            i11 |= 8;
                            break;
                        case 4:
                            str11 = (String) c10.C(j02, 4, di.Z0.f45341a, str11);
                            i11 |= 16;
                            break;
                        case 5:
                            e13 = (E1) c10.C(j02, 5, E1.a.f39225a, e13);
                            i11 |= 32;
                            break;
                        default:
                            throw new Zh.B(e10);
                    }
                }
                i10 = i11;
                str = str5;
                f12 = f14;
                str2 = str9;
                str3 = str10;
                str4 = str11;
                e12 = e13;
            }
            c10.b(j02);
            return new D1(i10, str, f12, str2, str3, str4, e12);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39203b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            D1 value = (D1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39203b;
            ci.d c10 = encoder.c(j02);
            D1.a(value, c10, j02);
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
            a aVar = a.f39202a;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public D1(int i10, String str, F1 f12, String str2, String str3, String str4, E1 e12) {
        this.f39196a = (i10 & 1) == 0 ? "" : str;
        if ((i10 & 2) == 0) {
            this.f39197b = null;
        } else {
            this.f39197b = f12;
        }
        if ((i10 & 4) == 0) {
            this.f39198c = null;
        } else {
            this.f39198c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f39199d = null;
        } else {
            this.f39199d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f39200e = null;
        } else {
            this.f39200e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f39201f = null;
        } else {
            this.f39201f = e12;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void a(D1 d12, ci.d dVar, di.J0 j02) {
        if (dVar.m(j02, 0) || !Intrinsics.areEqual(d12.f39196a, "")) {
            dVar.G(j02, 0, d12.f39196a);
        }
        if (dVar.m(j02, 1) || d12.f39197b != null) {
            dVar.C(j02, 1, F1.a.f39241a, d12.f39197b);
        }
        if (dVar.m(j02, 2) || d12.f39198c != null) {
            dVar.C(j02, 2, di.Z0.f45341a, d12.f39198c);
        }
        if (dVar.m(j02, 3) || d12.f39199d != null) {
            dVar.C(j02, 3, di.Z0.f45341a, d12.f39199d);
        }
        if (dVar.m(j02, 4) || d12.f39200e != null) {
            dVar.C(j02, 4, di.Z0.f45341a, d12.f39200e);
        }
        if (!dVar.m(j02, 5) && d12.f39201f == null) {
            return;
        }
        dVar.C(j02, 5, E1.a.f39225a, d12.f39201f);
    }

    @Nullable
    public final F1 b() {
        return this.f39197b;
    }

    @Nullable
    public final String c() {
        return this.f39199d;
    }

    @Nullable
    public final String d() {
        return this.f39198c;
    }

    @Nullable
    public final String e() {
        return this.f39200e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D1)) {
            return false;
        }
        D1 d12 = (D1) obj;
        return Intrinsics.areEqual(this.f39196a, d12.f39196a) && Intrinsics.areEqual(this.f39197b, d12.f39197b) && Intrinsics.areEqual(this.f39198c, d12.f39198c) && Intrinsics.areEqual(this.f39199d, d12.f39199d) && Intrinsics.areEqual(this.f39200e, d12.f39200e) && Intrinsics.areEqual(this.f39201f, d12.f39201f);
    }

    @NotNull
    public final String f() {
        return this.f39196a;
    }

    public final int hashCode() {
        int hashCode = this.f39196a.hashCode() * 31;
        F1 f12 = this.f39197b;
        int hashCode2 = (hashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str = this.f39198c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f39199d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f39200e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        E1 e12 = this.f39201f;
        return hashCode5 + (e12 != null ? e12.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "LinkAccountResponseAccount(_id=" + this.f39196a + ", meta=" + this.f39197b + ", type=" + this.f39198c + ", subtype=" + this.f39199d + ", verification_status=" + this.f39200e + ", balance=" + this.f39201f + ")";
    }

    public D1() {
        Intrinsics.checkNotNullParameter("", "_id");
        this.f39196a = "";
        this.f39197b = null;
        this.f39198c = null;
        this.f39199d = null;
        this.f39200e = null;
        this.f39201f = null;
    }

    @Nullable
    public final E1 a() {
        return this.f39201f;
    }
}

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
public final class F1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f39238c = new b();

    /* renamed from: a, reason: collision with root package name */
    @Gb.c("name")
    @Nullable
    private final String f39239a;

    /* renamed from: b, reason: collision with root package name */
    @Gb.c("number")
    @Nullable
    private final String f39240b;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39241a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39242b;

        static {
            a aVar = new a();
            f39241a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.url.LinkAccountResponseMeta", aVar, 2);
            j02.n("name", true);
            j02.n("number", true);
            f39242b = j02;
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
            di.J0 j02 = f39242b;
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
            return new F1(i10, str, str2);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39242b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            F1 value = (F1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39242b;
            ci.d c10 = encoder.c(j02);
            F1.a(value, c10, j02);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b {
    }

    public F1() {
        this.f39239a = null;
        this.f39240b = null;
    }

    @JvmStatic
    public static final /* synthetic */ void a(F1 f12, ci.d dVar, di.J0 j02) {
        if (dVar.m(j02, 0) || f12.f39239a != null) {
            dVar.C(j02, 0, di.Z0.f45341a, f12.f39239a);
        }
        if (!dVar.m(j02, 1) && f12.f39240b == null) {
            return;
        }
        dVar.C(j02, 1, di.Z0.f45341a, f12.f39240b);
    }

    @Nullable
    public final String b() {
        return this.f39240b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F1)) {
            return false;
        }
        F1 f12 = (F1) obj;
        return Intrinsics.areEqual(this.f39239a, f12.f39239a) && Intrinsics.areEqual(this.f39240b, f12.f39240b);
    }

    public final int hashCode() {
        String str = this.f39239a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39240b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "LinkAccountResponseMeta(name=" + this.f39239a + ", number=" + this.f39240b + ")";
    }

    @Nullable
    public final String a() {
        return this.f39239a;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public F1(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f39239a = null;
        } else {
            this.f39239a = str;
        }
        if ((i10 & 2) == 0) {
            this.f39240b = null;
        } else {
            this.f39240b = str2;
        }
    }
}

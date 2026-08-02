package com.evervault.sdk.core.models;

import com.google.crypto.tink.integration.android.b;
import i3.C4527h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/evervault/sdk/core/models/Secp256r1Constants;", "", "p", "", "a", b.f37029b, "seed", "generator", "n", C4527h.f48087o, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getA", "()Ljava/lang/String;", "getB", "getGenerator", "getH", "getN", "getP", "getSeed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Secp256r1Constants {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String generator;

    @NotNull
    private final String h;

    @NotNull
    private final String n;

    @NotNull
    private final String p;

    @NotNull
    private final String seed;

    public Secp256r1Constants() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Secp256r1Constants copy$default(Secp256r1Constants secp256r1Constants, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = secp256r1Constants.p;
        }
        if ((i10 & 2) != 0) {
            str2 = secp256r1Constants.a;
        }
        if ((i10 & 4) != 0) {
            str3 = secp256r1Constants.b;
        }
        if ((i10 & 8) != 0) {
            str4 = secp256r1Constants.seed;
        }
        if ((i10 & 16) != 0) {
            str5 = secp256r1Constants.generator;
        }
        if ((i10 & 32) != 0) {
            str6 = secp256r1Constants.n;
        }
        if ((i10 & 64) != 0) {
            str7 = secp256r1Constants.h;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return secp256r1Constants.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getP() {
        return this.p;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSeed() {
        return this.seed;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getGenerator() {
        return this.generator;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getN() {
        return this.n;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @NotNull
    public final Secp256r1Constants copy(@NotNull String p10, @NotNull String a10, @NotNull String b10, @NotNull String seed, @NotNull String generator, @NotNull String n10, @NotNull String h10) {
        Intrinsics.checkNotNullParameter(p10, "p");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(generator, "generator");
        Intrinsics.checkNotNullParameter(n10, "n");
        Intrinsics.checkNotNullParameter(h10, "h");
        return new Secp256r1Constants(p10, a10, b10, seed, generator, n10, h10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Secp256r1Constants)) {
            return false;
        }
        Secp256r1Constants secp256r1Constants = (Secp256r1Constants) other;
        return Intrinsics.areEqual(this.p, secp256r1Constants.p) && Intrinsics.areEqual(this.a, secp256r1Constants.a) && Intrinsics.areEqual(this.b, secp256r1Constants.b) && Intrinsics.areEqual(this.seed, secp256r1Constants.seed) && Intrinsics.areEqual(this.generator, secp256r1Constants.generator) && Intrinsics.areEqual(this.n, secp256r1Constants.n) && Intrinsics.areEqual(this.h, secp256r1Constants.h);
    }

    @NotNull
    public final String getA() {
        return this.a;
    }

    @NotNull
    public final String getB() {
        return this.b;
    }

    @NotNull
    public final String getGenerator() {
        return this.generator;
    }

    @NotNull
    public final String getH() {
        return this.h;
    }

    @NotNull
    public final String getN() {
        return this.n;
    }

    @NotNull
    public final String getP() {
        return this.p;
    }

    @NotNull
    public final String getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return (((((((((((this.p.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.seed.hashCode()) * 31) + this.generator.hashCode()) * 31) + this.n.hashCode()) * 31) + this.h.hashCode();
    }

    @NotNull
    public String toString() {
        return "Secp256r1Constants(p=" + this.p + ", a=" + this.a + ", b=" + this.b + ", seed=" + this.seed + ", generator=" + this.generator + ", n=" + this.n + ", h=" + this.h + ")";
    }

    public Secp256r1Constants(@NotNull String p10, @NotNull String a10, @NotNull String b10, @NotNull String seed, @NotNull String generator, @NotNull String n10, @NotNull String h10) {
        Intrinsics.checkNotNullParameter(p10, "p");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(generator, "generator");
        Intrinsics.checkNotNullParameter(n10, "n");
        Intrinsics.checkNotNullParameter(h10, "h");
        this.p = p10;
        this.a = a10;
        this.b = b10;
        this.seed = seed;
        this.generator = generator;
        this.n = n10;
        this.h = h10;
    }

    public /* synthetic */ Secp256r1Constants(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "FF FF FF FF 00 00 00 01 00 00 00 00 00 00 00 00 00 00 00 00 FF FF FF FF FF FF FF FF FF FF FF FF" : str, (i10 & 2) != 0 ? "FF FF FF FF 00 00 00 01 00 00 00 00 00 00 00 00 00 00 00 00 FF FF FF FF FF FF FF FF FF FF FF FC" : str2, (i10 & 4) != 0 ? "5A C6 35 D8 AA 3A 93 E7 B3 EB BD 55 76 98 86 BC 65 1D 06 B0 CC 53 B0 F6 3B CE 3C 3E 27 D2 60 4B" : str3, (i10 & 8) != 0 ? "C4 9D 36 08 86 E7 04 93 6A 66 78 E1 13 9D 26 B7 81 9F 7E 90" : str4, (i10 & 16) != 0 ? "04 6B 17 D1 F2 E1 2C 42 47 F8 BC E6 E5 63 A4 40 F2 77 03 7D 81 2D EB 33 A0 F4 A1 39 45 D8 98 C2 96 4F E3 42 E2 FE 1A 7F 9B 8E E7 EB 4A 7C 0F 9E 16 2B CE 33 57 6B 31 5E CE CB B6 40 68 37 BF 51 F5" : str5, (i10 & 32) != 0 ? "FF FF FF FF 00 00 00 00 FF FF FF FF FF FF FF FF BC E6 FA AD A7 17 9E 84 F3 B9 CA C2 FC 63 25 51" : str6, (i10 & 64) != 0 ? "01" : str7);
    }
}

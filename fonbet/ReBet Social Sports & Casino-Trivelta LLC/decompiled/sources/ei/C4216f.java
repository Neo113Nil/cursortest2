package ei;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: ei.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4216f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46105a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46106b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46107c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f46108d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f46109e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f46110f;

    /* renamed from: g, reason: collision with root package name */
    public final String f46111g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f46112h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f46113i;

    /* renamed from: j, reason: collision with root package name */
    public final String f46114j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f46115k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f46116l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f46117m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f46118n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f46119o;

    /* renamed from: p, reason: collision with root package name */
    public EnumC4211a f46120p;

    public C4216f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, EnumC4211a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f46105a = z10;
        this.f46106b = z11;
        this.f46107c = z12;
        this.f46108d = z13;
        this.f46109e = z14;
        this.f46110f = z15;
        this.f46111g = prettyPrintIndent;
        this.f46112h = z16;
        this.f46113i = z17;
        this.f46114j = classDiscriminator;
        this.f46115k = z18;
        this.f46116l = z19;
        this.f46117m = z20;
        this.f46118n = z21;
        this.f46119o = z22;
        this.f46120p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f46119o;
    }

    public final boolean b() {
        return this.f46115k;
    }

    public final boolean c() {
        return this.f46108d;
    }

    public final boolean d() {
        return this.f46118n;
    }

    public final String e() {
        return this.f46114j;
    }

    public final EnumC4211a f() {
        return this.f46120p;
    }

    public final boolean g() {
        return this.f46112h;
    }

    public final boolean h() {
        return this.f46117m;
    }

    public final boolean i() {
        return this.f46105a;
    }

    public final boolean j() {
        return this.f46110f;
    }

    public final boolean k() {
        return this.f46106b;
    }

    public final z l() {
        return null;
    }

    public final boolean m() {
        return this.f46109e;
    }

    public final String n() {
        return this.f46111g;
    }

    public final boolean o() {
        return this.f46116l;
    }

    public final boolean p() {
        return this.f46113i;
    }

    public final boolean q() {
        return this.f46107c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f46105a + ", ignoreUnknownKeys=" + this.f46106b + ", isLenient=" + this.f46107c + ", allowStructuredMapKeys=" + this.f46108d + ", prettyPrint=" + this.f46109e + ", explicitNulls=" + this.f46110f + ", prettyPrintIndent='" + this.f46111g + "', coerceInputValues=" + this.f46112h + ", useArrayPolymorphism=" + this.f46113i + ", classDiscriminator='" + this.f46114j + "', allowSpecialFloatingPointValues=" + this.f46115k + ", useAlternativeNames=" + this.f46116l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f46117m + ", allowTrailingComma=" + this.f46118n + ", allowComments=" + this.f46119o + ", classDiscriminatorMode=" + this.f46120p + ')';
    }

    public /* synthetic */ C4216f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, EnumC4211a enumC4211a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : zVar, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & PKIFailureInfo.notAuthorized) != 0 ? EnumC4211a.f46077c : enumC4211a);
    }
}

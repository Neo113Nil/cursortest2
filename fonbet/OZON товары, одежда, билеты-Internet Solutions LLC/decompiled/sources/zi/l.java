package zi;

import B0.C2454a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f109204a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u f109205b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f109206c;

    /* renamed from: d, reason: collision with root package name */
    private final float f109207d;

    /* renamed from: e, reason: collision with root package name */
    private final float f109208e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final yi.g f109209f;

    /* renamed from: g, reason: collision with root package name */
    private final int f109210g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f109211h;

    /* renamed from: i, reason: collision with root package name */
    private final int f109212i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f109213j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f109214k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f109215l;

    /* renamed from: m, reason: collision with root package name */
    private final float f109216m;

    /* renamed from: n, reason: collision with root package name */
    private final String f109217n;

    /* renamed from: o, reason: collision with root package name */
    private final Hi.k f109218o;

    public l() {
        this(0);
    }

    public static l a(l lVar, boolean z11, u uVar, t tVar, float f7, float f11, yi.g gVar, int i11, boolean z12, int i12, boolean z13, boolean z14, boolean z15, float f12, String str, Hi.k kVar, int i13) {
        boolean z16 = (i13 & 1) != 0 ? lVar.f109204a : z11;
        u preview = (i13 & 2) != 0 ? lVar.f109205b : uVar;
        t controls = (i13 & 4) != 0 ? lVar.f109206c : tVar;
        float f13 = (i13 & 8) != 0 ? lVar.f109207d : f7;
        float f14 = (i13 & 16) != 0 ? lVar.f109208e : f11;
        yi.g selectedLens = (i13 & 32) != 0 ? lVar.f109209f : gVar;
        int i14 = (i13 & 64) != 0 ? lVar.f109210g : i11;
        boolean z17 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? lVar.f109211h : z12;
        int i15 = (i13 & 256) != 0 ? lVar.f109212i : i12;
        boolean z18 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? lVar.f109213j : z13;
        boolean z19 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? lVar.f109214k : z14;
        boolean z21 = (i13 & 2048) != 0 ? lVar.f109215l : z15;
        float f15 = (i13 & 4096) != 0 ? lVar.f109216m : f12;
        String str2 = (i13 & 8192) != 0 ? lVar.f109217n : str;
        Hi.k kVar2 = (i13 & 16384) != 0 ? lVar.f109218o : kVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(selectedLens, "selectedLens");
        return new l(z16, preview, controls, f13, f14, selectedLens, i14, z17, i15, z18, z19, z21, f15, str2, kVar2);
    }

    public final String b() {
        return this.f109217n;
    }

    @NotNull
    public final t c() {
        return this.f109206c;
    }

    public final int d() {
        return this.f109212i;
    }

    public final boolean e() {
        return this.f109215l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f109204a == lVar.f109204a && Intrinsics.d(this.f109205b, lVar.f109205b) && Intrinsics.d(this.f109206c, lVar.f109206c) && Float.compare(this.f109207d, lVar.f109207d) == 0 && Float.compare(this.f109208e, lVar.f109208e) == 0 && this.f109209f == lVar.f109209f && this.f109210g == lVar.f109210g && this.f109211h == lVar.f109211h && this.f109212i == lVar.f109212i && this.f109213j == lVar.f109213j && this.f109214k == lVar.f109214k && this.f109215l == lVar.f109215l && Float.compare(this.f109216m, lVar.f109216m) == 0 && Intrinsics.d(this.f109217n, lVar.f109217n) && Intrinsics.d(this.f109218o, lVar.f109218o);
    }

    public final boolean f() {
        return this.f109214k;
    }

    public final Hi.k g() {
        return this.f109218o;
    }

    public final int h() {
        return this.f109210g;
    }

    public final int hashCode() {
        int a11 = Pk0.b.a(this.f109216m, C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.f109212i, C3532b.a(C2454a.a(this.f109210g, (this.f109209f.hashCode() + Pk0.b.a(this.f109208e, Pk0.b.a(this.f109207d, (this.f109206c.hashCode() + ((this.f109205b.hashCode() + (Boolean.hashCode(this.f109204a) * 31)) * 31)) * 31, 31), 31)) * 31, 31), 31, this.f109211h), 31), 31, this.f109213j), 31, this.f109214k), 31, this.f109215l), 31);
        String str = this.f109217n;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Hi.k kVar = this.f109218o;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final float i() {
        return this.f109208e;
    }

    @NotNull
    public final u j() {
        return this.f109205b;
    }

    @NotNull
    public final yi.g k() {
        return this.f109209f;
    }

    public final boolean l() {
        return this.f109204a;
    }

    public final float m() {
        return this.f109216m;
    }

    public final float n() {
        return this.f109207d;
    }

    public final boolean o() {
        return this.f109211h;
    }

    public final boolean p() {
        return this.f109213j;
    }

    @NotNull
    public final String toString() {
        return "CameraScreenUiState(shouldRequestAudio=" + this.f109204a + ", preview=" + this.f109205b + ", controls=" + this.f109206c + ", zoomLevel=" + this.f109207d + ", maxZoom=" + this.f109208e + ", selectedLens=" + this.f109209f + ", lensFacing=" + this.f109210g + ", isFrontFlashEnabled=" + this.f109211h + ", flashMode=" + this.f109212i + ", isScreenFlashActive=" + this.f109213j + ", hasUltraWide=" + this.f109214k + ", hasTelephoto=" + this.f109215l + ", ultraWideMinZoom=" + this.f109216m + ", cameraError=" + this.f109217n + ", lastResultMedia=" + this.f109218o + ")";
    }

    public l(boolean z11, @NotNull u preview, @NotNull t controls, float f7, float f11, @NotNull yi.g selectedLens, int i11, boolean z12, int i12, boolean z13, boolean z14, boolean z15, float f12, String str, Hi.k kVar) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(controls, "controls");
        Intrinsics.checkNotNullParameter(selectedLens, "selectedLens");
        this.f109204a = z11;
        this.f109205b = preview;
        this.f109206c = controls;
        this.f109207d = f7;
        this.f109208e = f11;
        this.f109209f = selectedLens;
        this.f109210g = i11;
        this.f109211h = z12;
        this.f109212i = i12;
        this.f109213j = z13;
        this.f109214k = z14;
        this.f109215l = z15;
        this.f109216m = f12;
        this.f109217n = str;
        this.f109218o = kVar;
    }

    public /* synthetic */ l(int i11) {
        this(false, new u(0), new t(0), 1.0f, 1.0f, yi.g.WIDE, 1, false, 2, false, false, false, 1.0f, null, null);
    }
}

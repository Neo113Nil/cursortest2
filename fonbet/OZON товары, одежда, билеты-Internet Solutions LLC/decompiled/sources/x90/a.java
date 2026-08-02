package x90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonState;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105147a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105148b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105149c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105150d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105151e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105152f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105153g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105154h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105155i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105156j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105157k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105158l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105159m;

    public a(@NotNull FinRadioButtonState backCamera, @NotNull FinRadioButtonState frontCamera, @NotNull FinRadioButtonState passportCamera, @NotNull FinRadioButtonState regCamera, @NotNull FinRadioButtonState selfieCamera, @NotNull FinRadioButtonState videoEnabled, @NotNull FinRadioButtonState videoDisabled, @NotNull FinRadioButtonState sd2, @NotNull FinRadioButtonState hd2, @NotNull FinRadioButtonState fhd, @NotNull FinRadioButtonState chunk3, @NotNull FinRadioButtonState chunk5, @NotNull FinRadioButtonState chunk10) {
        Intrinsics.checkNotNullParameter(backCamera, "backCamera");
        Intrinsics.checkNotNullParameter(frontCamera, "frontCamera");
        Intrinsics.checkNotNullParameter(passportCamera, "passportCamera");
        Intrinsics.checkNotNullParameter(regCamera, "regCamera");
        Intrinsics.checkNotNullParameter(selfieCamera, "selfieCamera");
        Intrinsics.checkNotNullParameter(videoEnabled, "videoEnabled");
        Intrinsics.checkNotNullParameter(videoDisabled, "videoDisabled");
        Intrinsics.checkNotNullParameter(sd2, "sd");
        Intrinsics.checkNotNullParameter(hd2, "hd");
        Intrinsics.checkNotNullParameter(fhd, "fhd");
        Intrinsics.checkNotNullParameter(chunk3, "chunk3");
        Intrinsics.checkNotNullParameter(chunk5, "chunk5");
        Intrinsics.checkNotNullParameter(chunk10, "chunk10");
        this.f105147a = backCamera;
        this.f105148b = frontCamera;
        this.f105149c = passportCamera;
        this.f105150d = regCamera;
        this.f105151e = selfieCamera;
        this.f105152f = videoEnabled;
        this.f105153g = videoDisabled;
        this.f105154h = sd2;
        this.f105155i = hd2;
        this.f105156j = fhd;
        this.f105157k = chunk3;
        this.f105158l = chunk5;
        this.f105159m = chunk10;
    }

    @NotNull
    public final FinRadioButtonState a() {
        return this.f105147a;
    }

    @NotNull
    public final FinRadioButtonState b() {
        return this.f105159m;
    }

    @NotNull
    public final FinRadioButtonState c() {
        return this.f105157k;
    }

    @NotNull
    public final FinRadioButtonState d() {
        return this.f105158l;
    }

    @NotNull
    public final FinRadioButtonState e() {
        return this.f105156j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f105147a, aVar.f105147a) && Intrinsics.d(this.f105148b, aVar.f105148b) && Intrinsics.d(this.f105149c, aVar.f105149c) && Intrinsics.d(this.f105150d, aVar.f105150d) && Intrinsics.d(this.f105151e, aVar.f105151e) && Intrinsics.d(this.f105152f, aVar.f105152f) && Intrinsics.d(this.f105153g, aVar.f105153g) && Intrinsics.d(this.f105154h, aVar.f105154h) && Intrinsics.d(this.f105155i, aVar.f105155i) && Intrinsics.d(this.f105156j, aVar.f105156j) && Intrinsics.d(this.f105157k, aVar.f105157k) && Intrinsics.d(this.f105158l, aVar.f105158l) && Intrinsics.d(this.f105159m, aVar.f105159m);
    }

    @NotNull
    public final FinRadioButtonState f() {
        return this.f105148b;
    }

    @NotNull
    public final FinRadioButtonState g() {
        return this.f105155i;
    }

    @NotNull
    public final FinRadioButtonState h() {
        return this.f105149c;
    }

    public final int hashCode() {
        return this.f105159m.hashCode() + ((this.f105158l.hashCode() + ((this.f105157k.hashCode() + ((this.f105156j.hashCode() + ((this.f105155i.hashCode() + ((this.f105154h.hashCode() + ((this.f105153g.hashCode() + ((this.f105152f.hashCode() + ((this.f105151e.hashCode() + ((this.f105150d.hashCode() + ((this.f105149c.hashCode() + ((this.f105148b.hashCode() + (this.f105147a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final FinRadioButtonState i() {
        return this.f105150d;
    }

    @NotNull
    public final FinRadioButtonState j() {
        return this.f105154h;
    }

    @NotNull
    public final FinRadioButtonState k() {
        return this.f105151e;
    }

    @NotNull
    public final FinRadioButtonState l() {
        return this.f105153g;
    }

    @NotNull
    public final FinRadioButtonState m() {
        return this.f105152f;
    }

    @NotNull
    public final String toString() {
        return "CameraActionRadioButtonState(backCamera=" + this.f105147a + ", frontCamera=" + this.f105148b + ", passportCamera=" + this.f105149c + ", regCamera=" + this.f105150d + ", selfieCamera=" + this.f105151e + ", videoEnabled=" + this.f105152f + ", videoDisabled=" + this.f105153g + ", sd=" + this.f105154h + ", hd=" + this.f105155i + ", fhd=" + this.f105156j + ", chunk3=" + this.f105157k + ", chunk5=" + this.f105158l + ", chunk10=" + this.f105159m + ")";
    }
}

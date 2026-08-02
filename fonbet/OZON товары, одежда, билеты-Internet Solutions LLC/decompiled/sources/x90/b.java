package x90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonState;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105160a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105161b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105162c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105163d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105164e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonState f105165f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f105166g;

    public b(@NotNull FinRadioButtonState qrModeState, @NotNull FinRadioButtonState barcodeState, @NotNull FinRadioButtonState mixState, @NotNull FinRadioButtonState tryToGoState, @NotNull FinRadioButtonState returnState, @NotNull FinRadioButtonState photoState, boolean z11) {
        Intrinsics.checkNotNullParameter(qrModeState, "qrModeState");
        Intrinsics.checkNotNullParameter(barcodeState, "barcodeState");
        Intrinsics.checkNotNullParameter(mixState, "mixState");
        Intrinsics.checkNotNullParameter(tryToGoState, "tryToGoState");
        Intrinsics.checkNotNullParameter(returnState, "returnState");
        Intrinsics.checkNotNullParameter(photoState, "photoState");
        this.f105160a = qrModeState;
        this.f105161b = barcodeState;
        this.f105162c = mixState;
        this.f105163d = tryToGoState;
        this.f105164e = returnState;
        this.f105165f = photoState;
        this.f105166g = z11;
    }

    @NotNull
    public final FinRadioButtonState a() {
        return this.f105161b;
    }

    @NotNull
    public final FinRadioButtonState b() {
        return this.f105162c;
    }

    @NotNull
    public final FinRadioButtonState c() {
        return this.f105165f;
    }

    @NotNull
    public final FinRadioButtonState d() {
        return this.f105160a;
    }

    @NotNull
    public final FinRadioButtonState e() {
        return this.f105164e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f105160a, bVar.f105160a) && Intrinsics.d(this.f105161b, bVar.f105161b) && Intrinsics.d(this.f105162c, bVar.f105162c) && Intrinsics.d(this.f105163d, bVar.f105163d) && Intrinsics.d(this.f105164e, bVar.f105164e) && Intrinsics.d(this.f105165f, bVar.f105165f) && this.f105166g == bVar.f105166g;
    }

    @NotNull
    public final FinRadioButtonState f() {
        return this.f105163d;
    }

    public final boolean g() {
        return this.f105166g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105166g) + ((this.f105165f.hashCode() + ((this.f105164e.hashCode() + ((this.f105163d.hashCode() + ((this.f105162c.hashCode() + ((this.f105161b.hashCode() + (this.f105160a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QrActionRadioButtonState(qrModeState=");
        sb2.append(this.f105160a);
        sb2.append(", barcodeState=");
        sb2.append(this.f105161b);
        sb2.append(", mixState=");
        sb2.append(this.f105162c);
        sb2.append(", tryToGoState=");
        sb2.append(this.f105163d);
        sb2.append(", returnState=");
        sb2.append(this.f105164e);
        sb2.append(", photoState=");
        sb2.append(this.f105165f);
        sb2.append(", isNeedConfirm=");
        return Pk0.a.a(")", sb2, this.f105166g);
    }
}

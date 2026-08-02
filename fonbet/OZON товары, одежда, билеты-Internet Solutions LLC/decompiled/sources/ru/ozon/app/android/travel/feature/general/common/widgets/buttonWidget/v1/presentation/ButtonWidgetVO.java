package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.presentation;

import B0.A0;
import B0.C2454a;
import Kk.C3532b;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/presentation/ButtonWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "", "isSticky", "", "backgroundColor", "", "topRadius", "", "buttonTopMargin", "buttonBottomMargin", "buttonHorizontalMargin", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ZLjava/lang/String;FIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "F", "getTopRadius", "()F", "I", "getButtonTopMargin", "getButtonBottomMargin", "getButtonHorizontalMargin", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonWidgetVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final String backgroundColor;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final int buttonBottomMargin;
    private final int buttonHorizontalMargin;
    private final int buttonTopMargin;
    private final long id;
    private final boolean isSticky;
    private final float topRadius;

    public ButtonWidgetVO(long j11, @NotNull ButtonV3Atom.LargeButton button, boolean z11, String str, float f7, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.button = button;
        this.isSticky = z11;
        this.backgroundColor = str;
        this.topRadius = f7;
        this.buttonTopMargin = i11;
        this.buttonBottomMargin = i12;
        this.buttonHorizontalMargin = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWidgetVO)) {
            return false;
        }
        ButtonWidgetVO buttonWidgetVO = (ButtonWidgetVO) other;
        return this.id == buttonWidgetVO.id && Intrinsics.d(this.button, buttonWidgetVO.button) && this.isSticky == buttonWidgetVO.isSticky && Intrinsics.d(this.backgroundColor, buttonWidgetVO.backgroundColor) && Float.compare(this.topRadius, buttonWidgetVO.topRadius) == 0 && this.buttonTopMargin == buttonWidgetVO.buttonTopMargin && this.buttonBottomMargin == buttonWidgetVO.buttonBottomMargin && this.buttonHorizontalMargin == buttonWidgetVO.buttonHorizontalMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final int getButtonBottomMargin() {
        return this.buttonBottomMargin;
    }

    public final int getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    public final int getButtonTopMargin() {
        return this.buttonTopMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final float getTopRadius() {
        return this.topRadius;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(b.a(this.button, Long.hashCode(this.id) * 31, 31), 31, this.isSticky);
        String str = this.backgroundColor;
        return Integer.hashCode(this.buttonHorizontalMargin) + C2454a.a(this.buttonBottomMargin, C2454a.a(this.buttonTopMargin, Pk0.b.a(this.topRadius, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.button;
        boolean z11 = this.isSticky;
        String str = this.backgroundColor;
        float f7 = this.topRadius;
        int i11 = this.buttonTopMargin;
        int i12 = this.buttonBottomMargin;
        int i13 = this.buttonHorizontalMargin;
        StringBuilder h11 = Bi.b.h("ButtonWidgetVO(id=", j11, ", button=", largeButton);
        h11.append(", isSticky=");
        h11.append(z11);
        h11.append(", backgroundColor=");
        h11.append(str);
        h11.append(", topRadius=");
        h11.append(f7);
        h11.append(", buttonTopMargin=");
        h11.append(i11);
        A0.c(i12, i13, ", buttonBottomMargin=", ", buttonHorizontalMargin=", h11);
        h11.append(")");
        return h11.toString();
    }
}

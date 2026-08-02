package ru.ozon.app.android.common.ui.buttonwidget;

import B0.A0;
import B0.C2454a;
import Bi.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.buttonWidget.AlignType;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b7\u0010\u001a¨\u00068"}, d2 = {"Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "buttonV2", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3", "", "hasShadowIfSticky", "Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "align", "buttonFill", "", "buttonHorizontalMargin", "buttonVerticalMargin", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/app/android/widgets/buttonWidget/AlignType;ZIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButtonV2", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonV3", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/Boolean;", "getHasShadowIfSticky", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "getAlign", "()Lru/ozon/app/android/widgets/buttonWidget/AlignType;", "Z", "getButtonFill", "()Z", "I", "getButtonHorizontalMargin", "getButtonVerticalMargin", "getBackgroundColor", "shared-views_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ButtonVO implements c {

    @NotNull
    private final AlignType align;
    private final int backgroundColor;
    private final ButtonV3Atom.LargeButton button;
    private final boolean buttonFill;
    private final int buttonHorizontalMargin;
    private final ButtonDTO buttonV2;
    private final ButtonV3DTO buttonV3;
    private final int buttonVerticalMargin;
    private final Boolean hasShadowIfSticky;
    private final long id;

    public ButtonVO(long j11, ButtonV3Atom.LargeButton largeButton, ButtonDTO buttonDTO, ButtonV3DTO buttonV3DTO, Boolean bool, @NotNull AlignType align, boolean z11, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(align, "align");
        this.id = j11;
        this.button = largeButton;
        this.buttonV2 = buttonDTO;
        this.buttonV3 = buttonV3DTO;
        this.hasShadowIfSticky = bool;
        this.align = align;
        this.buttonFill = z11;
        this.buttonHorizontalMargin = i11;
        this.buttonVerticalMargin = i12;
        this.backgroundColor = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonVO)) {
            return false;
        }
        ButtonVO buttonVO = (ButtonVO) other;
        return this.id == buttonVO.id && Intrinsics.d(this.button, buttonVO.button) && Intrinsics.d(this.buttonV2, buttonVO.buttonV2) && Intrinsics.d(this.buttonV3, buttonVO.buttonV3) && Intrinsics.d(this.hasShadowIfSticky, buttonVO.hasShadowIfSticky) && this.align == buttonVO.align && this.buttonFill == buttonVO.buttonFill && this.buttonHorizontalMargin == buttonVO.buttonHorizontalMargin && this.buttonVerticalMargin == buttonVO.buttonVerticalMargin && this.backgroundColor == buttonVO.backgroundColor;
    }

    @NotNull
    public final AlignType getAlign() {
        return this.align;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final boolean getButtonFill() {
        return this.buttonFill;
    }

    public final int getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    public final ButtonDTO getButtonV2() {
        return this.buttonV2;
    }

    public final ButtonV3DTO getButtonV3() {
        return this.buttonV3;
    }

    public final int getButtonVerticalMargin() {
        return this.buttonVerticalMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3Atom.LargeButton largeButton = this.button;
        int hashCode2 = (hashCode + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        ButtonDTO buttonDTO = this.buttonV2;
        int hashCode3 = (hashCode2 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Boolean bool = this.hasShadowIfSticky;
        return Integer.hashCode(this.backgroundColor) + C2454a.a(this.buttonVerticalMargin, C2454a.a(this.buttonHorizontalMargin, C3532b.a((this.align.hashCode() + ((hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31)) * 31, 31, this.buttonFill), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.button;
        ButtonDTO buttonDTO = this.buttonV2;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        Boolean bool = this.hasShadowIfSticky;
        AlignType alignType = this.align;
        boolean z11 = this.buttonFill;
        int i11 = this.buttonHorizontalMargin;
        int i12 = this.buttonVerticalMargin;
        int i13 = this.backgroundColor;
        StringBuilder h11 = b.h("ButtonVO(id=", j11, ", button=", largeButton);
        h11.append(", buttonV2=");
        h11.append(buttonDTO);
        h11.append(", buttonV3=");
        h11.append(buttonV3DTO);
        h11.append(", hasShadowIfSticky=");
        h11.append(bool);
        h11.append(", align=");
        h11.append(alignType);
        h11.append(", buttonFill=");
        h11.append(z11);
        h11.append(", buttonHorizontalMargin=");
        h11.append(i11);
        A0.c(i12, i13, ", buttonVerticalMargin=", ", backgroundColor=", h11);
        h11.append(")");
        return h11.toString();
    }
}

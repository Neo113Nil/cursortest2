package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.data;

import B0.C2454a;
import Ek.a;
import K00.b;
import Kk.C3532b;
import Pk0.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "isSticky", "", "backgroundColor", "", "topRadius", "", "buttonTopMargin", "buttonBottomMargin", "buttonHorizontalMargin", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ZLjava/lang/String;IIII)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "()Z", "getBackgroundColor", "()Ljava/lang/String;", "getTopRadius", "()I", "getButtonTopMargin", "getButtonBottomMargin", "getButtonHorizontalMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonWidgetDTO {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final String backgroundColor;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final int buttonBottomMargin;
    private final int buttonHorizontalMargin;
    private final int buttonTopMargin;
    private final boolean isSticky;
    private final int topRadius;

    public ButtonWidgetDTO(@NotNull ButtonV3Atom.LargeButton button, boolean z11, String str, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.isSticky = z11;
        this.backgroundColor = str;
        this.topRadius = i11;
        this.buttonTopMargin = i12;
        this.buttonBottomMargin = i13;
        this.buttonHorizontalMargin = i14;
    }

    public static /* synthetic */ ButtonWidgetDTO copy$default(ButtonWidgetDTO buttonWidgetDTO, ButtonV3Atom.LargeButton largeButton, boolean z11, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            largeButton = buttonWidgetDTO.button;
        }
        if ((i15 & 2) != 0) {
            z11 = buttonWidgetDTO.isSticky;
        }
        if ((i15 & 4) != 0) {
            str = buttonWidgetDTO.backgroundColor;
        }
        if ((i15 & 8) != 0) {
            i11 = buttonWidgetDTO.topRadius;
        }
        if ((i15 & 16) != 0) {
            i12 = buttonWidgetDTO.buttonTopMargin;
        }
        if ((i15 & 32) != 0) {
            i13 = buttonWidgetDTO.buttonBottomMargin;
        }
        if ((i15 & 64) != 0) {
            i14 = buttonWidgetDTO.buttonHorizontalMargin;
        }
        int i16 = i13;
        int i17 = i14;
        int i18 = i12;
        String str2 = str;
        return buttonWidgetDTO.copy(largeButton, z11, str2, i11, i18, i16, i17);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTopRadius() {
        return this.topRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final int getButtonTopMargin() {
        return this.buttonTopMargin;
    }

    /* renamed from: component6, reason: from getter */
    public final int getButtonBottomMargin() {
        return this.buttonBottomMargin;
    }

    /* renamed from: component7, reason: from getter */
    public final int getButtonHorizontalMargin() {
        return this.buttonHorizontalMargin;
    }

    @NotNull
    public final ButtonWidgetDTO copy(@NotNull ButtonV3Atom.LargeButton button, boolean isSticky, String backgroundColor, int topRadius, int buttonTopMargin, int buttonBottomMargin, int buttonHorizontalMargin) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new ButtonWidgetDTO(button, isSticky, backgroundColor, topRadius, buttonTopMargin, buttonBottomMargin, buttonHorizontalMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWidgetDTO)) {
            return false;
        }
        ButtonWidgetDTO buttonWidgetDTO = (ButtonWidgetDTO) other;
        return Intrinsics.d(this.button, buttonWidgetDTO.button) && this.isSticky == buttonWidgetDTO.isSticky && Intrinsics.d(this.backgroundColor, buttonWidgetDTO.backgroundColor) && this.topRadius == buttonWidgetDTO.topRadius && this.buttonTopMargin == buttonWidgetDTO.buttonTopMargin && this.buttonBottomMargin == buttonWidgetDTO.buttonBottomMargin && this.buttonHorizontalMargin == buttonWidgetDTO.buttonHorizontalMargin;
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

    public final int getTopRadius() {
        return this.topRadius;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.button.hashCode() * 31, 31, this.isSticky);
        String str = this.backgroundColor;
        return Integer.hashCode(this.buttonHorizontalMargin) + C2454a.a(this.buttonBottomMargin, C2454a.a(this.buttonTopMargin, C2454a.a(this.topRadius, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.LargeButton largeButton = this.button;
        boolean z11 = this.isSticky;
        String str = this.backgroundColor;
        int i11 = this.topRadius;
        int i12 = this.buttonTopMargin;
        int i13 = this.buttonBottomMargin;
        int i14 = this.buttonHorizontalMargin;
        StringBuilder sb2 = new StringBuilder("ButtonWidgetDTO(button=");
        sb2.append(largeButton);
        sb2.append(", isSticky=");
        sb2.append(z11);
        sb2.append(", backgroundColor=");
        g.d(i11, str, ", topRadius=", ", buttonTopMargin=", sb2);
        a.f(i12, i13, ", buttonBottomMargin=", ", buttonHorizontalMargin=", sb2);
        return b.e(i14, ")", sb2);
    }

    public /* synthetic */ ButtonWidgetDTO(ButtonV3Atom.LargeButton largeButton, boolean z11, String str, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(largeButton, (i15 & 2) != 0 ? false : z11, str, (i15 & 8) != 0 ? 0 : i11, (i15 & 16) != 0 ? 16 : i12, (i15 & 32) != 0 ? 16 : i13, (i15 & 64) != 0 ? 16 : i14);
    }
}

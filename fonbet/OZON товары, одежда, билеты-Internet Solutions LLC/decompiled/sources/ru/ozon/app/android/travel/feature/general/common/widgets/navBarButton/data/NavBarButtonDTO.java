package ru.ozon.app.android.travel.feature.general.common.widgets.navBarButton.data;

import Kk.C3532b;
import Pk0.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/navBarButton/data/NavBarButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "isAlwaysVisible", "", "isVisible", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ZZ)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NavBarButtonDTO {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallBorderlessButton button;
    private final boolean isAlwaysVisible;
    private final boolean isVisible;

    public NavBarButtonDTO(@NotNull ButtonV3Atom.SmallBorderlessButton button, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.isAlwaysVisible = z11;
        this.isVisible = z12;
    }

    public static /* synthetic */ NavBarButtonDTO copy$default(NavBarButtonDTO navBarButtonDTO, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallBorderlessButton = navBarButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            z11 = navBarButtonDTO.isAlwaysVisible;
        }
        if ((i11 & 4) != 0) {
            z12 = navBarButtonDTO.isVisible;
        }
        return navBarButtonDTO.copy(smallBorderlessButton, z11, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAlwaysVisible() {
        return this.isAlwaysVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public final NavBarButtonDTO copy(@NotNull ButtonV3Atom.SmallBorderlessButton button, boolean isAlwaysVisible, boolean isVisible) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new NavBarButtonDTO(button, isAlwaysVisible, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarButtonDTO)) {
            return false;
        }
        NavBarButtonDTO navBarButtonDTO = (NavBarButtonDTO) other;
        return Intrinsics.d(this.button, navBarButtonDTO.button) && this.isAlwaysVisible == navBarButtonDTO.isAlwaysVisible && this.isVisible == navBarButtonDTO.isVisible;
    }

    @NotNull
    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVisible) + C3532b.a(this.button.hashCode() * 31, 31, this.isAlwaysVisible);
    }

    public final boolean isAlwaysVisible() {
        return this.isAlwaysVisible;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        boolean z11 = this.isAlwaysVisible;
        boolean z12 = this.isVisible;
        StringBuilder sb2 = new StringBuilder("NavBarButtonDTO(button=");
        sb2.append(smallBorderlessButton);
        sb2.append(", isAlwaysVisible=");
        sb2.append(z11);
        sb2.append(", isVisible=");
        return a.a(")", sb2, z12);
    }
}

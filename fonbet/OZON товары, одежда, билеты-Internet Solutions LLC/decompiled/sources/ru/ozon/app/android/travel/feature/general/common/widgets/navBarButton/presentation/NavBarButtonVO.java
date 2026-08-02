package ru.ozon.app.android.travel.feature.general.common.widgets.navBarButton.presentation;

import Ak.C2436a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/navBarButton/presentation/NavBarButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "", "isAlwaysVisible", "isVisible", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ZZ)V", "copy", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ZZ)Lru/ozon/app/android/travel/feature/general/common/widgets/navBarButton/presentation/NavBarButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NavBarButtonVO implements c {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallBorderlessButton button;
    private final long id;
    private final boolean isAlwaysVisible;
    private final boolean isVisible;

    public NavBarButtonVO(long j11, @NotNull ButtonV3Atom.SmallBorderlessButton button, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.button = button;
        this.isAlwaysVisible = z11;
        this.isVisible = z12;
    }

    public static /* synthetic */ NavBarButtonVO copy$default(NavBarButtonVO navBarButtonVO, long j11, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = navBarButtonVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            smallBorderlessButton = navBarButtonVO.button;
        }
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
        if ((i11 & 4) != 0) {
            z11 = navBarButtonVO.isAlwaysVisible;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = navBarButtonVO.isVisible;
        }
        return navBarButtonVO.copy(j12, smallBorderlessButton2, z13, z12);
    }

    @NotNull
    public final NavBarButtonVO copy(long id2, @NotNull ButtonV3Atom.SmallBorderlessButton button, boolean isAlwaysVisible, boolean isVisible) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new NavBarButtonVO(id2, button, isAlwaysVisible, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarButtonVO)) {
            return false;
        }
        NavBarButtonVO navBarButtonVO = (NavBarButtonVO) other;
        return this.id == navBarButtonVO.id && Intrinsics.d(this.button, navBarButtonVO.button) && this.isAlwaysVisible == navBarButtonVO.isAlwaysVisible && this.isVisible == navBarButtonVO.isVisible;
    }

    @NotNull
    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
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
        return Boolean.hashCode(this.isVisible) + C3532b.a((this.button.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.isAlwaysVisible);
    }

    /* renamed from: isAlwaysVisible, reason: from getter */
    public final boolean getIsAlwaysVisible() {
        return this.isAlwaysVisible;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        boolean z11 = this.isAlwaysVisible;
        boolean z12 = this.isVisible;
        StringBuilder sb2 = new StringBuilder("NavBarButtonVO(id=");
        sb2.append(j11);
        sb2.append(", button=");
        sb2.append(smallBorderlessButton);
        C2436a.e(", isAlwaysVisible=", ", isVisible=", sb2, z11, z12);
        sb2.append(")");
        return sb2.toString();
    }
}

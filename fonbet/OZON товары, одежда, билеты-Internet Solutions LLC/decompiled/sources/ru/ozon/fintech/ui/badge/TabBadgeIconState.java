package ru.ozon.fintech.ui.badge;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/badge/TabBadgeIconState;", "", "icon", "Landroid/graphics/drawable/Drawable;", "iconBg", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getIconBg", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TabBadgeIconState {

    @NotNull
    private final Drawable icon;
    private final Drawable iconBg;

    public TabBadgeIconState(@NotNull Drawable icon, Drawable drawable) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.icon = icon;
        this.iconBg = drawable;
    }

    public static /* synthetic */ TabBadgeIconState copy$default(TabBadgeIconState tabBadgeIconState, Drawable drawable, Drawable drawable2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = tabBadgeIconState.icon;
        }
        if ((i11 & 2) != 0) {
            drawable2 = tabBadgeIconState.iconBg;
        }
        return tabBadgeIconState.copy(drawable, drawable2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Drawable getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final Drawable getIconBg() {
        return this.iconBg;
    }

    @NotNull
    public final TabBadgeIconState copy(@NotNull Drawable icon, Drawable iconBg) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new TabBadgeIconState(icon, iconBg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabBadgeIconState)) {
            return false;
        }
        TabBadgeIconState tabBadgeIconState = (TabBadgeIconState) other;
        return Intrinsics.d(this.icon, tabBadgeIconState.icon) && Intrinsics.d(this.iconBg, tabBadgeIconState.iconBg);
    }

    @NotNull
    public final Drawable getIcon() {
        return this.icon;
    }

    public final Drawable getIconBg() {
        return this.iconBg;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        Drawable drawable = this.iconBg;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    @NotNull
    public String toString() {
        return "TabBadgeIconState(icon=" + this.icon + ", iconBg=" + this.iconBg + ")";
    }
}

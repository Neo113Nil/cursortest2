package ru.ozon.app.android.storefront.navBar;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ-\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarModelProvider;", "", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "provideNavBarModelListener", "(Lkotlin/jvm/functions/Function1;)V", "NavBarModel", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NavBarModelProvider {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarModelProvider$NavBarModel;", "", "", "showBackButton", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "colors", "Landroid/graphics/Bitmap;", "leftActionsSnapshot", "rightActionsSnapshot", "<init>", "(ZLru/ozon/app/android/storefront/navBar/NavBarColors;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowBackButton", "()Z", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "getColors", "()Lru/ozon/app/android/storefront/navBar/NavBarColors;", "Landroid/graphics/Bitmap;", "getLeftActionsSnapshot", "()Landroid/graphics/Bitmap;", "getRightActionsSnapshot", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class NavBarModel {
        private final NavBarColors colors;
        private final Bitmap leftActionsSnapshot;
        private final Bitmap rightActionsSnapshot;
        private final boolean showBackButton;

        public NavBarModel(boolean z11, NavBarColors navBarColors, Bitmap bitmap, Bitmap bitmap2) {
            this.showBackButton = z11;
            this.colors = navBarColors;
            this.leftActionsSnapshot = bitmap;
            this.rightActionsSnapshot = bitmap2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavBarModel)) {
                return false;
            }
            NavBarModel navBarModel = (NavBarModel) other;
            return this.showBackButton == navBarModel.showBackButton && Intrinsics.d(this.colors, navBarModel.colors) && Intrinsics.d(this.leftActionsSnapshot, navBarModel.leftActionsSnapshot) && Intrinsics.d(this.rightActionsSnapshot, navBarModel.rightActionsSnapshot);
        }

        public final NavBarColors getColors() {
            return this.colors;
        }

        public final Bitmap getLeftActionsSnapshot() {
            return this.leftActionsSnapshot;
        }

        public final Bitmap getRightActionsSnapshot() {
            return this.rightActionsSnapshot;
        }

        public final boolean getShowBackButton() {
            return this.showBackButton;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.showBackButton) * 31;
            NavBarColors navBarColors = this.colors;
            int hashCode2 = (hashCode + (navBarColors == null ? 0 : navBarColors.hashCode())) * 31;
            Bitmap bitmap = this.leftActionsSnapshot;
            int hashCode3 = (hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            Bitmap bitmap2 = this.rightActionsSnapshot;
            return hashCode3 + (bitmap2 != null ? bitmap2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NavBarModel(showBackButton=" + this.showBackButton + ", colors=" + this.colors + ", leftActionsSnapshot=" + this.leftActionsSnapshot + ", rightActionsSnapshot=" + this.rightActionsSnapshot + ")";
        }
    }

    void provideNavBarModelListener(@NotNull Function1<? super d<? super NavBarModel>, ? extends Object> listener);
}

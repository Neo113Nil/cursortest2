package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Kk.C3532b;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "", "floorConfig", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "FloorConfigurationParam", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FloorConfigurator {
    FloorConfigurationParam getFloorConfig();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rJZ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "", "defaultTopMargin", "minTopMargin", "defaultBottomMargin", "minBottomMargin", "", "canBeHidden", "Landroid/view/View;", "floorView", "prevFloorConfig", "<init>", "(IIIIZLandroid/view/View;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)V", "copy", "(IIIIZLandroid/view/View;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getDefaultTopMargin", "getMinTopMargin", "getDefaultBottomMargin", "getMinBottomMargin", "Z", "getCanBeHidden", "()Z", "Landroid/view/View;", "getFloorView", "()Landroid/view/View;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "getPrevFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FloorConfigurationParam {
        private final boolean canBeHidden;
        private final int defaultBottomMargin;
        private final int defaultTopMargin;
        private final View floorView;
        private final int minBottomMargin;
        private final int minTopMargin;
        private final FloorConfigurationParam prevFloorConfig;

        public FloorConfigurationParam(int i11, int i12, int i13, int i14, boolean z11, View view, FloorConfigurationParam floorConfigurationParam) {
            this.defaultTopMargin = i11;
            this.minTopMargin = i12;
            this.defaultBottomMargin = i13;
            this.minBottomMargin = i14;
            this.canBeHidden = z11;
            this.floorView = view;
            this.prevFloorConfig = floorConfigurationParam;
        }

        public static /* synthetic */ FloorConfigurationParam copy$default(FloorConfigurationParam floorConfigurationParam, int i11, int i12, int i13, int i14, boolean z11, View view, FloorConfigurationParam floorConfigurationParam2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = floorConfigurationParam.defaultTopMargin;
            }
            if ((i15 & 2) != 0) {
                i12 = floorConfigurationParam.minTopMargin;
            }
            if ((i15 & 4) != 0) {
                i13 = floorConfigurationParam.defaultBottomMargin;
            }
            if ((i15 & 8) != 0) {
                i14 = floorConfigurationParam.minBottomMargin;
            }
            if ((i15 & 16) != 0) {
                z11 = floorConfigurationParam.canBeHidden;
            }
            if ((i15 & 32) != 0) {
                view = floorConfigurationParam.floorView;
            }
            if ((i15 & 64) != 0) {
                floorConfigurationParam2 = floorConfigurationParam.prevFloorConfig;
            }
            View view2 = view;
            FloorConfigurationParam floorConfigurationParam3 = floorConfigurationParam2;
            boolean z12 = z11;
            int i16 = i13;
            return floorConfigurationParam.copy(i11, i12, i16, i14, z12, view2, floorConfigurationParam3);
        }

        @NotNull
        public final FloorConfigurationParam copy(int defaultTopMargin, int minTopMargin, int defaultBottomMargin, int minBottomMargin, boolean canBeHidden, View floorView, FloorConfigurationParam prevFloorConfig) {
            return new FloorConfigurationParam(defaultTopMargin, minTopMargin, defaultBottomMargin, minBottomMargin, canBeHidden, floorView, prevFloorConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloorConfigurationParam)) {
                return false;
            }
            FloorConfigurationParam floorConfigurationParam = (FloorConfigurationParam) other;
            return this.defaultTopMargin == floorConfigurationParam.defaultTopMargin && this.minTopMargin == floorConfigurationParam.minTopMargin && this.defaultBottomMargin == floorConfigurationParam.defaultBottomMargin && this.minBottomMargin == floorConfigurationParam.minBottomMargin && this.canBeHidden == floorConfigurationParam.canBeHidden && Intrinsics.d(this.floorView, floorConfigurationParam.floorView) && Intrinsics.d(this.prevFloorConfig, floorConfigurationParam.prevFloorConfig);
        }

        public final boolean getCanBeHidden() {
            return this.canBeHidden;
        }

        public final int getDefaultBottomMargin() {
            return this.defaultBottomMargin;
        }

        public final int getDefaultTopMargin() {
            return this.defaultTopMargin;
        }

        public final View getFloorView() {
            return this.floorView;
        }

        public final int getMinBottomMargin() {
            return this.minBottomMargin;
        }

        public final int getMinTopMargin() {
            return this.minTopMargin;
        }

        public final FloorConfigurationParam getPrevFloorConfig() {
            return this.prevFloorConfig;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.minBottomMargin, C2454a.a(this.defaultBottomMargin, C2454a.a(this.minTopMargin, Integer.hashCode(this.defaultTopMargin) * 31, 31), 31), 31), 31, this.canBeHidden);
            View view = this.floorView;
            int hashCode = (a11 + (view == null ? 0 : view.hashCode())) * 31;
            FloorConfigurationParam floorConfigurationParam = this.prevFloorConfig;
            return hashCode + (floorConfigurationParam != null ? floorConfigurationParam.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.defaultTopMargin;
            int i12 = this.minTopMargin;
            int i13 = this.defaultBottomMargin;
            int i14 = this.minBottomMargin;
            boolean z11 = this.canBeHidden;
            View view = this.floorView;
            FloorConfigurationParam floorConfigurationParam = this.prevFloorConfig;
            StringBuilder a11 = C2438a.a("FloorConfigurationParam(defaultTopMargin=", i11, ", minTopMargin=", ", defaultBottomMargin=", i12);
            a.f(i13, i14, ", minBottomMargin=", ", canBeHidden=", a11);
            a11.append(z11);
            a11.append(", floorView=");
            a11.append(view);
            a11.append(", prevFloorConfig=");
            a11.append(floorConfigurationParam);
            a11.append(")");
            return a11.toString();
        }

        public /* synthetic */ FloorConfigurationParam(int i11, int i12, int i13, int i14, boolean z11, View view, FloorConfigurationParam floorConfigurationParam, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? true : z11, view, (i15 & 64) != 0 ? null : floorConfigurationParam);
        }
    }
}

package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators;

import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.core.Constants;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ]\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/SecondFloorConfigurator;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "<init>", "(Landroidx/appcompat/widget/Toolbar;)V", "", "statusBarHeight", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "prevFloorConfig", "getMinTopMargin", "(ILru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;)I", "getDefaultTopMargin", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "navBarVO", "Landroid/view/View;", "floor", "thirdFloorHeight", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "teeth", "prevOffset", "Lkotlin/Function1;", "", "onFloorConfigured", "configFloor", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;Landroid/view/View;IILru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;ILkotlin/jvm/functions/Function1;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbarAdditionalMargin$delegate", "LSc/j;", "getToolbarAdditionalMargin", "()I", "toolbarAdditionalMargin", AppMeasurementSdk.ConditionalUserProperty.VALUE, "floorConfig", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "getFloorConfig", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/configurators/FloorConfigurator$FloorConfigurationParam;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SecondFloorConfigurator implements FloorConfigurator {
    private FloorConfigurator.FloorConfigurationParam floorConfig;

    @NotNull
    private final Toolbar toolbar;

    /* renamed from: toolbarAdditionalMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j toolbarAdditionalMargin;

    public SecondFloorConfigurator(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.toolbar = toolbar;
        this.toolbarAdditionalMargin = LazyUtilsKt.unsafeLazy(SecondFloorConfigurator$toolbarAdditionalMargin$2.INSTANCE);
    }

    private final int getDefaultTopMargin(int statusBarHeight, FloorConfigurator.FloorConfigurationParam prevFloorConfig) {
        View floorView;
        if (prevFloorConfig != null) {
            statusBarHeight = prevFloorConfig.getDefaultTopMargin();
        }
        return statusBarHeight + ((prevFloorConfig == null || (floorView = prevFloorConfig.getFloorView()) == null) ? 0 : floorView.getMeasuredHeight()) + (prevFloorConfig != null ? prevFloorConfig.getMinBottomMargin() : 0);
    }

    private final int getMinTopMargin(int statusBarHeight, FloorConfigurator.FloorConfigurationParam prevFloorConfig) {
        if (prevFloorConfig == null) {
            return statusBarHeight;
        }
        View floorView = prevFloorConfig.getFloorView();
        return prevFloorConfig.getMinTopMargin() + (prevFloorConfig.getCanBeHidden() ? 0 : prevFloorConfig.getMinBottomMargin() + (floorView != null ? floorView.getMeasuredHeight() : 0));
    }

    private final int getToolbarAdditionalMargin() {
        return ((Number) this.toolbarAdditionalMargin.getValue()).intValue();
    }

    public final void configFloor(@NotNull ShellNavBarVO navBarVO, @NotNull View floor, int thirdFloorHeight, int statusBarHeight, FloorConfigurator.FloorConfigurationParam prevFloorConfig, ShellNavBarTeethVO teeth, int prevOffset, @NotNull Function1<? super FloorConfigurator.FloorConfigurationParam, Unit> onFloorConfigured) {
        Intrinsics.checkNotNullParameter(navBarVO, "navBarVO");
        Intrinsics.checkNotNullParameter(floor, "floor");
        Intrinsics.checkNotNullParameter(onFloorConfigured, "onFloorConfigured");
        ViewGroup.LayoutParams layoutParams = this.toolbar.getLayoutParams();
        if (!(layoutParams instanceof CollapsingToolbarLayout.a)) {
            layoutParams = null;
        }
        CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
        if (aVar == null) {
            return;
        }
        Map<String, ViewGroup> floorContainers = navBarVO.getFloorContainers();
        int i11 = 0;
        int toolbarAdditionalMargin = (floorContainers == null || floorContainers.get("zero") == null) ? 0 : getToolbarAdditionalMargin();
        int minTopMargin = getMinTopMargin(statusBarHeight, prevFloorConfig);
        int i12 = navBarVO.getIsStickyThirdLevel() ? thirdFloorHeight : 0;
        int teethHeight = teeth != null ? teeth.getTeethHeight() : 0;
        int teethHeight2 = (teeth != null ? teeth.getTeethHeight() : 0) + (teeth != null ? teeth.getTeethTopSpacerHeight() : 0);
        int level2BottomSpacing = navBarVO.getSpacings().getLevel2BottomSpacing() + toolbarAdditionalMargin + minTopMargin + i12 + teethHeight;
        if (level2BottomSpacing != ((FrameLayout.LayoutParams) aVar).topMargin) {
            ((FrameLayout.LayoutParams) aVar).gravity = 80;
            ((FrameLayout.LayoutParams) aVar).topMargin = level2BottomSpacing;
            ((FrameLayout.LayoutParams) aVar).height = floor.getMeasuredHeight();
            this.toolbar.setLayoutParams(aVar);
        }
        this.toolbar.setBackgroundColor(0);
        int level2BottomSpacing2 = navBarVO.getSpacings().getLevel2BottomSpacing() + thirdFloorHeight + teethHeight2;
        Map<String, ViewGroup> floorContainers2 = navBarVO.getFloorContainers();
        if ((floorContainers2 != null ? floorContainers2.get("zero") : null) != null) {
            Map<String, ViewGroup> floorContainers3 = navBarVO.getFloorContainers();
            if ((floorContainers3 != null ? floorContainers3.get("top") : null) == null) {
                i11 = getToolbarAdditionalMargin();
            }
        }
        Map<String, ViewGroup> floorContainers4 = navBarVO.getFloorContainers();
        FloorConfigurator.FloorConfigurationParam floorConfigurationParam = new FloorConfigurator.FloorConfigurationParam((floorContainers4 != null ? floorContainers4.get("scroll") : null) == null ? getDefaultTopMargin(statusBarHeight, prevFloorConfig) + i11 : statusBarHeight + Constants.INSTANCE.getSCROLL_FLOOR_CENTER_CONTENT_HEIGHT(), minTopMargin, level2BottomSpacing2, navBarVO.getIsStickyThirdLevel() ? navBarVO.getSpacings().getLevel2BottomSpacing() + thirdFloorHeight : navBarVO.getSpacings().getLevel2BottomSpacing(), false, this.toolbar, null, 80, null);
        onFloorConfigured.invoke(floorConfigurationParam);
        this.floorConfig = floorConfigurationParam;
        if (prevOffset == 0) {
            this.toolbar.setTranslationY(-level2BottomSpacing2);
        } else {
            this.toolbar.setTranslationY(-(navBarVO.getSpacings().getLevel2BottomSpacing() + 0.0f + teethHeight2));
        }
    }

    @Override // ru.ozon.app.android.storefront.widgets.navbarv2.presentation.configurators.FloorConfigurator
    public FloorConfigurator.FloorConfigurationParam getFloorConfig() {
        return this.floorConfig;
    }
}

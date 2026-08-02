package ru.ozon.app.android.storefront.initialwidgetfabrics;

import T00.j;
import T00.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fabrics.ShellNavBarInitialWidgetFabric;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/initialwidgetfabrics/ShellNavBarInitialWidgetFabricImpl;", "Lru/ozon/app/android/fabrics/ShellNavBarInitialWidgetFabric;", "<init>", "()V", "LT00/j;", "createShellNavbar", "()LT00/j;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarInitialWidgetFabricImpl implements ShellNavBarInitialWidgetFabric {
    @Override // ru.ozon.app.android.fabrics.ShellNavBarInitialWidgetFabric
    @NotNull
    public j createShellNavbar() {
        m mVar = new m(1L, "shell", "navBar", "shell.navBar.1");
        UniColorsSelect uniColorsSelect = UniColorsSelect.LAYER_FLOOR_0_SELECT;
        String token = uniColorsSelect.getToken();
        Boolean bool = Boolean.TRUE;
        return new j(mVar, new ShellNavBarDTO(token, null, null, null, null, null, bool, null, 0, null, 0, null, null, 0, null, null, null, null, null, null, bool, UniColors.GRAPHIC_TERTIARY_ON_DARK.getToken(), null, null), U.i(new Pair(ShellNavBarDTO.NestedPlaceholders.NESTED_PLACEHOLDER_SECOND_DEFAULT.getValue(), C7714v.a0(new j(new m(1L, "cms", "separator", "cms.separator.1"), new SeparatorDTO(null, 0, uniColorsSelect.getToken()), U.c(), U.c())))), null);
    }
}

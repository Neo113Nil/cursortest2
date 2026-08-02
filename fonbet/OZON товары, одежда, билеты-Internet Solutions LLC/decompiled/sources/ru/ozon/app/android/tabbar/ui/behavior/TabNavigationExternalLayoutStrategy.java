package ru.ozon.app.android.tabbar.ui.behavior;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.container.ExternalOffsetHandler;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/tabbar/ui/behavior/TabNavigationExternalLayoutStrategy;", "Lru/ozon/app/android/tabbar/ui/behavior/TabNavigationLayoutStrategy;", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "externalOffsetHandler", "<init>", "(Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;)V", "Landroid/view/View;", "fragmentContainerView", "", "offset", "", "updateBottomOffset", "(Landroid/view/View;I)Z", "Lru/ozon/app/android/uikit/container/ExternalOffsetHandler;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabNavigationExternalLayoutStrategy implements TabNavigationLayoutStrategy {

    @NotNull
    private final ExternalOffsetHandler externalOffsetHandler;

    public TabNavigationExternalLayoutStrategy(@NotNull ExternalOffsetHandler externalOffsetHandler) {
        Intrinsics.checkNotNullParameter(externalOffsetHandler, "externalOffsetHandler");
        this.externalOffsetHandler = externalOffsetHandler;
    }

    @Override // ru.ozon.app.android.tabbar.ui.behavior.TabNavigationLayoutStrategy
    public boolean updateBottomOffset(@NotNull View fragmentContainerView, int offset) {
        Intrinsics.checkNotNullParameter(fragmentContainerView, "fragmentContainerView");
        this.externalOffsetHandler.setBottomOffset(offset);
        return false;
    }
}

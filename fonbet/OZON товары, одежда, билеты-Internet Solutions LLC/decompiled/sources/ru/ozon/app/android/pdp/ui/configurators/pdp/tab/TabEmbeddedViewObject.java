package ru.ozon.app.android.pdp.ui.configurators.pdp.tab;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "getTabGroupId", "()Ljava/lang/String;", "tabGroupId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TabEmbeddedViewObject extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Integer getScrollWidgetKey(@NotNull TabEmbeddedViewObject tabEmbeddedViewObject) {
            return Integer.valueOf(("tab_embedded_" + tabEmbeddedViewObject.getTabGroupId()).hashCode());
        }

        public static int getViewItemKey(@NotNull TabEmbeddedViewObject tabEmbeddedViewObject) {
            return tabEmbeddedViewObject.hashCode();
        }
    }

    String getTabGroupId();
}

package ru.ozon.app.android.cabinet;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cabinet/WidgetGroupObject;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface WidgetGroupObject extends c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull WidgetGroupObject widgetGroupObject) {
            return null;
        }

        public static int getViewItemKey(@NotNull WidgetGroupObject widgetGroupObject) {
            return widgetGroupObject.hashCode();
        }
    }
}

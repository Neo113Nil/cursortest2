package ru.ozon.app.android.di.module.customActionHandler;

import Jb.e;
import Jb.j;
import Pc.a;
import Vg.f;
import java.util.Map;
import java.util.Set;
import ru.ozon.app.android.action.custom.CustomActionHandler;

/* loaded from: classes6.dex */
public final class CustomActionHandlerModule_Companion_ProvidesCustomWidgetActionHandlerFactory implements e<Map<Class<?>, a<f>>> {
    public static Map<Class<?>, a<f>> providesCustomWidgetActionHandler(Map<Class<?>, a<CustomActionHandler>> map, Set<f> set) {
        Map<Class<?>, a<f>> providesCustomWidgetActionHandler = CustomActionHandlerModule.INSTANCE.providesCustomWidgetActionHandler(map, set);
        j.d(providesCustomWidgetActionHandler);
        return providesCustomWidgetActionHandler;
    }
}

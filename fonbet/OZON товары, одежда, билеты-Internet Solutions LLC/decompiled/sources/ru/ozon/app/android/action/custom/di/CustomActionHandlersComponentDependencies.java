package ru.ozon.app.android.action.custom.di;

import Pc.a;
import Vg.f;
import hi.InterfaceC6958a;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J)\u0010\b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "Ljava/lang/Class;", "LPc/a;", "LVg/f;", "Lru/ozon/app/android/action/custom/CustomWidgetActionHandlersProviders;", "getCustomWidgetActionHandler", "()Ljava/util/Map;", "Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "getButtonWidgetCustomActionHandlers", "()Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CustomActionHandlersComponentDependencies extends InterfaceC6958a {
    @NotNull
    ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers();

    @NotNull
    Map<Class<?>, a<f>> getCustomWidgetActionHandler();
}

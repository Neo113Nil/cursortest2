package ru.ozon.app.android.debugmenu.debugscreen.abtool;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.presentation.AbToggleActivity;
import ru.ozon.app.android.abtool.presentation.AbToggleScreenType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lru/ozon/app/android/debugmenu/debugscreen/abtool/AbToggleRouterImpl;", "Lru/ozon/app/android/debugmenu/debugscreen/abtool/AbToggleRouter;", "<init>", "()V", "openFeatureFlags", "", "context", "Landroid/content/Context;", "openExperiments", "openAbToggle", "screenType", "Lru/ozon/app/android/abtool/presentation/AbToggleScreenType;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleRouterImpl implements AbToggleRouter {
    private final void openAbToggle(Context context, AbToggleScreenType screenType) {
        AbToggleActivity.Companion.startActivity$default(AbToggleActivity.INSTANCE, context, screenType, null, null, null, 28, null);
    }

    @Override // ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouter
    public void openExperiments(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        openAbToggle(context, AbToggleScreenType.EXPERIMENTS);
    }

    @Override // ru.ozon.app.android.debugmenu.debugscreen.abtool.AbToggleRouter
    public void openFeatureFlags(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        openAbToggle(context, AbToggleScreenType.FEATURES);
    }
}

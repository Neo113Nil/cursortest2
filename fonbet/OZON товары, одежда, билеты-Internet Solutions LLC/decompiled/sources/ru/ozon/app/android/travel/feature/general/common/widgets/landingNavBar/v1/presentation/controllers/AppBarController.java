package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers;

import Lo.b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.AppBarController;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/AppBarController;", "", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Lkotlin/Function1;", "", "", "onApplyWindowInsets", "<init>", "(Lcom/google/android/material/appbar/AppBarLayout;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/material/appbar/AppBarLayout$f;", "offsetChangedListener", "configAppBar", "(Lcom/google/android/material/appbar/AppBarLayout$f;)V", "restoreAppBar", "getStatusBarHeight", "()I", "Lcom/google/android/material/appbar/AppBarLayout;", "Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/os/Handler;", "statusBarHeightHandler", "Landroid/os/Handler;", "statusBarHeight", "I", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppBarController {

    @NotNull
    private final AppBarLayout appBar;
    private final Context context;

    @NotNull
    private final Function1<Integer, Unit> onApplyWindowInsets;
    private int statusBarHeight;

    @NotNull
    private final Handler statusBarHeightHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public AppBarController(@NotNull AppBarLayout appBar, @NotNull Function1<? super Integer, Unit> onApplyWindowInsets) {
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(onApplyWindowInsets, "onApplyWindowInsets");
        this.appBar = appBar;
        this.onApplyWindowInsets = onApplyWindowInsets;
        Context context = appBar.getContext();
        this.context = context;
        this.statusBarHeightHandler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.statusBarHeight = ResourceExtKt.toPx(25, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets configAppBar$lambda$2$lambda$1(AppBarController appBarController, AppBarLayout appBarLayout, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        appBarController.statusBarHeightHandler.post(new b(1, appBarController, appBarLayout));
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configAppBar$lambda$2$lambda$1$lambda$0(AppBarController appBarController, AppBarLayout appBarLayout) {
        Context context = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(context);
        appBarController.statusBarHeight = statusBarHeight;
        appBarController.onApplyWindowInsets.invoke(Integer.valueOf(statusBarHeight));
    }

    public final void configAppBar(@NotNull AppBarLayout.f offsetChangedListener) {
        Intrinsics.checkNotNullParameter(offsetChangedListener, "offsetChangedListener");
        final AppBarLayout appBarLayout = this.appBar;
        appBarLayout.d(offsetChangedListener);
        appBarLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: OO.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets configAppBar$lambda$2$lambda$1;
                configAppBar$lambda$2$lambda$1 = AppBarController.configAppBar$lambda$2$lambda$1(AppBarController.this, appBarLayout, view, windowInsets);
                return configAppBar$lambda$2$lambda$1;
            }
        });
        appBarLayout.requestApplyInsets();
    }

    public final int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final void restoreAppBar(@NotNull AppBarLayout.f offsetChangedListener) {
        Intrinsics.checkNotNullParameter(offsetChangedListener, "offsetChangedListener");
        AppBarLayout appBarLayout = this.appBar;
        appBarLayout.q(offsetChangedListener);
        appBarLayout.setOnApplyWindowInsetsListener(null);
        this.statusBarHeightHandler.removeCallbacksAndMessages(null);
    }
}

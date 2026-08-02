package ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.Q0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/bottomSheetFragment/StatusBarBackgroundController;", "", "window", "Landroid/view/Window;", "context", "Landroid/content/Context;", "<init>", "(Landroid/view/Window;Landroid/content/Context;)V", "backgroundColor", "", "isActive", "", "originalLightStatusBars", "Ljava/lang/Boolean;", "decorView", "Landroid/widget/FrameLayout;", "getDecorView", "()Landroid/widget/FrameLayout;", "backgroundView", "Landroid/view/View;", "getBackgroundView", "()Landroid/view/View;", "attach", "", "detach", "setProgress", "progress", "", "setActive", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StatusBarBackgroundController {
    private final int backgroundColor;

    @NotNull
    private final Context context;
    private boolean isActive;
    private Boolean originalLightStatusBars;

    @NotNull
    private final Window window;

    public StatusBarBackgroundController(@NotNull Window window, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "context");
        this.window = window;
        this.context = context;
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
    }

    private final View getBackgroundView() {
        return this.window.getDecorView().findViewById(R$id.reviewFormStatusBarBg);
    }

    private final FrameLayout getDecorView() {
        View decorView = this.window.getDecorView();
        if (decorView instanceof FrameLayout) {
            return (FrameLayout) decorView;
        }
        return null;
    }

    public final void attach() {
        if (getBackgroundView() != null) {
            return;
        }
        View view = new View(this.context);
        view.setId(R$id.reviewFormStatusBarBg);
        view.setBackgroundColor(this.backgroundColor);
        view.setAlpha(0.0f);
        FrameLayout decorView = getDecorView();
        if (decorView != null) {
            View decorView2 = this.window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ContextExtKt.getStatusBarHeight(decorView2));
            layoutParams.gravity = 48;
            Unit unit = Unit.f71690a;
            decorView.addView(view, layoutParams);
        }
    }

    public final void detach() {
        FrameLayout decorView;
        if (this.isActive) {
            Boolean bool = this.originalLightStatusBars;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                Window window = this.window;
                new Q0(window.getDecorView(), window).e(booleanValue);
            }
            this.originalLightStatusBars = null;
            this.isActive = false;
        }
        View backgroundView = getBackgroundView();
        if (backgroundView == null || (decorView = getDecorView()) == null) {
            return;
        }
        decorView.removeView(backgroundView);
    }

    public final void setActive(boolean active) {
        if (active == this.isActive) {
            return;
        }
        Window window = this.window;
        Q0 q02 = new Q0(window.getDecorView(), window);
        Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
        if (active) {
            this.originalLightStatusBars = Boolean.valueOf(q02.c());
            q02.e(!ViewExtKt.isColorDark$default(this.backgroundColor, 0.0d, 1, null));
        } else {
            Boolean bool = this.originalLightStatusBars;
            if (bool != null) {
                q02.e(bool.booleanValue());
            }
            this.originalLightStatusBars = null;
        }
        this.isActive = active;
    }

    public final void setProgress(float progress) {
        View backgroundView = getBackgroundView();
        if (backgroundView != null) {
            backgroundView.setAlpha(progress);
        }
    }
}

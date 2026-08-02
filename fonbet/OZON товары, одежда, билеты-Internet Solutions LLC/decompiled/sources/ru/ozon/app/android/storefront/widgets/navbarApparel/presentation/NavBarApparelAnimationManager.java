package ru.ozon.app.android.storefront.widgets.navbarApparel.presentation;

import a00.C4911f;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarApparel.view.NavBarApparelView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelAnimationManager;", "", "La00/f;", "container", "Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;", "view", "<init>", "(La00/f;Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;)V", "", "computeAnimationTriggerY", "()I", "currentScrollY", "", "getAlphaByScroll", "(I)F", "alpha", "", "animate", "", "setNavbarAlpha", "(FZ)V", "onBind", "(I)V", "onScroll", "cancelAnimation", "()V", "Lru/ozon/app/android/storefront/widgets/navbarApparel/view/NavBarApparelView;", "Landroid/animation/ObjectAnimator;", "currentAnimator", "Landroid/animation/ObjectAnimator;", "Landroid/view/Display;", "display", "Landroid/view/Display;", "animationTriggerY", "I", "prevAlpha", "F", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarApparelAnimationManager {
    private final int animationTriggerY;
    private ObjectAnimator currentAnimator;
    private final Display display;
    private float prevAlpha;

    @NotNull
    private final NavBarApparelView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int FORMULA_EXTRA_PIXELS = UiExtKt.toPx(70);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/presentation/NavBarApparelAnimationManager$Companion;", "", "<init>", "()V", "", "ALPHA_DEFAULT", "F", "ALPHA_SCROLLED", "", "ANIMATION_DURATION", "J", "", "FORMULA_FIRST_ARGUMENT", "I", "FORMULA_SECOND_ARGUMENT", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NavBarApparelAnimationManager(@NotNull C4911f container, @NotNull NavBarApparelView view) {
        WindowManager windowManager;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        r a11 = container.a();
        this.display = (a11 == null || (windowManager = a11.getWindowManager()) == null) ? null : windowManager.getDefaultDisplay();
        this.animationTriggerY = computeAnimationTriggerY();
    }

    private final int computeAnimationTriggerY() {
        Point point = new Point();
        Display display = this.display;
        if (display != null) {
            display.getSize(point);
        }
        return ((point.x / 3) * 4) - FORMULA_EXTRA_PIXELS;
    }

    private final float getAlphaByScroll(int currentScrollY) {
        return currentScrollY < this.animationTriggerY ? 0.8f : 1.0f;
    }

    private final void setNavbarAlpha(float alpha, boolean animate) {
        float f7 = this.prevAlpha;
        if (f7 == alpha) {
            return;
        }
        this.prevAlpha = alpha;
        if (!animate) {
            this.view.setAlpha(alpha);
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.view, (Property<NavBarApparelView, Float>) View.ALPHA, f7, alpha).setDuration(300L);
        this.currentAnimator = duration;
        if (duration != null) {
            duration.start();
        }
    }

    public final void cancelAnimation() {
        ObjectAnimator objectAnimator = this.currentAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.currentAnimator = null;
    }

    public final void onBind(int currentScrollY) {
        setNavbarAlpha(getAlphaByScroll(currentScrollY), false);
    }

    public final void onScroll(int currentScrollY) {
        setNavbarAlpha(getAlphaByScroll(currentScrollY), true);
    }
}

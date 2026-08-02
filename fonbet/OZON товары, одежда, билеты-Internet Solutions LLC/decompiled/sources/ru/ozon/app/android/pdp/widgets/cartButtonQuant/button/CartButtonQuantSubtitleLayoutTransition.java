package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantSubtitleLayoutTransition;", "Landroid/animation/LayoutTransition;", "predicate", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "showChild", "", "parent", "Landroid/view/ViewGroup;", "child", "Landroid/view/View;", "oldVisibility", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonQuantSubtitleLayoutTransition extends LayoutTransition {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function0<Boolean> predicate;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonQuantSubtitleLayoutTransition$Companion;", "", "<init>", "()V", "ANIMATION_DURATION_MS", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartButtonQuantSubtitleLayoutTransition(@NotNull Function0<Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.predicate = predicate;
        Animator animator = getAnimator(0);
        animator.setInterpolator(new OvershootInterpolator());
        setAnimator(0, animator);
        setDuration(2, 400L);
        setDuration(0, 400L);
        disableTransitionType(4);
        disableTransitionType(3);
        disableTransitionType(1);
        setAnimateParentHierarchy(false);
    }

    @Override // android.animation.LayoutTransition
    public void showChild(@NotNull ViewGroup parent, @NotNull View child, int oldVisibility) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.getId() == R$id.btnIconIv || !this.predicate.invoke().booleanValue()) {
            return;
        }
        super.showChild(parent, child, oldVisibility);
    }
}

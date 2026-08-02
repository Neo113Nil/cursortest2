package ru.ozon.app.android.pdp.widgets.cartButtonV4.button;

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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonSubtitleLayoutTransition;", "Landroid/animation/LayoutTransition;", "", "duration", "Lkotlin/Function0;", "", "predicate", "<init>", "(JLkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "child", "", "oldVisibility", "", "showChild", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "J", "getDuration", "()J", "Lkotlin/jvm/functions/Function0;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonSubtitleLayoutTransition extends LayoutTransition {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final long duration;

    @NotNull
    private final Function0<Boolean> predicate;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/button/CartButtonSubtitleLayoutTransition$Companion;", "", "<init>", "()V", "ANIMATION_DURATION_MS", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartButtonSubtitleLayoutTransition(long j11, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 400L : j11, function0);
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

    public CartButtonSubtitleLayoutTransition(long j11, @NotNull Function0<Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.duration = j11;
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
}

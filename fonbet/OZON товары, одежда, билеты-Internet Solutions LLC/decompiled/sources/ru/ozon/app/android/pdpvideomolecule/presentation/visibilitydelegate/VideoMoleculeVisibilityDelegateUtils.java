package ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate;

import android.animation.Animator;
import android.view.View;
import androidx.media3.ui.LegacyPlayerControlView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/visibilitydelegate/VideoMoleculeVisibilityDelegateUtils;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "showViewImmediately", "(Landroid/view/View;)V", "showView", "", "animated", "show", "(Landroid/view/View;Z)V", "hideViewImmediately", "child", "showWithAnimation", "hideWithAnimation", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeVisibilityDelegateUtils {

    @NotNull
    public static final VideoMoleculeVisibilityDelegateUtils INSTANCE = new VideoMoleculeVisibilityDelegateUtils();

    private VideoMoleculeVisibilityDelegateUtils() {
    }

    private final void showView(View view) {
        if (view instanceof LegacyPlayerControlView) {
            ((LegacyPlayerControlView) view).B();
        } else {
            ViewExtKt.show(view);
        }
    }

    private final void showViewImmediately(View view) {
        view.setAlpha(1.0f);
        showView(view);
    }

    public final void hideViewImmediately(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof LegacyPlayerControlView) {
            ((LegacyPlayerControlView) view).w();
        } else {
            ViewExtKt.invisible(view);
        }
    }

    public final void hideWithAnimation(@NotNull final View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        child.animate().alpha(0.0f).setDuration(150L).setListener(new VideoMoleculeAnimationListener() { // from class: ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegateUtils$hideWithAnimation$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                VideoMoleculeVisibilityDelegateUtils.INSTANCE.hideViewImmediately(child);
            }
        });
    }

    public final void show(@NotNull View view, boolean animated) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (animated) {
            showWithAnimation(view);
        } else {
            showViewImmediately(view);
        }
    }

    public final void showWithAnimation(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        child.setAlpha(0.0f);
        showView(child);
        child.animate().alpha(1.0f).setDuration(150L).setListener(null);
    }
}

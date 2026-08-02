package ru.ozon.app.android.pdp.ui.configurators.ugc.bottomsheets;

import EZ.e;
import EZ.f;
import EZ.g;
import OZ.h;
import androidx.core.os.d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.fintech.ui.input.CounterView;
import sZ.AbstractC9643a;
import sZ.c;
import tZ.C9786a;
import uZ.C9992d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/bottomsheets/ReviewBottomSheetNavigator;", "LEZ/g;", "Landroidx/fragment/app/k;", "fragment", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "activateCommentField", "", "containerId", "<init>", "(Landroidx/fragment/app/k;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;ZI)V", "", "attachToHolder", "()V", "LEZ/e;", "response", "requestCode", "navigate", "(LEZ/e;I)V", "Landroidx/fragment/app/k;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "Z", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewBottomSheetNavigator extends g {
    private final boolean activateCommentField;

    @NotNull
    private final DialogInterfaceOnCancelListenerC5390k fragment;

    @NotNull
    private final ComposerScreenConfig screenConfig;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReviewBottomSheetNavigator(@NotNull DialogInterfaceOnCancelListenerC5390k fragment, @NotNull ComposerScreenConfig screenConfig, boolean z11, int i11) {
        super((androidx.appcompat.app.g) r0, Integer.valueOf(i11), r1, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        r requireActivity = fragment.requireActivity();
        Intrinsics.g(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.fragment = fragment;
        this.screenConfig = screenConfig;
        this.activateCommentField = z11;
    }

    @Override // EZ.g
    protected void attachToHolder() {
        if (this.fragment.getChildFragmentManager().g0(N.b(ComposerFragment.class).B()) == null) {
            ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, this.screenConfig, null, d.b(new Pair("activateCommentField", Boolean.valueOf(this.activateCommentField))), 2, null);
            Intrinsics.checkNotNullExpressionValue("ComposerFragment", "getSimpleName(...)");
            g.navigateInternal$default(this, f.a(new c("ComposerFragment", newInstance$default, null, false, false, null, false, false, false, CounterView.COUNTER_MAX_DEFAULT, null)), 0, 2, null);
        }
    }

    @Override // EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof pZ.g) {
            super.navigate(response, requestCode);
            return;
        }
        if ((b11 instanceof AbstractC9643a) || (b11 instanceof h) || (b11 instanceof OZ.e)) {
            if (!this.fragment.isAdded()) {
                BxLogger.INSTANCE.log(6, "ReviewBottomSheet", "Fragment not added in navigator for " + b11);
            } else if (!(b11 instanceof C9992d)) {
                this.fragment.dismiss();
            }
            next(response, requestCode);
            return;
        }
        if (!(b11 instanceof C9786a)) {
            next(response, requestCode);
            return;
        }
        if (this.fragment.isAdded()) {
            this.fragment.dismiss();
            return;
        }
        BxLogger.INSTANCE.log(6, "ReviewBottomSheet", "Fragment not added in navigator for " + b11);
    }
}

package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OnBoardingDelegateForOverlayWidgetsImpl$rootView$2 extends AbstractC7737t implements Function0<ViewGroup> {
    final /* synthetic */ i $container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnBoardingDelegateForOverlayWidgetsImpl$rootView$2(i iVar) {
        super(0);
        this.$container = iVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        ComponentCallbacksC5392m b11 = this.$container.K().b();
        if (b11 != null) {
            return ContextExtKt.getRootView(b11);
        }
        return null;
    }
}

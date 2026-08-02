package ru.ozon.app.android.storefront.domain.onboarding.presentation;

import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnboardingDelegateImpl$rootView$2 extends AbstractC7737t implements Function0<ViewGroup> {
    final /* synthetic */ OnboardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingDelegateImpl$rootView$2(OnboardingDelegateImpl onboardingDelegateImpl) {
        super(0);
        this.this$0 = onboardingDelegateImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        r a11 = composerReferences.getContainer().a();
        if (a11 != null) {
            return ContextExtKt.getRootView(a11);
        }
        return null;
    }
}

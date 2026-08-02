package ru.ozon.app.android.storefront.domain.onboarding.presentation;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnboardingDelegateImpl$composerRv$2 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ OnboardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingDelegateImpl$composerRv$2(OnboardingDelegateImpl onboardingDelegateImpl) {
        super(0);
        this.this$0 = onboardingDelegateImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        ViewGroup rootView;
        rootView = this.this$0.getRootView();
        if (rootView != null) {
            return ComposerViewExtensionKt.composerRecyclerView(rootView);
        }
        return null;
    }
}

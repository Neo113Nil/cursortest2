package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/G;", "invoke", "()Landroidx/fragment/app/G;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class OnBoardingDelegateImpl$bottomSheetObserver$1 extends AbstractC7737t implements Function0<G> {
    final /* synthetic */ OnBoardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnBoardingDelegateImpl$bottomSheetObserver$1(OnBoardingDelegateImpl onBoardingDelegateImpl) {
        super(0);
        this.this$0 = onBoardingDelegateImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final G invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        return composerReferences.getContainer().d();
    }
}

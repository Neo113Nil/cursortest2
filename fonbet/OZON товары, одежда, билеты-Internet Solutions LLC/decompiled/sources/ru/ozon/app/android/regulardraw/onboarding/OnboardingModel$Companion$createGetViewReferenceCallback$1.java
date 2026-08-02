package ru.ozon.app.android.regulardraw.onboarding;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OnboardingModel$Companion$createGetViewReferenceCallback$1 extends AbstractC7737t implements Function0<WeakReference<View>> {
    final /* synthetic */ WeakReference<View> $viewWeakReference;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingModel$Companion$createGetViewReferenceCallback$1(WeakReference<View> weakReference) {
        super(0);
        this.$viewWeakReference = weakReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WeakReference<View> invoke() {
        return this.$viewWeakReference;
    }
}

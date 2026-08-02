package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationUIState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationStateViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "<set-?>", "animationState$delegate", "LS0/p0;", "getAnimationState", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "setAnimationState", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;)V", "animationState", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorAnimationStateViewModel extends w0 {

    /* renamed from: animationState$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 animationState;

    public TopAuthorAnimationStateViewModel() {
        C3991w0 f7;
        f7 = n1.f(TopAuthorAnimationUIState.Initial.INSTANCE, D1.f25195a);
        this.animationState = f7;
    }

    @NotNull
    public final TopAuthorAnimationUIState getAnimationState() {
        return (TopAuthorAnimationUIState) this.animationState.getValue();
    }

    public final void setAnimationState(@NotNull TopAuthorAnimationUIState topAuthorAnimationUIState) {
        Intrinsics.checkNotNullParameter(topAuthorAnimationUIState, "<set-?>");
        this.animationState.setValue(topAuthorAnimationUIState);
    }
}

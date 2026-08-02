package ru.ozon.app.android.common.serviceCarousel.presentation.onboarding;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.M;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\"\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/onboarding/OnboardingHelperDelegate;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lxe/M;", "widgetLifecycleScope", "Lkotlin/Function1;", "", "", "actionsToShow", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lxe/M;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "vo", "listenDialogToClose", "(Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;)V", "showOnboarding", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "show", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lxe/M;", "Lkotlin/jvm/functions/Function1;", "", "wasShown", "Z", "Lxe/B0;", "currentJob", "Lxe/B0;", "Companion", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnboardingHelperDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<Integer, Unit> actionsToShow;
    private B0 currentJob;

    @NotNull
    private final ComposerReferences refs;
    private boolean wasShown;

    @NotNull
    private final M widgetLifecycleScope;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/onboarding/OnboardingHelperDelegate$Companion;", "", "<init>", "()V", "DIALOG_APPEARING_TIMEOUT", "", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingHelperDelegate(@NotNull ComposerReferences refs, @NotNull M widgetLifecycleScope, @NotNull Function1<? super Integer, Unit> actionsToShow) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(widgetLifecycleScope, "widgetLifecycleScope");
        Intrinsics.checkNotNullParameter(actionsToShow, "actionsToShow");
        this.refs = refs;
        this.widgetLifecycleScope = widgetLifecycleScope;
        this.actionsToShow = actionsToShow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void listenDialogToClose(final BottomSheetComposerFragment bottomSheetComposerFragment, final ServiceCarouselVO serviceCarouselVO) {
        bottomSheetComposerFragment.getLifecycle().a(new G() { // from class: ru.ozon.app.android.common.serviceCarousel.presentation.onboarding.OnboardingHelperDelegate$listenDialogToClose$1
            @Override // androidx.lifecycle.G
            public void onStateChanged(J source, AbstractC5434v.a event) {
                B0 b02;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == AbstractC5434v.a.ON_STOP) {
                    b02 = OnboardingHelperDelegate.this.currentJob;
                    if (b02 != null) {
                        b02.j(null);
                    }
                    OnboardingHelperDelegate.this.currentJob = null;
                    OnboardingHelperDelegate.this.show(serviceCarouselVO);
                    bottomSheetComposerFragment.getLifecycle().e(this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showOnboarding(ServiceCarouselVO serviceCarouselVO, d<? super Unit> dVar) {
        E0.f(dVar.getContext());
        if (!this.wasShown) {
            this.actionsToShow.invoke(serviceCarouselVO.getOnboardingItemIndex());
            this.wasShown = true;
        }
        return Unit.f71690a;
    }

    public final void show(@NotNull ServiceCarouselVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.currentJob = C10727i.c(this.widgetLifecycleScope, null, null, new OnboardingHelperDelegate$show$1(this, vo, null), 3);
    }
}

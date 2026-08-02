package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding;

import Xo.a;
import Xo.b;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import cT.C5784a;
import cT.C5785b;
import cT.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ1\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020 0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3MultiFrameBindDelegate;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/ViewHolderLifecycle;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3ViewStateBinder;", "travelCarriageSelectV3ViewStateBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "itemView", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3ViewStateBinder;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;)V", "", "onAttach", "()V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onRecycle", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3ViewStateBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindStep1", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindStep2", "bindStep3", "bindStep4", "bindStep5", "", "bindSteps", "Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3MultiFrameBindDelegate implements ViewHolderLifecycle {

    @NotNull
    private final BindStep bindStep1;

    @NotNull
    private final BindStep bindStep2;

    @NotNull
    private final BindStep bindStep3;

    @NotNull
    private final BindStep bindStep4;

    @NotNull
    private final BindStep bindStep5;

    @NotNull
    private final List<BindStep> bindSteps;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final TravelCarriageSelectV3ViewStateBinder travelCarriageSelectV3ViewStateBinder;

    public TravelCarriageSelectV3MultiFrameBindDelegate(@NotNull TravelCarriageSelectV3ViewStateBinder travelCarriageSelectV3ViewStateBinder, @NotNull FrameBinder frameBinder, @NotNull ComposerReferences references, @NotNull TravelCarriageSelectV3View itemView) {
        View view;
        Intrinsics.checkNotNullParameter(travelCarriageSelectV3ViewStateBinder, "travelCarriageSelectV3ViewStateBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.travelCarriageSelectV3ViewStateBinder = travelCarriageSelectV3ViewStateBinder;
        this.frameBinder = frameBinder;
        int i11 = 0;
        C5784a c5784a = new C5784a(this, i11);
        this.bindStep1 = c5784a;
        C5785b c5785b = new C5785b(this, i11);
        this.bindStep2 = c5785b;
        c cVar = new c(this, i11);
        this.bindStep3 = cVar;
        int i12 = 1;
        a aVar = new a(this, i12);
        this.bindStep4 = aVar;
        b bVar = new b(this, i12);
        this.bindStep5 = bVar;
        this.bindSteps = C7714v.b0(c5784a, c5785b, cVar, aVar, bVar);
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view));
        travelCarriageSelectV3ViewStateBinder.init(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep1$lambda$0(TravelCarriageSelectV3MultiFrameBindDelegate travelCarriageSelectV3MultiFrameBindDelegate) {
        travelCarriageSelectV3MultiFrameBindDelegate.travelCarriageSelectV3ViewStateBinder.bindTexts();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep2$lambda$1(TravelCarriageSelectV3MultiFrameBindDelegate travelCarriageSelectV3MultiFrameBindDelegate) {
        travelCarriageSelectV3MultiFrameBindDelegate.travelCarriageSelectV3ViewStateBinder.bindStoreys();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep3$lambda$2(TravelCarriageSelectV3MultiFrameBindDelegate travelCarriageSelectV3MultiFrameBindDelegate) {
        travelCarriageSelectV3MultiFrameBindDelegate.travelCarriageSelectV3ViewStateBinder.bindServices();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep4$lambda$3(TravelCarriageSelectV3MultiFrameBindDelegate travelCarriageSelectV3MultiFrameBindDelegate) {
        travelCarriageSelectV3MultiFrameBindDelegate.travelCarriageSelectV3ViewStateBinder.bindSeats();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep5$lambda$4(TravelCarriageSelectV3MultiFrameBindDelegate travelCarriageSelectV3MultiFrameBindDelegate) {
        travelCarriageSelectV3MultiFrameBindDelegate.travelCarriageSelectV3ViewStateBinder.bindPrices();
        return Unit.f71690a;
    }

    public final void bind(@NotNull TravelCarriageSelectV3VO vo, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        TravelCarriageSelectV3ViewStateBinder travelCarriageSelectV3ViewStateBinder = this.travelCarriageSelectV3ViewStateBinder;
        travelCarriageSelectV3ViewStateBinder.prepare(vo, actionHandler);
        travelCarriageSelectV3ViewStateBinder.bindPremiumBadge();
        this.frameBinder.bind(this.bindSteps, vo.getViewItemKey());
    }

    public void onAttach() {
        this.frameBinder.onAttach(new TravelCarriageSelectV3MultiFrameBindDelegate$onAttach$1(this.travelCarriageSelectV3ViewStateBinder));
    }

    public void onDetach() {
        this.frameBinder.onDetach();
        this.travelCarriageSelectV3ViewStateBinder.onDetach();
    }

    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.travelCarriageSelectV3ViewStateBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    public void onRecycle() {
        this.frameBinder.onRecycle();
        this.travelCarriageSelectV3ViewStateBinder.onRecycle();
    }
}

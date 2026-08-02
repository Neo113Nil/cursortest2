package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation;

import Vg.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3View;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0016\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "containerView", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3MultiFrameBindDelegate;", "multiFrameBindDelegate", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3MultiFrameBindDelegate;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;Ll20/d;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3MultiFrameBindDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3WidgetViewHolder extends k<TravelCarriageSelectV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelCarriageSelectV3MultiFrameBindDelegate multiFrameBindDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageSelectV3WidgetViewHolder(@NotNull TravelCarriageSelectV3View containerView, @NotNull TravelCarriageSelectV3MultiFrameBindDelegate multiFrameBindDelegate, @NotNull ComposerReferences ref, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(multiFrameBindDelegate, "multiFrameBindDelegate");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.multiFrameBindDelegate = multiFrameBindDelegate;
        this.actionHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new TravelCarriageSelectV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        containerView.setRecycledViewPool(ref.getComposerViewPoolProvider().getViewPool());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.multiFrameBindDelegate.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.multiFrameBindDelegate.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.multiFrameBindDelegate.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.multiFrameBindDelegate.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCarriageSelectV3VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            return;
        }
        bind(item, info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCarriageSelectV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.multiFrameBindDelegate.bind(item, this.actionHandler);
    }
}

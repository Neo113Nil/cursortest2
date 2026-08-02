package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding;

import EM.a;
import EM.b;
import EM.f;
import EM.g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4AllDoneVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ1\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020 0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4MultiFrameBindDelegate;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/ViewHolderLifecycle;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4ViewStateBinder;", "aviaSearchResultV4ViewStateBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "itemView", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4ViewStateBinder;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;)V", "", "onAttach", "()V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onDetach", "onRecycle", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/multiFrameBinding/AviaSearchResultV4ViewStateBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindStep1", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "bindStep2", "bindStep3", "bindStep4", "bindStep5", "bindStep6", "bindStep7", "", "bindSteps", "Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4MultiFrameBindDelegate implements ViewHolderLifecycle {

    @NotNull
    private final AviaSearchResultV4ViewStateBinder aviaSearchResultV4ViewStateBinder;

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
    private final BindStep bindStep6;

    @NotNull
    private final BindStep bindStep7;

    @NotNull
    private final List<BindStep> bindSteps;

    @NotNull
    private final FrameBinder frameBinder;

    public AviaSearchResultV4MultiFrameBindDelegate(@NotNull AviaSearchResultV4ViewStateBinder aviaSearchResultV4ViewStateBinder, @NotNull FrameBinder frameBinder, RecyclerView recyclerView, @NotNull AviaSearchResultV4FlightView itemView) {
        Intrinsics.checkNotNullParameter(aviaSearchResultV4ViewStateBinder, "aviaSearchResultV4ViewStateBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.aviaSearchResultV4ViewStateBinder = aviaSearchResultV4ViewStateBinder;
        this.frameBinder = frameBinder;
        int i11 = 0;
        a aVar = new a(this, i11);
        this.bindStep1 = aVar;
        b bVar = new b(this, i11);
        this.bindStep2 = bVar;
        BindStep bindStep = new BindStep() { // from class: EM.c
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindStep3$lambda$2;
                bindStep3$lambda$2 = AviaSearchResultV4MultiFrameBindDelegate.bindStep3$lambda$2(AviaSearchResultV4MultiFrameBindDelegate.this);
                return bindStep3$lambda$2;
            }
        };
        this.bindStep3 = bindStep;
        BindStep bindStep2 = new BindStep() { // from class: EM.d
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindStep4$lambda$3;
                bindStep4$lambda$3 = AviaSearchResultV4MultiFrameBindDelegate.bindStep4$lambda$3(AviaSearchResultV4MultiFrameBindDelegate.this);
                return bindStep4$lambda$3;
            }
        };
        this.bindStep4 = bindStep2;
        BindStep bindStep3 = new BindStep() { // from class: EM.e
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit bindStep5$lambda$4;
                bindStep5$lambda$4 = AviaSearchResultV4MultiFrameBindDelegate.bindStep5$lambda$4(AviaSearchResultV4MultiFrameBindDelegate.this);
                return bindStep5$lambda$4;
            }
        };
        this.bindStep5 = bindStep3;
        f fVar = new f(this, i11);
        this.bindStep6 = fVar;
        g gVar = new g(this, i11);
        this.bindStep7 = gVar;
        this.bindSteps = C7714v.b0(aVar, bVar, bindStep, bindStep2, bindStep3, fVar, gVar);
        frameBinder.init(itemView);
        frameBinder.applyRecycler(recyclerView);
        aviaSearchResultV4ViewStateBinder.init(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep1$lambda$0(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindPrice();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep2$lambda$1(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindLuggageText();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep3$lambda$2(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindAirlineIcons();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep4$lambda$3(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindAirlineText();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep5$lambda$4(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindThereDetails();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep6$lambda$5(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindBackDetails();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStep7$lambda$6(AviaSearchResultV4MultiFrameBindDelegate aviaSearchResultV4MultiFrameBindDelegate) {
        aviaSearchResultV4MultiFrameBindDelegate.aviaSearchResultV4ViewStateBinder.bindAdditionalInfo();
        return Unit.f71690a;
    }

    public final void bind(@NotNull AviaSearchResultV4AllDoneVO vo, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        AviaSearchResultV4ViewStateBinder aviaSearchResultV4ViewStateBinder = this.aviaSearchResultV4ViewStateBinder;
        aviaSearchResultV4ViewStateBinder.prepare(vo.getFlight(), actionHandler);
        aviaSearchResultV4ViewStateBinder.bindBackground();
        aviaSearchResultV4ViewStateBinder.bindBadges();
        this.frameBinder.bind(this.bindSteps, vo.getViewItemKey());
    }

    public void onAttach() {
        this.frameBinder.onAttach(new AviaSearchResultV4MultiFrameBindDelegate$onAttach$1(this.aviaSearchResultV4ViewStateBinder));
    }

    public void onDetach() {
        this.frameBinder.onDetach();
        this.aviaSearchResultV4ViewStateBinder.onDetach();
    }

    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.aviaSearchResultV4ViewStateBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    public void onRecycle() {
        this.frameBinder.onRecycle();
        this.aviaSearchResultV4ViewStateBinder.onRecycle();
    }
}

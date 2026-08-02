package ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.stickyblock;

import GZ.g;
import LZ.b;
import T00.a;
import WZ.t;
import android.view.View;
import androidx.cardview.widget.CardView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.autopicker.databinding.WidgetStickyBlockProductPickerDetailsBinding;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.common.productselectormobile.PresentationUtils;
import ru.ozon.app.android.common.productselectormobile.core.AutopickerBottomSheetRepository;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import sZ.c;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;", "autopickerBottomSheetRepository", "LGZ/g;", "router", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;LGZ/g;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "processClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "openProductPickerSearchFragment", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;", "LGZ/g;", "Lru/ozon/app/android/autopicker/databinding/WidgetStickyBlockProductPickerDetailsBinding;", "binding", "Lru/ozon/app/android/autopicker/databinding/WidgetStickyBlockProductPickerDetailsBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "restrictionAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "vo", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockVO;", "", "currentUrl", "Ljava/lang/String;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyBlockViewHolder extends k<StickyBlockVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AutopickerBottomSheetRepository autopickerBottomSheetRepository;

    @NotNull
    private final WidgetStickyBlockProductPickerDetailsBinding binding;

    @NotNull
    private final View containerView;
    private String currentUrl;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final AtomsAdapter restrictionAtomsAdapter;

    @NotNull
    private final g router;
    private StickyBlockVO vo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyBlockViewHolder(@NotNull View containerView, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs, @NotNull AutopickerBottomSheetRepository autopickerBottomSheetRepository, @NotNull g router) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(autopickerBottomSheetRepository, "autopickerBottomSheetRepository");
        Intrinsics.checkNotNullParameter(router, "router");
        this.containerView = containerView;
        this.refs = refs;
        this.autopickerBottomSheetRepository = autopickerBottomSheetRepository;
        this.router = router;
        WidgetStickyBlockProductPickerDetailsBinding bind = WidgetStickyBlockProductPickerDetailsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).onPreProcess(new StickyBlockViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonText.TextSmall.class, null, 2, null), new TextAtom.Configuration(0, 0, 12, 12, 0, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524275, null))), null, null, null, 14, null);
        this.restrictionAtomsAdapter = atomsAdapter;
        bind.restrictionAtomLayout.setAdapter(atomsAdapter);
        bind.buttonSa.setOnAction(buildHandler);
    }

    private final void openProductPickerSearchFragment(AtomAction.Click action) {
        g gVar = this.router;
        Intrinsics.checkNotNullExpressionValue("ProductPickerSearchFragment", "getSimpleName(...)");
        ProductPickerSearchFragment.Companion companion = ProductPickerSearchFragment.INSTANCE;
        StickyBlockVO stickyBlockVO = this.vo;
        if (stickyBlockVO == null) {
            Intrinsics.n("vo");
            throw null;
        }
        String actionType = stickyBlockVO.getCurrentState().getActionType();
        String link = action.getLink();
        Intrinsics.f(link);
        StickyBlockVO stickyBlockVO2 = this.vo;
        if (stickyBlockVO2 != null) {
            gVar.c(new b(new c("ProductPickerSearchFragment", companion.newInstance(actionType, link, new HashMap<>(stickyBlockVO2.getCurrentState().getParams())), 1000, false, false, null, false, false, false, 504, null)), null);
        } else {
            Intrinsics.n("vo");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processClick(AtomAction action) {
        AtomAction.Click click;
        String id2;
        if (action instanceof AtomAction.Move) {
            String link = ((AtomAction.Move) action).getLink();
            if (link != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), link, null, 2, null);
                return;
            }
            return;
        }
        if (!(action instanceof AtomAction.Click) || (id2 = (click = (AtomAction.Click) action).getId()) == null) {
            return;
        }
        int hashCode = id2.hashCode();
        if (hashCode == -224511935) {
            if (id2.equals("isCompleted")) {
                if (PresentationUtils.INSTANCE.shouldRefreshPage(this.currentUrl, click.getLink())) {
                    InterfaceC7851b.a.a(this.refs.getController(), click.getLink(), null, null, null, 14);
                    return;
                }
                ComposerExtKt.setResult$default(this.refs.getContainer(), null, 0, new StickyBlockViewHolder$processClick$2(action), 3, null);
                ComposerExtKt.closeFlow(this.refs.getContainer());
                this.autopickerBottomSheetRepository.setShouldCloseBottomSheet(true);
                return;
            }
            return;
        }
        if (hashCode == 108404047) {
            if (id2.equals("reset")) {
                InterfaceC7851b.a.a(this.refs.getController(), click.getLink(), null, null, null, 14);
            }
        } else if (hashCode == 1424381023 && id2.equals("nextStep")) {
            openProductPickerSearchFragment(click);
        }
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StickyBlockVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.vo = item;
        a b11 = info.b();
        this.currentUrl = b11 != null ? b11.c() : null;
        this.restrictionAtomsAdapter.bind(getContext(), item.getRestrictionAtoms());
        WidgetStickyBlockProductPickerDetailsBinding widgetStickyBlockProductPickerDetailsBinding = this.binding;
        CardView restrictionCv = widgetStickyBlockProductPickerDetailsBinding.restrictionCv;
        Intrinsics.checkNotNullExpressionValue(restrictionCv, "restrictionCv");
        ViewExtKt.showOrGone(restrictionCv, Boolean.valueOf(!item.getRestrictionAtoms().isEmpty()));
        SingleAtom.bind$default(widgetStickyBlockProductPickerDetailsBinding.buttonSa, item.getButton(), false, 2, null);
        t restrictionTokenizedEvent = item.getRestrictionTokenizedEvent();
        if (restrictionTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), restrictionTokenizedEvent, null, 2, null);
        }
    }
}

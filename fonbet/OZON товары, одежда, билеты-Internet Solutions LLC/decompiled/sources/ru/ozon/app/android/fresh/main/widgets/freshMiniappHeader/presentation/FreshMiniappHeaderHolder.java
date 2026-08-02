package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Il.a;
import Sc.r;
import Sc.s;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.WidgetFreshMiniappHeaderBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.C10727i;
import xe.E0;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J)\u0010/\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0014088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/main/databinding/WidgetFreshMiniappHeaderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderViewModel;", "viewModel", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "mapper", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/WidgetFreshMiniappHeaderBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;LWZ/l;Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderViewModel;Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;)V", "newVO", "", "updateFreshMiniappHeader", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;)V", "checkIfAddressChanged", "()V", "Lkotlin/Function0;", "action", "bindWidgetClickAction", "(Lkotlin/jvm/functions/Function0;)V", "subscribeToWidgetUpdates", "unsubscribeFromWidgetUpdates", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;", "", "filterUnchanged", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellRegular24IconPicker;)Z", "item", "setDeliveryIconTint", "onAttach", "onViewInVisibleBounds", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Lru/ozon/app/android/fresh/main/databinding/WidgetFreshMiniappHeaderBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "LWZ/l;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderViewModel;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshMiniappHeaderHolder extends k<FreshMiniappHeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AddressUiInfoViewModel addressViewModel;

    @NotNull
    private final WidgetFreshMiniappHeaderBinding binding;

    @NotNull
    private final FreshMiniappHeaderMapper mapper;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FreshMiniappHeaderViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FreshMiniappHeaderHolder(@NotNull WidgetFreshMiniappHeaderBinding binding, @NotNull ComposerReferences references, @NotNull AddressUiInfoViewModel addressViewModel, @NotNull l tokenizedAnalytics, @NotNull FreshMiniappHeaderViewModel viewModel, @NotNull FreshMiniappHeaderMapper mapper) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(addressViewModel, "addressViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.addressViewModel = addressViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.mapper = mapper;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    private final void bindWidgetClickAction(Function0<Unit> action) {
        WidgetFreshMiniappHeaderBinding widgetFreshMiniappHeaderBinding = this.binding;
        widgetFreshMiniappHeaderBinding.getConstraintLayout().setOnClickListener(new a(action, 12));
        widgetFreshMiniappHeaderBinding.miniappTitle.setTextIsSelectable(false);
        widgetFreshMiniappHeaderBinding.addressTitle.setTextIsSelectable(false);
        widgetFreshMiniappHeaderBinding.timeDeliveryTitle.setTextIsSelectable(false);
        widgetFreshMiniappHeaderBinding.miniappIcon.setClickable(false);
        widgetFreshMiniappHeaderBinding.timeDeliveryIcon.setClickable(false);
    }

    private final void checkIfAddressChanged() {
        C10727i.c(K.a(this), null, null, new FreshMiniappHeaderHolder$checkIfAddressChanged$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean filterUnchanged(CellAtom.CellRegular24IconPicker cellRegular24IconPicker) {
        FreshMiniappHeaderVO boundData = getBoundData();
        if (boundData != null) {
            List m11 = h.m(boundData.getAddressTitle().getText(), new String[]{". "}, 0, 6);
            if (m11.size() != 1 && Intrinsics.d(cellRegular24IconPicker.getValue(), m11.get(1)) && Intrinsics.d(cellRegular24IconPicker.getTitle().toString(), m11.get(0))) {
                return true;
            }
        }
        return false;
    }

    private final void setDeliveryIconTint(FreshMiniappHeaderVO item) {
        CommonAtomIconDTO icon;
        try {
            r.Companion companion = r.INSTANCE;
            IconDTO timeDeliveryIcon = item.getTimeDeliveryIcon();
            this.binding.timeDeliveryIcon.setGraphicColor(Integer.valueOf(new Color.Solid(android.graphics.Color.parseColor((timeDeliveryIcon == null || (icon = timeDeliveryIcon.getIcon()) == null) ? null : icon.getTintColor())).getColor()));
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    private final void subscribeToWidgetUpdates() {
        unsubscribeFromWidgetUpdates();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getWidgetUpdate(), getLifecycle(), AbstractC5434v.b.STARTED), new FreshMiniappHeaderHolder$subscribeToWidgetUpdates$1(this, null)), K.a(this));
    }

    private final void unsubscribeFromWidgetUpdates() {
        E0.d(K.a(this).getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFreshMiniappHeader(FreshMiniappHeaderVO newVO) {
        this.references.getController().update(new FreshMiniappHeaderStateUpdate(newVO));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        subscribeToWidgetUpdates();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        unsubscribeFromWidgetUpdates();
        this.addressViewModel.updateAddressCell("supermarket");
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        String asyncData;
        super.onViewInVisibleBounds();
        FreshMiniappHeaderVO boundData = getBoundData();
        if (boundData == null || (asyncData = boundData.getAsyncData()) == null) {
            return;
        }
        this.viewModel.updateWidget(asyncData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FreshMiniappHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFreshMiniappHeaderBinding widgetFreshMiniappHeaderBinding = this.binding;
        setDeliveryIconTint(item);
        TextAtomV2View miniappTitle = widgetFreshMiniappHeaderBinding.miniappTitle;
        Intrinsics.checkNotNullExpressionValue(miniappTitle, "miniappTitle");
        TextHolderKt.bindOrGone$default(miniappTitle, item.getMiniappTitle(), null, 2, null);
        TextAtomV2View addressTitle = widgetFreshMiniappHeaderBinding.addressTitle;
        Intrinsics.checkNotNullExpressionValue(addressTitle, "addressTitle");
        TextHolderKt.bindOrGone$default(addressTitle, item.getAddressTitle(), null, 2, null);
        IconView miniappIcon = widgetFreshMiniappHeaderBinding.miniappIcon;
        Intrinsics.checkNotNullExpressionValue(miniappIcon, "miniappIcon");
        IconHolderKt.bindOrGone$default(miniappIcon, item.getMiniappIcon(), null, 2, null);
        TextAtomV2View timeDeliveryTitle = widgetFreshMiniappHeaderBinding.timeDeliveryTitle;
        Intrinsics.checkNotNullExpressionValue(timeDeliveryTitle, "timeDeliveryTitle");
        TextHolderKt.bindOrGone$default(timeDeliveryTitle, item.getTimeDeliveryTitle(), null, 2, null);
        IconView timeDeliveryIcon = widgetFreshMiniappHeaderBinding.timeDeliveryIcon;
        Intrinsics.checkNotNullExpressionValue(timeDeliveryIcon, "timeDeliveryIcon");
        IconHolderKt.bindOrGone$default(timeDeliveryIcon, item.getTimeDeliveryIcon(), null, 2, null);
        if (item.getAction() == null) {
            IconView addressDownIcon = widgetFreshMiniappHeaderBinding.addressDownIcon;
            Intrinsics.checkNotNullExpressionValue(addressDownIcon, "addressDownIcon");
            ViewExtKt.gone(addressDownIcon);
        } else {
            IconView addressDownIcon2 = widgetFreshMiniappHeaderBinding.addressDownIcon;
            Intrinsics.checkNotNullExpressionValue(addressDownIcon2, "addressDownIcon");
            ViewExtKt.show(addressDownIcon2);
            IconView addressDownIcon3 = widgetFreshMiniappHeaderBinding.addressDownIcon;
            Intrinsics.checkNotNullExpressionValue(addressDownIcon3, "addressDownIcon");
            ThemeExtKt.tint(addressDownIcon3, Integer.valueOf(widgetFreshMiniappHeaderBinding.addressTitle.getCurrentTextColor()));
        }
        bindWidgetClickAction(new FreshMiniappHeaderHolder$bind$1$1(item, this));
        checkIfAddressChanged();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FreshMiniappHeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

package ru.ozon.app.android.orderdetails.orderdetailsitem.presentation;

import Ck.a;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesView;
import ru.ozon.app.android.delivery.customActionsHandlers.getDirections.GetDirectionsActionHandler;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderDetailsItemBinding;
import ru.ozon.app.android.orderdetails.molecule.images.presentation.ImagesDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001b\u001a\u00020\u0013*\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00130.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderDetailsItemBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultListDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetOrderDetailsItemBinding;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;LVg/d;)V", "item", "", "bindButtonsInRow", "(Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;)V", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "atomLabelDTO", "", "defaultColorRes", "bindOrGone", "(Landroidx/appcompat/widget/AppCompatTextView;Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;I)V", "setRootLocatorIfExists", "()V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleIcon", "(Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderDetailsItemBinding;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "imagesDelegate", "Lru/ozon/app/android/orderdetails/molecule/images/presentation/ImagesDelegate;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsInRowAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDetailsItemWidgetViewHolder extends k<OrderDetailsItemVO> {

    @NotNull
    private static final Set<Class<? extends CustomActionHandler>> SUPPORTED_ACTIONS;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetOrderDetailsItemBinding binding;

    @NotNull
    private final AtomsAdapter buttonsInRowAdapter;

    @NotNull
    private final ImagesDelegate imagesDelegate;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemWidgetViewHolder$Companion;", "", "<init>", "()V", "SUPPORTED_ACTIONS", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "getSUPPORTED_ACTIONS", "()Ljava/util/Set;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends CustomActionHandler>> getSUPPORTED_ACTIONS() {
            return OrderDetailsItemWidgetViewHolder.SUPPORTED_ACTIONS;
        }

        private Companion() {
        }
    }

    static {
        Class[] elements = {CopyTextActionHandler.class, GetDirectionsActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SUPPORTED_ACTIONS = C7705l.j0(elements);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDetailsItemWidgetViewHolder(@NotNull WidgetOrderDetailsItemBinding binding, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull AdultListDelegate<ImageVO> adultListDelegate, @NotNull d customActionHandlersStoreFactory) {
        super(r4);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new OrderDetailsItemWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        ImagesView imagesRv = binding.imagesRv;
        Intrinsics.checkNotNullExpressionValue(imagesRv, "imagesRv");
        this.imagesDelegate = new ImagesDelegate(this, imagesRv, adultListDelegate, (getContext().getResources().getDisplayMetrics().widthPixels - UiExtKt.toPx(80)) / ImagesDelegate.INSTANCE.getITEM_SIZE_WITH_OFFSET(), buildHandler);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.buttonsInRowAdapter = atomsAdapter;
        binding.buttonsInRowFlexAL.setAdapter(atomsAdapter);
        binding.getConstraintLayout().setOnClickListener(new a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(OrderDetailsItemWidgetViewHolder orderDetailsItemWidgetViewHolder, View view) {
        ButtonTitleSubtitleCellDTO cell;
        CommonCellSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        OrderDetailsItemVO boundData = orderDetailsItemWidgetViewHolder.getBoundData();
        if (boundData == null || (cell = boundData.getCell()) == null || (common = cell.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        orderDetailsItemWidgetViewHolder.actionHandler.invoke(atomAction);
    }

    private final void bindButtonsInRow(OrderDetailsItemVO item) {
        WidgetOrderDetailsItemBinding widgetOrderDetailsItemBinding = this.binding;
        if (item.getButtonsInRow().isEmpty()) {
            HorizontalFlexAtomsLayout buttonsInRowFlexAL = widgetOrderDetailsItemBinding.buttonsInRowFlexAL;
            Intrinsics.checkNotNullExpressionValue(buttonsInRowFlexAL, "buttonsInRowFlexAL");
            ViewExtKt.gone(buttonsInRowFlexAL);
        } else {
            HorizontalFlexAtomsLayout buttonsInRowFlexAL2 = widgetOrderDetailsItemBinding.buttonsInRowFlexAL;
            Intrinsics.checkNotNullExpressionValue(buttonsInRowFlexAL2, "buttonsInRowFlexAL");
            ViewExtKt.show(buttonsInRowFlexAL2);
            this.buttonsInRowAdapter.bind(getContext(), item.getButtonsInRow());
        }
    }

    private final void bindOrGone(AppCompatTextView appCompatTextView, CommonAtomLabelDTO commonAtomLabelDTO, int i11) {
        Integer numberOfLines;
        TextViewExtKt.setTextOrGone(appCompatTextView, commonAtomLabelDTO != null ? commonAtomLabelDTO.getText() : null);
        appCompatTextView.setMaxLines((commonAtomLabelDTO == null || (numberOfLines = commonAtomLabelDTO.getNumberOfLines()) == null) ? 1 : numberOfLines.intValue());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context, commonAtomLabelDTO != null ? commonAtomLabelDTO.getTextColor() : null, i11));
    }

    private final IconDTO getTitleIcon(OrderDetailsItemVO item) {
        String icon = item.getCell().getTitle().getIcon();
        if (icon == null) {
            return null;
        }
        CommonAtomIconDTO commonAtomIconDTO = new CommonAtomIconDTO(icon, item.getCell().getTitle().getIconTintColor());
        return new IconDTO(IconDTO.IconSize.SIZE_400, null, IconDTO.IconShape.SHAPE_NONE, null, commonAtomIconDTO, null, null, null, null, null, null, null, null, null, null, null, 65514, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRootLocatorIfExists() {
        TestInfo testInfo;
        String automatizationId;
        OrderDetailsItemVO boundData = getBoundData();
        if (boundData == null || (testInfo = boundData.getTestInfo()) == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return;
        }
        this.binding.getConstraintLayout().setContentDescription(automatizationId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDetailsItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        final ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        G.a(constraintLayout, new Runnable() { // from class: ru.ozon.app.android.orderdetails.orderdetailsitem.presentation.OrderDetailsItemWidgetViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
        this.imagesDelegate.bind(item.getImages());
        WidgetOrderDetailsItemBinding widgetOrderDetailsItemBinding = this.binding;
        IconView iconV = widgetOrderDetailsItemBinding.iconV;
        Intrinsics.checkNotNullExpressionValue(iconV, "iconV");
        IconHolderKt.bind(iconV, item.getIcon(), this.actionHandler);
        AppCompatTextView titleTv = widgetOrderDetailsItemBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        bindOrGone(titleTv, item.getCell().getTitle(), UniColors.TEXT_PRIMARY.getResId());
        IconView titleIconIv = widgetOrderDetailsItemBinding.titleIconIv;
        Intrinsics.checkNotNullExpressionValue(titleIconIv, "titleIconIv");
        IconHolderKt.bindOrGone(titleIconIv, getTitleIcon(item), this.actionHandler);
        AppCompatTextView subtitleTv = widgetOrderDetailsItemBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        bindOrGone(subtitleTv, item.getCell().getSubtitle(), UniColors.TEXT_SECONDARY.getResId());
        ButtonView primaryButtonV = widgetOrderDetailsItemBinding.primaryButtonV;
        Intrinsics.checkNotNullExpressionValue(primaryButtonV, "primaryButtonV");
        ButtonHolderKt.bindOrGone(primaryButtonV, item.getCell().getButton(), this.actionHandler);
        ButtonV3View secondaryButtonV = widgetOrderDetailsItemBinding.secondaryButtonV;
        Intrinsics.checkNotNullExpressionValue(secondaryButtonV, "secondaryButtonV");
        ButtonV3HolderKt.bindOrGone(secondaryButtonV, item.getButton(), this.actionHandler);
        View separatorV = widgetOrderDetailsItemBinding.separatorV;
        Intrinsics.checkNotNullExpressionValue(separatorV, "separatorV");
        ViewExtKt.showOrGone(separatorV, Boolean.valueOf(item.getHasSeparator()));
        bindButtonsInRow(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderDetailsItemVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if (item.getCell().getTitle().getIcon() == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}

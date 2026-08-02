package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Cm.e;
import El.C2971a;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.OrderDoneButtonBarDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.orderdone.R$id;
import ru.ozon.app.android.orderdone.databinding.WidgetOrderDoneButtonBarBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.generator.GeneratorIdFactory;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0010048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:¨\u0006="}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneButtonBarBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;", "viewModel", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "<init>", "(Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneButtonBarBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;)V", "item", "", "bindButtons", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "pay", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;", "padding", "updatePaddings", "(Landroidx/constraintlayout/widget/ConstraintLayout;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;)V", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "showMessage", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "data", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lru/ozon/uni/android/flashbar/model/Restriction;", "showRestriction", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;Ll20/d;)V", "Lru/ozon/app/android/orderdone/databinding/WidgetOrderDoneButtonBarBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsHorizontalAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsVerticalAdapter", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneButtonBarWidgetViewHolder extends k<OrderDoneButtonBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ApplicationInfoDataSource applicationInfoDataSource;

    @NotNull
    private final WidgetOrderDoneButtonBarBinding binding;

    @NotNull
    private final AtomsAdapter buttonsHorizontalAdapter;

    @NotNull
    private final AtomsAdapter buttonsVerticalAdapter;

    @NotNull
    private final CreateAndPayViewModel createAndPayViewModel;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final OrderDoneButtonBarViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarWidgetViewHolder$Companion;", "", "<init>", "()V", "PAY_ACTION_ID", "", "REORDER_ACTION_ID", "PARAM_DEVICE_ID", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderDoneButtonBarWidgetViewHolder(@NotNull WidgetOrderDoneButtonBarBinding binding, @NotNull ComposerReferences refs, @NotNull OrderDoneButtonBarViewModel viewModel, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull ApplicationInfoDataSource applicationInfoDataSource) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.viewModel = viewModel;
        this.createAndPayViewModel = createAndPayViewModel;
        this.applicationInfoDataSource = applicationInfoDataSource;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onComposerAction(new OrderDoneButtonBarWidgetViewHolder$actionHandler$1(this)).onClick(new OrderDoneButtonBarWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        BxAtomConfig bxAtomConfig = BxAtomConfig.INSTANCE;
        GeneratorIdFactory generatorIdFactory = bxAtomConfig.getGeneratorIdFactory();
        HorizontalAtomsLayout buttonsHal = binding.buttonsHal;
        Intrinsics.checkNotNullExpressionValue(buttonsHal, "buttonsHal");
        atomsAdapter.setGenerator(generatorIdFactory.create(buttonsHal));
        this.buttonsHorizontalAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter2.setOnAction(buildHandler);
        GeneratorIdFactory generatorIdFactory2 = bxAtomConfig.getGeneratorIdFactory();
        VerticalAtomsLayout buttonsVal = binding.buttonsVal;
        Intrinsics.checkNotNullExpressionValue(buttonsVal, "buttonsVal");
        atomsAdapter2.setGenerator(generatorIdFactory2.create(buttonsVal));
        this.buttonsVerticalAdapter = atomsAdapter2;
        HorizontalAtomsLayout horizontalAtomsLayout = binding.buttonsHal;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        Context context = horizontalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new OrderDoneButtonBarHorizontalDecorator(context));
        VerticalAtomsLayout verticalAtomsLayout = binding.buttonsVal;
        verticalAtomsLayout.setAdapter(atomsAdapter2);
        Context context2 = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        verticalAtomsLayout.setDecorator(new OrderDoneButtonBarVerticalDecorator(context2));
    }

    private final void bindButtons(OrderDoneButtonBarVO item) {
        WidgetOrderDoneButtonBarBinding widgetOrderDoneButtonBarBinding = this.binding;
        if (item.getButtonsLayout() == OrderDoneButtonBarDTO.ButtonsLayout.HORIZONTAL) {
            VerticalAtomsLayout buttonsVal = widgetOrderDoneButtonBarBinding.buttonsVal;
            Intrinsics.checkNotNullExpressionValue(buttonsVal, "buttonsVal");
            buttonsVal.setVisibility(8);
            this.buttonsHorizontalAdapter.bind(getContext(), item.getButtons());
            HorizontalAtomsLayout buttonsHal = widgetOrderDoneButtonBarBinding.buttonsHal;
            Intrinsics.checkNotNullExpressionValue(buttonsHal, "buttonsHal");
            buttonsHal.setVisibility(0);
            return;
        }
        HorizontalAtomsLayout buttonsHal2 = widgetOrderDoneButtonBarBinding.buttonsHal;
        Intrinsics.checkNotNullExpressionValue(buttonsHal2, "buttonsHal");
        buttonsHal2.setVisibility(8);
        this.buttonsVerticalAdapter.bind(getContext(), item.getButtons());
        VerticalAtomsLayout buttonsVal2 = widgetOrderDoneButtonBarBinding.buttonsVal;
        Intrinsics.checkNotNullExpressionValue(buttonsVal2, "buttonsVal");
        buttonsVal2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pay(AtomAction.Click action) {
        CreateAndPayViewModel createAndPayViewModel = this.createAndPayViewModel;
        String link = action.getLink();
        if (link == null) {
            return;
        }
        Map<String, String> params = action.getParams();
        if (params == null) {
            params = U.c();
        }
        createAndPayViewModel.pay(link, U.n(params, new Pair("deviceId", this.applicationInfoDataSource.getUniqueApplicationId())), getTrackingData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(ComposerActionWithActionDTO.MessageDTO message) {
        Pair pair;
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().a());
        if (rootView == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            pair = new Pair(null, null);
        } else if (i11 == 2) {
            pair = new Pair(Integer.valueOf(R$drawable.ic_check_green), UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken());
        } else {
            if (i11 != 3) {
                throw new o();
            }
            pair = new Pair(Integer.valueOf(R$drawable.ic_warning), UniColors.GRAPHIC_WARNING_PRIMARY.getToken());
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message.getMessage()), null, null, (Integer) pair.a(), null, (String) pair.b(), null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 57178, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO data) {
        if (data == null) {
            return;
        }
        ViewGroup b11 = C2971a.b(this.refs);
        if (b11 == null) {
            r a11 = this.refs.getContainer().a();
            b11 = a11 != null ? ContextExtKt.getRootView(a11) : null;
            if (b11 == null) {
                return;
            }
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(b11, NotificationBarKt.isAboveBottomWidgets(data));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(b11, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, data, this.refs.getContainer().g(), new OrderDoneButtonBarWidgetViewHolder$showNotification$1(this.actionHandler)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRestriction(Restriction message) {
        ViewGroup rootView;
        if (message == null || (rootView = ContextExtKt.getRootView(this.refs.getContainer().a())) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(message), this.refs.getContainer().g(), null, null, null, null, null, 248, null);
    }

    private final void updatePaddings(ConstraintLayout constraintLayout, OrderDoneButtonBarVO.PaddingVO paddingVO) {
        d b11 = e.b(constraintLayout);
        b11.e0(R$id.badgeV, 6, paddingVO.getLeft());
        b11.e0(R$id.buttonsHal, 6, paddingVO.getLeft());
        b11.e0(R$id.buttonsHal, 7, paddingVO.getRight());
        b11.e0(R$id.buttonsVal, 6, paddingVO.getLeft());
        b11.e0(R$id.buttonsVal, 7, paddingVO.getRight());
        b11.e0(R$id.subtitleTav, 6, paddingVO.getLeft());
        b11.e0(R$id.subtitleTav, 7, paddingVO.getRight());
        b11.e0(R$id.buttonsHal, 3, paddingVO.getTop());
        b11.Z(R$id.buttonsHal, 4, paddingVO.getBottom());
        b11.e0(R$id.buttonsVal, 3, paddingVO.getTop());
        b11.Z(R$id.buttonsVal, 4, paddingVO.getBottom());
        b11.e0(R$id.subtitleTav, 4, paddingVO.getBottom());
        b11.f(constraintLayout);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getActions().observe(lifecycle, new OrderDoneButtonBarWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new OrderDoneButtonBarWidgetViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDoneButtonBarVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderDoneButtonBarBinding widgetOrderDoneButtonBarBinding = this.binding;
        BadgeView badgeV = widgetOrderDoneButtonBarBinding.badgeV;
        Intrinsics.checkNotNullExpressionValue(badgeV, "badgeV");
        BadgeHolderKt.bindOrGone(badgeV, item.getBadge(), this.actionHandler);
        bindButtons(item);
        TextAtomV2View subtitleTav = widgetOrderDoneButtonBarBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bindOrGone(subtitleTav, item.getSubtitle(), this.actionHandler);
        ConstraintLayout constraintLayout = widgetOrderDoneButtonBarBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        updatePaddings(constraintLayout, item.getPadding());
    }
}

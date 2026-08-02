package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter;

import Vg.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.List;
import jk0.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.OrderVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.PaymentVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.ProductVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.SectionVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.StatusProviderVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.TimerVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.holders.AnnotationAtom;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.ItemOrderListSectionBinding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.uikit.view.recycler.UntouchableRecyclerView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.app.android.utils.timer.OneSecondTimer;
import ru.ozon.app.android.utils.timer.TimerManager;
import ru.ozon.app.android.utils.timer.TimerTick;
import ru.ozon.app.android.utils.timer.TimerUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u001c\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020!0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter;", "Ljk0/d;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter$ItemViewHolder;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;", "decoration", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;", "parentVH", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customHandlers", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;LVg/c;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter$ItemViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter$ItemViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/SectionVO;", "list", "setItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "LVg/c;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "", "items", "Ljava/util/List;", "ItemViewHolder", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionsAdapter extends d<ItemViewHolder> {
    private final c customHandlers;

    @NotNull
    private final OrderListItemDecoration decoration;

    @NotNull
    private final List<SectionVO> items;

    @NotNull
    private final k<OrderVO> parentVH;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final StartupArgsService startupArgsService;

    @NotNull
    private final CreateAndPayViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010\u001fJ%\u0010(\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u001c\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0017008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/SectionsAdapter$ItemViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/SectionVO;", "Lru/ozon/app/android/cs_orders/databinding/ItemOrderListSectionBinding;", "binding", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;", "decoration", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/OrderVO;", "parentVH", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customHandlers", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/ItemOrderListSectionBinding;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/OrderListItemDecoration;Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;LVg/c;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;)V", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;", "statusProvider", "", "bindStatusProvider", "(Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;)V", "", "timeLeft", "onTimerTick", "(J)V", "onTimerComplete", "()V", "startTimer", "stopTimer", "onAttach", "onDetach", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/SectionVO;Ljava/util/List;)V", "Lru/ozon/app/android/cs_orders/databinding/ItemOrderListSectionBinding;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "LVg/c;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;", "paymentInfo", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/ItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewHolder/adapter/ItemsAdapter;", "Lru/ozon/app/android/utils/timer/TimerManager;", "timerManager", "Lru/ozon/app/android/utils/timer/TimerManager;", "Lorg/joda/time/DateTime;", "endTime", "Lorg/joda/time/DateTime;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemViewHolder extends BaseViewHolder<SectionVO> {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final AtomsAdapter atomsAdapter;

        @NotNull
        private final ItemOrderListSectionBinding binding;

        @NotNull
        private final AtomsAdapter buttonsAdapter;

        @NotNull
        private final CreateAndPayViewModel createAndPayViewModel;
        private final c customHandlers;
        private DateTime endTime;

        @NotNull
        private final ItemsAdapter itemsAdapter;

        @NotNull
        private final k<OrderVO> parentVH;
        private PaymentVO paymentInfo;

        @NotNull
        private final ComposerReferences ref;

        @NotNull
        private final StartupArgsService startupArgsService;

        @NotNull
        private final TimerManager timerManager;
        public static final int $stable = 8;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ItemViewHolder(@NotNull ItemOrderListSectionBinding binding, @NotNull OrderListItemDecoration decoration, @NotNull CreateAndPayViewModel createAndPayViewModel, @NotNull ComposerReferences ref, @NotNull k<OrderVO> parentVH, c cVar, @NotNull StartupArgsService startupArgsService) {
            super(r7);
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(decoration, "decoration");
            Intrinsics.checkNotNullParameter(createAndPayViewModel, "createAndPayViewModel");
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(parentVH, "parentVH");
            Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
            ConstraintLayout constraintLayout = binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.binding = binding;
            this.createAndPayViewModel = createAndPayViewModel;
            this.ref = ref;
            this.parentVH = parentVH;
            this.customHandlers = cVar;
            this.startupArgsService = startupArgsService;
            Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, parentVH).buildHandler();
            this.actionHandler = buildHandler;
            AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(CommonText.TextSmall.class, null, 2, null), new TextAtom.Configuration(0, 0, 12, 0, R$style.TextStyle_Body_M, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524267, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 12, 0, R$style.TextStyle_Body, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 524267, null)), new Pair(new Atom.ConfCondition(Annotation.class, null, 2, null), new AnnotationAtom.Configuration(0, 0, 12, 0, 0, null, 0, null, null, 505, null))), null, null, null, 14, null);
            this.atomsAdapter = atomsAdapter;
            AtomsAdapter atomsAdapter2 = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(CommonButton.ButtonBorderless.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 0, 0, true, 0, new ButtonBaseAtom.InnerPaddings(0, 0, 12, 0, 11, null), 12, null))), null, null, null, 14, null);
            atomsAdapter2.setOnAction(new ActionHandler.Builder(ref, parentVH).customActionHandlers(new SectionsAdapter$ItemViewHolder$buttonsAdapter$1$1(this)).onClick(new SectionsAdapter$ItemViewHolder$buttonsAdapter$1$2(this)).buildHandler());
            this.buttonsAdapter = atomsAdapter2;
            ItemsAdapter itemsAdapter = new ItemsAdapter(ref);
            this.itemsAdapter = itemsAdapter;
            this.timerManager = new OneSecondTimer.Builder().scopeIn(K.a(this)).onTick(new SectionsAdapter$ItemViewHolder$timerManager$1(this)).onComplete(new SectionsAdapter$ItemViewHolder$timerManager$2(this)).build();
            atomsAdapter.setOnAction(buildHandler);
            binding.communicationsVAL.setAdapter(atomsAdapter);
            binding.buttonsHFAL.setAdapter(atomsAdapter2);
            binding.orderItemsRv.setAdapter(itemsAdapter);
            binding.orderItemsRv.addItemDecoration(decoration);
        }

        private final void bindStatusProvider(StatusProviderVO statusProvider) {
            String image;
            final ItemOrderListSectionBinding itemOrderListSectionBinding = this.binding;
            Group statusDeliveryContainer = itemOrderListSectionBinding.statusDeliveryContainer;
            Intrinsics.checkNotNullExpressionValue(statusDeliveryContainer, "statusDeliveryContainer");
            ViewExtKt.showOrGone(statusDeliveryContainer, Boolean.valueOf(statusProvider != null));
            if (statusProvider == null || (image = statusProvider.getImage()) == null) {
                AppCompatImageView deliveryIconIv = itemOrderListSectionBinding.deliveryIconIv;
                Intrinsics.checkNotNullExpressionValue(deliveryIconIv, "deliveryIconIv");
                ViewExtKt.gone(deliveryIconIv);
            } else {
                AppCompatImageView deliveryIconIv2 = itemOrderListSectionBinding.deliveryIconIv;
                Intrinsics.checkNotNullExpressionValue(deliveryIconIv2, "deliveryIconIv");
                ImageViewExtKt.load$default(deliveryIconIv2, image, null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.SectionsAdapter$ItemViewHolder$bindStatusProvider$1$1$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception e11) {
                        AppCompatImageView deliveryIconIv3 = ItemOrderListSectionBinding.this.deliveryIconIv;
                        Intrinsics.checkNotNullExpressionValue(deliveryIconIv3, "deliveryIconIv");
                        ViewExtKt.gone(deliveryIconIv3);
                        Lm0.a.f17149a.e(e11);
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Drawable resource) {
                        if (resource == null) {
                            AppCompatImageView deliveryIconIv3 = ItemOrderListSectionBinding.this.deliveryIconIv;
                            Intrinsics.checkNotNullExpressionValue(deliveryIconIv3, "deliveryIconIv");
                            ViewExtKt.gone(deliveryIconIv3);
                        } else {
                            ItemOrderListSectionBinding.this.deliveryIconIv.setImageDrawable(resource);
                            AppCompatImageView deliveryIconIv4 = ItemOrderListSectionBinding.this.deliveryIconIv;
                            Intrinsics.checkNotNullExpressionValue(deliveryIconIv4, "deliveryIconIv");
                            ViewExtKt.show(deliveryIconIv4);
                        }
                    }
                }, null, null, false, null, 122, null);
            }
            if (statusProvider != null) {
                itemOrderListSectionBinding.titleDeliveryTv.setText(statusProvider.getTitle());
                itemOrderListSectionBinding.deliveryNameTv.setText(statusProvider.getDeliveryName());
                BadgeView statusDeliveryBadge = itemOrderListSectionBinding.statusDeliveryBadge;
                Intrinsics.checkNotNullExpressionValue(statusDeliveryBadge, "statusDeliveryBadge");
                BadgeHolderKt.bind(statusDeliveryBadge, statusProvider.getStatus(), this.actionHandler);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onTimerComplete() {
            InterfaceC7851b.a.a(this.ref.getController(), null, null, null, null, 15);
            this.endTime = null;
            stopTimer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onTimerTick(long timeLeft) {
            TextView timerTv = this.binding.timerTv;
            Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
            TextViewExtKt.setTextOrGone(timerTv, TimerUtilsKt.formatTime(new TimerTick(timeLeft)));
            TextView timerTitleTv = this.binding.timerTitleTv;
            Intrinsics.checkNotNullExpressionValue(timerTitleTv, "timerTitleTv");
            ViewExtKt.show(timerTitleTv);
            if (this.startupArgsService.getArgValue("STATIC_TIMERS")) {
                stopTimer();
            }
        }

        private final void startTimer() {
            DateTime dateTime = this.endTime;
            if (dateTime != null) {
                this.timerManager.startTimer(dateTime.getMillis());
            }
        }

        private final void stopTimer() {
            this.timerManager.stopTimer();
        }

        @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
        public /* bridge */ /* synthetic */ void bind(SectionVO sectionVO, List list) {
            bind2(sectionVO, (List<? extends Object>) list);
        }

        @Override // jk0.j
        public void onAttach() {
            super.onAttach();
            startTimer();
        }

        @Override // jk0.j
        public void onDetach() {
            super.onDetach();
            stopTimer();
        }

        /* renamed from: bind, reason: avoid collision after fix types in other method */
        public void bind2(@NotNull SectionVO item, @NotNull List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            ItemOrderListSectionBinding itemOrderListSectionBinding = this.binding;
            this.paymentInfo = item.getPaymentInfo();
            TextView communicationTitleTv = itemOrderListSectionBinding.communicationTitleTv;
            Intrinsics.checkNotNullExpressionValue(communicationTitleTv, "communicationTitleTv");
            TextViewExtKt.setTextOrGone(communicationTitleTv, item.getTitle());
            TextAtomV2View deliveryInfoTv = itemOrderListSectionBinding.deliveryInfoTv;
            Intrinsics.checkNotNullExpressionValue(deliveryInfoTv, "deliveryInfoTv");
            TextHolderKt.bindOrGone(deliveryInfoTv, item.getDeliveryInfo(), this.actionHandler);
            Badge status = item.getStatus();
            if (status != null) {
                BadgeView statusContainer = itemOrderListSectionBinding.statusContainer;
                Intrinsics.checkNotNullExpressionValue(statusContainer, "statusContainer");
                ViewExtKt.show(statusContainer);
                BadgeView statusContainer2 = itemOrderListSectionBinding.statusContainer;
                Intrinsics.checkNotNullExpressionValue(statusContainer2, "statusContainer");
                BadgeHolderKt.bind(statusContainer2, status, this.actionHandler);
            } else {
                BadgeView statusContainer3 = itemOrderListSectionBinding.statusContainer;
                Intrinsics.checkNotNullExpressionValue(statusContainer3, "statusContainer");
                ViewExtKt.gone(statusContainer3);
            }
            List<AtomDTO> description = item.getDescription();
            if (description != null) {
                VerticalAtomsLayout communicationsVAL = itemOrderListSectionBinding.communicationsVAL;
                Intrinsics.checkNotNullExpressionValue(communicationsVAL, "communicationsVAL");
                ViewExtKt.show(communicationsVAL);
                AtomsAdapter atomsAdapter = this.atomsAdapter;
                Context context = itemOrderListSectionBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                atomsAdapter.bind(context, description);
            } else {
                VerticalAtomsLayout communicationsVAL2 = itemOrderListSectionBinding.communicationsVAL;
                Intrinsics.checkNotNullExpressionValue(communicationsVAL2, "communicationsVAL");
                ViewExtKt.gone(communicationsVAL2);
            }
            List<AtomDTO> buttons = item.getButtons();
            if (buttons != null) {
                HorizontalFlexAtomsLayout buttonsHFAL = itemOrderListSectionBinding.buttonsHFAL;
                Intrinsics.checkNotNullExpressionValue(buttonsHFAL, "buttonsHFAL");
                ViewExtKt.show(buttonsHFAL);
                AtomsAdapter atomsAdapter2 = this.buttonsAdapter;
                Context context2 = itemOrderListSectionBinding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                atomsAdapter2.bind(context2, buttons);
            } else {
                HorizontalFlexAtomsLayout buttonsHFAL2 = itemOrderListSectionBinding.buttonsHFAL;
                Intrinsics.checkNotNullExpressionValue(buttonsHFAL2, "buttonsHFAL");
                ViewExtKt.gone(buttonsHFAL2);
            }
            List<ProductVO> products = item.getProducts();
            if (products != null) {
                UntouchableRecyclerView orderItemsRv = itemOrderListSectionBinding.orderItemsRv;
                Intrinsics.checkNotNullExpressionValue(orderItemsRv, "orderItemsRv");
                ViewExtKt.show(orderItemsRv);
                this.itemsAdapter.setItems(products);
            } else {
                UntouchableRecyclerView orderItemsRv2 = itemOrderListSectionBinding.orderItemsRv;
                Intrinsics.checkNotNullExpressionValue(orderItemsRv2, "orderItemsRv");
                ViewExtKt.gone(orderItemsRv2);
            }
            TextView timerTitleTv = itemOrderListSectionBinding.timerTitleTv;
            Intrinsics.checkNotNullExpressionValue(timerTitleTv, "timerTitleTv");
            TimerVO timer = item.getTimer();
            TextViewExtKt.setTextOrGone(timerTitleTv, timer != null ? timer.getTitle() : null);
            TextView timerTv = itemOrderListSectionBinding.timerTv;
            Intrinsics.checkNotNullExpressionValue(timerTv, "timerTv");
            ViewExtKt.showOrGone(timerTv, Boolean.valueOf(item.getShowTimer()));
            TimerVO timer2 = item.getTimer();
            this.endTime = timer2 != null ? timer2.getEndTime() : null;
            startTimer();
            bindStatusProvider(item.getStatusProvider());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionsAdapter(@NotNull OrderListItemDecoration decoration, @NotNull CreateAndPayViewModel viewModel, @NotNull ComposerReferences ref, @NotNull k<OrderVO> parentVH, c cVar, @NotNull StartupArgsService startupArgsService) {
        super(parentVH, null, 2, null);
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(parentVH, "parentVH");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        this.decoration = decoration;
        this.viewModel = viewModel;
        this.ref = ref;
        this.parentVH = parentVH;
        this.customHandlers = cVar;
        this.startupArgsService = startupArgsService;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<SectionVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind2(this.items.get(position), (List<? extends Object>) kotlin.collections.K.f71697a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemOrderListSectionBinding inflate = ItemOrderListSectionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new ItemViewHolder(inflate, this.decoration, this.viewModel, this.ref, this.parentVH, this.customHandlers, this.startupArgsService);
    }
}

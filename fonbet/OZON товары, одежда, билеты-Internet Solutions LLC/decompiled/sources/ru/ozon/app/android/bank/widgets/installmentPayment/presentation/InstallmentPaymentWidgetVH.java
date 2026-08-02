package ru.ozon.app.android.bank.widgets.installmentPayment.presentation;

import Dc0.n;
import LB.a;
import W10.c;
import WZ.t;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.bank.databinding.WidgetInstallmentPaymentBinding;
import ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonWithIconView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonWithIconHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00011B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00110-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;)V", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentItemsAdapter;", "adapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "paymentsSwitch", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "", "setPaymentsList", "(Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentItemsAdapter;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "isGraceSwitch", "updatePaymentsList", "(Z)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentBinding;", "binding", "Lru/ozon/app/android/bank/databinding/WidgetInstallmentPaymentBinding;", "paymentsGraceAdapter", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/PaymentItemsAdapter;", "paymentsAdapter", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentPaymentWidgetVH extends k<InstallmentPaymentVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static int SPACE_ITEM = ResourceExtKt.toPx(4);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetInstallmentPaymentBinding binding;

    @NotNull
    private final PaymentItemsAdapter paymentsAdapter;

    @NotNull
    private final PaymentItemsAdapter paymentsGraceAdapter;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentWidgetVH$Companion;", "", "<init>", "()V", "SPACE_ITEM", "", "SPAN_COUNT_4", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentPaymentWidgetVH(@NotNull ComposerReferences ref, @NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.ref = ref;
        WidgetInstallmentPaymentBinding bind = WidgetInstallmentPaymentBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.paymentsGraceAdapter = new PaymentItemsAdapter(this);
        PaymentItemsAdapter paymentItemsAdapter = new PaymentItemsAdapter(this);
        this.paymentsAdapter = paymentItemsAdapter;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        RecyclerView recyclerView = bind.paymentsRv;
        recyclerView.setAdapter(paymentItemsAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4, 1));
        recyclerView.addItemDecoration(new RecyclerView.n() { // from class: ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentWidgetVH$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
                int i11;
                int i12;
                int i13;
                int i14;
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i11 = InstallmentPaymentWidgetVH.SPACE_ITEM;
                    outRect.left = i11;
                    i12 = InstallmentPaymentWidgetVH.SPACE_ITEM;
                    outRect.right = i12;
                    i13 = InstallmentPaymentWidgetVH.SPACE_ITEM;
                    outRect.bottom = i13;
                    i14 = InstallmentPaymentWidgetVH.SPACE_ITEM;
                    outRect.top = i14;
                }
            }
        });
        bind.iconIv.setOnClickListener(new n(this, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(InstallmentPaymentWidgetVH installmentPaymentWidgetVH, View view) {
        InstallmentPaymentVO.IconTitleVO iconTitle;
        AtomAction action;
        InstallmentPaymentVO boundedData = installmentPaymentWidgetVH.getBoundedData();
        if (boundedData == null || (iconTitle = boundedData.getIconTitle()) == null || (action = iconTitle.getAction()) == null) {
            return;
        }
        installmentPaymentWidgetVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(I i11, InstallmentPaymentWidgetVH installmentPaymentWidgetVH, View view) {
        boolean z11 = !i11.f71783a;
        i11.f71783a = z11;
        installmentPaymentWidgetVH.updatePaymentsList(z11);
    }

    private final void setPaymentsList(PaymentItemsAdapter adapter, ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsSwitch, TextAtom title, TextAtom subTitle) {
        if (paymentsSwitch != null) {
            SmallBorderlessButtonWithIconView paymentsSwitch2 = this.binding.paymentsSwitch;
            Intrinsics.checkNotNullExpressionValue(paymentsSwitch2, "paymentsSwitch");
            WrappedBorderlessButtonWithIconHolderKt.bind$default(paymentsSwitch2, paymentsSwitch, null, 2, null);
        }
        if (title != null) {
            TextAtomView titleTv = this.binding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            TextAtomHolderKt.bind$default(titleTv, title, null, 2, null);
        }
        if (subTitle != null) {
            TextAtomView subTitleTv = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
            TextAtomHolderKt.bind$default(subTitleTv, subTitle, null, 2, null);
        }
        this.binding.paymentsRv.swapAdapter(adapter, false);
    }

    private final void updatePaymentsList(boolean isGraceSwitch) {
        if (isGraceSwitch) {
            PaymentItemsAdapter paymentItemsAdapter = this.paymentsGraceAdapter;
            InstallmentPaymentVO boundedData = getBoundedData();
            ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsGraceSwitch = boundedData != null ? boundedData.getPaymentsGraceSwitch() : null;
            InstallmentPaymentVO boundedData2 = getBoundedData();
            TextAtom titleGrace = boundedData2 != null ? boundedData2.getTitleGrace() : null;
            InstallmentPaymentVO boundedData3 = getBoundedData();
            setPaymentsList(paymentItemsAdapter, paymentsGraceSwitch, titleGrace, boundedData3 != null ? boundedData3.getSubTitleGrace() : null);
            return;
        }
        PaymentItemsAdapter paymentItemsAdapter2 = this.paymentsAdapter;
        InstallmentPaymentVO boundedData4 = getBoundedData();
        ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsSwitch = boundedData4 != null ? boundedData4.getPaymentsSwitch() : null;
        InstallmentPaymentVO boundedData5 = getBoundedData();
        TextAtom title = boundedData5 != null ? boundedData5.getTitle() : null;
        InstallmentPaymentVO boundedData6 = getBoundedData();
        setPaymentsList(paymentItemsAdapter2, paymentsSwitch, title, boundedData6 != null ? boundedData6.getSubTitle() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InstallmentPaymentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtom title = item.getTitle();
        if (title != null) {
            TextAtomView titleTv = this.binding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            TextAtomHolderKt.bind$default(titleTv, title, null, 2, null);
        }
        if (item.getSubTitle() == null || item.getSubTitle().getText().length() <= 0) {
            TextAtomView subTitleTv = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
            ViewExtKt.gone(subTitleTv);
        } else {
            TextAtomView subTitleTv2 = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv2, "subTitleTv");
            ViewExtKt.show(subTitleTv2);
            TextAtomView subTitleTv3 = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv3, "subTitleTv");
            TextAtomHolderKt.bind$default(subTitleTv3, item.getSubTitle(), null, 2, null);
        }
        this.paymentsAdapter.submitList(item.getPayments());
        this.paymentsGraceAdapter.submitList(item.getPaymentsGrace());
        ImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        InstallmentPaymentVO.IconTitleVO iconTitle = item.getIconTitle();
        ImageViewExtKt.loadImageOrGone(iconIv, iconTitle != null ? iconTitle.getIcon() : null);
        SmallBorderlessButtonWithIconView paymentsSwitch = this.binding.paymentsSwitch;
        Intrinsics.checkNotNullExpressionValue(paymentsSwitch, "paymentsSwitch");
        WrappedBorderlessButtonWithIconHolderKt.bindOrGone$default(paymentsSwitch, item.getPaymentsSwitch(), null, 2, null);
        this.binding.paymentsSwitch.setGravity(16);
        this.binding.paymentsSwitch.setOnClickListener(new a(7, new I(), this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InstallmentPaymentVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}

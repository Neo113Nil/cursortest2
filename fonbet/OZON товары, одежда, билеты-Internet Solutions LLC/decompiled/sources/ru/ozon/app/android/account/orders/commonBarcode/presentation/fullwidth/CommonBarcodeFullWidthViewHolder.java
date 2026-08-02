package ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth;

import Ck.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.CommonBarcodeVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetCommonBarcodeFullWidthBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetCommonBarcodeFullWidthBinding;", "binding", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetCommonBarcodeFullWidthBinding;Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "subtitle", "", "subtitleStyle", "", "setSubtitle", "(Ljava/lang/String;I)V", "code", "setBarcode", "(Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetCommonBarcodeFullWidthBinding;", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeFullWidthViewHolder extends k<CommonBarcodeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCommonBarcodeFullWidthBinding binding;

    @NotNull
    private final CommonBarcodeFullWidthViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int HORIZONTAL_LIGHT_MARGINS = ResourceExtKt.toPx(16);
    private static final int HORIZONTAL_DARK_MARGINS = ResourceExtKt.toPx(30);
    private static final int VERTICAL_MARGINS = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewHolder$Companion;", "", "<init>", "()V", "HORIZONTAL_LIGHT_MARGINS", "", "getHORIZONTAL_LIGHT_MARGINS", "()I", "HORIZONTAL_DARK_MARGINS", "getHORIZONTAL_DARK_MARGINS", "VERTICAL_MARGINS", "getVERTICAL_MARGINS", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getHORIZONTAL_DARK_MARGINS() {
            return CommonBarcodeFullWidthViewHolder.HORIZONTAL_DARK_MARGINS;
        }

        public final int getHORIZONTAL_LIGHT_MARGINS() {
            return CommonBarcodeFullWidthViewHolder.HORIZONTAL_LIGHT_MARGINS;
        }

        public final int getVERTICAL_MARGINS() {
            return CommonBarcodeFullWidthViewHolder.VERTICAL_MARGINS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommonBarcodeFullWidthViewHolder(@NotNull WidgetCommonBarcodeFullWidthBinding binding, @NotNull CommonBarcodeFullWidthViewModel viewModel, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        binding.getConstraintLayout().setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CommonBarcodeFullWidthViewHolder commonBarcodeFullWidthViewHolder, View view) {
        AtomAction action;
        CommonBarcodeVO boundData = commonBarcodeFullWidthViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        commonBarcodeFullWidthViewHolder.actionHandler.invoke(action);
    }

    private final void setBarcode(String code) {
        C10727i.c(K.a(this), null, null, new CommonBarcodeFullWidthViewHolder$setBarcode$1(this, code, null), 3);
    }

    private final void setSubtitle(String subtitle, int subtitleStyle) {
        AppCompatTextView appCompatTextView = this.binding.codeTv;
        appCompatTextView.setText(subtitle);
        appCompatTextView.setTextAppearance(subtitleStyle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CommonBarcodeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCommonBarcodeFullWidthBinding widgetCommonBarcodeFullWidthBinding = this.binding;
        widgetCommonBarcodeFullWidthBinding.titleTv.setText(item.getTitle());
        setSubtitle(item.getSubtitle(), item.getSubtitleTextStyle());
        TextAtomView descriptionTav = widgetCommonBarcodeFullWidthBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
        TextAtomHolderKt.bindOrGone(descriptionTav, item.getDescription(), this.actionHandler);
        setBarcode(item.getCode());
    }
}

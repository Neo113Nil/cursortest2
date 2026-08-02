package ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation.TotalExpandedVO;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListView;", "cellList", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListView;", "getCellList", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalExpandedView extends LinearLayout {

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final CheckoutCellListView cellList;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_40 = UiExtKt.toPx(40);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedView$Companion;", "", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TotalExpandedView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull TotalExpandedVO dto, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextAtomV2View textAtomV2View = this.titleView;
        TotalExpandedVO.HeaderVO header = dto.getSummary().getHeader();
        TextHolderKt.bindOrGone$default(textAtomV2View, header != null ? header.getTitle() : null, null, 2, null);
        this.cellList.bindOrGone(dto.getSummary().getTotalItems(), onAction);
        ButtonV3HolderKt.bind(this.buttonView, dto.getButton(), onAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalExpandedView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(DP_40);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setId(View.generateViewId());
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        CheckoutCellListView checkoutCellListView = new CheckoutCellListView(context, null, 0, false, 6, null);
        checkoutCellListView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        checkoutCellListView.setId(View.generateViewId());
        addView(checkoutCellListView);
        this.cellList = checkoutCellListView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        buttonV3View.setId(View.generateViewId());
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        setOrientation(1);
        int i12 = DP_16;
        setPadding(i12, 0, i12, i12);
    }
}

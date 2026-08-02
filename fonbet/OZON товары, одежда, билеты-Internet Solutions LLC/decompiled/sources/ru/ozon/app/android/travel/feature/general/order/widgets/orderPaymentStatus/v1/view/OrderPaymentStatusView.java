package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation.OrderPaymentStatusVO;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c0 J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/view/OrderPaymentStatusView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp16", "", "dp8", "regex", "Lkotlin/text/Regex;", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "price", "Lru/ozon/uni/android/atom/badge/BadgeView;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsHal", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "iconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "titleText", "", "bind", "", "vo", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateTimerTitle", "leftTime", "", "bindTimer", "dto", "Lru/ozon/uni/atoms/data/text/TextDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderPaymentStatusView extends ConstraintLayout {

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final HorizontalAtomsLayout buttonsHal;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final IconButtonV3View iconButton;

    @NotNull
    private final BadgeView price;

    @NotNull
    private final Regex regex;

    @NotNull
    private final StringBuilder stringBuilder;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private CharSequence titleText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPaymentStatusView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        this.regex = new Regex("\\$placeholder");
        this.stringBuilder = new StringBuilder();
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41640k = R$id.orderPaymentStatusSubtitleTav;
        bVar.f41657u = R$id.orderPaymentStatusPriceBv;
        bVar.f41616W = true;
        bVar.f41598E = 0.0f;
        bVar.setMarginEnd(px);
        bVar.f41595B = 0;
        bVar.f41604K = 2;
        textAtomV2View.setLayoutParams(bVar);
        textAtomV2View.setId(R$id.orderPaymentStatusTitleTav);
        textAtomV2View.setTextIsSelectable(false);
        addView(g10);
        this.title = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41656t = 0;
        bVar2.f41638j = R$id.orderPaymentStatusTitleTav;
        bVar2.f41657u = R$id.orderPaymentStatusPriceBv;
        bVar2.f41640k = R$id.orderPaymentStatusButtonsHal;
        bVar2.f41616W = true;
        bVar2.f41598E = 0.0f;
        bVar2.setMarginEnd(px);
        bVar2.f41595B = 0;
        textAtomV2View2.setLayoutParams(bVar2);
        textAtomV2View2.setId(R$id.orderPaymentStatusSubtitleTav);
        textAtomV2View2.setTextIsSelectable(false);
        addView(g11);
        this.subtitle = textAtomV2View2;
        View g12 = qVar.g(N.b(BadgeView.class), context);
        BadgeView badgeView = (BadgeView) g12;
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        bVar3.f41658v = 0;
        badgeView.setLayoutParams(bVar3);
        badgeView.setId(R$id.orderPaymentStatusPriceBv);
        addView(g12);
        this.price = badgeView;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41656t = 0;
        bVar4.f41638j = R$id.orderPaymentStatusSubtitleTav;
        bVar4.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar4).topMargin = ResourceExtKt.toPx(12, context);
        horizontalAtomsLayout.setLayoutParams(bVar4);
        horizontalAtomsLayout.setId(R$id.orderPaymentStatusButtonsHal);
        addView(horizontalAtomsLayout);
        this.buttonsHal = horizontalAtomsLayout;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context);
        iconButtonV3View = iconButtonV3View == null ? new IconButtonV3View(context, null, 0, 0, 14, null) : iconButtonV3View;
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        int i11 = R$id.orderPaymentStatusSubtitleTav;
        bVar5.f41636i = i11;
        bVar5.f41642l = i11;
        bVar5.f41655s = i11;
        bVar5.f41658v = 0;
        bVar5.f41598E = 0.0f;
        iconButtonV3View.setLayoutParams(bVar5);
        iconButtonV3View.setId(R$id.orderPaymentStatusInfoIbv);
        addView(iconButtonV3View);
        this.iconButton = iconButtonV3View;
        this.titleText = "";
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        horizontalAtomsLayout.setDecorator(new ButtonsHorizontalDecorator(context, px2));
    }

    private final void bindTimer(TextDTO dto) {
        this.titleText = dto.getText();
        TextHolderKt.bind$default(this.title, TextDTO.copy$default(dto, OzonSpannableStringKt.toOzonSpannableString(this.regex.replace(dto.getText(), "")), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, 2, null);
    }

    public final void bind(@NotNull OrderPaymentStatusVO vo, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        bindTimer(vo.getTitle());
        TextHolderKt.bindOrGone$default(this.subtitle, vo.getSubtitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.price, vo.getPrice(), onAction);
        this.buttonsHal.setVisibility(!vo.getButtons().isEmpty() ? 0 : 8);
        this.buttonsAdapter.setOnAction(onAction);
        AtomsAdapter atomsAdapter = this.buttonsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, vo.getButtons());
        IconButtonV3HolderKt.bindOrGone(this.iconButton, vo.getInfoButton(), onAction);
        OrderPaymentStatusVO.WidgetPaddings paddings = vo.getPaddings();
        if (paddings != null) {
            setPadding(paddings.getLeft(), paddings.getTop(), paddings.getRight(), paddings.getBottom());
        } else {
            int i11 = this.dp16;
            setPadding(i11, 0, i11, 0);
        }
    }

    public final void updateTimerTitle(long leftTime) {
        TextAtomV2View textAtomV2View = this.title;
        StringBuilder sb2 = this.stringBuilder;
        h.s(sb2);
        sb2.append(this.titleText);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        textAtomV2View.setText(this.regex.replace(sb2, DateExtensionsKt.toFormattedTime(leftTime)));
    }
}

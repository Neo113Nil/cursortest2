package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.view;

import Bi.b;
import Il.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import fd.InterfaceC6511n;
import gk0.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter.UnpaidOrderAtomsDecoration;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJE\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102.\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R@\u0010)\u001a,\u0012\u0004\u0012\u00020\u0013\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00103R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/view/UnpaidOrderListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "addViews", "()V", "setConstraints", "setupRoot", "setupViews", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "item", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cardClickCallback", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;Lfd/n;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "bindBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "dp1", "I", "dp2", "dp8", "dp10", "dp16", "", "dpf20", "F", "boundedData", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "onClickCallback", "Lfd/n;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "iconsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "datesTAV", "priceBadgeBV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "firstPriceV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "secondPriceV", "Landroidx/constraintlayout/widget/Barrier;", "barrierBV", "Landroidx/constraintlayout/widget/Barrier;", "Landroid/view/View;", "separatorV", "Landroid/view/View;", "detailTAV", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "iconsHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeBV;

    @NotNull
    private final Barrier barrierBV;
    private UnpaidOrderListVO.OrderVO boundedData;

    @NotNull
    private final TextAtomV2View datesTAV;

    @NotNull
    private final TextAtomV2View detailTAV;
    private final int dp1;
    private final int dp10;
    private final int dp16;
    private final int dp2;
    private final int dp8;
    private final float dpf20;

    @NotNull
    private final PriceAtomView firstPriceV;

    @NotNull
    private final AtomsAdapter iconsAdapter;

    @NotNull
    private final HorizontalAtomsLayout iconsHAL;
    private InterfaceC6511n<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> onClickCallback;

    @NotNull
    private final BadgeView priceBadgeBV;

    @NotNull
    private final PriceAtomView secondPriceV;

    @NotNull
    private final View separatorV;

    @NotNull
    private final TextAtomV2View titleTAV;

    public /* synthetic */ UnpaidOrderListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.badgeBV);
        addView(this.titleTAV);
        addView(this.datesTAV);
        addView(this.priceBadgeBV);
        addView(this.barrierBV);
        addView(this.firstPriceV);
        addView(this.secondPriceV);
        addView(this.separatorV);
        addView(this.detailTAV);
        addView(this.iconsHAL);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new UnpaidOrderListView$setConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
        setClickable(true);
        setClipToOutline(true);
        setOnClickListener(new a(this, 2));
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackground(roundedBackgroundProducer.produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), this.dpf20));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context2, R$attr.bgActionSecondary), this.dpf20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRoot$lambda$16(UnpaidOrderListView unpaidOrderListView, View view) {
        InterfaceC6511n<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> interfaceC6511n;
        UnpaidOrderListVO.OrderVO orderVO = unpaidOrderListView.boundedData;
        if (orderVO == null || (interfaceC6511n = unpaidOrderListView.onClickCallback) == null) {
            return;
        }
        interfaceC6511n.invoke(orderVO.getClickAction(), orderVO.getClickTracking(), orderVO.getFormattedRemainTime());
    }

    private final void setupViews() {
        this.iconsHAL.setAdapter(this.iconsAdapter);
        HorizontalAtomsLayout horizontalAtomsLayout = this.iconsHAL;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new UnpaidOrderAtomsDecoration(context));
    }

    public final void bind(@NotNull UnpaidOrderListVO.OrderVO item, @NotNull InterfaceC6511n<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> cardClickCallback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(cardClickCallback, "cardClickCallback");
        this.boundedData = item;
        this.onClickCallback = cardClickCallback;
        BadgeHolderKt.bind$default(this.badgeBV, item.getBadge(), (Function1) null, 2, (Object) null);
        TextHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.datesTAV, item.getDates(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.priceBadgeBV, item.getPriceBadge(), (Function1) null, 2, (Object) null);
        PriceAtomHolderKt.bindOrGone$default(this.firstPriceV, item.getFirstPrice(), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(this.secondPriceV, item.getSecondPrice(), null, 2, null);
        TextHolderKt.bind$default(this.detailTAV, item.getDetail(), null, 2, null);
        AtomsAdapter atomsAdapter = this.iconsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getRouteIcons());
    }

    public final void bindBadge(@NotNull BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        BadgeHolderKt.bind$default(this.badgeBV, badge, (Function1) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnpaidOrderListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        PriceAtomView priceAtomView;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp10 = ResourceExtKt.toPx(10, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dpf20 = ResourceExtKt.toPxF(20, context);
        this.iconsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        q qVar = q.f64554a;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        ConstraintLayout.b a11 = com.google.android.gms.internal.mlkit_common.a.a(badgeView, R$id.unpaidOrderListBadgeBV, -2, -2);
        a11.f41598E = 0.0f;
        a11.f41616W = true;
        badgeView.setLayoutParams(a11);
        this.badgeBV = badgeView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.unpaidOrderListTitleTAV, -2, -2);
        d11.f41616W = true;
        d11.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.unpaidOrderListDatesTAV, -2, -2);
        d12.f41616W = true;
        d12.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        this.datesTAV = textAtomV2View2;
        BadgeView badgeView2 = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        Im.a.c(badgeView2, R$id.unpaidOrderListPriceBadgeBV, -2, -2);
        this.priceBadgeBV = badgeView2;
        PriceAtomView priceAtomView2 = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView2 = priceAtomView2 == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView2;
        priceAtomView2.setId(R$id.unpaidOrderListFirstPriceV);
        priceAtomView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.firstPriceV = priceAtomView2;
        PriceAtomView priceAtomView3 = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        if (priceAtomView3 == null) {
            priceAtomView = priceAtomView2;
            priceAtomView3 = new PriceAtomView(context, null, 0, 6, null);
        } else {
            priceAtomView = priceAtomView2;
        }
        priceAtomView3.setId(R$id.unpaidOrderListSecondPriceV);
        priceAtomView3.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.secondPriceV = priceAtomView3;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.unpaidOrderListBarrierBV);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.f(5);
        barrier.setReferencedIds(new int[]{badgeView2.getId(), priceAtomView.getId(), priceAtomView3.getId()});
        this.barrierBV = barrier;
        View view = new View(context);
        view.setId(R$id.unpaidOrderListSeparatorV);
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, UniColors.GRAPHIC_NEUTRAL.getResId()));
        this.separatorV = view;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d13 = b.d(textAtomV2View3, R$id.unpaidOrderListDetailTAV, -2, -2);
        d13.f41616W = true;
        d13.f41598E = 0.0f;
        textAtomV2View3.setLayoutParams(d13);
        textAtomV2View3.setTextIsSelectable(false);
        this.detailTAV = textAtomV2View3;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context, null, 0, 6, null);
        horizontalAtomsLayout.setId(R$id.unpaidOrderListIconsHAL);
        horizontalAtomsLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.iconsHAL = horizontalAtomsLayout;
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
    }
}

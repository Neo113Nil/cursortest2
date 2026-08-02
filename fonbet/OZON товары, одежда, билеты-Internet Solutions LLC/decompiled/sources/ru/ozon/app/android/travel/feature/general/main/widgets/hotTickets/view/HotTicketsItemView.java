package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.view;

import BC.a;
import De.C2860c;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.TicketVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter.HotTicketsAirlineIconsAtomsDecoration;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0015\u0018\u00010)J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/view/HotTicketsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "dp2", "dp4", "dp8", "dp16", "dp24", "dpf20", "", "onClick", "Lkotlin/Function0;", "", "ticketBackground", "Landroid/graphics/drawable/GradientDrawable;", "badgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "pricePAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "airlineIconsHAL", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "destinationTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tripDurationTAV", "tripTimeTAV", "transferTextTAV", "transferIconIV", "Lru/ozon/uni/android/atom/icon/IconView;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/TicketVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "setupRoot", "setupViews", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotTicketsItemView extends ConstraintLayout {

    @NotNull
    private final HorizontalAtomsLayout airlineIconsHAL;

    @NotNull
    private final BadgeView badgeBV;

    @NotNull
    private final TextAtomV2View destinationTAV;
    private final int dp16;
    private final int dp2;
    private final int dp24;
    private final int dp4;
    private final int dp8;
    private final float dpf20;

    @NotNull
    private final AtomsAdapter iconsAdapter;
    private Function0<Unit> onClick;

    @NotNull
    private final PriceAtomView pricePAV;

    @NotNull
    private final GradientDrawable ticketBackground;

    @NotNull
    private final IconView transferIconIV;

    @NotNull
    private final TextAtomV2View transferTextTAV;

    @NotNull
    private final TextAtomV2View tripDurationTAV;

    @NotNull
    private final TextAtomV2View tripTimeTAV;

    public /* synthetic */ HotTicketsItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.badgeBV);
        addView(this.pricePAV);
        addView(this.airlineIconsHAL);
        addView(this.destinationTAV);
        addView(this.tripDurationTAV);
        addView(this.tripTimeTAV);
        addView(this.transferTextTAV);
        addView(this.transferIconIV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new HotTicketsItemView$setConstraints$1(this));
    }

    private final void setupRoot() {
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
        setClickable(true);
        setOnClickListener(new a(this, 9));
        setBackground(this.ticketBackground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRoot$lambda$16(HotTicketsItemView hotTicketsItemView, View view) {
        Function0<Unit> function0 = hotTicketsItemView.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void setupViews() {
        this.airlineIconsHAL.setAdapter(this.iconsAdapter);
        HorizontalAtomsLayout horizontalAtomsLayout = this.airlineIconsHAL;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new HotTicketsAirlineIconsAtomsDecoration(context));
    }

    public final void bind(@NotNull TicketVO item, Function1<? super AtomAction, Unit> actionHandler) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        BadgeHolderKt.bind$default(this.badgeBV, item.getDateBadge(), (Function1) null, 2, (Object) null);
        PriceAtomHolderKt.bind$default(this.pricePAV, item.getPrice(), null, 2, null);
        AtomsAdapter atomsAdapter = this.iconsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getAirlineIcons());
        PriceAtomHolderKt.bind$default(this.pricePAV, item.getPrice(), null, 2, null);
        TextHolderKt.bind$default(this.destinationTAV, item.getDestination(), null, 2, null);
        TextHolderKt.bind$default(this.tripDurationTAV, item.getTripDuration(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.tripTimeTAV, item.getTripTime(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.transferTextTAV, item.getTransferText(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.transferIconIV, item.getTransferIcon(), null, 2, null);
        this.onClick = new HotTicketsItemView$bind$1(item, actionHandler);
        GradientDrawable gradientDrawable = this.ticketBackground;
        int i12 = this.dp2;
        String borderColor = item.getBorderColor();
        if (borderColor != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, borderColor);
            if (parseColor != null) {
                i11 = parseColor.intValue();
                gradientDrawable.setStroke(i12, i11);
            }
        }
        i11 = 0;
        gradientDrawable.setStroke(i12, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotTicketsItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(24, context);
        this.dp24 = px2;
        float pxF = ResourceExtKt.toPxF(20, context);
        this.dpf20 = pxF;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(pxF);
        this.ticketBackground = gradientDrawable;
        q qVar = q.f64554a;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        Im.a.c(badgeView, R$id.hotTicketsBadgeBV, -2, -2);
        this.badgeBV = badgeView;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        if (priceAtomView == null) {
            context2 = context;
            priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.hotTicketsPricePAV, -2, -2);
        b11.f41616W = true;
        b11.f41598E = 0.0f;
        b11.f41660x = 0;
        priceAtomView.setLayoutParams(b11);
        this.pricePAV = priceAtomView;
        HorizontalAtomsLayout horizontalAtomsLayout = new HorizontalAtomsLayout(context2, null, 0, 6, null);
        horizontalAtomsLayout.setId(R$id.hotTicketsAirlineIconsHAL);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, px2);
        bVar.f41660x = 0;
        horizontalAtomsLayout.setLayoutParams(bVar);
        this.airlineIconsHAL = horizontalAtomsLayout;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        textAtomV2View.setId(R$id.hotTicketsDestinationTAV);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41616W = true;
        bVar2.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(bVar2);
        this.destinationTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        textAtomV2View2.setId(R$id.hotTicketsTripDurationTAV);
        textAtomV2View2.setTextIsSelectable(false);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41616W = true;
        bVar3.f41598E = 1.0f;
        textAtomV2View2.setLayoutParams(bVar3);
        this.tripDurationTAV = textAtomV2View2;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        textAtomV2View3.setId(R$id.hotTicketsTripTimeTAV);
        textAtomV2View3.setTextIsSelectable(false);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41616W = true;
        bVar4.f41598E = 0.0f;
        textAtomV2View3.setLayoutParams(bVar4);
        this.tripTimeTAV = textAtomV2View3;
        TextAtomV2View textAtomV2View4 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        textAtomV2View4.setId(R$id.hotTicketsTransferTextTAV);
        textAtomV2View4.setTextIsSelectable(false);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        bVar5.f41616W = true;
        bVar5.f41598E = 1.0f;
        textAtomV2View4.setLayoutParams(bVar5);
        this.transferTextTAV = textAtomV2View4;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context2);
        iconView = iconView == null ? new IconView(context2, null, 0, 6, null) : iconView;
        iconView.setId(R$id.hotTicketsTransferIconIV);
        iconView.setLayoutParams(new ConstraintLayout.b(px, px));
        this.transferIconIV = iconView;
        addViews();
        setConstraints();
        setupRoot();
        setupViews();
    }
}

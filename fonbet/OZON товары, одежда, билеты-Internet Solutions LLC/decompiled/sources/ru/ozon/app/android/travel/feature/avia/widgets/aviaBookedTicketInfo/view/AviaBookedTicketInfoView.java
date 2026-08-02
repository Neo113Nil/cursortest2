package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.view;

import Dc0.j;
import Lc.a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010#\u001a\u00020\fJ\u0006\u0010$\u001a\u00020\fJ\u0006\u0010%\u001a\u00020\fJ\u0006\u0010&\u001a\u00020\fJ\u0010\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010)J\b\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\fH\u0002J\b\u0010,\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/view/AviaBookedTicketInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dp16", "onClicked", "Lkotlin/Function0;", "", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "aviaBookedTicketInfoTitleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "aviaBookedTicketInfoPayUntilBadgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "aviaBookedTicketInfoCellCV", "Lru/ozon/uni/android/cell/CellView;", "aviaBookedTicketInfoBadgeHFAL", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "payUntilBadgeShimmerView", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoVO;", "onClick", "showPayUntilBadge", "hidePayUntilBadge", "showPayUntilShimmer", "hidePayUntilShimmer", "setBadgeText", "text", "", "addView", "setConstraints", "setupRoot", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaBookedTicketInfoView extends ConstraintLayout {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final HorizontalFlexAtomsLayout aviaBookedTicketInfoBadgeHFAL;

    @NotNull
    private final CellView aviaBookedTicketInfoCellCV;

    @NotNull
    private final BadgeView aviaBookedTicketInfoPayUntilBadgeBV;

    @NotNull
    private final TextAtomV2View aviaBookedTicketInfoTitleTAV;

    @NotNull
    private final ShapeDrawable backgroundDrawable;
    private final int dp16;
    private final int dp2;
    private final int dp8;
    private Function0<Unit> onClicked;

    @NotNull
    private final RoundedShimmerView payUntilBadgeShimmerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaBookedTicketInfoView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        this.backgroundDrawable = new ShapeDrawable();
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        a.d(textAtomV2View, R$id.aviaBookedTicketInfoTitleTAV, 0, -2, false);
        this.aviaBookedTicketInfoTitleTAV = textAtomV2View;
        BadgeView badgeView = (BadgeView) qVar.i(N.b(BadgeView.class), context2);
        if (badgeView == null) {
            badgeView = new BadgeView(context2, null, 0, 0, 14, null);
        }
        Im.a.c(badgeView, R$id.aviaBookedTicketInfoPayUntilBadgeBV, -2, -2);
        this.aviaBookedTicketInfoPayUntilBadgeBV = badgeView;
        CellView cellView = (CellView) qVar.i(N.b(CellView.class), context2);
        if (cellView == null) {
            cellView = new CellView(context2, null, 0, 0, null, 30, null);
        }
        cellView.setId(R$id.aviaBookedTicketInfoCellCV);
        cellView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.aviaBookedTicketInfoCellCV = cellView;
        AttributeSet attributeSet = null;
        int i11 = 0;
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = new HorizontalFlexAtomsLayout(context2, attributeSet, i11, 6, null);
        horizontalFlexAtomsLayout.setId(R$id.aviaBookedTicketInfoBadgeHFAL);
        horizontalFlexAtomsLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        horizontalFlexAtomsLayout.setAdapter(atomsAdapter);
        this.aviaBookedTicketInfoBadgeHFAL = horizontalFlexAtomsLayout;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context2, attributeSet, i11, 0, 14, null);
        roundedShimmerView.setId(R$id.aviaBookedTicketInfoPayUntilBadgeShimmerView);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(ResourceExtKt.toPx(158, context2), ResourceExtKt.toPx(20, context2)));
        roundedShimmerView.setCornerRadius(ResourceExtKt.toPxF(6, context2));
        this.payUntilBadgeShimmerView = roundedShimmerView;
        addView();
        setConstraints();
        setupRoot();
    }

    private final void addView() {
        addView(this.aviaBookedTicketInfoTitleTAV);
        addView(this.aviaBookedTicketInfoPayUntilBadgeBV);
        addView(this.aviaBookedTicketInfoCellCV);
        addView(this.aviaBookedTicketInfoBadgeHFAL);
        addView(this.payUntilBadgeShimmerView);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AviaBookedTicketInfoView$setConstraints$1(this));
    }

    private final void setupRoot() {
        setOnClickListener(new j(this, 9));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(12, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setPadding(0, px, 0, ResourceExtKt.toPx(16, context2));
        setBackground(this.backgroundDrawable);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple$default(ThemeExtKt.themeColor(context3, R$attr.bgActionSecondary), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRoot$lambda$5(AviaBookedTicketInfoView aviaBookedTicketInfoView, View view) {
        Function0<Unit> function0 = aviaBookedTicketInfoView.onClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void bind(@NotNull AviaBookedTicketInfoVO item, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        TextHolderKt.bind$default(this.aviaBookedTicketInfoTitleTAV, item.getTitle(), null, 2, null);
        CellHolderKt.bind$default(this.aviaBookedTicketInfoCellCV, item.getFlightCell(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.aviaBookedTicketInfoPayUntilBadgeBV, item.getPayUntilBadge(), (Function1) null, 2, (Object) null);
        this.aviaBookedTicketInfoBadgeHFAL.setVisibility(item.getIsBadgesVisible() ? 0 : 8);
        Paint paint = this.backgroundDrawable.getPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : 0);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        List<BadgeDTO> badges = item.getBadges();
        if (badges == null) {
            badges = K.f71697a;
        }
        atomsAdapter.bind(context2, badges);
        this.onClicked = onClick;
    }

    public final void hidePayUntilBadge() {
        ViewExtKt.invisible(this.aviaBookedTicketInfoPayUntilBadgeBV);
    }

    public final void hidePayUntilShimmer() {
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.payUntilBadgeShimmerView);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    public final void setBadgeText(String text) {
        this.aviaBookedTicketInfoPayUntilBadgeBV.setText(text);
    }

    public final void showPayUntilBadge() {
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.aviaBookedTicketInfoPayUntilBadgeBV);
    }

    public final void showPayUntilShimmer() {
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.payUntilBadgeShimmerView);
    }
}

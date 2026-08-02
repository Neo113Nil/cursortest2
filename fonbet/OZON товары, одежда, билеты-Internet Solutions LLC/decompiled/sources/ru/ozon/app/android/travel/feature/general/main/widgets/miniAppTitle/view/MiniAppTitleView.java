package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.view;

import Am.C2438a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"J\u0006\u0010$\u001a\u00020\u0016J\u0006\u0010%\u001a\u00020\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/view/MiniAppTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dp8", "", "miniAppTitleIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "getMiniAppTitleIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "miniAppTitleIconView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "miniAppTitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getMiniAppTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "miniAppTitleTav$delegate", "miniAppTitleBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getMiniAppTitleBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "miniAppTitleBadgeView$delegate", "topTravelBadgeView", "getTopTravelBadgeView", "topTravelBadgeView$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "getMilesBadge", "getTopTravelBadge", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiniAppTitleView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(MiniAppTitleView.class, "miniAppTitleIconView", "getMiniAppTitleIconView()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(MiniAppTitleView.class, "miniAppTitleTav", "getMiniAppTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(MiniAppTitleView.class, "miniAppTitleBadgeView", "getMiniAppTitleBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(MiniAppTitleView.class, "topTravelBadgeView", "getTopTravelBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable;
    private final int dp8;

    /* renamed from: miniAppTitleBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate miniAppTitleBadgeView;

    /* renamed from: miniAppTitleIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate miniAppTitleIconView;

    /* renamed from: miniAppTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate miniAppTitleTav;

    /* renamed from: topTravelBadgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate topTravelBadgeView;

    static {
        int i11 = BadgeView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i11 | i12 | i12 | TextAtomV2View.$stable | i12 | IconView.$stable | i12;
    }

    public /* synthetic */ MiniAppTitleView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    private final BadgeView getMiniAppTitleBadgeView() {
        return (BadgeView) this.miniAppTitleBadgeView.getValue(this, $$delegatedProperties[2]);
    }

    private final IconView getMiniAppTitleIconView() {
        return (IconView) this.miniAppTitleIconView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getMiniAppTitleTav() {
        return (TextAtomV2View) this.miniAppTitleTav.getValue(this, $$delegatedProperties[1]);
    }

    private final BadgeView getTopTravelBadgeView() {
        return (BadgeView) this.topTravelBadgeView.getValue(this, $$delegatedProperties[3]);
    }

    public final void bind(@NotNull MiniAppTitleVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bind(getMiniAppTitleIconView(), item.getIcon(), onAction);
        TextHolderKt.bind(getMiniAppTitleTav(), item.getTitle(), onAction);
        BadgeHolderKt.bind(getMiniAppTitleBadgeView(), item.getMilesBadge(), onAction);
        BadgeHolderKt.bindOrGone(getTopTravelBadgeView(), item.getTopTravelBadge(), onAction);
    }

    @NotNull
    public final BadgeView getMilesBadge() {
        return getMiniAppTitleBadgeView();
    }

    @NotNull
    public final BadgeView getTopTravelBadge() {
        return getTopTravelBadgeView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppTitleView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.miniAppTitleIconView = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$1(this), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.miniAppTitleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$3(this), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.miniAppTitleBadgeView = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$5(this), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.topTravelBadgeView = new PreCreationViewPoolDelegate(context5, N.b(BadgeView.class), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$7(this), new MiniAppTitleView$special$$inlined$preCreationViewPool$default$8(context));
        addView(getMiniAppTitleIconView());
        addView(getMiniAppTitleTav());
        addView(getMiniAppTitleBadgeView());
        addView(getTopTravelBadgeView());
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, getMiniAppTitleIconView());
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, getMiniAppTitleIconView());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, getMiniAppTitleIconView());
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, getMiniAppTitleTav(), getMiniAppTitleIconView());
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, getMiniAppTitleTav());
        ConstraintSetExtKt.layoutConstraintBottomToTopOf(dVar, getMiniAppTitleTav(), getMiniAppTitleBadgeView());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, getMiniAppTitleTav());
        dVar.C(getMiniAppTitleTav().getId(), true);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, getMiniAppTitleBadgeView(), getMiniAppTitleIconView());
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, getMiniAppTitleBadgeView(), getMiniAppTitleTav());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, getMiniAppTitleBadgeView());
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, getMiniAppTitleBadgeView(), getTopTravelBadgeView());
        dVar.C(getMiniAppTitleBadgeView().getId(), true);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, getTopTravelBadgeView(), getMiniAppTitleBadgeView());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, getTopTravelBadgeView());
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, getTopTravelBadgeView(), getMiniAppTitleBadgeView());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, getTopTravelBadgeView());
        dVar.C(getTopTravelBadgeView().getId(), true);
        dVar.f(this);
    }
}

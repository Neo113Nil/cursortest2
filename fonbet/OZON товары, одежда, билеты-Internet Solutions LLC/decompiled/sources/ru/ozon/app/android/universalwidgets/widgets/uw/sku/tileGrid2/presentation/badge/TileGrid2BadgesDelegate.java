package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.badge;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.R$string;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\t*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010\"\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/badge/TileGrid2BadgesDelegate;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "", "badgesInCorner", "hasCountButton", "", "initTopBadgeIfNeeded", "(ZZ)V", "initBottomBadgeIfNeeded", "Lru/ozon/uni/android/atom/badge/BadgeView;", "createAtomBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "", "tileId", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "bindOrGoneAndAppendLocator", "(Lru/ozon/uni/android/atom/badge/BadgeView;JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "updateBadgesLayoutParamsIfNeeded", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "createCommonLayoutParamsChanges", "(ZZ)Lkotlin/jvm/functions/Function1;", "createBaseLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "hasSecondBadge", "getViewForFirstBadge", "(Z)Lru/ozon/uni/android/atom/badge/BadgeView;", "firstBadge", "secondBadge", "bindOrGone", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZZ)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "topBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bottomBadgeView", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BadgesDelegate {
    private BadgeView bottomBadgeView;

    @NotNull
    private final ConstraintLayout root;
    private BadgeView topBadgeView;
    private static final int bottomPadding = ResourceExtKt.toPx(6);
    private static final int horizontalBadgePadding = ResourceExtKt.toPx(6);
    private static final int betweenBadgePadding = ResourceExtKt.toPx(2);

    public TileGrid2BadgesDelegate(@NotNull ConstraintLayout root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
    }

    private final void bindOrGoneAndAppendLocator(BadgeView badgeView, long j11, BadgeDTO badgeDTO) {
        String text;
        BadgeHolderKt.bindOrGone$default(badgeView, badgeDTO, (Function1) null, 2, (Object) null);
        if (badgeDTO == null || (text = badgeDTO.getText()) == null) {
            return;
        }
        badgeView.setContentDescription(StringProvider.getString(R$string.uw_object_badge_product_android, Long.valueOf(j11), text));
    }

    private final BadgeView createAtomBadge() {
        q qVar = q.f64554a;
        d b11 = N.b(BadgeView.class);
        Context context = this.root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (BadgeView) qVar.g(b11, context);
    }

    private final ConstraintLayout.b createBaseLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41598E = 0.0f;
        int i11 = R$id.itemsRv;
        bVar.f41656t = i11;
        bVar.f41658v = i11;
        bVar.setMarginEnd(horizontalBadgePadding);
        bVar.f41616W = true;
        return bVar;
    }

    private final Function1<ConstraintLayout.b, Unit> createCommonLayoutParamsChanges(boolean badgesInCorner, boolean hasCountButton) {
        return new TileGrid2BadgesDelegate$createCommonLayoutParamsChanges$1(badgesInCorner, hasCountButton);
    }

    private final void initBottomBadgeIfNeeded(boolean badgesInCorner, boolean hasCountButton) {
        if (this.bottomBadgeView != null) {
            return;
        }
        BadgeView createAtomBadge = createAtomBadge();
        createAtomBadge.setId(R$id.leftBottomBadge);
        ConstraintLayout.b createBaseLayoutParams = createBaseLayoutParams();
        createCommonLayoutParamsChanges(badgesInCorner, hasCountButton).invoke(createBaseLayoutParams);
        createBaseLayoutParams.f41642l = R$id.itemsRv;
        createAtomBadge.setLayoutParams(createBaseLayoutParams);
        this.root.addView(createAtomBadge);
        this.bottomBadgeView = createAtomBadge;
    }

    private final void initTopBadgeIfNeeded(boolean badgesInCorner, boolean hasCountButton) {
        if (this.topBadgeView != null) {
            return;
        }
        BadgeView createAtomBadge = createAtomBadge();
        createAtomBadge.setId(R$id.secondLeftBottomBadge);
        ConstraintLayout.b createBaseLayoutParams = createBaseLayoutParams();
        createCommonLayoutParamsChanges(badgesInCorner, hasCountButton).invoke(createBaseLayoutParams);
        createBaseLayoutParams.f41640k = R$id.leftBottomBadge;
        ((ViewGroup.MarginLayoutParams) createBaseLayoutParams).bottomMargin = badgesInCorner ? 0 : betweenBadgePadding;
        createBaseLayoutParams.f41662z = badgesInCorner ? 0 : bottomPadding;
        createAtomBadge.setLayoutParams(createBaseLayoutParams);
        this.root.addView(createAtomBadge);
        this.topBadgeView = createAtomBadge;
    }

    private final void updateBadgesLayoutParamsIfNeeded(boolean badgesInCorner, boolean hasCountButton) {
        Function1<ConstraintLayout.b, Unit> createCommonLayoutParamsChanges = createCommonLayoutParamsChanges(badgesInCorner, hasCountButton);
        BadgeView badgeView = this.bottomBadgeView;
        if (badgeView != null) {
            ViewGroup.LayoutParams layoutParams = badgeView.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                int i11 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                int i12 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                int i13 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                int i14 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                int i15 = bVar.f41662z;
                int i16 = bVar.f41657u;
                int i17 = bVar.f41658v;
                createCommonLayoutParamsChanges.invoke(bVar);
                int i18 = badgesInCorner ? 0 : bottomPadding;
                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i18;
                if (i11 != ((ViewGroup.MarginLayoutParams) bVar).leftMargin || i12 != ((ViewGroup.MarginLayoutParams) bVar).topMargin || i13 != ((ViewGroup.MarginLayoutParams) bVar).rightMargin || i14 != i18 || i15 != bVar.f41662z || i16 != bVar.f41657u || i17 != bVar.f41658v) {
                    badgeView.setLayoutParams(bVar);
                }
            }
        }
        BadgeView badgeView2 = this.topBadgeView;
        if (badgeView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = badgeView2.getLayoutParams();
            ConstraintLayout.b bVar2 = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
            if (bVar2 == null) {
                return;
            }
            int i19 = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            int i21 = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            int i22 = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
            int i23 = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
            int i24 = bVar2.f41662z;
            int i25 = bVar2.f41657u;
            int i26 = bVar2.f41658v;
            createCommonLayoutParamsChanges.invoke(bVar2);
            int i27 = badgesInCorner ? 0 : betweenBadgePadding;
            ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = i27;
            int i28 = badgesInCorner ? 0 : bottomPadding;
            bVar2.f41662z = i28;
            if (i19 == ((ViewGroup.MarginLayoutParams) bVar2).leftMargin && i21 == ((ViewGroup.MarginLayoutParams) bVar2).topMargin && i22 == ((ViewGroup.MarginLayoutParams) bVar2).rightMargin && i23 == i27 && i24 == i28 && i25 == bVar2.f41657u && i26 == bVar2.f41658v) {
                return;
            }
            badgeView2.setLayoutParams(bVar2);
        }
    }

    public final void bindOrGone(long tileId, BadgeDTO firstBadge, BadgeDTO secondBadge, boolean badgesInCorner, boolean hasCountButton) {
        if (firstBadge != null && secondBadge != null) {
            initBottomBadgeIfNeeded(badgesInCorner, hasCountButton);
            initTopBadgeIfNeeded(badgesInCorner, hasCountButton);
            BadgeView badgeView = this.bottomBadgeView;
            if (badgeView != null) {
                bindOrGoneAndAppendLocator(badgeView, tileId, secondBadge);
            }
            BadgeView badgeView2 = this.topBadgeView;
            if (badgeView2 != null) {
                bindOrGoneAndAppendLocator(badgeView2, tileId, firstBadge);
            }
        } else if (firstBadge == null && secondBadge == null) {
            BadgeView badgeView3 = this.topBadgeView;
            if (badgeView3 != null) {
                ViewExtKt.gone(badgeView3);
            }
            BadgeView badgeView4 = this.bottomBadgeView;
            if (badgeView4 != null) {
                ViewExtKt.gone(badgeView4);
            }
        } else {
            initBottomBadgeIfNeeded(badgesInCorner, hasCountButton);
            BadgeView badgeView5 = this.bottomBadgeView;
            if (badgeView5 != null) {
                if (firstBadge == null) {
                    firstBadge = secondBadge;
                }
                bindOrGoneAndAppendLocator(badgeView5, tileId, firstBadge);
            }
            BadgeView badgeView6 = this.topBadgeView;
            if (badgeView6 != null) {
                ViewExtKt.gone(badgeView6);
            }
        }
        updateBadgesLayoutParamsIfNeeded(badgesInCorner, hasCountButton);
    }

    public final BadgeView getViewForFirstBadge(boolean hasSecondBadge) {
        return hasSecondBadge ? this.topBadgeView : this.bottomBadgeView;
    }
}

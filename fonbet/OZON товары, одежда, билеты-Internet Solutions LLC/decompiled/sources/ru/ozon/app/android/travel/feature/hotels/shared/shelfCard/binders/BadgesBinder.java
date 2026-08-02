package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0 J\f\u0010\"\u001a\u00020\u001a*\u00020\u0015H\u0002J.\u0010#\u001a\u00020\u001a*\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a0 H\u0002R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BadgesBinder;", "", "parent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintId", "", "favoriteViewId", "indicatorId", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;III)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "dp8", "dp2", "dividerDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "topVrc", "Lru/ozon/app/android/atoms/v3/containers/VerticalRecyclerContainer;", "bottomFl", "Lcom/google/android/flexbox/FlexboxLayout;", "cachedBadges", "", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "topBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bottomBadges", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "clear", RichContentDTO.POSITION_FILL, "badges", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgesBinder {

    @NotNull
    private final FlexboxLayout bottomFl;

    @NotNull
    private final List<BadgeView> cachedBadges;
    private final Context context;

    @NotNull
    private final ShapeDrawable dividerDrawable;
    private final int dp2;
    private final int dp8;

    @NotNull
    private final VerticalRecyclerContainer topVrc;

    public BadgesBinder(@NotNull ConstraintLayout parent, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int px2 = UiExtKt.toPx(2, context);
        this.dp2 = px2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(0);
        shapeDrawable.setIntrinsicHeight(px2);
        shapeDrawable.setIntrinsicWidth(px2);
        this.dividerDrawable = shapeDrawable;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        VerticalRecyclerContainer verticalRecyclerContainer = new VerticalRecyclerContainer(context, null, 0, 6, null);
        verticalRecyclerContainer.setId(R$id.shelfCardTopBadgesVrc);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = i11;
        bVar.f41656t = i11;
        bVar.f41657u = i12;
        bVar.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px;
        bVar.setMarginEnd(px);
        verticalRecyclerContainer.setLayoutParams(bVar);
        verticalRecyclerContainer.setNestedScrollingEnabled(false);
        Context context2 = verticalRecyclerContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        verticalRecyclerContainer.addItemDecoration(new TopBadgesDecorator(context2));
        this.topVrc = verticalRecyclerContainer;
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setId(R$id.shelfCardBottomBadgesFbl);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41642l = i11;
        bVar2.f41656t = i11;
        bVar2.f41657u = i13;
        bVar2.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = px;
        bVar2.setMarginEnd(px);
        bVar2.f41595B = px;
        flexboxLayout.setLayoutParams(bVar2);
        flexboxLayout.setShowDivider(2);
        flexboxLayout.setDividerDrawable(shapeDrawable);
        flexboxLayout.setFlexWrap(2);
        this.bottomFl = flexboxLayout;
        this.cachedBadges = new ArrayList();
        parent.addView(verticalRecyclerContainer);
        parent.addView(flexboxLayout);
    }

    private final void clear(FlexboxLayout flexboxLayout) {
        Iterator<View> it = C5316f0.b(flexboxLayout).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                flexboxLayout.removeAllViews();
                return;
            }
            View view = (View) c5314e0.next();
            BadgeView badgeView = view instanceof BadgeView ? (BadgeView) view : null;
            if (badgeView != null) {
                this.cachedBadges.add(badgeView);
            }
        }
    }

    private final void fill(FlexboxLayout flexboxLayout, List<BadgeDTO> list, Function1<? super AtomAction, Unit> function1) {
        for (BadgeDTO badgeDTO : list) {
            BadgeView badgeView = (BadgeView) C7714v.x0(this.cachedBadges);
            if (badgeView == null) {
                q qVar = q.f64554a;
                d b11 = N.b(BadgeView.class);
                Context context = flexboxLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                badgeView = (BadgeView) qVar.g(b11, context);
            }
            BadgeHolderKt.bind(badgeView, badgeDTO, function1);
            flexboxLayout.addView(badgeView);
        }
    }

    public final void bind(@NotNull List<BadgeDTO> topBadges, @NotNull List<BadgeDTO> bottomBadges, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(topBadges, "topBadges");
        Intrinsics.checkNotNullParameter(bottomBadges, "bottomBadges");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.topVrc.setOnAction(onAction);
        this.topVrc.bind(topBadges);
        clear(this.bottomFl);
        fill(this.bottomFl, bottomBadges, onAction);
    }
}

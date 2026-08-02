package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.header;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.ToggleHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017J&\u0010\u0019\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/header/FiltersSectionHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "labelTAV", "toggleV", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "badgeV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bindOrGone", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "control", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindControl", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FiltersSectionHeaderView extends LinearLayout {
    public static final int $stable;

    @NotNull
    private final BadgeView badgeV;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final TextAtomV2View labelTAV;

    @NotNull
    private final TextAtomV2View titleTAV;

    @NotNull
    private final ToggleView toggleV;

    static {
        int i11 = BadgeView.$stable | ToggleView.$stable;
        int i12 = TextAtomV2View.$stable;
        $stable = i11 | i12 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersSectionHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        addView(g10);
        this.titleTAV = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(px);
        textAtomV2View2.setLayoutParams(layoutParams2);
        textAtomV2View2.setTextIsSelectable(false);
        addView(g11);
        this.labelTAV = textAtomV2View2;
        ToggleView toggleView = (ToggleView) qVar.i(N.b(ToggleView.class), context);
        toggleView = toggleView == null ? new ToggleView(context, null, 0, 6, null) : toggleView;
        toggleView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(toggleView);
        this.toggleV = toggleView;
        BadgeView badgeView = (BadgeView) qVar.i(N.b(BadgeView.class), context);
        badgeView = badgeView == null ? new BadgeView(context, null, 0, 0, 14, null) : badgeView;
        badgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(badgeView);
        this.badgeV = badgeView;
        setOrientation(0);
        setGravity(17);
        setPadding(px2, px2, px2, 0);
    }

    private final void bindControl(Object control, Function1<? super AtomAction, Unit> actionHandler) {
        if (control == null) {
            ViewExtKt.gone(this.labelTAV);
            ViewExtKt.gone(this.toggleV);
            ViewExtKt.gone(this.badgeV);
        } else {
            if (control instanceof FiltersSectionVO.State.ToggleControlVO) {
                FiltersSectionVO.State.ToggleControlVO toggleControlVO = (FiltersSectionVO.State.ToggleControlVO) control;
                TextHolderKt.bindOrGone$default(this.labelTAV, toggleControlVO.getLabel(), null, 2, null);
                ToggleHolderKt.bindOrGone$default(this.toggleV, toggleControlVO.getToggle(), null, 2, null);
                ViewExtKt.setOnClickListenerThrottle$default(this.toggleV, 0L, new FiltersSectionHeaderView$bindControl$1$1(control, actionHandler), 1, null);
                ViewExtKt.gone(this.badgeV);
                return;
            }
            if (control instanceof BadgeDTO) {
                ViewExtKt.gone(this.labelTAV);
                ViewExtKt.gone(this.toggleV);
                BadgeHolderKt.bindOrGone(this.badgeV, (BadgeDTO) control, actionHandler);
            }
        }
    }

    public final void bindOrGone(TextDTO title, Object control, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (title == null) {
            ViewExtKt.gone(this);
            return;
        }
        TextHolderKt.bind$default(this.titleTAV, title, null, 2, null);
        bindControl(control, actionHandler);
        ViewExtKt.show(this);
    }
}

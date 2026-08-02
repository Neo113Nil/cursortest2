package ru.ozon.android.composerCommonViewKit.header.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.R$color;
import ru.ozon.android.composerCommonViewKit.databinding.ViewHeaderBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp16", "dp24", "binding", "Lru/ozon/android/composerCommonViewKit/databinding/ViewHeaderBinding;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bindBadge", "", "badgeDTO", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "handler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bind", "headerVO", "Lru/ozon/android/composerCommonViewKit/header/presentation/HeaderVO;", "bindBackground", "getBackgroundColorOrDefault", "color", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HeaderView extends ConstraintLayout {

    @NotNull
    private final ViewHeaderBinding binding;
    private final int dp16;
    private final int dp24;

    public /* synthetic */ HeaderView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(HeaderVO headerVO) {
        View constraintLayout = this.binding.getConstraintLayout();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackground(new IslandDrawable(0, getBackgroundColorOrDefault(context, headerVO.getBackgroundColor()), new float[]{headerVO.getTopIslandCornerRadius(), headerVO.getTopIslandCornerRadius(), headerVO.getTopIslandCornerRadius(), headerVO.getTopIslandCornerRadius(), 0.0f, 0.0f, 0.0f, 0.0f}, headerVO.getLeftMargin(), headerVO.getTopMargin(), headerVO.getRightMargin(), headerVO.getBottomMargin()));
    }

    private final int getBackgroundColorOrDefault(Context context, String color) {
        if (color == null) {
            return 0;
        }
        return StyleParser.INSTANCE.parseColor(context, color, R$color.layer_floor_1);
    }

    public final void bind(@NotNull HeaderVO headerVO) {
        CommonCellSettings.LayoutPadding topPadding;
        Intrinsics.checkNotNullParameter(headerVO, "headerVO");
        setPadding(headerVO.getLeftMargin(), headerVO.getTopMargin(), headerVO.getRightMargin(), headerVO.getBottomMargin());
        bindBackground(headerVO);
        ViewHeaderBinding viewHeaderBinding = this.binding;
        TextAtomV2View title = viewHeaderBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, headerVO.getTitle(), null, 2, null);
        TextAtomV2View subTitle = viewHeaderBinding.subTitle;
        Intrinsics.checkNotNullExpressionValue(subTitle, "subTitle");
        TextHolderKt.bindOrGone$default(subTitle, headerVO.getSubtitle(), null, 2, null);
        int i11 = 0;
        viewHeaderBinding.title.setFocusable(0);
        viewHeaderBinding.subTitle.setFocusable(0);
        TextAtomV2View title2 = viewHeaderBinding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        ViewGroup.LayoutParams layoutParams = title2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, headerVO.getTopIslandCornerRadius() == 0.0f ? this.dp24 : this.dp16, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        title2.setLayoutParams(marginLayoutParams);
        TextAtomV2View subTitle2 = viewHeaderBinding.subTitle;
        Intrinsics.checkNotNullExpressionValue(subTitle2, "subTitle");
        ViewGroup.LayoutParams layoutParams2 = subTitle2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        TextDTO subtitle = headerVO.getSubtitle();
        if (subtitle != null && (topPadding = subtitle.getTopPadding()) != null) {
            i11 = getResources().getDimensionPixelSize(topPadding.getCellLayoutPadding());
        }
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i11, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        subTitle2.setLayoutParams(marginLayoutParams2);
    }

    public final void bindBadge(BadgeDTO badgeDTO, Function1<? super AtomAction, Unit> handler) {
        BadgeView badge = this.binding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bindOrGone(badge, badgeDTO, handler);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = UiExtKt.toPx(16, context);
        this.dp24 = UiExtKt.toPx(24, context);
        ViewHeaderBinding inflate = ViewHeaderBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setClipToOutline(true);
    }
}

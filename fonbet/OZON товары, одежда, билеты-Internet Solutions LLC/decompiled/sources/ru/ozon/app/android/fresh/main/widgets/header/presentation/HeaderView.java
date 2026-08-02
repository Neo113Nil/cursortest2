package ru.ozon.app.android.fresh.main.widgets.header.presentation;

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
import ru.ozon.app.android.fresh.main.databinding.FreshViewHeaderBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\f\u0010\u0018\u001a\u00020\u0011*\u00020\u0019H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/fresh/main/databinding/FreshViewHeaderBinding;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "headerVO", "Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO;", "handler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindBackground", "focusableFalse", "Landroid/view/View;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeaderView extends ConstraintLayout {
    private static final int DP_16 = UiExtKt.toPx(16);
    private static final int DP_24 = UiExtKt.toPx(24);

    @NotNull
    private final FreshViewHeaderBinding binding;

    public /* synthetic */ HeaderView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(HeaderVO headerVO) {
        View constraintLayout = this.binding.getConstraintLayout();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayout.setBackground(new IslandDrawable(0, styleParser.parseColor(context, headerVO.getBackgroundColor(), UniColors.CLEAR_LIGHT_KEY_0.getResId()), new float[]{headerVO.getTopIslandCornerRadius(), headerVO.getTopIslandCornerRadius(), headerVO.getTopIslandCornerRadius(), headerVO.getTopIslandCornerRadius(), 0.0f, 0.0f, 0.0f, 0.0f}, headerVO.getMargins().getLeftMargin(), headerVO.getMargins().getTopMargin(), headerVO.getMargins().getRightMargin(), headerVO.getMargins().getBottomMargin()));
    }

    private final void focusableFalse(View view) {
        view.setFocusable(0);
    }

    public final void bind(@NotNull HeaderVO headerVO, Function1<? super AtomAction, Unit> handler) {
        CommonCellSettings.LayoutPadding topPadding;
        Intrinsics.checkNotNullParameter(headerVO, "headerVO");
        setPadding(headerVO.getMargins().getLeftMargin(), headerVO.getMargins().getTopMargin(), headerVO.getMargins().getRightMargin(), headerVO.getMargins().getBottomMargin());
        bindBackground(headerVO);
        FreshViewHeaderBinding freshViewHeaderBinding = this.binding;
        TextAtomV2View title = freshViewHeaderBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, headerVO.getTitle(), null, 2, null);
        TextAtomV2View subTitle = freshViewHeaderBinding.subTitle;
        Intrinsics.checkNotNullExpressionValue(subTitle, "subTitle");
        TextHolderKt.bindOrGone$default(subTitle, headerVO.getSubtitle(), null, 2, null);
        TextAtomV2View title2 = freshViewHeaderBinding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        focusableFalse(title2);
        TextAtomV2View subTitle2 = freshViewHeaderBinding.subTitle;
        Intrinsics.checkNotNullExpressionValue(subTitle2, "subTitle");
        focusableFalse(subTitle2);
        TextAtomV2View title3 = freshViewHeaderBinding.title;
        Intrinsics.checkNotNullExpressionValue(title3, "title");
        ViewGroup.LayoutParams layoutParams = title3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, headerVO.getTopIslandCornerRadius() == 0.0f ? DP_24 : DP_16, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        title3.setLayoutParams(marginLayoutParams);
        TextAtomV2View subTitle3 = freshViewHeaderBinding.subTitle;
        Intrinsics.checkNotNullExpressionValue(subTitle3, "subTitle");
        ViewGroup.LayoutParams layoutParams2 = subTitle3.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        TextDTO subtitle = headerVO.getSubtitle();
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, (subtitle == null || (topPadding = subtitle.getTopPadding()) == null) ? 0 : getResources().getDimensionPixelSize(topPadding.getCellLayoutPadding()), marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        subTitle3.setLayoutParams(marginLayoutParams2);
        BadgeView badge = this.binding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bindOrGone(badge, headerVO.getBadge(), handler);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FreshViewHeaderBinding inflate = FreshViewHeaderBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setClipToOutline(true);
    }
}

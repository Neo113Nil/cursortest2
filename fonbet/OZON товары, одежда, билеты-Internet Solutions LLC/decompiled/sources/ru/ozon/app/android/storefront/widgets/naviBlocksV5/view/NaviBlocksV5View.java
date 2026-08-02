package ru.ozon.app.android.storefront.widgets.naviBlocksV5.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eJ\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/view/NaviBlocksV5View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "leftBlockView", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/view/BlockV5View;", "rightBlockView", "bind", "", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setConstraints", "createNaviBlock", "viewId", "", "updateHorizontalPaddingIfNeeded", "newPadding", "updateBlockMarginIfNeeded", "newMargin", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV5View extends ConstraintLayout {
    public static final int $stable;

    @NotNull
    private final BlockV5View leftBlockView;

    @NotNull
    private final BlockV5View rightBlockView;

    static {
        int i11 = TextAtomV2View.$stable;
        int i12 = IconView.$stable;
        $stable = i11 | i11 | i12 | i11 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaviBlocksV5View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.leftBlockView = createNaviBlock(R$id.leftBlockV5);
        this.rightBlockView = createNaviBlock(R$id.rightBlockV5);
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(this.leftBlockView);
        addView(this.rightBlockView);
    }

    private final BlockV5View createNaviBlock(int viewId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BlockV5View blockV5View = new BlockV5View(context);
        blockV5View.setId(viewId);
        blockV5View.setLayoutParams(new ConstraintLayout.b(0, -2));
        return blockV5View;
    }

    private final void setConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new NaviBlocksV5View$setConstraints$1(this));
    }

    private final void updateBlockMarginIfNeeded(int newMargin) {
        if (Intrinsics.d(getTag(), Integer.valueOf(newMargin))) {
            return;
        }
        setTag(Integer.valueOf(newMargin));
        int i11 = newMargin / 2;
        ViewGroup.LayoutParams layoutParams = this.leftBlockView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams).setMarginEnd(i11);
        ViewGroup.LayoutParams layoutParams2 = this.rightBlockView.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.b) layoutParams2).setMarginStart(i11);
    }

    private final void updateHorizontalPaddingIfNeeded(int newPadding) {
        if (newPadding == getPaddingStart() && newPadding == getPaddingEnd()) {
            return;
        }
        setPadding(newPadding, getPaddingTop(), newPadding, getPaddingBottom());
    }

    public final void bind(@NotNull NaviBlocksV5VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor().getId());
        if (parseColor != null) {
            setBackgroundColor(parseColor.intValue());
        }
        updateHorizontalPaddingIfNeeded(UiExtKt.toPx(item.getHorizontalMargin()));
        updateBlockMarginIfNeeded(UiExtKt.toPx(item.getBlockMargin()));
        this.leftBlockView.bind(item.getLeftBlock(), actionHandler);
        this.rightBlockView.bind(item.getRightBlock(), actionHandler);
    }
}

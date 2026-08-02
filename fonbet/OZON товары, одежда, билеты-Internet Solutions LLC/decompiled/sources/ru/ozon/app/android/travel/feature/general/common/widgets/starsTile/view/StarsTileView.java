package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation.StarsTileVI;
import ru.ozon.app.android.travel.molecules.view.starsBlock.StarsBalanceMoleculeVI;
import ru.ozon.app.android.travel.molecules.view.starsBlock.StarsBalanceView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/view/StarsTileView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "containerProductStar", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceView;", "containerUserStar", "paddingHorizontal", "", "elementsPadding", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;", "bindFirstBlock", "firstBlock", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "bindSecondBlock", "bindBackground", "backgroundColor", "", "createStarsBlock", "marginEndValue", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StarsTileView extends LinearLayout {

    @NotNull
    private final StarsBalanceView containerProductStar;

    @NotNull
    private final StarsBalanceView containerUserStar;
    private final int elementsPadding;
    private final int paddingHorizontal;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = StarsBalanceView.$stable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/view/StarsTileView$Companion;", "", "<init>", "()V", "ELEMENT_HORIZONTAL_WEIGHT", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarsTileView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(Paddings.PADDING_500.getPx());
        this.paddingHorizontal = px;
        int px2 = UiExtKt.toPx(Paddings.PADDING_300.getPx());
        this.elementsPadding = px2;
        setOrientation(0);
        setPadding(px, getPaddingTop(), px, getPaddingBottom());
        this.containerProductStar = createStarsBlock(px2);
        this.containerUserStar = createStarsBlock(0);
    }

    private final StarsBalanceView createStarsBlock(int marginEndValue) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StarsBalanceView starsBalanceView = new StarsBalanceView(context);
        starsBalanceView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginEnd(marginEndValue);
        starsBalanceView.setLayoutParams(layoutParams);
        addView(starsBalanceView);
        return starsBalanceView;
    }

    public final void bind(@NotNull StarsTileVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindFirstBlock(item.getFirstBlock());
        bindSecondBlock(item.getSecondBlock());
        bindBackground(item.getBackgroundColor());
    }

    public final void bindBackground(String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, backgroundColor);
        setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
    }

    public final void bindFirstBlock(@NotNull StarsBalanceMoleculeVI firstBlock) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        this.containerProductStar.bind(firstBlock);
    }

    public final void bindSecondBlock(@NotNull StarsBalanceMoleculeVI firstBlock) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        this.containerUserStar.bind(firstBlock);
    }
}

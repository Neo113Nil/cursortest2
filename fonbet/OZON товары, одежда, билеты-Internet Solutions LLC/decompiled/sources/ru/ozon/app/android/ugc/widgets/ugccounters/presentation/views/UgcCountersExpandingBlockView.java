package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersExpandingBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "bind", "", "expandingBlock", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Expanding;", "onClickListener", "Landroid/view/View$OnClickListener;", "setBackground", "backgroundColor", "", "cornerRadius", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersExpandingBlockView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable | IconView.$stable;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCountersExpandingBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.ugcExpandingBlockIcon);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(iconView);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.ugcExpandingBlockTitle);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.ugcExpandingBlockSubtitle);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        setId(R$id.ugcExpandingBlockRoot);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_12(), 0, dimens.getDP_12(), 0);
        setLayoutParams(layoutParams);
    }

    private final void setBackground(String backgroundColor, float cornerRadius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, backgroundColor, UniColors.CLEAR_LIGHT_KEY_0.getResId()));
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = cornerRadius;
        }
        gradientDrawable.setCornerRadii(fArr);
        setBackground(gradientDrawable);
    }

    public final void bind(@NotNull UgcCountersVO.Block.Expanding expandingBlock, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(expandingBlock, "expandingBlock");
        setGravity(expandingBlock.getAlignment());
        setBackground(expandingBlock.getBackgroundColor(), UiExtKt.toPxF(expandingBlock.getCornerRadius().getPx()));
        IconHolderKt.bindOrGone$default(this.iconView, expandingBlock.getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, expandingBlock.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, expandingBlock.getSubtitle(), null, 2, null);
        setOnClickListener(onClickListener);
    }
}

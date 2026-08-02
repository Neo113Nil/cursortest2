package ru.ozon.app.android.travel.molecules.view.iconWithText.v3;

import Bl.b;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/iconWithText/v3/IconWithTextV3View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "dp6", "", "iconIV", "Lru/ozon/uni/android/atom/icon/IconView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/iconWithText/v3/IconWithTextV3VO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconWithTextV3View extends LinearLayout {
    public static final int $stable = 8;
    private final int dp6;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final IconView iconIV;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconWithTextV3View(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        this.dp6 = ResourceExtKt.toPx(6, context);
        q qVar = q.f64554a;
        IconView iconView = (IconView) b.a(IconView.class, "type", qVar, null);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(iconView);
        this.iconIV = iconView;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(g10);
        this.titleTAV = textAtomV2View;
        setOrientation(0);
        setGravity(17);
        setBackground(gradientDrawable);
    }

    public final void bind(@NotNull IconWithTextV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        IconHolderKt.bindOrGone$default(this.iconIV, item.getIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.titleTAV, item.getText(), null, 2, null);
        GradientDrawable gradientDrawable = this.gradientDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.bg_secondary));
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        int px = item.getCornerRadius().getPx();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable2.setCornerRadius(ResourceExtKt.toPxF(px, context2));
        setPadding(item.getLeftPadding(), this.dp6, item.getRightPadding(), this.dp6);
    }
}

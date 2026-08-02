package ru.ozon.app.android.travel.molecules.view.disclaimer;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/disclaimer/TravelDisclaimerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconView", "Landroidx/appcompat/widget/AppCompatImageView;", "textView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "roundedBackground", "Landroid/graphics/drawable/ShapeDrawable;", "bind", "", "item", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "bindOrGone", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelDisclaimerView extends LinearLayout {

    @NotNull
    private final AppCompatImageView iconView;

    @NotNull
    private final ShapeDrawable roundedBackground;

    @NotNull
    private final TextAtomView textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TravelDisclaimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull DisclaimerAtom item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Icon icon = item.getIcon();
        ImageViewExtKt.load$default(this.iconView, icon.getImage(), null, null, null, null, false, null, 126, null);
        AppCompatImageView appCompatImageView = this.iconView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, icon.getTintColor()));
        DisclaimerAtom.Body body = item.getBody();
        this.textView.setText(body.getText());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, body.getColor());
        if (parseColor != null) {
            this.textView.setTextColor(parseColor.intValue());
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context3, item.getBackgroundColor());
        if (parseColor2 != null) {
            this.roundedBackground.getPaint().setColor(parseColor2.intValue());
        }
    }

    public final void bindOrGone(DisclaimerAtom item) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(item);
        }
    }

    public /* synthetic */ TravelDisclaimerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelDisclaimerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int px = ResourceExtKt.toPx(24, context);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(px, px));
        this.iconView = appCompatImageView;
        TextAtomView textAtomView = (TextAtomView) q.f64554a.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(ResourceExtKt.toPx(12, context));
        textAtomView.setPadding(0, ResourceExtKt.toPx(2, context), 0, 0);
        textAtomView.setLayoutParams(layoutParams);
        textAtomView.setTextAppearance(R$style.TextStyle_Body_M);
        this.textView = textAtomView;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor0), ResourceExtKt.toPxF(12, context));
        this.roundedBackground = produce;
        setOrientation(0);
        addView(appCompatImageView);
        addView(textAtomView);
        setBackground(produce);
    }
}

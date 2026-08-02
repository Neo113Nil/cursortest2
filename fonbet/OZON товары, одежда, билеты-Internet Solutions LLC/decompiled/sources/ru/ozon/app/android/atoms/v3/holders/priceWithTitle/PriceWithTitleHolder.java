package ru.ozon.app.android.atoms.v3.holders.priceWithTitle;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.style.TextAppearanceSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.uikit.view.atoms.priceWithTitle.PriceWithTitleView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceTextGenerator;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/priceWithTitle/PriceWithTitleHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "Lru/ozon/app/android/uikit/view/atoms/priceWithTitle/PriceWithTitleView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/priceWithTitle/PriceWithTitleView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onConfigureView", "", "configuration", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "onBind", "item", "mapToColor", "", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceWithTitleHolder extends AtomV3<PriceWithTitle, PriceWithTitleView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithTitleHolder(@NotNull PriceWithTitleView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final int[] mapToColor(PriceWithTitle.GradientColor gradientColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), gradientColor.getStartColor());
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            Integer parseColor2 = styleParser.parseColor(getContext(), gradientColor.getEndColor());
            if (parseColor2 != null) {
                return new int[]{intValue, parseColor2.intValue()};
            }
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceWithTitleHolder(@NotNull Context context, String str) {
        this(new PriceWithTitleView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull PriceWithTitle item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((PriceWithTitleHolder) item);
        PriceWithTitleView containerView = getContainerView();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.setPriceColor(styleParser.parseColor(context, item.getPriceColor(), StyleParser.OzColor.OZ_COLOR_BLACK));
        containerView.setPriceWithStyle(OzonSpannableStringKt.toOzonSpannableString(PriceTextGenerator.INSTANCE.getSpannablePrice(item.getPrice(), item.getPriceSubtitle(), containerView.getPriceColor(), new TextAppearanceSpan(containerView.getContext(), item.getTheme().getPriceSubtitle()))), item.getTheme().getPriceStyle(), containerView.getPriceColor());
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, item.getBackgroundColor());
        PriceWithTitle.GradientColor gradientBackgroundColor = item.getGradientBackgroundColor();
        containerView.setPriceBackground(parseColor, gradientBackgroundColor != null ? mapToColor(gradientBackgroundColor) : null);
        containerView.setPriceBackgroundCornerRadius(item.getTheme().getCornerRadius());
        OzonSpannableString title = item.getTitle();
        containerView.setTitleWithStyle(title != null ? OzonUrlSpan.INSTANCE.setOnUrlSpanClick(title, getContainerView(), new PriceWithTitleHolder$onBind$1$1(this)) : null, item.getTheme().getTitleStyle());
        Context context3 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        containerView.setTitleColor(styleParser.parseColor(context3, item.getTitleColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_SECONDARY));
        Context context4 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        containerView.setStrikethroughColor(styleParser.parseColor(context4, item.getStrikethroughTitleColor()));
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Atom.DefaultConfigurator configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigureView((PriceWithTitleHolder) configuration);
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
    }
}

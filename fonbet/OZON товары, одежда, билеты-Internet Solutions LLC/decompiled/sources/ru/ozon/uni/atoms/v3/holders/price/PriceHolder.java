package ru.ozon.uni.atoms.v3.holders.price;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.text.style.TextAppearanceSpan;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceTextGenerator;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001b\u0010*\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001b\u0010-\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/¨\u00062"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/price/PriceHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/price/PriceView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/price/Price$StyleType;", "style", "", "imageMargin", "(Lru/ozon/uni/atoms/data/price/Price$StyleType;)I", "imageSize", "Lru/ozon/uni/android/uikit/view/atoms/price/PriceView$PriceViewType;", "mapStyle", "(Lru/ozon/uni/atoms/data/price/Price$StyleType;)Lru/ozon/uni/android/uikit/view/atoms/price/PriceView$PriceViewType;", "getPriceSubtitleStyle", "item", "getDefaultPriceColorRes", "(Lru/ozon/uni/atoms/data/price/Price;)I", "Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;", "configuration", "", "onConfigureView", "(Lru/ozon/uni/atoms/af/Atom$DefaultConfigurator;)V", "onBind", "(Lru/ozon/uni/atoms/data/price/Price;)V", "dp4$delegate", "LSc/j;", "getDp4", "()I", "dp4", "dp8$delegate", "getDp8", "dp8", "dp16$delegate", "getDp16", "dp16", "dp24$delegate", "getDp24", "dp24", "priceAccentColorRes", "I", "pricePrimaryColorRes", "originPriceDefaultColorRes", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceHolder extends AtomV3<Price, PriceView> {

    /* renamed from: dp16$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp16;

    /* renamed from: dp24$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp24;

    /* renamed from: dp4$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp4;

    /* renamed from: dp8$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp8;
    private final int originPriceDefaultColorRes;
    private final int priceAccentColorRes;
    private final int pricePrimaryColorRes;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Price.StyleType.values().length];
            try {
                iArr[Price.StyleType.STYLE_TYPE_MEDIUM_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Price.StyleType.STYLE_TYPE_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Price.StyleType.STYLE_TYPE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Price.StyleType.STYLE_TYPE_SMALL_MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Price.StyleType.STYLE_TYPE_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceHolder(@NotNull PriceView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        n nVar = n.NONE;
        this.dp4 = k.a(nVar, new PriceHolder$dp4$2(this));
        this.dp8 = k.a(nVar, new PriceHolder$dp8$2(this));
        this.dp16 = k.a(nVar, new PriceHolder$dp16$2(this));
        this.dp24 = k.a(nVar, new PriceHolder$dp24$2(this));
        this.priceAccentColorRes = ThemeExtKt.themeColorRes(getContext(), R$attr.oz_semantic_accent_alert);
        this.pricePrimaryColorRes = ThemeExtKt.themeColorRes(getContext(), R$attr.oz_semantic_text_primary);
        this.originPriceDefaultColorRes = ThemeExtKt.themeColorRes(getContext(), R$attr.oz_semantic_text_primary);
    }

    private final int getDefaultPriceColorRes(Price item) {
        return item.getOriginalPrice() != null ? this.priceAccentColorRes : this.pricePrimaryColorRes;
    }

    private final int getDp16() {
        return ((Number) this.dp16.getValue()).intValue();
    }

    private final int getDp24() {
        return ((Number) this.dp24.getValue()).intValue();
    }

    private final int getDp4() {
        return ((Number) this.dp4.getValue()).intValue();
    }

    private final int getDp8() {
        return ((Number) this.dp8.getValue()).intValue();
    }

    private final int getPriceSubtitleStyle(Price.StyleType style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return (i11 == 1 || i11 == 2) ? R$style.TextStyle_Body_M : (i11 == 3 || i11 == 4 || i11 == 5) ? R$style.TextStyle_Caption : R$style.TextStyle_Caption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int imageMargin(Price.StyleType style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return (i11 == 1 || i11 == 2) ? getDp8() : getDp4();
    }

    private final int imageSize(Price.StyleType style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return (i11 == 1 || i11 == 2) ? getDp24() : getDp16();
    }

    private final PriceView.PriceViewType mapStyle(Price.StyleType style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? PriceView.PriceViewType.MEDIUM : PriceView.PriceViewType.MEDIUM : PriceView.PriceViewType.SMALL_MEDIUM : PriceView.PriceViewType.SMALL : PriceView.PriceViewType.LARGE : PriceView.PriceViewType.MEDIUM_LARGE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull Price item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((PriceHolder) item);
        PriceView containerView = getContainerView();
        if (containerView.getId() == -1) {
            containerView.setId(R$id.priceAtom);
        }
        containerView.applyStyle(mapStyle(item.getCurrentStyle()));
        int defaultPriceColorRes = getDefaultPriceColorRes(item);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getPriceColor(), defaultPriceColorRes);
        containerView.setPrice(PriceTextGenerator.INSTANCE.getSpannablePrice(item.getPrice(), item.getPriceSubtitle(), parseColor, new TextAppearanceSpan(containerView.getContext(), getPriceSubtitleStyle(item.getTheme()))), parseColor);
        containerView.setOriginalPrice(item.getOriginalPrice(), item.getOriginalPriceColor(), this.originPriceDefaultColorRes);
        String strikethroughColor = item.getStrikethroughColor();
        if (strikethroughColor == null) {
            strikethroughColor = item.getPriceColor();
        }
        containerView.setOriginPriceLineColor(strikethroughColor, defaultPriceColorRes);
        if (item.getImage() == null) {
            containerView.setImageDrawable(null, 0);
            return;
        }
        int imageSize = imageSize(item.getCurrentStyle());
        ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
        Context context2 = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        imageLoader.load(context2, item.getImage(), imageSize, imageSize, new PriceHolder$onBind$1$1$1(containerView, imageSize, this, item));
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onConfigureView(@NotNull Atom.DefaultConfigurator configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigureView((PriceHolder) configuration);
        getContainerView().setId(R$id.atom_type_price);
        getContainerView().setPadding(ResourceExtKt.toPx(configuration.getPaddingStart()), ResourceExtKt.toPx(configuration.getPaddingTop()), ResourceExtKt.toPx(configuration.getPaddingEnd()), ResourceExtKt.toPx(configuration.getPaddingBottom()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceHolder(@NotNull Context context, String str) {
        this((PriceView) q.f64554a.g(N.b(PriceView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

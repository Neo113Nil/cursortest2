package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation;

import WZ.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.domain.DetailedCheckoutProductsVO;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item.DetailedCheckoutProductsDecorator;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.item.DetailedCheckoutProductsItemAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 '2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001'B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/DetailedCheckoutProductsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LWZ/l;", "tokenizedAnalytics", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(LWZ/l;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsDecorator;", "setupDecorator", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO;)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsDecorator;", "", "separatorColor", "tileColor", "", "getSeparatorColor", "(Ljava/lang/String;Ljava/lang/String;)I", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO;Ll20/d;)V", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemAdapter;", "adapter", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsItemAdapter;", "decorator", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/item/DetailedCheckoutProductsDecorator;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailedCheckoutProductsViewHolder extends k<DetailedCheckoutProductsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DetailedCheckoutProductsItemAdapter adapter;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final DetailedCheckoutProductsDecorator decorator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int imageWidth = UiExtKt.toPx(60);
    private static final int defaultTileBackground = UniColors.LAYER_FLOOR_1.getResId();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/DetailedCheckoutProductsViewHolder$Companion;", "", "<init>", "()V", "", "DEFAULT_SEPARATOR_COLOR", "I", "DEFAULT_SEPARATOR_HEIGHT", "DEFAULT_SEPARATOR_PADDING", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedCheckoutProductsViewHolder(@NotNull l tokenizedAnalytics, @NotNull RecyclerView containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.containerView = containerView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        DetailedCheckoutProductsItemAdapter detailedCheckoutProductsItemAdapter = new DetailedCheckoutProductsItemAdapter(new DetailedCheckoutProductsViewHolder$adapter$1(tokenizedAnalytics), buildHandler);
        this.adapter = detailedCheckoutProductsItemAdapter;
        DetailedCheckoutProductsDecorator detailedCheckoutProductsDecorator = new DetailedCheckoutProductsDecorator(0, 0, 0);
        this.decorator = detailedCheckoutProductsDecorator;
        containerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        containerView.setAdapter(detailedCheckoutProductsItemAdapter);
        containerView.addItemDecoration(detailedCheckoutProductsDecorator);
    }

    private final int getSeparatorColor(String separatorColor, String tileColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), separatorColor);
        return parseColor != null ? parseColor.intValue() : styleParser.parseColor(getContext(), tileColor, defaultTileBackground);
    }

    private final DetailedCheckoutProductsDecorator setupDecorator(DetailedCheckoutProductsVO item) {
        DetailedCheckoutProductsDTO.TileItem.Separator separator;
        DetailedCheckoutProductsDecorator detailedCheckoutProductsDecorator = this.decorator;
        DetailedCheckoutProductsVO.TileItem tileItem = (DetailedCheckoutProductsVO.TileItem) C7714v.M(item.getTiles());
        if (tileItem == null || (separator = tileItem.getSeparator()) == null) {
            return detailedCheckoutProductsDecorator;
        }
        Float height = separator.getHeight();
        detailedCheckoutProductsDecorator.setSeparatorHeight(height != null ? UiExtKt.toPx(height.floatValue()) : 0);
        detailedCheckoutProductsDecorator.setSeparatorColor(getSeparatorColor(separator.getColor(), tileItem.getBackgroundColor()));
        detailedCheckoutProductsDecorator.setSeparatorPadding(tileItem.getSpacers().getBetween() + tileItem.getSpacers().getHorizontal() + imageWidth);
        return detailedCheckoutProductsDecorator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DetailedCheckoutProductsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setupDecorator(item);
        DetailedCheckoutProductsItemAdapter.submitList$default(this.adapter, item.getTiles(), null, 2, null);
        this.containerView.invalidateItemDecorations();
    }
}

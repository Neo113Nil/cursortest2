package ru.ozon.app.android.orderdetails.orderTotal.presentation.summary;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderTotalLayoutBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalVO;", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTotalLayoutBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTotalLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "", "bindButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetOrderTotalLayoutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter;", "headersAdapter", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalHeaderAdapter;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter;", "adapter", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalPricesAdapter;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTotalWidgetViewHolder extends k<OrderTotalVO> {

    @NotNull
    private final OrderTotalPricesAdapter adapter;

    @NotNull
    private final WidgetOrderTotalLayoutBinding binding;

    @NotNull
    private final OrderTotalHeaderAdapter headersAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTotalWidgetViewHolder(@NotNull WidgetOrderTotalLayoutBinding binding, @NotNull ComposerReferences composerReferences) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.onAction = buildHandler;
        OrderTotalHeaderAdapter orderTotalHeaderAdapter = new OrderTotalHeaderAdapter();
        this.headersAdapter = orderTotalHeaderAdapter;
        OrderTotalPricesAdapter orderTotalPricesAdapter = new OrderTotalPricesAdapter(buildHandler);
        this.adapter = orderTotalPricesAdapter;
        binding.headerRv.setAdapter(orderTotalHeaderAdapter);
        binding.pricesRv.setAdapter(orderTotalPricesAdapter);
        binding.badgesVrc.setOnAction(buildHandler);
    }

    private final void bindButton(ButtonV3Atom.LargeBorderlessButton button) {
        LargeBorderlessButtonView largeBorderlessButtonView = this.binding.buttonV;
        Intrinsics.f(largeBorderlessButtonView);
        LargeBorderlessButtonHolderKt.bindOrGone(largeBorderlessButtonView, button, this.onAction);
        if (button != null) {
            ViewExtKt.updatePadding$default(largeBorderlessButtonView, 0, 0, 0, 0, 5, null);
            largeBorderlessButtonView.setMinimumHeight(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderTotalVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetOrderTotalLayoutBinding widgetOrderTotalLayoutBinding = this.binding;
        AppCompatImageView imageIv = widgetOrderTotalLayoutBinding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageViewExtKt.load$default(imageIv, item.getHeader().getIcon(), null, null, null, null, false, null, 126, null);
        TextAtomView headerSubtitleTv = widgetOrderTotalLayoutBinding.headerSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(headerSubtitleTv, "headerSubtitleTv");
        TextAtomHolderKt.bind(headerSubtitleTv, item.getHeader().getSubtitle(), this.onAction);
        bindButton(item.getHeader().getButton());
        this.headersAdapter.setLines(item.getHeader().getTitleLines());
        List<AtomDTO> badges = item.getBadges();
        if (badges != null) {
            VerticalRecyclerContainer badgesVrc = widgetOrderTotalLayoutBinding.badgesVrc;
            Intrinsics.checkNotNullExpressionValue(badgesVrc, "badgesVrc");
            ViewExtKt.show(badgesVrc);
            widgetOrderTotalLayoutBinding.badgesVrc.bind(badges);
        } else {
            VerticalRecyclerContainer badgesVrc2 = widgetOrderTotalLayoutBinding.badgesVrc;
            Intrinsics.checkNotNullExpressionValue(badgesVrc2, "badgesVrc");
            ViewExtKt.gone(badgesVrc2);
        }
        List<AbstractPriceBlockVO> prices = item.getPrices();
        if (prices == null) {
            RecyclerView pricesRv = widgetOrderTotalLayoutBinding.pricesRv;
            Intrinsics.checkNotNullExpressionValue(pricesRv, "pricesRv");
            ViewExtKt.gone(pricesRv);
        } else {
            this.adapter.setPrices(prices);
            RecyclerView pricesRv2 = widgetOrderTotalLayoutBinding.pricesRv;
            Intrinsics.checkNotNullExpressionValue(pricesRv2, "pricesRv");
            ViewExtKt.show(pricesRv2);
        }
    }
}

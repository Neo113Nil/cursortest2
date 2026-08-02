package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import BE.a;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.ExtendedPrice;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.ExtendedPriceView;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$TypedPrice;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012J,\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012H\u0002J,\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012H\u0002J,\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012H\u0002J*\u0010\u001e\u001a\u00020\f*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012H\u0002J\f\u0010!\u001a\u00020\f*\u00020\u0010H\u0002J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PdpPriceAdapter;", "", "isSelect", "", "<init>", "(Z)V", "viewPool", "", "", "Lkotlin/Pair;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView;", "submit", "", "parent", "Landroid/view/ViewGroup;", "price", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "onClickAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "buildRegularPriceViews", "regularPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$RegularPrice;", "onAction", "buildOzonCardPriceViews", "ozonCardPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$OzonCardPrice;", "buildVATPriceViews", "vatPrice", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice$VATPrice;", "setActionClickListener", "Landroid/view/View;", "action", "display", "createExtendedPriceView", "context", "Landroid/content/Context;", "id", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpPriceAdapter {
    private final boolean isSelect;

    @NotNull
    private Map<Integer, Pair<ExtendedPriceView, ExtendedPriceView>> viewPool = new LinkedHashMap();
    public static final int $stable = 8;

    public PdpPriceAdapter(boolean z11) {
        this.isSelect = z11;
    }

    private final void buildOzonCardPriceViews(ViewGroup parent, PriceV2VO$TypedPrice.OzonCardPrice ozonCardPrice, Function1<? super AtomAction, Unit> onAction) {
        Pair<ExtendedPriceView, ExtendedPriceView> pair = this.viewPool.get(Integer.valueOf(ozonCardPrice.getId()));
        if (pair != null) {
            ExtendedPriceView e11 = pair.e();
            if (e11 != null) {
                ExtendedPriceViewExtKt.bind$default(e11, ozonCardPrice.getAccentPrice(), 0, 0, 0, "card", 14, (Object) null);
            }
            ExtendedPriceView f7 = pair.f();
            if (f7 != null) {
                ExtendedPriceViewExtKt.bind$default(f7, ozonCardPrice.getRegularPrice(), ExtendedPriceView.INSTANCE.getACCENT_PRICE_PADDING_VERTICAL(), Dimens.INSTANCE.getDP_12(), 0, "nonCard", 8, (Object) null);
            }
        } else {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ExtendedPriceView createExtendedPriceView = createExtendedPriceView(context, R$id.priceBlockAccentPriceV);
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ExtendedPriceView createExtendedPriceView2 = createExtendedPriceView(context2, R$id.priceBlockPriceV);
            ExtendedPriceViewExtKt.bind$default(createExtendedPriceView, ozonCardPrice.getAccentPrice(), 0, 0, 0, "card", 14, (Object) null);
            setActionClickListener(createExtendedPriceView, ozonCardPrice.getAccentPrice().getAction(), onAction);
            ExtendedPriceViewExtKt.bind$default(createExtendedPriceView2, ozonCardPrice.getRegularPrice(), ExtendedPriceView.INSTANCE.getACCENT_PRICE_PADDING_VERTICAL(), Dimens.INSTANCE.getDP_12(), 0, "nonCard", 8, (Object) null);
            setActionClickListener(createExtendedPriceView2, ozonCardPrice.getRegularPrice().getAction(), onAction);
            parent.addView(createExtendedPriceView);
            parent.addView(createExtendedPriceView2);
            this.viewPool.put(Integer.valueOf(ozonCardPrice.getId()), new Pair<>(createExtendedPriceView, createExtendedPriceView2));
        }
        display(ozonCardPrice);
    }

    private final void buildRegularPriceViews(ViewGroup parent, PriceV2VO$TypedPrice.RegularPrice regularPrice, Function1<? super AtomAction, Unit> onAction) {
        Pair<ExtendedPriceView, ExtendedPriceView> pair = this.viewPool.get(Integer.valueOf(regularPrice.getId()));
        if (pair != null) {
            ExtendedPriceView e11 = pair.e();
            if (e11 != null) {
                ExtendedPriceViewExtKt.bind$default(e11, regularPrice.getPrice(), 0, 0, 0, "nonCard", 14, (Object) null);
            }
        } else {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ExtendedPriceView createExtendedPriceView = createExtendedPriceView(context, R$id.priceBlockPriceV);
            ExtendedPriceViewExtKt.bind$default(createExtendedPriceView, regularPrice.getPrice(), 0, 0, 0, "nonCard", 14, (Object) null);
            setActionClickListener(createExtendedPriceView, regularPrice.getPrice().getAction(), onAction);
            parent.addView(createExtendedPriceView);
            this.viewPool.put(Integer.valueOf(regularPrice.getId()), new Pair<>(createExtendedPriceView, null));
        }
        display(regularPrice);
    }

    private final void buildVATPriceViews(ViewGroup parent, PriceV2VO$TypedPrice.VATPrice vatPrice, Function1<? super AtomAction, Unit> onAction) {
        ExtendedPriceView extendedPriceView;
        ExtendedPriceView f7;
        ExtendedPriceView e11;
        Pair<ExtendedPriceView, ExtendedPriceView> pair = this.viewPool.get(Integer.valueOf(vatPrice.getId()));
        if (pair != null) {
            ExtendedPrice priceWithVAT = vatPrice.getPriceWithVAT();
            if (priceWithVAT != null && (e11 = pair.e()) != null) {
                ExtendedPriceViewExtKt.bind$default(e11, priceWithVAT, 0, 0, 0, "vat", 14, (Object) null);
            }
            ExtendedPrice priceWithNoVAT = vatPrice.getPriceWithNoVAT();
            if (priceWithNoVAT != null && (f7 = pair.f()) != null) {
                ExtendedPriceViewExtKt.bind$default(f7, priceWithNoVAT, 0, Dimens.INSTANCE.getDP_12(), 0, "noVat", 10, (Object) null);
            }
        } else {
            ExtendedPrice priceWithVAT2 = vatPrice.getPriceWithVAT();
            ExtendedPriceView extendedPriceView2 = null;
            if (priceWithVAT2 != null) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                extendedPriceView = createExtendedPriceView(context, R$id.priceBlockVATPriceV);
                ExtendedPriceViewExtKt.bind$default(extendedPriceView, priceWithVAT2, 0, 0, 0, "vat", 14, (Object) null);
                setActionClickListener(extendedPriceView, priceWithVAT2.getAction(), onAction);
                parent.addView(extendedPriceView);
            } else {
                extendedPriceView = null;
            }
            ExtendedPrice priceWithNoVAT2 = vatPrice.getPriceWithNoVAT();
            if (priceWithNoVAT2 != null) {
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ExtendedPriceView createExtendedPriceView = createExtendedPriceView(context2, R$id.priceBlockPriceV);
                ExtendedPriceViewExtKt.bind$default(createExtendedPriceView, priceWithNoVAT2, 0, Dimens.INSTANCE.getDP_12(), 0, "noVat", 10, (Object) null);
                setActionClickListener(createExtendedPriceView, priceWithNoVAT2.getAction(), onAction);
                parent.addView(createExtendedPriceView);
                extendedPriceView2 = createExtendedPriceView;
            }
            this.viewPool.put(Integer.valueOf(vatPrice.getId()), new Pair<>(extendedPriceView, extendedPriceView2));
        }
        display(vatPrice);
    }

    private final ExtendedPriceView createExtendedPriceView(Context context, int id2) {
        ExtendedPriceView extendedPriceView = (ExtendedPriceView) q.f64554a.i(N.b(ExtendedPriceView.class), context);
        if (extendedPriceView == null) {
            extendedPriceView = new ExtendedPriceView(context, null, 0, this.isSelect, 6, null);
        }
        extendedPriceView.setId(id2);
        return extendedPriceView;
    }

    private final void display(PriceV2VO$TypedPrice priceV2VO$TypedPrice) {
        for (Map.Entry<Integer, Pair<ExtendedPriceView, ExtendedPriceView>> entry : this.viewPool.entrySet()) {
            boolean z11 = entry.getKey().intValue() == priceV2VO$TypedPrice.getId();
            ExtendedPriceView e11 = entry.getValue().e();
            if (e11 != null) {
                ViewExtKt.showOrGone(e11, Boolean.valueOf(z11));
            }
            ExtendedPriceView f7 = entry.getValue().f();
            if (f7 != null) {
                ViewExtKt.showOrGone(f7, Boolean.valueOf(z11));
            }
        }
    }

    private final void setActionClickListener(View view, AtomAction atomAction, Function1<? super AtomAction, Unit> function1) {
        view.setOnClickListener(atomAction != null ? new a(0, function1, atomAction) : null);
    }

    public final void submit(@NotNull ViewGroup parent, @NotNull PriceV2VO$TypedPrice price, @NotNull Function1<? super AtomAction, Unit> onClickAction) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        if (price instanceof PriceV2VO$TypedPrice.RegularPrice) {
            buildRegularPriceViews(parent, (PriceV2VO$TypedPrice.RegularPrice) price, onClickAction);
        } else if (price instanceof PriceV2VO$TypedPrice.OzonCardPrice) {
            buildOzonCardPriceViews(parent, (PriceV2VO$TypedPrice.OzonCardPrice) price, onClickAction);
        } else {
            if (!(price instanceof PriceV2VO$TypedPrice.VATPrice)) {
                throw new o();
            }
            buildVATPriceViews(parent, (PriceV2VO$TypedPrice.VATPrice) price, onClickAction);
        }
    }
}

package ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImagesAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryVI;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView;", "view", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "adultListDelegate", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryView;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImagesAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryWidgetViewHolder extends k<DeliveryVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultListDelegate<ImageVO> adultListDelegate;

    @NotNull
    private final ImagesAdapter imagesAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final DeliveryView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWidgetViewHolder(@NotNull DeliveryView view, @NotNull AdultListDelegate<ImageVO> adultListDelegate, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.adultListDelegate = adultListDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ImagesAdapter imagesAdapter = new ImagesAdapter(this, buildHandler);
        this.imagesAdapter = imagesAdapter;
        RecyclerView imagesRecyclerView = view.getImagesRecyclerView();
        imagesRecyclerView.setAdapter(imagesAdapter);
        imagesRecyclerView.setLayoutManager(new LinearLayoutManager(imagesRecyclerView.getContext(), 0, false));
        Context context = imagesRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imagesRecyclerView.addItemDecoration(new DeliveryImagesDecoration(context));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(n.a(this.adultListDelegate.observeItems()), new DeliveryWidgetViewHolder$onAttach$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        DeliveryView deliveryView = this.view;
        CellHolderKt.bind(deliveryView.getCellView(), item.getCell(), this.actionHandler);
        this.adultListDelegate.bindItems(item.getImages());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = deliveryView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        deliveryView.setBgColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        int cornerRadius = item.getCornerRadius();
        Context context2 = deliveryView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        deliveryView.setBgCornerRadius(ResourceExtKt.toPx(cornerRadius, context2));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryVI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}

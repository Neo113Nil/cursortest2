package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation;

import EX.a;
import EX.b;
import EX.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.gallery.MaxiTileGalleryAdapter;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.vi.MaxiTileVI;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.view.MaxiTileView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/MaxiTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/view/MaxiTileView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "addToCartButtonsBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/view/MaxiTileView;LWZ/l;Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "", "bindGallery", "()V", "bindMainState", "bindButtons", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/view/MaxiTileView;", "LWZ/l;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter;", "galleryAdapter", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/gallery/MaxiTileGalleryAdapter;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileViewHolder extends k<MaxiTileVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AddToCartButtonsBinder addToCartButtonsBinder;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final MaxiTileGalleryAdapter galleryAdapter;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final MaxiTileView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxiTileViewHolder(@NotNull ComposerReferences refs, @NotNull MaxiTileView view, @NotNull l tokenizedAnalytics, @NotNull AddToCartButtonsBinder addToCartButtonsBinder, @NotNull FrameBinder frameBinder) {
        super(view);
        View view2;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(addToCartButtonsBinder, "addToCartButtonsBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.addToCartButtonsBinder = addToCartButtonsBinder;
        this.frameBinder = frameBinder;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        MaxiTileGalleryAdapter maxiTileGalleryAdapter = new MaxiTileGalleryAdapter(this, tokenizedAnalytics, new MaxiTileViewHolder$galleryAdapter$1(this));
        this.galleryAdapter = maxiTileGalleryAdapter;
        int i11 = 0;
        this.steps = C7714v.b0(new a(this, i11), new b(this, i11));
        view.getGalleryRV().setAdapter(maxiTileGalleryAdapter);
        view.setOnClickListener(new c(this, i11));
        addToCartButtonsBinder.init(tokenizedAnalytics);
        getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.MaxiTileViewHolder.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                MaxiTileViewHolder.this.addToCartButtonsBinder.subscribe();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                MaxiTileViewHolder.this.addToCartButtonsBinder.unsubscribe();
            }
        });
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2));
    }

    private final void bindButtons() {
        MaxiTileVI.MultiButton multiButton;
        MaxiTileVI boundData = getBoundData();
        if (boundData == null || (multiButton = boundData.getMultiButton()) == null) {
            return;
        }
        ButtonV3HolderKt.bindOrGone(this.view.getDetailsBtn(), multiButton.getDetailsButton(), this.actionHandler);
        AddToCartButtonsBinder addToCartButtonsBinder = this.addToCartButtonsBinder;
        AddToCartButtonView addToCartBtn = this.view.getAddToCartBtn();
        AddToCartButtonDTO addToCartButton = multiButton.getAddToCartButton();
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        MaxiTileVI boundData2 = getBoundData();
        addToCartButtonsBinder.bindButtons(addToCartBtn, null, addToCartButton, null, function1, boundData2 != null ? Long.valueOf(boundData2.getId()) : null, null, null, null, null, multiButton.getAddToCartConfig());
    }

    private final void bindGallery() {
        MaxiTileVI.Gallery gallery;
        RecyclerView galleryRV = this.view.getGalleryRV();
        MaxiTileVI boundData = getBoundData();
        if (boundData == null || (gallery = boundData.getGallery()) == null) {
            return;
        }
        this.galleryAdapter.submitList(gallery.getImageItems());
        TestInfo testInfo = gallery.getTestInfo();
        galleryRV.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    private final void bindMainState() {
        MaxiTileVI.MainState mainState;
        MaxiTileView maxiTileView = this.view;
        MaxiTileVI boundData = getBoundData();
        if (boundData == null || (mainState = boundData.getMainState()) == null) {
            return;
        }
        PriceAtomHolderKt.bindOrGone$default(maxiTileView.getPriceView(), mainState.getPrice(), null, 2, null);
        maxiTileView.getLabelListView().bindOrGone(mainState.getLabelList());
        TextHolderKt.bind$default(maxiTileView.getDescriptionView(), mainState.getText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(MaxiTileViewHolder maxiTileViewHolder, View view) {
        AtomAction action;
        MaxiTileVI boundData = maxiTileViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        maxiTileViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(MaxiTileViewHolder maxiTileViewHolder) {
        maxiTileViewHolder.bindMainState();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(MaxiTileViewHolder maxiTileViewHolder) {
        maxiTileViewHolder.bindButtons();
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameBinder.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MaxiTileVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindGallery();
        this.frameBinder.bind(this.steps, item.getViewItemKey());
        MaxiTileView maxiTileView = this.view;
        TestInfo testInfo = item.getTestInfo();
        maxiTileView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MaxiTileVI item, @NotNull W10.c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((MaxiTileViewHolder) item, trackingData, viewedPond);
        MaxiTileVI boundData = getBoundData();
        if (boundData == null || (tokenizedEvent = boundData.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
    }
}

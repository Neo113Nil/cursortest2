package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import Im.a;
import Z.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.G;
import androidx.lifecycle.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import gk0.q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards.ServicePackageCarouselCardDecorator;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards.ServicePackageCarouselCardsAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.extensions.ServicePackageCardViewHelper;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\t\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R0\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "newHeight", "", "setupCardsListHeight", "(I)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "packages", "scrollToSelectedItem", "(Ljava/util/List;)V", "setupScrollListener", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO;", "item", "Lkotlin/Function2;", "cardRequestFocusCallback", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO;Lkotlin/jvm/functions/Function2;)V", "items", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setupCardsList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/B;", "lifecycleScope", "(Landroidx/lifecycle/B;)V", "dp3", "I", "dp4", "dp8", "dp12", "dp16", "Lru/ozon/uni/android/atom/image/Image;", "logo", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "Landroidx/recyclerview/widget/x;", "snapHelper", "Landroidx/recyclerview/widget/x;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardDecorator;", "cardsDecorator", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardDecorator;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardsAdapter;", "cardsAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardsAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "cardsList", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/jvm/functions/Function2;", "", "isFirstBinding", "Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselView extends LinearLayout {
    private Function2<? super Integer, ? super List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> cardRequestFocusCallback;

    @NotNull
    private final ServicePackageCarouselCardsAdapter cardsAdapter;

    @NotNull
    private final ServicePackageCarouselCardDecorator cardsDecorator;

    @NotNull
    private final RecyclerView cardsList;
    private final int dp12;
    private final int dp16;
    private final int dp3;
    private final int dp4;
    private final int dp8;
    private boolean isFirstBinding;

    @NotNull
    private final Image logo;

    @NotNull
    private final x snapHelper;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageCarouselView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(3, context);
        this.dp3 = px;
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(12, context);
        this.dp12 = px3;
        int px4 = ResourceExtKt.toPx(16, context);
        this.dp16 = px4;
        q qVar = q.f64554a;
        Image image = (Image) qVar.i(N.b(Image.class), context);
        if (image == null) {
            context2 = context;
            image = new Image(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        image.setId(R$id.servicePackageCarouselLogo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(px4);
        layoutParams.setMarginEnd(px4);
        image.setLayoutParams(layoutParams);
        addView(image);
        this.logo = image;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.servicePackageCarouselTitle, -1, -2);
        a11.setMargins(px4, px3, px4, 0);
        textAtomV2View.setLayoutParams(a11);
        addView(g10);
        this.title = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        textAtomV2View2.setId(R$id.servicePackageCarouselSubtitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(px4);
        layoutParams2.setMarginEnd(px4);
        textAtomV2View2.setLayoutParams(layoutParams2);
        addView(g11);
        this.subtitle = textAtomV2View2;
        x xVar = new x();
        this.snapHelper = xVar;
        ServicePackageCarouselCardDecorator servicePackageCarouselCardDecorator = new ServicePackageCarouselCardDecorator(context2);
        this.cardsDecorator = servicePackageCarouselCardDecorator;
        ServicePackageCarouselCardsAdapter servicePackageCarouselCardsAdapter = new ServicePackageCarouselCardsAdapter();
        this.cardsAdapter = servicePackageCarouselCardsAdapter;
        RecyclerView recyclerView = new RecyclerView(context2);
        recyclerView.setId(R$id.servicePackageCarouselCardsList);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        recyclerView.setAdapter(servicePackageCarouselCardsAdapter);
        recyclerView.addItemDecoration(servicePackageCarouselCardDecorator);
        xVar.attachToRecyclerView(recyclerView);
        addView(recyclerView);
        this.cardsList = recyclerView;
        this.isFirstBinding = true;
        setOrientation(1);
        setupScrollListener();
        setPadding(0, px, 0, px2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToSelectedItem(List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> packages) {
        Iterator<ServicePackageCarouselVO.ServicePackageCarouselCardVO> it = packages.iterator();
        final int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getIsActive()) {
                break;
            } else {
                i11++;
            }
        }
        if (!this.isFirstBinding) {
            this.cardsList.smoothScrollToPosition(i11);
            return;
        }
        this.isFirstBinding = false;
        final RecyclerView recyclerView = this.cardsList;
        G.a(recyclerView, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselView$scrollToSelectedItem$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2;
                RecyclerView recyclerView3;
                int i12;
                RecyclerView recyclerView4;
                recyclerView2 = this.cardsList;
                int width = recyclerView2.getWidth();
                ServicePackageCardViewHelper.Companion companion = ServicePackageCardViewHelper.INSTANCE;
                recyclerView3 = this.cardsList;
                int cardWidth = (width - companion.getCardWidth(recyclerView3)) / 2;
                i12 = this.dp4;
                int i13 = cardWidth - i12;
                recyclerView4 = this.cardsList;
                RecyclerView.o layoutManager = recyclerView4.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPositionWithOffset(i11, i13);
                }
            }
        });
    }

    private final void setupScrollListener() {
        this.cardsList.addOnScrollListener(new ServicePackageCarouselView$setupScrollListener$1(this));
    }

    public final void bind(@NotNull ServicePackageCarouselVO item, @NotNull Function2<? super Integer, ? super List<ServicePackageCarouselVO.ServicePackageCarouselCardVO>, Unit> cardRequestFocusCallback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(cardRequestFocusCallback, "cardRequestFocusCallback");
        this.cardRequestFocusCallback = cardRequestFocusCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            ImageHolderKt.bind$default(this.logo, item.getTravelLogo().getDark(), null, 2, null);
        } else {
            ImageHolderKt.bind$default(this.logo, item.getTravelLogo().getLight(), null, 2, null);
        }
        TextHolderKt.bindOrGone$default(this.title, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitle, item.getSubtitle(), null, 2, null);
        this.cardsAdapter.setCardOnFocusCallback(cardRequestFocusCallback);
    }

    public final void setupCardsList(@NotNull List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> items, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.cardsAdapter.setActionHandler(actionHandler);
        this.cardsAdapter.submitList(items, new f(4, this, items));
    }

    public final void setupCardsListHeight(@NotNull B lifecycleScope) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$default(this.cardsList, new ServicePackageCarouselView$setupCardsListHeight$1(ServicePackageCardViewHelper.INSTANCE), lifecycleScope, 0, new ServicePackageCarouselView$setupCardsListHeight$2(this), 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCardsListHeight(int newHeight) {
        if (newHeight == this.cardsList.getHeight()) {
            return;
        }
        RecyclerView recyclerView = this.cardsList;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = newHeight;
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}

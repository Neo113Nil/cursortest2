package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view;

import Bi.b;
import DG.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.adapter.CardsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.adapter.CardsDecoration;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010*J3\u00103\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010N\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010MR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010OR$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010PR\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsAdapter;", "cardsAdapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "sharedViewPool", "", "setupRecyclerView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsAdapter;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Landroid/os/Parcelable;", "getCardsRvState", "()Landroid/os/Parcelable;", "state", "setCardsRvState", "(Landroid/os/Parcelable;)Lkotlin/Unit;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;", "vo", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "bindSubtitle", "", "topMargin", "bindCardTopMargin", "(I)V", "action", "bindAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "bindCards", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "showPlaceholder", "()V", "hidePlaceholder", "", "backgroundImage", "backgroundToken", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "backgroundGradient", "", "cornerRadius", "bindBackground", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/uikitsdk/Color$Gradient;F)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsDecoration;", "cardsItemDecoration", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsDecoration;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesPlaceholderView;", "placeholderView$delegate", "LSc/j;", "getPlaceholderView", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesPlaceholderView;", "placeholderView", "placeholderDrawable$delegate", "getPlaceholderDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "placeholderDrawable", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsAdapter;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "wasPlaceholderShowed", "Z", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsHorizontalShelvesView extends ConstraintLayout {
    private AtomAction action;

    @NotNull
    private final AppCompatImageView backgroundImageView;
    private CardsAdapter cardsAdapter;

    @NotNull
    private final CardsDecoration cardsItemDecoration;

    @NotNull
    private final GradientDrawable gradientDrawable;
    private Function1<? super AtomAction, Unit> onAction;

    /* renamed from: placeholderDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j placeholderDrawable;

    /* renamed from: placeholderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j placeholderView;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;
    private boolean wasPlaceholderShowed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsHorizontalShelvesView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.hotelsHorizontalShelvesTitleTav, 0, -2);
        d11.f41656t = 0;
        d11.f41658v = 0;
        d11.f41636i = 0;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.hotelsHorizontalShelvesSubtitleTav, 0, -2);
        d12.f41656t = 0;
        d12.f41658v = 0;
        d12.f41638j = textAtomV2View.getId();
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitle = textAtomV2View2;
        CardsDecoration cardsDecoration = new CardsDecoration(context);
        this.cardsItemDecoration = cardsDecoration;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.hotelsHorizontalShelvesRv);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = textAtomV2View2.getId();
        bVar.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(16, context);
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(cardsDecoration);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.recyclerView = recyclerView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) Bl.b.a(AppCompatImageView.class, "type", qVar, null);
        appCompatImageView = appCompatImageView == null ? new AppCompatImageView(context) : appCompatImageView;
        appCompatImageView.setId(R$id.hotelsHorizontalShelvesBackgroundIv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        appCompatImageView.setLayoutParams(bVar2);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.backgroundImageView = appCompatImageView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        this.placeholderView = LazyUtilsKt.unsafeLazy(new HotelsHorizontalShelvesView$placeholderView$2(context, this));
        this.placeholderDrawable = LazyUtilsKt.unsafeLazy(new HotelsHorizontalShelvesView$placeholderDrawable$2(context));
        setClipChildren(true);
        setClipToOutline(true);
        addView(appCompatImageView);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(recyclerView);
        setOnClickListener(new a(this, 11));
        setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(HotelsHorizontalShelvesView hotelsHorizontalShelvesView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = hotelsHorizontalShelvesView.action;
        if (atomAction == null || (function1 = hotelsHorizontalShelvesView.onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final GradientDrawable getPlaceholderDrawable() {
        return (GradientDrawable) this.placeholderDrawable.getValue();
    }

    private final HotelsHorizontalShelvesPlaceholderView getPlaceholderView() {
        return (HotelsHorizontalShelvesPlaceholderView) this.placeholderView.getValue();
    }

    public final void bind(@NotNull HotelsHorizontalShelvesVO.Loaded vo, @NotNull AnalyticData analyticData, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        bindBackground(vo.getBackgroundImage(), vo.getBackgroundToken(), vo.getBackgroundGradient(), vo.getCornerRadius());
        bindTitle(vo.getTitle());
        bindSubtitle(vo.getSubtitle());
        bindCardTopMargin(vo.getCardsTopMargin());
        bindCards(vo, analyticData);
        bindAction(vo.getAtomAction());
        this.onAction = onAction;
    }

    public final void bindAction(AtomAction action) {
        this.action = action;
    }

    public final void bindBackground(String backgroundImage, String backgroundToken, Color.Gradient backgroundGradient, float cornerRadius) {
        GradientDrawable gradientDrawable = this.gradientDrawable;
        Color.Gradient gradient = null;
        gradientDrawable.setColors(null);
        gradientDrawable.setCornerRadius(cornerRadius);
        this.backgroundImageView.setVisibility(backgroundImage != null ? 0 : 8);
        if (backgroundImage != null) {
            ImageViewExtKt.load$default(this.backgroundImageView, backgroundImage, null, null, null, null, false, null, 126, null);
        }
        if (backgroundToken != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(backgroundToken);
            if (gradientByToken != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradient = TokensExtKt.toGradient(gradientByToken, context);
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context2, backgroundToken);
            int intValue = parseColor != null ? parseColor.intValue() : 0;
            if (gradient != null) {
                gradient.applyTo(this.gradientDrawable);
            } else {
                this.gradientDrawable.setColor(intValue);
            }
        }
        if (backgroundGradient != null) {
            backgroundGradient.applyTo(this.gradientDrawable);
        }
    }

    public final void bindCardTopMargin(int topMargin) {
        ViewExtensionsKt.safeUpdateMargins$default(this.recyclerView, Integer.valueOf(topMargin), null, null, null, 14, null);
    }

    public final void bindCards(@NotNull HotelsHorizontalShelvesVO.Loaded vo, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.cardsItemDecoration.updateOffsets(vo.getCardOptions().getOuterCardsMargins(), vo.getCardOptions().getGap());
        CardsAdapter cardsAdapter = this.cardsAdapter;
        if (cardsAdapter != null) {
            cardsAdapter.setAnalyticsData(analyticData);
        }
        CardsAdapter cardsAdapter2 = this.cardsAdapter;
        if (cardsAdapter2 != null) {
            cardsAdapter2.submitList(vo.getCards());
        }
    }

    public final void bindSubtitle(TextDTO vo) {
        TextHolderKt.bindOrGone$default(this.subtitle, vo, null, 2, null);
    }

    public final void bindTitle(TextDTO vo) {
        TextHolderKt.bindOrGone$default(this.title, vo, null, 2, null);
    }

    public final Parcelable getCardsRvState() {
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.onSaveInstanceState();
        }
        return null;
    }

    public final void hidePlaceholder() {
        if (this.wasPlaceholderShowed) {
            getPlaceholderView().setVisibility(8);
            this.wasPlaceholderShowed = false;
        }
        this.backgroundImageView.setVisibility(0);
        this.title.setVisibility(0);
        this.subtitle.setVisibility(0);
        this.recyclerView.setVisibility(0);
        setBackground(this.gradientDrawable);
    }

    public final Unit setCardsRvState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        layoutManager.onRestoreInstanceState(state);
        return Unit.f71690a;
    }

    public final void setupRecyclerView(@NotNull CardsAdapter cardsAdapter, @NotNull RecyclerView.u sharedViewPool) {
        Intrinsics.checkNotNullParameter(cardsAdapter, "cardsAdapter");
        Intrinsics.checkNotNullParameter(sharedViewPool, "sharedViewPool");
        this.cardsAdapter = cardsAdapter;
        this.recyclerView.setAdapter(cardsAdapter);
        this.recyclerView.setRecycledViewPool(sharedViewPool);
    }

    public final void showPlaceholder() {
        getPlaceholderView().setVisibility(0);
        this.wasPlaceholderShowed = true;
        this.backgroundImageView.setVisibility(8);
        this.title.setVisibility(8);
        this.subtitle.setVisibility(8);
        this.recyclerView.setVisibility(8);
        setBackground(getPlaceholderDrawable());
    }
}

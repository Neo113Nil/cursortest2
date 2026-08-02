package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view;

import Ef0.c;
import Ey.ViewOnClickListenerC2975b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.presentation.BuyTogetherVO;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.adapter.BuyTogetherAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.adapter.BuyTogetherItemDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0015\b\u0001\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\"\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aJ\u0006\u0010 \u001a\u00020\u001cJ\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u001cJ\b\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\b\u0010&\u001a\u00020\u000eH\u0002J\b\u0010'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "offset", "", "buttonPadding", "allServicesButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "titleTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "servicesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherPlaceholderView;", "buyTogetherAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/adapter/BuyTogetherAdapter;", "lastSeenItemPosition", "onScrollListener", "ru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherView$onScrollListener$1", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherView$onScrollListener$1;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAttachedToWindow", "onDetachedFromWindow", "bind", "showContent", "hideContent", "showProgress", "hideProgress", "createAllServicesButton", "createTitleTextView", "createServicesRecyclerView", "createPlaceholder", "setUpRoot", "setUpRecyclerView", "resetAllServicesButtonMinimumHeight", "setAllServicesButtonPaddings", "addScrollListener", "removeScrollListener", "changeContentVisibility", "isVisible", "", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BuyTogetherView extends ConstraintLayout {

    @NotNull
    private final SmallBorderlessButtonView allServicesButton;
    private final int buttonPadding;

    @NotNull
    private final BuyTogetherAdapter buyTogetherAdapter;
    private BuyTogetherVO.Loaded item;
    private int lastSeenItemPosition;
    private final int offset;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final BuyTogetherView$onScrollListener$1 onScrollListener;

    @NotNull
    private final BuyTogetherPlaceholderView placeholder;

    @NotNull
    private final RecyclerView servicesRecyclerView;

    @NotNull
    private final TextAtomView titleTextView;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherView$onScrollListener$1] */
    public BuyTogetherView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.offset = ResourceExtKt.toPx(16, context);
        this.buttonPadding = ResourceExtKt.toPx(8, context);
        SmallBorderlessButtonView createAllServicesButton = createAllServicesButton();
        this.allServicesButton = createAllServicesButton;
        TextAtomView createTitleTextView = createTitleTextView();
        this.titleTextView = createTitleTextView;
        RecyclerView createServicesRecyclerView = createServicesRecyclerView();
        this.servicesRecyclerView = createServicesRecyclerView;
        BuyTogetherPlaceholderView createPlaceholder = createPlaceholder();
        this.placeholder = createPlaceholder;
        this.buyTogetherAdapter = new BuyTogetherAdapter(new BuyTogetherView$buyTogetherAdapter$1(this));
        this.onScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherView$onScrollListener$1
            /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
            
                r1 = r4.this$0.onAction;
             */
            @Override // androidx.recyclerview.widget.RecyclerView.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int i11;
                int i12;
                BuyTogetherVO.Loaded loaded;
                List<BuyTogetherVO.Loaded.ServiceVO> services;
                BuyTogetherVO.Loaded.ServiceVO serviceVO;
                Map<String, TokenizedTrackingInfo> trackingInfo;
                Function1 function1;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return;
                }
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                i11 = BuyTogetherView.this.lastSeenItemPosition;
                if (i11 <= findLastCompletelyVisibleItemPosition) {
                    while (true) {
                        loaded = BuyTogetherView.this.item;
                        if (loaded != null && (services = loaded.getServices()) != null && (serviceVO = (BuyTogetherVO.Loaded.ServiceVO) C7714v.Q(i11, services)) != null && (trackingInfo = serviceVO.getTrackingInfo()) != null && function1 != null) {
                            function1.invoke(new AtomAction.ViewAction(trackingInfo, null, 2, null));
                        }
                        if (i11 == findLastCompletelyVisibleItemPosition) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                i12 = BuyTogetherView.this.lastSeenItemPosition;
                if (findLastCompletelyVisibleItemPosition > i12) {
                    BuyTogetherView.this.lastSeenItemPosition = findLastCompletelyVisibleItemPosition;
                }
            }
        };
        setUpRoot();
        setUpRecyclerView();
        addView(createAllServicesButton);
        addView(createTitleTextView);
        addView(createServicesRecyclerView);
        addView(createPlaceholder);
    }

    private final void addScrollListener() {
        this.servicesRecyclerView.addOnScrollListener(this.onScrollListener);
    }

    private final void changeContentVisibility(boolean isVisible) {
        this.allServicesButton.setVisibility(isVisible ? 0 : 8);
        this.titleTextView.setVisibility(isVisible ? 0 : 8);
        this.servicesRecyclerView.setVisibility(isVisible ? 0 : 8);
    }

    private final SmallBorderlessButtonView createAllServicesButton() {
        q qVar = q.f64554a;
        d b11 = N.b(SmallBorderlessButtonView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) qVar.g(b11, context);
        smallBorderlessButtonView.setId(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.setMarginEnd(this.offset);
        smallBorderlessButtonView.setLayoutParams(bVar);
        return smallBorderlessButtonView;
    }

    private final BuyTogetherPlaceholderView createPlaceholder() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BuyTogetherPlaceholderView buyTogetherPlaceholderView = new BuyTogetherPlaceholderView(context);
        buyTogetherPlaceholderView.setId(4);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        bVar.setMarginStart(this.offset);
        bVar.setMarginEnd(this.offset);
        buyTogetherPlaceholderView.setLayoutParams(bVar);
        return buyTogetherPlaceholderView;
    }

    private final RecyclerView createServicesRecyclerView() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(3);
        recyclerView.setNestedScrollingEnabled(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = this.titleTextView.getId();
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(8, context);
        recyclerView.setLayoutParams(bVar);
        recyclerView.setNestedScrollingEnabled(false);
        return recyclerView;
    }

    private final TextAtomView createTitleTextView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
        ConstraintLayout.b b12 = c.b(textAtomView, 2, 0, -2);
        b12.f41656t = 0;
        b12.f41657u = this.allServicesButton.getId();
        b12.f41644m = this.allServicesButton.getId();
        b12.setMarginStart(this.offset);
        b12.setMarginEnd(this.offset);
        textAtomView.setLayoutParams(b12);
        return textAtomView;
    }

    private final void removeScrollListener() {
        this.servicesRecyclerView.removeOnScrollListener(this.onScrollListener);
    }

    private final void resetAllServicesButtonMinimumHeight() {
        this.allServicesButton.setMinimumHeight(0);
    }

    private final void setAllServicesButtonPaddings() {
        SmallBorderlessButtonView smallBorderlessButtonView = this.allServicesButton;
        int i11 = this.buttonPadding;
        smallBorderlessButtonView.setPadding(i11, i11, i11, i11);
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.servicesRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.buyTogetherAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new BuyTogetherItemDecoration(context));
    }

    private final void setUpRoot() {
        setOnClickListener(new ViewOnClickListenerC2975b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRoot$lambda$9(BuyTogetherView buyTogetherView, View view) {
        AtomAction allServicesAction;
        Function1<? super AtomAction, Unit> function1;
        BuyTogetherVO.Loaded loaded = buyTogetherView.item;
        if (loaded == null || (allServicesAction = loaded.getAllServicesAction()) == null || (function1 = buyTogetherView.onAction) == null) {
            return;
        }
        function1.invoke(allServicesAction);
    }

    public final void bind(@NotNull BuyTogetherVO.Loaded item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.lastSeenItemPosition = 0;
        this.item = item;
        this.onAction = onAction;
        TextAtomHolderKt.bind$default(this.titleTextView, item.getTitle(), null, 2, null);
        WrappedBorderlessButtonHolderKt.bind(this.allServicesButton, item.getAllServicesButton(), onAction);
        resetAllServicesButtonMinimumHeight();
        setAllServicesButtonPaddings();
        this.buyTogetherAdapter.setItems(item.getServices());
    }

    public final void hideContent() {
        changeContentVisibility(false);
    }

    public final void hideProgress() {
        this.placeholder.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addScrollListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeScrollListener();
        super.onDetachedFromWindow();
    }

    public final void showContent() {
        changeContentVisibility(true);
    }

    public final void showProgress() {
        this.placeholder.setVisibility(0);
    }
}

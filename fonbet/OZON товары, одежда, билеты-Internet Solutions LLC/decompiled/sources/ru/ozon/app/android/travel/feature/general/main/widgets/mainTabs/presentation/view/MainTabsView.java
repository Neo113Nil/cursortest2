package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.view;

import B90.V;
import Bi.a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.core.view.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.MainTabsVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.adapter.MainTabsAdapter;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.adapter.MainTabsDecoration;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00158\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0017\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/view/MainTabsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "alignTabsContentToCenter", "()V", "setUpRecyclerView", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "setRecyclerViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "", "dp16", "I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "tabsMargin", "setTabsMargin", "(I)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/adapter/MainTabsDecoration;", "decorator", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/adapter/MainTabsDecoration;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subTitleTextView", "Landroidx/recyclerview/widget/RecyclerView;", "tabsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/adapter/MainTabsAdapter;", "tabsAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/adapter/MainTabsAdapter;", "Lkotlin/jvm/functions/Function1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainTabsView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final MainTabsDecoration decorator;
    private final int dp16;

    @NotNull
    private final TextAtomV2View subTitleTextView;

    @NotNull
    private final MainTabsAdapter tabsAdapter;
    private int tabsMargin;

    @NotNull
    private final RecyclerView tabsRecyclerView;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainTabsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        this.tabsMargin = UiExtKt.toPx(4, context);
        MainTabsDecoration mainTabsDecoration = new MainTabsDecoration();
        mainTabsDecoration.setTabsMargin(this.tabsMargin);
        this.decorator = mainTabsDecoration;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(px, UiExtKt.toPx(10, context), px, 0);
        textAtomV2View.setLayoutParams(layoutParams);
        this.titleTextView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        a.d(-2, -2, textAtomV2View2);
        this.subTitleTextView = textAtomV2View2;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = UiExtKt.toPx(26, context);
        layoutParams2.bottomMargin = UiExtKt.toPx(12, context);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setPadding(px, recyclerView.getPaddingTop(), px, recyclerView.getPaddingBottom());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setNestedScrollingEnabled(false);
        this.tabsRecyclerView = recyclerView;
        this.tabsAdapter = new MainTabsAdapter(new MainTabsView$tabsAdapter$1(this));
        setOrientation(1);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(recyclerView);
        setUpRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alignTabsContentToCenter() {
        final RecyclerView recyclerView = this.tabsRecyclerView;
        G.a(recyclerView, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation.view.MainTabsView$alignTabsContentToCenter$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2;
                int i11;
                RecyclerView recyclerView3;
                RecyclerView recyclerView4;
                RecyclerView recyclerView5;
                recyclerView2 = this.tabsRecyclerView;
                int computeHorizontalScrollRange = recyclerView2.computeHorizontalScrollRange();
                i11 = this.dp16;
                int i12 = (i11 * 2) + computeHorizontalScrollRange;
                recyclerView3 = this.tabsRecyclerView;
                int width = i12 - recyclerView3.getWidth();
                if (width > 0) {
                    recyclerView4 = this.tabsRecyclerView;
                    int computeHorizontalScrollOffset = recyclerView4.computeHorizontalScrollOffset();
                    recyclerView5 = this.tabsRecyclerView;
                    recyclerView5.scrollBy((width / 2) - computeHorizontalScrollOffset, 0);
                }
            }
        });
    }

    private final void setTabsMargin(int i11) {
        this.tabsMargin = i11;
        this.decorator.setTabsMargin(i11);
        this.tabsRecyclerView.invalidateItemDecorations();
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.tabsRecyclerView;
        recyclerView.setAdapter(this.tabsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(this.decorator);
        recyclerView.setItemAnimator(null);
    }

    public final void bind(@NotNull MainTabsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        if (item.getTabsSpace() != this.tabsMargin) {
            setTabsMargin(item.getTabsSpace());
        }
        TextHolderKt.bind$default(this.titleTextView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subTitleTextView, item.getSubtitle(), null, 2, null);
        this.tabsAdapter.setItems(item.getTabs(), new V(this, 5));
        this.actionHandler = actionHandler;
    }

    public final void setRecyclerViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.tabsRecyclerView.setRecycledViewPool(pool);
    }
}

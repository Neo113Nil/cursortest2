package ru.ozon.app.android.search.widgets.history.search.presentation;

import F3.G;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\b\u0010\u001f\u001a\u00020\u001cH\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleTextAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTextAtomView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "clearButtonAtomView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getClearButtonAtomView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "itemsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getItemsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "historyTagLayout", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout;", "getHistoryTagLayout", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryFlexLayout;", "placeViews", "", "paddings", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings$HistoryPaddings;", "addViews", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryView extends ConstraintLayout {
    private static final int HISTORY_ITEM_PADDING;
    private static final int containerBottomPadding;
    private static final int containerHorizontalPadding;
    private static final int dp4;
    private static final int dp8;

    @NotNull
    private final ButtonV3View clearButtonAtomView;

    @NotNull
    private final HistoryFlexLayout historyTagLayout;

    @NotNull
    private final RecyclerView itemsRecyclerView;

    @NotNull
    private final TextAtomV2View titleTextAtomView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView$Companion;", "", "<init>", "()V", "ITEMS_RECYCLERVIEW_LOCATOR", "", "dp4", "", "dp8", "containerHorizontalPadding", "containerBottomPadding", "HISTORY_ITEM_PADDING", "getHISTORY_ITEM_PADDING", "()I", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getHISTORY_ITEM_PADDING() {
            return HistoryView.HISTORY_ITEM_PADDING;
        }

        private Companion() {
        }
    }

    static {
        int px = UiExtKt.toPx(4);
        dp4 = px;
        dp8 = UiExtKt.toPx(8);
        containerHorizontalPadding = UiExtKt.toPx(16);
        containerBottomPadding = UiExtKt.toPx(16);
        HISTORY_ITEM_PADDING = px;
    }

    public /* synthetic */ HistoryView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTextAtomView);
        addView(this.clearButtonAtomView);
        addView(this.itemsRecyclerView);
        addView(this.historyTagLayout);
    }

    public static /* synthetic */ void placeViews$default(HistoryView historyView, HistoryVO.PresentationSettings.HistoryPaddings historyPaddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            historyPaddings = null;
        }
        historyView.placeViews(historyPaddings);
    }

    @NotNull
    public final ButtonV3View getClearButtonAtomView() {
        return this.clearButtonAtomView;
    }

    @NotNull
    public final HistoryFlexLayout getHistoryTagLayout() {
        return this.historyTagLayout;
    }

    @NotNull
    public final RecyclerView getItemsRecyclerView() {
        return this.itemsRecyclerView;
    }

    @NotNull
    public final TextAtomV2View getTitleTextAtomView() {
        return this.titleTextAtomView;
    }

    public final void placeViews(HistoryVO.PresentationSettings.HistoryPaddings paddings) {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, this.titleTextAtomView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTextAtomView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, this.clearButtonAtomView.getId(), 0, dp4);
        ConstraintSetExtKt.topToTop(dVar, this.clearButtonAtomView.getId(), 0, dp8);
        int id2 = this.itemsRecyclerView.getId();
        int i11 = containerHorizontalPadding;
        int i12 = HISTORY_ITEM_PADDING;
        ConstraintSetExtKt.startToStart(dVar, id2, 0, i11 - i12);
        ConstraintSetExtKt.endToEnd(dVar, this.itemsRecyclerView.getId(), 0, i11 - i12);
        ConstraintSetExtKt.topToBottom$default(dVar, this.itemsRecyclerView.getId(), this.titleTextAtomView.getId(), 0, 4, null);
        int id3 = this.itemsRecyclerView.getId();
        int i13 = containerBottomPadding;
        ConstraintSetExtKt.bottomToBottom(dVar, id3, 0, i13 - i12);
        ConstraintSetExtKt.startToStart(dVar, this.historyTagLayout.getId(), 0, (paddings != null ? paddings.getPaddingLeft() : i11) - (paddings != null ? paddings.getColumnGap() : i12));
        int id4 = this.historyTagLayout.getId();
        if (paddings != null) {
            i11 = paddings.getPaddingRight();
        }
        ConstraintSetExtKt.endToEnd(dVar, id4, 0, i11 - (paddings != null ? paddings.getColumnGap() : i12));
        ConstraintSetExtKt.topToBottom$default(dVar, this.historyTagLayout.getId(), this.titleTextAtomView.getId(), 0, 4, null);
        int id5 = this.historyTagLayout.getId();
        if (paddings != null) {
            i13 = paddings.getPaddingBottom();
        }
        if (paddings != null) {
            i12 = paddings.getRowGap();
        }
        ConstraintSetExtKt.bottomToBottom(dVar, id5, 0, i13 - i12);
        dVar.f(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View, R$id.titleTextAtomView, -2, -2);
        textAtomV2View.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextAtomView = textAtomV2View;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(R$id.clearBtnAtomView);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.clearButtonAtomView = buttonV3View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.itemsRecyclerView);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setLayoutManager(new FlexboxLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setContentDescription("itemsRecyclerView");
        this.itemsRecyclerView = recyclerView;
        HistoryFlexLayout historyFlexLayout = new HistoryFlexLayout(context, null, 0, 6, null);
        historyFlexLayout.setId(R$id.historyTagLayout);
        historyFlexLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        historyFlexLayout.setContentDescription("itemsRecyclerView");
        this.historyTagLayout = historyFlexLayout;
        addViews();
        placeViews$default(this, null, 1, null);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}

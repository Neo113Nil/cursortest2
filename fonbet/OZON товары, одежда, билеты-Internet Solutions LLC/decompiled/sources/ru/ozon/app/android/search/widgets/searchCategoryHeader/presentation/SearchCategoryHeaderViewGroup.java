package ru.ozon.app.android.search.widgets.searchCategoryHeader.presentation;

import Am.C2438a;
import B90.C2618u;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "updateConstraints", "()V", "updateProductsTotalVerticalConstraints", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/SearchCategoryHeaderVO;Lkotlin/jvm/functions/Function1;)V", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "dp4", "I", "dp6", "dp8", "dp16", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/CategoryNameTextView;", "categoryName", "Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/CategoryNameTextView;", "getCategoryName", "()Lru/ozon/app/android/search/widgets/searchCategoryHeader/presentation/CategoryNameTextView;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "productsTotal", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "searchEverywhereButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchCategoryHeaderViewGroup extends ConstraintLayout {
    private final AttributeSet attrs;

    @NotNull
    private final CategoryNameTextView categoryName;
    private final int dp16;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final TextAtomView productsTotal;

    @NotNull
    private final ButtonV3View searchEverywhereButton;

    public /* synthetic */ SearchCategoryHeaderViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void updateConstraints() {
        d dVar = new d();
        dVar.p(this);
        dVar.t(this.categoryName.getId(), 6, 0, 6, this.dp16);
        dVar.t(this.categoryName.getId(), 3, 0, 3, this.dp8);
        dVar.t(this.categoryName.getId(), 7, 0, 7, this.dp16);
        dVar.t(this.productsTotal.getId(), 6, 0, 6, this.dp16);
        dVar.s(this.productsTotal.getId(), 7, this.searchEverywhereButton.getId(), 6);
        dVar.t(this.searchEverywhereButton.getId(), 7, 0, 7, this.dp4);
        dVar.s(this.searchEverywhereButton.getId(), 6, this.productsTotal.getId(), 7);
        dVar.s(this.searchEverywhereButton.getId(), 3, this.categoryName.getId(), 4);
        dVar.f(this);
    }

    private final void updateProductsTotalVerticalConstraints() {
        if (this.searchEverywhereButton.getVisibility() != 0) {
            d dVar = new d();
            dVar.p(this);
            dVar.t(this.productsTotal.getId(), 3, this.categoryName.getId(), 4, this.dp6);
            dVar.f(this);
            return;
        }
        d dVar2 = new d();
        dVar2.p(this);
        dVar2.s(this.productsTotal.getId(), 3, this.searchEverywhereButton.getId(), 3);
        dVar2.s(this.productsTotal.getId(), 4, this.searchEverywhereButton.getId(), 4);
        dVar2.f(this);
    }

    public final void bind(@NotNull SearchCategoryHeaderVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.categoryName.bind(item.getCategoryName());
        this.categoryName.setLetterSpacing(0.0f);
        TextAtomHolderKt.bind$default(this.productsTotal, item.getProductsTotal(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(this.searchEverywhereButton, item.getSearchEverywhereButton(), actionHandler);
        updateProductsTotalVerticalConstraints();
    }

    @NotNull
    public final CategoryNameTextView getCategoryName() {
        return this.categoryName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCategoryHeaderViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.attrs = attributeSet;
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        q qVar = q.f64554a;
        CategoryNameTextView categoryNameTextView = (CategoryNameTextView) qVar.i(N.b(CategoryNameTextView.class), context);
        if (categoryNameTextView == null) {
            context2 = context;
            categoryNameTextView = new CategoryNameTextView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        categoryNameTextView.setId(R$id.searchCategoryHeaderTitle);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41598E = 0.0f;
        bVar.f41616W = true;
        categoryNameTextView.setLayoutParams(bVar);
        categoryNameTextView.setGravity(8388611);
        this.categoryName = categoryNameTextView;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context2);
        C2438a.e(textAtomView, R$id.searchCategoryHeaderProductsTotal, 0, -2);
        this.productsTotal = textAtomView;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context2);
        Context context3 = context2;
        buttonV3View = buttonV3View == null ? new ButtonV3View(context3, null, 0, 0, 14, null) : buttonV3View;
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.searchCategoryHeaderSearchEverywhere, -2, -2);
        buttonV3View.setMaxWidth(buttonV3View.getResources().getDisplayMetrics().widthPixels / 2);
        buttonV3View.setLayoutParams(e11);
        this.searchEverywhereButton = buttonV3View;
        setBackgroundColor(context3.getColor(R$color.layer_floor_1));
        addView(categoryNameTextView);
        addView(textAtomView);
        addView(buttonV3View);
        updateConstraints();
    }
}

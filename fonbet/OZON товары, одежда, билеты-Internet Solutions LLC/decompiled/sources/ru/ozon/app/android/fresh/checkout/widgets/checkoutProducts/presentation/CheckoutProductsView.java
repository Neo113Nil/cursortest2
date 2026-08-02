package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation;

import Hj.C3143a;
import WZ.l;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p7.C8868a;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain.CheckoutProductsVO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview.CheckoutProductsAdapter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/CheckoutProductsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Landroidx/recyclerview/widget/RecyclerView;", "checkoutProductsList", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductsAdapter;", "checkoutProductsAdapter", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/recyclerview/CheckoutProductsAdapter;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutProductsView extends ConstraintLayout {
    private CheckoutProductsAdapter checkoutProductsAdapter;

    @NotNull
    private final RecyclerView checkoutProductsList;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float WIDGET_RADIUS = ResourceExtKt.toPxF(24);
    private static final int START_SEPARATOR_MARGIN = ResourceExtKt.toPx(16);
    private static final int SEPARATOR_THICKNESS = ResourceExtKt.toPx(1);
    private static final int VERTICAL_PADDING = ResourceExtKt.toPx(1);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/CheckoutProductsView$Companion;", "", "<init>", "()V", "", "WIDGET_RADIUS", "F", "getWIDGET_RADIUS", "()F", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getWIDGET_RADIUS() {
            return CheckoutProductsView.WIDGET_RADIUS;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutProductsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull CheckoutProductsVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        if (this.checkoutProductsList.getAdapter() == null) {
            CheckoutProductsAdapter checkoutProductsAdapter = new CheckoutProductsAdapter(actionHandler, tokenizedAnalytics);
            this.checkoutProductsAdapter = checkoutProductsAdapter;
            this.checkoutProductsList.setAdapter(checkoutProductsAdapter);
        }
        CheckoutProductsAdapter checkoutProductsAdapter2 = this.checkoutProductsAdapter;
        if (checkoutProductsAdapter2 != null) {
            checkoutProductsAdapter2.submitList(item.getItems());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutProductsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        recyclerView.setLayoutParams(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        C8868a c8868a = new C8868a(context);
        c8868a.b(START_SEPARATOR_MARGIN);
        c8868a.c(SEPARATOR_THICKNESS);
        c8868a.a(a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId()));
        c8868a.d();
        recyclerView.addItemDecoration(c8868a);
        addView(recyclerView);
        this.checkoutProductsList = recyclerView;
        setId(R$id.checkoutProductsView);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i12 = VERTICAL_PADDING;
        ViewExtKt.updatePadding$default(this, 0, i12, 0, i12, 5, null);
        setBackgroundColor(a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.CheckoutProductsView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), CheckoutProductsView.Companion.getWIDGET_RADIUS());
            }
        });
    }
}

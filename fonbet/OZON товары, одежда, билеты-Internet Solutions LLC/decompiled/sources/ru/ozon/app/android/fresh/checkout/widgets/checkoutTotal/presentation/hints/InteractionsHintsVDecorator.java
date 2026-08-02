package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.hints;

import T7.P;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hk0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/InteractionsHintsVDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "view", "", "isLastItem", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Z", "isFirstItem", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InteractionsHintsVDecorator extends RecyclerView.n {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp4 = UiExtKt.toPx(4);
    private static final int dp6 = UiExtKt.toPx(6);
    private static final int dp16 = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/InteractionsHintsVDecorator$Companion;", "", "<init>", "()V", "", "ZERO_PADDING", "I", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isFirstItem(RecyclerView parent, View view) {
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        return valueOf != null && valueOf.intValue() == 0;
    }

    private final boolean isLastItem(RecyclerView parent, View view) {
        RecyclerView.g adapter = parent.getAdapter();
        if (adapter == null) {
            return false;
        }
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        return valueOf != null && valueOf.intValue() == adapter.getCardsCount() - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        InterfaceC7968a item;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        d dVar = e11 instanceof d ? (d) e11 : null;
        if (dVar == null || (item = dVar.getItem()) == null) {
            return;
        }
        if (item instanceof CommonText) {
            int i11 = dp4;
            outRect.top = i11;
            outRect.bottom = i11;
        } else if (item instanceof Annotation) {
            int i12 = dp16;
            outRect.left = i12;
            outRect.top = 0;
            outRect.right = i12;
            outRect.bottom = 0;
        } else {
            int i13 = dp6;
            outRect.top = i13;
            outRect.bottom = i13;
        }
        if (isLastItem(parent, view)) {
            outRect.bottom = 0;
        }
        if (isFirstItem(parent, view)) {
            outRect.top = 0;
        }
    }
}

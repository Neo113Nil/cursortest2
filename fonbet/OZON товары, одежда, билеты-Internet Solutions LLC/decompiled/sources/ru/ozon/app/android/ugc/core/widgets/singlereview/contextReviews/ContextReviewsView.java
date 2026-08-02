package ru.ozon.app.android.ugc.core.widgets.singlereview.contextReviews;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010 *\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "isLast", "Landroid/view/View;", "getTextView", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)Landroid/view/View;", "", "color", "", "setCardBackgroundColor", "(I)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsVO;", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsVO;)V", "Landroid/graphics/drawable/ShapeDrawable;", "contextReviewsBackgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/widget/LinearLayout;", "layoutContainer", "Landroid/widget/LinearLayout;", "LSc/j;", "contextReviewsContainerDelegate", "LSc/j;", "getContextReviewsContainer", "()Landroid/widget/LinearLayout;", "getContextReviewsContainer$delegate", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/contextReviews/ContextReviewsView;)Ljava/lang/Object;", "contextReviewsContainer", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContextReviewsView extends FrameLayout {
    private ShapeDrawable contextReviewsBackgroundDrawable;

    @NotNull
    private final InterfaceC4008j<LinearLayout> contextReviewsContainerDelegate;

    @NotNull
    private final LinearLayout layoutContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReviewsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout);
        this.layoutContainer = linearLayout;
        this.contextReviewsContainerDelegate = LazyUtilsKt.unsafeLazy(new ContextReviewsView$contextReviewsContainerDelegate$1(context, this));
    }

    private final LinearLayout getContextReviewsContainer() {
        return this.contextReviewsContainerDelegate.getValue();
    }

    private final View getTextView(TextDTO text, boolean isLast) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        bVar.setMargins(((ViewGroup.MarginLayoutParams) bVar).leftMargin, ((ViewGroup.MarginLayoutParams) bVar).topMargin, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, isLast ? 0 : Dimens.INSTANCE.getDP_4());
        textAtomV2View.setLayoutParams(bVar);
        TextHolderKt.bind$default(textAtomV2View, text, null, 2, null);
        return textAtomV2View;
    }

    public final void bind(@NotNull ContextReviewsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        LinearLayout contextReviewsContainer = getContextReviewsContainer();
        contextReviewsContainer.removeAllViews();
        List<TextDTO> reviews = item.getReviews();
        ArrayList arrayList = new ArrayList(C7714v.z(reviews, 10));
        int i11 = 0;
        for (Object obj : reviews) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(getTextView((TextDTO) obj, i11 == C7714v.P(item.getReviews())));
            i11 = i12;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            contextReviewsContainer.addView((View) it.next());
        }
    }

    public final void setCardBackgroundColor(int color) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.contextReviewsBackgroundDrawable = ContextExtKt.createRoundRectShape$default(context, Dimens.INSTANCE.getDPF_12(), CornersConfig.ALL, 0, color, null, 20, null);
    }
}

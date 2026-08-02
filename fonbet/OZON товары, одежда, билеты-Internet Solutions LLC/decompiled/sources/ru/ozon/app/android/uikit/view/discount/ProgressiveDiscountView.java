package ru.ozon.app.android.uikit.view.discount;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;

@InterfaceC3999a
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressiveDiscountAdapter", "Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountAdapter;", "setItems", "", "items", "", "Lru/ozon/app/android/uikit/view/discount/ProgressiveDiscountItemVO;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressiveDiscountView extends RecyclerView {

    @NotNull
    private final ProgressiveDiscountAdapter progressiveDiscountAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressiveDiscountView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setItems(@NotNull List<ProgressiveDiscountItemVO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.progressiveDiscountAdapter.setItems(items);
    }

    public /* synthetic */ ProgressiveDiscountView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveDiscountView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressiveDiscountAdapter progressiveDiscountAdapter = new ProgressiveDiscountAdapter();
        this.progressiveDiscountAdapter = progressiveDiscountAdapter;
        setLayoutParams(new RecyclerView.p(new RecyclerView.p(-2, -2)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ProgressiveDiscountViewKt.getDp8());
        gradientDrawable.setColor(g.b(getResources(), R$color.oz_semantic_bg_primary, context.getTheme()));
        setBackground(gradientDrawable);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(progressiveDiscountAdapter);
    }
}

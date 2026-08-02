package ru.ozon.app.android.marketing.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/common/view/ViewContainerLayout;", "T", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/LinearLayout$LayoutParams;", "params", "Landroid/view/View;", "createView", "(Landroid/widget/LinearLayout$LayoutParams;)Landroid/view/View;", "view", "item", "Lru/ozon/app/android/marketing/common/view/ViewContainerLayoutHolder;", "createViewHolder", "(Landroid/view/View;Ljava/lang/Object;)Lru/ozon/app/android/marketing/common/view/ViewContainerLayoutHolder;", "", "items", "", "submitItems", "(Ljava/util/List;)V", "index", "applyMargin", "(Landroid/widget/LinearLayout$LayoutParams;I)V", "itemCount", "()I", "", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ViewContainerLayout<T> extends LinearLayout {

    @NotNull
    private final List<T> items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewContainerLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.items = new ArrayList();
    }

    protected abstract void applyMargin(@NotNull LinearLayout.LayoutParams params, int index);

    @NotNull
    public abstract View createView(@NotNull LinearLayout.LayoutParams params);

    @NotNull
    public abstract ViewContainerLayoutHolder createViewHolder(@NotNull View view, T item);

    protected final int itemCount() {
        return this.items.size();
    }

    public final void submitItems(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items == this.items) {
            return;
        }
        if (getChildCount() > 0) {
            removeAllViews();
        }
        this.items.clear();
        this.items.addAll(items);
        int i11 = 0;
        for (T t2 : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            Intrinsics.f(generateDefaultLayoutParams);
            View createView = createView(generateDefaultLayoutParams);
            createViewHolder(createView, t2).setPosition(i11);
            applyMargin(generateDefaultLayoutParams, i11);
            addView(createView, generateDefaultLayoutParams);
            i11 = i12;
        }
    }
}

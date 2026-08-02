package ru.ozon.app.android.travel.molecules.fragment.selector.adapter;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/selector/adapter/SelectorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/molecules/fragment/selector/adapter/SelectorItemViewHolder;", "", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "items", "Lkotlin/Function1;", "", "onClickCallback", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/widget/CheckedTextView;", "createView", "(Landroid/content/Context;)Landroid/widget/CheckedTextView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/molecules/fragment/selector/adapter/SelectorItemViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/molecules/fragment/selector/adapter/SelectorItemViewHolder;I)V", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectorAdapter extends RecyclerView.g<SelectorItemViewHolder> {

    @NotNull
    private final List<SelectorItem> items;

    @NotNull
    private final Function1<SelectorItem, Unit> onClickCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectorAdapter(@NotNull List<SelectorItem> items, @NotNull Function1<? super SelectorItem, Unit> onClickCallback) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
        this.items = items;
        this.onClickCallback = onClickCallback;
    }

    private final CheckedTextView createView(Context context) {
        CheckedTextView checkedTextView = new CheckedTextView(context);
        checkedTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, a.getDrawable(context, R$drawable.ic_m_confirmed_filled));
        checkedTextView.setCheckMarkDrawable(stateListDrawable);
        checkedTextView.setCheckMarkTintList(ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary)));
        checkedTextView.setGravity(16);
        checkedTextView.setMinimumHeight(ResourceExtKt.toPx(44, context));
        checkedTextView.setTextAppearance(R$style.TextStyle_Body_L);
        checkedTextView.setMaxLines(1);
        checkedTextView.setEllipsize(TextUtils.TruncateAt.END);
        ViewExtKt.updatePadding$default(checkedTextView, 0, 0, ResourceExtKt.toPx(16, context), 0, 11, null);
        return checkedTextView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull SelectorItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public SelectorItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SelectorItemViewHolder(createView(context), this.onClickCallback);
    }
}

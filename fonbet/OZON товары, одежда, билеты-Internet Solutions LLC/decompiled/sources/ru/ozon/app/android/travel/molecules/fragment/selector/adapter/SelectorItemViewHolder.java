package ru.ozon.app.android.travel.molecules.fragment.selector.adapter;

import Lc0.e;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/selector/adapter/SelectorItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/widget/CheckedTextView;", "view", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "", "onClick", "<init>", "(Landroid/widget/CheckedTextView;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", "Landroid/widget/CheckedTextView;", "boundedData", "Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectorItemViewHolder extends RecyclerView.C {
    private SelectorItem boundedData;

    @NotNull
    private final CheckedTextView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorItemViewHolder(@NotNull CheckedTextView view, @NotNull Function1<? super SelectorItem, Unit> onClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.view = view;
        view.setOnClickListener(new e(6, this, onClick));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SelectorItemViewHolder selectorItemViewHolder, Function1 function1, View view) {
        SelectorItem selectorItem = selectorItemViewHolder.boundedData;
        if (selectorItem != null) {
            function1.invoke(selectorItem);
        }
    }

    public final void bind(@NotNull SelectorItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundedData = item;
        this.view.setText(item.getName());
        this.view.setChecked(item.getIsSelected());
    }
}

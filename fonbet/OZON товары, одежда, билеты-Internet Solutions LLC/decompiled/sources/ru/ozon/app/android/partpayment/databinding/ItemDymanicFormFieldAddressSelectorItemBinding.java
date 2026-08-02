package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.partpayment.R$id;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes13.dex */
public final class ItemDymanicFormFieldAddressSelectorItemBinding implements a {

    @NonNull
    public final RecyclerView addressRv;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final ScrollingPagerIndicator dotsPiv;

    @NonNull
    private final LinearLayout rootView;

    private ItemDymanicFormFieldAddressSelectorItemBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull ScrollingPagerIndicator scrollingPagerIndicator) {
        this.rootView = linearLayout;
        this.addressRv = recyclerView;
        this.descriptionTv = textView;
        this.dotsPiv = scrollingPagerIndicator;
    }

    @NonNull
    public static ItemDymanicFormFieldAddressSelectorItemBinding bind(@NonNull View view) {
        int i11 = R$id.addressRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.descriptionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.dotsPiv;
                ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
                if (scrollingPagerIndicator != null) {
                    return new ItemDymanicFormFieldAddressSelectorItemBinding((LinearLayout) view, recyclerView, textView, scrollingPagerIndicator);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

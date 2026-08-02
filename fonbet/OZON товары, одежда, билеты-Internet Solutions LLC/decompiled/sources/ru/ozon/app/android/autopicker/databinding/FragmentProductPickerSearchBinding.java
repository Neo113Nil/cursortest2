package ru.ozon.app.android.autopicker.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.autopicker.R$id;
import ru.ozon.app.android.autopicker.R$layout;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes11.dex */
public final class FragmentProductPickerSearchBinding implements a {

    @NonNull
    public final LargeButtonView actionButton;

    @NonNull
    public final CardView buttonCv;

    @NonNull
    public final ImageView productPickerBackIv;

    @NonNull
    public final ImageView productPickerCloseIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenStateView;

    @NonNull
    public final SearchView searchV;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final RecyclerView valuesRv;

    private FragmentProductPickerSearchBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull SearchView searchView, @NonNull TextView textView, @NonNull Toolbar toolbar, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.actionButton = largeButtonView;
        this.buttonCv = cardView;
        this.productPickerBackIv = imageView;
        this.productPickerCloseIv = imageView2;
        this.screenStateView = screenStateViewWidget;
        this.searchV = searchView;
        this.titleTv = textView;
        this.toolbar = toolbar;
        this.valuesRv = recyclerView;
    }

    @NonNull
    public static FragmentProductPickerSearchBinding bind(@NonNull View view) {
        int i11 = R$id.actionButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.buttonCv;
            CardView cardView = (CardView) C2548q.d(i11, view);
            if (cardView != null) {
                i11 = R$id.productPickerBackIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.productPickerCloseIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        i11 = R$id.screenStateView;
                        ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                        if (screenStateViewWidget != null) {
                            i11 = R$id.searchV;
                            SearchView searchView = (SearchView) C2548q.d(i11, view);
                            if (searchView != null) {
                                i11 = R$id.titleTv;
                                TextView textView = (TextView) C2548q.d(i11, view);
                                if (textView != null) {
                                    i11 = R$id.toolbar;
                                    Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                                    if (toolbar != null) {
                                        i11 = R$id.valuesRv;
                                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                        if (recyclerView != null) {
                                            return new FragmentProductPickerSearchBinding((ConstraintLayout) view, largeButtonView, cardView, imageView, imageView2, screenStateViewWidget, searchView, textView, toolbar, recyclerView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentProductPickerSearchBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_product_picker_search, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

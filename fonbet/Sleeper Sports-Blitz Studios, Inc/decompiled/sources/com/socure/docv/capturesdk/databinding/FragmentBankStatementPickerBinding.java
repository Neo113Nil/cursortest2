package com.socure.docv.capturesdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.socure.docv.capturesdk.R;

/* loaded from: classes8.dex */
public final class FragmentBankStatementPickerBinding implements ViewBinding {
    public final ImageButton closeButton;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final SearchView searchView;
    public final TextView titleTextView;

    private FragmentBankStatementPickerBinding(ConstraintLayout constraintLayout, ImageButton imageButton, RecyclerView recyclerView, SearchView searchView, TextView textView) {
        this.rootView = constraintLayout;
        this.closeButton = imageButton;
        this.recyclerView = recyclerView;
        this.searchView = searchView;
        this.titleTextView = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBankStatementPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBankStatementPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bank_statement_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBankStatementPickerBinding bind(View view) {
        int i = R.id.closeButton;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.searchView;
                SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, i);
                if (searchView != null) {
                    i = R.id.titleTextView;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new FragmentBankStatementPickerBinding((ConstraintLayout) view, imageButton, recyclerView, searchView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$layout;

/* loaded from: classes13.dex */
public final class FragmentSearchPhotoLoadBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ProgressBar searchPhotoProgressBar;

    private FragmentSearchPhotoLoadBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.searchPhotoProgressBar = progressBar;
    }

    @NonNull
    public static FragmentSearchPhotoLoadBinding bind(@NonNull View view) {
        int i11 = R$id.searchPhotoProgressBar;
        ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
        if (progressBar != null) {
            return new FragmentSearchPhotoLoadBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentSearchPhotoLoadBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_search_photo_load, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

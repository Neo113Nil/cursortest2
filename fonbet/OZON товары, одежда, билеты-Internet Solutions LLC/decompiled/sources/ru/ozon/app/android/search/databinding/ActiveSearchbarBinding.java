package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class ActiveSearchbarBinding implements a {

    @NonNull
    public final AppCompatEditText etSearch;

    @NonNull
    public final AppCompatImageView ivBack;

    @NonNull
    public final AppCompatImageView ivClearSearch;

    @NonNull
    private final FrameLayout rootView;

    private ActiveSearchbarBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = frameLayout;
        this.etSearch = appCompatEditText;
        this.ivBack = appCompatImageView;
        this.ivClearSearch = appCompatImageView2;
    }

    @NonNull
    public static ActiveSearchbarBinding bind(@NonNull View view) {
        int i11 = R$id.etSearch;
        AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
        if (appCompatEditText != null) {
            i11 = R$id.ivBack;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.ivClearSearch;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView2 != null) {
                    return new ActiveSearchbarBinding((FrameLayout) view, appCompatEditText, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

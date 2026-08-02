package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$layout;

/* loaded from: classes13.dex */
public final class ItemMorkovskMenuBinding implements a {

    @NonNull
    public final AppCompatImageView icon;

    @NonNull
    public final AppCompatTextView menuInfo;

    @NonNull
    public final AppCompatTextView menuText;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemMorkovskMenuBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.icon = appCompatImageView;
        this.menuInfo = appCompatTextView;
        this.menuText = appCompatTextView2;
    }

    @NonNull
    public static ItemMorkovskMenuBinding bind(@NonNull View view) {
        int i11 = R$id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.menuInfo;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.menuText;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    return new ItemMorkovskMenuBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemMorkovskMenuBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_morkovsk_menu, viewGroup, false);
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

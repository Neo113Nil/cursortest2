package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;

/* loaded from: classes12.dex */
public final class PopupItemAddressBookBinding implements a {

    @NonNull
    public final AppCompatImageView iconIv;

    @NonNull
    public final TextView popupTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private PopupItemAddressBookBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.iconIv = appCompatImageView;
        this.popupTitleTv = textView;
    }

    @NonNull
    public static PopupItemAddressBookBinding bind(@NonNull View view) {
        int i11 = R$id.iconIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.popupTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new PopupItemAddressBookBinding((ConstraintLayout) view, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PopupItemAddressBookBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.popup_item_address_book, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

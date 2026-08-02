package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MNoTypeLayoutBinding implements a {

    @NonNull
    public final LinearLayout noTypeContainerLl;

    @NonNull
    private final LinearLayout rootView;

    private MNoTypeLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.noTypeContainerLl = linearLayout2;
    }

    @NonNull
    public static MNoTypeLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new MNoTypeLayoutBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static MNoTypeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_no_type_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

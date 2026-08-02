package ru.ozon.app.android.map.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.map.R$id;
import ru.ozon.app.android.map.R$layout;

/* loaded from: classes12.dex */
public final class FragmentOptionsSelectorSheetBinding implements a {

    @NonNull
    public final ImageView closeIv;

    @NonNull
    public final RecyclerView optionsRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private FragmentOptionsSelectorSheetBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.closeIv = imageView;
        this.optionsRv = recyclerView;
        this.titleTv = textView;
    }

    @NonNull
    public static FragmentOptionsSelectorSheetBinding bind(@NonNull View view) {
        int i11 = R$id.closeIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.optionsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.titleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new FragmentOptionsSelectorSheetBinding((LinearLayout) view, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentOptionsSelectorSheetBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_options_selector_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

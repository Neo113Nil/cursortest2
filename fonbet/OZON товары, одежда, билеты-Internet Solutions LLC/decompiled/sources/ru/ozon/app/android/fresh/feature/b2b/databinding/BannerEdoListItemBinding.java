package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class BannerEdoListItemBinding implements a {

    @NonNull
    public final TextAtomV2View description;

    @NonNull
    public final ImageView icon;

    @NonNull
    private final LinearLayout rootView;

    private BannerEdoListItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView) {
        this.rootView = linearLayout;
        this.description = textAtomV2View;
        this.icon = imageView;
    }

    @NonNull
    public static BannerEdoListItemBinding bind(@NonNull View view) {
        int i11 = R$id.description;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.icon;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new BannerEdoListItemBinding((LinearLayout) view, textAtomV2View, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static BannerEdoListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BannerEdoListItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.banner_edo_list_item, viewGroup, false);
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

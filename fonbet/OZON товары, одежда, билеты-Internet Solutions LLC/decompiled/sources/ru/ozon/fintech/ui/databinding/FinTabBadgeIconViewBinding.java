package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FinTabBadgeIconViewBinding implements a {

    @NonNull
    public final ImageView finBadgeBg;

    @NonNull
    public final ImageView finBadgeIcon;

    @NonNull
    private final View rootView;

    private FinTabBadgeIconViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = view;
        this.finBadgeBg = imageView;
        this.finBadgeIcon = imageView2;
    }

    @NonNull
    public static FinTabBadgeIconViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_badge_bg;
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_badge_bg, view);
        if (imageView != null) {
            i11 = R.id.fin_badge_icon;
            ImageView imageView2 = (ImageView) C2548q.d(R.id.fin_badge_icon, view);
            if (imageView2 != null) {
                return new FinTabBadgeIconViewBinding(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinTabBadgeIconViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.fin_tab_badge_icon_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* loaded from: classes11.dex */
public final class AtomImageCarouselBinding implements a {

    @NonNull
    public final ScrollingPagerIndicator dotsPiv;

    @NonNull
    public final RecyclerView imageRV;

    @NonNull
    private final View rootView;

    private AtomImageCarouselBinding(@NonNull View view, @NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.dotsPiv = scrollingPagerIndicator;
        this.imageRV = recyclerView;
    }

    @NonNull
    public static AtomImageCarouselBinding bind(@NonNull View view) {
        int i11 = R$id.dotsPiv;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C2548q.d(i11, view);
        if (scrollingPagerIndicator != null) {
            i11 = R$id.imageRV;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new AtomImageCarouselBinding(view, scrollingPagerIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomImageCarouselBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_image_carousel, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

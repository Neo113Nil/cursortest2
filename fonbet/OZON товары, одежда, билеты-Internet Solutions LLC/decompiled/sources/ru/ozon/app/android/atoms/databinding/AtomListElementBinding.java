package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class AtomListElementBinding implements a {

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final VerticalRecyclerContainer listElementAtomsVRC;

    @NonNull
    public final Barrier markerBarrier;

    @NonNull
    public final TextAtomView markerTav;

    @NonNull
    private final View rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView titleTav;

    private AtomListElementBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView, @NonNull View view2, @NonNull TextAtomView textAtomView2) {
        this.rootView = view;
        this.iconIv = imageView;
        this.listElementAtomsVRC = verticalRecyclerContainer;
        this.markerBarrier = barrier;
        this.markerTav = textAtomView;
        this.separator = view2;
        this.titleTav = textAtomView2;
    }

    @NonNull
    public static AtomListElementBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.iconIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.listElementAtomsVRC;
            VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
            if (verticalRecyclerContainer != null) {
                i11 = R$id.markerBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.markerTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                        i11 = R$id.titleTav;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            return new AtomListElementBinding(view, imageView, verticalRecyclerContainer, barrier, textAtomView, d11, textAtomView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomListElementBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.atom_list_element, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}

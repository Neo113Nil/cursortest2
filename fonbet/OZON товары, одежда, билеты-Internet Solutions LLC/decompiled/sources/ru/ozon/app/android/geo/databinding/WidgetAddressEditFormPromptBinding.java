package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class WidgetAddressEditFormPromptBinding implements a {

    @NonNull
    public final VerticalAtomsLayout elementsVAL;

    @NonNull
    public final Group loaderOverlay;

    @NonNull
    public final View overlay;

    @NonNull
    public final LoaderView progress;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAddressEditFormPromptBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull Group group, @NonNull View view, @NonNull LoaderView loaderView) {
        this.rootView = constraintLayout;
        this.elementsVAL = verticalAtomsLayout;
        this.loaderOverlay = group;
        this.overlay = view;
        this.progress = loaderView;
    }

    @NonNull
    public static WidgetAddressEditFormPromptBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.elementsVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.loaderOverlay;
            Group group = (Group) C2548q.d(i11, view);
            if (group != null && (d11 = C2548q.d((i11 = R$id.overlay), view)) != null) {
                i11 = R$id.progress;
                LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                if (loaderView != null) {
                    return new WidgetAddressEditFormPromptBinding((ConstraintLayout) view, verticalAtomsLayout, group, d11, loaderView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

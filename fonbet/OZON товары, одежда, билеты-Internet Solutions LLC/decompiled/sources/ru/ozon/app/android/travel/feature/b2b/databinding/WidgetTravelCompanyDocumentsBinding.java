package ru.ozon.app.android.travel.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.b2b.R$id;

/* loaded from: classes12.dex */
public final class WidgetTravelCompanyDocumentsBinding implements a {

    @NonNull
    public final ItemTravelCompanyDocumentBinding allDocumentsCard;

    @NonNull
    public final DisclaimerContainer annotationAtom;

    @NonNull
    public final RecyclerView documentsRv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    private WidgetTravelCompanyDocumentsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ItemTravelCompanyDocumentBinding itemTravelCompanyDocumentBinding, @NonNull DisclaimerContainer disclaimerContainer, @NonNull RecyclerView recyclerView, @NonNull View view) {
        this.rootView = constraintLayout;
        this.allDocumentsCard = itemTravelCompanyDocumentBinding;
        this.annotationAtom = disclaimerContainer;
        this.documentsRv = recyclerView;
        this.separatorV = view;
    }

    @NonNull
    public static WidgetTravelCompanyDocumentsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.allDocumentsCard;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            ItemTravelCompanyDocumentBinding bind = ItemTravelCompanyDocumentBinding.bind(d12);
            i11 = R$id.annotationAtom;
            DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
            if (disclaimerContainer != null) {
                i11 = R$id.documentsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                    return new WidgetTravelCompanyDocumentsBinding((ConstraintLayout) view, bind, disclaimerContainer, recyclerView, d11);
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

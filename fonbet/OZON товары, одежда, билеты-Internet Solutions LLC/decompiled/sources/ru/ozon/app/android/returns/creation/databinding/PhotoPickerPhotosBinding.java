package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.atom.image.Image;

/* loaded from: classes13.dex */
public final class PhotoPickerPhotosBinding implements a {

    @NonNull
    public final DisclaimerContainer disclaimerContainer;

    @NonNull
    public final Image emptyStateIv;

    @NonNull
    public final RecyclerView photosRv;

    @NonNull
    private final ConstraintLayout rootView;

    private PhotoPickerPhotosBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DisclaimerContainer disclaimerContainer, @NonNull Image image, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.disclaimerContainer = disclaimerContainer;
        this.emptyStateIv = image;
        this.photosRv = recyclerView;
    }

    @NonNull
    public static PhotoPickerPhotosBinding bind(@NonNull View view) {
        int i11 = R$id.disclaimerContainer;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            i11 = R$id.emptyStateIv;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                i11 = R$id.photosRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    return new PhotoPickerPhotosBinding((ConstraintLayout) view, disclaimerContainer, image, recyclerView);
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

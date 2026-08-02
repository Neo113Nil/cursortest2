package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;

/* loaded from: classes13.dex */
public final class ItemMainDrawMajorScreenSideBarBinding implements a {

    @NonNull
    public final ItemMainDrawMajorScreenTaskBinding firstTask;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ItemMainDrawMajorScreenTaskBinding secondTask;

    @NonNull
    public final ItemMainDrawMajorScreenTaskBinding thirdTask;

    private ItemMainDrawMajorScreenSideBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ItemMainDrawMajorScreenTaskBinding itemMainDrawMajorScreenTaskBinding, @NonNull ItemMainDrawMajorScreenTaskBinding itemMainDrawMajorScreenTaskBinding2, @NonNull ItemMainDrawMajorScreenTaskBinding itemMainDrawMajorScreenTaskBinding3) {
        this.rootView = constraintLayout;
        this.firstTask = itemMainDrawMajorScreenTaskBinding;
        this.secondTask = itemMainDrawMajorScreenTaskBinding2;
        this.thirdTask = itemMainDrawMajorScreenTaskBinding3;
    }

    @NonNull
    public static ItemMainDrawMajorScreenSideBarBinding bind(@NonNull View view) {
        int i11 = R$id.firstTask;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            ItemMainDrawMajorScreenTaskBinding bind = ItemMainDrawMajorScreenTaskBinding.bind(d11);
            int i12 = R$id.secondTask;
            View d12 = C2548q.d(i12, view);
            if (d12 != null) {
                ItemMainDrawMajorScreenTaskBinding bind2 = ItemMainDrawMajorScreenTaskBinding.bind(d12);
                int i13 = R$id.thirdTask;
                View d13 = C2548q.d(i13, view);
                if (d13 != null) {
                    return new ItemMainDrawMajorScreenSideBarBinding((ConstraintLayout) view, bind, bind2, ItemMainDrawMajorScreenTaskBinding.bind(d13));
                }
                i11 = i13;
            } else {
                i11 = i12;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

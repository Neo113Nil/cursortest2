package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;

/* loaded from: classes11.dex */
public final class AtomAnnotationBinding implements a {

    @NonNull
    public final View bgV;

    @NonNull
    public final FrameAtomsLayout controlFAL;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView textTv;

    private AtomAnnotationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.bgV = view;
        this.controlFAL = frameAtomsLayout;
        this.iconIv = imageView;
        this.textTv = textView;
    }

    @NonNull
    public static AtomAnnotationBinding bind(@NonNull View view) {
        int i11 = R$id.bgV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.controlFAL;
            FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
            if (frameAtomsLayout != null) {
                i11 = R$id.iconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    i11 = R$id.textTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new AtomAnnotationBinding((ConstraintLayout) view, d11, frameAtomsLayout, imageView, textView);
                    }
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

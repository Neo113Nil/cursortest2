package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;

/* loaded from: classes11.dex */
public final class AtomTextBinding implements a {

    @NonNull
    public final Space contentEndSpace;

    @NonNull
    public final Space contentStartSpace;

    @NonNull
    public final Space contentTopSpace;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    public final ImageView rightIconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separatorV;

    @NonNull
    public final ConstraintLayout textAtomContainerCl;

    @NonNull
    public final Space textGuidelineSpace;

    @NonNull
    public final TextView titleTv;

    private AtomTextBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull Space space2, @NonNull Space space3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull Space space4, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.contentEndSpace = space;
        this.contentStartSpace = space2;
        this.contentTopSpace = space3;
        this.iconIv = imageView;
        this.rightIconIv = imageView2;
        this.separatorV = view;
        this.textAtomContainerCl = constraintLayout2;
        this.textGuidelineSpace = space4;
        this.titleTv = textView;
    }

    @NonNull
    public static AtomTextBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.contentEndSpace;
        Space space = (Space) C2548q.d(i11, view);
        if (space != null) {
            i11 = R$id.contentStartSpace;
            Space space2 = (Space) C2548q.d(i11, view);
            if (space2 != null) {
                i11 = R$id.contentTopSpace;
                Space space3 = (Space) C2548q.d(i11, view);
                if (space3 != null) {
                    i11 = R$id.iconIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.rightIconIv;
                        ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                        if (imageView2 != null && (d11 = C2548q.d((i11 = R$id.separatorV), view)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.textGuidelineSpace;
                            Space space4 = (Space) C2548q.d(i11, view);
                            if (space4 != null) {
                                i11 = R$id.titleTv;
                                TextView textView = (TextView) C2548q.d(i11, view);
                                if (textView != null) {
                                    return new AtomTextBinding(constraintLayout, space, space2, space3, imageView, imageView2, d11, constraintLayout, space4, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static AtomTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.atom_text, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

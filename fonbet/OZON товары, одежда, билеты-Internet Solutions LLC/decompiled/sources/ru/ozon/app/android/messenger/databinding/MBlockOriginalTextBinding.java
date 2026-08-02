package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MBlockOriginalTextBinding implements a {

    @NonNull
    public final ImageView iconOriginalText;

    @NonNull
    public final TextAtomV2View originalText;

    @NonNull
    public final ConstraintLayout originalTextRoot;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View titleOriginalText;

    private MBlockOriginalTextBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.iconOriginalText = imageView;
        this.originalText = textAtomV2View;
        this.originalTextRoot = constraintLayout2;
        this.titleOriginalText = textAtomV2View2;
    }

    @NonNull
    public static MBlockOriginalTextBinding bind(@NonNull View view) {
        int i11 = R$id.iconOriginalText;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.originalText;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.titleOriginalText;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new MBlockOriginalTextBinding(constraintLayout, imageView, textAtomV2View, constraintLayout, textAtomV2View2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockOriginalTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_original_text, viewGroup, false);
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

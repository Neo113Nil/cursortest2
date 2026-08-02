package ru.ozon.android.composerCommonViewKit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.android.composerCommonViewKit.R$id;
import ru.ozon.android.composerCommonViewKit.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes10.dex */
public final class ViewPlainTextBinding implements a {

    @NonNull
    public final FrameLayout root;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomV2View textAtom;

    private ViewPlainTextBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = frameLayout;
        this.root = frameLayout2;
        this.textAtom = textAtomV2View;
    }

    @NonNull
    public static ViewPlainTextBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.text_atom;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            return new ViewPlainTextBinding(frameLayout, frameLayout, textAtomV2View);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewPlainTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_plain_text, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

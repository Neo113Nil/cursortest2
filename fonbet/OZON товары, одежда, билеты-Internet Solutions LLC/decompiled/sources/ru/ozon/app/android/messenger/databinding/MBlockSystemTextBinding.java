package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MBlockSystemTextBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View separatorBottom;

    @NonNull
    public final View separatorTop;

    @NonNull
    public final TextAtomV2View systemText;

    private MBlockSystemTextBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.separatorBottom = view;
        this.separatorTop = view2;
        this.systemText = textAtomV2View;
    }

    @NonNull
    public static MBlockSystemTextBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.separatorBottom;
        View d12 = C2548q.d(i11, view);
        if (d12 != null && (d11 = C2548q.d((i11 = R$id.separatorTop), view)) != null) {
            i11 = R$id.systemText;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new MBlockSystemTextBinding((LinearLayout) view, d12, d11, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockSystemTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_system_text, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

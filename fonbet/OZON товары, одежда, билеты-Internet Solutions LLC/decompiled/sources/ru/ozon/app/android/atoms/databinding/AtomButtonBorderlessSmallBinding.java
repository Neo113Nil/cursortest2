package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.R$id;

/* loaded from: classes11.dex */
public final class AtomButtonBorderlessSmallBinding implements a {

    @NonNull
    public final TextView buttonTv;

    @NonNull
    private final FrameLayout rootView;

    private AtomButtonBorderlessSmallBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.buttonTv = textView;
    }

    @NonNull
    public static AtomButtonBorderlessSmallBinding bind(@NonNull View view) {
        int i11 = R$id.buttonTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new AtomButtonBorderlessSmallBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

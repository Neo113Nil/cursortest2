package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MReasonItemBinding implements a {

    @NonNull
    public final ImageView reasonIV;

    @NonNull
    public final TextAtomView reasonNameTav;

    @NonNull
    private final LinearLayout rootView;

    private MReasonItemBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextAtomView textAtomView) {
        this.rootView = linearLayout;
        this.reasonIV = imageView;
        this.reasonNameTav = textAtomView;
    }

    @NonNull
    public static MReasonItemBinding bind(@NonNull View view) {
        int i11 = R$id.reasonIV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.reasonNameTav;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                return new MReasonItemBinding((LinearLayout) view, imageView, textAtomView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MReasonItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_reason_item, viewGroup, false);
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

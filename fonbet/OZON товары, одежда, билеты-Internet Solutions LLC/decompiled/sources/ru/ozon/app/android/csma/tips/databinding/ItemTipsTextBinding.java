package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.csma.tips.R$id;

/* loaded from: classes11.dex */
public final class ItemTipsTextBinding implements a {

    @NonNull
    public final FrameLayout aspectContainer;

    @NonNull
    public final TextView aspectText;

    @NonNull
    private final FrameLayout rootView;

    private ItemTipsTextBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.aspectContainer = frameLayout2;
        this.aspectText = textView;
    }

    @NonNull
    public static ItemTipsTextBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.aspectText;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new ItemTipsTextBinding(frameLayout, frameLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

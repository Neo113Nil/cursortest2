package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MButtonScrollToLastMessageBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView scrollToLastIv;

    @NonNull
    public final TextView unreadCountTv;

    private MButtonScrollToLastMessageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.scrollToLastIv = imageView;
        this.unreadCountTv = textView;
    }

    @NonNull
    public static MButtonScrollToLastMessageBinding bind(@NonNull View view) {
        int i11 = R$id.scrollToLastIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.unreadCountTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new MButtonScrollToLastMessageBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MButtonScrollToLastMessageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_button_scroll_to_last_message, viewGroup, false);
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

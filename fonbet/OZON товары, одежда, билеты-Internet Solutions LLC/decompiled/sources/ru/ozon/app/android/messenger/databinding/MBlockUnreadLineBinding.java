package ru.ozon.app.android.messenger.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockUnreadLineBinding implements a {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView unreadTv;

    private MBlockUnreadLineBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.unreadTv = textView2;
    }

    @NonNull
    public static MBlockUnreadLineBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new MBlockUnreadLineBinding(textView, textView);
    }

    @NonNull
    public static MBlockUnreadLineBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_unread_line, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}

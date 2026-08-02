package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockDateBinding implements a {

    @NonNull
    public final TextView chatDateTv;

    @NonNull
    public final FrameLayout dateContainerFl;

    @NonNull
    private final FrameLayout rootView;

    private MBlockDateBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.chatDateTv = textView;
        this.dateContainerFl = frameLayout2;
    }

    @NonNull
    public static MBlockDateBinding bind(@NonNull View view) {
        int i11 = R$id.chatDateTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new MBlockDateBinding(frameLayout, textView, frameLayout);
    }

    @NonNull
    public static MBlockDateBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_date, viewGroup, false);
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

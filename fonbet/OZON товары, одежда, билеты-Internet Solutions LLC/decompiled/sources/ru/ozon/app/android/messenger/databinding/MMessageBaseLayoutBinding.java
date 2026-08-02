package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.android.messenger.blocks.common.HighlightLinearLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes12.dex */
public final class MMessageBaseLayoutBinding implements a {

    @NonNull
    public final IconView avatarIv;

    @NonNull
    public final HighlightLinearLayout bubbleContainerLl;

    @NonNull
    public final LinearLayoutCompat messageItemRootLl;

    @NonNull
    private final LinearLayoutCompat rootView;

    private MMessageBaseLayoutBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull IconView iconView, @NonNull HighlightLinearLayout highlightLinearLayout, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.avatarIv = iconView;
        this.bubbleContainerLl = highlightLinearLayout;
        this.messageItemRootLl = linearLayoutCompat2;
    }

    @NonNull
    public static MMessageBaseLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.avatarIv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.bubbleContainerLl;
            HighlightLinearLayout highlightLinearLayout = (HighlightLinearLayout) C2548q.d(i11, view);
            if (highlightLinearLayout != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                return new MMessageBaseLayoutBinding(linearLayoutCompat, iconView, highlightLinearLayout, linearLayoutCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MMessageBaseLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_message_base_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}

package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.utils.view.TripleBalancedCenterLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MChatListHeaderTextBinding implements a {

    @NonNull
    public final ImageView backIv;

    @NonNull
    public final TripleBalancedCenterLayout chatListHeaderRoot;

    @NonNull
    public final LinearLayout menuItemsContainer;

    @NonNull
    public final FrameLayout navbarContainer;

    @NonNull
    private final TripleBalancedCenterLayout rootView;

    private MChatListHeaderTextBinding(@NonNull TripleBalancedCenterLayout tripleBalancedCenterLayout, @NonNull ImageView imageView, @NonNull TripleBalancedCenterLayout tripleBalancedCenterLayout2, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout) {
        this.rootView = tripleBalancedCenterLayout;
        this.backIv = imageView;
        this.chatListHeaderRoot = tripleBalancedCenterLayout2;
        this.menuItemsContainer = linearLayout;
        this.navbarContainer = frameLayout;
    }

    @NonNull
    public static MChatListHeaderTextBinding bind(@NonNull View view) {
        int i11 = R$id.backIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            TripleBalancedCenterLayout tripleBalancedCenterLayout = (TripleBalancedCenterLayout) view;
            i11 = R$id.menuItemsContainer;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                i11 = R$id.navbarContainer;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    return new MChatListHeaderTextBinding(tripleBalancedCenterLayout, imageView, tripleBalancedCenterLayout, linearLayout, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MChatListHeaderTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_chat_list_header_text, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public TripleBalancedCenterLayout getRoot() {
        return this.rootView;
    }
}

package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFragmentChatSearchBinding implements a {

    @NonNull
    public final SquircleLinearLayout bottomContainerLl;

    @NonNull
    public final ConstraintLayout chatListRootCl;

    @NonNull
    public final SquircleLinearLayout headerContainerLl;

    @NonNull
    public final FrameLayout middleContainerLl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ComposeView searchContent;

    private MFragmentChatSearchBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SquircleLinearLayout squircleLinearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SquircleLinearLayout squircleLinearLayout2, @NonNull FrameLayout frameLayout, @NonNull ComposeView composeView) {
        this.rootView = constraintLayout;
        this.bottomContainerLl = squircleLinearLayout;
        this.chatListRootCl = constraintLayout2;
        this.headerContainerLl = squircleLinearLayout2;
        this.middleContainerLl = frameLayout;
        this.searchContent = composeView;
    }

    @NonNull
    public static MFragmentChatSearchBinding bind(@NonNull View view) {
        int i11 = R$id.bottomContainerLl;
        SquircleLinearLayout squircleLinearLayout = (SquircleLinearLayout) C2548q.d(i11, view);
        if (squircleLinearLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.headerContainerLl;
            SquircleLinearLayout squircleLinearLayout2 = (SquircleLinearLayout) C2548q.d(i11, view);
            if (squircleLinearLayout2 != null) {
                i11 = R$id.middleContainerLl;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    i11 = R$id.searchContent;
                    ComposeView composeView = (ComposeView) C2548q.d(i11, view);
                    if (composeView != null) {
                        return new MFragmentChatSearchBinding(constraintLayout, squircleLinearLayout, constraintLayout, squircleLinearLayout2, frameLayout, composeView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MFragmentChatSearchBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_chat_search, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFragmentChatListBinding implements a {

    @NonNull
    public final SquircleLinearLayout bottomContainerLl;

    @NonNull
    public final CoordinatorLayout chatListContent;

    @NonNull
    public final ConstraintLayout chatListRootCl;

    @NonNull
    public final MessengerMetricsRecyclerView chatListRv;

    @NonNull
    public final FrameLayout floatButtonContainer;

    @NonNull
    public final SquircleLinearLayout headerContainerLl;

    @NonNull
    public final LinearLayout middleContainerLl;

    @NonNull
    public final MViewProgressbarBgBinding progressBar;

    @NonNull
    public final SquircleLinearLayout rootList;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final MotionLayout supportViewRoot;

    private MFragmentChatListBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SquircleLinearLayout squircleLinearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull MessengerMetricsRecyclerView messengerMetricsRecyclerView, @NonNull FrameLayout frameLayout, @NonNull SquircleLinearLayout squircleLinearLayout2, @NonNull LinearLayout linearLayout, @NonNull MViewProgressbarBgBinding mViewProgressbarBgBinding, @NonNull SquircleLinearLayout squircleLinearLayout3, @NonNull MotionLayout motionLayout) {
        this.rootView = coordinatorLayout;
        this.bottomContainerLl = squircleLinearLayout;
        this.chatListContent = coordinatorLayout2;
        this.chatListRootCl = constraintLayout;
        this.chatListRv = messengerMetricsRecyclerView;
        this.floatButtonContainer = frameLayout;
        this.headerContainerLl = squircleLinearLayout2;
        this.middleContainerLl = linearLayout;
        this.progressBar = mViewProgressbarBgBinding;
        this.rootList = squircleLinearLayout3;
        this.supportViewRoot = motionLayout;
    }

    @NonNull
    public static MFragmentChatListBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.bottomContainerLl;
        SquircleLinearLayout squircleLinearLayout = (SquircleLinearLayout) C2548q.d(i11, view);
        if (squircleLinearLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i11 = R$id.chatListRootCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.chatListRv;
                MessengerMetricsRecyclerView messengerMetricsRecyclerView = (MessengerMetricsRecyclerView) C2548q.d(i11, view);
                if (messengerMetricsRecyclerView != null) {
                    i11 = R$id.floatButtonContainer;
                    FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                    if (frameLayout != null) {
                        i11 = R$id.headerContainerLl;
                        SquircleLinearLayout squircleLinearLayout2 = (SquircleLinearLayout) C2548q.d(i11, view);
                        if (squircleLinearLayout2 != null) {
                            i11 = R$id.middleContainerLl;
                            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                            if (linearLayout != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                                MViewProgressbarBgBinding bind = MViewProgressbarBgBinding.bind(d11);
                                i11 = R$id.rootList;
                                SquircleLinearLayout squircleLinearLayout3 = (SquircleLinearLayout) C2548q.d(i11, view);
                                if (squircleLinearLayout3 != null) {
                                    i11 = R$id.supportViewRoot;
                                    MotionLayout motionLayout = (MotionLayout) C2548q.d(i11, view);
                                    if (motionLayout != null) {
                                        return new MFragmentChatListBinding(coordinatorLayout, squircleLinearLayout, coordinatorLayout, constraintLayout, messengerMetricsRecyclerView, frameLayout, squircleLinearLayout2, linearLayout, bind, squircleLinearLayout3, motionLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MFragmentChatListBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_chat_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CoordinatorLayout getConstraintLayout() {
        return this.rootView;
    }
}

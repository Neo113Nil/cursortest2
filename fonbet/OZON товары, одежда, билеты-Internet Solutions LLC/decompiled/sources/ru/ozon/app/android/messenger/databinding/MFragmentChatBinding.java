package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.blocks.common.BottomArcView;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.framework.presentation.chatdetail.view.ScrollToLastMessageButton;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFragmentChatBinding implements a {

    @NonNull
    public final LinearLayout actionButtonContainer;

    @NonNull
    public final LinearLayout bottomContainerLl;

    @NonNull
    public final ConstraintLayout chatContainerCl;

    @NonNull
    public final LinearLayout headerContainerLl;

    @NonNull
    public final MessengerMetricsRecyclerView messagesRv;

    @NonNull
    public final LinearLayout middleContainerLl;

    @NonNull
    public final SquircleLinearLayout pinContainerLl;

    @NonNull
    public final MViewProgressbarBgBinding progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ScrollToLastMessageButton scrollToLastMessageBtn;

    @NonNull
    public final BottomArcView teethArch;

    private MFragmentChatBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout3, @NonNull MessengerMetricsRecyclerView messengerMetricsRecyclerView, @NonNull LinearLayout linearLayout4, @NonNull SquircleLinearLayout squircleLinearLayout, @NonNull MViewProgressbarBgBinding mViewProgressbarBgBinding, @NonNull ScrollToLastMessageButton scrollToLastMessageButton, @NonNull BottomArcView bottomArcView) {
        this.rootView = constraintLayout;
        this.actionButtonContainer = linearLayout;
        this.bottomContainerLl = linearLayout2;
        this.chatContainerCl = constraintLayout2;
        this.headerContainerLl = linearLayout3;
        this.messagesRv = messengerMetricsRecyclerView;
        this.middleContainerLl = linearLayout4;
        this.pinContainerLl = squircleLinearLayout;
        this.progressBar = mViewProgressbarBgBinding;
        this.scrollToLastMessageBtn = scrollToLastMessageButton;
        this.teethArch = bottomArcView;
    }

    @NonNull
    public static MFragmentChatBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.actionButtonContainer;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.bottomContainerLl;
            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.headerContainerLl;
                LinearLayout linearLayout3 = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout3 != null) {
                    i11 = R$id.messagesRv;
                    MessengerMetricsRecyclerView messengerMetricsRecyclerView = (MessengerMetricsRecyclerView) C2548q.d(i11, view);
                    if (messengerMetricsRecyclerView != null) {
                        i11 = R$id.middleContainerLl;
                        LinearLayout linearLayout4 = (LinearLayout) C2548q.d(i11, view);
                        if (linearLayout4 != null) {
                            i11 = R$id.pinContainerLl;
                            SquircleLinearLayout squircleLinearLayout = (SquircleLinearLayout) C2548q.d(i11, view);
                            if (squircleLinearLayout != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                                MViewProgressbarBgBinding bind = MViewProgressbarBgBinding.bind(d11);
                                i11 = R$id.scrollToLastMessageBtn;
                                ScrollToLastMessageButton scrollToLastMessageButton = (ScrollToLastMessageButton) C2548q.d(i11, view);
                                if (scrollToLastMessageButton != null) {
                                    i11 = R$id.teethArch;
                                    BottomArcView bottomArcView = (BottomArcView) C2548q.d(i11, view);
                                    if (bottomArcView != null) {
                                        return new MFragmentChatBinding(constraintLayout, linearLayout, linearLayout2, constraintLayout, linearLayout3, messengerMetricsRecyclerView, linearLayout4, squircleLinearLayout, bind, scrollToLastMessageButton, bottomArcView);
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
    public static MFragmentChatBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_chat, viewGroup, false);
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

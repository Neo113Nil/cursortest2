package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.framework.presentation.ai.AiFloatingButtonContainer;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MFragmentAiAssistantBinding implements a {

    @NonNull
    public final ConstraintLayout aiAssistantRootCl;

    @NonNull
    public final SquircleLinearLayout bottomContainerLl;

    @NonNull
    public final SquircleLinearLayout headerContainerLl;

    @NonNull
    public final ComposeView mainContent;

    @NonNull
    public final LinearLayout middleContainerLl;

    @NonNull
    public final MViewProgressbarBgBinding progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AiFloatingButtonContainer scrollButtonContainer;

    @NonNull
    public final ComposeView sourcesCurtainContainer;

    private MFragmentAiAssistantBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull SquircleLinearLayout squircleLinearLayout, @NonNull SquircleLinearLayout squircleLinearLayout2, @NonNull ComposeView composeView, @NonNull LinearLayout linearLayout, @NonNull MViewProgressbarBgBinding mViewProgressbarBgBinding, @NonNull AiFloatingButtonContainer aiFloatingButtonContainer, @NonNull ComposeView composeView2) {
        this.rootView = constraintLayout;
        this.aiAssistantRootCl = constraintLayout2;
        this.bottomContainerLl = squircleLinearLayout;
        this.headerContainerLl = squircleLinearLayout2;
        this.mainContent = composeView;
        this.middleContainerLl = linearLayout;
        this.progressBar = mViewProgressbarBgBinding;
        this.scrollButtonContainer = aiFloatingButtonContainer;
        this.sourcesCurtainContainer = composeView2;
    }

    @NonNull
    public static MFragmentAiAssistantBinding bind(@NonNull View view) {
        View d11;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.bottomContainerLl;
        SquircleLinearLayout squircleLinearLayout = (SquircleLinearLayout) C2548q.d(i11, view);
        if (squircleLinearLayout != null) {
            i11 = R$id.headerContainerLl;
            SquircleLinearLayout squircleLinearLayout2 = (SquircleLinearLayout) C2548q.d(i11, view);
            if (squircleLinearLayout2 != null) {
                i11 = R$id.mainContent;
                ComposeView composeView = (ComposeView) C2548q.d(i11, view);
                if (composeView != null) {
                    i11 = R$id.middleContainerLl;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                        MViewProgressbarBgBinding bind = MViewProgressbarBgBinding.bind(d11);
                        i11 = R$id.scrollButtonContainer;
                        AiFloatingButtonContainer aiFloatingButtonContainer = (AiFloatingButtonContainer) C2548q.d(i11, view);
                        if (aiFloatingButtonContainer != null) {
                            i11 = R$id.sourcesCurtainContainer;
                            ComposeView composeView2 = (ComposeView) C2548q.d(i11, view);
                            if (composeView2 != null) {
                                return new MFragmentAiAssistantBinding(constraintLayout, constraintLayout, squircleLinearLayout, squircleLinearLayout2, composeView, linearLayout, bind, aiFloatingButtonContainer, composeView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MFragmentAiAssistantBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_fragment_ai_assistant, viewGroup, false);
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

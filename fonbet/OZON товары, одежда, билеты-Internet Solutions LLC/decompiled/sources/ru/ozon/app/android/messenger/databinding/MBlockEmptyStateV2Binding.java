package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.blocks.emptystate.v2.presentation.EmptyStateV2ButtonsHorizontalView;
import ru.ozon.android.messenger.blocks.emptystate.v2.presentation.EmptyStateV2ButtonsVerticalView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class MBlockEmptyStateV2Binding implements a {

    @NonNull
    public final LinearLayout blockEmptyStateFl;

    @NonNull
    public final SquircleLinearLayout blockEmptyStateLl;

    @NonNull
    public final EmptyStateV2ButtonsVerticalView emptyStateBottomButtons;

    @NonNull
    public final EmptyStateV2ButtonsHorizontalView emptyStateButtons;

    @NonNull
    public final TextAtomV2View emptyStateDescriptionTv;

    @NonNull
    public final Image emptyStateIv;

    @NonNull
    public final TextAtomV2View emptyStateTitleTv;

    @NonNull
    private final LinearLayout rootView;

    private MBlockEmptyStateV2Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SquircleLinearLayout squircleLinearLayout, @NonNull EmptyStateV2ButtonsVerticalView emptyStateV2ButtonsVerticalView, @NonNull EmptyStateV2ButtonsHorizontalView emptyStateV2ButtonsHorizontalView, @NonNull TextAtomV2View textAtomV2View, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = linearLayout;
        this.blockEmptyStateFl = linearLayout2;
        this.blockEmptyStateLl = squircleLinearLayout;
        this.emptyStateBottomButtons = emptyStateV2ButtonsVerticalView;
        this.emptyStateButtons = emptyStateV2ButtonsHorizontalView;
        this.emptyStateDescriptionTv = textAtomV2View;
        this.emptyStateIv = image;
        this.emptyStateTitleTv = textAtomV2View2;
    }

    @NonNull
    public static MBlockEmptyStateV2Binding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.blockEmptyStateLl;
        SquircleLinearLayout squircleLinearLayout = (SquircleLinearLayout) C2548q.d(i11, view);
        if (squircleLinearLayout != null) {
            i11 = R$id.emptyStateBottomButtons;
            EmptyStateV2ButtonsVerticalView emptyStateV2ButtonsVerticalView = (EmptyStateV2ButtonsVerticalView) C2548q.d(i11, view);
            if (emptyStateV2ButtonsVerticalView != null) {
                i11 = R$id.emptyStateButtons;
                EmptyStateV2ButtonsHorizontalView emptyStateV2ButtonsHorizontalView = (EmptyStateV2ButtonsHorizontalView) C2548q.d(i11, view);
                if (emptyStateV2ButtonsHorizontalView != null) {
                    i11 = R$id.emptyStateDescriptionTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.emptyStateIv;
                        Image image = (Image) C2548q.d(i11, view);
                        if (image != null) {
                            i11 = R$id.emptyStateTitleTv;
                            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                            if (textAtomV2View2 != null) {
                                return new MBlockEmptyStateV2Binding(linearLayout, linearLayout, squircleLinearLayout, emptyStateV2ButtonsVerticalView, emptyStateV2ButtonsHorizontalView, textAtomV2View, image, textAtomV2View2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockEmptyStateV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_empty_state_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}

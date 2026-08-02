package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.utils.view.LabeledIconView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class MViewChatInputCustomBlockBinding implements a {

    @NonNull
    public final Barrier barrierH;

    @NonNull
    public final IconView customBlockIcon;

    @NonNull
    public final ConstraintLayout customBlockRoot;

    @NonNull
    public final TextAtomV2View customBlockSubtitle;

    @NonNull
    public final TextAtomV2View customBlockTitle;

    @NonNull
    public final LabeledIconView labeledIcon;

    @NonNull
    public final IconButtonV3View removeIcon;

    @NonNull
    private final ConstraintLayout rootView;

    private MViewChatInputCustomBlockBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull IconView iconView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull LabeledIconView labeledIconView, @NonNull IconButtonV3View iconButtonV3View) {
        this.rootView = constraintLayout;
        this.barrierH = barrier;
        this.customBlockIcon = iconView;
        this.customBlockRoot = constraintLayout2;
        this.customBlockSubtitle = textAtomV2View;
        this.customBlockTitle = textAtomV2View2;
        this.labeledIcon = labeledIconView;
        this.removeIcon = iconButtonV3View;
    }

    @NonNull
    public static MViewChatInputCustomBlockBinding bind(@NonNull View view) {
        int i11 = R$id.barrierH;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.customBlockIcon;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.customBlockSubtitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.customBlockTitle;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.labeledIcon;
                        LabeledIconView labeledIconView = (LabeledIconView) C2548q.d(i11, view);
                        if (labeledIconView != null) {
                            i11 = R$id.removeIcon;
                            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                            if (iconButtonV3View != null) {
                                return new MViewChatInputCustomBlockBinding(constraintLayout, barrier, iconView, constraintLayout, textAtomV2View, textAtomV2View2, labeledIconView, iconButtonV3View);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewChatInputCustomBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_chat_input_custom_block, viewGroup, false);
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

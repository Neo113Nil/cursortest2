package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetSingleQuestionBinding implements a {

    @NonNull
    public final SingleAtom answerBa;

    @NonNull
    public final ImageView avatarIv;

    @NonNull
    public final TextView avatarTv;

    @NonNull
    public final TextView dateTv;

    @NonNull
    public final Barrier headerB;

    @NonNull
    public final ImageView likeIv;

    @NonNull
    public final LinearLayout likeLl;

    @NonNull
    public final TextView likeTv;

    @NonNull
    public final SmallIconButtonView menuSibv;

    @NonNull
    public final TextAtomV2View nameTv;

    @NonNull
    public final IconView officialAgentIv;

    @NonNull
    public final TextAtomV2View questionTav;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetSingleQuestionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SingleAtom singleAtom, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Barrier barrier, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomV2View textAtomV2View, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.answerBa = singleAtom;
        this.avatarIv = imageView;
        this.avatarTv = textView;
        this.dateTv = textView2;
        this.headerB = barrier;
        this.likeIv = imageView2;
        this.likeLl = linearLayout;
        this.likeTv = textView3;
        this.menuSibv = smallIconButtonView;
        this.nameTv = textAtomV2View;
        this.officialAgentIv = iconView;
        this.questionTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetSingleQuestionBinding bind(@NonNull View view) {
        int i11 = R$id.answerBa;
        SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
        if (singleAtom != null) {
            i11 = R$id.avatarIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.avatarTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.dateTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.headerB;
                        Barrier barrier = (Barrier) C2548q.d(i11, view);
                        if (barrier != null) {
                            i11 = R$id.likeIv;
                            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                            if (imageView2 != null) {
                                i11 = R$id.likeLl;
                                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                                if (linearLayout != null) {
                                    i11 = R$id.likeTv;
                                    TextView textView3 = (TextView) C2548q.d(i11, view);
                                    if (textView3 != null) {
                                        i11 = R$id.menuSibv;
                                        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                                        if (smallIconButtonView != null) {
                                            i11 = R$id.nameTv;
                                            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                            if (textAtomV2View != null) {
                                                i11 = R$id.officialAgentIv;
                                                IconView iconView = (IconView) C2548q.d(i11, view);
                                                if (iconView != null) {
                                                    i11 = R$id.questionTav;
                                                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                                    if (textAtomV2View2 != null) {
                                                        return new WidgetSingleQuestionBinding((ConstraintLayout) view, singleAtom, imageView, textView, textView2, barrier, imageView2, linearLayout, textView3, smallIconButtonView, textAtomV2View, iconView, textAtomV2View2);
                                                    }
                                                }
                                            }
                                        }
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}

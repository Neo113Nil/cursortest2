package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes2.dex */
public final class WidgetAnswerBinding implements a {

    @NonNull
    public final TextAtomV2View answerTav;

    @NonNull
    public final ImageView avatarIv;

    @NonNull
    public final AppCompatTextView avatarTv;

    @NonNull
    public final BadgeView badgeBv;

    @NonNull
    public final TextAtomV2View buttonsTitleTav;

    @NonNull
    public final AppCompatTextView dateTv;

    @NonNull
    public final TagAtomView dislikeTav;

    @NonNull
    public final Barrier headerB;

    @NonNull
    public final TagAtomView likeTav;

    @NonNull
    public final SmallIconButtonView makeBestSibv;

    @NonNull
    public final SmallIconButtonView menuSibv;

    @NonNull
    public final SingleAtom moreAnswersSa;

    @NonNull
    public final TextAtomV2View nameTv;

    @NonNull
    public final IconView officialAgentIv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAnswerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull BadgeView badgeView, @NonNull TextAtomV2View textAtomV2View2, @NonNull AppCompatTextView appCompatTextView2, @NonNull TagAtomView tagAtomView, @NonNull Barrier barrier, @NonNull TagAtomView tagAtomView2, @NonNull SmallIconButtonView smallIconButtonView, @NonNull SmallIconButtonView smallIconButtonView2, @NonNull SingleAtom singleAtom, @NonNull TextAtomV2View textAtomV2View3, @NonNull IconView iconView) {
        this.rootView = constraintLayout;
        this.answerTav = textAtomV2View;
        this.avatarIv = imageView;
        this.avatarTv = appCompatTextView;
        this.badgeBv = badgeView;
        this.buttonsTitleTav = textAtomV2View2;
        this.dateTv = appCompatTextView2;
        this.dislikeTav = tagAtomView;
        this.headerB = barrier;
        this.likeTav = tagAtomView2;
        this.makeBestSibv = smallIconButtonView;
        this.menuSibv = smallIconButtonView2;
        this.moreAnswersSa = singleAtom;
        this.nameTv = textAtomV2View3;
        this.officialAgentIv = iconView;
    }

    @NonNull
    public static WidgetAnswerBinding bind(@NonNull View view) {
        int i11 = R$id.answerTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.avatarIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.avatarTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    i11 = R$id.badgeBv;
                    BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
                    if (badgeView != null) {
                        i11 = R$id.buttonsTitleTav;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.dateTv;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView2 != null) {
                                i11 = R$id.dislikeTav;
                                TagAtomView tagAtomView = (TagAtomView) C2548q.d(i11, view);
                                if (tagAtomView != null) {
                                    i11 = R$id.headerB;
                                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                                    if (barrier != null) {
                                        i11 = R$id.likeTav;
                                        TagAtomView tagAtomView2 = (TagAtomView) C2548q.d(i11, view);
                                        if (tagAtomView2 != null) {
                                            i11 = R$id.makeBestSibv;
                                            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
                                            if (smallIconButtonView != null) {
                                                i11 = R$id.menuSibv;
                                                SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) C2548q.d(i11, view);
                                                if (smallIconButtonView2 != null) {
                                                    i11 = R$id.moreAnswersSa;
                                                    SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
                                                    if (singleAtom != null) {
                                                        i11 = R$id.nameTv;
                                                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                                                        if (textAtomV2View3 != null) {
                                                            i11 = R$id.officialAgentIv;
                                                            IconView iconView = (IconView) C2548q.d(i11, view);
                                                            if (iconView != null) {
                                                                return new WidgetAnswerBinding((ConstraintLayout) view, textAtomV2View, imageView, appCompatTextView, badgeView, textAtomV2View2, appCompatTextView2, tagAtomView, barrier, tagAtomView2, smallIconButtonView, smallIconButtonView2, singleAtom, textAtomV2View3, iconView);
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

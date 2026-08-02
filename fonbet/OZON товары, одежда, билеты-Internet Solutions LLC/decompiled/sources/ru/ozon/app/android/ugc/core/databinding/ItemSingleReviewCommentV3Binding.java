package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes2.dex */
public final class ItemSingleReviewCommentV3Binding implements a {

    @NonNull
    public final ButtonV3View answerBtn;

    @NonNull
    public final ConstraintLayout commentCl;

    @NonNull
    public final TextAtomV2View commentTv;

    @NonNull
    public final TextAtomV2View dateTv;

    @NonNull
    public final IconButtonV3View deleteBtn;

    @NonNull
    public final IconButtonV3View reportBtn;

    @NonNull
    public final IconButtonV3View reportedBtn;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View separatorView;

    @NonNull
    public final CellView socialHeader;

    private ItemSingleReviewCommentV3Binding(@NonNull FrameLayout frameLayout, @NonNull ButtonV3View buttonV3View, @NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull IconButtonV3View iconButtonV3View, @NonNull IconButtonV3View iconButtonV3View2, @NonNull IconButtonV3View iconButtonV3View3, @NonNull View view, @NonNull CellView cellView) {
        this.rootView = frameLayout;
        this.answerBtn = buttonV3View;
        this.commentCl = constraintLayout;
        this.commentTv = textAtomV2View;
        this.dateTv = textAtomV2View2;
        this.deleteBtn = iconButtonV3View;
        this.reportBtn = iconButtonV3View2;
        this.reportedBtn = iconButtonV3View3;
        this.separatorView = view;
        this.socialHeader = cellView;
    }

    @NonNull
    public static ItemSingleReviewCommentV3Binding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.answerBtn;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.commentCl;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null) {
                i11 = R$id.commentTv;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.dateTv;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.deleteBtn;
                        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                        if (iconButtonV3View != null) {
                            i11 = R$id.reportBtn;
                            IconButtonV3View iconButtonV3View2 = (IconButtonV3View) C2548q.d(i11, view);
                            if (iconButtonV3View2 != null) {
                                i11 = R$id.reportedBtn;
                                IconButtonV3View iconButtonV3View3 = (IconButtonV3View) C2548q.d(i11, view);
                                if (iconButtonV3View3 != null && (d11 = C2548q.d((i11 = R$id.separatorView), view)) != null) {
                                    i11 = R$id.socialHeader;
                                    CellView cellView = (CellView) C2548q.d(i11, view);
                                    if (cellView != null) {
                                        return new ItemSingleReviewCommentV3Binding((FrameLayout) view, buttonV3View, constraintLayout, textAtomV2View, textAtomV2View2, iconButtonV3View, iconButtonV3View2, iconButtonV3View3, d11, cellView);
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
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}

package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;

/* loaded from: classes2.dex */
public final class WidgetEditCredentialsBinding implements a {

    @NonNull
    public final Barrier bottomInputs;

    @NonNull
    public final TextView captionTv;

    @NonNull
    public final ButtonV3View confirmBtn;

    @NonNull
    public final TextView errorTv;

    @NonNull
    public final OzonTextInputLayout hintIl;

    @NonNull
    public final TextView noAvailable;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ButtonV3View secondaryBtn;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    private WidgetEditCredentialsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull TextView textView, @NonNull ButtonV3View buttonV3View, @NonNull TextView textView2, @NonNull OzonTextInputLayout ozonTextInputLayout, @NonNull TextView textView3, @NonNull ButtonV3View buttonV3View2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.bottomInputs = barrier;
        this.captionTv = textView;
        this.confirmBtn = buttonV3View;
        this.errorTv = textView2;
        this.hintIl = ozonTextInputLayout;
        this.noAvailable = textView3;
        this.secondaryBtn = buttonV3View2;
        this.subtitleTv = textAtomV2View;
        this.titleTv = textAtomV2View2;
    }

    @NonNull
    public static WidgetEditCredentialsBinding bind(@NonNull View view) {
        int i11 = R$id.bottomInputs;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.captionTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.confirmBtn;
                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View != null) {
                    i11 = R$id.errorTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.hintIl;
                        OzonTextInputLayout ozonTextInputLayout = (OzonTextInputLayout) C2548q.d(i11, view);
                        if (ozonTextInputLayout != null) {
                            i11 = R$id.noAvailable;
                            TextView textView3 = (TextView) C2548q.d(i11, view);
                            if (textView3 != null) {
                                i11 = R$id.secondaryBtn;
                                ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
                                if (buttonV3View2 != null) {
                                    i11 = R$id.subtitleTv;
                                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View != null) {
                                        i11 = R$id.titleTv;
                                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                        if (textAtomV2View2 != null) {
                                            return new WidgetEditCredentialsBinding((ConstraintLayout) view, barrier, textView, buttonV3View, textView2, ozonTextInputLayout, textView3, buttonV3View2, textAtomV2View, textAtomV2View2);
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

package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.auth.presentation.views.SberIdButton;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetAuthBinding implements a {

    @NonNull
    public final CellWithSubtitleCheckboxRadioView advertisementCheckboxRadioView;

    @NonNull
    public final DisclaimerContainer annotation;

    @NonNull
    public final ConstraintLayout authCl;

    @NonNull
    public final FrameLayout authProgressBar;

    @NonNull
    public final ScrollView authWidget;

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final LinearLayout buttonContainer;

    @NonNull
    public final LinearLayout divider;

    @NonNull
    public final RecyclerView formBlocksRv;

    @NonNull
    public final LinearLayout hintButtonsContainerLl;

    @NonNull
    public final LoaderView progressBar;

    @NonNull
    private final ScrollView rootView;

    @NonNull
    public final SberIdButton sberBtn;

    @NonNull
    public final Button submitBtn;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextAtomView termsOfUseText;

    @NonNull
    public final TextView titleTv;

    private WidgetAuthBinding(@NonNull ScrollView scrollView, @NonNull CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView, @NonNull DisclaimerContainer disclaimerContainer, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull ScrollView scrollView2, @NonNull Barrier barrier, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout3, @NonNull LoaderView loaderView, @NonNull SberIdButton sberIdButton, @NonNull Button button, @NonNull TextView textView, @NonNull TextAtomView textAtomView, @NonNull TextView textView2) {
        this.rootView = scrollView;
        this.advertisementCheckboxRadioView = cellWithSubtitleCheckboxRadioView;
        this.annotation = disclaimerContainer;
        this.authCl = constraintLayout;
        this.authProgressBar = frameLayout;
        this.authWidget = scrollView2;
        this.barrier = barrier;
        this.buttonContainer = linearLayout;
        this.divider = linearLayout2;
        this.formBlocksRv = recyclerView;
        this.hintButtonsContainerLl = linearLayout3;
        this.progressBar = loaderView;
        this.sberBtn = sberIdButton;
        this.submitBtn = button;
        this.subtitleTv = textView;
        this.termsOfUseText = textAtomView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetAuthBinding bind(@NonNull View view) {
        int i11 = R$id.advertisementCheckboxRadioView;
        CellWithSubtitleCheckboxRadioView cellWithSubtitleCheckboxRadioView = (CellWithSubtitleCheckboxRadioView) C2548q.d(i11, view);
        if (cellWithSubtitleCheckboxRadioView != null) {
            i11 = R$id.annotation;
            DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
            if (disclaimerContainer != null) {
                i11 = R$id.authCl;
                ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                if (constraintLayout != null) {
                    i11 = R$id.authProgressBar;
                    FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                    if (frameLayout != null) {
                        ScrollView scrollView = (ScrollView) view;
                        i11 = R$id.barrier;
                        Barrier barrier = (Barrier) C2548q.d(i11, view);
                        if (barrier != null) {
                            i11 = R$id.buttonContainer;
                            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                            if (linearLayout != null) {
                                i11 = R$id.divider;
                                LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
                                if (linearLayout2 != null) {
                                    i11 = R$id.formBlocksRv;
                                    RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                                    if (recyclerView != null) {
                                        i11 = R$id.hintButtonsContainerLl;
                                        LinearLayout linearLayout3 = (LinearLayout) C2548q.d(i11, view);
                                        if (linearLayout3 != null) {
                                            i11 = R$id.progressBar;
                                            LoaderView loaderView = (LoaderView) C2548q.d(i11, view);
                                            if (loaderView != null) {
                                                i11 = R$id.sberBtn;
                                                SberIdButton sberIdButton = (SberIdButton) C2548q.d(i11, view);
                                                if (sberIdButton != null) {
                                                    i11 = R$id.submitBtn;
                                                    Button button = (Button) C2548q.d(i11, view);
                                                    if (button != null) {
                                                        i11 = R$id.subtitleTv;
                                                        TextView textView = (TextView) C2548q.d(i11, view);
                                                        if (textView != null) {
                                                            i11 = R$id.termsOfUseText;
                                                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                                                            if (textAtomView != null) {
                                                                i11 = R$id.titleTv;
                                                                TextView textView2 = (TextView) C2548q.d(i11, view);
                                                                if (textView2 != null) {
                                                                    return new WidgetAuthBinding(scrollView, cellWithSubtitleCheckboxRadioView, disclaimerContainer, constraintLayout, frameLayout, scrollView, barrier, linearLayout, linearLayout2, recyclerView, linearLayout3, loaderView, sberIdButton, button, textView, textAtomView, textView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetAuthBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_auth, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ScrollView getConstraintLayout() {
        return this.rootView;
    }
}

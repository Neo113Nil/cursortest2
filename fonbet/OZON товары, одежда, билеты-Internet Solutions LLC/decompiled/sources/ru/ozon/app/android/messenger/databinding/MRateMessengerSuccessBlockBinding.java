package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class MRateMessengerSuccessBlockBinding implements a {

    @NonNull
    public final LargeButtonView closeButton;

    @NonNull
    public final TextAtomView descriptionTextAtom;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatImageView successImageView;

    @NonNull
    public final LinearLayout successSheetRoot;

    @NonNull
    public final TextAtomView titleTextAtom;

    private MRateMessengerSuccessBlockBinding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout2, @NonNull TextAtomView textAtomView2) {
        this.rootView = linearLayout;
        this.closeButton = largeButtonView;
        this.descriptionTextAtom = textAtomView;
        this.successImageView = appCompatImageView;
        this.successSheetRoot = linearLayout2;
        this.titleTextAtom = textAtomView2;
    }

    @NonNull
    public static MRateMessengerSuccessBlockBinding bind(@NonNull View view) {
        int i11 = R$id.closeButton;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            i11 = R$id.descriptionTextAtom;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.successImageView;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = R$id.titleTextAtom;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new MRateMessengerSuccessBlockBinding(linearLayout, largeButtonView, textAtomView, appCompatImageView, linearLayout, textAtomView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MRateMessengerSuccessBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_rate_messenger_success_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

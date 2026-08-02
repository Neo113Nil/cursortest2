package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.disclaimer.DisclaimerView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class MExternalTransitionModalBlockBinding implements a {

    @NonNull
    public final DisclaimerView disclaimer;

    @NonNull
    public final TextAtomV2View linkTv;

    @NonNull
    public final LinearLayoutCompat root;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final ButtonV3View stayBtn;

    @NonNull
    public final TextAtomV2View subtitleTv;

    @NonNull
    public final TextAtomV2View titleTv;

    @NonNull
    public final Image warningIv;

    private MExternalTransitionModalBlockBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull DisclaimerView disclaimerView, @NonNull TextAtomV2View textAtomV2View, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ButtonV3View buttonV3View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3, @NonNull Image image) {
        this.rootView = linearLayoutCompat;
        this.disclaimer = disclaimerView;
        this.linkTv = textAtomV2View;
        this.root = linearLayoutCompat2;
        this.stayBtn = buttonV3View;
        this.subtitleTv = textAtomV2View2;
        this.titleTv = textAtomV2View3;
        this.warningIv = image;
    }

    @NonNull
    public static MExternalTransitionModalBlockBinding bind(@NonNull View view) {
        int i11 = R$id.disclaimer;
        DisclaimerView disclaimerView = (DisclaimerView) C2548q.d(i11, view);
        if (disclaimerView != null) {
            i11 = R$id.linkTv;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i11 = R$id.stayBtn;
                ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
                if (buttonV3View != null) {
                    i11 = R$id.subtitleTv;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.titleTv;
                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View3 != null) {
                            i11 = R$id.warningIv;
                            Image image = (Image) C2548q.d(i11, view);
                            if (image != null) {
                                return new MExternalTransitionModalBlockBinding(linearLayoutCompat, disclaimerView, textAtomV2View, linearLayoutCompat, buttonV3View, textAtomV2View2, textAtomV2View3, image);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MExternalTransitionModalBlockBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_external_transition_modal_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayoutCompat getConstraintLayout() {
        return this.rootView;
    }
}

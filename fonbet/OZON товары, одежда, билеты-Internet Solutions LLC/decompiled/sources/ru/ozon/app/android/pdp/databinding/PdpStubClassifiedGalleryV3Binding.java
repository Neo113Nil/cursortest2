package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpStubClassifiedGalleryV3Binding implements a {

    @NonNull
    public final View classifiedBackgroundV;

    @NonNull
    public final TextAtomV2View classifiedTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final WaveView waveV;

    private PdpStubClassifiedGalleryV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextAtomV2View textAtomV2View, @NonNull WaveView waveView) {
        this.rootView = constraintLayout;
        this.classifiedBackgroundV = view;
        this.classifiedTv = textAtomV2View;
        this.waveV = waveView;
    }

    @NonNull
    public static PdpStubClassifiedGalleryV3Binding bind(@NonNull View view) {
        int i11 = R$id.classifiedBackgroundV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.classifiedTv;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.waveV;
                WaveView waveView = (WaveView) C2548q.d(i11, view);
                if (waveView != null) {
                    return new PdpStubClassifiedGalleryV3Binding((ConstraintLayout) view, d11, textAtomV2View, waveView);
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

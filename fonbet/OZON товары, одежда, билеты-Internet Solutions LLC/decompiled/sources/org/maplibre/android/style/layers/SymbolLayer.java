package org.maplibre.android.style.layers;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class SymbolLayer extends Layer {
    @Keep
    SymbolLayer(long j11) {
        super(j11);
    }

    @NonNull
    @Keep
    private native Object nativeGetIconAllowOverlap();

    @NonNull
    @Keep
    private native Object nativeGetIconAnchor();

    @NonNull
    @Keep
    private native Object nativeGetIconColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIconColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetIconHaloBlur();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIconHaloBlurTransition();

    @NonNull
    @Keep
    private native Object nativeGetIconHaloColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIconHaloColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetIconHaloWidth();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIconHaloWidthTransition();

    @NonNull
    @Keep
    private native Object nativeGetIconIgnorePlacement();

    @NonNull
    @Keep
    private native Object nativeGetIconImage();

    @NonNull
    @Keep
    private native Object nativeGetIconKeepUpright();

    @NonNull
    @Keep
    private native Object nativeGetIconOffset();

    @NonNull
    @Keep
    private native Object nativeGetIconOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIconOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetIconOptional();

    @NonNull
    @Keep
    private native Object nativeGetIconPadding();

    @NonNull
    @Keep
    private native Object nativeGetIconPitchAlignment();

    @NonNull
    @Keep
    private native Object nativeGetIconRotate();

    @NonNull
    @Keep
    private native Object nativeGetIconRotationAlignment();

    @NonNull
    @Keep
    private native Object nativeGetIconSize();

    @NonNull
    @Keep
    private native Object nativeGetIconTextFit();

    @NonNull
    @Keep
    private native Object nativeGetIconTextFitPadding();

    @NonNull
    @Keep
    private native Object nativeGetIconTranslate();

    @NonNull
    @Keep
    private native Object nativeGetIconTranslateAnchor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetIconTranslateTransition();

    @NonNull
    @Keep
    private native Object nativeGetSymbolAvoidEdges();

    @NonNull
    @Keep
    private native Object nativeGetSymbolPlacement();

    @NonNull
    @Keep
    private native Object nativeGetSymbolScreenSpace();

    @NonNull
    @Keep
    private native Object nativeGetSymbolSortKey();

    @NonNull
    @Keep
    private native Object nativeGetSymbolSpacing();

    @NonNull
    @Keep
    private native Object nativeGetSymbolZOrder();

    @NonNull
    @Keep
    private native Object nativeGetTextAllowOverlap();

    @NonNull
    @Keep
    private native Object nativeGetTextAnchor();

    @NonNull
    @Keep
    private native Object nativeGetTextColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTextColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetTextField();

    @NonNull
    @Keep
    private native Object nativeGetTextFont();

    @NonNull
    @Keep
    private native Object nativeGetTextHaloBlur();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTextHaloBlurTransition();

    @NonNull
    @Keep
    private native Object nativeGetTextHaloColor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTextHaloColorTransition();

    @NonNull
    @Keep
    private native Object nativeGetTextHaloWidth();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTextHaloWidthTransition();

    @NonNull
    @Keep
    private native Object nativeGetTextIgnorePlacement();

    @NonNull
    @Keep
    private native Object nativeGetTextJustify();

    @NonNull
    @Keep
    private native Object nativeGetTextKeepUpright();

    @NonNull
    @Keep
    private native Object nativeGetTextLetterSpacing();

    @NonNull
    @Keep
    private native Object nativeGetTextLineHeight();

    @NonNull
    @Keep
    private native Object nativeGetTextMaxAngle();

    @NonNull
    @Keep
    private native Object nativeGetTextMaxWidth();

    @NonNull
    @Keep
    private native Object nativeGetTextOffset();

    @NonNull
    @Keep
    private native Object nativeGetTextOpacity();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTextOpacityTransition();

    @NonNull
    @Keep
    private native Object nativeGetTextOptional();

    @NonNull
    @Keep
    private native Object nativeGetTextPadding();

    @NonNull
    @Keep
    private native Object nativeGetTextPitchAlignment();

    @NonNull
    @Keep
    private native Object nativeGetTextRadialOffset();

    @NonNull
    @Keep
    private native Object nativeGetTextRotate();

    @NonNull
    @Keep
    private native Object nativeGetTextRotationAlignment();

    @NonNull
    @Keep
    private native Object nativeGetTextSize();

    @NonNull
    @Keep
    private native Object nativeGetTextTransform();

    @NonNull
    @Keep
    private native Object nativeGetTextTranslate();

    @NonNull
    @Keep
    private native Object nativeGetTextTranslateAnchor();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTextTranslateTransition();

    @NonNull
    @Keep
    private native Object nativeGetTextVariableAnchor();

    @NonNull
    @Keep
    private native Object nativeGetTextVariableAnchorOffset();

    @NonNull
    @Keep
    private native Object nativeGetTextWritingMode();

    @Keep
    private native void nativeSetIconColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetIconHaloBlurTransition(long j11, long j12);

    @Keep
    private native void nativeSetIconHaloColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetIconHaloWidthTransition(long j11, long j12);

    @Keep
    private native void nativeSetIconOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetIconTranslateTransition(long j11, long j12);

    @Keep
    private native void nativeSetTextColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetTextHaloBlurTransition(long j11, long j12);

    @Keep
    private native void nativeSetTextHaloColorTransition(long j11, long j12);

    @Keep
    private native void nativeSetTextHaloWidthTransition(long j11, long j12);

    @Keep
    private native void nativeSetTextOpacityTransition(long j11, long j12);

    @Keep
    private native void nativeSetTextTranslateTransition(long j11, long j12);

    @Override // org.maplibre.android.style.layers.Layer
    @Keep
    protected native void finalize() throws Throwable;

    @Keep
    protected native void initialize(String str, String str2);

    public SymbolLayer(String str, String str2) {
        initialize(str, str2);
    }
}

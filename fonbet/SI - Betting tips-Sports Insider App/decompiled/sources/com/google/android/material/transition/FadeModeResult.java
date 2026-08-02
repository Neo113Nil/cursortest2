package com.google.android.material.transition;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i5, int i10, boolean z5) {
        this.startAlpha = i5;
        this.endAlpha = i10;
        this.endOnTop = z5;
    }

    public static FadeModeResult endOnTop(int i5, int i10) {
        return new FadeModeResult(i5, i10, true);
    }

    public static FadeModeResult startOnTop(int i5, int i10) {
        return new FadeModeResult(i5, i10, false);
    }
}

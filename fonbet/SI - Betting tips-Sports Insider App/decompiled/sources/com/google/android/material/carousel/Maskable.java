package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(float f6);

    void setOnMaskChangedListener(OnMaskChangedListener onMaskChangedListener);
}

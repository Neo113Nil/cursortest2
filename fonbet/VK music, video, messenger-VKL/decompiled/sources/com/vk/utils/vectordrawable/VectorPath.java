package com.vk.utils.vectordrawable;

import android.graphics.Path;
import androidx.annotation.Keep;

/* compiled from: VectorPath.kt */
@Keep
/* loaded from: classes6.dex */
public interface VectorPath extends AnimationTarget {
    int getFillColor();

    Path getPath();

    int getStrokeAlpha();

    int getStrokeColor();

    float getStrokeWidth();

    void setFillColor(int i);

    void setStrokeAlpha(int i);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}

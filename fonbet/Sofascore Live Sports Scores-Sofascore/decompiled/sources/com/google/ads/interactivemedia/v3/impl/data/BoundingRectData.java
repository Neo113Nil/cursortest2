package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_BoundingRectData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_BoundingRectData.class)
/* loaded from: classes2.dex */
public abstract class BoundingRectData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract BoundingRectData build();

        @NonNull
        public abstract Builder height(int i);

        @NonNull
        public abstract Builder left(int i);

        @NonNull
        public Builder locationOnScreenOfView(@NonNull View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
        }

        @NonNull
        public abstract Builder top(int i);

        @NonNull
        public abstract Builder width(int i);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_BoundingRectData.Builder();
    }

    public abstract int height();

    public abstract int left();

    public abstract int top();

    public abstract int width();
}

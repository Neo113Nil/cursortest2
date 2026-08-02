package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.ironsource.U3;
import defpackage.fn0;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_ResizeAndPositionVideoMsgData.class)
/* loaded from: classes2.dex */
public abstract class ResizeAndPositionVideoMsgData {
    @NonNull
    public static ResizeAndPositionVideoMsgData create(@NonNull Integer num, @NonNull Integer num2, @NonNull Integer num3, @NonNull Integer num4) {
        return new AutoValue_ResizeAndPositionVideoMsgData(num, num2, num3, num4);
    }

    @NonNull
    public abstract Integer height();

    @NonNull
    public final String toString() {
        Integer x = x();
        Integer y = y();
        Integer width = width();
        Integer height = height();
        StringBuilder sb = new StringBuilder(fn0.b(String.valueOf(x).length(), 37, String.valueOf(y).length(), 8, String.valueOf(width).length(), 9, String.valueOf(height).length()) + 1);
        fn0.w(x, y, "ResizeAndPositionVideoMsgData [x=", ", y=", sb);
        fn0.w(width, height, ", width=", ", height=", sb);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @NonNull
    public abstract Integer width();

    @NonNull
    public abstract Integer x();

    @NonNull
    public abstract Integer y();
}

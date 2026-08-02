package j7;

import Hj.C3143a;
import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;

/* renamed from: j7.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7294c implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final C7294c f69468a = new C7294c();

    @NonNull
    public static C7294c a() {
        return f69468a;
    }

    @Override // android.animation.TypeEvaluator
    @NonNull
    public final Integer evaluate(float f7, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f12 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float d11 = C3143a.d(f12, f11, f7, f11);
        float d12 = C3143a.d(pow4, pow, f7, pow);
        float d13 = C3143a.d(pow5, pow2, f7, pow2);
        float d14 = C3143a.d(pow6, pow3, f7, pow3);
        float pow7 = ((float) Math.pow(d12, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(d13, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(d14, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(d11 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}

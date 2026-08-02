package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2802a = new j();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f6, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f11 = ((intValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f12 = ((intValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f13 = ((intValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f14 = ((intValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f15 = ((intValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float pow = (float) Math.pow(f11, 2.2d);
        float pow2 = (float) Math.pow(f12, 2.2d);
        float pow3 = (float) Math.pow((intValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f14, 2.2d);
        float pow5 = (float) Math.pow(f15, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float w10 = d9.e.w(f13, f10, f6, f10);
        float w11 = d9.e.w(pow4, pow, f6, pow);
        float w12 = d9.e.w(pow5, pow2, f6, pow2);
        float w13 = d9.e.w(pow6, pow3, f6, pow3);
        float pow7 = ((float) Math.pow(w11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(w12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(w13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(w10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}

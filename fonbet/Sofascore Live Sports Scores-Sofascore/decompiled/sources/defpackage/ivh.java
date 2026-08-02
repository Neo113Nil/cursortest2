package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ivh implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(((((Number) obj2).doubleValue() - doubleValue) * f) + doubleValue);
    }
}

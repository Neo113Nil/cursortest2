package s7;

import V4.s;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: s7.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9617l extends V4.l {

    /* renamed from: s7.l$a */
    final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f98340a;

        a(TextView textView) {
            this.f98340a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f98340a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // V4.l
    public final void captureEndValues(@NonNull s sVar) {
        View view = sVar.f28063b;
        if (view instanceof TextView) {
            sVar.f28062a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // V4.l
    public final void captureStartValues(@NonNull s sVar) {
        View view = sVar.f28063b;
        if (view instanceof TextView) {
            sVar.f28062a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // V4.l
    public final Animator createAnimator(@NonNull ViewGroup viewGroup, s sVar, s sVar2) {
        if (sVar == null || sVar2 == null || !(sVar.f28063b instanceof TextView)) {
            return null;
        }
        View view = sVar2.f28063b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = sVar.f28062a;
        HashMap hashMap2 = sVar2.f28062a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}

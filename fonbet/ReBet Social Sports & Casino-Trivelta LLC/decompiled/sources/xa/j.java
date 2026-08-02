package xa;

import L2.A;
import L2.AbstractC1388m;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* loaded from: classes3.dex */
public class j extends AbstractC1388m {

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f68081a;

        public a(TextView textView) {
            this.f68081a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f68081a.setScaleX(floatValue);
            this.f68081a.setScaleY(floatValue);
        }
    }

    private void p0(A a10) {
        View view = a10.f6757b;
        if (view instanceof TextView) {
            a10.f6756a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // L2.AbstractC1388m
    public void h(A a10) {
        p0(a10);
    }

    @Override // L2.AbstractC1388m
    public void k(A a10) {
        p0(a10);
    }

    @Override // L2.AbstractC1388m
    public Animator o(ViewGroup viewGroup, A a10, A a11) {
        if (a10 == null || a11 == null || !(a10.f6757b instanceof TextView)) {
            return null;
        }
        View view = a11.f6757b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = a10.f6756a;
        Map map2 = a11.f6756a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}

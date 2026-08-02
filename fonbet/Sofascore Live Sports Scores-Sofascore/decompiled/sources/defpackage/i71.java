package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;

    public /* synthetic */ i71(n71 n71Var, int i) {
        this.a = i;
        this.b = n71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        int i = this.a;
        n71 n71Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                m71 m71Var = n71Var.i;
                if (m71Var != null && (context = n71Var.h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = y9.b(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    m71Var.getLocationInWindow(iArr);
                    int height2 = (height - (m71Var.getHeight() + iArr[1])) + ((int) m71Var.getTranslationY());
                    int i4 = n71Var.r;
                    if (height2 < i4) {
                        ViewGroup.LayoutParams layoutParams = m71Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            qq7 qq7Var = n71.x;
                            break;
                        } else {
                            int i5 = n71Var.r;
                            n71Var.s = i5;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i5 - height2) + marginLayoutParams.bottomMargin;
                            m71Var.requestLayout();
                            break;
                        }
                    } else {
                        n71Var.s = i4;
                        break;
                    }
                }
                break;
            case 1:
                n71Var.f(3);
                break;
            default:
                m71 m71Var2 = n71Var.i;
                if (m71Var2 != null) {
                    int i6 = 0;
                    if (m71Var2.getParent() != null) {
                        m71Var2.setVisibility(0);
                    }
                    if (m71Var2.getAnimationMode() != 1) {
                        int height3 = m71Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = m71Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        m71Var2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(n71Var.e);
                        valueAnimator.setDuration(n71Var.c);
                        valueAnimator.addListener(new g71(n71Var, i6));
                        valueAnimator.addUpdateListener(new f71(n71Var, i2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        ofFloat.setInterpolator(n71Var.d);
                        ofFloat.addUpdateListener(new f71(n71Var, i6));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(n71Var.f);
                        ofFloat2.addUpdateListener(new f71(n71Var, i3));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(n71Var.a);
                        animatorSet.addListener(new g71(n71Var, i3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}

package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h71 implements Handler.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ h71(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = 1;
        int i2 = 0;
        switch (this.a) {
            case 0:
                int i3 = message.what;
                if (i3 != 0) {
                    if (i3 != 1) {
                        return false;
                    }
                    n71 n71Var = (n71) message.obj;
                    int i4 = message.arg1;
                    m71 m71Var = n71Var.i;
                    AccessibilityManager accessibilityManager = n71Var.v;
                    if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || m71Var.getVisibility() != 0) {
                        n71Var.f(i4);
                        return true;
                    }
                    if (m71Var.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ofFloat.setInterpolator(n71Var.d);
                        ofFloat.addUpdateListener(new f71(n71Var, 0));
                        ofFloat.setDuration(n71Var.b);
                        ofFloat.addListener(new e71(n71Var, i4, i2));
                        ofFloat.start();
                        return true;
                    }
                    ValueAnimator valueAnimator = new ValueAnimator();
                    m71 m71Var2 = n71Var.i;
                    int height = m71Var2.getHeight();
                    ViewGroup.LayoutParams layoutParams = m71Var2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height);
                    valueAnimator.setInterpolator(n71Var.e);
                    valueAnimator.setDuration(n71Var.c);
                    valueAnimator.addListener(new e71(n71Var, i4, i));
                    valueAnimator.addUpdateListener(new f71(n71Var, 3));
                    valueAnimator.start();
                    return true;
                }
                n71 n71Var2 = (n71) message.obj;
                m71 m71Var3 = n71Var2.i;
                ViewGroup viewGroup = n71Var2.g;
                if (m71Var3.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams2 = m71Var3.getLayoutParams();
                    if (layoutParams2 instanceof xs3) {
                        xs3 xs3Var = (xs3) layoutParams2;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        hpo hpoVar = baseTransientBottomBar$Behavior.i;
                        hpoVar.getClass();
                        hpoVar.a = n71Var2.w;
                        baseTransientBottomBar$Behavior.b = new j0l(n71Var2, 9);
                        xs3Var.b(baseTransientBottomBar$Behavior);
                        if (n71Var2.c() == null) {
                            xs3Var.g = 80;
                        }
                    }
                    m71Var3.k = true;
                    viewGroup.addView(m71Var3);
                    m71Var3.k = false;
                    if (n71Var2.c() != null) {
                        int[] iArr = new int[2];
                        n71Var2.c().getLocationOnScreen(iArr);
                        int i5 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        i2 = (viewGroup.getHeight() + iArr2[1]) - i5;
                    }
                    n71Var2.q = i2;
                    n71Var2.k();
                    m71Var3.setVisibility(4);
                }
                if (m71Var3.isLaidOut()) {
                    n71Var2.j();
                    return true;
                }
                n71Var2.t = true;
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((e1g) message.obj).c();
                return true;
        }
    }
}

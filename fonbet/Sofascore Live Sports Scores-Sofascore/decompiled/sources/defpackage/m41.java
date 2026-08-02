package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.sofascore.results.view.graph.networkanimation.PassingNetworkAnimationView;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m41 implements l41 {
    public final Object a;
    public float b;
    public Object c;
    public Object d;

    public m41(PassingNetworkAnimationView passingNetworkAnimationView, xbb xbbVar, float f) {
        xbbVar.getClass();
        this.c = passingNetworkAnimationView;
        this.a = xbbVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        ofFloat.setDuration(wzb.c(f * 100.0f));
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.d = ofFloat;
    }

    public nja a(float f) {
        List list = (List) this.a;
        nja njaVar = (nja) mz1.g(1, list);
        if (f >= njaVar.b()) {
            return njaVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            nja njaVar2 = (nja) list.get(size);
            if (((nja) this.c) != njaVar2 && f >= njaVar2.b() && f < njaVar2.a()) {
                return njaVar2;
            }
        }
        return (nja) list.get(0);
    }

    @Override // defpackage.l41
    public boolean h(float f) {
        nja njaVar = (nja) this.d;
        nja njaVar2 = (nja) this.c;
        if (njaVar == njaVar2 && this.b == f) {
            return true;
        }
        this.d = njaVar2;
        this.b = f;
        return false;
    }

    @Override // defpackage.l41
    public nja i() {
        return (nja) this.c;
    }

    @Override // defpackage.l41
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.l41
    public boolean j(float f) {
        nja njaVar = (nja) this.c;
        if (f >= njaVar.b() && f < njaVar.a()) {
            return !((nja) this.c).c();
        }
        this.c = a(f);
        return true;
    }

    @Override // defpackage.l41
    public float l() {
        return ((nja) ((List) this.a).get(0)).b();
    }

    @Override // defpackage.l41
    public float n() {
        return ((nja) mz1.g(1, (List) this.a)).a();
    }

    public m41(Context context) {
        this.b = 1.0f;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.c = activityManager;
        this.d = new e3c(context.getResources().getDisplayMetrics(), 1);
        if (activityManager.isLowRamDevice()) {
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public m41(List list) {
        this.d = null;
        this.b = -1.0f;
        this.a = list;
        this.c = a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}

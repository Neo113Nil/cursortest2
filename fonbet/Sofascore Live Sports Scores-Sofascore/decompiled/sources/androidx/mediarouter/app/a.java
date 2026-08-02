package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.unity3d.services.UnityAdsConstants;
import defpackage.iyd;
import defpackage.obc;
import defpackage.wj9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap hashMap, HashMap hashMap2) {
        this.c = dVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        iyd iydVar;
        obc obcVar;
        d dVar = this.c;
        dVar.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.J;
        if (hashSet == null || dVar.K == null) {
            return;
        }
        int size = hashSet.size() - dVar.K.size();
        b bVar = new b(dVar);
        int firstVisiblePosition = dVar.G.getFirstVisiblePosition();
        int i = 0;
        boolean z = false;
        while (true) {
            int childCount = dVar.G.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = dVar.G.getChildAt(i);
            obc obcVar2 = (obc) dVar.H.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(obcVar2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (dVar.Q * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = dVar.J;
            if (hashSet2 == null || !hashSet2.contains(obcVar2)) {
                obcVar = obcVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                obcVar = obcVar2;
                alphaAnimation.setDuration(dVar.k0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 - top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            translateAnimation.setDuration(dVar.j0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dVar.m0);
            if (!z) {
                animationSet.setAnimationListener(bVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            obc obcVar3 = obcVar;
            map.remove(obcVar3);
            map2.remove(obcVar3);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            obc obcVar4 = (obc) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(obcVar4);
            if (dVar.K.contains(obcVar4)) {
                iydVar = new iyd(bitmapDrawable, rect2);
                iydVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                iydVar.e = dVar.l0;
                iydVar.d = dVar.m0;
            } else {
                int i3 = dVar.Q * size;
                iyd iydVar2 = new iyd(bitmapDrawable, rect2);
                iydVar2.g = i3;
                iydVar2.e = dVar.j0;
                iydVar2.d = dVar.m0;
                iydVar2.l = new wj9(dVar, obcVar4, false, 20);
                dVar.L.add(obcVar4);
                iydVar = iydVar2;
            }
            dVar.G.a.add(iydVar);
        }
    }
}

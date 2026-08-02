package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.mediarouter.app.OverlayListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import xsna.fx10;

/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes12.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ b d;

    public c(b bVar, HashMap hashMap, HashMap hashMap2) {
        this.d = bVar;
        this.b = hashMap;
        this.c = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Map map;
        Map map2;
        OverlayListView.a aVar;
        fx10.h hVar;
        b bVar = this.d;
        bVar.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = bVar.J;
        if (hashSet == null || bVar.K == null) {
            return;
        }
        int size = hashSet.size() - bVar.K.size();
        d dVar = new d(bVar);
        int firstVisiblePosition = bVar.G.getFirstVisiblePosition();
        int i = 0;
        boolean z = false;
        while (true) {
            int childCount = bVar.G.getChildCount();
            map = this.b;
            map2 = this.c;
            if (i >= childCount) {
                break;
            }
            View childAt = bVar.G.getChildAt(i);
            fx10.h item = bVar.H.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(item);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (bVar.Q * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = bVar.J;
            if (hashSet2 == null || !hashSet2.contains(item)) {
                hVar = item;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                hVar = item;
                alphaAnimation.setDuration(bVar.k0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2 - top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            translateAnimation.setDuration(bVar.j0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(bVar.m0);
            if (!z) {
                animationSet.setAnimationListener(dVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            fx10.h hVar2 = hVar;
            map.remove(hVar2);
            map2.remove(hVar2);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            fx10.h hVar3 = (fx10.h) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(hVar3);
            if (bVar.K.contains(hVar3)) {
                aVar = new OverlayListView.a(bitmapDrawable, rect2);
                aVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                aVar.e = bVar.l0;
                aVar.d = bVar.m0;
            } else {
                int i3 = bVar.Q * size;
                OverlayListView.a aVar2 = new OverlayListView.a(bitmapDrawable, rect2);
                aVar2.g = i3;
                aVar2.e = bVar.j0;
                aVar2.d = bVar.m0;
                aVar2.l = new a(bVar, hVar3);
                bVar.L.add(hVar3);
                aVar = aVar2;
            }
            bVar.G.b.add(aVar);
        }
    }
}

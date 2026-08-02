package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdru implements GestureDetector.OnGestureListener {
    public final zzdqm a;
    public final zzdrm b;

    public zzdru(zzdqm zzdqmVar, zzdrm zzdrmVar) {
        this.a = zzdqmVar;
        this.b = zzdrmVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y;
        int zzu;
        try {
            zzdqm zzdqmVar = this.a;
            if (zzdqmVar != null) {
                int i = -1;
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                        i = 1;
                    } else {
                        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                            i = 2;
                        }
                        y = 0;
                    }
                    synchronized (zzdqmVar) {
                        zzu = zzdqmVar.n.zzu();
                    }
                    if (i == zzu) {
                        zzdqmVar.c(y, this.b.c);
                        return false;
                    }
                } else {
                    if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                        i = 8;
                    } else {
                        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                            i = 4;
                        }
                        y = 0;
                    }
                    synchronized (zzdqmVar) {
                    }
                }
            }
            return false;
        } finally {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

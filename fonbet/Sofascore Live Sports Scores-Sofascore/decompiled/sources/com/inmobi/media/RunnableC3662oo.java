package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.oo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC3662oo implements Runnable {
    public final AtomicBoolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final WeakReference d;

    public RunnableC3662oo(AbstractC3765so abstractC3765so, AtomicBoolean atomicBoolean) {
        abstractC3765so.getClass();
        atomicBoolean.getClass();
        this.a = atomicBoolean;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new WeakReference(abstractC3765so);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.get()) {
            return;
        }
        AbstractC3765so abstractC3765so = (AbstractC3765so) this.d.get();
        if (abstractC3765so != null) {
            abstractC3765so.k = false;
            for (Map.Entry entry : abstractC3765so.a.entrySet()) {
                View view = (View) entry.getKey();
                C3714qo c3714qo = (C3714qo) entry.getValue();
                int i = c3714qo.a;
                View view2 = c3714qo.c;
                byte b = abstractC3765so.c;
                boolean z = true;
                if (b == 1) {
                    C3826v7 c3826v7 = C3904y7.k;
                    if (c3826v7.b(view2, view, i) && c3826v7.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else if (b == 2) {
                    C3826v7 c3826v72 = C3904y7.k;
                    c3826v72.getClass();
                    boolean b2 = c3826v72.b(view2, view, i);
                    boolean a = c3826v72.a(view, view, i);
                    view.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC3889xi) {
                        Rect rect = new Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = (GestureDetectorOnGestureListenerC3889xi) view;
                            int[] iArr = new int[2];
                            gestureDetectorOnGestureListenerC3889xi.getLocationInWindow(iArr);
                            int[] viewableFrameArray = gestureDetectorOnGestureListenerC3889xi.getViewableFrameArray();
                            int i2 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                            int i3 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                            if (rect.intersect(new Rect(i2, i3, i2 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i3))) {
                                Bitmap createBitmap = Bitmap.createBitmap(gestureDetectorOnGestureListenerC3889xi.getWidth(), gestureDetectorOnGestureListenerC3889xi.getHeight(), Bitmap.Config.ARGB_8888);
                                createBitmap.getClass();
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.drawBitmap(createBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new Paint());
                                gestureDetectorOnGestureListenerC3889xi.draw(canvas);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, N3.b(gestureDetectorOnGestureListenerC3889xi.getWidth() / R5.b()), N3.b(gestureDetectorOnGestureListenerC3889xi.getHeight() / R5.b()), true);
                                createScaledBitmap.getClass();
                                int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC3889xi.getViewableFrameArray();
                                int min = Math.min(createScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                                int min2 = Math.min(createScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                                int min3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, createScaledBitmap.getWidth() - min);
                                int min4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, createScaledBitmap.getHeight() - min2);
                                Bitmap createBitmap2 = (min3 <= 0 || min4 <= 0) ? null : Bitmap.createBitmap(createScaledBitmap, min, min2, min3, min4);
                                if (createBitmap2 != null) {
                                    int height = createBitmap2.getHeight() * createBitmap2.getWidth();
                                    int[] iArr2 = new int[height];
                                    createBitmap2.getPixels(iArr2, 0, createBitmap2.getWidth(), 0, 0, createBitmap2.getWidth(), createBitmap2.getHeight());
                                    int i4 = 0;
                                    for (int i5 = 0; i5 < height; i5++) {
                                        int i6 = iArr2[i5];
                                        if (i6 > -16777216 && i6 < 0 && (i4 = i4 + 1) >= gestureDetectorOnGestureListenerC3889xi.getMinimumPixelsPainted()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (b2 && a && z) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else {
                    C3826v7 c3826v73 = C3904y7.k;
                    if (c3826v73.b(view2, view, i) && c3826v73.a(view, view, i)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                }
            }
        }
        InterfaceC3688po interfaceC3688po = abstractC3765so != null ? abstractC3765so.h : null;
        if (interfaceC3688po != null) {
            interfaceC3688po.a(this.b, this.c);
        }
        this.b.clear();
        this.c.clear();
        if (abstractC3765so != null) {
            abstractC3765so.d();
        }
    }
}

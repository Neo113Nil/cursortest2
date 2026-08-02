package com.vk.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;
import com.vk.crop.CropImageView;
import com.vk.crop.f;
import com.vk.crop.h;
import xsna.dfk;
import xsna.kd7;
import xsna.l370;
import xsna.lik;

/* compiled from: CropImageView.java */
/* loaded from: classes17.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ g b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bitmap d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ CropImageView f;

    /* compiled from: CropImageView.java */
    public class a extends f {
        public a(Context context, f.a aVar) {
            super(context, aVar);
        }

        @Override // com.vk.crop.f, android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            CropImageView cropImageView = c.this.f;
            if (this.d) {
                if (cropImageView.i.hasMessages(0)) {
                    CropImageView.a aVar = cropImageView.i;
                    aVar.removeMessages(0);
                    aVar.sendMessageDelayed(Message.obtain(aVar, 0), 800L);
                }
                if (motionEvent.getAction() == 2) {
                    cropImageView.c(true, false, false);
                    cropImageView.setLinesVisible(true);
                } else {
                    cropImageView.c(true, true, true);
                    cropImageView.setLinesVisible(false);
                }
            }
            return super.onTouch(view, motionEvent);
        }
    }

    /* compiled from: CropImageView.java */
    public class b implements h.d {
        public b() {
        }
    }

    public c(CropImageView cropImageView, g gVar, boolean z, Bitmap bitmap, Runnable runnable) {
        this.f = cropImageView;
        this.b = gVar;
        this.c = z;
        this.d = bitmap;
        this.e = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar;
        com.vk.crop.b bVar;
        CropImageView cropImageView = this.f;
        cropImageView.b.getViewTreeObserver().removeOnPreDrawListener(this);
        com.vk.crop.b bVar2 = new com.vk.crop.b(cropImageView.b, cropImageView.c, cropImageView.getBitmapWidth(), cropImageView.getBitmapHeight());
        cropImageView.e = bVar2;
        bVar2.e.l = cropImageView.h;
        a aVar = new a(cropImageView.getContext(), cropImageView.e);
        cropImageView.d = aVar;
        cropImageView.b.setOnTouchListener(aVar);
        cropImageView.c.setOnCropChangeListener(new b());
        g gVar = cropImageView.e.e;
        gVar.getClass();
        g gVar2 = this.b;
        gVar.d = gVar2.d;
        gVar.e = gVar2.e;
        gVar.f = gVar2.f;
        gVar.g = gVar2.g;
        gVar.a.set(gVar2.a);
        gVar.h = gVar2.h;
        gVar.i = gVar2.i;
        gVar.j = gVar2.j;
        gVar.k = gVar2.k;
        float f = 1.0f;
        if (this.c) {
            cropImageView.c.b(cropImageView.e.e.j);
            if (l370.e != l370.d && (dVar = cropImageView.c) != null && (bVar = cropImageView.e) != null) {
                dVar.c(bVar.e.j, 1.0f);
            }
            g gVar3 = cropImageView.e.e;
            float cropWidth = cropImageView.c.getCropWidth();
            float x0 = cropImageView.c.getX0();
            float y0 = cropImageView.c.getY0();
            Paint paint = lik.a;
            gVar3.a(cropWidth / dfk.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            gVar3.b(x0, y0, false);
        } else {
            float cropWidth2 = cropImageView.c.getCropWidth();
            float f2 = dfk.a;
            float f3 = cropWidth2 / f2;
            float f4 = f2 * f3;
            String str = kd7.a;
            Bitmap bitmap = this.d;
            if (bitmap != null && !bitmap.isRecycled()) {
                f = bitmap.getWidth() / bitmap.getHeight();
            }
            float centerX = cropImageView.c.getCenterX() - (f4 / 2.0f);
            float centerY = cropImageView.c.getCenterY() - ((f4 / f) / 2.0f);
            cropImageView.e.e.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            cropImageView.e.e.b(centerX, centerY, true);
        }
        cropImageView.e.e();
        cropImageView.c(true, true, true);
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }
}

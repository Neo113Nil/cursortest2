package com.vk.crop;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.vk.crop.b;
import xsna.kus;

/* compiled from: CropTouchListener.java */
/* loaded from: classes17.dex */
public class f implements View.OnTouchListener {
    public final kus b;
    public final a c;
    public boolean d = true;

    /* compiled from: CropTouchListener.java */
    public interface a {
    }

    public f(Context context, a aVar) {
        kus kusVar = new kus(context);
        this.b = kusVar;
        kusVar.a = this;
        this.c = aVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.d) {
            return false;
        }
        int action = motionEvent.getAction();
        a aVar = this.c;
        if (action == 0) {
            b bVar = (b) aVar;
            b.a aVar2 = bVar.h;
            if (aVar2 != null) {
                ValueAnimator valueAnimator = aVar2.b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                bVar.h = null;
            }
        } else if (action == 1 || action == 3) {
            ((b) aVar).d(true);
        }
        try {
            this.b.a(motionEvent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

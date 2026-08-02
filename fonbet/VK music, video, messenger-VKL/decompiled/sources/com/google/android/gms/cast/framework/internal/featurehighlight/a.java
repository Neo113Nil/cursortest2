package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.internal.cast.zzgz;
import xsna.sc01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ c b;

    public a(c cVar) {
        this.b = cVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        c cVar = this.b;
        sc01 sc01Var = cVar.l;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (sc01Var == null) {
            return true;
        }
        if (cVar.d.contains(Math.round(x), Math.round(y))) {
            OuterHighlightDrawable outerHighlightDrawable = cVar.e;
            if (zzgz.zza(x, y, outerHighlightDrawable.i, outerHighlightDrawable.j) < outerHighlightDrawable.g) {
                return true;
            }
        }
        cVar.l.zzb();
        return true;
    }
}

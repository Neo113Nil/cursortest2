package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.jr.sf.vj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pem extends SurfaceView implements SurfaceHolder.Callback, owm {
    public static final ArrayList c = new ArrayList();
    public WeakReference a;
    public qzm b;

    @Override // defpackage.owm
    public final void a(vj vjVar) {
        this.a = new WeakReference(vjVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            qzm qzmVar = (qzm) it.next();
            if (qzmVar != null && ((SurfaceHolder.Callback) qzmVar.a.get()) == null) {
                holder.removeCallback(qzmVar);
                it.remove();
            }
        }
        holder.addCallback(this.b);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.owm
    public final void pcc(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((qtm) this.a.get()).pcc(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((qtm) this.a.get()).pcc(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((qtm) this.a.get()).sf(surfaceHolder);
    }

    @Override // defpackage.owm
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(hwm hwmVar) {
    }
}

package defpackage;

import android.content.Context;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e9j {
    public float c;
    public float d;
    public final WeakReference f;
    public z7j g;
    public final TextPaint a = new TextPaint(1);
    public final pt2 b = new pt2(this, 1);
    public boolean e = true;

    public e9j(d9j d9jVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(d9jVar);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            f = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = f;
        this.e = false;
    }

    public final void c(z7j z7jVar, Context context) {
        if (this.g != z7jVar) {
            this.g = z7jVar;
            WeakReference weakReference = this.f;
            if (z7jVar != null) {
                TextPaint textPaint = this.a;
                pt2 pt2Var = this.b;
                z7jVar.e(context, textPaint, pt2Var);
                d9j d9jVar = (d9j) weakReference.get();
                if (d9jVar != null) {
                    textPaint.drawableState = d9jVar.getState();
                }
                z7jVar.d(context, textPaint, pt2Var);
                this.e = true;
            }
            d9j d9jVar2 = (d9j) weakReference.get();
            if (d9jVar2 != null) {
                d9jVar2.a();
                d9jVar2.onStateChange(d9jVar2.getState());
            }
        }
    }
}

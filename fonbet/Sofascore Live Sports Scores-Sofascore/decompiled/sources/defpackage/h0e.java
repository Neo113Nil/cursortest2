package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h0e implements View.OnTouchListener {
    public boolean a;
    public final int b;
    public gpe c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public float h;

    public h0e(Context context) {
        context.getClass();
        this.a = true;
        this.b = ao2.s(40, context);
        this.f = -1.0f;
        this.g = -1.0f;
        this.h = -1.0f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a) {
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f = motionEvent.getX();
                this.g = motionEvent.getY();
                this.h = this.f;
                return false;
            }
            boolean z = true;
            if (valueOf != null && valueOf.intValue() == 2) {
                this.h = motionEvent.getX();
                float y = motionEvent.getY();
                float f = this.h - this.f;
                float f2 = y - this.g;
                if (((int) f) != 0 || ((int) f2) != 0) {
                    boolean z2 = Math.abs(f2) < Math.abs(f);
                    boolean z3 = ((double) Math.abs(Math.abs(f2) - Math.abs(f))) > 2.5d;
                    if (((z2 && z3) || this.d) && !this.e) {
                        this.d = true;
                        return false;
                    }
                    this.e = true;
                    this.d = false;
                    return false;
                }
            } else if (valueOf != null && valueOf.intValue() == 1) {
                if (this.f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.g >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.d) {
                    float x = motionEvent.getX() - this.f;
                    if (Math.abs(x) > Math.abs(motionEvent.getY() - this.g) * 2.0f && Math.abs(x) > this.b) {
                        g0e g0eVar = x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? g0e.RIGHT : g0e.LEFT;
                        gpe gpeVar = this.c;
                        if (gpeVar == null) {
                            Intrinsics.i("onSwipe");
                            throw null;
                        }
                        gpeVar.invoke(g0eVar);
                        this.d = false;
                        this.e = false;
                        return z;
                    }
                }
                z = false;
                this.d = false;
                this.e = false;
                return z;
            }
        }
        return false;
    }
}

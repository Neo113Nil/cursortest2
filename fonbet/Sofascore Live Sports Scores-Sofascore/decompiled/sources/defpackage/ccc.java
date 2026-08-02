package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ccc {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public ccc() {
        this.b = new Object();
        this.c = new bcc(this);
        this.d = new WeakReference(null);
    }

    public static void a(fze fzeVar) {
        List list = fzeVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((mze) list.get(i)).a();
        }
    }

    public void b(dcc dccVar, Handler handler) {
        if (this.a) {
            this.a = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = dccVar.f;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.e;
            boolean z = playbackStateCompat != null && playbackStateCompat.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                e();
            } else {
                if (z || !z2) {
                    return;
                }
                f();
            }
        }
    }

    public boolean d(Intent intent) {
        dcc dccVar;
        gl0 gl0Var;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.b) {
                dccVar = (dcc) ((WeakReference) this.d).get();
                gl0Var = (gl0) this.e;
            }
            if (dccVar != null && gl0Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                icc b = dccVar.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    b(dccVar, gl0Var);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    b(dccVar, gl0Var);
                    return true;
                }
                if (!this.a) {
                    this.a = true;
                    gl0Var.sendMessageDelayed(gl0Var.obtainMessage(1, b), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                gl0Var.removeMessages(1);
                this.a = false;
                PlaybackStateCompat playbackStateCompat = dccVar.f;
                if (((playbackStateCompat == null ? 0L : playbackStateCompat.e) & 32) != 0) {
                    h();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(Function2 function2, sq3 sq3Var) {
        hed hedVar;
        int i;
        if (sq3Var instanceof hed) {
            hedVar = (hed) sq3Var;
            int i2 = hedVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hedVar.t = i2 - Integer.MIN_VALUE;
                Object obj = hedVar.r;
                lu3 lu3Var = lu3.a;
                i = hedVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    this.a = true;
                    gjb gjbVar = new gjb(this, function2, rq3Var, 16);
                    hedVar.t = 1;
                    if (tz9.P(gjbVar, hedVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.a = false;
                return Unit.a;
            }
        }
        hedVar = new hed(this, sq3Var);
        Object obj2 = hedVar.r;
        lu3 lu3Var2 = lu3.a;
        i = hedVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        this.a = false;
        return Unit.a;
    }

    public void e() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public ccc(svg svgVar, Function2 function2, kx4 kx4Var) {
        this.b = svgVar;
        this.c = function2;
        this.d = kx4Var;
        this.e = new fp4(5);
    }

    public void c(String str) {
    }

    public void g(long j) {
    }
}

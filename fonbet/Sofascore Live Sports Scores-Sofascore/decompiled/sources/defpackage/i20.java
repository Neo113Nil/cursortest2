package defpackage;

import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.internal.i;
import com.facebook.login.LoginFragment;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i20 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i20(int i, Object obj, Object obj2) {
        super(1);
        this.i = i;
        this.k = obj;
        this.j = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        int i = 1;
        switch (this.i) {
            case 0:
                return new g4a((nje) this.k, new w1((j20) this.j, 3));
            case 1:
                g4a g4aVar = (g4a) this.k;
                synchronized (g4aVar.c) {
                    try {
                        g4aVar.e = true;
                        i1d i1dVar = g4aVar.d;
                        Object[] objArr = i1dVar.a;
                        int i2 = i1dVar.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            sid sidVar = (sid) ((e0l) objArr[i3]).get();
                            if (sidVar != null && (inputConnection = sidVar.b) != null) {
                                inputConnection.closeConnection();
                                sidVar.b = null;
                            }
                        }
                        g4aVar.d.n();
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gdj gdjVar = ((j20) this.j).b;
                gdjVar.b.set(null);
                gdjVar.a.b();
                return Unit.a;
            case 2:
                b2f b2fVar = (b2f) this.k;
                b2fVar.setPositionProvider((f2f) this.j);
                b2fVar.q();
                return new o20(0);
            case 3:
                l40 l40Var = (l40) this.k;
                m40 m40Var = (m40) this.j;
                synchronized (l40Var.e) {
                    l40Var.g.remove(m40Var);
                }
                return Unit.a;
            case 4:
                ((n40) this.k).a.removeFrameCallback((m40) this.j);
                return Unit.a;
            case 5:
                ((wma) this.k).e0(((xtc) obj).z((xtc) this.j));
                return Unit.a;
            case 6:
                ((phe) obj).e((qhe) this.k, 0, 0, ((pp3) this.j).c.h());
                return Unit.a;
            case 7:
                phe.m((phe) obj, (qhe) this.k, 0, 0, ((fy1) this.j).o, 4);
                return Unit.a;
            case 8:
                Throwable th2 = (Throwable) obj;
                uh2 uh2Var = (uh2) this.k;
                if (th2 == null) {
                    uh2Var.a(((av4) this.j).G());
                } else if (th2 instanceof CancellationException) {
                    uh2Var.b();
                } else {
                    uh2Var.c(th2);
                }
                return Unit.a;
            case 9:
                if (((Boolean) ((g2i) this.k).invoke((a85) obj)).booleanValue()) {
                    return (gaj) this.j;
                }
                return null;
            case 10:
                if (((AtomicBoolean) this.k).compareAndSet(false, true)) {
                    ((g62) this.j).d(Unit.a);
                }
                return Unit.a;
            case 11:
                MotionEvent motionEvent = (MotionEvent) obj;
                tze tzeVar = (tze) this.j;
                if (motionEvent.getActionMasked() == 0) {
                    g7h g7hVar = (g7h) this.k;
                    Function1 function1 = tzeVar.a;
                    if (function1 == null) {
                        Intrinsics.i("onTouchEvent");
                        throw null;
                    }
                    g7hVar.c = ((Boolean) function1.invoke(motionEvent)).booleanValue() ? rze.b : rze.c;
                } else {
                    Function1 function12 = tzeVar.a;
                    if (function12 == null) {
                        Intrinsics.i("onTouchEvent");
                        throw null;
                    }
                    function12.invoke(motionEvent);
                }
                return Unit.a;
            case 12:
                phe.m((phe) obj, (qhe) this.k, 0, 0, ((lhh) this.j).B, 4);
                return Unit.a;
            case 13:
                ((k38) obj).a.getClass();
                cjb.a("Error firing " + ((String) this.k) + " event tracker [" + ((String) this.j) + ']');
                return Unit.a;
            case 14:
                lf3 lf3Var = (lf3) obj;
                tc3 tc3Var = (tc3) this.j;
                xll xllVar = (xll) this.k;
                if (!xllVar.c) {
                    u6b u6bVar = lf3Var.c;
                    View view = lf3Var.a;
                    g6b lifecycle = u6bVar.getLifecycle();
                    xllVar.e = tc3Var;
                    if (xllVar.d == null) {
                        if (Intrinsics.c(Looper.myLooper(), view.getHandler().getLooper())) {
                            xllVar.d = lifecycle;
                            lifecycle.a(xllVar);
                        } else {
                            view.post(new s5l(i, xllVar, lifecycle));
                        }
                    } else if (lifecycle.b().compareTo(e6b.c) >= 0) {
                        xllVar.b.B(new tc3(-1723985096, new ah3(xllVar, lf3Var, tc3Var), true));
                    }
                }
                return Unit.a;
            case 15:
                ((phe) obj).e((qhe) this.k, 0, 0, ((ool) this.j).o);
                return Unit.a;
            default:
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i4 = activityResult.a;
                if (i4 == -1) {
                    ((LoginFragment) this.k).j().j(i.a(1), i4, activityResult.b);
                } else {
                    ((FragmentActivity) this.j).finish();
                }
                return Unit.a;
        }
    }
}

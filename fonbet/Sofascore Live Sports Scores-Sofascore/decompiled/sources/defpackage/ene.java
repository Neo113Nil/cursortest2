package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ene implements wke, ahj, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ one a;

    public ene(one oneVar) {
        this.a = oneVar;
    }

    @Override // defpackage.ahj
    public final void a(chj chjVar, long j) {
        one oneVar = this.a;
        oneVar.x0 = true;
        TextView textView = oneVar.K;
        if (textView != null) {
            textView.setText(nik.G(oneVar.M, oneVar.N, j));
        }
        oneVar.a.f();
        ale aleVar = oneVar.q0;
        if (aleVar != null && oneVar.z0) {
            if (oneVar.h(aleVar)) {
                try {
                    Method method = oneVar.f;
                    method.getClass();
                    method.invoke(oneVar.q0, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    is8.h(e);
                    return;
                }
            } else if (oneVar.g(oneVar.q0)) {
                try {
                    Method method2 = oneVar.i;
                    method2.getClass();
                    method2.invoke(oneVar.q0, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    is8.h(e2);
                    return;
                }
            } else {
                StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                ale aleVar2 = oneVar.q0;
                aleVar2.getClass();
                sb.append(aleVar2.getClass());
                tgj.d0(sb.toString());
            }
        }
        if (oneVar.j(oneVar.q0)) {
            oneVar.l(oneVar.q0, j);
        }
    }

    @Override // defpackage.ahj
    public final void b(chj chjVar, long j, boolean z) {
        one oneVar = this.a;
        oneVar.x0 = false;
        ale aleVar = oneVar.q0;
        if (aleVar != null) {
            if (!z) {
                oneVar.l(aleVar, j);
            }
            if (oneVar.h(oneVar.q0)) {
                try {
                    Method method = oneVar.f;
                    method.getClass();
                    method.invoke(oneVar.q0, Boolean.FALSE);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    is8.h(e);
                    return;
                }
            } else if (oneVar.g(oneVar.q0)) {
                try {
                    Method method2 = oneVar.i;
                    method2.getClass();
                    method2.invoke(oneVar.q0, Boolean.FALSE);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    is8.h(e2);
                    return;
                }
            }
        }
        oneVar.a.g();
    }

    @Override // defpackage.ahj
    public final void c(chj chjVar, long j) {
        one oneVar = this.a;
        TextView textView = oneVar.K;
        if (textView != null) {
            textView.setText(nik.G(oneVar.M, oneVar.N, j));
        }
        if (oneVar.j(oneVar.q0)) {
            oneVar.l(oneVar.q0, j);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        one oneVar = this.a;
        ImageView imageView = oneVar.D;
        View view2 = oneVar.I;
        View view3 = oneVar.H;
        View view4 = oneVar.G;
        tne tneVar = oneVar.a;
        ale aleVar = oneVar.q0;
        if (aleVar == null) {
            return;
        }
        tneVar.g();
        if (oneVar.u == view) {
            if (aleVar.k(9)) {
                aleVar.p();
                return;
            }
            return;
        }
        if (oneVar.t == view) {
            if (aleVar.k(7)) {
                aleVar.g();
                return;
            }
            return;
        }
        if (oneVar.w == view) {
            if (aleVar.getPlaybackState() == 4 || !aleVar.k(12)) {
                return;
            }
            aleVar.B();
            return;
        }
        if (oneVar.x == view) {
            if (aleVar.k(11)) {
                aleVar.C();
                return;
            }
            return;
        }
        if (oneVar.v == view) {
            if (nik.e0(aleVar, oneVar.v0)) {
                nik.K(aleVar);
                return;
            } else {
                if (aleVar.k(1)) {
                    aleVar.pause();
                    return;
                }
                return;
            }
        }
        if (oneVar.A == view) {
            if (aleVar.k(15)) {
                int repeatMode = aleVar.getRepeatMode();
                int i = oneVar.B0;
                for (int i2 = 1; i2 <= 2; i2++) {
                    int i3 = (repeatMode + i2) % 3;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2 && (i & 2) != 0) {
                            }
                        } else if ((i & 1) == 0) {
                        }
                    }
                    repeatMode = i3;
                }
                aleVar.setRepeatMode(repeatMode);
                return;
            }
            return;
        }
        if (oneVar.B == view) {
            if (aleVar.k(14)) {
                aleVar.setShuffleModeEnabled(!aleVar.getShuffleModeEnabled());
                return;
            }
            return;
        }
        if (view4 == view) {
            tneVar.f();
            oneVar.d(oneVar.m, view4);
            return;
        }
        if (view3 == view) {
            tneVar.f();
            oneVar.d(oneVar.n, view3);
        } else if (view2 == view) {
            tneVar.f();
            oneVar.d(oneVar.p, view2);
        } else if (imageView == view) {
            tneVar.f();
            oneVar.d(oneVar.o, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        one oneVar = this.a;
        if (oneVar.H0) {
            oneVar.a.g();
        }
    }

    @Override // defpackage.wke
    public final void onEvents(ale aleVar, uke ukeVar) {
        boolean a = ukeVar.a(4, 5, 13);
        one oneVar = this.a;
        if (a) {
            oneVar.q();
        }
        if (ukeVar.a(4, 5, 7, 13)) {
            oneVar.s();
        }
        if (ukeVar.a(8, 13)) {
            oneVar.t();
        }
        if (ukeVar.a(9, 13)) {
            oneVar.v();
        }
        if (ukeVar.a(8, 9, 11, 0, 16, 17, 13)) {
            oneVar.p();
        }
        if (ukeVar.a(11, 0, 13)) {
            oneVar.w();
        }
        if (ukeVar.a(12, 13)) {
            oneVar.r();
        }
        if (ukeVar.a(2, 13)) {
            oneVar.x();
        }
    }
}

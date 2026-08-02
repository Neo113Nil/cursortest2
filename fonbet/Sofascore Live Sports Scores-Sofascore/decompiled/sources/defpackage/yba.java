package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yba implements krf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yba(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.krf
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                eca ecaVar = (eca) this.b;
                b8 b8Var = ecaVar.s;
                ecaVar.x.onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = ecaVar.t;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (ecaVar.l != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int findPointerIndex = motionEvent.findPointerIndex(ecaVar.l);
                    if (findPointerIndex >= 0) {
                        ecaVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                    u uVar = ecaVar.c;
                    if (uVar != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (findPointerIndex >= 0) {
                                    ecaVar.q(ecaVar.o, findPointerIndex, motionEvent);
                                    ecaVar.n(uVar);
                                    ecaVar.r.removeCallbacks(b8Var);
                                    b8Var.run();
                                    ecaVar.r.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = ecaVar.t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == ecaVar.l) {
                                    ecaVar.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    ecaVar.q(ecaVar.o, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        ecaVar.o(null, 0);
                        ecaVar.l = -1;
                        break;
                    }
                }
                break;
            default:
                motionEvent.getClass();
                break;
        }
    }

    @Override // defpackage.krf
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                eca ecaVar = (eca) obj;
                ecaVar.x.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                zba zbaVar = null;
                if (actionMasked == 0) {
                    ecaVar.l = motionEvent.getPointerId(0);
                    ecaVar.d = motionEvent.getX();
                    ecaVar.e = motionEvent.getY();
                    VelocityTracker velocityTracker = ecaVar.t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    ecaVar.t = VelocityTracker.obtain();
                    if (ecaVar.c == null) {
                        ArrayList arrayList = ecaVar.p;
                        if (!arrayList.isEmpty()) {
                            View k = ecaVar.k(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    zba zbaVar2 = (zba) arrayList.get(size);
                                    if (zbaVar2.e.itemView == k) {
                                        zbaVar = zbaVar2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (zbaVar != null) {
                            u uVar = zbaVar.e;
                            ecaVar.d -= zbaVar.i;
                            ecaVar.e -= zbaVar.j;
                            ecaVar.j(uVar, true);
                            if (ecaVar.a.remove(uVar.itemView)) {
                                ecaVar.m.c(ecaVar.r, uVar);
                            }
                            ecaVar.o(uVar, zbaVar.f);
                            ecaVar.q(ecaVar.o, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    ecaVar.l = -1;
                    ecaVar.o(null, 0);
                } else {
                    int i2 = ecaVar.l;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                        ecaVar.h(actionMasked, findPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = ecaVar.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (ecaVar.c == null) {
                    break;
                }
                break;
            default:
                p12 p12Var = ((y5f) obj).d;
                if (!((RecyclerView) p12Var.k).canScrollHorizontally(1) && !((RecyclerView) p12Var.k).canScrollHorizontally(-1)) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                    ((RecyclerView) p12Var.k).removeOnItemTouchListener(this);
                    break;
                } else {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
        }
        return false;
    }

    @Override // defpackage.krf
    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    ((eca) this.b).o(null, 0);
                    break;
                }
                break;
        }
    }

    private final void b(boolean z) {
    }
}

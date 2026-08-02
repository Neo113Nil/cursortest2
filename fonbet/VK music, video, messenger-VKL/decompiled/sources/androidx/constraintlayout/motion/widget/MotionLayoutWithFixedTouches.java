package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import com.vk.video.ui.discovery.minimizable.motion.touches.a;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.aa30;
import xsna.bb30;
import xsna.bpn0;
import xsna.bri;
import xsna.dv2;
import xsna.ei;
import xsna.fzw;
import xsna.jg0;
import xsna.lhg;
import xsna.mnh0;
import xsna.msy;
import xsna.nb30;
import xsna.nmp0;
import xsna.of;
import xsna.pvh;
import xsna.tot;
import xsna.wb1;
import xsna.wnh;
import xsna.y57;

/* compiled from: MotionLayoutWithFixedTouches.kt */
/* loaded from: classes11.dex */
public final class MotionLayoutWithFixedTouches extends MotionLayout implements of, a.c {
    public static final /* synthetic */ int O0 = 0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final com.vk.video.ui.discovery.minimizable.motion.touches.a L0;
    public final ArrayList M0;
    public final b N0;

    /* compiled from: MotionLayoutWithFixedTouches.kt */
    public final class a implements MotionLayout.i {
        public a() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void a(int i, int i2) {
            int i3 = MotionLayoutWithFixedTouches.O0;
            if (i == R.id.view_transition || i2 == R.id.view_transition) {
                return;
            }
            MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = MotionLayoutWithFixedTouches.this;
            Iterator it = motionLayoutWithFixedTouches.M0.iterator();
            while (it.hasNext()) {
                ((bb30) it.next()).b(motionLayoutWithFixedTouches.r5(i), motionLayoutWithFixedTouches.r5(i2));
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void b(float f, int i, int i2) {
            int i3 = MotionLayoutWithFixedTouches.O0;
            if (i == R.id.view_transition || i2 == R.id.view_transition) {
                return;
            }
            MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = MotionLayoutWithFixedTouches.this;
            Interpolator d = motionLayoutWithFixedTouches.getScene().d();
            if (d != null) {
                f = d.getInterpolation(f);
            }
            Iterator it = motionLayoutWithFixedTouches.M0.iterator();
            while (it.hasNext()) {
                ((bb30) it.next()).c(motionLayoutWithFixedTouches.r5(i), motionLayoutWithFixedTouches.r5(i2), f);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void c(int i) {
            MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = MotionLayoutWithFixedTouches.this;
            if (motionLayoutWithFixedTouches.getTouchProcessor().e == null) {
                motionLayoutWithFixedTouches.o5(i);
            }
            try {
                Field declaredField = MotionLayout.class.getDeclaredField("l0");
                declaredField.setAccessible(true);
                declaredField.set(motionLayoutWithFixedTouches, -1);
            } catch (Exception e) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.e, new Object[]{new IllegalStateException("Something went wrong when fix motion layout listener calls", e)});
            }
        }
    }

    /* compiled from: MotionLayoutWithFixedTouches.kt */
    public final class b {
        public final bpn0 a = new bpn0(new wnh(this, 26));
        public final boolean b;

        public b() {
            int currentState = MotionLayoutWithFixedTouches.this.getCurrentState();
            this.b = currentState == R.id.hidden || currentState == R.id.hidden_landscape;
        }
    }

    public MotionLayoutWithFixedTouches(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setInteractionEnabled(false);
        wb1 wb1Var = new wb1(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I0 = msy.a(lazyThreadSafetyMode, wb1Var);
        this.J0 = msy.a(lazyThreadSafetyMode, new dv2(23));
        this.K0 = msy.a(lazyThreadSafetyMode, new jg0(28));
        this.L0 = new com.vk.video.ui.discovery.minimizable.motion.touches.a(context, this, this, getComposeTouchActionsDetector());
        ArrayList arrayList = new ArrayList();
        this.M0 = arrayList;
        this.N0 = new b();
        a aVar = new a();
        if (this.g0 == null) {
            this.g0 = new CopyOnWriteArrayList<>();
        }
        this.g0.add(aVar);
        arrayList.add(new tot(new pvh(this, 18)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final bri getComposeTouchActionsDetector() {
        return (bri) this.K0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Map<Integer, nb30> getIdToMotionStateIdMap() {
        return (Map) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Map<Integer, nmp0> getIdToTransitionIdMap() {
        return (Map) this.J0.getValue();
    }

    public static String p5(Resources resources, int i) {
        Object failure;
        try {
            failure = resources.getResourceName(i);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object a2 = lhg.a(i, "Unknown name ");
        if (failure instanceof Result.Failure) {
            failure = a2;
        }
        return (String) failure;
    }

    private final void setAppropriateTransition(int i) {
        Object obj;
        int i2;
        int currentState = getCurrentState();
        if (currentState == i || currentState == -1) {
            return;
        }
        Iterator it = getScene().i(i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a.b bVar = (a.b) obj;
            if (bVar.d == currentState || bVar.c == currentState) {
                break;
            }
        }
        a.b bVar2 = (a.b) obj;
        if (bVar2 == null || (i2 = bVar2.a) == -1) {
            return;
        }
        setTransition(i2);
    }

    @Override // xsna.of, com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public final void D(nb30 nb30Var) {
        k5(nb30Var.h());
    }

    @Override // xsna.of
    public final void M3(bb30 bb30Var) {
        this.M0.remove(bb30Var);
    }

    @Override // xsna.of
    public final void W2(bb30 bb30Var) {
        this.M0.add(bb30Var);
    }

    @Override // com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public final void Z1() {
        U4(false);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, xsna.u160
    public final void a2(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        getTouchProcessor().l(view, i3, i4, iArr);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, xsna.t160
    public final void c0(int i, View view) {
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        TouchActionInfo touchActionInfo = touchProcessor.e;
        if (touchActionInfo != null && (touchActionInfo.d instanceof TouchActionInfo.b.a)) {
            touchProcessor.p();
            touchProcessor.e = null;
            touchProcessor.k = 0;
            touchProcessor.j = 0;
            touchProcessor.l = false;
        }
        touchProcessor.i = false;
    }

    @Override // xsna.of
    public final void e1(TouchActionInfo touchActionInfo) {
        getTouchProcessor().g.add(touchActionInfo);
    }

    @Override // xsna.of
    public final void f1(nb30 nb30Var) {
        int h = nb30Var.h();
        h5(getCurrentState(), h);
        setProgress(1.0f);
        o5(h);
    }

    @Override // xsna.of, com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public aa30 getState() {
        a.b bVar = getScene().c;
        if (bVar == null || !q5()) {
            return new aa30.a(r5(getCurrentState()));
        }
        nmp0 nmp0Var = getIdToTransitionIdMap().get(Integer.valueOf(bVar.a));
        if (nmp0Var == null) {
            nmp0Var = nmp0.a.b;
        }
        ei eiVar = new ei(nmp0Var, r5(bVar.d), r5(bVar.c));
        Interpolator d = getScene().d();
        return new aa30.b(eiVar, d != null ? d.getInterpolation(getProgress()) : getProgress(), getTargetPosition() >= 1.0f ? r5(getEndState()) : getTargetPosition() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? r5(getStartState()) : null, 4);
    }

    @Override // xsna.of
    public com.vk.video.ui.discovery.minimizable.motion.touches.a getTouchProcessor() {
        return this.L0;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, xsna.t160
    public final boolean h4(View view, View view2, int i, int i2) {
        return getTouchProcessor().m(i, i2, view2);
    }

    @Override // com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public final ei k3(nmp0 nmp0Var) {
        a.b h = this.t.h(nmp0Var.h());
        nmp0 nmp0Var2 = getIdToTransitionIdMap().get(Integer.valueOf(h.a));
        if (nmp0Var2 == null) {
            nmp0Var2 = nmp0.a.b;
        }
        return new ei(nmp0Var2, r5(h.d), r5(h.c));
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout
    public final void k5(int i) {
        if (getCurrentState() == i) {
            return;
        }
        setAppropriateTransition(i);
        Iterator it = this.M0.iterator();
        while (it.hasNext()) {
            ((bb30) it.next()).d(r5(getStartState()), r5(getEndState()));
        }
        super.k5(i);
    }

    public final void o5(int i) {
        if (i != -1) {
            Iterator it = this.M0.iterator();
            while (it.hasNext()) {
                ((bb30) it.next()).a(r5(i));
            }
            return;
        }
        String p5 = p5(getResources(), getStartState());
        String p52 = p5(getResources(), getEndState());
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.e, new Object[]{y57.a("Trying to transition to -1 with transition between ", p5, " and ", p52)});
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        touchProcessor.f = ViewConfiguration.get(touchProcessor.a);
        if (touchProcessor.e != null) {
            touchProcessor.e = null;
            touchProcessor.l = false;
            touchProcessor.h.clear();
            touchProcessor.i = false;
            touchProcessor.j = 0;
            touchProcessor.k = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        if (motionEvent == null) {
            touchProcessor.getClass();
            return false;
        }
        boolean onTouchEvent = ((GestureDetector) touchProcessor.m.getValue()).onTouchEvent(motionEvent);
        if (mnh0.m(motionEvent) || motionEvent.getAction() == 3) {
            return false;
        }
        return onTouchEvent;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        b bVar = this.N0;
        boolean z = bVar.b;
        MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = MotionLayoutWithFixedTouches.this;
        Integer num = (Integer) bVar.a.getValue();
        if (num != null && num.intValue() == 0) {
            int currentState = motionLayoutWithFixedTouches.getCurrentState();
            if ((currentState == R.id.hidden || currentState == R.id.hidden_landscape) && z) {
                return;
            }
        } else if (num != null && num.intValue() == 1) {
            int currentState2 = motionLayoutWithFixedTouches.getCurrentState();
            if ((currentState2 == R.id.hidden || currentState2 == R.id.hidden_landscape) && z) {
                return;
            }
            Lock readLock = ((ReentrantReadWriteLock) fzw.b.a).readLock();
            readLock.lock();
            readLock.unlock();
            return;
        }
        measureChildren(size, size2);
        super.onMeasure(i, i2);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return getTouchProcessor().j(f, f2);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return getTouchProcessor().n(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final boolean q5() {
        return (getProgress() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && getProgress() < 1.0f) || getTouchProcessor().e != null;
    }

    public final nb30 r5(int i) {
        nb30 nb30Var = getIdToMotionStateIdMap().get(Integer.valueOf(i));
        return nb30Var == null ? nb30.a.b : nb30Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = getTouchProcessor();
        if (!z) {
            touchProcessor.getClass();
            return;
        }
        TouchActionInfo touchActionInfo = touchProcessor.e;
        if (touchActionInfo == null || !(touchActionInfo.d instanceof TouchActionInfo.b.a)) {
            touchProcessor.e = null;
            touchProcessor.l = false;
            touchProcessor.h.clear();
            touchProcessor.i = false;
            touchProcessor.j = 0;
            touchProcessor.k = 0;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, xsna.t160
    public final void s1(View view, int i, int i2, int[] iArr, int i3) {
        getTouchProcessor().k(view, i, i2, iArr);
    }

    @Override // com.vk.video.ui.discovery.minimizable.motion.touches.a.c
    public void setState(aa30 aa30Var) {
        if (aa30Var instanceof aa30.a) {
            int h = ((aa30.a) aa30Var).a.h();
            h5(getCurrentState(), h);
            setProgress(1.0f);
            o5(h);
            return;
        }
        if (!(aa30Var instanceof aa30.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = getScene().c;
        if (bVar == null || bVar.a != ((aa30.b) aa30Var).a.a.h()) {
            setTransition(((aa30.b) aa30Var).a.a.h());
        }
        setProgress(((aa30.b) aa30Var).b);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout
    public void setTransition(int i) {
        super.setTransition(i);
        this.v = this.t.d();
    }
}

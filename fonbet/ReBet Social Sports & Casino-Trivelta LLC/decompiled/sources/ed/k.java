package ed;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class k extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public o f45949a;

    /* renamed from: b, reason: collision with root package name */
    public C4201a f45950b;

    /* renamed from: c, reason: collision with root package name */
    public m f45951c;

    /* renamed from: d, reason: collision with root package name */
    public View f45952d;

    /* renamed from: e, reason: collision with root package name */
    public StateWrapper f45953e;

    public k(Context context) {
        super(context);
        this.f45949a = o.f45965a;
    }

    private final void s() {
        C4201a c4201a = this.f45950b;
        if (c4201a != null) {
            m mVar = this.f45951c;
            if (mVar == null) {
                l lVar = l.f45955b;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            StateWrapper stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putMap("insets", q.b(c4201a));
                stateWrapper.updateState(createMap);
                return;
            }
            n nVar = new n(c4201a, this.f45949a, mVar);
            ReactContext a10 = r.a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) a10.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                a10.runOnNativeModulesQueueThread(new Runnable() { // from class: ed.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.t(UIManagerModule.this);
                    }
                });
                u();
            }
        }
    }

    public static final void t(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().dispatchViewUpdates(-1);
    }

    public static final void v(ReentrantLock reentrantLock, Ref.BooleanRef booleanRef, Condition condition) {
        reentrantLock.lock();
        try {
            if (!booleanRef.element) {
                booleanRef.element = true;
                condition.signal();
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Nullable
    public final StateWrapper getStateWrapper() {
        return this.f45953e;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View q10 = q();
        this.f45952d = q10;
        if (q10 != null && (viewTreeObserver = q10.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f45952d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f45952d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean r10 = r();
        if (r10) {
            requestLayout();
        }
        return !r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View q() {
        for (ViewParent viewParent = getParent(); viewParent != 0; viewParent = viewParent.getParent()) {
            if (viewParent instanceof f) {
                return (View) viewParent;
            }
        }
        return this;
    }

    public final boolean r() {
        C4201a e10;
        View view = this.f45952d;
        if (view == null || (e10 = h.e(view)) == null || Intrinsics.areEqual(this.f45950b, e10)) {
            return false;
        }
        this.f45950b = e10;
        s();
        return true;
    }

    public final void setEdges(@NotNull m edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f45951c = edges;
        s();
    }

    public final void setMode(@NotNull o mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f45949a = mode;
        s();
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f45953e = stateWrapper;
    }

    public final void u() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        long nanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: ed.j
            @Override // java.lang.Runnable
            public final void run() {
                k.v(reentrantLock, booleanRef, newCondition);
            }
        });
        reentrantLock.lock();
        long j10 = 0;
        while (!booleanRef.element && j10 < 500000000) {
            try {
                try {
                    newCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    booleanRef.element = true;
                }
                j10 += System.nanoTime() - nanoTime;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Unit unit = Unit.INSTANCE;
        reentrantLock.unlock();
        if (j10 >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }
}

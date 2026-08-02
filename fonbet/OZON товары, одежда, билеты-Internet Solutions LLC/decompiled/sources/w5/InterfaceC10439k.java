package w5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;
import xe.C10737n;

/* renamed from: w5.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC10439k<T extends View> extends InterfaceC10436h {
    private static AbstractC10429a d(int i11, int i12, int i13) {
        if (i11 == -2) {
            return AbstractC10429a.b.f103576a;
        }
        int i14 = i11 - i13;
        if (i14 > 0) {
            return new AbstractC10429a.C2245a(i14);
        }
        int i15 = i12 - i13;
        if (i15 > 0) {
            return new AbstractC10429a.C2245a(i15);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    default C10435g getSize() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        AbstractC10429a d11 = d(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), c() ? getView().getPaddingRight() + getView().getPaddingLeft() : 0);
        if (d11 == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
        AbstractC10429a d12 = d(layoutParams2 != null ? layoutParams2.height : -1, getView().getHeight(), c() ? getView().getPaddingBottom() + getView().getPaddingTop() : 0);
        if (d12 == null) {
            return null;
        }
        return new C10435g(d11, d12);
    }

    @Override // w5.InterfaceC10436h
    default Object a(@NotNull kotlin.coroutines.d<? super C10435g> frame) {
        C10435g size = getSize();
        if (size != null) {
            return size;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC10438j viewTreeObserverOnPreDrawListenerC10438j = new ViewTreeObserverOnPreDrawListenerC10438j(this, viewTreeObserver, c10737n);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10438j);
        c10737n.q(new C10437i(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC10438j));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    default boolean c() {
        return true;
    }

    @NotNull
    T getView();
}

package Lc;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements ReactPointerEventsView {

    /* renamed from: a, reason: collision with root package name */
    public final d f7157a;

    public h(d dimmingView) {
        Intrinsics.checkNotNullParameter(dimmingView, "dimmingView");
        this.f7157a = dimmingView;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.f7157a.getBlockGestures$react_native_screens_release() ? PointerEvents.AUTO : PointerEvents.NONE;
    }
}

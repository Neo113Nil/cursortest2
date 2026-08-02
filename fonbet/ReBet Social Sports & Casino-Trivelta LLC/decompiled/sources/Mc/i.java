package Mc;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C3834z;
import com.swmansion.rnscreens.G;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final C3834z f7630a;

    public i(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f7630a = screen;
    }

    public final Unit a() {
        EventDispatcher f10 = f();
        if (f10 == null) {
            return null;
        }
        f10.dispatchEvent(new f(g(), this.f7630a.getId()));
        return Unit.INSTANCE;
    }

    public final Unit b() {
        EventDispatcher f10 = f();
        if (f10 == null) {
            return null;
        }
        f10.dispatchEvent(new g(g(), this.f7630a.getId()));
        return Unit.INSTANCE;
    }

    public final Unit c() {
        EventDispatcher f10 = f();
        if (f10 == null) {
            return null;
        }
        f10.dispatchEvent(new k(g(), this.f7630a.getId()));
        return Unit.INSTANCE;
    }

    public final Unit d() {
        EventDispatcher f10 = f();
        if (f10 == null) {
            return null;
        }
        f10.dispatchEvent(new l(g(), this.f7630a.getId()));
        return Unit.INSTANCE;
    }

    public final void e(float f10, boolean z10, boolean z11) {
        float coerceIn = RangesKt.coerceIn(f10, 0.0f, 1.0f);
        short a10 = G.INSTANCE.a(coerceIn);
        EventDispatcher f11 = f();
        if (f11 != null) {
            f11.dispatchEvent(new j(g(), this.f7630a.getId(), coerceIn, z10, z11, a10));
        }
    }

    public final EventDispatcher f() {
        return this.f7630a.getReactEventDispatcher();
    }

    public final int g() {
        return UIManagerHelper.getSurfaceId(this.f7630a);
    }
}

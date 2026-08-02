package Jc;

import Ic.AbstractC1350d;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0.C6776e;

/* loaded from: classes4.dex */
public final class n extends Event {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6132c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final C6776e f6133d = new C6776e(7);

    /* renamed from: a, reason: collision with root package name */
    public WritableMap f6134a;

    /* renamed from: b, reason: collision with root package name */
    public short f6135b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(AbstractC1350d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", handler.T());
            createMap.putInt("state", handler.S());
            createMap.putInt("numberOfTouches", handler.V());
            createMap.putInt("eventType", handler.U());
            createMap.putInt("pointerType", handler.Q());
            WritableArray t10 = handler.t();
            if (t10 != null) {
                createMap.putArray("changedTouches", t10);
            }
            WritableArray s10 = handler.s();
            if (s10 != null) {
                createMap.putArray("allTouches", s10);
            }
            if (handler.a0() && handler.S() == 4) {
                createMap.putInt("state", 2);
            }
            return createMap;
        }

        public final n b(AbstractC1350d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            n nVar = (n) n.f6133d.acquire();
            if (nVar == null) {
                nVar = new n(null);
            }
            nVar.c(handler);
            return nVar;
        }

        public a() {
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void c(AbstractC1350d abstractC1350d) {
        View W10 = abstractC1350d.W();
        Intrinsics.checkNotNull(W10);
        super.init(UIManagerHelper.getSurfaceId(W10), W10.getId());
        this.f6134a = f6132c.a(abstractC1350d);
        this.f6135b = abstractC1350d.I();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f6135b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    public WritableMap getAccessibilityEventData() {
        return this.f6134a;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f6134a = null;
        f6133d.release(this);
    }

    public n() {
    }
}

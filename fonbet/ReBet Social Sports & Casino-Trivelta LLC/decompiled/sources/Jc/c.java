package Jc;

import Ic.AbstractC1350d;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0.C6776e;

/* loaded from: classes4.dex */
public final class c extends Event {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6097d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C6776e f6098e = new C6776e(7);

    /* renamed from: a, reason: collision with root package name */
    public Kc.b f6099a;

    /* renamed from: b, reason: collision with root package name */
    public short f6100b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6101c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ c c(a aVar, AbstractC1350d abstractC1350d, Kc.b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.b(abstractC1350d, bVar, z10);
        }

        public final WritableMap a(Kc.b dataBuilder) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap createMap = Arguments.createMap();
            dataBuilder.a(createMap);
            return createMap;
        }

        public final c b(AbstractC1350d handler, Kc.b dataBuilder, boolean z10) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            c cVar = (c) c.f6098e.acquire();
            if (cVar == null) {
                cVar = new c(null);
            }
            cVar.c(handler, dataBuilder, z10);
            return cVar;
        }

        public a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void c(AbstractC1350d abstractC1350d, Kc.b bVar, boolean z10) {
        View W10 = abstractC1350d.W();
        Intrinsics.checkNotNull(W10);
        super.init(UIManagerHelper.getSurfaceId(W10), W10.getId());
        this.f6099a = bVar;
        this.f6101c = z10;
        this.f6100b = abstractC1350d.I();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f6100b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    public WritableMap getAccessibilityEventData() {
        a aVar = f6097d;
        Kc.b bVar = this.f6099a;
        Intrinsics.checkNotNull(bVar);
        return aVar.a(bVar);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.f6101c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f6099a = null;
        f6098e.release(this);
    }

    public c() {
    }
}

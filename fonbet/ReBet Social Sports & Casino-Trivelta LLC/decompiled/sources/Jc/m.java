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
public final class m extends Event {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6127d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C6776e f6128e = new C6776e(7);

    /* renamed from: a, reason: collision with root package name */
    public Kc.b f6129a;

    /* renamed from: b, reason: collision with root package name */
    public int f6130b;

    /* renamed from: c, reason: collision with root package name */
    public int f6131c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap a(Kc.b dataBuilder, int i10, int i11) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap createMap = Arguments.createMap();
            dataBuilder.a(createMap);
            createMap.putInt("state", i10);
            createMap.putInt("oldState", i11);
            return createMap;
        }

        public final m b(AbstractC1350d handler, int i10, int i11, Kc.b dataBuilder) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            m mVar = (m) m.f6128e.acquire();
            if (mVar == null) {
                mVar = new m(null);
            }
            mVar.c(handler, i10, i11, dataBuilder);
            return mVar;
        }

        public a() {
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void c(AbstractC1350d abstractC1350d, int i10, int i11, Kc.b bVar) {
        View W10 = abstractC1350d.W();
        Intrinsics.checkNotNull(W10);
        super.init(UIManagerHelper.getSurfaceId(W10), W10.getId());
        this.f6129a = bVar;
        this.f6130b = i10;
        this.f6131c = i11;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    public WritableMap getAccessibilityEventData() {
        a aVar = f6127d;
        Kc.b bVar = this.f6129a;
        Intrinsics.checkNotNull(bVar);
        return aVar.a(bVar, this.f6130b, this.f6131c);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f6129a = null;
        this.f6130b = 0;
        this.f6131c = 0;
        f6128e.release(this);
    }

    public m() {
    }
}

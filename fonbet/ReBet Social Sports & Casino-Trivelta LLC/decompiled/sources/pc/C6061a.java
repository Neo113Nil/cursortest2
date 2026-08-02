package pc;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6061a extends Event {

    /* renamed from: b, reason: collision with root package name */
    public static final C0871a f63105b = new C0871a(null);

    /* renamed from: a, reason: collision with root package name */
    public final WritableMap f63106a;

    /* renamed from: pc.a$a, reason: collision with other inner class name */
    public static final class C0871a {
        public /* synthetic */ C0871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0871a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6061a(int i10, WritableMap mEventData) {
        super(i10);
        Intrinsics.checkNotNullParameter(mEventData, "mEventData");
        this.f63106a = mEventData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.f63106a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topLoadingSubResourceError";
    }
}

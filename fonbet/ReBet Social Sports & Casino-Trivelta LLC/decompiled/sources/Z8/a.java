package Z8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a extends Event {

    /* renamed from: b, reason: collision with root package name */
    public static final C0307a f14731b = new C0307a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f14732a;

    /* renamed from: Z8.a$a, reason: collision with other inner class name */
    public static final class C0307a {
        public /* synthetic */ C0307a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0307a() {
        }
    }

    public a(int i10, int i11, int i12) {
        super(i10, i11);
        this.f14732a = i12;
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
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("resultCount", this.f14732a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topContentUpdate";
    }
}

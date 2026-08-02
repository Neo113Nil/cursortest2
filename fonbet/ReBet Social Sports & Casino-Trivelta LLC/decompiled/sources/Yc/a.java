package Yc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a extends Event implements Pc.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0292a f14130a = new C0292a(null);

    /* renamed from: Yc.a$a, reason: collision with other inner class name */
    public static final class C0292a implements Pc.b {
        public /* synthetic */ C0292a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onDidAppear";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topDidAppear";
        }

        public C0292a() {
        }
    }

    public a(int i10, int i11) {
        super(i10, i11);
    }

    @Override // Pc.b
    public String a() {
        return "onDidAppear";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topDidAppear";
    }
}

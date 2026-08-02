package Yc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class d extends Event implements Pc.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14133a = new a(null);

    public static final class a implements Pc.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onWillDisappear";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topWillDisappear";
        }

        public a() {
        }
    }

    public d(int i10, int i11) {
        super(i10, i11);
    }

    @Override // Pc.b
    public String a() {
        return "onWillDisappear";
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
        return "topWillDisappear";
    }
}

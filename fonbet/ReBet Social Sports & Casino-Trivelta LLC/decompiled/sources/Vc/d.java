package Vc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d extends Event implements Pc.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f12864a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, int i11, String name, String registrationName) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(registrationName, "registrationName");
        this.f12864a = name;
        this.f12865b = registrationName;
    }

    @Override // Pc.b
    public String a() {
        return this.f12865b;
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
        return this.f12864a;
    }
}

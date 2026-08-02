package z3;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6923k extends Event {

    /* renamed from: b, reason: collision with root package name */
    public static final a f68560b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f68561a;

    /* renamed from: z3.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C6923k(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.f68561a = z10;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", this.f68561a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topAnimationFinish";
    }
}

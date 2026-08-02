package z3;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6922j extends Event {

    /* renamed from: b, reason: collision with root package name */
    public static final a f68558b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f68559a;

    /* renamed from: z3.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6922j(int i10, int i11, Throwable error) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f68559a = error;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("error", this.f68559a.getMessage());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topAnimationFailure";
    }
}

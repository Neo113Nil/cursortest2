package Xc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends Event implements Pc.b {

    /* renamed from: f, reason: collision with root package name */
    public static final C0284a f13708f = new C0284a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f13709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13710b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13711c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13712d;

    /* renamed from: e, reason: collision with root package name */
    public final com.swmansion.rnscreens.gamma.tabs.container.b f13713e;

    /* renamed from: Xc.a$a, reason: collision with other inner class name */
    public static final class C0284a implements Pc.b {
        public /* synthetic */ C0284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onTabSelected";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topTabSelected";
        }

        public C0284a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, int i11, String selectedScreenKey, int i12, boolean z10, boolean z11, com.swmansion.rnscreens.gamma.tabs.container.b actionOrigin) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(selectedScreenKey, "selectedScreenKey");
        Intrinsics.checkNotNullParameter(actionOrigin, "actionOrigin");
        this.f13709a = selectedScreenKey;
        this.f13710b = i12;
        this.f13711c = z10;
        this.f13712d = z11;
        this.f13713e = actionOrigin;
    }

    @Override // Pc.b
    public String a() {
        return "onTabSelected";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("selectedScreenKey", this.f13709a);
        createMap.putInt("provenance", this.f13710b);
        createMap.putBoolean("isRepeated", this.f13711c);
        createMap.putBoolean("hasTriggeredSpecialEffect", this.f13712d);
        createMap.putString("actionOrigin", this.f13713e.toString());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topTabSelected";
    }
}

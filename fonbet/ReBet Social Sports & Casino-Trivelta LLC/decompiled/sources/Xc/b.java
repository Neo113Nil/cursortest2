package Xc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.rnscreens.gamma.tabs.container.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends Event implements Pc.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13714c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final k f13715a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13716b;

    public static final class a implements Pc.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onTabSelectionPrevented";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topTabSelectionPrevented";
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, k currentNavState, String preventedScreenKey) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(preventedScreenKey, "preventedScreenKey");
        this.f13715a = currentNavState;
        this.f13716b = preventedScreenKey;
    }

    @Override // Pc.b
    public String a() {
        return "onTabSelectionPrevented";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("selectedScreenKey", this.f13715a.c());
        createMap.putInt("provenance", this.f13715a.b());
        createMap.putString("preventedScreenKey", this.f13716b);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topTabSelectionPrevented";
    }
}

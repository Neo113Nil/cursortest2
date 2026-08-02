package Xc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.rnscreens.gamma.tabs.container.k;
import com.swmansion.rnscreens.gamma.tabs.container.q;
import com.swmansion.rnscreens.gamma.tabs.container.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends Event implements Pc.b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f13717d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final k f13718a;

    /* renamed from: b, reason: collision with root package name */
    public final r f13719b;

    /* renamed from: c, reason: collision with root package name */
    public final q f13720c;

    public static final class a implements Pc.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onTabSelectionRejected";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topTabSelectionRejected";
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, int i11, k currentNavState, r rejectedRequest, q rejectionReason) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(rejectedRequest, "rejectedRequest");
        Intrinsics.checkNotNullParameter(rejectionReason, "rejectionReason");
        this.f13718a = currentNavState;
        this.f13719b = rejectedRequest;
        this.f13720c = rejectionReason;
    }

    @Override // Pc.b
    public String a() {
        return "onTabSelectionRejected";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("selectedScreenKey", this.f13718a.c());
        createMap.putInt("provenance", this.f13718a.b());
        createMap.putString("rejectedScreenKey", this.f13719b.e());
        createMap.putInt("rejectedBaseProvenance", this.f13719b.d());
        createMap.putString("rejectionReason", this.f13720c.toString());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topTabSelectionRejected";
    }
}

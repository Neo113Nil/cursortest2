package Vc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f12862d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12863c;

    public static final class a implements Pc.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Pc.b
        public String a() {
            return "onDismiss";
        }

        @Override // Pc.b
        public String getEventName() {
            return "topDismiss";
        }

        public a() {
        }
    }

    public c(int i10, int i11, boolean z10) {
        super(i10, i11, "topDismiss", "onDismiss");
        this.f12863c = z10;
    }

    @Override // Vc.d, com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isNativeDismiss", this.f12863c);
        return createMap;
    }
}

package Mc;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class j extends Event {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7631e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f7632a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7633b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7634c;

    /* renamed from: d, reason: collision with root package name */
    public final short f7635d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public j(int i10, int i11, float f10, boolean z10, boolean z11, short s10) {
        super(i10, i11);
        this.f7632a = f10;
        this.f7633b = z10;
        this.f7634c = z11;
        this.f7635d = s10;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f7635d;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.f7632a);
        createMap.putInt("closing", this.f7633b ? 1 : 0);
        createMap.putInt("goingForward", this.f7634c ? 1 : 0);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topTransitionProgress";
    }
}

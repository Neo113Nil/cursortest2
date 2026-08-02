package Z8;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends Event {

    /* renamed from: c, reason: collision with root package name */
    public static final a f14733c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Media f14734a;

    /* renamed from: b, reason: collision with root package name */
    public final RenditionType f14735b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, Media media, RenditionType renditionType) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(renditionType, "renditionType");
        this.f14734a = media;
        this.f14735b = renditionType;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    /* renamed from: getEventData */
    public WritableMap getAccessibilityEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("media", Y8.b.f14087a.b(this.f14734a, this.f14735b).toString());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topMediaSelect";
    }
}

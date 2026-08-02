package Pc;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0176a f8960d = new C0176a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ReactContext f8961a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8962b;

    /* renamed from: c, reason: collision with root package name */
    public final EventDispatcher f8963c;

    /* renamed from: Pc.a$a, reason: collision with other inner class name */
    public static final class C0176a {
        public /* synthetic */ C0176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0176a() {
        }
    }

    public a(ReactContext reactContext, int i10) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f8961a = reactContext;
        this.f8962b = i10;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, i10);
        if (eventDispatcherForReactTag != null) {
            this.f8963c = eventDispatcherForReactTag;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Nullish event dispatcher for view with tag: " + i10).toString());
    }

    public final EventDispatcher e() {
        return this.f8963c;
    }

    public final int f() {
        return UIManagerHelper.getSurfaceId(this.f8961a);
    }

    public final int g() {
        return this.f8962b;
    }
}

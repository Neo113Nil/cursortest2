package Kc;

import Ic.AbstractC1350d;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6434b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6436d;

    public b(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6433a = handler.O();
        this.f6434b = handler.T();
        this.f6435c = handler.S();
        this.f6436d = handler.Q();
    }

    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.f6433a);
        eventData.putInt("handlerTag", this.f6434b);
        eventData.putInt("state", this.f6435c);
        eventData.putInt("pointerType", this.f6436d);
    }
}

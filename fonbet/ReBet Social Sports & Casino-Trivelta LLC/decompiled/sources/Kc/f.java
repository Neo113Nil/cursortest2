package Kc;

import Ic.q;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends b {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6447e = handler.f0();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putBoolean("pointerInside", this.f6447e);
    }
}

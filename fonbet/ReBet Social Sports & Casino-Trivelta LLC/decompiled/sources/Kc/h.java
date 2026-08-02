package Kc;

import Ic.u;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends b {

    /* renamed from: e, reason: collision with root package name */
    public final double f6457e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6458f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6459g;

    /* renamed from: h, reason: collision with root package name */
    public final double f6460h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6457e = handler.b1();
        this.f6458f = handler.Z0();
        this.f6459g = handler.a1();
        this.f6460h = handler.c1();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("scale", this.f6457e);
        eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(this.f6458f));
        eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(this.f6459g));
        eventData.putDouble("velocity", this.f6460h);
    }
}

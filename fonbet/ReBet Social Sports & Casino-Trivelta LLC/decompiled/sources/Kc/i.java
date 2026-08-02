package Kc;

import Ic.x;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends b {

    /* renamed from: e, reason: collision with root package name */
    public final double f6461e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6462f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6463g;

    /* renamed from: h, reason: collision with root package name */
    public final double f6464h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6461e = handler.Y0();
        this.f6462f = handler.W0();
        this.f6463g = handler.X0();
        this.f6464h = handler.Z0();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(ViewProps.ROTATION, this.f6461e);
        eventData.putDouble("anchorX", PixelUtil.toDIPFromPixel(this.f6462f));
        eventData.putDouble("anchorY", PixelUtil.toDIPFromPixel(this.f6463g));
        eventData.putDouble("velocity", this.f6464h);
    }
}

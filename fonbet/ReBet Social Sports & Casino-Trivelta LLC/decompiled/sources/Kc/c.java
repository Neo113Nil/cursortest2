package Kc;

import Ic.m;
import Ic.z;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public final float f6437e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6438f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6439g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6440h;

    /* renamed from: i, reason: collision with root package name */
    public final z f6441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6437e = handler.L();
        this.f6438f = handler.M();
        this.f6439g = handler.J();
        this.f6440h = handler.K();
        this.f6441i = handler.X0();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(this.f6437e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f6438f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f6439g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f6440h));
        if (this.f6441i.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f6441i.b());
    }
}

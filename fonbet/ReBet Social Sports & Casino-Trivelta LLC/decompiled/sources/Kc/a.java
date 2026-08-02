package Kc;

import Ic.C1348b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;

/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final float f6429e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6430f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6431g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6432h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1348b handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6429e = handler.L();
        this.f6430f = handler.M();
        this.f6431g = handler.J();
        this.f6432h = handler.K();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(this.f6429e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f6430f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f6431g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f6432h));
    }
}

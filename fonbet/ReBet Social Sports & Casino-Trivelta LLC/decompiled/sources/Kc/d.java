package Kc;

import Ic.o;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;

/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public final float f6442e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6443f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6444g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6445h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6442e = handler.L();
        this.f6443f = handler.M();
        this.f6444g = handler.J();
        this.f6445h = handler.K();
        this.f6446i = handler.Y0();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(this.f6442e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f6443f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f6444g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f6445h));
        eventData.putInt("duration", this.f6446i);
    }
}

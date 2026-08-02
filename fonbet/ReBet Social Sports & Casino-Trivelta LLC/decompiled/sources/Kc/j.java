package Kc;

import Ic.B;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;

/* loaded from: classes4.dex */
public final class j extends b {

    /* renamed from: e, reason: collision with root package name */
    public final float f6465e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6466f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6467g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6468h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6465e = handler.L();
        this.f6466f = handler.M();
        this.f6467g = handler.J();
        this.f6468h = handler.K();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(this.f6465e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f6466f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f6467g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f6468h));
    }
}

package Kc;

import Ic.t;
import Ic.z;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;

/* loaded from: classes4.dex */
public final class g extends b {

    /* renamed from: e, reason: collision with root package name */
    public final float f6448e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6449f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6450g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6451h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6452i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6453j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6454k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6455l;

    /* renamed from: m, reason: collision with root package name */
    public final z f6456m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6448e = handler.L();
        this.f6449f = handler.M();
        this.f6450g = handler.J();
        this.f6451h = handler.K();
        this.f6452i = handler.n1();
        this.f6453j = handler.o1();
        this.f6454k = handler.p1();
        this.f6455l = handler.q1();
        this.f6456m = handler.m1();
    }

    @Override // Kc.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble(C5444x.f55808b, PixelUtil.toDIPFromPixel(this.f6448e));
        eventData.putDouble("y", PixelUtil.toDIPFromPixel(this.f6449f));
        eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(this.f6450g));
        eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(this.f6451h));
        eventData.putDouble("translationX", PixelUtil.toDIPFromPixel(this.f6452i));
        eventData.putDouble("translationY", PixelUtil.toDIPFromPixel(this.f6453j));
        eventData.putDouble("velocityX", PixelUtil.toDIPFromPixel(this.f6454k));
        eventData.putDouble("velocityY", PixelUtil.toDIPFromPixel(this.f6455l));
        if (this.f6456m.a() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.f6456m.b());
    }
}

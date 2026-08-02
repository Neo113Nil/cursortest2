package Rg;

import Ph.F;
import kotlin.jvm.internal.Intrinsics;
import nh.AbstractC5737b;

/* loaded from: classes3.dex */
public final class k extends IllegalArgumentException implements F {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5737b f10305a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AbstractC5737b frame) {
        super("Unsupported frame type: " + frame);
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.f10305a = frame;
    }

    @Override // Ph.F
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k a() {
        k kVar = new k(this.f10305a);
        kVar.initCause(this);
        return kVar;
    }
}

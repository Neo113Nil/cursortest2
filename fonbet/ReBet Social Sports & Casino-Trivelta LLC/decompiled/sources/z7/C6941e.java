package z7;

import C7.C1037a;
import K7.InterfaceC1369j;
import K7.L;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6941e {

    /* renamed from: a, reason: collision with root package name */
    public static final C6941e f68626a = new C6941e();

    public static final AbstractC6940d a(L poolFactory, L7.d platformDecoder, C1037a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        InterfaceC1369j b10 = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getBitmapPool(...)");
        return new C6937a(b10, closeableReferenceFactory);
    }
}

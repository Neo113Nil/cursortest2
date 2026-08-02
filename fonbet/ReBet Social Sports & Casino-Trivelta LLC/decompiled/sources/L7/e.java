package L7;

import K7.InterfaceC1369j;
import K7.L;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import x0.C6776e;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7083a = new e();

    public static final d a(L poolFactory, boolean z10, boolean z11, f platformDecoderOptions) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC1369j b10 = poolFactory.b();
            Intrinsics.checkNotNullExpressionValue(b10, "getBitmapPool(...)");
            return new c(b10, b(poolFactory, z11), platformDecoderOptions);
        }
        InterfaceC1369j b11 = poolFactory.b();
        Intrinsics.checkNotNullExpressionValue(b11, "getBitmapPool(...)");
        return new a(b11, b(poolFactory, z11), platformDecoderOptions);
    }

    public static final InterfaceC6775d b(L poolFactory, boolean z10) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        if (z10) {
            G6.b INSTANCE = G6.b.f3898a;
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int e10 = poolFactory.e();
        C6776e c6776e = new C6776e(e10);
        for (int i10 = 0; i10 < e10; i10++) {
            ByteBuffer allocate = ByteBuffer.allocate(G6.b.c());
            Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
            c6776e.release(allocate);
        }
        return c6776e;
    }
}

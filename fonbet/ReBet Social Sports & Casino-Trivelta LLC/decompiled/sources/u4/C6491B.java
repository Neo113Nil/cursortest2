package u4;

import android.content.Context;
import g1.C4316c;
import h1.InterfaceC4411g;
import h1.InterfaceC4425u;
import i1.c;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6491B {

    /* renamed from: a, reason: collision with root package name */
    public static final C6491B f65970a = new C6491B();

    /* renamed from: b, reason: collision with root package name */
    public static i1.r f65971b;

    public final InterfaceC4411g.a a(InterfaceC4425u factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (f65971b == null) {
            return factory;
        }
        c.C0723c c0723c = new c.C0723c();
        i1.r rVar = f65971b;
        Intrinsics.checkNotNull(rVar);
        c.C0723c e10 = c0723c.d(rVar).e(factory);
        Intrinsics.checkNotNullExpressionValue(e10, "setUpstreamDataSourceFactory(...)");
        return e10;
    }

    public final void b(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f65971b != null || i10 <= 0) {
            return;
        }
        long j10 = 1024;
        f65971b = new i1.r(new File(context.getCacheDir(), "RNVCache"), new i1.p(i10 * j10 * j10), new C4316c(context));
    }
}

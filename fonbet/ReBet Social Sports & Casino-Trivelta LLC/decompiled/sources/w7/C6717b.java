package w7;

import A7.n;
import B6.g;
import C7.InterfaceC1052p;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import z7.AbstractC6940d;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6717b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6717b f67485a = new C6717b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f67486b;

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC6716a f67487c;

    public static final InterfaceC6716a a(AbstractC6940d abstractC6940d, InterfaceC1052p interfaceC1052p, n nVar, boolean z10, boolean z11, int i10, int i11, ExecutorService executorService) {
        if (!f67486b) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object newInstance = AnimatedFactoryV2Impl.class.getConstructor(AbstractC6940d.class, InterfaceC1052p.class, n.class, cls, cls, cls2, cls2, g.class).newInstance(abstractC6940d, interfaceC1052p, nVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10), Integer.valueOf(i11), executorService);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f67487c = (InterfaceC6716a) newInstance;
            } catch (Throwable unused) {
            }
            if (f67487c != null) {
                f67486b = true;
            }
        }
        return f67487c;
    }
}

package g7;

import d7.InterfaceC4012a;
import e7.InterfaceC4184b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4364a {
    void a(int i10, int i11, Function0 function0);

    void b();

    void c(b bVar, InterfaceC4184b interfaceC4184b, InterfaceC4012a interfaceC4012a, int i10, Function0 function0);

    H6.a d(int i10, int i11, int i12);

    void e();

    /* renamed from: g7.a$a, reason: collision with other inner class name */
    public static final class C0684a {
        public static H6.a b(InterfaceC4364a interfaceC4364a, int i10, int i11, int i12) {
            return null;
        }

        public static void e(InterfaceC4364a interfaceC4364a, b bitmapFramePreparer, InterfaceC4184b bitmapFrameCache, InterfaceC4012a animationBackend, int i10, Function0 function0) {
            Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        }

        public static /* synthetic */ void f(InterfaceC4364a interfaceC4364a, b bVar, InterfaceC4184b interfaceC4184b, InterfaceC4012a interfaceC4012a, int i10, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i11 & 16) != 0) {
                function0 = null;
            }
            interfaceC4364a.c(bVar, interfaceC4184b, interfaceC4012a, i10, function0);
        }

        public static void a(InterfaceC4364a interfaceC4364a) {
        }

        public static void c(InterfaceC4364a interfaceC4364a) {
        }

        public static void d(InterfaceC4364a interfaceC4364a, int i10, int i11, Function0 function0) {
        }
    }
}

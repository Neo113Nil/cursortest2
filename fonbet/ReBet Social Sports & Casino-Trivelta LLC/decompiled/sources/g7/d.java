package g7;

import d7.InterfaceC4012a;
import e7.InterfaceC4184b;
import g7.InterfaceC4364a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements InterfaceC4364a {

    /* renamed from: a, reason: collision with root package name */
    public final int f47122a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f47123b = d.class;

    public d(int i10) {
        this.f47122a = i10;
    }

    @Override // g7.InterfaceC4364a
    public void a(int i10, int i11, Function0 function0) {
        InterfaceC4364a.C0684a.d(this, i10, i11, function0);
    }

    @Override // g7.InterfaceC4364a
    public void b() {
        InterfaceC4364a.C0684a.c(this);
    }

    @Override // g7.InterfaceC4364a
    public void c(b bitmapFramePreparer, InterfaceC4184b bitmapFrameCache, InterfaceC4012a animationBackend, int i10, Function0 function0) {
        Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int i11 = this.f47122a;
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int a10 = (i10 + i12) % animationBackend.a();
                if (E6.a.w(2)) {
                    E6.a.z(this.f47123b, "Preparing frame %d, last drawn: %d", Integer.valueOf(a10), Integer.valueOf(i10));
                }
                if (!bitmapFramePreparer.a(bitmapFrameCache, animationBackend, a10)) {
                    return;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // g7.InterfaceC4364a
    public H6.a d(int i10, int i11, int i12) {
        return InterfaceC4364a.C0684a.b(this, i10, i11, i12);
    }

    @Override // g7.InterfaceC4364a
    public void e() {
        InterfaceC4364a.C0684a.a(this);
    }
}

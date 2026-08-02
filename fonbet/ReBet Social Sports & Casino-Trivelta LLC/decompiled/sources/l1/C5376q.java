package l1;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import b1.C2368w;
import b1.InterfaceC2367v;
import e1.AbstractC4151s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5376q implements InterfaceC2367v {

    /* renamed from: a, reason: collision with root package name */
    public final EGLContext f55549a;

    /* renamed from: b, reason: collision with root package name */
    public final List f55550b;

    public C5376q() {
        this(null);
    }

    @Override // b1.InterfaceC2367v
    public EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) {
        return AbstractC4151s.l(eGLDisplay, obj, i10, z10);
    }

    @Override // b1.InterfaceC2367v
    public C2368w b(int i10, int i11, int i12) {
        return new C2368w(i10, AbstractC4151s.n(i10), -1, i11, i12);
    }

    @Override // b1.InterfaceC2367v
    public EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return AbstractC4151s.o(eGLContext, eGLDisplay);
    }

    @Override // b1.InterfaceC2367v
    public EGLContext d(EGLDisplay eGLDisplay, int i10, int[] iArr) {
        EGLContext j10 = AbstractC4151s.j(this.f55549a, eGLDisplay, i10, iArr);
        this.f55550b.add(j10);
        return j10;
    }

    @Override // b1.InterfaceC2367v
    public void e(EGLDisplay eGLDisplay) {
        for (int i10 = 0; i10 < this.f55550b.size(); i10++) {
            AbstractC4151s.A(eGLDisplay, (EGLContext) this.f55550b.get(i10));
        }
    }

    public C5376q(EGLContext eGLContext) {
        this.f55549a = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        this.f55550b = new ArrayList();
    }
}

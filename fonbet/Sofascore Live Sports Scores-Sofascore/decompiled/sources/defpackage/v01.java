package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class v01 implements mo0 {
    public ho0 b;
    public ho0 c;
    public ho0 d;
    public ho0 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public v01() {
        ByteBuffer byteBuffer = mo0.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        ho0 ho0Var = ho0.e;
        this.d = ho0Var;
        this.e = ho0Var;
        this.b = ho0Var;
        this.c = ho0Var;
    }

    @Override // defpackage.mo0
    public final void a(io0 io0Var) {
        this.g = mo0.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    @Override // defpackage.mo0
    public final ho0 b(ho0 ho0Var) {
        this.d = ho0Var;
        this.e = d(ho0Var);
        return isActive() ? this.e : ho0.e;
    }

    public abstract ho0 d(ho0 ho0Var);

    @Override // defpackage.mo0
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = mo0.a;
        return byteBuffer;
    }

    public final ByteBuffer h(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.mo0
    public boolean isActive() {
        return this.e != ho0.e;
    }

    @Override // defpackage.mo0
    public boolean isEnded() {
        return this.h && this.g == mo0.a;
    }

    @Override // defpackage.mo0
    public final void queueEndOfStream() {
        this.h = true;
        f();
    }

    @Override // defpackage.mo0
    public final void reset() {
        ByteBuffer byteBuffer = mo0.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        ho0 ho0Var = ho0.e;
        this.d = ho0Var;
        this.e = ho0Var;
        this.b = ho0Var;
        this.c = ho0Var;
        g();
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}

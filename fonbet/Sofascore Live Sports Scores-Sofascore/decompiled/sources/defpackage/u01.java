package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class u01 implements lo0 {
    public go0 b;
    public go0 c;
    public go0 d;
    public go0 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public u01() {
        ByteBuffer byteBuffer = lo0.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        go0 go0Var = go0.e;
        this.d = go0Var;
        this.e = go0Var;
        this.b = go0Var;
        this.c = go0Var;
    }

    @Override // defpackage.lo0
    public final go0 a(go0 go0Var) {
        this.d = go0Var;
        this.e = b(go0Var);
        return isActive() ? this.e : go0.e;
    }

    public abstract go0 b(go0 go0Var);

    public final ByteBuffer f(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.lo0
    public final void flush() {
        this.g = lo0.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        c();
    }

    @Override // defpackage.lo0
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = lo0.a;
        return byteBuffer;
    }

    @Override // defpackage.lo0
    public boolean isActive() {
        return this.e != go0.e;
    }

    @Override // defpackage.lo0
    public boolean isEnded() {
        return this.h && this.g == lo0.a;
    }

    @Override // defpackage.lo0
    public final void queueEndOfStream() {
        this.h = true;
        d();
    }

    @Override // defpackage.lo0
    public final void reset() {
        flush();
        this.f = lo0.a;
        go0 go0Var = go0.e;
        this.d = go0Var;
        this.e = go0Var;
        this.b = go0Var;
        this.c = go0Var;
        e();
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}

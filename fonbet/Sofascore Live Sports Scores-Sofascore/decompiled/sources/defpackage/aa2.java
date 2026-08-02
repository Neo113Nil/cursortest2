package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aa2 implements xd4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ aa2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xd4
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    wd4Var.l(ha2.a((File) obj));
                    break;
                } catch (IOException e) {
                    wd4Var.d(e);
                    return;
                }
            default:
                wd4Var.l(obj);
                break;
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.xd4
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.xd4
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    private final void d() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}

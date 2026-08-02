package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class co2 extends u01 {
    public int[] i;
    public int[] j;

    @Override // defpackage.u01
    public final go0 b(go0 go0Var) {
        int[] iArr = this.i;
        if (iArr == null) {
            return go0.e;
        }
        int i = go0Var.c;
        int i2 = go0Var.b;
        if (i != 2) {
            throw new jo0(go0Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new jo0(go0Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new go0(go0Var.a, iArr.length, 2) : go0.e;
    }

    @Override // defpackage.u01
    public final void c() {
        this.j = this.i;
    }

    @Override // defpackage.u01
    public final void e() {
        this.j = null;
        this.i = null;
    }

    @Override // defpackage.lo0
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer f = f(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                f.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        f.flip();
    }
}

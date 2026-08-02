package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sff extends h5d {
    public final boolean o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sff(byte[] bArr) {
        this(r0, true);
        int length = bArr.length;
        o92 o92Var = new o92(32, StandardCharsets.ISO_8859_1);
        ByteBuffer allocate = ByteBuffer.allocate(o92.d(length, o92Var.b));
        o92Var.c = allocate;
        allocate.put(bArr, 0, bArr.length);
    }

    @Override // defpackage.g5d
    public final int b(int i, byte[] bArr) {
        return 0;
    }

    @Override // defpackage.g5d
    public final boolean e() {
        return this.o;
    }

    public sff(o92 o92Var, boolean z) {
        this.g = o92Var;
        int position = o92Var.c.position() + 2;
        this.f = position;
        this.h = position;
        this.o = z;
    }

    public sff(sff sffVar) {
        this(sffVar.g, sffVar.o);
    }
}

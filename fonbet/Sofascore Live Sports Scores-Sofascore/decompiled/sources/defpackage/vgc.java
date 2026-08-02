package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vgc implements kr8 {
    public final o2 a;
    public zod c;
    public final uic g;
    public final uei h;
    public boolean i;
    public int j;
    public long l;
    public int b = -1;
    public tz2 d = mx9.b;
    public final v52 e = new v52(this, 1);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public vgc(o2 o2Var, uic uicVar, uei ueiVar) {
        this.a = o2Var;
        this.g = uicVar;
        this.h = ueiVar;
    }

    public static int g(zef zefVar, OutputStream outputStream) {
        MessageLite messageLite = zefVar.a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            zefVar.a.writeTo(outputStream);
            zefVar.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = zefVar.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = bff.a;
        z1a.y(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j;
                zefVar.c = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public final void a(ugc ugcVar, boolean z) {
        int i = ugc.d;
        ArrayList arrayList = ugcVar.a;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((zod) it.next()).c;
        }
        int i3 = this.b;
        if (i3 >= 0 && i2 > i3) {
            xei xeiVar = xei.j;
            Locale locale = Locale.US;
            throw xeiVar.h("message too large " + i2 + " > " + i3).a();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i2);
        this.g.getClass();
        zod g = uic.g(5);
        g.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i2 == 0) {
            this.c = g;
            return;
        }
        int i4 = this.j - 1;
        o2 o2Var = this.a;
        o2Var.a(g, false, false, i4);
        this.j = 1;
        for (int i5 = 0; i5 < arrayList.size() - 1; i5++) {
            o2Var.a((zod) arrayList.get(i5), false, false, 0);
        }
        this.c = (zod) mz1.h(arrayList, 1);
        this.l = i2;
    }

    public final int b(zef zefVar) {
        ugc ugcVar = new ugc(this);
        OutputStream h = this.d.h(ugcVar);
        try {
            int g = g(zefVar, h);
            h.close();
            int i = this.b;
            if (i < 0 || g <= i) {
                a(ugcVar, true);
                return g;
            }
            xei xeiVar = xei.j;
            Locale locale = Locale.US;
            throw xeiVar.h("message too large " + g + " > " + i).a();
        } catch (Throwable th) {
            h.close();
            throw th;
        }
    }

    @Override // defpackage.kr8
    public final kr8 c(tz2 tz2Var) {
        this.d = tz2Var;
        return this;
    }

    @Override // defpackage.kr8
    public final void close() {
        if (this.i) {
            return;
        }
        this.i = true;
        zod zodVar = this.c;
        if (zodVar != null && zodVar.c == 0) {
            this.c = null;
            zodVar = null;
        }
        this.c = null;
        this.a.a(zodVar, true, true, this.j);
        this.j = 0;
    }

    @Override // defpackage.kr8
    public final void d(int i) {
        z1a.D("max size already set", this.b == -1);
        this.b = i;
    }

    @Override // defpackage.kr8
    public final void e(zef zefVar) {
        if (this.i) {
            a70.r("Framer already closed");
            return;
        }
        this.j++;
        int i = this.k + 1;
        this.k = i;
        this.l = 0L;
        uei ueiVar = this.h;
        cy2[] cy2VarArr = ueiVar.a;
        cy2[] cy2VarArr2 = ueiVar.a;
        int i2 = 0;
        for (cy2 cy2Var : cy2VarArr) {
            cy2Var.i(i);
        }
        boolean z = this.d != mx9.b;
        try {
            int available = zefVar.available();
            int h = (available == 0 || !z) ? h(zefVar, available) : b(zefVar);
            if (available != -1 && h != available) {
                throw xei.l.h(dmi.k(h, available, "Message length inaccurate ", " != ")).a();
            }
            long j = h;
            for (cy2 cy2Var2 : cy2VarArr2) {
                cy2Var2.k(j);
            }
            long j2 = this.l;
            for (cy2 cy2Var3 : cy2VarArr2) {
                cy2Var3.l(j2);
            }
            int i3 = this.k;
            long j3 = this.l;
            cy2[] cy2VarArr3 = ueiVar.a;
            int length = cy2VarArr3.length;
            while (i2 < length) {
                long j4 = j3;
                long j5 = j;
                cy2VarArr3[i2].j(i3, j4, j5);
                i2++;
                j = j5;
                j3 = j4;
            }
        } catch (dfi e) {
            throw e;
        } catch (IOException e2) {
            throw xei.l.h("Failed to frame message").g(e2).a();
        } catch (RuntimeException e3) {
            throw xei.l.h("Failed to frame message").g(e3).a();
        }
    }

    public final void f(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            zod zodVar = this.c;
            if (zodVar != null && zodVar.b == 0) {
                this.c = null;
                this.a.a(zodVar, false, false, this.j);
                this.j = 0;
            }
            zod zodVar2 = this.c;
            if (zodVar2 == null) {
                this.g.getClass();
                zodVar2 = uic.g(i2);
                this.c = zodVar2;
            }
            int min = Math.min(i2, zodVar2.b);
            this.c.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    @Override // defpackage.kr8
    public final void flush() {
        zod zodVar = this.c;
        if (zodVar == null || zodVar.c <= 0) {
            return;
        }
        this.c = null;
        this.a.a(zodVar, false, true, this.j);
        this.j = 0;
    }

    public final int h(zef zefVar, int i) {
        if (i == -1) {
            ugc ugcVar = new ugc(this);
            int g = g(zefVar, ugcVar);
            a(ugcVar, false);
            return g;
        }
        this.l = i;
        int i2 = this.b;
        if (i2 >= 0 && i > i2) {
            xei xeiVar = xei.j;
            Locale locale = Locale.US;
            throw xeiVar.h("message too large " + i + " > " + i2).a();
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.c == null) {
            int position = byteBuffer.position() + i;
            this.g.getClass();
            this.c = uic.g(position);
        }
        f(0, byteBuffer.position(), byteBuffer.array());
        return g(zefVar, this.e);
    }

    @Override // defpackage.kr8
    public final boolean isClosed() {
        return this.i;
    }
}

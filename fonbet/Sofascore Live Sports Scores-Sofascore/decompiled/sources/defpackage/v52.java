package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v52 extends OutputStream {
    public final /* synthetic */ int a;
    public final Object b;

    public v52(FileOutputStream fileOutputStream) {
        this.a = 3;
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.a) {
            case 0:
                break;
            case 1:
            default:
                super.close();
                break;
            case 2:
                ((kof) this.b).close();
                break;
            case 3:
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
            default:
                super.flush();
                break;
            case 2:
                kof kofVar = (kof) obj;
                if (!kofVar.c) {
                    kofVar.flush();
                    break;
                }
                break;
            case 3:
                ((FileOutputStream) obj).flush();
                break;
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((x52) obj) + ".outputStream()";
            case 1:
            default:
                return super.toString();
            case 2:
                return ((kof) obj) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                bArr.getClass();
                ((x52) obj).write(bArr, i, i2);
                break;
            case 1:
                ((vgc) obj).f(i, i2, bArr);
                break;
            case 2:
                bArr.getClass();
                kof kofVar = (kof) obj;
                if (!kofVar.c) {
                    kofVar.b.write(bArr, i, i2);
                    kofVar.k();
                    break;
                } else {
                    is8.e("closed");
                    break;
                }
            default:
                bArr.getClass();
                ((FileOutputStream) obj).write(bArr, i, i2);
                break;
        }
    }

    public /* synthetic */ v52(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void h() {
    }

    private final void k() {
    }

    private final void m() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 3:
                bArr.getClass();
                ((FileOutputStream) this.b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((x52) obj).Y0(i);
                break;
            case 1:
                write(new byte[]{(byte) i}, 0, 1);
                break;
            case 2:
                kof kofVar = (kof) obj;
                if (!kofVar.c) {
                    kofVar.b.Y0((byte) i);
                    kofVar.k();
                    break;
                } else {
                    is8.e("closed");
                    break;
                }
            default:
                ((FileOutputStream) obj).write(i);
                break;
        }
    }
}

package P0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f8683a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f8684b;

    /* renamed from: c, reason: collision with root package name */
    public int f8685c;

    /* renamed from: d, reason: collision with root package name */
    public int f8686d;

    /* renamed from: e, reason: collision with root package name */
    public d f8687e = d.a();

    public int a(int i10) {
        return i10 + this.f8684b.getInt(i10);
    }

    public int b(int i10) {
        if (i10 < this.f8686d) {
            return this.f8684b.getShort(this.f8685c + i10);
        }
        return 0;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.f8684b = byteBuffer;
        if (byteBuffer == null) {
            this.f8683a = 0;
            this.f8685c = 0;
            this.f8686d = 0;
        } else {
            this.f8683a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f8685c = i11;
            this.f8686d = this.f8684b.getShort(i11);
        }
    }

    public int d(int i10) {
        int i11 = i10 + this.f8683a;
        return i11 + this.f8684b.getInt(i11) + 4;
    }

    public int e(int i10) {
        int i11 = i10 + this.f8683a;
        return this.f8684b.getInt(i11 + this.f8684b.getInt(i11));
    }
}

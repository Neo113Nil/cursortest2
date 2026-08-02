package H4;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.a;

/* loaded from: classes2.dex */
public final class b implements a.InterfaceC0467a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f4755a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f4756b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f4755a = dVar;
        this.f4756b = bVar;
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0467a
    public void a(Bitmap bitmap) {
        this.f4755a.c(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0467a
    public byte[] b(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f4756b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0467a
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f4755a.e(i10, i11, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0467a
    public int[] d(int i10) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f4756b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0467a
    public void e(byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f4756b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0467a
    public void f(int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.f4756b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}

package H4;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.l;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes2.dex */
public class a implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final C0099a f4747f = new C0099a();

    /* renamed from: g, reason: collision with root package name */
    public static final b f4748g = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4750b;

    /* renamed from: c, reason: collision with root package name */
    public final b f4751c;

    /* renamed from: d, reason: collision with root package name */
    public final C0099a f4752d;

    /* renamed from: e, reason: collision with root package name */
    public final H4.b f4753e;

    /* renamed from: H4.a$a, reason: collision with other inner class name */
    public static class C0099a {
        public com.bumptech.glide.gifdecoder.a a(a.InterfaceC0467a interfaceC0467a, com.bumptech.glide.gifdecoder.c cVar, ByteBuffer byteBuffer, int i10) {
            return new com.bumptech.glide.gifdecoder.e(interfaceC0467a, cVar, byteBuffer, i10);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue f4754a = com.bumptech.glide.util.l.g(0);

        public synchronized com.bumptech.glide.gifdecoder.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.gifdecoder.d dVar;
            try {
                dVar = (com.bumptech.glide.gifdecoder.d) this.f4754a.poll();
                if (dVar == null) {
                    dVar = new com.bumptech.glide.gifdecoder.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar.p(byteBuffer);
        }

        public synchronized void b(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.a();
            this.f4754a.offer(dVar);
        }
    }

    public a(Context context, List list, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(context, list, dVar, bVar, f4748g, f4747f);
    }

    public static int e(com.bumptech.glide.gifdecoder.c cVar, int i10, int i11) {
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            cVar.d();
            cVar.a();
        }
        return max;
    }

    public final e c(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.j jVar) {
        long b10 = com.bumptech.glide.util.g.b();
        try {
            com.bumptech.glide.gifdecoder.c c10 = dVar.c();
            if (c10.b() > 0 && c10.c() == 0) {
                Bitmap.Config config = jVar.c(i.f4794a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.gifdecoder.a a10 = this.f4752d.a(this.f4753e, c10, byteBuffer, e(c10, i10, i11));
                a10.c(config);
                a10.advance();
                Bitmap b11 = a10.b();
                if (b11 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        com.bumptech.glide.util.g.a(b10);
                    }
                    return null;
                }
                e eVar = new e(new c(this.f4749a, a10, D4.l.c(), i10, i11, b11));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    com.bumptech.glide.util.g.a(b10);
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                com.bumptech.glide.util.g.a(b10);
            }
            return null;
        } finally {
        }
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.load.j jVar) {
        com.bumptech.glide.gifdecoder.d a10 = this.f4751c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, jVar);
        } finally {
            this.f4751c.b(a10);
        }
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.j jVar) {
        return !((Boolean) jVar.c(i.f4795b)).booleanValue() && com.bumptech.glide.load.f.g(this.f4750b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public a(Context context, List list, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, b bVar2, C0099a c0099a) {
        this.f4749a = context.getApplicationContext();
        this.f4750b = list;
        this.f4752d = c0099a;
        this.f4753e = new H4.b(dVar, bVar);
        this.f4751c = bVar2;
    }
}

package g6;

import Am.C2438a;
import T5.k;
import V5.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import g6.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p6.l;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6653a implements k<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    private static final C1035a f63876f = new C1035a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f63877g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f63878a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f63879b;

    /* renamed from: c, reason: collision with root package name */
    private final b f63880c;

    /* renamed from: d, reason: collision with root package name */
    private final C1035a f63881d;

    /* renamed from: e, reason: collision with root package name */
    private final g6.b f63882e;

    /* renamed from: g6.a$a, reason: collision with other inner class name */
    static class C1035a {
    }

    /* renamed from: g6.a$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque f63883a;

        b() {
            int i11 = l.f80283d;
            this.f63883a = new ArrayDeque(0);
        }

        final synchronized R5.d a(ByteBuffer byteBuffer) {
            R5.d dVar;
            try {
                dVar = (R5.d) this.f63883a.poll();
                if (dVar == null) {
                    dVar = new R5.d();
                }
                dVar.g(byteBuffer);
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar;
        }

        final synchronized void b(R5.d dVar) {
            dVar.a();
            this.f63883a.offer(dVar);
        }
    }

    public C6653a(Context context, ArrayList arrayList, W5.d dVar, W5.b bVar) {
        C1035a c1035a = f63876f;
        this.f63878a = context.getApplicationContext();
        this.f63879b = arrayList;
        this.f63881d = c1035a;
        this.f63882e = new g6.b(bVar, dVar);
        this.f63880c = f63877g;
    }

    private e c(ByteBuffer byteBuffer, int i11, int i12, R5.d dVar, T5.i iVar) {
        StringBuilder sb2;
        int i13 = p6.g.f80269b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            R5.c c11 = dVar.c();
            if (c11.b() > 0 && c11.c() == 0) {
                Bitmap.Config config = iVar.a(i.f63921a) == T5.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int d11 = d(c11, i11, i12);
                C1035a c1035a = this.f63881d;
                g6.b bVar = this.f63882e;
                c1035a.getClass();
                R5.e eVar = new R5.e(bVar, c11, byteBuffer, d11);
                eVar.j(config);
                eVar.b();
                Bitmap a11 = eVar.a();
                if (a11 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                        sb2.append(p6.g.a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb2.toString());
                        return null;
                    }
                    return null;
                }
                e eVar2 = new e(new c(new c.a(new g(com.bumptech.glide.c.a(this.f63878a), eVar, i11, i12, b6.j.a(), a11))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p6.g.a(elapsedRealtimeNanos));
                }
                return eVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(p6.g.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p6.g.a(elapsedRealtimeNanos));
            }
            throw th2;
        }
    }

    private static int d(R5.c cVar, int i11, int i12) {
        int min = Math.min(cVar.a() / i12, cVar.d() / i11);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder a11 = C2438a.a("Downsampling GIF, sampleSize: ", max, ", target dimens: [", "x", i11);
            a11.append(i12);
            a11.append("], actual dimens: [");
            a11.append(cVar.d());
            a11.append("x");
            a11.append(cVar.a());
            a11.append("]");
            Log.v("BufferGifDecoder", a11.toString());
        }
        return max;
    }

    @Override // T5.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull T5.i iVar) throws IOException {
        return !((Boolean) iVar.a(i.f63922b)).booleanValue() && com.bumptech.glide.load.c.e(this.f63879b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // T5.k
    public final v<c> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f63880c;
        R5.d a11 = bVar.a(byteBuffer2);
        try {
            return c(byteBuffer2, i11, i12, a11, iVar);
        } finally {
            bVar.b(a11);
        }
    }
}

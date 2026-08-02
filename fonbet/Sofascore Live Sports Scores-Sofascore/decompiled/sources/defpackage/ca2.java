package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ca2 implements j1g {
    public static final ba2 e = new ba2(0);
    public final Context a;
    public final ArrayList b;
    public final ba2 c = e;
    public final fp4 d;

    public ca2(Context context, ArrayList arrayList, dx1 dx1Var, kn4 kn4Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = new fp4(26, dx1Var, kn4Var);
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        return !((Boolean) uvdVar.c(gy8.b)).booleanValue() && ktm.A(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        fy8 fy8Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ba2 ba2Var = this.c;
        synchronized (ba2Var) {
            try {
                fy8 fy8Var2 = (fy8) ba2Var.a.poll();
                if (fy8Var2 == null) {
                    fy8Var2 = new fy8();
                }
                fy8Var = fy8Var2;
                fy8Var.b = null;
                Arrays.fill(fy8Var.a, (byte) 0);
                fy8Var.c = new ey8();
                fy8Var.d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                fy8Var.b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                fy8Var.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, fy8Var, uvdVar);
        } finally {
            this.c.a(fy8Var);
        }
    }

    public final yx8 c(ByteBuffer byteBuffer, int i, int i2, fy8 fy8Var, uvd uvdVar) {
        int i3 = vib.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            ey8 b = fy8Var.b();
            if (b.c > 0 && b.b == 0) {
                Bitmap.Config config = uvdVar.c(gy8.a) == rl4.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(b.g / i2, b.f / i);
                k9i k9iVar = new k9i(this.d, b, byteBuffer, Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min)));
                k9iVar.c(config);
                k9iVar.k = (k9iVar.k + 1) % k9iVar.l.c;
                Bitmap b2 = k9iVar.b();
                if (b2 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                        return null;
                    }
                    return null;
                }
                yx8 yx8Var = new yx8(new xx8(new i70(new dy8(a.a(this.a), k9iVar, i, i2, b2), 2)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return yx8Var;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}

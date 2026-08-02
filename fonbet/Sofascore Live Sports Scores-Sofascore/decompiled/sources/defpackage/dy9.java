package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.v0;
import com.moloco.sdk.publisher.AdFormatType;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class dy9 implements v0 {
    public long a;
    public long b;
    public final Object c;

    public dy9() {
        this.c = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));
        this.a = 0L;
        this.b = 1000000L;
        this.b = Runtime.getRuntime().maxMemory() / 4;
    }

    public long a() {
        long j = this.a;
        long h = xd5.h(j, this.b);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdCreateLoadTimeoutManager", ((AdFormatType) this.c) + " timeout: " + ((Object) xd5.l(j)) + ", create ad duration: " + ((Object) xd5.l(this.b)) + ". Return value: " + ((Object) xd5.l(h)), false, 4, null);
        return h;
    }

    public void b() {
        long height;
        Map map = (Map) this.c;
        map.size();
        if (this.a > this.b) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                long j = this.a;
                Bitmap bitmap = ((BitmapDrawable) entry.getValue()).getBitmap();
                if (bitmap == null) {
                    height = 0;
                } else {
                    height = bitmap.getHeight() * bitmap.getRowBytes();
                }
                this.a = j - height;
                it.remove();
                if (this.a <= this.b) {
                    break;
                }
            }
            map.size();
        }
    }

    public synchronized Object c(Object obj) {
        ymb ymbVar;
        ymbVar = (ymb) ((LinkedHashMap) this.c).get(obj);
        return ymbVar != null ? ymbVar.a : null;
    }

    public int d(Object obj) {
        return 1;
    }

    public synchronized Object f(Object obj, Object obj2) {
        int d = d(obj2);
        long j = d;
        if (j >= this.a) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        ymb ymbVar = (ymb) ((LinkedHashMap) this.c).put(obj, obj2 == null ? null : new ymb(obj2, d));
        if (ymbVar != null) {
            this.b -= ymbVar.b;
            if (!ymbVar.a.equals(obj2)) {
                e(obj, ymbVar.a);
            }
        }
        h(this.a);
        return ymbVar != null ? ymbVar.a : null;
    }

    public void g(Drawable drawable, String str) {
        long height;
        Map map = (Map) this.c;
        try {
            long j = 0;
            if (map.containsKey(str)) {
                long j2 = this.a;
                Bitmap bitmap = ((BitmapDrawable) map.get(str)).getBitmap();
                if (bitmap == null) {
                    height = 0;
                } else {
                    height = bitmap.getHeight() * bitmap.getRowBytes();
                }
                this.a = j2 - height;
            }
            map.put(str, drawable);
            long j3 = this.a;
            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap2 != null) {
                j = bitmap2.getHeight() * bitmap2.getRowBytes();
            }
            this.a = j3 + j;
            b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public synchronized void h(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            ymb ymbVar = (ymb) entry.getValue();
            this.b -= ymbVar.b;
            Object key = entry.getKey();
            it.remove();
            e(key, ymbVar.a);
        }
    }

    public dy9(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public dy9(long j, long j2, TimeUnit timeUnit) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
    }

    public void e(Object obj, Object obj2) {
    }

    public dy9(AdFormatType adFormatType, long j) {
        adFormatType.getClass();
        this.c = adFormatType;
        this.a = j;
        xd5.b.getClass();
        this.b = 0L;
    }

    @Override // com.moloco.sdk.internal.publisher.v0
    public void a(long j, long j2) {
        this.b = wkn.S(j2 - j, be5.MILLISECONDS);
    }
}

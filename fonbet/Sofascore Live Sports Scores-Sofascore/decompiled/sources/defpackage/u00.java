package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.media3.common.b;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u00 implements zzg {
    public final Context a;

    public u00(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(b bVar) {
        String str = bVar.o;
        if (str == null || !sjc.m(str)) {
            return n51.a(0, 0, 0, 0);
        }
        String str2 = bVar.o;
        String str3 = nik.a;
        str2.getClass();
        switch (str2) {
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return n51.a(4, 0, 0, 0);
        }
        return n51.a(1, 0, 0, 0);
    }

    public Typeface a(p1g p1gVar) {
        if (!(p1gVar instanceof p1g)) {
            return null;
        }
        int i = p1gVar.a;
        Context context = this.a;
        Typeface a = z1g.a(i, context);
        a.getClass();
        ug8 ug8Var = p1gVar.c;
        ThreadLocal threadLocal = y5k.a;
        if (a == null) {
            return null;
        }
        if (ug8Var.a.isEmpty()) {
            return a;
        }
        ThreadLocal threadLocal2 = y5k.a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(a);
        paint.setFontVariationSettings(qz.C(ug8Var, context));
        return paint.getTypeface();
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public Object zza() {
        v3p N;
        N = f5p.N(this.a, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        return N;
    }

    public /* synthetic */ u00(Context context, byte b) {
        this.a = context;
    }
}

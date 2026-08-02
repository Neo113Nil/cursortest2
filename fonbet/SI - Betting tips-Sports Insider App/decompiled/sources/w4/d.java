package w4;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import c4.k;
import c4.p;
import com.appsflyer.internal.h;
import d4.l;
import d4.r;
import d4.s;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import okio.FileSystem;
import q4.j;
import q4.n;
import r4.g;
import r4.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final r f24966a;

    /* renamed from: b, reason: collision with root package name */
    public final n f24967b;

    public d(r rVar, n nVar) {
        this.f24966a = rVar;
        this.f24967b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ba A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x001e, B:12:0x0033, B:14:0x0039, B:16:0x003f, B:17:0x0045, B:19:0x004b, B:21:0x0051, B:26:0x0085, B:31:0x00b0, B:32:0x00c3, B:35:0x010c, B:37:0x0116, B:39:0x0124, B:41:0x013c, B:45:0x01ba, B:48:0x01c3, B:52:0x01d7, B:67:0x0209, B:68:0x0223, B:73:0x015f, B:75:0x0163, B:77:0x0167, B:78:0x0192, B:80:0x01af, B:81:0x00d8, B:83:0x00ea, B:85:0x00f2, B:87:0x00f8, B:88:0x00fc, B:90:0x00c1, B:93:0x005a, B:95:0x0060, B:97:0x0066, B:98:0x006c, B:100:0x0072, B:102:0x0078), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0209 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x000b, B:5:0x0018, B:7:0x001e, B:12:0x0033, B:14:0x0039, B:16:0x003f, B:17:0x0045, B:19:0x004b, B:21:0x0051, B:26:0x0085, B:31:0x00b0, B:32:0x00c3, B:35:0x010c, B:37:0x0116, B:39:0x0124, B:41:0x013c, B:45:0x01ba, B:48:0x01c3, B:52:0x01d7, B:67:0x0209, B:68:0x0223, B:73:0x015f, B:75:0x0163, B:77:0x0167, B:78:0x0192, B:80:0x01af, B:81:0x00d8, B:83:0x00ea, B:85:0x00f2, B:87:0x00f8, B:88:0x00fc, B:90:0x00c1, B:93:0x005a, B:95:0x0060, B:97:0x0066, B:98:0x006c, B:100:0x0072, B:102:0x0078), top: B:2:0x000b }] */
    @Override // d4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        int intValue;
        Integer intOrNull;
        int intValue2;
        Integer intOrNull2;
        i iVar;
        int i5;
        Long Y;
        i iVar2;
        long j;
        Bitmap c2;
        int width;
        Bitmap d10;
        int i10;
        Integer intOrNull3;
        Integer intOrNull4;
        Integer intOrNull5;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            c(mediaMetadataRetriever, this.f24966a);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int intValue3 = (extractMetadata == null || (intOrNull5 = StringsKt.toIntOrNull(extractMetadata)) == null) ? 0 : intOrNull5.intValue();
            if (intValue3 == 90 || intValue3 == 270) {
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                intValue = (extractMetadata2 == null || (intOrNull2 = StringsKt.toIntOrNull(extractMetadata2)) == null) ? 0 : intOrNull2.intValue();
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                if (extractMetadata3 != null && (intOrNull = StringsKt.toIntOrNull(extractMetadata3)) != null) {
                    intValue2 = intOrNull.intValue();
                }
                intValue2 = 0;
            } else {
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                intValue = (extractMetadata4 == null || (intOrNull4 = StringsKt.toIntOrNull(extractMetadata4)) == null) ? 0 : intOrNull4.intValue();
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata5 != null && (intOrNull3 = StringsKt.toIntOrNull(extractMetadata5)) != null) {
                    intValue2 = intOrNull3.intValue();
                }
                intValue2 = 0;
            }
            int i11 = intValue;
            int i12 = intValue2;
            n nVar = this.f24967b;
            if (i11 <= 0 || i12 <= 0) {
                iVar = i.f22306c;
            } else {
                i iVar3 = nVar.f22008b;
                g gVar = nVar.f22009c;
                long j6 = y4.a.j(i11, i12, iVar3, gVar, (i) p.f(nVar, q4.i.f21996b));
                double k6 = y4.a.k(i11, i12, (int) (j6 >> 32), (int) (j6 & 4294967295L), gVar);
                if (nVar.f22010d == r4.d.f22294b && k6 > 1.0d) {
                    k6 = 1.0d;
                }
                iVar = ci.c.c(wf.b.a(i11 * k6), wf.b.a(k6 * i12));
            }
            long longValue = ((Number) p.f(nVar, a.f24959b)).longValue();
            long j10 = 0;
            if (longValue >= 0) {
                i5 = i11;
            } else {
                double doubleValue = ((Number) p.f(nVar, a.f24960c)).doubleValue();
                if (doubleValue >= 0.0d) {
                    String extractMetadata6 = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata6 != null && (Y = StringsKt.Y(extractMetadata6)) != null) {
                        j10 = Y.longValue();
                    }
                    i5 = i11;
                    longValue = wf.b.c(doubleValue * j10) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                } else {
                    i5 = i11;
                    longValue = 0;
                }
            }
            r4.c cVar = iVar.f22307a;
            r4.c cVar2 = iVar.f22308b;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 28) {
                k kVar = a.f24958a;
                if (((Number) p.f(nVar, kVar)).intValue() >= 0) {
                    c2 = aa.b.b(mediaMetadataRetriever, ((Number) p.f(nVar, kVar)).intValue(), (Bitmap.Config) p.f(nVar, j.f22000b));
                    if (c2 != null) {
                        width = c2.getWidth();
                        i12 = c2.getHeight();
                        iVar2 = iVar;
                        j = longValue;
                        int i14 = width;
                        d10 = c2;
                        i10 = i14;
                        if (d10 == null) {
                            throw new IllegalStateException(("Failed to decode frame at " + j + " microseconds.").toString());
                        }
                        Bitmap b10 = b(d10, iVar2);
                        boolean z5 = true;
                        if (i10 > 0 && i12 > 0 && y4.a.k(i10, i12, b10.getWidth(), b10.getHeight(), nVar.f22009c) >= 1.0d) {
                            z5 = false;
                        }
                        d4.i iVar4 = new d4.i(p.c(new BitmapDrawable(nVar.f22007a.getResources(), b10)), z5);
                        if (i13 < 29) {
                            mediaMetadataRetriever.release();
                            return iVar4;
                        }
                        if (mediaMetadataRetriever instanceof AutoCloseable) {
                            mediaMetadataRetriever.close();
                            return iVar4;
                        }
                        if (mediaMetadataRetriever instanceof ExecutorService) {
                            h.h((ExecutorService) mediaMetadataRetriever);
                            return iVar4;
                        }
                        mediaMetadataRetriever.release();
                        return iVar4;
                    }
                    iVar2 = iVar;
                    j = longValue;
                    i10 = i5;
                    d10 = null;
                    if (d10 == null) {
                    }
                }
            }
            k kVar2 = a.f24961d;
            if (i13 >= 27 && (cVar instanceof r4.a) && (cVar2 instanceof r4.a)) {
                i iVar5 = iVar;
                j = longValue;
                d10 = aa.b.d(mediaMetadataRetriever, j, ((Number) p.f(nVar, kVar2)).intValue(), ((r4.a) cVar).f22291a, ((r4.a) cVar2).f22291a, (Bitmap.Config) p.f(nVar, j.f22000b));
                iVar2 = iVar5;
                i10 = i5;
                if (d10 == null) {
                }
            } else {
                iVar2 = iVar;
                j = longValue;
                c2 = aa.b.c(mediaMetadataRetriever, j, ((Number) p.f(nVar, kVar2)).intValue(), (Bitmap.Config) p.f(nVar, j.f22000b));
                if (c2 != null) {
                    width = c2.getWidth();
                    i12 = c2.getHeight();
                    int i142 = width;
                    d10 = c2;
                    i10 = i142;
                    if (d10 == null) {
                    }
                }
                i10 = i5;
                d10 = null;
                if (d10 == null) {
                }
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                h.h((ExecutorService) mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        if ((r0 instanceof r4.a) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        r0 = ((r4.a) r0).f22291a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        r11 = (float) y4.a.k(r4, r5, r11, r0, r2.f22009c);
        r0 = wf.b.b(r10.getWidth() * r11);
        r4 = wf.b.b(r10.getHeight() * r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (r1 < 26) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        r1 = (android.graphics.Bitmap.Config) c4.p.f(r2, q4.j.f22000b);
        r3 = android.graphics.Bitmap.Config.HARDWARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (r1 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        r2 = new android.graphics.Paint(3);
        r0 = android.graphics.Bitmap.createBitmap(r0, r4, r1);
        r1 = new android.graphics.Canvas(r0);
        r1.scale(r11, r11);
        r1.drawBitmap(r10, 0.0f, 0.0f, r2);
        r10.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        r1 = (android.graphics.Bitmap.Config) c4.p.f(r2, q4.j.f22000b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r0 = r10.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r11 = r10.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (y4.a.k(r10.getWidth(), r10.getHeight(), r11 instanceof r4.a ? ((r4.a) r11).f22291a : r10.getWidth(), r0 instanceof r4.a ? ((r4.a) r0).f22291a : r10.getHeight(), r2.f22009c) == 1.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (q4.j.a(r2) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        r4 = r10.getWidth();
        r5 = r10.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        if ((r11 instanceof r4.a) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        r11 = ((r4.a) r11).f22291a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(Bitmap bitmap, i iVar) {
        Bitmap.Config config;
        r4.c cVar = iVar.f22308b;
        r4.c cVar2 = iVar.f22307a;
        int i5 = Build.VERSION.SDK_INT;
        n nVar = this.f24967b;
        if (i5 >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
            }
        }
        if (nVar.f22010d != r4.d.f22294b) {
        }
        return bitmap;
    }

    public final void c(MediaMetadataRetriever mediaMetadataRetriever, r rVar) {
        a.a A = rVar.A();
        if (A instanceof c) {
            mediaMetadataRetriever.setDataSource(((c) A).f24965e);
            return;
        }
        boolean z5 = A instanceof d4.a;
        n nVar = this.f24967b;
        if (!z5) {
            if (A instanceof d4.g) {
                mediaMetadataRetriever.setDataSource(nVar.f22007a, Uri.parse(((d4.g) A).f8126e.f3569a));
                return;
            }
            if (!(A instanceof s)) {
                if (rVar.getFileSystem() == FileSystem.SYSTEM) {
                    mediaMetadataRetriever.setDataSource(rVar.P().toFile().getPath());
                    return;
                } else {
                    mediaMetadataRetriever.setDataSource(new x4.a(rVar.getFileSystem().openReadOnly(rVar.P())));
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("android.resource://");
            s sVar = (s) A;
            sb2.append(sVar.f8149e);
            sb2.append('/');
            sb2.append(sVar.f8150f);
            mediaMetadataRetriever.setDataSource(sb2.toString());
            return;
        }
        AssetFileDescriptor openFd = nVar.f22007a.getAssets().openFd(((d4.a) A).f8111e);
        try {
            mediaMetadataRetriever.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            Unit unit = Unit.f19194a;
            openFd.close();
        } finally {
        }
    }
}

package com.logrocket.core.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ba.d f6477a = new ba.d("bitmap-tracker");

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6478b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6479c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashMap f6480d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f6481e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f6482f = 1;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0100 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Bitmap bitmap, boolean z5) {
        int i5;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i10 = this.f6482f;
        HashMap hashMap = this.f6479c;
        ba.d dVar = this.f6477a;
        if (!z5 && Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = bitmap.getConfig();
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                dVar.a("Skipping hardware bitmap");
                i5 = 0;
                if (i5 != 0) {
                    return i5;
                }
                Integer valueOf = Integer.valueOf(i5);
                HashMap hashMap2 = this.f6478b;
                a aVar = (a) hashMap2.get(valueOf);
                if (aVar != null) {
                    return aVar.f6475a;
                }
                int i11 = this.f6482f;
                this.f6482f = i11 + 1;
                a aVar2 = new a(i11);
                if (!this.f6480d.containsKey(Integer.valueOf(i11))) {
                    this.f6480d.put(Integer.valueOf(i11), bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap.copy(Bitmap.Config.ARGB_8888, false) : bitmap.copy(bitmap.getConfig(), false));
                }
                hashMap2.put(Integer.valueOf(i5), aVar2);
                return i11;
            }
        }
        dVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        dVar.a(((Object) "hashBitmap") + " start");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        i5 = 1;
        if (z5) {
            try {
            } catch (Throwable th2) {
                th = th2;
                i5 = 0;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Bitmap.Config config4 = bitmap.getConfig();
                config = Bitmap.Config.HARDWARE;
                if (config4 == config) {
                    Integer num = (Integer) hashMap.get(Integer.valueOf(bitmap.hashCode()));
                    if (num == null) {
                        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        copy.getPixels(iArr, 0, width, 0, 0, width, height);
                        for (int i13 = 0; i13 < i12; i13 += 2) {
                            i5 = (i5 * 31) + iArr[i13];
                        }
                        try {
                            hashMap.put(Integer.valueOf(bitmap.hashCode()), Integer.valueOf(i5));
                            this.f6480d.put(Integer.valueOf(i10), copy);
                        } catch (Throwable th3) {
                            th = th3;
                            dVar.e("Failed to hash bitmap", th);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            StringBuilder sb2 = new StringBuilder(((Object) "hashBitmap") + " finish (");
                            sb2.append(currentTimeMillis2);
                            sb2.append("ms)");
                            dVar.a(sb2);
                            if (i5 != 0) {
                            }
                        }
                    } else {
                        i5 = num.intValue();
                    }
                    long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb22 = new StringBuilder(((Object) "hashBitmap") + " finish (");
                    sb22.append(currentTimeMillis22);
                    sb22.append("ms)");
                    dVar.a(sb22);
                    if (i5 != 0) {
                    }
                }
            }
        }
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i14 = 0; i14 < i12; i14 += 2) {
            i5 = (i5 * 31) + iArr[i14];
        }
        long currentTimeMillis222 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb222 = new StringBuilder(((Object) "hashBitmap") + " finish (");
        sb222.append(currentTimeMillis222);
        sb222.append("ms)");
        dVar.a(sb222);
        if (i5 != 0) {
        }
    }
}

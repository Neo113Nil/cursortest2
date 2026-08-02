package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import com.sofascore.results.dialog.view.SofascoreRatingScaleView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pic implements tti {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String c(r38 r38Var) {
        r38Var.a();
        s48 s48Var = r38Var.c;
        String str = s48Var.e;
        if (str != null) {
            return str;
        }
        r38Var.a();
        String str2 = s48Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        ((Function1) this.e).invoke(oyn.P(rfo.O(nr9Var), this.b));
        ((SofascoreRatingScaleView) this.d).invalidate();
    }

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            mh0.h(jArr, jArr2, 0, 0, jArr.length);
            mh0.j(0, 0, (int[]) this.d, iArr, 14);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            mh0.j(0, 0, (int[]) this.e, iArr2, 14);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.b;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (Intrinsics.e(jArr3[i8], j) <= 0) {
                break;
            }
            g(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public synchronized String b() {
        try {
            if (((String) this.d) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized int d() {
        PackageInfo packageInfo;
        try {
            if (this.a == 0) {
                try {
                    packageInfo = ((Context) this.c).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    e.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.a = packageInfo.versionCode;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }

    public boolean e() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        this.b = 2;
                    } else {
                        this.b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void f() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.c).getPackageManager().getPackageInfo(((Context) this.c).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.d = Integer.toString(packageInfo.versionCode);
            this.e = packageInfo.versionName;
        }
    }

    public void g(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        Bitmap O;
        ((Function1) this.c).invoke((nr9Var == null || (O = rfo.O(nr9Var)) == null) ? null : oyn.P(O, this.a));
        ((SofascoreRatingScaleView) this.d).invalidate();
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
    }
}

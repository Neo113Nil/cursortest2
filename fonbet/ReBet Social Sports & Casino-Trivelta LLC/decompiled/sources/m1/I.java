package m1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2339H;
import e1.AbstractC4134a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class I extends AbstractC2339H {

    /* renamed from: j, reason: collision with root package name */
    public final int f56098j;

    /* renamed from: k, reason: collision with root package name */
    public final String f56099k;

    /* renamed from: l, reason: collision with root package name */
    public final int f56100l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.media3.common.a f56101m;

    /* renamed from: n, reason: collision with root package name */
    public final int f56102n;

    /* renamed from: o, reason: collision with root package name */
    public final D.b f56103o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f56104p;

    public I(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, null, false);
    }

    public static I d(Throwable th2, String str, int i10, androidx.media3.common.a aVar, int i11, D.b bVar, boolean z10, int i12) {
        if (aVar == null) {
            i11 = 4;
        }
        return new I(1, th2, null, i12, str, i10, aVar, i11, bVar, z10);
    }

    public static I e(IOException iOException, int i10) {
        return new I(0, iOException, i10);
    }

    public static I f(RuntimeException runtimeException, int i10) {
        return new I(2, runtimeException, i10);
    }

    public static String g(int i10, String str, String str2, int i11, androidx.media3.common.a aVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + aVar + ", format_supported=" + e1.Z.h0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public I c(D.b bVar) {
        return new I((String) e1.Z.i(getMessage()), getCause(), this.f24309a, this.f56098j, this.f56099k, this.f56100l, this.f56101m, this.f56102n, bVar, this.f24310b, this.f56104p);
    }

    public I(int i10, Throwable th2, String str, int i11, String str2, int i12, androidx.media3.common.a aVar, int i13, D.b bVar, boolean z10) {
        this(g(i10, str, str2, i12, aVar, i13), th2, i11, i10, str2, i12, aVar, i13, bVar, SystemClock.elapsedRealtime(), z10);
    }

    public I(String str, Throwable th2, int i10, int i11, String str2, int i12, androidx.media3.common.a aVar, int i13, D.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        AbstractC4134a.a(!z10 || i11 == 1);
        AbstractC4134a.a(th2 != null || i11 == 3);
        this.f56098j = i11;
        this.f56099k = str2;
        this.f56100l = i12;
        this.f56101m = aVar;
        this.f56102n = i13;
        this.f56103o = bVar;
        this.f56104p = z10;
    }
}

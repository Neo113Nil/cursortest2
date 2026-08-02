package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sf6 extends Exception implements i72 {
    public final int a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final sm8 f;
    public final int g;
    public final z6c h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sf6(int i, Throwable th, int i2, String str, int i3, sm8 sm8Var, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r1 : r1.concat(": null"), th, i2, i, r5, r6, r7, i4, null, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        sm8 sm8Var2;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            sm8Var2 = sm8Var;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            sm8Var2 = sm8Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sm8Var2 = sm8Var;
            sb.append(sm8Var2);
            sb.append(", format_supported=");
            int i6 = lik.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    zzl.s();
                    throw null;
                }
                str4 = "YES";
            }
            sb.append(str4);
            str3 = sb.toString();
        }
    }

    public final sf6 a(z6c z6cVar) {
        String message = getMessage();
        int i = lik.a;
        return new sf6(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, z6cVar, this.b, this.i);
    }

    public sf6(String str, Throwable th, int i, int i2, String str2, int i3, sm8 sm8Var, int i4, z6c z6cVar, long j, boolean z) {
        super(str, th);
        this.a = i;
        this.b = j;
        qx9.r(!z || i2 == 1);
        qx9.r(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = sm8Var;
        this.g = i4;
        this.h = z6cVar;
        this.i = z;
    }

    public sf6(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }
}

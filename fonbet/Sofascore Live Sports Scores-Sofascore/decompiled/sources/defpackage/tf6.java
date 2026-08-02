package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tf6 extends dke {
    public final int c;
    public final String d;
    public final int e;
    public final b f;
    public final int g;
    public final scc h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tf6(int i, Exception exc, int i2, String str, int i3, b bVar, int i4, scc sccVar, boolean z) {
        this(TextUtils.isEmpty(null) ? r1 : r1.concat(": null"), exc, i2, i, r5, r6, r7, i4, sccVar, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        b bVar2;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            bVar2 = bVar;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            bVar2 = bVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            bVar2 = bVar;
            sb.append(bVar2);
            sb.append(", format_supported=");
            String str5 = nik.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
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

    public final tf6 e(scc sccVar) {
        String message = getMessage();
        String str = nik.a;
        return new tf6(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, sccVar, this.b, this.i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf6(String str, Throwable th, int i, int i2, String str2, int i3, b bVar, int i4, scc sccVar, long j, boolean z) {
        super(i, j, str, th);
        Bundle bundle = Bundle.EMPTY;
        z1a.s(!z || i2 == 1);
        z1a.s(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = bVar;
        this.g = i4;
        this.h = sccVar;
        this.i = z;
    }

    public tf6(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}

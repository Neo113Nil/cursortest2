package defpackage;

import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cf2 {
    public final qzf a;
    public final bf2 b;
    public final Date c;
    public final String d;
    public final Date e;
    public final String f;
    public final Date g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;

    public cf2(qzf qzfVar, bf2 bf2Var) {
        int i;
        this.a = qzfVar;
        this.b = bf2Var;
        this.k = -1;
        if (bf2Var != null) {
            this.h = bf2Var.c;
            this.i = bf2Var.d;
            q89 q89Var = bf2Var.f;
            int size = q89Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                String j = vha.j(q89Var, i2);
                if (j.equalsIgnoreCase("Date")) {
                    String a = q89Var.a("Date");
                    this.c = a != null ? pg4.a(a) : null;
                    this.d = vha.l(q89Var, i2);
                } else if (j.equalsIgnoreCase("Expires")) {
                    String a2 = q89Var.a("Expires");
                    this.g = a2 != null ? pg4.a(a2) : null;
                } else if (j.equalsIgnoreCase("Last-Modified")) {
                    String a3 = q89Var.a("Last-Modified");
                    this.e = a3 != null ? pg4.a(a3) : null;
                    this.f = vha.l(q89Var, i2);
                } else if (j.equalsIgnoreCase(Command.HTTP_HEADER_ETAG)) {
                    this.j = vha.l(q89Var, i2);
                } else if (j.equalsIgnoreCase("Age")) {
                    String l = vha.l(q89Var, i2);
                    Bitmap.Config[] configArr = l.a;
                    Long k0 = StringsKt.k0(l);
                    if (k0 != null) {
                        long longValue = k0.longValue();
                        i = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                    } else {
                        i = -1;
                    }
                    this.k = i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cd, code lost:
    
        if (r4 > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gf2 a() {
        bf2 bf2Var;
        long j;
        String sb;
        long j2;
        Date date;
        long j3;
        int i;
        qzf qzfVar = this.a;
        jl9 jl9Var = qzfVar.a;
        bf2 bf2Var2 = this.b;
        if (bf2Var2 == null) {
            return new gf2(qzfVar, null);
        }
        joa joaVar = bf2Var2.a;
        if (jl9Var.f() && !bf2Var2.e) {
            return new gf2(qzfVar, null);
        }
        je2 je2Var = (je2) joaVar.getValue();
        if (qzfVar.a().b || ((je2) joaVar.getValue()).b || Intrinsics.c(bf2Var2.f.a("Vary"), "*")) {
            return new gf2(qzfVar, null);
        }
        je2 a = qzfVar.a();
        if (!a.a) {
            q89 q89Var = qzfVar.c;
            String str = "If-Modified-Since";
            if (q89Var.a("If-Modified-Since") == null && q89Var.a("If-None-Match") == null) {
                long j4 = this.i;
                Date date2 = this.c;
                if (date2 != null) {
                    bf2Var = bf2Var2;
                    j = Math.max(0L, j4 - date2.getTime());
                } else {
                    bf2Var = bf2Var2;
                    j = 0;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i2 = this.k;
                if (i2 != -1) {
                    j = Math.max(j, timeUnit.toMillis(i2));
                }
                long j5 = this.h;
                long longValue = j + (j4 - j5) + (((Number) zgj.a.invoke()).longValue() - j4);
                int i3 = ((je2) joaVar.getValue()).c;
                Date date3 = this.e;
                if (i3 != -1) {
                    j2 = timeUnit.toMillis(i3);
                } else {
                    Date date4 = this.g;
                    if (date4 != null) {
                        if (date2 != null) {
                            j4 = date2.getTime();
                        }
                        j2 = date4.getTime() - j4;
                    } else {
                        if (date3 != null) {
                            List list = jl9Var.g;
                            if (list == null) {
                                sb = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                l98.k0(list, sb2);
                                sb = sb2.toString();
                            }
                            if (sb == null) {
                                if (date2 != null) {
                                    j5 = date2.getTime();
                                }
                                long time = j5 - date3.getTime();
                                if (time > 0) {
                                    j2 = time / 10;
                                }
                            }
                        }
                        j2 = 0;
                    }
                }
                int i4 = a.c;
                if (i4 != -1) {
                    j2 = Math.min(j2, timeUnit.toMillis(i4));
                }
                int i5 = a.i;
                long millis = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
                if (je2Var.g || (i = a.h) == -1) {
                    date = date3;
                    j3 = 0;
                } else {
                    date = date3;
                    j3 = timeUnit.toMillis(i);
                }
                if (!je2Var.a && longValue + millis < j2 + j3) {
                    return new gf2(null, bf2Var);
                }
                bf2 bf2Var3 = bf2Var;
                String str2 = this.j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date != null) {
                    str2 = this.f;
                    str2.getClass();
                } else {
                    if (date2 == null) {
                        return new gf2(qzfVar, null);
                    }
                    str2 = this.d;
                    str2.getClass();
                }
                pzf b = qzfVar.b();
                b.a(str, str2);
                return new gf2(new qzf(b), bf2Var3);
            }
        }
        return new gf2(qzfVar, null);
    }
}

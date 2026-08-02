package defpackage;

import android.media.MediaRoute2Info;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class i3c implements p3c, q3c, h72, kwj, uq9, vq9, ql6, yu4, bij {
    public final /* synthetic */ int a;

    public /* synthetic */ i3c(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager f(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ void h(int i, Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + i + obj + obj2).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new IOException(str + obj, th);
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // defpackage.p3c, defpackage.q3c
    public int a(Object obj) {
        switch (this.a) {
            case 0:
                return ((z2c) obj).a.startsWith("OMX.google") ? 1 : 0;
            default:
                String str = ((a3c) obj).a;
                return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
        }
    }

    @Override // defpackage.kwj
    public Object apply(Object obj) {
        fic ficVar = (fic) obj;
        ficVar.getClass();
        k1d k1dVar = wef.a;
        k1dVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            k1dVar.r(ficVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.ql6
    public ll6[] createExtractors() {
        switch (this.a) {
            case 14:
                return new ll6[]{new gxc(xli.A7, 16)};
            default:
                return new ll6[]{new tnd()};
        }
    }

    @Override // defpackage.bij
    public void e(String str, Object[] objArr) {
        String format = DateTimeFormatter.ISO_TIME.format(LocalDateTime.now());
        PrintStream printStream = System.out;
        StringBuilder q = wt3.q(U3.j.d, format, "] connect trace: ");
        q.append(String.format(str, objArr));
        printStream.println(q.toString());
    }

    @Override // defpackage.uq9, defpackage.vq9
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 12:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
            default:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        int i = 12;
        boolean z = true;
        boolean z2 = false;
        switch (this.a) {
            case 2:
                String string = bundle.getString(Integer.toString(0, 36), "");
                string.getClass();
                Bundle bundle4 = bundle.getBundle(Integer.toString(1, 36));
                t5c t5cVar = bundle4 == null ? t5c.f : new t5c(bundle4.getLong(Integer.toString(0, 36), C.TIME_UNSET), bundle4.getLong(Integer.toString(1, 36), C.TIME_UNSET), bundle4.getLong(Integer.toString(2, 36), C.TIME_UNSET), bundle4.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle4.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                Bundle bundle5 = bundle.getBundle(Integer.toString(2, 36));
                p6c p6cVar = bundle5 == null ? p6c.G : (p6c) p6c.H.g(bundle5);
                Bundle bundle6 = bundle.getBundle(Integer.toString(3, 36));
                l5c l5cVar = bundle6 == null ? l5c.g : (l5c) j5c.f.g(bundle6);
                Bundle bundle7 = bundle.getBundle(Integer.toString(4, 36));
                return new f6c(string, l5cVar, null, t5cVar, p6cVar, bundle7 == null ? y5c.c : (y5c) y5c.d.g(bundle7));
            case 3:
                i5c i5cVar = new i5c();
                long j = bundle.getLong(Integer.toString(0, 36), 0L);
                qx9.r(j >= 0);
                i5cVar.a = j;
                long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z = false;
                }
                qx9.r(z);
                i5cVar.b = j2;
                i5cVar.c = bundle.getBoolean(Integer.toString(2, 36), false);
                i5cVar.d = bundle.getBoolean(Integer.toString(3, 36), false);
                i5cVar.e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new l5c(i5cVar);
            case 4:
                return new t5c(bundle.getLong(Integer.toString(0, 36), C.TIME_UNSET), bundle.getLong(Integer.toString(1, 36), C.TIME_UNSET), bundle.getLong(Integer.toString(2, 36), C.TIME_UNSET), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            case 5:
                ejg ejgVar = new ejg(i, z2);
                ejgVar.c = (Uri) bundle.getParcelable(Integer.toString(0, 36));
                ejgVar.b = bundle.getString(Integer.toString(1, 36));
                ejgVar.d = bundle.getBundle(Integer.toString(2, 36));
                return new y5c(ejgVar);
            default:
                pvd pvdVar = wnn.e;
                n6c n6cVar = new n6c();
                n6cVar.a = bundle.getCharSequence(Integer.toString(0, 36));
                n6cVar.b = bundle.getCharSequence(Integer.toString(1, 36));
                n6cVar.c = bundle.getCharSequence(Integer.toString(2, 36));
                n6cVar.d = bundle.getCharSequence(Integer.toString(3, 36));
                n6cVar.e = bundle.getCharSequence(Integer.toString(4, 36));
                n6cVar.f = bundle.getCharSequence(Integer.toString(5, 36));
                n6cVar.g = bundle.getCharSequence(Integer.toString(6, 36));
                byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
                Integer valueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
                n6cVar.j = byteArray != null ? (byte[]) byteArray.clone() : null;
                n6cVar.k = valueOf;
                n6cVar.l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                n6cVar.w = bundle.getCharSequence(Integer.toString(22, 36));
                n6cVar.x = bundle.getCharSequence(Integer.toString(23, 36));
                n6cVar.y = bundle.getCharSequence(Integer.toString(24, 36));
                n6cVar.B = bundle.getCharSequence(Integer.toString(27, 36));
                n6cVar.C = bundle.getCharSequence(Integer.toString(28, 36));
                n6cVar.D = bundle.getCharSequence(Integer.toString(30, 36));
                n6cVar.E = bundle.getBundle(Integer.toString(1000, 36));
                if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    n6cVar.h = (wnn) pvdVar.g(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    n6cVar.i = (wnn) pvdVar.g(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    n6cVar.m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    n6cVar.n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    n6cVar.o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    n6cVar.p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    n6cVar.q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    n6cVar.r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    n6cVar.s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    n6cVar.t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    n6cVar.u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    n6cVar.v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    n6cVar.z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    n6cVar.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new p6c(n6cVar);
        }
    }

    public String p(String str, boolean z) {
        switch (this.a) {
            case 16:
                if (!z) {
                    return dkk.a(str);
                }
                if (dkk.a(str) != null) {
                    return str;
                }
                a70.p("Subject cannot be null or empty.");
                return null;
            case 17:
                return dkk.a(str);
            case 18:
                String a = dkk.a(str);
                if (a == null) {
                    if (!z) {
                        return null;
                    }
                    a70.p("Subject cannot be null or empty.");
                    return null;
                }
                if (a.endsWith(".")) {
                    a70.p("Subject cannot end with '.'");
                    return null;
                }
                String[] split = a.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    String str2 = split[i];
                    int length = str2.length();
                    if (length == 0) {
                        if (i == 0) {
                            a70.p("Subject cannot start with '.'");
                            return null;
                        }
                        a70.p("Subject segment cannot be empty");
                        return null;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        char charAt = str2.charAt(i2);
                        if (charAt == ' ' || charAt == '\t' || charAt == '\r' || charAt == '\n') {
                            a70.p("Subject cannot contain space, tab, carriage return or linefeed character");
                            return null;
                        }
                        if (charAt == '*' && length != 1) {
                            a70.p("Subject wildcard improperly placed.");
                            return null;
                        }
                        if (charAt == '>' && (length != 1 || i + 1 != split.length)) {
                            a70.p("Subject wildcard improperly placed.");
                            return null;
                        }
                    }
                }
                return a;
            case 19:
                return dkk.b(str, z);
            default:
                char[] cArr = dkk.a;
                if (str == null || str.length() == 0) {
                    if (!z) {
                        return null;
                    }
                    a70.p("Subject cannot be null or empty.");
                    return null;
                }
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 == ' ' || charAt2 == '\t' || charAt2 == '\r' || charAt2 == '\n') {
                        a70.p("Subject cannot contain space, tab, carriage return or linefeed character");
                        return null;
                    }
                }
                return str;
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
    }
}

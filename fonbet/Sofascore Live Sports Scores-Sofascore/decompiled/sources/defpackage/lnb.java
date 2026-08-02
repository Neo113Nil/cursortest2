package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class lnb {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? "null" : "OUTBOUND" : "INBOUND";
    }

    public static final String a(int i) {
        int C = wt3.C(i);
        if (C == 0) {
            return "integrity_detect";
        }
        if (C == 1) {
            return "app_event_pred";
        }
        zzl.b();
        return null;
    }

    public static final String b(int i) {
        int C = wt3.C(i);
        if (C == 0) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (C == 1) {
            return "MTML_APP_EVENT_PRED";
        }
        zzl.b();
        return null;
    }

    public static int c(float f) {
        return v0.a(c.n().d(), f);
    }

    public static int d(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int e(int i, int i2, q9k q9kVar) {
        return (q9kVar.hashCode() + i) * i2;
    }

    public static int f(int i, ArrayList arrayList, int i2, int i3) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    public static fsf g(Object obj) {
        y6a.M(obj);
        return new fsf();
    }

    public static AlertDialog h(int i, Context context) {
        return new AlertDialog.Builder(context, i).create();
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String j(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String n(String str, int i, char c) {
        return str + i + c;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder s(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void u(int i, String str) {
        if (i != 0) {
            return;
        }
        yhk.s(str);
    }

    public static void v(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }

    public static boolean w(Flags.BooleanFlagField booleanFlagField, int i) {
        Boolean bool = booleanFlagField.get(i);
        bool.getClass();
        return bool.booleanValue();
    }

    public static int x(int i, int i2, int i3, int i4) {
        return i4 - ((i + i2) * i3);
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "MALE";
        }
        if (i == 2) {
            return "FEMALE";
        }
        if (i == 3) {
            return NativeAdContent.ViewTag.OTHER;
        }
        throw null;
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? "null" : "PLAINTEXT" : "TLS";
    }
}

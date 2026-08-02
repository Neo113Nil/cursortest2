package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.C4427z5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t33 {
    public static final bga a = cga.c(ry.I);

    public static final void a(StringBuilder sb, String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder("mraid.dispatch('");
        sb2.append(str);
        sb2.append('\'');
        if (strArr.length == 0) {
            strArr = null;
        }
        String[] strArr2 = strArr;
        sb2.append(strArr2 != null ? ph0.K(strArr2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, 60) : "");
        sb2.append(");");
        sb.append(sb2.toString());
    }

    public static final void b(String str, StringBuilder sb) {
        a(sb, "error", dmi.j('\'', "'", str));
    }

    public static final void c(StringBuilder sb, int i, l2f l2fVar) {
        String valueOf = String.valueOf(i);
        bga bgaVar = a;
        bgaVar.getClass();
        a(sb, "exposureChange", valueOf, bgaVar.c(l2f.Companion.serializer(), l2fVar));
    }

    public static final void d(StringBuilder sb, ljh ljhVar) {
        bga bgaVar = a;
        bgaVar.getClass();
        a(sb, "sizeChange", bgaVar.c(ljh.Companion.serializer(), ljhVar));
    }

    public static final void e(String str, StringBuilder sb) {
        a(sb, "stateChange", dmi.j('\'', "'", str));
    }

    public static final void f(StringBuilder sb, l2f l2fVar, boolean z) {
        l2fVar.getClass();
        bga bgaVar = a;
        bgaVar.getClass();
        String c = bgaVar.c(l2f.Companion.serializer(), l2fVar);
        g(sb, "CurrentPosition", c);
        if (z) {
            g(sb, "DefaultPosition", c);
        }
    }

    public static final void g(StringBuilder sb, String str, String str2) {
        str2.getClass();
        sb.append("mraid.h." + str + C4427z5.U + str2 + ';');
    }

    public static final void h(String str, StringBuilder sb) {
        str.getClass();
        g(sb, "State", "'" + str + '\'');
    }
}

package d9;

import android.os.Bundle;
import eg.c0;
import eg.m0;
import io.sentry.ILogger;
import io.sentry.b5;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import okio.Path;
import p2.h;
import p2.k;
import pc.f;
import pc.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static boolean a(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.h(b5.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static void b(n2.a aVar, s2.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection instanceof v2.a) {
            aVar.q(((v2.a) connection).f24390a);
        }
    }

    public static Object c(u uVar, i iVar) {
        uVar.getClass();
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new f(uVar, false, 0L, null), iVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    public static float d(float f6, float f10, float f11, float f12) {
        return (f11 - (f6 * f10)) / f12;
    }

    public static String e(char c2, String str, String str2) {
        return str + str2 + c2;
    }

    public static String f(int i5, String str, String str2) {
        return str + i5 + str2;
    }

    public static String g(long j, String str) {
        return str + j;
    }

    public static String h(String str, k kVar, String str2, k kVar2) {
        return str + kVar + str2 + kVar2;
    }

    public static String i(StringBuilder sb2, int i5, char c2) {
        sb2.append(i5);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, long j, char c2) {
        sb2.append(j);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, char c2) {
        sb2.append(str);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String o(Path path, String str) {
        return str + path;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap q(Class cls, w8.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static LinkedHashSet r(LinkedHashMap linkedHashMap, String str, h hVar) {
        linkedHashMap.put(str, hVar);
        return new LinkedHashSet();
    }

    public static Map s(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void t(Bundle bundle, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, Integer.valueOf(bundle.getInt(str)));
    }

    public static void u(HashMap hashMap, String str, l1.a aVar, String str2, ILogger iLogger) {
        Object obj = hashMap.get(str);
        aVar.u(str2);
        aVar.H(iLogger, obj);
    }

    public static void v(ConcurrentHashMap concurrentHashMap, String str, l1.a aVar, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        aVar.u(str2);
        aVar.H(iLogger, obj);
    }

    public static float w(float f6, float f10, float f11, float f12) {
        return ((f6 - f10) * f11) + f12;
    }
}

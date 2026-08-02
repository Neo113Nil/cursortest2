package com.vk.metrics.performance.appstart.content_provider;

import android.os.Trace;
import com.vk.core.apps.BuildInfo;
import com.vk.metrics.performance.appstart.content_provider.Method;
import io.jsonwebtoken.JwtParser;
import java.util.LinkedHashMap;
import xsna.drm0;
import xsna.kq01;
import xsna.ndp0;
import xsna.qkj;
import xsna.v1v;

/* compiled from: ContentProviderMeasure.kt */
/* loaded from: classes.dex */
public final class a {
    public static final LinkedHashMap a = new LinkedHashMap();
    public static final boolean b = BuildInfo.p();

    public static final void a(String str) {
        String m0 = drm0.m0('(', str, str);
        String i0 = drm0.i0(JwtParser.SEPARATOR_CHAR, m0, m0);
        Method.Companion.getClass();
        Method a2 = Method.a.a(i0);
        long nanoTime = System.nanoTime();
        String str2 = kq01.c(str) + '_' + a2.i() + '}';
        if (b) {
            Trace.endSection();
        }
        LinkedHashMap linkedHashMap = a;
        qkj qkjVar = (qkj) linkedHashMap.get(str2);
        if (qkjVar == null) {
            a2.toString();
            return;
        }
        long c = nanoTime - qkjVar.c();
        if (c < 0) {
            c = 0;
        }
        linkedHashMap.put(str2, qkj.a(qkjVar, c));
    }

    public static final void b(String str) {
        String m0 = drm0.m0('(', str, str);
        String i0 = drm0.i0(JwtParser.SEPARATOR_CHAR, m0, m0);
        Method.Companion.getClass();
        Method a2 = Method.a.a(i0);
        long nanoTime = System.nanoTime();
        String c = kq01.c(str);
        StringBuilder b2 = v1v.b(c, '_');
        b2.append(a2.i());
        b2.append('}');
        String sb = b2.toString();
        if (b) {
            ndp0.b(sb);
        }
        a.put(sb, new qkj(c, a2, nanoTime));
    }
}

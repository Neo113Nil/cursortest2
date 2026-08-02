package com.vk.metrics.performance.appstart.content_provider;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentProviderMeasure.kt */
/* loaded from: classes3.dex */
public final class Method {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Method[] $VALUES;
    public static final Method ATTACH_INFO;
    public static final Method CLINIT;
    public static final a Companion;
    public static final Method INIT;
    public static final Method ONCREATE;
    public static final Method QUERY;
    public static final Method UNKNOWN;
    private final String value;

    /* compiled from: ContentProviderMeasure.kt */
    public static final class a {
        public static Method a(String str) {
            Object obj;
            Iterator<E> it = Method.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((Method) obj).i(), str)) {
                    break;
                }
            }
            Method method = (Method) obj;
            return method == null ? Method.UNKNOWN : method;
        }
    }

    static {
        Method method = new Method("CLINIT", 0, "<clinit>");
        CLINIT = method;
        Method method2 = new Method("INIT", 1, "<init>");
        INIT = method2;
        Method method3 = new Method("ATTACH_INFO", 2, "attachInfo");
        ATTACH_INFO = method3;
        Method method4 = new Method("ONCREATE", 3, "onCreate");
        ONCREATE = method4;
        Method method5 = new Method("QUERY", 4, "query");
        QUERY = method5;
        Method method6 = new Method(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        UNKNOWN = method6;
        Method[] methodArr = {method, method2, method3, method4, method5, method6};
        $VALUES = methodArr;
        $ENTRIES = new asp(methodArr);
        Companion = new a();
    }

    public Method(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<Method> h() {
        return $ENTRIES;
    }

    public static Method valueOf(String str) {
        return (Method) Enum.valueOf(Method.class, str);
    }

    public static Method[] values() {
        return (Method[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}

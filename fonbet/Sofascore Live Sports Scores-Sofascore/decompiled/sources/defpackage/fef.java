package defpackage;

import java.security.AccessController;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class fef {
    public static final ThreadLocal a = new ThreadLocal();

    public static String a(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new wv2(str, 1));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new wv2(str, 2)) : str2;
    }
}

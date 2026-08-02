package defpackage;

import android.content.SharedPreferences;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class dlg implements ss3 {
    public static final dlg d = new dlg();
    public CookieManager a = null;
    public SharedPreferences b = null;
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // defpackage.ss3
    public final void a(jl9 jl9Var, List list) {
        SharedPreferences sharedPreferences;
        String str = jl9Var.d;
        if (this.a == null) {
            try {
                this.a = CookieManager.getInstance();
            } catch (Throwable unused) {
            }
        }
        CookieManager cookieManager = this.a;
        if (cookieManager != null) {
            Set set = this.c;
            if (set.add(str) && (sharedPreferences = this.b) != null) {
                sharedPreferences.edit().putStringSet("equativ_sdk_cookie_hosts", new HashSet(set)).apply();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cookieManager.setCookie(str, ((rs3) it.next()).toString());
            }
        }
    }

    @Override // defpackage.ss3
    public final List j(jl9 jl9Var) {
        String str = jl9Var.d;
        if (this.a == null) {
            try {
                this.a = CookieManager.getInstance();
            } catch (Throwable unused) {
            }
        }
        CookieManager cookieManager = this.a;
        String cookie = cookieManager != null ? cookieManager.getCookie(str) : null;
        if (cookie == null || cookie.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] split = cookie.split(";");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            Pattern pattern = rs3.k;
            rs3 g0 = ml4.g0(jl9Var, str2);
            if (g0 != null) {
                arrayList.add(g0);
            }
        }
        return arrayList;
    }
}

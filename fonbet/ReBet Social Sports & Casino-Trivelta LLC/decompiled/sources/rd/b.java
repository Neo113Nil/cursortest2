package rd;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.zoho.livechat.android.utils.B;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import pd.k;
import pd.n;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static Uf.a f64088b;

    /* renamed from: c, reason: collision with root package name */
    public static k f64089c;

    /* renamed from: d, reason: collision with root package name */
    public static n f64090d;

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f64087a = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static B f64091e = new B();

    /* renamed from: f, reason: collision with root package name */
    public static androidx.lifecycle.B f64092f = new androidx.lifecycle.B(Boolean.FALSE);

    public static void a(Activity activity, ViewGroup viewGroup) {
        if (activity != null) {
            f64087a.put(Integer.valueOf(activity.hashCode()), viewGroup);
        }
    }

    public static void b() {
        try {
            if (LiveChatUtil.isSupportedVersion() && LiveChatUtil.isEmbedAllowed() && LiveChatUtil.isAppEnabled()) {
                if (f64091e.isAlive()) {
                    f64091e.c();
                } else {
                    f64091e.start();
                }
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }

    public static k c() {
        return f64089c;
    }

    public static Uf.a d() {
        return f64088b;
    }

    public static B e() {
        return f64091e;
    }

    public static long f() {
        return System.currentTimeMillis() - Long.valueOf(g()).longValue();
    }

    public static String g() {
        return C6218a.M().getString("stime", String.valueOf(0));
    }

    public static ViewGroup h(Activity activity) {
        if (activity == null) {
            return null;
        }
        return (ViewGroup) f64087a.get(Integer.valueOf(activity.hashCode()));
    }

    public static LiveData i() {
        return f64092f;
    }

    public static void j(int i10) {
        f64087a.remove(Integer.valueOf(i10));
    }

    public static void k(Activity activity) {
        if (activity != null) {
            f64087a.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    public static void l(k kVar) {
        f64089c = kVar;
    }

    public static void m(n nVar) {
        f64090d = nVar;
    }

    public static void n(Function1 function1) {
        f64091e.q(function1);
    }

    public static void o(Uf.a aVar) {
        f64088b = aVar;
    }

    public static void p(boolean z10) {
        if (!LiveChatUtil.isEmbedAllowed()) {
            z10 = false;
        }
        f64092f.postValue(Boolean.valueOf(z10));
    }
}
